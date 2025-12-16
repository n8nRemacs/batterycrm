package com.avito.android.serp.adapter.recomendations;

import com.avito.android.features.auto.ab_tests.configs.AutoAdvertDetailsI2IDealerBlockTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpandableSectionPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<o> f270558a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<u3.g<AutoAdvertDetailsI2IDealerBlockTestGroup>> f270559b;

    public h(Provider<o> provider, Provider<u3.g<AutoAdvertDetailsI2IDealerBlockTestGroup>> provider2) {
        this.f270558a = provider;
        this.f270559b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f270558a.get(), this.f270559b.get());
    }
}
