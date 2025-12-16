package com.avito.android.advert.item.contactbar;

import com.avito.android.C29640d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsContactBarBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f74878a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C29640d> f74879b;

    public b(u uVar, Provider provider) {
        this.f74878a = uVar;
        this.f74879b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f74878a.get(), this.f74879b.get());
    }
}
