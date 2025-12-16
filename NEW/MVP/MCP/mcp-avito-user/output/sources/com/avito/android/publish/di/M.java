package com.avito.android.publish.di;

import javax.inject.Provider;

/* compiled from: PublishPhotoPickerAnalyticsModule_ProvidePhotoPickerEventObserverFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<l41.g<m80.k>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.jakewharton.rxrelay3.c<m80.k>> f235154a;

    public M(Provider<com.jakewharton.rxrelay3.c<m80.k>> provider) {
        this.f235154a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.jakewharton.rxrelay3.c<m80.k> cVar = this.f235154a.get();
        L.f235153a.getClass();
        return cVar;
    }
}
