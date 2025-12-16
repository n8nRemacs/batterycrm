package com.avito.android.adaptive.image.ab_test.di;

import com.avito.android.adaptive.image.ab_test.AdaptiveImageLoadingAbTestGroup;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import u3.l;

/* compiled from: ImageLoaderAbTestsModule_ProvideAdaptiveImageLoadingTestFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<l<AdaptiveImageLoadingAbTestGroup>> {

    /* renamed from: a, reason: collision with root package name */
    public final P3.d f68491a;

    public b(P3.d dVar) {
        this.f68491a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P3.b bVar = (P3.b) this.f68491a.get();
        a.f68490a.getClass();
        return bVar.a();
    }
}
