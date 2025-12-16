package com.avito.android.screen_flow.handler;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddDeeplinkIntentModifier_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f260194a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f260195b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f260196c;

    public b(dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider) {
        this.f260194a = fVar;
        this.f260195b = provider;
        this.f260196c = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deeplink_handler.handler.composite.a) this.f260194a.get(), this.f260195b.get(), (InterfaceC28373a) this.f260196c.get());
    }
}
