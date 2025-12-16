package com.avito.android.registration_self_employment_redirect_screen.di;

import Xi0.C17014a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.registration_self_employment_redirect_screen.di.b;
import com.avito.android.registration_self_employment_redirect_screen.mvi.k;
import com.avito.android.registration_self_employment_redirect_screen.mvi.m;
import com.avito.android.registration_self_employment_redirect_screen.mvi.o;
import com.avito.android.registration_self_employment_redirect_screen.mvi.q;
import com.avito.android.registration_self_employment_redirect_screen.ui.SelfEmploymentRedirectActivity;
import com.avito.android.remote.H;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import jG.InterfaceC42250a;

/* compiled from: DaggerSelfEmploymentRedirectComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerSelfEmploymentRedirectComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.registration_self_employment_redirect_screen.di.b.a
        public final com.avito.android.registration_self_employment_redirect_screen.di.b a(Y41.a aVar, d dVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, aVar, null);
        }
    }

    /* compiled from: DaggerSelfEmploymentRedirectComponent.java */
    public static final class c implements com.avito.android.registration_self_employment_redirect_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final d f252707a;

        /* renamed from: b, reason: collision with root package name */
        public final f f252708b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f252709c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f252710d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f252711e;

        /* renamed from: f, reason: collision with root package name */
        public final u<x> f252712f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC42250a> f252713g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.registration_self_employment_redirect_screen.mvi.f f252714h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.registration_self_employment_redirect_screen.mvi.h f252715i;

        /* renamed from: j, reason: collision with root package name */
        public final l f252716j;

        /* renamed from: k, reason: collision with root package name */
        public final q f252717k;

        /* compiled from: DaggerSelfEmploymentRedirectComponent.java */
        /* renamed from: com.avito.android.registration_self_employment_redirect_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C7590a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final d f252718a;

            public C7590a(d dVar) {
                this.f252718a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f252718a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerSelfEmploymentRedirectComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f252719a;

            public b(cv.b bVar) {
                this.f252719a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f252719a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelfEmploymentRedirectComponent.java */
        /* renamed from: com.avito.android.registration_self_employment_redirect_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C7591c implements u<InterfaceC42250a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f252720a;

            public C7591c(d dVar) {
                this.f252720a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42250a interfaceC42250aYa = this.f252720a.ya();
                t.c(interfaceC42250aYa);
                return interfaceC42250aYa;
            }
        }

        public c() {
            throw null;
        }

        public c(d dVar, cv.b bVar, Y41.a aVar, C7589a c7589a) {
            this.f252707a = dVar;
            f fVar = new f(new com.avito.android.registration_self_employment_redirect_screen.steps_list.b(com.avito.android.registration_self_employment_redirect_screen.steps_list.e.a()));
            this.f252708b = fVar;
            u<com.avito.konveyor.adapter.a> uVarD = dagger.internal.g.d(new g(fVar));
            this.f252709c = uVarD;
            this.f252710d = dagger.internal.g.d(new h(uVarD, this.f252708b));
            b bVar2 = new b(bVar);
            com.avito.android.registration_self_employment_redirect_screen.domain.b bVar3 = new com.avito.android.registration_self_employment_redirect_screen.domain.b(new C7590a(dVar), new C7591c(dVar));
            this.f252714h = new com.avito.android.registration_self_employment_redirect_screen.mvi.f(bVar2, bVar3);
            this.f252715i = new com.avito.android.registration_self_employment_redirect_screen.mvi.h(bVar3);
            this.f252716j = l.a(aVar);
            this.f252717k = new q(new k(this.f252714h, m.a(), this.f252715i, o.a(), this.f252716j));
        }

        @Override // com.avito.android.registration_self_employment_redirect_screen.di.b
        public final void a(SelfEmploymentRedirectActivity selfEmploymentRedirectActivity) {
            selfEmploymentRedirectActivity.f252783m = this.f252710d.get();
            selfEmploymentRedirectActivity.f252784n = this.f252717k;
            d dVar = this.f252707a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.analytics.provider.a aVarV = dVar.v();
            t.c(aVarV);
            com.avito.android.server_time.f fVarL = dVar.l();
            t.c(fVarL);
            H hK2 = dVar.K();
            t.c(hK2);
            selfEmploymentRedirectActivity.f252786p = new C17014a(interfaceC28373aA, aVarV, fVarL, hK2);
        }
    }

    public static b.a a() {
        return new b();
    }
}
