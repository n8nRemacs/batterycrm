package com.avito.android.notification.parameters_factory;

import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PushParametersFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f207470a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f207471b;

    public h(dagger.internal.f fVar, Provider provider) {
        this.f207470a = fVar;
        this.f207471b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.deep_linking.x) this.f207470a.get(), dagger.internal.g.b(this.f207471b));
    }
}
