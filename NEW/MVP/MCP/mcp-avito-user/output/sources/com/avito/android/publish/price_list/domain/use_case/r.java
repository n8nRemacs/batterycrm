package com.avito.android.publish.price_list.domain.use_case;

import com.avito.android.publish.objects.P0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SplUpdateObjectsParamUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.price_list.domain.c> f238615a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f238616b;

    public r(Provider<com.avito.android.publish.price_list.domain.c> provider, Provider<P0> provider2) {
        this.f238615a = provider;
        this.f238616b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f238615a.get(), this.f238616b.get());
    }
}
