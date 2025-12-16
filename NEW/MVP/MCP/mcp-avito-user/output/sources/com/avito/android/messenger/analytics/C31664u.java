package com.avito.android.messenger.analytics;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: MessengerBadgeTagAnalyticsAgentImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.analytics.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31664u implements dagger.internal.h<C31663t> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f186317a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f186318b;

    /* renamed from: c, reason: collision with root package name */
    public final C30713g1 f186319c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f186320d;

    public C31664u(dagger.internal.f fVar, Provider provider, C30713g1 c30713g1, Provider provider2) {
        this.f186317a = fVar;
        this.f186318b = provider;
        this.f186319c = c30713g1;
        this.f186320d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31663t((InterfaceC28373a) this.f186317a.get(), this.f186318b.get(), (C30277e1) this.f186319c.get(), this.f186320d.get());
    }
}
