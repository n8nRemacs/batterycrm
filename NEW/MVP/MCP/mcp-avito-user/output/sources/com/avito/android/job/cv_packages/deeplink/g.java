package com.avito.android.job.cv_packages.deeplink;

import bQ.InterfaceC25544a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvPackagesLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f174353a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f174354b;

    /* renamed from: c, reason: collision with root package name */
    public final bQ.d f174355c;

    public g(dv.b bVar, dv.b bVar2, bQ.d dVar) {
        this.f174353a = bVar;
        this.f174354b = bVar2;
        this.f174355c = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.b) this.f174353a.get(), (a.InterfaceC4053a) this.f174354b.get(), (InterfaceC25544a) this.f174355c.get());
    }
}
