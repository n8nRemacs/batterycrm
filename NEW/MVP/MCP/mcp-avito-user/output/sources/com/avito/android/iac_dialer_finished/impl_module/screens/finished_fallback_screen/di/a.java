package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.IacFinishedFallbackScreenFragment;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.e;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.f;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.k;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.m;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.o;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument;
import com.avito.android.util.S3;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b.a
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar, InterfaceC39417a interfaceC39417a) {
            iacFinishedFallbackScreenArgument.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, iacFinishedFallbackScreenFragment, activityC22955m, resources, rVar, iacFinishedFallbackScreenArgument, null);
        }
    }

    /* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
    public static final class c implements com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f166555a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c f166556b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f166557c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f166558d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f166559e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C29640d> f166560f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.f f166561g;

        /* renamed from: h, reason: collision with root package name */
        public final m f166562h;

        /* renamed from: i, reason: collision with root package name */
        public final l f166563i;

        /* renamed from: j, reason: collision with root package name */
        public final l f166564j;

        /* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C4948a implements u<C29640d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c f166565a;

            public C4948a(com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar) {
                this.f166565a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f166565a.Q();
            }
        }

        /* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c f166566a;

            public b(com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar) {
                this.f166566a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f166566a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIacFinishedFallbackScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C4949c implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c f166567a;

            public C4949c(com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar) {
                this.f166567a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f166567a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.c cVar, cv.b bVar, Fragment fragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument, C4947a c4947a) {
            this.f166555a = bVar;
            this.f166556b = cVar;
            this.f166557c = new C4949c(cVar);
            this.f166558d = dagger.internal.g.d(new i(l.a(rVar), this.f166557c));
            b bVar2 = new b(cVar);
            C4948a c4948a = new C4948a(cVar);
            e eVar = e.a.f166569a;
            this.f166561g = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.f(bVar2, eVar, f.a.f166570a, c4948a);
            this.f166562h = new m(eVar);
            this.f166563i = l.a(iacFinishedFallbackScreenArgument);
            this.f166564j = l.a(new com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.d(new com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.c(new k(this.f166561g, this.f166562h, o.a(), this.f166558d, this.f166563i, com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.h.a()))));
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.di.b
        public final void a(IacFinishedFallbackScreenFragment iacFinishedFallbackScreenFragment) {
            iacFinishedFallbackScreenFragment.f166523n0 = this.f166558d.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f166555a.u4();
            t.c(aVarU4);
            iacFinishedFallbackScreenFragment.f166524o0 = aVarU4;
            S3.a();
            iacFinishedFallbackScreenFragment.f166525p0 = (b.a) this.f166564j.f393949a;
            com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.view.a aVarMh = this.f166556b.mh();
            t.c(aVarMh);
            iacFinishedFallbackScreenFragment.f166526q0 = aVarMh;
        }
    }

    public static b.a a() {
        return new b();
    }
}
