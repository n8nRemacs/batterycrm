package com.avito.android.sx_address.address_video_verification.mvi;

import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f292689a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC50429b> f292690b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f292691c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f292692d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.address_video_verification.view.d> f292693e;

    public e(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f292689a = uVar;
        this.f292690b = provider;
        this.f292691c = lVar;
        this.f292692d = provider2;
        this.f292693e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.sx_address.address_video_verification.domain.d) this.f292689a.get(), this.f292690b.get(), (SxAddressVideoVerificationParams) this.f292691c.f393949a, this.f292692d.get(), this.f292693e.get());
    }
}
