package com.avito.android.work_profile.profile.about_me.di;

import bQ0.InterfaceC25545a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.C31142p0;
import com.avito.android.lib.beduin_v2.feature.di.C31144q0;
import com.avito.android.lib.beduin_v2.feature.di.C31145r0;
import com.avito.android.lib.beduin_v2.feature.di.C31149t0;
import com.avito.android.lib.beduin_v2.feature.di.C31151u0;
import com.avito.android.lib.beduin_v2.feature.di.C31153v0;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.util.R0;
import com.avito.android.work_profile.domain.j;
import com.avito.android.work_profile.profile.about_me.di.a;
import com.avito.android.work_profile.profile.about_me.mvi.h;
import com.avito.android.work_profile.profile.about_me.ui.AboutMeFragment;
import com.avito.beduin.v2.engine.component.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerAboutMeComponent.java */
@e
/* loaded from: classes5.dex */
public final class d {

    /* compiled from: DaggerAboutMeComponent.java */
    public static final class b implements com.avito.android.work_profile.profile.about_me.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<ZP0.a> f330763a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC25545a> f330764b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f330765c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.work_profile.domain.mapper.b f330766d;

        /* renamed from: e, reason: collision with root package name */
        public final u<j> f330767e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Set<String>> f330768f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.about_me.mvi.e f330769g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.about_me.mvi.c f330770h;

        /* renamed from: i, reason: collision with root package name */
        public final l f330771i;

        /* renamed from: j, reason: collision with root package name */
        public final h f330772j;

        /* renamed from: k, reason: collision with root package name */
        public final u<n.a> f330773k;

        /* renamed from: l, reason: collision with root package name */
        public final u<B> f330774l;

        /* renamed from: m, reason: collision with root package name */
        public final u<Set<FV0.h>> f330775m;

        /* renamed from: n, reason: collision with root package name */
        public final C31144q0 f330776n;

        /* renamed from: o, reason: collision with root package name */
        public final u<R0> f330777o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.work_profile.profile.about_me.b f330778p;

        /* compiled from: DaggerAboutMeComponent.java */
        public static final class a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.about_me.di.b f330779a;

            public a(com.avito.android.work_profile.profile.about_me.di.b bVar) {
                this.f330779a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarSh = this.f330779a.Sh();
                t.c(xVarSh);
                return xVarSh;
            }
        }

        /* compiled from: DaggerAboutMeComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.about_me.di.d$b$b, reason: collision with other inner class name */
        public static final class C10276b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.about_me.di.b f330780a;

            public C10276b(com.avito.android.work_profile.profile.about_me.di.b bVar) {
                this.f330780a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0P5 = this.f330780a.p5();
                t.c(r0P5);
                return r0P5;
            }
        }

        /* compiled from: DaggerAboutMeComponent.java */
        public static final class c implements u<InterfaceC25545a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.about_me.di.b f330781a;

            public c(com.avito.android.work_profile.profile.about_me.di.b bVar) {
                this.f330781a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC25545a interfaceC25545aU5 = this.f330781a.u5();
                t.c(interfaceC25545aU5);
                return interfaceC25545aU5;
            }
        }

        /* compiled from: DaggerAboutMeComponent.java */
        /* renamed from: com.avito.android.work_profile.profile.about_me.di.d$b$d, reason: collision with other inner class name */
        public static final class C10277d implements u<ZP0.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.work_profile.profile.about_me.di.b f330782a;

            public C10277d(com.avito.android.work_profile.profile.about_me.di.b bVar) {
                this.f330782a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZP0.a aVarB4 = this.f330782a.B4();
                t.c(aVarB4);
                return aVarB4;
            }
        }

        public b(C31138n0 c31138n0, com.avito.android.work_profile.profile.about_me.di.b bVar, ScreenPerformanceTracker screenPerformanceTracker, a aVar) {
            C10277d c10277d = new C10277d(bVar);
            c cVar = new c(bVar);
            this.f330766d = new com.avito.android.work_profile.domain.mapper.b(new a(bVar));
            this.f330767e = g.d(new com.avito.android.work_profile.data.d(c10277d, cVar, com.avito.android.work_profile.domain.mapper.d.a(), this.f330766d));
            u<Set<String>> uVarA = dagger.internal.B.a(C31149t0.a(c31138n0));
            this.f330768f = uVarA;
            u<j> uVar = this.f330767e;
            this.f330769g = new com.avito.android.work_profile.profile.about_me.mvi.e(uVarA, uVar);
            this.f330770h = new com.avito.android.work_profile.profile.about_me.mvi.c(uVarA, uVar);
            this.f330771i = l.a(screenPerformanceTracker);
            this.f330772j = new h(this.f330769g, this.f330770h, com.avito.android.work_profile.profile.about_me.mvi.j.a(), com.avito.android.work_profile.profile.about_me.mvi.l.a(), this.f330771i);
            this.f330773k = dagger.internal.B.a(C31142p0.a(c31138n0));
            this.f330774l = dagger.internal.B.a(C31145r0.a(c31138n0));
            this.f330775m = dagger.internal.B.a(C31153v0.a(c31138n0));
            this.f330776n = C31144q0.a(c31138n0);
            this.f330777o = new C10276b(bVar);
            this.f330778p = new com.avito.android.work_profile.profile.about_me.b(this.f330772j, this.f330773k, this.f330774l, this.f330775m, this.f330776n, this.f330777o, C31151u0.a(c31138n0));
        }

        @Override // com.avito.android.work_profile.profile.about_me.di.a
        public final void a(AboutMeFragment aboutMeFragment) {
            aboutMeFragment.f330815o0 = this.f330778p;
        }
    }

    /* compiled from: DaggerAboutMeComponent.java */
    public static final class c implements a.InterfaceC10275a {
        public c() {
        }

        @Override // com.avito.android.work_profile.profile.about_me.di.a.InterfaceC10275a
        public final com.avito.android.work_profile.profile.about_me.di.a a(ScreenPerformanceTracker screenPerformanceTracker, C31138n0 c31138n0, com.avito.android.work_profile.profile.about_me.di.b bVar) {
            return new b(c31138n0, bVar, screenPerformanceTracker, null);
        }
    }

    public static a.InterfaceC10275a a() {
        return new c();
    }
}
