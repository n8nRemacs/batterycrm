package com.avito.android.publish.details;

import af0.InterfaceC19882a;
import androidx.view.InterfaceC23487e;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.objects.di.C33923f;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC36030r0;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: PublishDetailsViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u2 implements dagger.internal.h<t2> {

    /* renamed from: A, reason: collision with root package name */
    public final C33923f f235045A;

    /* renamed from: B, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f235046B;

    /* renamed from: C, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f235047C;

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC23487e> f235048a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.publish.C0> f235049b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<V0> f235050c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33779p0> f235051d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235052e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f235053f;

    /* renamed from: g, reason: collision with root package name */
    public final C33774n1 f235054g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f235055h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f235056i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<InterfaceC19882a> f235057j;

    /* renamed from: k, reason: collision with root package name */
    public final C33797v1 f235058k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.publish.realty_address_submission.h> f235059l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.computer_vision.a> f235060m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.item_wrapper.a> f235061n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<PublishDetailsFlowTracker> f235062o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<com.avito.android.ui.widget.tagged_input.l> f235063p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<S0> f235064q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<com.avito.android.publish.uxfeedback_helper.b> f235065r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.Q1> f235066s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.e> f235067t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<com.avito.android.publish.T0> f235068u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f235069v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f235070w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.beduin.custom_actions.a> f235071x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.seller_protection.c> f235072y;

    /* renamed from: z, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.auto.a> f235073z;

    public u2(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, C33774n1 c33774n1, Provider provider7, Provider provider8, Provider provider9, C33797v1 c33797v1, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, C33923f c33923f, Provider provider25, Provider provider26) {
        this.f235048a = provider;
        this.f235049b = provider2;
        this.f235050c = provider3;
        this.f235051d = provider4;
        this.f235052e = provider5;
        this.f235053f = provider6;
        this.f235054g = c33774n1;
        this.f235055h = provider7;
        this.f235056i = provider8;
        this.f235057j = provider9;
        this.f235058k = c33797v1;
        this.f235059l = provider10;
        this.f235060m = provider11;
        this.f235061n = provider12;
        this.f235062o = provider13;
        this.f235063p = provider14;
        this.f235064q = provider15;
        this.f235065r = provider16;
        this.f235066s = provider17;
        this.f235067t = provider18;
        this.f235068u = provider19;
        this.f235069v = provider20;
        this.f235070w = provider21;
        this.f235071x = provider22;
        this.f235072y = provider23;
        this.f235073z = provider24;
        this.f235045A = c33923f;
        this.f235046B = provider25;
        this.f235047C = provider26;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t2(this.f235048a.get(), this.f235049b.get(), this.f235050c.get(), this.f235051d.get(), this.f235052e.get(), this.f235053f.get(), (C33771m1) this.f235054g.get(), this.f235055h.get(), this.f235056i.get(), this.f235057j.get(), (C33794u1) this.f235058k.get(), this.f235059l.get(), this.f235060m.get(), this.f235061n.get(), this.f235062o.get(), this.f235063p.get(), this.f235064q.get(), this.f235065r.get(), this.f235066s.get(), this.f235067t.get(), this.f235068u.get(), this.f235069v.get(), this.f235070w.get(), this.f235071x.get(), this.f235072y.get(), dagger.internal.g.b(this.f235073z), (InterfaceC30978i) this.f235045A.get(), this.f235046B.get(), this.f235047C.get());
    }
}
