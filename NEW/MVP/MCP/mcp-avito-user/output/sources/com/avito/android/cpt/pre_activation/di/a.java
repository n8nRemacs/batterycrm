package com.avito.android.cpt.pre_activation.di;

import Nr.InterfaceC14604a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpt.pre_activation.PreActivationFragment;
import com.avito.android.cpt.pre_activation.data.PreActivationData;
import com.avito.android.cpt.pre_activation.di.b;
import com.avito.android.cpt.pre_activation.i;
import com.avito.android.cpt.pre_activation.mvi.g;
import com.avito.android.cpt.pre_activation.mvi.j;
import com.avito.android.cpt.pre_activation.mvi.n;
import com.avito.android.di.module.C30060h5;
import com.avito.android.util.InterfaceC35863o4;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPreActivationComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPreActivationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cpt.pre_activation.di.b.a
        public final com.avito.android.cpt.pre_activation.di.b a(InterfaceC14604a interfaceC14604a, InterfaceC39417a interfaceC39417a, r rVar, PreActivationData preActivationData) {
            interfaceC39417a.getClass();
            return new c(interfaceC14604a, interfaceC39417a, rVar, preActivationData, null);
        }
    }

    /* compiled from: DaggerPreActivationComponent.java */
    public static final class c implements com.avito.android.cpt.pre_activation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f126697a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f126698b;

        /* renamed from: c, reason: collision with root package name */
        public final g f126699c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35863o4> f126700d;

        /* renamed from: e, reason: collision with root package name */
        public final n f126701e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f126702f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f126703g;

        /* renamed from: h, reason: collision with root package name */
        public final i f126704h;

        /* compiled from: DaggerPreActivationComponent.java */
        /* renamed from: com.avito.android.cpt.pre_activation.di.a$c$a, reason: collision with other inner class name */
        public static final class C3774a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f126705a;

            public C3774a(cv.b bVar) {
                this.f126705a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126705a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPreActivationComponent.java */
        public static final class b implements u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126706a;

            public b(InterfaceC14604a interfaceC14604a) {
                this.f126706a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f126706a.m();
                t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerPreActivationComponent.java */
        /* renamed from: com.avito.android.cpt.pre_activation.di.a$c$c, reason: collision with other inner class name */
        public static final class C3775c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14604a f126707a;

            public C3775c(InterfaceC14604a interfaceC14604a) {
                this.f126707a = interfaceC14604a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f126707a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC14604a interfaceC14604a, cv.b bVar, r rVar, PreActivationData preActivationData, C3773a c3773a) {
            this.f126697a = bVar;
            this.f126699c = new g(l.a(preActivationData), new C3774a(bVar));
            this.f126701e = new n(new b(interfaceC14604a));
            this.f126702f = new C3775c(interfaceC14604a);
            this.f126703g = dagger.internal.g.d(new C30060h5(this.f126702f, new f(l.a(rVar))));
            this.f126704h = new i(new j(this.f126699c, com.avito.android.cpt.pre_activation.mvi.c.a(), com.avito.android.cpt.pre_activation.mvi.l.a(), this.f126701e, this.f126703g));
        }

        @Override // com.avito.android.cpt.pre_activation.di.b
        public final void a(PreActivationFragment preActivationFragment) {
            preActivationFragment.f126668h0 = this.f126704h;
            preActivationFragment.f126670j0 = this.f126703g.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f126697a.u4();
            t.c(aVarU4);
            preActivationFragment.f126671k0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
