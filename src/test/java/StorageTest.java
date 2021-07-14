import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.tajo.conf.TajoConf;
import org.apache.tajo.util.CommonTestingUtil;
// import org.apache.tajo.storage;

public class StorageTest {
  private TajoConf conf;
  private static String TEST_PATH = "target/test-data/TestStorageUtil";
  private Path testDir;
  private FileSystem fs;

  @Before
  public void setUp() throws Exception {
    conf = new TajoConf();
    testDir = CommonTestingUtil.getTestDir(TEST_PATH);
    fs = testDir.getFileSystem(conf);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public final void testGetMaxFileSequence() throws IOException {
    for (int i = 0; i < 7; i++) {
      fs.create(new Path(testDir, "part-00-00000-00"+i), false);
    }

    // assertEquals(6, StorageUtil.getMaxFileSequence(fs, testDir, true));
  }
    
}
