create index l_orderkey_100_l_linenumber_10_lt10_idx on lineitem (l_orderkey*100-l_linenumber*10 asc nulls first) where l_orderkey*100 > 10;