package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes7.dex */
public class J8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN custom_type INTEGER DEFAULT 0");
    }
}
