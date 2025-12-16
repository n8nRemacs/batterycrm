package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class gx implements zq0 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private WeakReference<pl> f385849a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private jc1 f385850b;

    public final void a(@j.P pl plVar) {
        this.f385849a = new WeakReference<>(plVar);
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void c() {
        WeakReference<pl> weakReference = this.f385849a;
        pl plVar = weakReference != null ? weakReference.get() : null;
        if (plVar != null) {
            plVar.e();
        }
    }

    public final void a(@j.N jc1 jc1Var) {
        this.f385850b = jc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.zq0
    public final void a(boolean z12) {
        jc1 jc1Var = this.f385850b;
        if (jc1Var != null) {
            jc1Var.a(z12);
        }
    }
}
