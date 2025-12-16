package com.avito.android.edit_seller_type.di;

import Za0.InterfaceC19524a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import com.avito.android.edit_seller_type.M;
import com.avito.android.edit_seller_type.di.b;
import com.avito.android.edit_seller_type.mvi.entity.c;
import com.avito.android.edit_seller_type.mvi.i;
import com.avito.android.edit_seller_type.mvi.k;
import com.avito.android.edit_seller_type.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import wy.C49703c;

/* compiled from: DaggerEditSellerTypeComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEditSellerTypeComponent.java */
    public static final class b implements com.avito.android.edit_seller_type.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f146712a;

        /* renamed from: b, reason: collision with root package name */
        public final u<x> f146713b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f146714c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC19524a> f146715d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.edit_seller_type.mvi.f f146716e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f146717f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f146718g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.edit_seller_type.mvi.d f146719h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f146720i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f146721j;

        /* renamed from: k, reason: collision with root package name */
        public final M f146722k;

        /* compiled from: DaggerEditSellerTypeComponent.java */
        /* renamed from: com.avito.android.edit_seller_type.di.a$b$a, reason: collision with other inner class name */
        public static final class C4267a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.edit_seller_type.di.c f146723a;

            public C4267a(com.avito.android.edit_seller_type.di.c cVar) {
                this.f146723a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f146723a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerEditSellerTypeComponent.java */
        /* renamed from: com.avito.android.edit_seller_type.di.a$b$b, reason: collision with other inner class name */
        public static final class C4268b implements u<InterfaceC19524a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.edit_seller_type.di.c f146724a;

            public C4268b(com.avito.android.edit_seller_type.di.c cVar) {
                this.f146724a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC19524a interfaceC19524aS9 = this.f146724a.s9();
                t.c(interfaceC19524aS9);
                return interfaceC19524aS9;
            }
        }

        /* compiled from: DaggerEditSellerTypeComponent.java */
        public static final class c implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.edit_seller_type.di.c f146725a;

            public c(com.avito.android.edit_seller_type.di.c cVar) {
                this.f146725a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarT = this.f146725a.t();
                t.c(xVarT);
                return xVarT;
            }
        }

        /* compiled from: DaggerEditSellerTypeComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f146726a;

            public d(cv.b bVar) {
                this.f146726a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f146726a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerEditSellerTypeComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.edit_seller_type.di.c f146727a;

            public e(com.avito.android.edit_seller_type.di.c cVar) {
                this.f146727a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f146727a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEditSellerTypeComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.edit_seller_type.di.c f146728a;

            public f(com.avito.android.edit_seller_type.di.c cVar) {
                this.f146728a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f146728a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.edit_seller_type.di.c cVar, cv.b bVar, C28478k c28478k, c.f fVar, C4266a c4266a) {
            this.f146712a = bVar;
            com.avito.android.edit_seller_type.interactor.c cVar2 = new com.avito.android.edit_seller_type.interactor.c(new C49703c(l.b(fVar), new c(cVar)), new e(cVar), new C4268b(cVar));
            this.f146716e = new com.avito.android.edit_seller_type.mvi.f(cVar2);
            this.f146719h = new com.avito.android.edit_seller_type.mvi.d(cVar2, new C4267a(cVar), new d(bVar));
            this.f146720i = new f(cVar);
            this.f146721j = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f146720i);
            this.f146722k = new M(new i(this.f146716e, this.f146719h, k.a(), m.a(), this.f146721j));
        }

        @Override // com.avito.android.edit_seller_type.di.b
        public final void a(EditSellerTypeFragment editSellerTypeFragment) {
            editSellerTypeFragment.f146676n0 = this.f146722k;
            editSellerTypeFragment.f146678p0 = this.f146721j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f146712a.u4();
            t.c(aVarU4);
            editSellerTypeFragment.f146679q0 = aVarU4;
        }
    }

    /* compiled from: DaggerEditSellerTypeComponent.java */
    public static final class c implements b.InterfaceC4269b {
        public c() {
        }

        @Override // com.avito.android.edit_seller_type.di.b.InterfaceC4269b
        public final com.avito.android.edit_seller_type.di.b a(com.avito.android.edit_seller_type.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, c.f fVar) {
            interfaceC39417a.getClass();
            return new b(cVar, interfaceC39417a, c28478k, fVar, null);
        }
    }

    public static b.InterfaceC4269b a() {
        return new c();
    }
}
