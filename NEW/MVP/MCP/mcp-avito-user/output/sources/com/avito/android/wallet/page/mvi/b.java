package com.avito.android.wallet.page.mvi;

import aP0.InterfaceC19802a;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPageInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19802a> f328089a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<NO0.a> f328090b;

    /* renamed from: c, reason: collision with root package name */
    public final l f328091c;

    /* renamed from: d, reason: collision with root package name */
    public final l f328092d;

    public b(l lVar, l lVar2, Provider provider, Provider provider2) {
        this.f328089a = provider;
        this.f328090b = provider2;
        this.f328091c = lVar;
        this.f328092d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.a(w.a(this.f328089a)), dagger.internal.g.a(w.a(this.f328090b)), (String) this.f328091c.f393949a, ((Boolean) this.f328092d.f393949a).booleanValue());
    }
}
