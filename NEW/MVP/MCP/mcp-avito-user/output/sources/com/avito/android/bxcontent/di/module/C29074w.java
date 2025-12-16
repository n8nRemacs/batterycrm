package com.avito.android.bxcontent.di.module;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.SearchParams;
import gj.C40692c;
import gj.InterfaceC40691b;
import gj.d;
import javax.inject.Provider;
import kj.C42699b;
import kotlin.collections.C42745f0;
import pj.C47099b;

/* compiled from: BxContentModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29074w implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f111028a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f111029b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f111030c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f111031d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f111032e;

    public C29074w(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2, Provider provider3) {
        this.f111028a = provider;
        this.f111029b = provider2;
        this.f111030c = provider3;
        this.f111031d = lVar;
        this.f111032e = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f111028a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f111029b.get();
        a.b bVar = this.f111030c.get();
        SearchParams searchParams = (SearchParams) this.f111031d.f393949a;
        Screen screen = (Screen) this.f111032e.f393949a;
        C29070s.f111022a.getClass();
        return d.a.a(dVar, aVar, bVar, C47099b.f428743a, null, new C40692c(true, true), searchParams, new C42699b(screen.f90471b, C42745f0.U(Owners.f210493h0, Owners.f210400E, Owners.f210489g0, Owners.f210497i0), "BxContent", false, 8, null), 8);
    }
}
