package com.avito.android.publish.price_list.domain.use_case;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SplGetMainButtonTitleUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Boolean> f238590a;

    public h(Provider<Boolean> provider) {
        this.f238590a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f238590a.get().booleanValue());
    }
}
