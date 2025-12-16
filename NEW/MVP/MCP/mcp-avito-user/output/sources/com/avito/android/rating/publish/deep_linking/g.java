package com.avito.android.rating.publish.deep_linking;

import Lg0.C14396c;
import Lg0.InterfaceC14394a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingPublishLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C14396c f247634a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f247635b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f247636c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f247637d;

    public g(C14396c c14396c, Provider provider, dv.b bVar, dagger.internal.f fVar) {
        this.f247634a = c14396c;
        this.f247635b = provider;
        this.f247636c = bVar;
        this.f247637d = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((InterfaceC14394a) this.f247634a.get(), this.f247635b.get(), (a.g) this.f247636c.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f247637d.get());
    }
}
