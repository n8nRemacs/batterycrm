package com.avito.android.rubricator.list.service.di;

import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import androidx.view.P0;
import com.avito.android.J0;
import com.avito.android.rubricator.list.service.ServiceListFragment;
import com.avito.android.rubricator.list.service.di.c;
import com.avito.android.rubricator.list.service.di.g;
import com.avito.android.rubricator.list.service.di.h;
import com.avito.android.rubricator.list.service.model.ServiceListArguments;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import wn0.InterfaceC49655a;

/* compiled from: DaggerServiceListComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerServiceListComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.rubricator.list.service.di.c.a
        public final com.avito.android.rubricator.list.service.di.c a(d dVar, InterfaceC39417a interfaceC39417a, ServiceListArguments serviceListArguments, ServiceListFragment serviceListFragment, Resources resources, ServiceListFragment serviceListFragment2) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, serviceListArguments, serviceListFragment, resources, serviceListFragment2, null);
        }
    }

    /* compiled from: DaggerServiceListComponent.java */
    public static final class c implements com.avito.android.rubricator.list.service.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f255954a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f255955b;

        /* renamed from: c, reason: collision with root package name */
        public final u<J0> f255956c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC49655a> f255957d;

        /* renamed from: e, reason: collision with root package name */
        public final u<P0.c> f255958e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.rubricator.list.service.h> f255959f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f255960g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.serp.analytics.widgets_tracker.g> f255961h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.rubricator.list.service.item.d> f255962i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f255963j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f255964k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f255965l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f255966m;

        /* renamed from: n, reason: collision with root package name */
        public final u<C> f255967n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f255968o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f255969p;

        /* compiled from: DaggerServiceListComponent.java */
        /* renamed from: com.avito.android.rubricator.list.service.di.a$c$a, reason: collision with other inner class name */
        public static final class C7664a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f255970a;

            public C7664a(cv.b bVar) {
                this.f255970a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f255970a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerServiceListComponent.java */
        public static final class b implements u<com.avito.android.serp.analytics.widgets_tracker.g> {

            /* renamed from: a, reason: collision with root package name */
            public final d f255971a;

            public b(d dVar) {
                this.f255971a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.serp.analytics.widgets_tracker.g gVarH2 = this.f255971a.h2();
                t.c(gVarH2);
                return gVarH2;
            }
        }

        public c(d dVar, cv.b bVar, ServiceListArguments serviceListArguments, ServiceListFragment serviceListFragment, Resources resources, com.avito.android.rubricator.list.service.item.a aVar, C7663a c7663a) {
            this.f255954a = dagger.internal.l.a(serviceListFragment);
            this.f255955b = dagger.internal.l.a(serviceListArguments);
            u<J0> uVarD = dagger.internal.g.d(h.a.f255977a);
            this.f255956c = uVarD;
            u<InterfaceC49655a> uVarD2 = dagger.internal.g.d(new k(uVarD));
            this.f255957d = uVarD2;
            u<P0.c> uVarD3 = dagger.internal.g.d(new com.avito.android.rubricator.list.service.c(this.f255955b, uVarD2));
            this.f255958e = uVarD3;
            this.f255959f = dagger.internal.g.d(new n(this.f255954a, uVarD3));
            this.f255960g = new C7664a(bVar);
            u<com.avito.android.rubricator.list.service.item.d> uVarD4 = dagger.internal.g.d(new com.avito.android.rubricator.list.service.item.g(dagger.internal.l.a(aVar), this.f255960g, new b(dVar)));
            this.f255962i = uVarD4;
            u<TV0.b<?, ?>> uVarD5 = dagger.internal.g.d(new com.avito.android.rubricator.list.service.item.c(uVarD4));
            this.f255963j = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new i(uVarD5));
            this.f255964k = uVarD6;
            u<com.avito.konveyor.adapter.h> uVarD7 = dagger.internal.g.d(new l(uVarD6));
            this.f255965l = uVarD7;
            u<com.avito.konveyor.adapter.j> uVarD8 = dagger.internal.g.d(new m(uVarD7, this.f255964k));
            this.f255966m = uVarD8;
            this.f255967n = dagger.internal.g.d(new j(uVarD8));
            u<com.avito.android.recycler.data_aware.e> uVarD9 = dagger.internal.g.d(g.a.f255976a);
            this.f255968o = uVarD9;
            this.f255969p = dagger.internal.g.d(new f(uVarD9, this.f255967n, this.f255965l));
        }

        @Override // com.avito.android.rubricator.list.service.di.c
        public final void a(ServiceListFragment serviceListFragment) {
            serviceListFragment.f255946h0 = this.f255959f.get();
            serviceListFragment.f255947i0 = this.f255969p.get();
            serviceListFragment.f255948j0 = this.f255966m.get();
        }
    }

    public static c.a a() {
        return new b();
    }
}
