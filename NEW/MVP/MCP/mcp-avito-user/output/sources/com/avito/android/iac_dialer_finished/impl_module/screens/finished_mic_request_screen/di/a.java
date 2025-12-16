package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenFragment;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.j;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.o;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.q;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen.IacFinishedMicRequestScreenArgument;
import com.avito.android.permissions.z;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b.a
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b a(IacFinishedMicRequestScreenFragment iacFinishedMicRequestScreenFragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, iacFinishedMicRequestScreenFragment, activityC22955m, resources, rVar, iacFinishedMicRequestScreenArgument, null);
        }
    }

    /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
    public static final class c implements com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c f166727a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f166728b;

        /* renamed from: c, reason: collision with root package name */
        public final u<z> f166729c;

        /* renamed from: d, reason: collision with root package name */
        public final j f166730d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f166731e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC47842z> f166732f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.h f166733g;

        /* renamed from: h, reason: collision with root package name */
        public final q f166734h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC28481c> f166735i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f166736j;

        /* renamed from: k, reason: collision with root package name */
        public final l f166737k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.g f166738l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f166739m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.e f166740n;

        /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C4954a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c f166741a;

            public C4954a(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar) {
                this.f166741a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f166741a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f166742a;

            public b(cv.b bVar) {
                this.f166742a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f166742a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C4955c implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c f166743a;

            public C4955c(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar) {
                this.f166743a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f166743a.d0();
            }
        }

        /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
        public static final class d implements u<z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c f166744a;

            public d(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar) {
                this.f166744a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                z zVarA = this.f166744a.A();
                t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerIacFinishedMicRequestScreenComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c f166745a;

            public e(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar) {
                this.f166745a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f166745a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar, cv.b bVar, Fragment fragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument, C4953a c4953a) {
            this.f166727a = cVar;
            this.f166728b = bVar;
            d dVar = new d(cVar);
            this.f166730d = new j(dVar);
            C4954a c4954a = new C4954a(cVar);
            this.f166733g = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.h(dVar, c4954a, new C4955c(cVar));
            this.f166734h = new q(c4954a);
            this.f166735i = new e(cVar);
            this.f166736j = dagger.internal.g.d(new h(l.a(rVar), this.f166735i));
            this.f166737k = l.a(iacFinishedMicRequestScreenArgument);
            this.f166738l = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.g(new o(this.f166730d, this.f166733g, com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.l.a(), this.f166734h, this.f166736j, this.f166737k));
            this.f166739m = new b(bVar);
            this.f166740n = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.e(l.a(resources), this.f166739m);
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.b
        public final void a(IacFinishedMicRequestScreenFragment iacFinishedMicRequestScreenFragment) {
            iacFinishedMicRequestScreenFragment.f166699n0 = this.f166738l;
            iacFinishedMicRequestScreenFragment.f166701p0 = this.f166736j.get();
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.c cVar = this.f166727a;
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view.a aVarCm = cVar.cm();
            t.c(aVarCm);
            iacFinishedMicRequestScreenFragment.f166702q0 = aVarCm;
            iacFinishedMicRequestScreenFragment.f166703r0 = cVar.h();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f166728b.u4();
            t.c(aVarU4);
            iacFinishedMicRequestScreenFragment.f166704s0 = aVarU4;
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.e eVar = this.f166740n;
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di.d.f166746a.getClass();
            iacFinishedMicRequestScreenFragment.f166705t0 = (com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.c) eVar.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
