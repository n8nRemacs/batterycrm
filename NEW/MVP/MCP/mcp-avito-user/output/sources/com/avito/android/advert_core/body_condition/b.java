package com.avito.android.advert_core.body_condition;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsCarBodyConditionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f83036a;

    public b(Provider<f> provider) {
        this.f83036a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f83036a.get());
    }
}
