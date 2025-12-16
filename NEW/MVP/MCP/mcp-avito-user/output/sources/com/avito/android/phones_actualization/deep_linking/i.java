package com.avito.android.phones_actualization.deep_linking;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import hD.C40808c;
import javax.inject.Provider;

/* compiled from: ActualizePhonesStatusAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final m f216195a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f216196b;

    /* renamed from: c, reason: collision with root package name */
    public final C40808c f216197c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f216198d;

    public i(m mVar, dagger.internal.f fVar, C40808c c40808c, Provider provider) {
        this.f216195a = mVar;
        this.f216196b = fVar;
        this.f216197c = c40808c;
        this.f216198d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((j) this.f216195a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f216196b.get(), (C40806a) this.f216197c.get(), this.f216198d.get());
    }
}
