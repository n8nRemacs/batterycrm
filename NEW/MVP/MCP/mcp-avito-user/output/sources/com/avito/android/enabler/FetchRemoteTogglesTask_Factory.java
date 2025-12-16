package com.avito.android.enabler;

import com.avito.android.remote_toggles_fetcher.fetcher.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

@e
@y
@x
/* loaded from: classes13.dex */
public final class FetchRemoteTogglesTask_Factory implements h<FetchRemoteTogglesTask> {
    private final Provider<R0> dispatchersProvider;
    private final Provider<a> fetcherProvider;

    public FetchRemoteTogglesTask_Factory(Provider<a> provider, Provider<R0> provider2) {
        this.fetcherProvider = provider;
        this.dispatchersProvider = provider2;
    }

    public static FetchRemoteTogglesTask_Factory create(Provider<a> provider, Provider<R0> provider2) {
        return new FetchRemoteTogglesTask_Factory(provider, provider2);
    }

    public static FetchRemoteTogglesTask newInstance(a aVar, R0 r02) {
        return new FetchRemoteTogglesTask(aVar, r02);
    }

    @Override // javax.inject.Provider
    public FetchRemoteTogglesTask get() {
        return newInstance(this.fetcherProvider.get(), this.dispatchersProvider.get());
    }
}
