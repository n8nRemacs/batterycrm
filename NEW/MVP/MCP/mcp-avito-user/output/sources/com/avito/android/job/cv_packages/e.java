package com.avito.android.job.cv_packages;

import Ae.InterfaceC13022a;
import com.avito.android.job.cv_packages.mvi.u;
import com.avito.android.job.cv_packages.mvi.v;
import com.avito.android.job.cv_packages.mvi.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvPackagesInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZP.a> f174385a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13022a> f174386b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.job.cv_packages.mvi.x f174387c;

    /* renamed from: d, reason: collision with root package name */
    public final v f174388d;

    public e(Provider provider, Provider provider2, com.avito.android.job.cv_packages.mvi.x xVar, v vVar) {
        this.f174385a = provider;
        this.f174386b = provider2;
        this.f174387c = xVar;
        this.f174388d = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ZP.a aVar = this.f174385a.get();
        InterfaceC13022a interfaceC13022a = this.f174386b.get();
        this.f174387c.getClass();
        w wVar = new w();
        this.f174388d.getClass();
        return new c(aVar, interfaceC13022a, wVar, new u());
    }
}
