package com.avito.android.autoteka.deeplinks.unifiedButton;

import bv.C25719a;
import bv.C25721c;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaUnifiedButtonDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f96323a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f96324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f96325c;

    public c(C25721c c25721c, dagger.internal.f fVar, Provider provider) {
        this.f96323a = c25721c;
        this.f96324b = fVar;
        this.f96325c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C25719a) this.f96323a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f96324b.get(), this.f96325c.get());
    }
}
