package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di;

import Y41.l;
import com.avito.android.account.G;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.b;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.g;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.m;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.model.ReAgentShortFlowCreationArguments;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.h;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.j;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerReAgentShortFlowCreationComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
    public static final class b implements b.InterfaceC6327b {
        public b() {
        }

        @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.b.InterfaceC6327b
        public final com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.b a(com.avito.android.passport.profile_add.di.a aVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, ReAgentShortFlowCreationArguments reAgentShortFlowCreationArguments, l lVar) {
            interfaceC39417a.getClass();
            reAgentShortFlowCreationArguments.getClass();
            return new c(aVar, interfaceC39417a, c28478k, reAgentShortFlowCreationArguments, lVar, null);
        }
    }

    /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super S50.a, G0> f211548a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f211549b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f211550c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC34401z0> f211551d;

        /* renamed from: e, reason: collision with root package name */
        public final u<G> f211552e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f211553f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.e f211554g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f211555h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f211556i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f211557j;

        /* renamed from: k, reason: collision with root package name */
        public final m f211558k;

        /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.a$c$a, reason: collision with other inner class name */
        public static final class C6325a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211559a;

            public C6325a(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211559a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f211559a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211560a;

            public b(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211560a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f211560a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.a$c$c, reason: collision with other inner class name */
        public static final class C6326c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211561a;

            public C6326c(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211561a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f211561a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
        public static final class d implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211562a;

            public d(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211562a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0P5 = this.f211562a.P5();
                t.c(interfaceC34401z0P5);
                return interfaceC34401z0P5;
            }
        }

        /* compiled from: DaggerReAgentShortFlowCreationComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.di.a f211563a;

            public e(com.avito.android.passport.profile_add.di.a aVar) {
                this.f211563a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f211563a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.passport.profile_add.di.a aVar, cv.b bVar, C28478k c28478k, ReAgentShortFlowCreationArguments reAgentShortFlowCreationArguments, l lVar, C6324a c6324a) {
            this.f211548a = lVar;
            this.f211549b = bVar;
            this.f211554g = new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.e(new b(aVar), new g(new d(aVar)), new C6325a(aVar), new C6326c(aVar));
            this.f211555h = new e(aVar);
            this.f211556i = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f211555h);
            this.f211557j = dagger.internal.l.a(reAgentShortFlowCreationArguments);
            this.f211558k = new m(new h(this.f211554g, j.a(), com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.l.a(), this.f211556i, this.f211557j));
        }

        @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.di.b
        public final void a(ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment) {
            reAgentShortFlowCreationDialogFragment.f211513h0 = this.f211558k;
            reAgentShortFlowCreationDialogFragment.f211515j0 = this.f211556i.get();
            reAgentShortFlowCreationDialogFragment.f211516k0 = new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.j(this.f211548a);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f211549b.u4();
            t.c(aVarU4);
            reAgentShortFlowCreationDialogFragment.f211517l0 = aVarU4;
        }
    }

    public static b.InterfaceC6327b a() {
        return new b();
    }
}
