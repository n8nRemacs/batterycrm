package com.avito.android.email.email_confirmation.di;

import Gy.InterfaceC13928a;
import androidx.fragment.app.Fragment;
import com.avito.android.account.G;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.email.email_confirmation.EmailConfirmationFragment;
import com.avito.android.email.email_confirmation.di.b;
import com.avito.android.email.email_confirmation.mvi.h;
import com.avito.android.email.email_confirmation.mvi.j;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEmailConfirmationComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEmailConfirmationComponent.java */
    public static final class b implements com.avito.android.email.email_confirmation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f147107a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC13928a> f147108b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34401z0> f147109c;

        /* renamed from: d, reason: collision with root package name */
        public final u<G> f147110d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f147111e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.email.email_confirmation.mvi.e f147112f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f147113g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f147114h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.email.email_confirmation.e f147115i;

        /* compiled from: DaggerEmailConfirmationComponent.java */
        /* renamed from: com.avito.android.email.email_confirmation.di.a$b$a, reason: collision with other inner class name */
        public static final class C4284a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_confirmation.di.c f147116a;

            public C4284a(com.avito.android.email.email_confirmation.di.c cVar) {
                this.f147116a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f147116a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerEmailConfirmationComponent.java */
        /* renamed from: com.avito.android.email.email_confirmation.di.a$b$b, reason: collision with other inner class name */
        public static final class C4285b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_confirmation.di.c f147117a;

            public C4285b(com.avito.android.email.email_confirmation.di.c cVar) {
                this.f147117a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f147117a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEmailConfirmationComponent.java */
        public static final class c implements u<InterfaceC13928a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_confirmation.di.c f147118a;

            public c(com.avito.android.email.email_confirmation.di.c cVar) {
                this.f147118a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13928a interfaceC13928aO5 = this.f147118a.o5();
                t.c(interfaceC13928aO5);
                return interfaceC13928aO5;
            }
        }

        /* compiled from: DaggerEmailConfirmationComponent.java */
        public static final class d implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_confirmation.di.c f147119a;

            public d(com.avito.android.email.email_confirmation.di.c cVar) {
                this.f147119a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f147119a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerEmailConfirmationComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_confirmation.di.c f147120a;

            public e(com.avito.android.email.email_confirmation.di.c cVar) {
                this.f147120a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f147120a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.email.email_confirmation.di.c cVar, Fragment fragment, C28478k c28478k, Boolean bool, String str, C4283a c4283a) {
            this.f147107a = l.a(bool);
            this.f147112f = new com.avito.android.email.email_confirmation.mvi.e(this.f147107a, l.a(str), new c(cVar), new d(cVar), new C4284a(cVar), new C4285b(cVar));
            this.f147113g = new e(cVar);
            this.f147114h = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f147113g);
            this.f147115i = new com.avito.android.email.email_confirmation.e(new h(this.f147112f, j.a(), com.avito.android.email.email_confirmation.mvi.l.a(), this.f147114h));
        }

        @Override // com.avito.android.email.email_confirmation.di.b
        public final void a(EmailConfirmationFragment emailConfirmationFragment) {
            emailConfirmationFragment.f147078n0 = this.f147115i;
            emailConfirmationFragment.f147080p0 = this.f147114h.get();
        }
    }

    /* compiled from: DaggerEmailConfirmationComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.email.email_confirmation.di.b.a
        public final com.avito.android.email.email_confirmation.di.b a(com.avito.android.email.email_confirmation.di.c cVar, EmailConfirmationFragment emailConfirmationFragment, C28478k c28478k, boolean z12, String str) {
            return new b(cVar, emailConfirmationFragment, c28478k, Boolean.valueOf(z12), str, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
