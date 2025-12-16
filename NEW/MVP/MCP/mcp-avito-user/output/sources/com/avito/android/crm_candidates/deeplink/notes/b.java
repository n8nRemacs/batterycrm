package com.avito.android.crm_candidates.deeplink.notes;

import Ys.InterfaceC18322a;
import com.avito.android.account.E;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30125n4;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: JobCrmNotesDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Ys.c f129190a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f129191b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f129192c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f129193d;

    /* renamed from: e, reason: collision with root package name */
    public final C30125n4 f129194e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f129195f;

    public b(Ys.c cVar, dv.b bVar, dv.b bVar2, Provider provider, C30125n4 c30125n4, Provider provider2) {
        this.f129190a = cVar;
        this.f129191b = bVar;
        this.f129192c = bVar2;
        this.f129193d = provider;
        this.f129194e = c30125n4;
        this.f129195f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((InterfaceC18322a) this.f129190a.get(), (a.InterfaceC4053a) this.f129191b.get(), (a.b) this.f129192c.get(), this.f129193d.get(), (com.avito.android.date_time_formatter.b) this.f129194e.get(), this.f129195f.get());
    }
}
