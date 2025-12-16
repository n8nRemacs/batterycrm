package com.avito.android.passport.remove_draft;

import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportRemoveDraftAsyncDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f213896a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f213897b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f213898c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f213899d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f213900e;

    public d(n nVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f213896a = nVar;
        this.f213897b = bVar;
        this.f213898c = bVar2;
        this.f213899d = provider;
        this.f213900e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((k) this.f213896a.get(), (a.g) this.f213897b.get(), (a.i) this.f213898c.get(), this.f213899d.get(), this.f213900e.get());
    }
}
