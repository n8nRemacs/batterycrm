package com.avito.android.sx_address.address_video_verification.domain;

import android.content.ContentResolver;
import com.avito.android.J0;
import com.avito.android.sx_address.SxAddressVideoVerificationParams;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressVideoVerificationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<EA0.a> f292660a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f292661b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC50429b> f292662c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f292663d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f292664e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.sx_address.features.a> f292665f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f292666g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<J0> f292667h;

    /* renamed from: i, reason: collision with root package name */
    public final u f292668i;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f292660a = provider;
        this.f292661b = provider2;
        this.f292662c = provider3;
        this.f292663d = lVar;
        this.f292664e = provider4;
        this.f292665f = provider5;
        this.f292666g = lVar2;
        this.f292667h = provider6;
        this.f292668i = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f292660a.get(), this.f292661b.get(), this.f292662c.get(), (SxAddressVideoVerificationParams) this.f292663d.f393949a, this.f292664e.get(), this.f292665f.get(), (ContentResolver) this.f292666g.f393949a, this.f292667h.get(), (com.avito.android.sx_address.address_video_verification.view.d) this.f292668i.get());
    }
}
