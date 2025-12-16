package com.avito.android.serp.adapter.vertical_main.publish;

import com.avito.android.inline_filters.dialog.s;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34876l;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalPublishPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34876l> f273140a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s> f273141b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.vertical_main.m> f273142c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f273143d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f273144e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f273145f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f273146g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f273147h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f273148i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.date_range.b f273149j;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, Provider provider5, Provider provider6, com.avito.android.inline_filters.dialog.calendar.date_range.b bVar) {
        this.f273140a = provider;
        this.f273141b = provider2;
        this.f273142c = provider3;
        this.f273143d = provider4;
        this.f273144e = lVar;
        this.f273145f = lVar2;
        this.f273146g = lVar3;
        this.f273147h = provider5;
        this.f273148i = provider6;
        this.f273149j = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f273140a);
        s sVar = this.f273141b.get();
        com.avito.android.serp.adapter.vertical_main.m mVar = this.f273142c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f273143d.get();
        SearchParams searchParams = (SearchParams) this.f273144e.f393949a;
        String str = (String) this.f273145f.f393949a;
        VerticalPublishState verticalPublishState = (VerticalPublishState) this.f273146g.f393949a;
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f273147h.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f273148i.get();
        this.f273149j.getClass();
        return new f(eVarB, sVar, mVar, interfaceC35745a5, searchParams, str, verticalPublishState, gVar, aVar, new com.avito.android.inline_filters.dialog.calendar.date_range.a());
    }
}
