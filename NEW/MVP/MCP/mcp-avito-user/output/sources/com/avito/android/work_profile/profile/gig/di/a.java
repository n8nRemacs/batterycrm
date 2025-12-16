package com.avito.android.work_profile.profile.gig.di;

import Y41.l;
import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import bQ0.InterfaceC25545a;
import com.avito.android.work_profile.profile.gig.di.b;
import com.avito.android.work_profile.profile.gig.di.h;
import com.avito.android.work_profile.profile.gig.mvi.j;
import com.avito.android.work_profile.profile.gig.mvi.n;
import com.avito.android.work_profile.profile.gig.ui.GigFragment;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerGigComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerGigComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.work_profile.profile.gig.di.b.a
        public final com.avito.android.work_profile.profile.gig.di.b a(l lVar, com.avito.android.work_profile.profile.gig.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, lVar, null);
        }
    }

    /* compiled from: DaggerGigComponent.java */
    public static final class c implements com.avito.android.work_profile.profile.gig.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC25545a> f331099a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.gig_snippet.a> f331100b;

        /* renamed from: c, reason: collision with root package name */
        public final u<Application> f331101c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.work_profile.domain.d> f331102d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f331103e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.gig.mvi.e f331104f;

        /* renamed from: g, reason: collision with root package name */
        public final n f331105g;

        /* renamed from: h, reason: collision with root package name */
        public final u<RecyclerView.l> f331106h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f331107i;

        /* renamed from: j, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f331108j;

        /* renamed from: k, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f331109k;

        /* renamed from: l, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f331110l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f331111m;

        /* renamed from: n, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f331112n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f331113o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f331114p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f331115q;

        /* compiled from: DaggerGigComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.gig.di.a$c$a, reason: collision with other inner class name */
        public static final class C10290a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.gig.di.c f331116a;

            public C10290a(com.avito.android.work_profile.profile.gig.di.c cVar) {
                this.f331116a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f331116a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerGigComponent.java */
        public static final class b implements u<com.avito.android.gig_snippet.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.gig.di.c f331117a;

            public b(com.avito.android.work_profile.profile.gig.di.c cVar) {
                this.f331117a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f331117a.D7();
            }
        }

        /* compiled from: DaggerGigComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.gig.di.a$c$c, reason: collision with other inner class name */
        public static final class C10291c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f331118a;

            public C10291c(cv.b bVar) {
                this.f331118a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f331118a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerGigComponent.java */
        public static final class d implements u<InterfaceC25545a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.gig.di.c f331119a;

            public d(com.avito.android.work_profile.profile.gig.di.c cVar) {
                this.f331119a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25545a interfaceC25545aDl = this.f331119a.Dl();
                t.c(interfaceC25545aDl);
                return interfaceC25545aDl;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.work_profile.profile.gig.di.c cVar, cv.b bVar, l lVar, C10289a c10289a) {
            u<com.avito.android.work_profile.domain.d> uVarD = dagger.internal.g.d(new com.avito.android.work_profile.domain.f(new d(cVar), new com.avito.android.work_profile.profile.gig.mvi.l(new b(cVar), new C10290a(cVar))));
            this.f331102d = uVarD;
            com.avito.android.work_profile.profile.gig.mvi.c cVar2 = new com.avito.android.work_profile.profile.gig.mvi.c(uVarD, new C10291c(bVar));
            this.f331104f = new com.avito.android.work_profile.profile.gig.mvi.e(uVarD);
            this.f331105g = new n(new com.avito.android.work_profile.profile.gig.mvi.h(cVar2, j.a(), this.f331104f));
            this.f331106h = dagger.internal.g.d(h.a.f331125a);
            dagger.internal.l lVarA = dagger.internal.l.a(lVar);
            this.f331107i = lVarA;
            this.f331108j = dagger.internal.g.d(new com.avito.android.work_profile.profile.gig.ui.list.button_item.b(new com.avito.android.work_profile.profile.gig.ui.list.button_item.e(lVarA)));
            this.f331109k = dagger.internal.g.d(new com.avito.android.work_profile.profile.gig.ui.list.title_item.b(new com.avito.android.work_profile.profile.gig.ui.list.title_item.e(this.f331107i)));
            this.f331110l = dagger.internal.g.d(new com.avito.android.work_profile.profile.gig.ui.list.shift_item.b(new com.avito.android.work_profile.profile.gig.ui.list.shift_item.e(this.f331107i)));
            this.f331111m = dagger.internal.g.d(new com.avito.android.work_profile.profile.gig.ui.list.banner_item.b(new com.avito.android.work_profile.profile.gig.ui.list.banner_item.d(this.f331107i)));
            this.f331112n = dagger.internal.g.d(new com.avito.android.work_profile.profile.gig.ui.list.motivations_item.c(new com.avito.android.work_profile.profile.gig.ui.list.motivations_item.e(this.f331107i)));
            A.b bVarA = A.a(5, 0);
            u<TV0.b<?, ?>> uVar = this.f331108j;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f331109k);
            list.add(this.f331110l);
            list.add(this.f331111m);
            list.add(this.f331112n);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new f(bVarA.b()));
            this.f331113o = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new e(uVarD2));
            this.f331114p = uVarD3;
            this.f331115q = dagger.internal.g.d(new g(uVarD3, this.f331113o));
        }

        @Override // com.avito.android.work_profile.profile.gig.di.b
        public final void a(GigFragment gigFragment) {
            gigFragment.f331152n0 = this.f331105g;
            gigFragment.f331154p0 = this.f331106h.get();
            gigFragment.f331155q0 = this.f331115q.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
