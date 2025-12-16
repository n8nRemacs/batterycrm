package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.h8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38848h8 implements InterfaceC38823g8 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f380683a;

    /* renamed from: b, reason: collision with root package name */
    private final String f380684b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final X7 f380685c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39156tm f380686d;

    /* renamed from: e, reason: collision with root package name */
    private O7 f380687e;

    @j.k0
    public C38848h8(@j.N Context context, @j.N String str, @j.N C39156tm c39156tm, @j.N X7 x72) {
        this.f380683a = context;
        this.f380684b = str;
        this.f380686d = c39156tm;
        this.f380685c = x72;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38823g8
    @j.P
    @j.l0
    public synchronized SQLiteDatabase a() {
        O7 o72;
        try {
            this.f380686d.a();
            o72 = new O7(this.f380683a, this.f380684b, this.f380685c);
            this.f380687e = o72;
        } catch (Throwable unused) {
            return null;
        }
        return o72.getWritableDatabase();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38823g8
    @j.l0
    public synchronized void a(@j.P SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        A2.a((Closeable) this.f380687e);
        this.f380686d.b();
        this.f380687e = null;
    }
}
