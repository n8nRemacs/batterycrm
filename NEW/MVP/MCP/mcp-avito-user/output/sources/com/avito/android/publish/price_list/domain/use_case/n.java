package com.avito.android.publish.price_list.domain.use_case;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SplIsVisibleClearIconUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Boolean> f238594a;

    public n(Provider<Boolean> provider) {
        this.f238594a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f238594a.get().booleanValue());
    }
}
