package com.avito.android.publish.screen.step.params.domain;

import af0.InterfaceC19882a;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.publish.C0;
import com.avito.android.publish.T0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.C33774n1;
import com.avito.android.publish.details.C33794u1;
import com.avito.android.publish.details.C33797v1;
import com.avito.android.publish.details.InterfaceC33779p0;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.V0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.objects.di.C33923f;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC36030r0;
import gj.InterfaceC40691b;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: PublishDetailsInteractorAsyncImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class c0 implements dagger.internal.h<C34076c> {

    /* renamed from: A, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f241231A;

    /* renamed from: B, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f241232B;

    /* renamed from: C, reason: collision with root package name */
    public final dagger.internal.u f241233C;

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f241234a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f241235b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f241236c;

    /* renamed from: d, reason: collision with root package name */
    public final C33774n1 f241237d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC33779p0> f241238e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f241239f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f241240g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f241241h;

    /* renamed from: i, reason: collision with root package name */
    public final C33797v1 f241242i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<com.avito.android.publish.realty_address_submission.h> f241243j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.computer_vision.a> f241244k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.item_wrapper.a> f241245l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<PublishDetailsFlowTracker> f241246m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<com.avito.android.ui.widget.tagged_input.l> f241247n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<InterfaceC19882a> f241248o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<S0> f241249p;

    /* renamed from: q, reason: collision with root package name */
    public final Provider<com.avito.android.publish.uxfeedback_helper.b> f241250q;

    /* renamed from: r, reason: collision with root package name */
    public final Provider<Q1> f241251r;

    /* renamed from: s, reason: collision with root package name */
    public final Provider<com.avito.android.publish.items.e> f241252s;

    /* renamed from: t, reason: collision with root package name */
    public final Provider<T0> f241253t;

    /* renamed from: u, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f241254u;

    /* renamed from: v, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f241255v;

    /* renamed from: w, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.beduin.custom_actions.a> f241256w;

    /* renamed from: x, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.seller_protection.c> f241257x;

    /* renamed from: y, reason: collision with root package name */
    public final Provider<com.avito.android.publish.details.auto.a> f241258y;

    /* renamed from: z, reason: collision with root package name */
    public final C33923f f241259z;

    public c0(Provider provider, Provider provider2, Provider provider3, C33774n1 c33774n1, Provider provider4, Provider provider5, Provider provider6, Provider provider7, C33797v1 c33797v1, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, C33923f c33923f, Provider provider24, Provider provider25, dagger.internal.u uVar) {
        this.f241234a = provider;
        this.f241235b = provider2;
        this.f241236c = provider3;
        this.f241237d = c33774n1;
        this.f241238e = provider4;
        this.f241239f = provider5;
        this.f241240g = provider6;
        this.f241241h = provider7;
        this.f241242i = c33797v1;
        this.f241243j = provider8;
        this.f241244k = provider9;
        this.f241245l = provider10;
        this.f241246m = provider11;
        this.f241247n = provider12;
        this.f241248o = provider13;
        this.f241249p = provider14;
        this.f241250q = provider15;
        this.f241251r = provider16;
        this.f241252s = provider17;
        this.f241253t = provider18;
        this.f241254u = provider19;
        this.f241255v = provider20;
        this.f241256w = provider21;
        this.f241257x = provider22;
        this.f241258y = provider23;
        this.f241259z = c33923f;
        this.f241231A = provider24;
        this.f241232B = provider25;
        this.f241233C = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34076c(this.f241234a.get(), this.f241235b.get(), this.f241236c.get(), (C33771m1) this.f241237d.get(), this.f241238e.get(), this.f241239f.get(), this.f241240g.get(), this.f241241h.get(), (C33794u1) this.f241242i.get(), this.f241243j.get(), this.f241244k.get(), this.f241245l.get(), this.f241246m.get(), this.f241247n.get(), this.f241248o.get(), this.f241249p.get(), this.f241250q.get(), this.f241251r.get(), this.f241252s.get(), this.f241253t.get(), this.f241254u.get(), this.f241255v.get(), this.f241256w.get(), this.f241257x.get(), dagger.internal.g.b(this.f241258y), (InterfaceC30978i) this.f241259z.get(), this.f241231A.get(), this.f241232B.get(), (Set) this.f241233C.get());
    }
}
