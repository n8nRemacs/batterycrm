package com.avito.android.user_advert.advert.items.stats;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MyAdvertStatsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f310291a;

    public c(Provider<f> provider) {
        this.f310291a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f310291a.get());
    }
}
