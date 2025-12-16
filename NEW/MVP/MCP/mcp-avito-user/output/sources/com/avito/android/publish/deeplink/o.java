package com.avito.android.publish.deeplink;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: CollectPublishParamsDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f232589a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f232590b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.publish.details.buyout.g f232591c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f232592d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f232593e;

    public o(C30102l3 c30102l3, dv.b bVar, com.avito.android.publish.details.buyout.g gVar, dagger.internal.f fVar, Provider provider) {
        this.f232589a = c30102l3;
        this.f232590b = bVar;
        this.f232591c = gVar;
        this.f232592d = fVar;
        this.f232593e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Context) this.f232589a.get(), (a.g) this.f232590b.get(), (com.avito.android.publish.details.buyout.f) this.f232591c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f232592d.get(), this.f232593e.get());
    }
}
