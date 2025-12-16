package com.avito.android.profile.pro.impl.screen.item.geo_banner;

import com.avito.android.profile.pro.impl.screen.item.geo_banner.g;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProGeoBannerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f223273a;

    /* renamed from: b, reason: collision with root package name */
    public final l f223274b;

    public b(l lVar, Provider provider) {
        this.f223273a = provider;
        this.f223274b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f223273a.get(), (g.a) this.f223274b.f393949a);
    }
}
