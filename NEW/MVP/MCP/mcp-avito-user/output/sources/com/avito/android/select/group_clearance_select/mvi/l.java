package com.avito.android.select.group_clearance_select.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupClearanceReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f265530a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.provider.a> f265531b;

    public l(Provider<InterfaceC28373a> provider, Provider<com.avito.android.analytics.provider.a> provider2) {
        this.f265530a = provider;
        this.f265531b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f265530a.get(), this.f265531b.get());
    }
}
