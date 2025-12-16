package com.avito.android.bxcontent.di.module;

import android.os.Bundle;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.p1;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: BxContentKonveyorItemModule_ProvideKonveyorItemScreenDependenciesFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29069q implements dagger.internal.h<WQ.h> {

    /* renamed from: a, reason: collision with root package name */
    public final C29067o f111013a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.groupable_item.b> f111014b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f111015c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f111016d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<p1> f111017e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f111018f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f111019g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f111020h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<rs0.c> f111021i;

    public C29069q(C29067o c29067o, Provider provider, dagger.internal.f fVar, dagger.internal.f fVar2, Provider provider2, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider3, Provider provider4) {
        this.f111013a = c29067o;
        this.f111014b = provider;
        this.f111015c = fVar;
        this.f111016d = fVar2;
        this.f111017e = provider2;
        this.f111018f = lVar;
        this.f111019g = lVar2;
        this.f111020h = provider3;
        this.f111021i = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.lib.util.groupable_item.b bVar = this.f111014b.get();
        h31.e eVarB = dagger.internal.g.b(this.f111015c);
        h31.e eVarB2 = dagger.internal.g.b(this.f111016d);
        p1 p1Var = this.f111017e.get();
        Bundle bundle = (Bundle) this.f111018f.f393949a;
        SearchParams searchParams = (SearchParams) this.f111019g.f393949a;
        InterfaceC40691b interfaceC40691b = this.f111020h.get();
        rs0.c cVar = this.f111021i.get();
        this.f111013a.getClass();
        return new C29066n(bVar, eVarB, eVarB2, p1Var, bundle, searchParams, interfaceC40691b, cVar);
    }
}
