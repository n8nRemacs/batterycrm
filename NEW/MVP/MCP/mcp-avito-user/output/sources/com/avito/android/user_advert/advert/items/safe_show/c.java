package com.avito.android.user_advert.advert.items.safe_show;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SafeShowItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f310085a;

    public c(Provider<d> provider) {
        this.f310085a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f310085a.get());
    }
}
