package com.avito.android.location_picker.job;

import com.avito.android.geo_common.interactor.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobAssistantInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f182418a;

    public e(Provider<g> provider) {
        this.f182418a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f182418a.get());
    }
}
