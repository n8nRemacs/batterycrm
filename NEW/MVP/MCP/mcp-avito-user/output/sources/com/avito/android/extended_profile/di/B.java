package com.avito.android.extended_profile.di;

import android.content.res.Resources;

/* compiled from: ExtendedProfileModule_ProvideColumnCountProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<Y41.a<Integer>> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f149519a;

    public B(dagger.internal.l lVar) {
        this.f149519a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f149519a.f393949a;
        r.f149945a.getClass();
        return new C30439t(resources);
    }
}
