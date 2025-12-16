package com.avito.android.enabler;

import com.avito.android.I1;
import com.avito.android.remote_toggles_fetcher.fetcher.a;
import com.avito.android.service.short_task.j;
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
public final class FetchRemoteTogglesStartUpTask_Factory implements h<FetchRemoteTogglesStartUpTask> {
    private final Provider<R0> dispatchersProvider;
    private final Provider<I1> featuresProvider;
    private final Provider<a> fetcherProvider;
    private final Provider<j> shortTaskSchedulerProvider;

    public FetchRemoteTogglesStartUpTask_Factory(Provider<j> provider, Provider<I1> provider2, Provider<a> provider3, Provider<R0> provider4) {
        this.shortTaskSchedulerProvider = provider;
        this.featuresProvider = provider2;
        this.fetcherProvider = provider3;
        this.dispatchersProvider = provider4;
    }

    public static FetchRemoteTogglesStartUpTask_Factory create(Provider<j> provider, Provider<I1> provider2, Provider<a> provider3, Provider<R0> provider4) {
        return new FetchRemoteTogglesStartUpTask_Factory(provider, provider2, provider3, provider4);
    }

    public static FetchRemoteTogglesStartUpTask newInstance(j jVar, I1 i12, a aVar, R0 r02) {
        return new FetchRemoteTogglesStartUpTask(jVar, i12, aVar, r02);
    }

    @Override // javax.inject.Provider
    public FetchRemoteTogglesStartUpTask get() {
        return newInstance(this.shortTaskSchedulerProvider.get(), this.featuresProvider.get(), this.fetcherProvider.get(), this.dispatchersProvider.get());
    }
}
