package com.avito.android.advert.item.job_cv_info;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertCvInfoBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77207a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f77208b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f77209c;

    public b(u uVar, Provider provider, Provider provider2) {
        this.f77207a = uVar;
        this.f77208b = provider;
        this.f77209c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f77207a.get(), this.f77208b.get(), this.f77209c.get());
    }
}
