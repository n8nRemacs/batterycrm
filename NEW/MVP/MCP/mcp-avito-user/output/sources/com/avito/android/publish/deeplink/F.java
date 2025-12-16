package com.avito.android.publish.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dl0.InterfaceC39749a;
import javax.inject.Provider;

/* compiled from: JobEnrichmentFeedbackDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f232531a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f232532b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC39749a> f232533c;

    public F(dv.b bVar, Provider provider, Provider provider2) {
        this.f232531a = bVar;
        this.f232532b = provider;
        this.f232533c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((a.d) this.f232531a.get(), this.f232532b.get(), this.f232533c.get());
    }
}
