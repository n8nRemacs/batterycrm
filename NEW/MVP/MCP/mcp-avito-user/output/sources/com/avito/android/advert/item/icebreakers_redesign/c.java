package com.avito.android.advert.item.icebreakers_redesign;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IcebreakersRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f76525a;

    public c(Provider<d> provider) {
        this.f76525a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f76525a.get());
    }
}
