package com.avito.android.reputation.di;

import Im0.InterfaceC14131a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31147s0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.reputation.di.t;
import com.avito.android.reputation.ui.ReputationArgs;
import com.avito.android.reputation.ui.ReputationFragment;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.component.B;
import cv.InterfaceC39417a;
import java.util.Set;

/* compiled from: DaggerReputationFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerReputationFragmentComponent.java */
    public static final class b implements t.a {
        public b() {
        }

        @Override // com.avito.android.reputation.di.t.a
        public final t a(C28478k c28478k, InterfaceC39417a interfaceC39417a, C31138n0 c31138n0, s sVar, ReputationArgs reputationArgs) {
            interfaceC39417a.getClass();
            return new c(c31138n0, sVar, interfaceC39417a, c28478k, reputationArgs, null);
        }
    }

    /* compiled from: DaggerReputationFragmentComponent.java */
    public static final class c implements t {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC14131a> f254700a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.reputation.ui.e> f254701b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<R0> f254702c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.reputation.ui.mvi.e f254703d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.reputation.ui.mvi.c f254704e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f254705f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f254706g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.reputation.ui.mvi.h f254707h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<n.a> f254708i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<B> f254709j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<Set<FV0.h>> f254710k;

        /* renamed from: l, reason: collision with root package name */
        public final C31144q0 f254711l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.reputation.ui.h f254712m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<com.avito.beduin.v2.interaction.navigation.flow.p> f254713n;

        /* compiled from: DaggerReputationFragmentComponent.java */
        /* renamed from: com.avito.android.reputation.di.a$c$a, reason: collision with other inner class name */
        public static final class C7620a implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final s f254714a;

            public C7620a(s sVar) {
                this.f254714a = sVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f254714a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerReputationFragmentComponent.java */
        public static final class b implements dagger.internal.u<InterfaceC14131a> {

            /* renamed from: a, reason: collision with root package name */
            public final s f254715a;

            public b(s sVar) {
                this.f254715a = sVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14131a interfaceC14131aHg = this.f254715a.Hg();
                dagger.internal.t.c(interfaceC14131aHg);
                return interfaceC14131aHg;
            }
        }

        /* compiled from: DaggerReputationFragmentComponent.java */
        /* renamed from: com.avito.android.reputation.di.a$c$c, reason: collision with other inner class name */
        public static final class C7621c implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final s f254716a;

            public C7621c(s sVar) {
                this.f254716a = sVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f254716a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(C31138n0 c31138n0, s sVar, cv.b bVar, C28478k c28478k, ReputationArgs reputationArgs, C7619a c7619a) {
            this.f254700a = new b(sVar);
            dagger.internal.u<com.avito.android.reputation.ui.e> uVarD = dagger.internal.g.d(new com.avito.android.reputation.ui.f(dagger.internal.l.a(reputationArgs), this.f254700a));
            this.f254701b = uVarD;
            C7620a c7620a = new C7620a(sVar);
            this.f254702c = c7620a;
            this.f254703d = new com.avito.android.reputation.ui.mvi.e(uVarD, c7620a);
            this.f254704e = new com.avito.android.reputation.ui.mvi.c(uVarD, c7620a);
            this.f254705f = new C7621c(sVar);
            this.f254706g = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f254705f);
            this.f254707h = new com.avito.android.reputation.ui.mvi.h(this.f254703d, this.f254704e, com.avito.android.reputation.ui.mvi.j.a(), com.avito.android.reputation.ui.mvi.l.a(), this.f254706g);
            this.f254708i = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f254709j = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f254710k = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f254711l = C31144q0.a(c31138n0);
            this.f254712m = new com.avito.android.reputation.ui.h(this.f254707h, this.f254708i, this.f254709j, this.f254710k, this.f254711l, C31151u0.a(c31138n0), this.f254702c);
            C31147s0.f176144b.getClass();
            this.f254713n = dagger.internal.B.a(new C31147s0(c31138n0));
        }

        @Override // com.avito.android.reputation.di.t
        public final void a(ReputationFragment reputationFragment) {
            reputationFragment.f254767o0 = this.f254712m;
            reputationFragment.f254772t0 = this.f254713n.get();
        }
    }

    public static t.a a() {
        return new b();
    }
}
