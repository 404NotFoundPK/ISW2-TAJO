create index l_orderkey_partkey_idx on lineitem (l_orderkey asc, l_partkey desc nulls last);