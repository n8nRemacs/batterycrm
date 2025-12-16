package com.avito.android.favorites.di;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorites.di.C30612a;
import com.avito.android.ownership.Owners;
import gj.C40692c;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47099b;

/* compiled from: FavoriteAdvertsModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.favorites.di.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30651i implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f157323a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f157324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f157325c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f157326d;

    public C30651i(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f157323a = provider;
        this.f157324b = provider2;
        this.f157325c = provider3;
        this.f157326d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVarEl = ((C30612a.c.C30631n) this.f157323a).f157284a.El();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((C30612a.c.F) this.f157324b).get();
        a.b bVar = (a.b) ((C30612a.c.G) this.f157325c).get();
        Screen screen = (Screen) this.f157326d.f393949a;
        C30647e.f157320a.getClass();
        return d.a.a(dVarEl, aVar, bVar, C47099b.f428743a, null, new C40692c(true, true), null, new C42699b(screen.f90471b, Collections.singletonList(Owners.f210477d0), "FavoriteAdverts", false, 8, null), 40);
    }
}
