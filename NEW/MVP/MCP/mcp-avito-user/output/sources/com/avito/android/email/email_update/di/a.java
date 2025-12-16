package com.avito.android.email.email_update.di;

import Gy.InterfaceC13928a;
import android.content.res.Resources;
import com.avito.android.account.G;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.email.email_update.EmailUpdateFragment;
import com.avito.android.email.email_update.di.b;
import com.avito.android.email.email_update.i;
import com.avito.android.email.email_update.mvi.g;
import com.avito.android.email.email_update.mvi.j;
import com.avito.android.email.email_update.mvi.n;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEmailUpdateComponent.java */
@e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerEmailUpdateComponent.java */
    public static final class b implements com.avito.android.email.email_update.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC34401z0> f147174a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f147175b;

        /* renamed from: c, reason: collision with root package name */
        public final g f147176c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC13928a> f147177d;

        /* renamed from: e, reason: collision with root package name */
        public final u<G> f147178e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.email.email_update.mvi.e f147179f;

        /* renamed from: g, reason: collision with root package name */
        public final n f147180g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f147181h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f147182i;

        /* renamed from: j, reason: collision with root package name */
        public final i f147183j;

        /* compiled from: DaggerEmailUpdateComponent.java */
        /* renamed from: com.avito.android.email.email_update.di.a$b$a, reason: collision with other inner class name */
        public static final class C4287a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_update.di.c f147184a;

            public C4287a(com.avito.android.email.email_update.di.c cVar) {
                this.f147184a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f147184a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerEmailUpdateComponent.java */
        /* renamed from: com.avito.android.email.email_update.di.a$b$b, reason: collision with other inner class name */
        public static final class C4288b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_update.di.c f147185a;

            public C4288b(com.avito.android.email.email_update.di.c cVar) {
                this.f147185a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f147185a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEmailUpdateComponent.java */
        public static final class c implements u<InterfaceC13928a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_update.di.c f147186a;

            public c(com.avito.android.email.email_update.di.c cVar) {
                this.f147186a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC13928a interfaceC13928aO5 = this.f147186a.o5();
                t.c(interfaceC13928aO5);
                return interfaceC13928aO5;
            }
        }

        /* compiled from: DaggerEmailUpdateComponent.java */
        public static final class d implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_update.di.c f147187a;

            public d(com.avito.android.email.email_update.di.c cVar) {
                this.f147187a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f147187a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerEmailUpdateComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.email.email_update.di.c f147188a;

            public e(com.avito.android.email.email_update.di.c cVar) {
                this.f147188a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f147188a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.email.email_update.di.c cVar, C28478k c28478k, Resources resources, C4286a c4286a) {
            d dVar = new d(cVar);
            C4288b c4288b = new C4288b(cVar);
            this.f147176c = new g(dVar, c4288b);
            this.f147179f = new com.avito.android.email.email_update.mvi.e(new c(cVar), dVar, new C4287a(cVar), c4288b);
            this.f147180g = new n(new com.avito.android.email.email_update.d(l.a(resources)));
            this.f147181h = new e(cVar);
            this.f147182i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f147181h);
            this.f147183j = new i(new j(this.f147176c, this.f147179f, com.avito.android.email.email_update.mvi.l.a(), this.f147180g, this.f147182i));
        }

        @Override // com.avito.android.email.email_update.di.b
        public final void a(EmailUpdateFragment emailUpdateFragment) {
            emailUpdateFragment.f147154n0 = this.f147183j;
            emailUpdateFragment.f147156p0 = this.f147182i.get();
        }
    }

    /* compiled from: DaggerEmailUpdateComponent.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.email.email_update.di.b.a
        public final com.avito.android.email.email_update.di.b a(com.avito.android.email.email_update.di.c cVar, C28478k c28478k, Resources resources) {
            return new b(cVar, c28478k, resources, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
