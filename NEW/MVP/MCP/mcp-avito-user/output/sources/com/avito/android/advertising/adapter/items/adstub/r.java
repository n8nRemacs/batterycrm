package com.avito.android.advertising.adapter.items.adstub;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotLoadAdStubListNewBlueprint_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<s> f86988a;

    public r(Provider<s> provider) {
        this.f86988a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f86988a.get());
    }
}
