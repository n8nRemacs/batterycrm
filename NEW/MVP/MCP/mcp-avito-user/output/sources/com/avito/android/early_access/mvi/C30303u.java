package com.avito.android.early_access.mvi;

import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.util.R0;
import gk0.InterfaceC40698a;
import javax.inject.Provider;

/* compiled from: EarlyAccessInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.early_access.mvi.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30303u implements dagger.internal.h<C30302t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40698a> f145559a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f145560b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f145561c;

    public C30303u(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f145559a = provider;
        this.f145560b = provider2;
        this.f145561c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C30302t(dagger.internal.g.a(dagger.internal.w.a(this.f145559a)), this.f145560b.get(), (ReEarlyAccessData) this.f145561c.f393949a);
    }
}
