package com.avito.android.blueprints.job_multigeo_address;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobMultiGeoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f106020a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106021b;

    /* renamed from: c, reason: collision with root package name */
    public final u f106022c;

    public l(u uVar, u uVar2, Provider provider) {
        this.f106020a = provider;
        this.f106021b = uVar;
        this.f106022c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f106020a.get(), (Q1) this.f106021b.get(), (q) this.f106022c.get());
    }
}
