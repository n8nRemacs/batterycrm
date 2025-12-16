package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* loaded from: classes7.dex */
public class M8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN encrypting_mode INTEGER DEFAULT " + Em.NONE.a());
        sQLiteDatabase.execSQL("UPDATE reports SET encrypting_mode = " + Em.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER.a() + " where type=" + EnumC38666a1.EVENT_TYPE_IDENTITY.b());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN profile_id TEXT ");
    }
}
