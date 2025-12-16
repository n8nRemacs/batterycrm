package com.avito.android.safety.tfa_disable_password;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.tfa_disable_password.b;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSafetySettingsTfaDisablePasswordComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSafetySettingsTfaDisablePasswordComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerSafetySettingsTfaDisablePasswordComponent.java */
    public static final class c implements com.avito.android.safety.tfa_disable_password.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safety.tfa_disable_password.c f258089a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.safety.tfa_disable_password.mvi.e f258090b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.safety.safety_settings.domain.d> f258091c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.safety.tfa_disable_password.mvi.c f258092d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f258093e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f258094f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f258095g;

        /* renamed from: h, reason: collision with root package name */
        public final n f258096h;

        /* compiled from: DaggerSafetySettingsTfaDisablePasswordComponent.java */
        /* renamed from: com.avito.android.safety.tfa_disable_password.a$c$a, reason: collision with other inner class name */
        public static final class C7748a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.tfa_disable_password.c f258097a;

            public C7748a(com.avito.android.safety.tfa_disable_password.c cVar) {
                this.f258097a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f258097a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerSafetySettingsTfaDisablePasswordComponent.java */
        public static final class b implements u<com.avito.android.safety.safety_settings.domain.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.tfa_disable_password.c f258098a;

            public b(com.avito.android.safety.tfa_disable_password.c cVar) {
                this.f258098a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f258098a.L8();
            }
        }

        public c(com.avito.android.safety.tfa_disable_password.c cVar, r rVar, Fragment fragment, Boolean bool, C7747a c7747a) {
            this.f258089a = cVar;
            this.f258090b = new com.avito.android.safety.tfa_disable_password.mvi.e(dagger.internal.l.a(bool));
            this.f258092d = new com.avito.android.safety.tfa_disable_password.mvi.c(new b(cVar));
            this.f258093e = new C7748a(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new e(dagger.internal.l.a(rVar)));
            this.f258094f = uVarD;
            this.f258095g = com.avito.android.advert.item.delivery_suggests.l.i(this.f258093e, uVarD);
            this.f258096h = new n(new com.avito.android.safety.tfa_disable_password.mvi.h(this.f258090b, this.f258092d, com.avito.android.safety.tfa_disable_password.mvi.j.a(), com.avito.android.safety.tfa_disable_password.mvi.l.a(), this.f258095g));
        }
    }
}
