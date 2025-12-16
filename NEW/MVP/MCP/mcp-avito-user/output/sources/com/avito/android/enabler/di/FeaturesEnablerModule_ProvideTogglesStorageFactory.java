package com.avito.android.enabler.di;

import android.content.Context;
import com.avito.android.enabler.TogglesStorage;
import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

@e
@y
@x
/* loaded from: classes13.dex */
public final class FeaturesEnablerModule_ProvideTogglesStorageFactory implements h<TogglesStorage> {
    private final Provider<C> buildInfoProvider;
    private final Provider<Context> contextProvider;

    public FeaturesEnablerModule_ProvideTogglesStorageFactory(Provider<Context> provider, Provider<C> provider2) {
        this.contextProvider = provider;
        this.buildInfoProvider = provider2;
    }

    public static FeaturesEnablerModule_ProvideTogglesStorageFactory create(Provider<Context> provider, Provider<C> provider2) {
        return new FeaturesEnablerModule_ProvideTogglesStorageFactory(provider, provider2);
    }

    public static TogglesStorage provideTogglesStorage(Context context, C c12) {
        TogglesStorage togglesStorageProvideTogglesStorage = FeaturesEnablerModule.provideTogglesStorage(context, c12);
        t.d(togglesStorageProvideTogglesStorage);
        return togglesStorageProvideTogglesStorage;
    }

    @Override // javax.inject.Provider
    public TogglesStorage get() {
        return provideTogglesStorage(this.contextProvider.get(), this.buildInfoProvider.get());
    }
}
