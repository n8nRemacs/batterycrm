package com.avito.android.location_picker;

import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.location_picker.providers.InterfaceC31565b;
import com.avito.android.location_picker.providers.InterfaceC31569f;
import com.avito.android.location_picker.view.InterfaceC31579a;
import com.avito.android.location_picker.view.InterfaceC31580b;
import com.avito.android.location_picker.view.InterfaceC31581c;
import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lW.InterfaceC43691a;
import nF.C44245a;

/* compiled from: LocationPickerBinderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class F0 implements dagger.internal.h<x0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182107a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31579a> f182108b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC31581c> f182109c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC31580b> f182110d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC31564a> f182111e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f182112f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.location_picker.di.j f182113g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.providers.w> f182114h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC43691a> f182115i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.providers.C> f182116j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<InterfaceC31569f> f182117k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC31565b> f182118l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<SearchParamsConverter> f182119m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<O0> f182120n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.analytics.a> f182121o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.job.a> f182122p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.l f182123q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f182124r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<C44245a> f182125s;

    /* renamed from: t, reason: collision with root package name */
    public final dagger.internal.l f182126t;

    /* renamed from: u, reason: collision with root package name */
    public final dagger.internal.l f182127u;

    /* renamed from: v, reason: collision with root package name */
    public final dagger.internal.l f182128v;

    public F0(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.location_picker.di.j jVar, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, dagger.internal.l lVar2, Provider provider15, Provider provider16, dagger.internal.l lVar3, dagger.internal.l lVar4, dagger.internal.l lVar5) {
        this.f182107a = lVar;
        this.f182108b = provider;
        this.f182109c = provider2;
        this.f182110d = provider3;
        this.f182111e = provider4;
        this.f182112f = provider5;
        this.f182113g = jVar;
        this.f182114h = provider6;
        this.f182115i = provider7;
        this.f182116j = provider8;
        this.f182117k = provider9;
        this.f182118l = provider10;
        this.f182119m = provider11;
        this.f182120n = provider12;
        this.f182121o = provider13;
        this.f182122p = provider14;
        this.f182123q = lVar2;
        this.f182124r = provider15;
        this.f182125s = provider16;
        this.f182126t = lVar3;
        this.f182127u = lVar4;
        this.f182128v = lVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new x0((LocationPickerState) this.f182107a.f393949a, this.f182108b.get(), this.f182109c.get(), this.f182110d.get(), this.f182111e.get(), this.f182112f.get(), (InterfaceC33034d) this.f182113g.get(), this.f182114h.get(), this.f182115i.get(), this.f182116j.get(), this.f182117k.get(), this.f182118l.get(), this.f182119m.get(), this.f182120n.get(), this.f182121o.get(), this.f182122p.get(), (com.avito.android.location_picker.job.f) this.f182123q.f393949a, this.f182124r.get(), this.f182125s.get(), ((Boolean) this.f182126t.f393949a).booleanValue(), ((Boolean) this.f182127u.f393949a).booleanValue(), (LocationFlowType) this.f182128v.f393949a);
    }
}
