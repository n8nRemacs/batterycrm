package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes7.dex */
public class F8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb2 = new StringBuilder("ALTER TABLE reports ADD COLUMN session_type INTEGER DEFAULT ");
        EnumC38796f6 enumC38796f6 = EnumC38796f6.FOREGROUND;
        sb2.append(enumC38796f6.a());
        sQLiteDatabase.execSQL(sb2.toString());
        StringBuilder sb3 = new StringBuilder("UPDATE reports SET session_type = ");
        EnumC38796f6 enumC38796f62 = EnumC38796f6.BACKGROUND;
        sb3.append(enumC38796f62.a());
        sb3.append(" WHERE session_id = -2");
        sQLiteDatabase.execSQL(sb3.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN type INTEGER DEFAULT " + enumC38796f6.a());
        sQLiteDatabase.execSQL("UPDATE sessions SET type = " + enumC38796f62.a() + " WHERE id = -2");
    }
}
