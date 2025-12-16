package com.avito.android.str_seller_orders_important_to_note.di;

import Y41.l;
import Yz0.InterfaceC18351a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import com.avito.android.str_seller_orders_important_to_note.StrSellerImportantToNoteFragment;
import com.avito.android.str_seller_orders_important_to_note.di.b;
import com.avito.android.str_seller_orders_important_to_note.domain.k;
import com.avito.android.str_seller_orders_important_to_note.domain.m;
import com.avito.android.str_seller_orders_important_to_note.mvi.j;
import com.avito.android.str_seller_orders_important_to_note.mvi.n;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerStrSellerImportantToNoteComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders_important_to_note.di.b.a
        public final com.avito.android.str_seller_orders_important_to_note.di.b a(ImportantToNoteOpenParams importantToNoteOpenParams, com.avito.android.str_seller_orders_important_to_note.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, l lVar) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, importantToNoteOpenParams, c28478k, lVar, null);
        }
    }

    /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
    public static final class c implements com.avito.android.str_seller_orders_important_to_note.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f291265a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_important_to_note.di.c f291266b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f291267c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC18351a> f291268d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f291269e;

        /* renamed from: f, reason: collision with root package name */
        public final u<d1> f291270f;

        /* renamed from: g, reason: collision with root package name */
        public final u<k> f291271g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_important_to_note.mvi.g f291272h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28373a> f291273i;

        /* renamed from: j, reason: collision with root package name */
        public final u<x> f291274j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_important_to_note.mvi.e f291275k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28481c> f291276l;

        /* renamed from: m, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f291277m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.str_seller_orders_important_to_note.k f291278n;

        /* renamed from: o, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f291279o;

        /* renamed from: p, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f291280p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f291281q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f291282r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f291283s;

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        /* renamed from: com.avito.android.str_seller_orders_important_to_note.di.a$c$a, reason: collision with other inner class name */
        public static final class C8816a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291284a;

            public C8816a(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291284a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f291284a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        public static final class b implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291285a;

            public b(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291285a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f291285a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        /* renamed from: com.avito.android.str_seller_orders_important_to_note.di.a$c$c, reason: collision with other inner class name */
        public static final class C8817c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291286a;

            public C8817c(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291286a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f291286a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291287a;

            public d(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291287a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f291287a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        public static final class e implements u<d1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291288a;

            public e(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291288a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                d1 d1VarA0 = this.f291288a.a0();
                t.c(d1VarA0);
                return d1VarA0;
            }
        }

        /* compiled from: DaggerStrSellerImportantToNoteComponent.java */
        public static final class f implements u<InterfaceC18351a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.str_seller_orders_important_to_note.di.c f291289a;

            public f(com.avito.android.str_seller_orders_important_to_note.di.c cVar) {
                this.f291289a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC18351a interfaceC18351aL9 = this.f291289a.l9();
                t.c(interfaceC18351aL9);
                return interfaceC18351aL9;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.str_seller_orders_important_to_note.di.d dVar, com.avito.android.str_seller_orders_important_to_note.di.c cVar, cv.b bVar, ImportantToNoteOpenParams importantToNoteOpenParams, C28478k c28478k, l lVar, C8815a c8815a) {
            this.f291265a = bVar;
            this.f291266b = cVar;
            this.f291267c = dagger.internal.l.a(importantToNoteOpenParams);
            u<k> uVarD = dagger.internal.g.d(new m(new f(cVar), new C8817c(cVar), new e(cVar)));
            this.f291271g = uVarD;
            dagger.internal.l lVar2 = this.f291267c;
            this.f291272h = new com.avito.android.str_seller_orders_important_to_note.mvi.g(lVar2, uVarD);
            this.f291275k = new com.avito.android.str_seller_orders_important_to_note.mvi.e(lVar2, uVarD, new C8816a(cVar), new b(cVar));
            this.f291276l = new d(cVar);
            this.f291277m = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f291276l);
            this.f291278n = new com.avito.android.str_seller_orders_important_to_note.k(new j(this.f291272h, this.f291275k, com.avito.android.str_seller_orders_important_to_note.mvi.l.a(), n.a(), this.f291277m));
            this.f291279o = dagger.internal.g.d(new com.avito.android.str_seller_orders_important_to_note.ui.item.g(new com.avito.android.str_seller_orders_important_to_note.ui.item.e(dagger.internal.l.a(lVar))));
            this.f291280p = dagger.internal.g.d(new com.avito.android.str_seller_orders_important_to_note.ui.stub_item.c(com.avito.android.str_seller_orders_important_to_note.ui.stub_item.e.a()));
            A.b bVarA = A.a(2, 0);
            u<TV0.b<?, ?>> uVar = this.f291279o;
            List<u<T>> list = bVarA.f393937a;
            list.add(uVar);
            list.add(this.f291280p);
            u<com.avito.konveyor.a> uVarD2 = dagger.internal.g.d(new com.avito.android.str_seller_orders_important_to_note.di.f(dVar, bVarA.b()));
            this.f291281q = uVarD2;
            u<com.avito.konveyor.adapter.a> uVarD3 = dagger.internal.g.d(new com.avito.android.str_seller_orders_important_to_note.di.e(dVar, uVarD2));
            this.f291282r = uVarD3;
            this.f291283s = dagger.internal.g.d(new g(dVar, uVarD3, this.f291281q));
        }

        @Override // com.avito.android.str_seller_orders_important_to_note.di.b
        public final void a(StrSellerImportantToNoteFragment strSellerImportantToNoteFragment) {
            strSellerImportantToNoteFragment.f291218h0 = this.f291278n;
            strSellerImportantToNoteFragment.f291220j0 = this.f291277m.get();
            strSellerImportantToNoteFragment.f291221k0 = this.f291283s.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f291265a.u4();
            t.c(aVarU4);
            strSellerImportantToNoteFragment.f291222l0 = aVarU4;
            strSellerImportantToNoteFragment.f291223m0 = this.f291266b.M0();
        }
    }

    public static b.a a() {
        return new b();
    }
}
