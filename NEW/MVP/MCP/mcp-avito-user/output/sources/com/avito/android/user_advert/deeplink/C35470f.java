package com.avito.android.user_advert.deeplink;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertActivationV2DeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.deeplink.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35470f implements dagger.internal.h<C35469e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43640a> f310718a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310719b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f310720c;

    public C35470f(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f310718a = provider;
        this.f310719b = provider2;
        this.f310720c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35469e(this.f310718a.get(), this.f310719b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f310720c.get());
    }
}
