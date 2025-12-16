package com.avito.android.screens.bbip_private.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;

/* compiled from: BbipPrivateInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f260554a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f260555b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f260556c;

    /* renamed from: d, reason: collision with root package name */
    public final qp0.e f260557d;

    public c(l lVar, Provider provider, Provider provider2, qp0.e eVar) {
        this.f260554a = lVar;
        this.f260555b = provider;
        this.f260556c = provider2;
        this.f260557d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f260554a.f393949a, this.f260555b.get(), this.f260556c.get(), (qp0.c) this.f260557d.get());
    }
}
