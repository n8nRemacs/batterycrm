package com.avito.security;

import java.io.Serializable;

/* loaded from: classes5.dex */
final class r2<T> implements d1<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private q0<? extends T> f338618a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f338619b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f338620c;

    public r2(q0<? extends T> q0Var, Object obj) {
        y0.b(q0Var, "initializer");
        this.f338618a = q0Var;
        this.f338619b = w2.f338633a;
        this.f338620c = obj == null ? this : obj;
    }

    @Override // com.avito.security.d1
    public T a() {
        T tA2;
        T t12 = (T) this.f338619b;
        w2 w2Var = w2.f338633a;
        if (t12 != w2Var) {
            return t12;
        }
        synchronized (this.f338620c) {
            tA2 = (T) this.f338619b;
            if (tA2 == w2Var) {
                q0<? extends T> q0Var = this.f338618a;
                y0.a(q0Var);
                tA2 = q0Var.a();
                this.f338619b = tA2;
                this.f338618a = null;
            }
        }
        return tA2;
    }

    public boolean b() {
        return this.f338619b != w2.f338633a;
    }

    public String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ r2(q0 q0Var, Object obj, int i12, d0 d0Var) {
        this(q0Var, (i12 & 2) != 0 ? null : obj);
    }
}
