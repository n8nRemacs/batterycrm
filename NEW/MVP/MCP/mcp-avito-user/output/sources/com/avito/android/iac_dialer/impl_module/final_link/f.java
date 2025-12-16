package com.avito.android.iac_dialer.impl_module.final_link;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinalLinkInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f166035a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<IacMetaInfoStorage> f166036b;

    /* renamed from: c, reason: collision with root package name */
    public final nt.i f166037c;

    /* renamed from: d, reason: collision with root package name */
    public final u f166038d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f166039e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<HK.a> f166040f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f166041g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.app_foreground_provider.util_module.a> f166042h;

    public f(C30102l3 c30102l3, Provider provider, nt.i iVar, u uVar, com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, Provider provider2, Provider provider3, Provider provider4) {
        this.f166035a = c30102l3;
        this.f166036b = provider;
        this.f166037c = iVar;
        this.f166038d = uVar;
        this.f166039e = cVar;
        this.f166040f = provider2;
        this.f166041g = provider3;
        this.f166042h = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f166035a.get(), this.f166036b.get(), (nt.f) this.f166037c.get(), (com.avito.android.iac_dialer.impl_module.api.a) this.f166038d.get(), (com.avito.android.iac_dialer.impl_module.splitter.features.a) this.f166039e.get(), this.f166040f.get(), this.f166041g.get(), this.f166042h.get());
    }
}
