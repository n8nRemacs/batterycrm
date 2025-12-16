package com.avito.android.re_agent_landing.landing.flows_dialog.di;

import Y41.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.re_agent_landing.landing.flows_dialog.ReAgentProfileCreateLandingFlowsDialogFragment;
import com.avito.android.re_agent_landing.landing.flows_dialog.di.b;
import com.avito.android.re_agent_landing.landing.flows_dialog.h;
import com.avito.android.re_agent_landing.landing.flows_dialog.model.ReAgentProfileCreateLandingFlowsArguments;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.f;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerReAgentProfileCreateLandingFlowsComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerReAgentProfileCreateLandingFlowsComponent.java */
    public static final class b implements b.InterfaceC7521b {
        public b() {
        }

        @Override // com.avito.android.re_agent_landing.landing.flows_dialog.di.b.InterfaceC7521b
        public final com.avito.android.re_agent_landing.landing.flows_dialog.di.b a(com.avito.android.re_agent_landing.di.c cVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments, l lVar) {
            interfaceC39417a.getClass();
            reAgentProfileCreateLandingFlowsArguments.getClass();
            return new c(cVar, interfaceC39417a, c28478k, reAgentProfileCreateLandingFlowsArguments, lVar, null);
        }
    }

    /* compiled from: DaggerReAgentProfileCreateLandingFlowsComponent.java */
    public static final class c implements com.avito.android.re_agent_landing.landing.flows_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a, G0> f250650a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f250651b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f250652c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.re_agent_landing.landing.flows_dialog.mvi.c f250653d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f250654e;

        /* renamed from: f, reason: collision with root package name */
        public final h f250655f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f250656g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f250657h;

        /* compiled from: DaggerReAgentProfileCreateLandingFlowsComponent.java */
        /* renamed from: com.avito.android.re_agent_landing.landing.flows_dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C7520a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250658a;

            public C7520a(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250658a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f250658a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReAgentProfileCreateLandingFlowsComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.re_agent_landing.di.c f250659a;

            public b(com.avito.android.re_agent_landing.di.c cVar) {
                this.f250659a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f250659a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.re_agent_landing.di.c cVar, cv.b bVar, C28478k c28478k, ReAgentProfileCreateLandingFlowsArguments reAgentProfileCreateLandingFlowsArguments, l lVar, C7519a c7519a) {
            this.f250650a = lVar;
            this.f250651b = bVar;
            this.f250653d = new com.avito.android.re_agent_landing.landing.flows_dialog.mvi.c(new C7520a(cVar));
            this.f250654e = dagger.internal.l.a(reAgentProfileCreateLandingFlowsArguments);
            this.f250655f = new h(new f(this.f250653d, com.avito.android.re_agent_landing.landing.flows_dialog.mvi.h.a(), j.a(), this.f250654e));
            this.f250656g = new b(cVar);
            this.f250657h = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f250656g);
        }

        @Override // com.avito.android.re_agent_landing.landing.flows_dialog.di.b
        public final void a(ReAgentProfileCreateLandingFlowsDialogFragment reAgentProfileCreateLandingFlowsDialogFragment) {
            reAgentProfileCreateLandingFlowsDialogFragment.f250623h0 = this.f250655f;
            reAgentProfileCreateLandingFlowsDialogFragment.f250625j0 = this.f250657h.get();
            reAgentProfileCreateLandingFlowsDialogFragment.f250626k0 = new com.avito.android.re_agent_landing.landing.flows_dialog.e(this.f250650a);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f250651b.u4();
            t.c(aVarU4);
            reAgentProfileCreateLandingFlowsDialogFragment.f250627l0 = aVarU4;
        }
    }

    public static b.InterfaceC7521b a() {
        return new b();
    }
}
