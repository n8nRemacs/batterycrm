package com.avito.android.advert_core.contactbar;

import Ax.InterfaceC13095a;
import Hr.InterfaceC14024a;
import Id.InterfaceC14060a;
import ac.C19864a;
import com.avito.android.B2;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.R0;
import javax.inject.Provider;
import wv.C49686b;

/* compiled from: AdvertContactsPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class u implements dagger.internal.h<C28266e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l90.n> f83246a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.messenger.a> f83247b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<WL.a> f83248c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f83249d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f83250e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35945t1<AdvertPrice>> f83251f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f83252g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f83253h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.u f83254i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.u f83255j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<SourceScreen> f83256k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.u f83257l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.deal_confirmation.d> f83258m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.u f83259n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<W9.c> f83260o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.u f83261p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f83262q;

    /* renamed from: r, reason: collision with root package name */
    public final G f83263r;

    /* renamed from: s, reason: collision with root package name */
    public final C49686b f83264s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<C19864a> f83265t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<InterfaceC14060a> f83266u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.safedeal.trust_factors.a> f83267v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<R0> f83268w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<com.avito.android.progress_info_toast_bar.interactor.g> f83269x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<InterfaceC14024a> f83270y;

    public u(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.u uVar, Provider provider7, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider8, dagger.internal.u uVar4, Provider provider9, dagger.internal.u uVar5, Provider provider10, dagger.internal.u uVar6, Provider provider11, G g12, C49686b c49686b, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17) {
        this.f83246a = provider;
        this.f83247b = provider2;
        this.f83248c = provider3;
        this.f83249d = provider4;
        this.f83250e = provider5;
        this.f83251f = provider6;
        this.f83252g = uVar;
        this.f83253h = provider7;
        this.f83254i = uVar2;
        this.f83255j = uVar3;
        this.f83256k = provider8;
        this.f83257l = uVar4;
        this.f83258m = provider9;
        this.f83259n = uVar5;
        this.f83260o = provider10;
        this.f83261p = uVar6;
        this.f83262q = provider11;
        this.f83263r = g12;
        this.f83264s = c49686b;
        this.f83265t = provider12;
        this.f83266u = provider13;
        this.f83267v = provider14;
        this.f83268w = provider15;
        this.f83269x = provider16;
        this.f83270y = provider17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28266e(this.f83246a.get(), this.f83247b.get(), this.f83248c.get(), this.f83249d.get(), this.f83250e.get(), this.f83251f.get(), (InterfaceC28373a) this.f83252g.get(), this.f83253h.get(), (C29640d) this.f83254i.get(), (B2) this.f83255j.get(), this.f83256k.get(), (AK0.l) this.f83257l.get(), this.f83258m.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f83259n.get(), this.f83260o.get(), (ProgressInfoToastBarPresenter) this.f83261p.get(), this.f83262q.get(), (C) this.f83263r.get(), (com.avito.android.delayed_ux_feedback.d) this.f83264s.get(), this.f83265t.get(), this.f83266u.get(), this.f83267v.get(), this.f83268w.get(), this.f83269x.get(), this.f83270y.get());
    }
}
