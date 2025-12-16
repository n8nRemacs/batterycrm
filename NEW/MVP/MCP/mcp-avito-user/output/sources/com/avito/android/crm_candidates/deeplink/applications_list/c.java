package com.avito.android.crm_candidates.deeplink.applications_list;

import Ys.InterfaceC18322a;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmApplicationsListDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Ys.c f129140a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f129141b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f129142c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f129143d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f129144e;

    public c(Ys.c cVar, dv.b bVar, C25721c c25721c, dagger.internal.f fVar, Provider provider) {
        this.f129140a = cVar;
        this.f129141b = bVar;
        this.f129142c = c25721c;
        this.f129143d = fVar;
        this.f129144e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC18322a) this.f129140a.get(), (a.InterfaceC4053a) this.f129141b.get(), (C25719a) this.f129142c.get(), (InterfaceC28373a) this.f129143d.get(), this.f129144e.get());
    }
}
