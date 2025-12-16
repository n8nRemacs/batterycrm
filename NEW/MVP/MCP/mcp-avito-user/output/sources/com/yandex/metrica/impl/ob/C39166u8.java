package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.C38897j8;

/* renamed from: com.yandex.metrica.impl.ob.u8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39166u8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(C38897j8.a.b.f380855b);
        sQLiteDatabase.execSQL(C38897j8.a.InterfaceC10959a.f380853b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}
