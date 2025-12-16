package com.avito.android.developments_advice.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_advice.ConsultationFormActivity;
import com.avito.android.developments_advice.di.d;
import com.avito.android.developments_advice.mvi.n;
import com.avito.android.developments_advice.mvi.q;
import com.avito.android.developments_advice.r;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.util.L4;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import lw.C43838c;
import lw.InterfaceC43836a;
import ow.InterfaceC44946a;

/* compiled from: DaggerConsultationFormComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class k {

    /* compiled from: DaggerConsultationFormComponent.java */
    public static final class b implements com.avito.android.developments_advice.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final f f136069a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f136070b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC44946a> f136071c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f136072d;

        /* renamed from: e, reason: collision with root package name */
        public final l f136073e;

        /* renamed from: f, reason: collision with root package name */
        public final l f136074f;

        /* renamed from: g, reason: collision with root package name */
        public final l f136075g;

        /* renamed from: h, reason: collision with root package name */
        public final l f136076h;

        /* renamed from: i, reason: collision with root package name */
        public final l f136077i;

        /* renamed from: j, reason: collision with root package name */
        public final l f136078j;

        /* renamed from: k, reason: collision with root package name */
        public final l f136079k;

        /* renamed from: l, reason: collision with root package name */
        public final u<InterfaceC28373a> f136080l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f136081m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC43836a> f136082n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.android.developments_advice.data.a> f136083o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.developments_advice.mvi.i f136084p;

        /* renamed from: q, reason: collision with root package name */
        public final com.avito.android.developments_advice.mvi.g f136085q;

        /* renamed from: r, reason: collision with root package name */
        public final q f136086r;

        /* renamed from: s, reason: collision with root package name */
        public final u<InterfaceC28481c> f136087s;

        /* renamed from: t, reason: collision with root package name */
        public final u<C28478k> f136088t;

        /* renamed from: u, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f136089u;

        /* renamed from: v, reason: collision with root package name */
        public final r f136090v;

        /* renamed from: w, reason: collision with root package name */
        public final u<L4> f136091w;

        /* compiled from: DaggerConsultationFormComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f136092a;

            public a(f fVar) {
                this.f136092a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f136092a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerConsultationFormComponent.java */
        /* renamed from: com.avito.android.developments_advice.di.k$b$b, reason: collision with other inner class name */
        public static final class C4117b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final f f136093a;

            public C4117b(f fVar) {
                this.f136093a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f136093a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerConsultationFormComponent.java */
        public static final class c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f136094a;

            public c(cv.b bVar) {
                this.f136094a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f136094a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerConsultationFormComponent.java */
        public static final class d implements u<InterfaceC44946a> {

            /* renamed from: a, reason: collision with root package name */
            public final f f136095a;

            public d(f fVar) {
                this.f136095a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC44946a interfaceC44946aI6 = this.f136095a.i6();
                t.c(interfaceC44946aI6);
                return interfaceC44946aI6;
            }
        }

        /* compiled from: DaggerConsultationFormComponent.java */
        public static final class e implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final f f136096a;

            public e(f fVar) {
                this.f136096a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f136096a.c();
                t.c(r0C);
                return r0C;
            }
        }

        public b(g gVar, f fVar, cv.b bVar, com.avito.android.analytics.screens.r rVar, ConsultationFormData consultationFormData, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, a aVar) {
            this.f136069a = fVar;
            this.f136070b = bVar;
            this.f136071c = new d(fVar);
            this.f136072d = new e(fVar);
            this.f136073e = l.b(consultationFormData);
            this.f136074f = l.b(str);
            this.f136075g = l.b(str2);
            this.f136076h = l.b(str3);
            this.f136077i = l.b(str4);
            this.f136078j = l.b(str5);
            this.f136079k = l.b(str6);
            u<InterfaceC43836a> uVarA = B.a(new C43838c(new a(fVar), new c(bVar)));
            this.f136082n = uVarA;
            u<com.avito.android.developments_advice.data.a> uVarA2 = B.a(new com.avito.android.developments_advice.data.e(this.f136071c, this.f136072d, this.f136073e, this.f136074f, this.f136075g, this.f136076h, this.f136077i, this.f136078j, this.f136079k, uVarA));
            this.f136083o = uVarA2;
            this.f136084p = new com.avito.android.developments_advice.mvi.i(this.f136073e, uVarA2);
            this.f136085q = new com.avito.android.developments_advice.mvi.g(this.f136073e, l.b(str7), this.f136083o);
            this.f136086r = new q(this.f136078j, l.b(bool));
            this.f136087s = new C4117b(fVar);
            u<C28478k> uVarD = dagger.internal.g.d(new h(gVar, l.a(rVar)));
            this.f136088t = uVarD;
            this.f136089u = dagger.internal.g.d(new j(gVar, this.f136087s, uVarD));
            this.f136090v = new r(new com.avito.android.developments_advice.mvi.l(this.f136084p, this.f136085q, n.a(), this.f136086r, this.f136089u));
            this.f136091w = dagger.internal.g.d(new i(gVar));
        }

        @Override // com.avito.android.developments_advice.di.d
        public final void a(ConsultationFormActivity consultationFormActivity) {
            consultationFormActivity.f135958m = this.f136069a.y3();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f136070b.u4();
            t.c(aVarU4);
            consultationFormActivity.f135959n = aVarU4;
            consultationFormActivity.f135960o = this.f136090v;
            consultationFormActivity.f135961p = this.f136089u.get();
            consultationFormActivity.f135962q = this.f136091w.get();
        }
    }

    /* compiled from: DaggerConsultationFormComponent.java */
    public static final class c implements d.a {
        public c() {
        }

        @Override // com.avito.android.developments_advice.di.d.a
        public final d a(f fVar, InterfaceC39417a interfaceC39417a, com.avito.android.analytics.screens.r rVar, ConsultationFormData consultationFormData, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
            interfaceC39417a.getClass();
            return new b(new g(), fVar, interfaceC39417a, rVar, consultationFormData, str, str2, str3, str4, str5, bool, str6, str7, null);
        }
    }

    public static d.a a() {
        return new c();
    }
}
