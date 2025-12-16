package com.avito.android.analytics.screens.tracker;

import javax.inject.Provider;

/* compiled from: DuplicateScreenInitEventsDetectorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.analytics.screens.tracker.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28492n implements dagger.internal.h<C28491m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f90896a;

    public C28492n(Provider<com.avito.android.util.C> provider) {
        this.f90896a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28491m(this.f90896a.get());
    }
}
