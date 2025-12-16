package com.avito.android.mortgage.verification_flow.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.verification_flow.VerificationFlowFragment;
import com.avito.android.mortgage.verification_flow.di.b;
import com.avito.android.mortgage.verification_flow.model.VerificationFlowArguments;
import com.avito.android.mortgage.verification_flow.mvi.g;
import com.avito.android.mortgage.verification_flow.mvi.j;
import com.avito.android.mortgage.verification_flow.mvi.l;
import com.avito.android.mortgage.verification_flow.v;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerVerificationFlowComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerVerificationFlowComponent.java */
    public static final class b implements b.InterfaceC6085b {
        public b() {
        }

        @Override // com.avito.android.mortgage.verification_flow.di.b.InterfaceC6085b
        public final com.avito.android.mortgage.verification_flow.di.b a(o oVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, VerificationFlowArguments verificationFlowArguments) {
            interfaceC39417a.getClass();
            return new c(oVar, interfaceC39417a, c28478k, verificationFlowArguments, null);
        }
    }

    /* compiled from: DaggerVerificationFlowComponent.java */
    public static final class c implements com.avito.android.mortgage.verification_flow.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f203867a;

        /* renamed from: b, reason: collision with root package name */
        public final u<IZ.a> f203868b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f203869c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.mortgage.verification_flow.mvi.e f203870d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f203871e;

        /* renamed from: f, reason: collision with root package name */
        public final l f203872f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f203873g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203874h;

        /* renamed from: i, reason: collision with root package name */
        public final v f203875i;

        /* compiled from: DaggerVerificationFlowComponent.java */
        /* renamed from: com.avito.android.mortgage.verification_flow.di.a$c$a, reason: collision with other inner class name */
        public static final class C6083a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203876a;

            public C6083a(o oVar) {
                this.f203876a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f203876a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVerificationFlowComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203877a;

            public b(o oVar) {
                this.f203877a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f203877a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVerificationFlowComponent.java */
        /* renamed from: com.avito.android.mortgage.verification_flow.di.a$c$c, reason: collision with other inner class name */
        public static final class C6084c implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203878a;

            public C6084c(o oVar) {
                this.f203878a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f203878a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerVerificationFlowComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203879a;

            public d(o oVar) {
                this.f203879a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203879a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, cv.b bVar, C28478k c28478k, VerificationFlowArguments verificationFlowArguments, C6082a c6082a) {
            this.f203867a = bVar;
            dagger.internal.l lVarA = dagger.internal.l.a(verificationFlowArguments);
            C6084c c6084c = new C6084c(oVar);
            this.f203869c = new b(oVar);
            this.f203870d = new com.avito.android.mortgage.verification_flow.mvi.e(lVarA, c6084c, com.avito.android.mortgage.util.e.a(), this.f203869c);
            this.f203872f = new l(new r10.e(new C6083a(oVar)));
            this.f203873g = new d(oVar);
            this.f203874h = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f203873g);
            this.f203875i = new v(new j(this.f203870d, this.f203872f, com.avito.android.mortgage.verification_flow.mvi.b.a(), g.a(), this.f203874h));
        }

        @Override // com.avito.android.mortgage.verification_flow.di.b
        public final void a(VerificationFlowFragment verificationFlowFragment) {
            verificationFlowFragment.f203847n0 = this.f203875i;
            verificationFlowFragment.f203849p0 = this.f203874h.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f203867a.u4();
            t.c(aVarU4);
            verificationFlowFragment.f203851r0 = aVarU4;
        }
    }

    public static b.InterfaceC6085b a() {
        return new b();
    }
}
