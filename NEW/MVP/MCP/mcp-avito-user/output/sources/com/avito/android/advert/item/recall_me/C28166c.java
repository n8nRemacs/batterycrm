package com.avito.android.advert.item.recall_me;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: RecallMeAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.recall_me.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28166c implements dagger.internal.h<C28165b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f78472a;

    public C28166c(Provider<InterfaceC28373a> provider) {
        this.f78472a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28165b(this.f78472a.get());
    }
}
