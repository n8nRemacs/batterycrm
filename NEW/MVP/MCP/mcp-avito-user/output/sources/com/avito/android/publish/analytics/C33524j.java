package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: PublishCallsEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33524j implements dagger.internal.h<C33523i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f232252a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C50213a> f232253b;

    public C33524j(Provider<InterfaceC28373a> provider, Provider<C50213a> provider2) {
        this.f232252a = provider;
        this.f232253b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33523i(this.f232252a.get(), this.f232253b.get());
    }
}
