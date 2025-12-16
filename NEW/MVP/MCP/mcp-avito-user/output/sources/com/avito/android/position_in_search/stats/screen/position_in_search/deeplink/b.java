package com.avito.android.position_in_search.stats.screen.position_in_search.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.position_in_search.stats.screen.position_in_search.j;
import com.avito.android.util.R0;
import d90.InterfaceC39536b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchPositionDetailsDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f221352a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f221353b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f221354c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.f f221355d;

    /* renamed from: e, reason: collision with root package name */
    public final j f221356e;

    /* renamed from: f, reason: collision with root package name */
    public final LO.b f221357f;

    public b(Provider provider, dv.b bVar, dv.b bVar2, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.f fVar, j jVar, LO.b bVar3) {
        this.f221352a = provider;
        this.f221353b = bVar;
        this.f221354c = bVar2;
        this.f221355d = fVar;
        this.f221356e = jVar;
        this.f221357f = bVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f221352a.get(), (a.b) this.f221353b.get(), (a.InterfaceC4053a) this.f221354c.get(), (InterfaceC39536b) this.f221355d.get(), (com.avito.android.position_in_search.stats.screen.position_in_search.h) this.f221356e.get(), (KO.a) this.f221357f.get());
    }
}
