package com.avito.android.di.module;

import com.avito.android.enabler.RemoteFeaturesDecorator;
import com.avito.android.enabler.TogglesStorage;

/* compiled from: AnalyticFeaturesModule_ProvideRemoteFeaturesDecoratorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class X implements dagger.internal.h<RemoteFeaturesDecorator> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144183a;

    public X(dagger.internal.u uVar) {
        this.f144183a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TogglesStorage togglesStorage = (TogglesStorage) this.f144183a.get();
        int i12 = T.f144138a;
        return new RemoteFeaturesDecorator(togglesStorage);
    }
}
