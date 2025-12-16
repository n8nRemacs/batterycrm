package com.avito.android.saved_searches.deeplinks;

import Go0.InterfaceC13902a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchSubscriptionOpenDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f258280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f258281b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC13902a> f258282c;

    public n(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f258280a = fVar;
        this.f258281b = provider;
        this.f258282c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.deeplink_handler.handler.composite.a) this.f258280a.get(), this.f258281b.get(), this.f258282c.get());
    }
}
