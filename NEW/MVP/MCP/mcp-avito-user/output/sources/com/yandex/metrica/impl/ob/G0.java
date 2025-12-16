package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.H0;

/* loaded from: classes7.dex */
public abstract class G0<T> implements H0.d {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final G<T> f378159a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private H0 f378160b;

    public G0(long j12, long j13) {
        this.f378159a = new G<>(j12, j13);
    }

    public abstract long a(@j.N Ph ph2);

    @j.P
    public T a() {
        H0 h02;
        if (b() && (h02 = this.f378160b) != null) {
            h02.b();
        }
        if (this.f378159a.c()) {
            this.f378159a.a(null);
        }
        return this.f378159a.a();
    }

    public abstract boolean a(@j.N T t12);

    public abstract long b(@j.N Ph ph2);

    public void b(@j.N T t12) {
        if (a((G0<T>) t12)) {
            this.f378159a.a(t12);
            H0 h02 = this.f378160b;
            if (h02 != null) {
                h02.a();
            }
        }
    }

    public abstract boolean b();

    public void c(@j.N Ph ph2) {
        this.f378159a.a(b(ph2), a(ph2));
    }

    public void a(@j.N H0 h02) {
        this.f378160b = h02;
    }
}
