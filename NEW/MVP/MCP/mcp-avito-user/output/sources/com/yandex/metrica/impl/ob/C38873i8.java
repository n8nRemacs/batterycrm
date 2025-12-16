package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.yandex.metrica.impl.ob.i8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38873i8 implements InterfaceC38823g8 {

    /* renamed from: a, reason: collision with root package name */
    private final O7 f380772a;

    public C38873i8(O7 o72) {
        this.f380772a = o72;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38823g8
    public void a(@j.P SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38823g8
    @j.P
    public SQLiteDatabase a() {
        try {
            return this.f380772a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
