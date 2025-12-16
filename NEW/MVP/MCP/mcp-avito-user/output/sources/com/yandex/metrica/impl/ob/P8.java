package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes7.dex */
public class P8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(@j.N SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("reports", "session_id = ?", new String[]{String.valueOf(-2L)});
        sQLiteDatabase.delete("sessions", "id = ?", new String[]{String.valueOf(-2L)});
    }
}
