package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes7.dex */
public class O8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN wifi_network_info TEXT DEFAULT ''");
    }
}
