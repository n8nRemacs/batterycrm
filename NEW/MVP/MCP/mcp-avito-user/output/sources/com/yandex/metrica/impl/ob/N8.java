package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* loaded from: classes7.dex */
public class N8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(@j.N SQLiteDatabase sQLiteDatabase) throws SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN first_occurrence_status INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
