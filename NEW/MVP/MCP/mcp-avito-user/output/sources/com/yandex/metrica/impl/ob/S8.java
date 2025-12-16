package com.yandex.metrica.impl.ob;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.impl.ob.E;
import java.util.Locale;

/* loaded from: classes7.dex */
public class S8 extends AbstractC38922k8 {
    @Override // com.yandex.metrica.impl.ob.AbstractC38922k8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Locale locale = Locale.US;
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN battery_charge_type INTEGER DEFAULT " + E.b.a.UNKNOWN.a());
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN collection_mode TEXT");
        sQLiteDatabase.execSQL(String.format(locale, "UPDATE %s SET %s = \"\" WHERE %s == %d AND %2$s != \"\" AND %2$s IS NOT NULL", "reports", "value", "type", Integer.valueOf(EnumC38666a1.EVENT_TYPE_START.b())));
    }
}
