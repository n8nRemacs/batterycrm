package com.avito.android.recall_me_v2.presentation.recallme;

import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.recall_me_v2.presentation.recallme.c;
import com.avito.android.util.R0;

/* compiled from: DaggerRecallMeFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerRecallMeFragmentComponent.java */
    public static final class b implements c.a {
        public b() {
        }
    }

    /* compiled from: DaggerRecallMeFragmentComponent.java */
    public static final class c implements com.avito.android.recall_me_v2.presentation.recallme.c {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recall_me.domain.n> f252090a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<g> f252091b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> f252092c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<R0> f252093d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.recall_me_v2.presentation.recallme.mvi.j f252094e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f252095f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f252096g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f252097h;

        /* renamed from: i, reason: collision with root package name */
        public final z f252098i;

        /* compiled from: DaggerRecallMeFragmentComponent.java */
        /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.a$c$a, reason: collision with other inner class name */
        public static final class C7564a implements dagger.internal.u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f252099a;

            public C7564a(cv.b bVar) {
                this.f252099a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f252099a.u4();
                dagger.internal.t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerRecallMeFragmentComponent.java */
        public static final class b implements dagger.internal.u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me_v2.presentation.recallme.d f252100a;

            public b(com.avito.android.recall_me_v2.presentation.recallme.d dVar) {
                this.f252100a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f252100a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerRecallMeFragmentComponent.java */
        /* renamed from: com.avito.android.recall_me_v2.presentation.recallme.a$c$c, reason: collision with other inner class name */
        public static final class C7565c implements dagger.internal.u<g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me_v2.presentation.recallme.d f252101a;

            public C7565c(com.avito.android.recall_me_v2.presentation.recallme.d dVar) {
                this.f252101a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f252101a.qj();
            }
        }

        /* compiled from: DaggerRecallMeFragmentComponent.java */
        public static final class d implements dagger.internal.u<com.avito.android.recall_me.domain.n> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me_v2.presentation.recallme.d f252102a;

            public d(com.avito.android.recall_me_v2.presentation.recallme.d dVar) {
                this.f252102a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f252102a.Vl();
            }
        }

        /* compiled from: DaggerRecallMeFragmentComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.recall_me_v2.presentation.recallme.d f252103a;

            public e(com.avito.android.recall_me_v2.presentation.recallme.d dVar) {
                this.f252103a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f252103a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(cv.b bVar, com.avito.android.recall_me_v2.presentation.recallme.d dVar, RecallMeParams recallMeParams, com.avito.android.analytics.screens.r rVar, C7563a c7563a) {
            this.f252094e = new com.avito.android.recall_me_v2.presentation.recallme.mvi.j(new d(dVar), new C7565c(dVar), new C7564a(bVar), new b(dVar));
            this.f252095f = new e(dVar);
            this.f252096g = dagger.internal.g.d(new x(dagger.internal.l.a(rVar), this.f252095f));
            this.f252097h = dagger.internal.l.a(recallMeParams);
            this.f252098i = new z(new com.avito.android.recall_me_v2.presentation.recallme.mvi.m(this.f252094e, com.avito.android.recall_me_v2.presentation.recallme.mvi.o.a(), com.avito.android.recall_me_v2.presentation.recallme.mvi.q.a(), this.f252096g, this.f252097h));
        }
    }
}
