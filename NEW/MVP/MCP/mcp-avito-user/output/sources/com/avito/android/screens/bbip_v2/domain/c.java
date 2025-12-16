package com.avito.android.screens.bbip_v2.domain;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import ih.InterfaceC41399a;
import javax.inject.Provider;
import up0.C49093e;
import up0.InterfaceC49091c;

/* compiled from: BbipV2InteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f261495a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC41399a> f261496b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f261497c;

    /* renamed from: d, reason: collision with root package name */
    public final C49093e f261498d;

    public c(l lVar, Provider provider, Provider provider2, C49093e c49093e) {
        this.f261495a = lVar;
        this.f261496b = provider;
        this.f261497c = provider2;
        this.f261498d = c49093e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((String) this.f261495a.f393949a, this.f261496b.get(), this.f261497c.get(), (InterfaceC49091c) this.f261498d.get());
    }
}
