package com.avito.android.advert.item.icebreakers;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IceBreakersBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f76457a;

    public c(Provider<d> provider) {
        this.f76457a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f76457a.get());
    }
}
