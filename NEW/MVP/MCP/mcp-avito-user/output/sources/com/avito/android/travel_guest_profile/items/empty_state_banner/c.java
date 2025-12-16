package com.avito.android.travel_guest_profile.items.empty_state_banner;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EmptyStateBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f302047a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f302048b;

    public c(g gVar, Provider provider) {
        this.f302047a = gVar;
        this.f302048b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f302047a.get(), this.f302048b.get());
    }
}
