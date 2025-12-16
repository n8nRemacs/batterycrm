package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.di.module.C30125n4;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import sN0.InterfaceC48080b;

/* compiled from: AdvertXlItemPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f268881a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f268882b;

    /* renamed from: c, reason: collision with root package name */
    public final C30125n4 f268883c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC34681a> f268884d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28616b> f268885e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.async_phone.A> f268886f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f268887g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C36135w2> f268888h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC34864v0> f268889i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<p1> f268890j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f268891k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f268892l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.video_snippets.g> f268893m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<InterfaceC48080b> f268894n;

    public v(dagger.internal.f fVar, dagger.internal.f fVar2, C30125n4 c30125n4, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider8, Provider provider9) {
        this.f268881a = fVar;
        this.f268882b = fVar2;
        this.f268883c = c30125n4;
        this.f268884d = provider;
        this.f268885e = provider2;
        this.f268886f = provider3;
        this.f268887g = provider4;
        this.f268888h = provider5;
        this.f268889i = provider6;
        this.f268890j = provider7;
        this.f268891k = lVar;
        this.f268892l = lVar2;
        this.f268893m = provider8;
        this.f268894n = provider9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new u(dagger.internal.g.b(this.f268881a), dagger.internal.g.b(this.f268882b), (com.avito.android.date_time_formatter.b) this.f268883c.get(), this.f268884d.get(), this.f268885e.get(), this.f268886f.get(), this.f268887g.get(), this.f268888h.get(), this.f268889i.get(), this.f268890j.get(), (SearchParams) this.f268891k.f393949a, (Kundle) this.f268892l.f393949a, this.f268893m.get(), this.f268894n.get());
    }
}
