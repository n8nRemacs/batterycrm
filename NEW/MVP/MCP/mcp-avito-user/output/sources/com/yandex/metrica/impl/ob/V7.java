package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes7.dex */
public class V7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38823g8 f379777a;

    public V7(O7 o72, @j.N String str) {
        this(new C38873i8(o72), str);
    }

    public void a() {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f379777a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f379777a.a(sQLiteDatabaseA);
    }

    @j.P
    public List<Bd> b() {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorQuery;
        try {
            sQLiteDatabaseA = this.f379777a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    cursorQuery = sQLiteDatabaseA.query("permissions", null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new Bd(cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getLong(cursorQuery.getColumnIndex("granted")) == 1));
                                } while (cursorQuery.moveToNext());
                                this.f379777a.a(sQLiteDatabaseA);
                                A2.a(cursorQuery);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
            cursorQuery = null;
        }
        this.f379777a.a(sQLiteDatabaseA);
        A2.a(cursorQuery);
        return null;
    }

    @j.k0
    public V7(@j.N InterfaceC38823g8 interfaceC38823g8, @j.N String str) {
        this.f379777a = interfaceC38823g8;
    }
}
