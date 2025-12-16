package com.avito.android.iac_dialer.impl_module.screens.call_screen.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.di.b;
import com.avito.android.permissions.z;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xK.InterfaceC49851a;

/* compiled from: DaggerIacCallScreenComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacCallScreenComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.screens.call_screen.di.b.a
        public final com.avito.android.iac_dialer.impl_module.screens.call_screen.di.b a(IacCallScreenFragment iacCallScreenFragment, ActivityC22955m activityC22955m, Resources resources, r rVar, com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, iacCallScreenFragment, activityC22955m, resources, rVar, null);
        }
    }

    /* compiled from: DaggerIacCallScreenComponent.java */
    public static final class c implements com.avito.android.iac_dialer.impl_module.screens.call_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c f166256a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f166257b;

        /* renamed from: c, reason: collision with root package name */
        public final Resources f166258c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f166259d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f166260e;

        /* compiled from: DaggerIacCallScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C4934a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c f166261a;

            public C4934a(com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c cVar) {
                this.f166261a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f166261a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c cVar, cv.b bVar, Fragment fragment, ActivityC22955m activityC22955m, Resources resources, r rVar, C4933a c4933a) {
            this.f166256a = cVar;
            this.f166257b = bVar;
            this.f166258c = resources;
            this.f166259d = new C4934a(cVar);
            this.f166260e = dagger.internal.g.d(new g(l.a(rVar), this.f166259d));
        }

        @Override // com.avito.android.iac_dialer.impl_module.screens.call_screen.di.b
        public final void a(IacCallScreenFragment iacCallScreenFragment) {
            iacCallScreenFragment.f166227n0 = this.f166260e.get();
            com.avito.android.iac_dialer.impl_module.screens.call_screen.di.c cVar = this.f166256a;
            com.avito.android.iac_dialer.impl_module.screens.call_screen.view.a aVarX8 = cVar.X8();
            t.c(aVarX8);
            iacCallScreenFragment.f166228o0 = aVarX8;
            InterfaceC49851a interfaceC49851aNe = cVar.Ne();
            t.c(interfaceC49851aNe);
            iacCallScreenFragment.f166229p0 = interfaceC49851aNe;
            cv.b bVar = this.f166257b;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            InterfaceC49851a interfaceC49851aNe2 = cVar.Ne();
            t.c(interfaceC49851aNe2);
            iacCallScreenFragment.f166230q0 = new com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b(aVarU4, interfaceC49851aNe2, this.f166258c);
            z zVarA = cVar.A();
            t.c(zVarA);
            iacCallScreenFragment.f166231r0 = zVarA;
            com.avito.android.deeplink_handler.handler.composite.a aVarU42 = bVar.u4();
            t.c(aVarU42);
            iacCallScreenFragment.f166232s0 = aVarU42;
        }
    }

    public static b.a a() {
        return new b();
    }
}
