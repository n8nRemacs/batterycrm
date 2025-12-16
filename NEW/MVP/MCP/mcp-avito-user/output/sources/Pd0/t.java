package Pd0;

import javax.inject.Provider;

/* compiled from: ProfileLoadTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.o> f13174a;

    public t(Provider<com.avito.android.analytics.screens.o> provider) {
        this.f13174a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f13174a.get());
    }
}
