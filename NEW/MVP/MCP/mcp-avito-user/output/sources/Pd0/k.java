package Pd0;

import javax.inject.Provider;

/* compiled from: FlowTrackerFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<com.avito.android.publish.details.analytics.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<v> f13169a;

    public k(Provider<v> provider) {
        this.f13169a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.publish.details.analytics.b(this.f13169a.get());
    }
}
