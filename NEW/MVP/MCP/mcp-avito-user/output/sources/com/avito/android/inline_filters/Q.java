package com.avito.android.inline_filters;

import Hr.InterfaceC14024a;
import cE.C27025b;
import com.avito.android.B2;
import com.avito.android.C0;
import com.avito.android.shortcut_navigation_bar.j0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import javax.inject.Provider;
import lE.C43624b;

/* compiled from: InlineFiltersPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class Q implements dagger.internal.h<z> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC30995b> f171014a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f171015b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<W> f171016c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31046f> f171017d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f171018e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<j0> f171019f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.inline_filters.dialog.s> f171020g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f171021h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<CN.f> f171022i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<CN.o> f171023j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.l f171024k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f171025l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.u f171026m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f171027n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.u f171028o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f171029p;

    /* renamed from: q, reason: collision with root package name */
    public final com.avito.android.onboarding_manager.d f171030q;

    /* renamed from: r, reason: collision with root package name */
    public final dagger.internal.u f171031r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.u f171032s;

    /* renamed from: t, reason: collision with root package name */
    public final com.avito.android.inline_filters.dialog.calendar.date_range.b f171033t;

    public Q(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5, com.avito.android.onboarding_manager.d dVar, dagger.internal.u uVar6, dagger.internal.u uVar7, com.avito.android.inline_filters.dialog.calendar.date_range.b bVar) {
        this.f171014a = provider;
        this.f171015b = provider2;
        this.f171016c = provider3;
        this.f171017d = provider4;
        this.f171018e = provider5;
        this.f171019f = provider6;
        this.f171020g = provider7;
        this.f171021h = provider8;
        this.f171022i = provider9;
        this.f171023j = provider10;
        this.f171024k = lVar;
        this.f171025l = uVar;
        this.f171026m = uVar2;
        this.f171027n = uVar3;
        this.f171028o = uVar4;
        this.f171029p = uVar5;
        this.f171030q = dVar;
        this.f171031r = uVar6;
        this.f171032s = uVar7;
        this.f171033t = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC30995b interfaceC30995b = this.f171014a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f171015b.get();
        W w12 = this.f171016c.get();
        InterfaceC31046f interfaceC31046f = this.f171017d.get();
        com.avito.android.location.r rVar = this.f171018e.get();
        j0 j0Var = this.f171019f.get();
        com.avito.android.inline_filters.dialog.s sVar = this.f171020g.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f171021h.get();
        CN.f fVar = this.f171022i.get();
        CN.o oVar = this.f171023j.get();
        Kundle kundle = (Kundle) this.f171024k.f393949a;
        InterfaceC14024a interfaceC14024a = (InterfaceC14024a) this.f171025l.get();
        com.avito.android.inline_filters.link.f fVar2 = (com.avito.android.inline_filters.link.f) this.f171026m.get();
        C27025b c27025b = (C27025b) this.f171027n.get();
        com.avito.android.guests_selector.d dVar = (com.avito.android.guests_selector.d) this.f171028o.get();
        B2 b22 = (B2) this.f171029p.get();
        com.avito.android.onboarding_manager.a aVar2 = (com.avito.android.onboarding_manager.a) this.f171030q.get();
        C0 c02 = (C0) this.f171031r.get();
        C43624b c43624b = (C43624b) this.f171032s.get();
        this.f171033t.getClass();
        return new z(interfaceC30995b, aVar, w12, interfaceC31046f, rVar, j0Var, sVar, interfaceC35745a5, fVar, oVar, kundle, interfaceC14024a, fVar2, c27025b, dVar, b22, aVar2, c02, c43624b, new com.avito.android.inline_filters.dialog.calendar.date_range.a());
    }
}
