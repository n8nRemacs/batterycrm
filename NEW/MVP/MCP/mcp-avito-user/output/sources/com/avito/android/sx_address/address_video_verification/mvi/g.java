package com.avito.android.sx_address.address_video_verification.mvi;

import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f292708a;

    /* renamed from: b, reason: collision with root package name */
    public final u f292709b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50429b> f292710c;

    public g(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f292708a = lVar;
        this.f292709b = uVar;
        this.f292710c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((SxAddressVideoVerificationParams) this.f292708a.f393949a, (com.avito.android.sx_address.address_video_verification.domain.d) this.f292709b.get(), this.f292710c.get());
    }
}
