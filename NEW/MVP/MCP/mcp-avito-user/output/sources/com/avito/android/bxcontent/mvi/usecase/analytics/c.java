package com.avito.android.bxcontent.mvi.usecase.analytics;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetsActionTrackerUseCaseImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.analytics.a> f112578a;

    public c(Provider<com.avito.android.bxcontent.analytics.a> provider) {
        this.f112578a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f112578a.get());
    }
}
