package com.avito.android.job.cv_packages.mvi;

import com.avito.android.util.R0;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvPackageActor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f174478a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.job.cv_packages.e f174479b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f174480c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f174481d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f174482e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f174483f;

    public k(j jVar, com.avito.android.job.cv_packages.e eVar, Provider provider, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f174478a = jVar;
        this.f174479b = eVar;
        this.f174480c = provider;
        this.f174481d = provider2;
        this.f174482e = lVar;
        this.f174483f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((h) this.f174478a.get(), (com.avito.android.job.cv_packages.b) this.f174479b.get(), this.f174480c.get(), this.f174481d.get(), (String) this.f174482e.f393949a, (String) this.f174483f.f393949a);
    }
}
