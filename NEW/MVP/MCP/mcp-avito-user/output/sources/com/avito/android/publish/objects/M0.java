package com.avito.android.publish.objects;

import android.content.res.Resources;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.objects.C33975x;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Locale;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectFillFormViewModel_Factory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M0 implements dagger.internal.h<C33975x.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f237501a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ObjectsParameter> f237502b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f237503c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33955k> f237504d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.publish.view.a> f237505e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.details.b> f237506f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.category_parameters.a> f237507g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f237508h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f237509i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<Locale> f237510j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<Q1> f237511k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f237512l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<P0> f237513m;

    /* renamed from: n, reason: collision with root package name */
    public final com.avito.android.publish.objects.slot.d f237514n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f237515o;

    /* renamed from: p, reason: collision with root package name */
    public final dagger.internal.l f237516p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<C50213a> f237517q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.publish.analytics.h0> f237518r;

    /* renamed from: s, reason: collision with root package name */
    public final dagger.internal.u f237519s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f237520t;

    public M0(Provider provider, Provider provider2, dagger.internal.l lVar, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar2, Provider provider8, Provider provider9, Provider provider10, Provider provider11, com.avito.android.publish.objects.slot.d dVar, Provider provider12, dagger.internal.l lVar3, Provider provider13, Provider provider14, dagger.internal.u uVar, Provider provider15) {
        this.f237501a = provider;
        this.f237502b = provider2;
        this.f237503c = lVar;
        this.f237504d = provider3;
        this.f237505e = provider4;
        this.f237506f = provider5;
        this.f237507g = provider6;
        this.f237508h = provider7;
        this.f237509i = lVar2;
        this.f237510j = provider8;
        this.f237511k = provider9;
        this.f237512l = provider10;
        this.f237513m = provider11;
        this.f237514n = dVar;
        this.f237515o = provider12;
        this.f237516p = lVar3;
        this.f237517q = provider13;
        this.f237518r = provider14;
        this.f237519s = uVar;
        this.f237520t = provider15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC36030r0 interfaceC36030r0 = this.f237501a.get();
        h31.e eVarB = dagger.internal.g.b(this.f237502b);
        ObjectFillFormScreenParams.SelectedValue selectedValue = (ObjectFillFormScreenParams.SelectedValue) this.f237503c.f393949a;
        InterfaceC33955k interfaceC33955k = this.f237504d.get();
        com.avito.android.publish.view.a aVar = this.f237505e.get();
        com.avito.android.details.b bVar = this.f237506f.get();
        com.avito.android.category_parameters.a aVar2 = this.f237507g.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f237508h.get();
        Resources resources = (Resources) this.f237509i.f393949a;
        Locale locale = this.f237510j.get();
        Q1 q12 = this.f237511k.get();
        InterfaceC33535v interfaceC33535v = this.f237512l.get();
        P0 p02 = this.f237513m.get();
        com.avito.android.publish.objects.slot.c cVar = (com.avito.android.publish.objects.slot.c) this.f237514n.get();
        InterfaceC28373a interfaceC28373a = this.f237515o.get();
        boolean zBooleanValue = ((Boolean) this.f237516p.f393949a).booleanValue();
        return new C33975x.a(resources, q12, interfaceC28373a, aVar2, bVar, interfaceC33535v, this.f237518r.get(), (com.avito.android.publish.imv.f) this.f237519s.get(), interfaceC33955k, selectedValue, p02, cVar, aVar, interfaceC35745a5, interfaceC36030r0, eVarB, locale, this.f237520t.get(), this.f237517q.get(), zBooleanValue);
    }
}
