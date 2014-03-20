package com.yahoo.ycsb.workloads.runners;

import java.util.HashMap;

import com.yahoo.ycsb.ByteIterator;
import com.yahoo.ycsb.DB;
import com.yahoo.ycsb.workloads.ConsistencyTestWorkload;

public class UpdateRunner extends WriterRunner{

	public UpdateRunner(DB db, String dbKey, HashMap<String, ByteIterator> values, ConsistencyTestWorkload workload) {
		super(db, dbKey, values, workload);
	}

	@Override
	public void doRun() {
		String tableName = this.workload.getTableName();
		this.db.update(tableName, this.dbKey, this.values);
	}

}
