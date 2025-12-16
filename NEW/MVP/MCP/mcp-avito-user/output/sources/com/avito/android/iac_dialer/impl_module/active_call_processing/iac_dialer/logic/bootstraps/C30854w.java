package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AvCallsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30854w implements dagger.internal.h<AvCallsBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<HJ.a> f165406a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f165407b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165408c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f165409d;

    public C30854w(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f165406a = provider;
        this.f165407b = uVar;
        this.f165408c = provider2;
        this.f165409d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AvCallsBootstrap(this.f165406a.get(), (MJ.b) this.f165407b.get(), this.f165408c.get(), (com.avito.android.deep_linking.x) this.f165409d.get());
    }
}
