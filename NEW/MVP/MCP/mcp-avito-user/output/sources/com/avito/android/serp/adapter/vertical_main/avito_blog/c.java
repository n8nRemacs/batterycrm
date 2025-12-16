package com.avito.android.serp.adapter.vertical_main.avito_blog;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogAnalyticsImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f272624a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f272624a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f272624a.get());
    }
}
