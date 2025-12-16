package com.avito.android.mortgage.person_form.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonFormAnalyticsHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f200474a;

    public e(Provider<InterfaceC28373a> provider) {
        this.f200474a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f200474a.get());
    }
}
