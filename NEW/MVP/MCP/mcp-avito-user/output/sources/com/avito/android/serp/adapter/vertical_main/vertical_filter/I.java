package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.W;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: VerticalFilterPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class I implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34876l> f273380a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f273381b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.inline_filters.dialog.s> f273382c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.m> f273383d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f273384e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC30995b> f273385f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<CN.f> f273386g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<W> f273387h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC34866b> f273388i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f273389j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f273390k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.l f273391l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.l f273392m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<R0> f273393n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.guests_selector.d> f273394o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f273395p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f273396q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<C43624b> f273397r;

    /* renamed from: s, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.date_range.b f273398s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<B2> f273399t;

    public I(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, com.avito.android.inline_filters.dialog.calendar.date_range.b bVar, Provider provider16) {
        this.f273380a = provider;
        this.f273381b = provider2;
        this.f273382c = provider3;
        this.f273383d = provider4;
        this.f273384e = provider5;
        this.f273385f = provider6;
        this.f273386g = provider7;
        this.f273387h = provider8;
        this.f273388i = provider9;
        this.f273389j = provider10;
        this.f273390k = lVar;
        this.f273391l = lVar2;
        this.f273392m = lVar3;
        this.f273393n = provider11;
        this.f273394o = provider12;
        this.f273395p = provider13;
        this.f273396q = provider14;
        this.f273397r = provider15;
        this.f273398s = bVar;
        this.f273399t = provider16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f273380a);
        InterfaceC28373a interfaceC28373a = this.f273381b.get();
        com.avito.android.inline_filters.dialog.s sVar = this.f273382c.get();
        com.avito.android.serp.adapter.vertical_main.m mVar = this.f273383d.get();
        h31.e eVarB2 = dagger.internal.g.b(this.f273384e);
        h31.e eVarB3 = dagger.internal.g.b(this.f273385f);
        CN.f fVar = this.f273386g.get();
        h31.e eVarB4 = dagger.internal.g.b(this.f273387h);
        InterfaceC34866b interfaceC34866b = this.f273388i.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f273389j.get();
        SearchParams searchParams = (SearchParams) this.f273390k.f393949a;
        String str = (String) this.f273391l.f393949a;
        VerticalFilterState verticalFilterState = (VerticalFilterState) this.f273392m.f393949a;
        R0 r02 = this.f273393n.get();
        com.avito.android.guests_selector.d dVar = this.f273394o.get();
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f273395p.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f273396q.get();
        C43624b c43624b = this.f273397r.get();
        this.f273398s.getClass();
        return new v(eVarB, interfaceC28373a, sVar, mVar, eVarB2, eVarB3, fVar, eVarB4, interfaceC34866b, interfaceC35745a5, searchParams, str, verticalFilterState, r02, dVar, gVar, aVar, c43624b, new com.avito.android.inline_filters.dialog.calendar.date_range.a(), this.f273399t.get());
    }
}
