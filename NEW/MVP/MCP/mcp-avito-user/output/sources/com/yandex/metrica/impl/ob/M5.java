package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public class M5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f378880a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Q5 f378881b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private N5 f378882c;

    public M5(@j.N Context context, @j.N I3 i32, int i12) {
        this(new Q5(context, i32), i12);
    }

    private void b() {
        this.f378881b.a(this.f378882c);
    }

    @j.N
    public D0 a(@j.N String str) {
        if (this.f378882c == null) {
            N5 n5A = this.f378881b.a();
            this.f378882c = n5A;
            int iD2 = n5A.d();
            int i12 = this.f378880a;
            if (iD2 != i12) {
                this.f378882c.b(i12);
                b();
            }
        }
        int iHashCode = str.hashCode();
        if (this.f378882c.b().contains(Integer.valueOf(iHashCode))) {
            return D0.NON_FIRST_OCCURENCE;
        }
        D0 d02 = this.f378882c.e() ? D0.FIRST_OCCURRENCE : D0.UNKNOWN;
        if (this.f378882c.c() < 1000) {
            this.f378882c.a(iHashCode);
        } else {
            this.f378882c.a(false);
        }
        b();
        return d02;
    }

    @j.k0
    public M5(@j.N Q5 q52, int i12) {
        this.f378880a = i12;
        this.f378881b = q52;
    }

    public void a() {
        if (this.f378882c == null) {
            N5 n5A = this.f378881b.a();
            this.f378882c = n5A;
            int iD2 = n5A.d();
            int i12 = this.f378880a;
            if (iD2 != i12) {
                this.f378882c.b(i12);
                b();
            }
        }
        this.f378882c.a();
        this.f378882c.a(true);
        b();
    }
}
