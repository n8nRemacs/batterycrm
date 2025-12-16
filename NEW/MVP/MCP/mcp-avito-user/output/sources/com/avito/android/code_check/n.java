package com.avito.android.code_check;

import androidx.view.P0;
import androidx.view.T0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeCheckModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f118844a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T0> f118845b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f118846c;

    public n(l lVar, Provider provider, dagger.internal.u uVar) {
        this.f118844a = lVar;
        this.f118845b = provider;
        this.f118846c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = this.f118845b.get();
        P0.c cVar = (P0.c) this.f118846c.get();
        this.f118844a.getClass();
        return (d) new P0(t02, cVar).a(g.class);
    }
}
