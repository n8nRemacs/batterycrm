package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Map;

/* compiled from: StatefulProducerRunnable.java */
@Nullsafe
/* loaded from: classes15.dex */
public abstract class u0<T> extends com.facebook.common.executors.h<T> {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36410l<T> f340739c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f340740d;

    /* renamed from: e, reason: collision with root package name */
    public final String f340741e;

    /* renamed from: f, reason: collision with root package name */
    public final k0 f340742f;

    public u0(InterfaceC36410l<T> interfaceC36410l, m0 m0Var, k0 k0Var, String str) {
        this.f340739c = interfaceC36410l;
        this.f340740d = m0Var;
        this.f340741e = str;
        this.f340742f = k0Var;
        m0Var.c(k0Var, str);
    }

    @Override // com.facebook.common.executors.h
    public void d() {
        m0 m0Var = this.f340740d;
        k0 k0Var = this.f340742f;
        String str = this.f340741e;
        m0Var.d(k0Var, str);
        m0Var.f(k0Var, str);
        this.f340739c.b();
    }

    @Override // com.facebook.common.executors.h
    public void e(Exception exc) {
        m0 m0Var = this.f340740d;
        k0 k0Var = this.f340742f;
        String str = this.f340741e;
        m0Var.d(k0Var, str);
        m0Var.h(k0Var, str, exc, null);
        this.f340739c.a(exc);
    }

    @Override // com.facebook.common.executors.h
    public void f(@I41.h T t12) {
        m0 m0Var = this.f340740d;
        k0 k0Var = this.f340742f;
        String str = this.f340741e;
        m0Var.j(k0Var, str, m0Var.d(k0Var, str) ? g(t12) : null);
        this.f340739c.c(1, t12);
    }

    @I41.h
    public Map<String, String> g(@I41.h T t12) {
        return null;
    }
}
