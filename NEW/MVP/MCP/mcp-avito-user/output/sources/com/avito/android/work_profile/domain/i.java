package com.avito.android.work_profile.domain;

import com.avito.android.util.R0;
import com.avito.android.work_profile.WorkProfileOpenParams;
import com.avito.android.work_profile.profile.work_profile_host.mvi.k;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WorkProfileInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ZP0.a> f330653a;

    /* renamed from: b, reason: collision with root package name */
    public final l f330654b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.work_profile.profile.work_profile_host.mvi.l f330655c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f330656d;

    public i(Provider provider, l lVar, com.avito.android.work_profile.profile.work_profile_host.mvi.l lVar2, Provider provider2) {
        this.f330653a = provider;
        this.f330654b = lVar;
        this.f330655c = lVar2;
        this.f330656d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ZP0.a aVar = this.f330653a.get();
        WorkProfileOpenParams workProfileOpenParams = (WorkProfileOpenParams) this.f330654b.f393949a;
        this.f330655c.getClass();
        return new h(aVar, workProfileOpenParams, new k(), this.f330656d.get());
    }
}
