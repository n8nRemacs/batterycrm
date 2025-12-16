package com.avito.android.travel_search.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.travel_search.di.a;
import dagger.internal.x;
import dagger.internal.y;
import gj.C40692c;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: TravelSearchModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class r implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f303078a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f303079b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f303080c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f303081d;

    public r(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f303078a = provider;
        this.f303079b = provider2;
        this.f303080c = provider3;
        this.f303081d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((a.c.C35272l) this.f303078a).f303042a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C35277q) this.f303079b).get();
        a.b bVar = (a.b) ((a.c.C35278r) this.f303080c).get();
        Screen screen = (Screen) this.f303081d.f393949a;
        p.f303076a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, new C40692c(true, true), null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210405F3), "TravelSearch", false, 8, null), 40);
    }
}
