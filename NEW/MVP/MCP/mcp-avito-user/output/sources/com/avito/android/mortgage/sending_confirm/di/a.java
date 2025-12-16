package com.avito.android.mortgage.sending_confirm.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.sending_confirm.SendingConfirmDialog;
import com.avito.android.mortgage.sending_confirm.di.b;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.mortgage.sending_confirm.mvi.f;
import com.avito.android.mortgage.sending_confirm.mvi.h;
import com.avito.android.mortgage.sending_confirm.mvi.j;
import com.avito.android.mortgage.sending_confirm.p;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSendingConfirmComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerSendingConfirmComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.sending_confirm.di.b.a
        public final com.avito.android.mortgage.sending_confirm.di.b a(o oVar, C28478k c28478k, SendingConfirmArguments sendingConfirmArguments) {
            return new c(oVar, c28478k, sendingConfirmArguments, null);
        }
    }

    /* compiled from: DaggerSendingConfirmComponent.java */
    public static final class c implements com.avito.android.mortgage.sending_confirm.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<IZ.a> f203519a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f203520b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.mortgage.sending_confirm.mvi.domain.a> f203521c;

        /* renamed from: d, reason: collision with root package name */
        public final com.avito.android.mortgage.sending_confirm.mvi.b f203522d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.mortgage.sending_confirm.mvi.d f203523e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f203524f;

        /* renamed from: g, reason: collision with root package name */
        public final j f203525g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f203526h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f203527i;

        /* renamed from: j, reason: collision with root package name */
        public final p f203528j;

        /* compiled from: DaggerSendingConfirmComponent.java */
        /* renamed from: com.avito.android.mortgage.sending_confirm.di.a$c$a, reason: collision with other inner class name */
        public static final class C6063a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203529a;

            public C6063a(o oVar) {
                this.f203529a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f203529a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSendingConfirmComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203530a;

            public b(o oVar) {
                this.f203530a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f203530a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerSendingConfirmComponent.java */
        /* renamed from: com.avito.android.mortgage.sending_confirm.di.a$c$c, reason: collision with other inner class name */
        public static final class C6064c implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203531a;

            public C6064c(o oVar) {
                this.f203531a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f203531a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerSendingConfirmComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f203532a;

            public d(o oVar) {
                this.f203532a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f203532a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, SendingConfirmArguments sendingConfirmArguments, C6062a c6062a) {
            u<com.avito.android.mortgage.sending_confirm.mvi.domain.a> uVarD = g.d(new com.avito.android.mortgage.sending_confirm.mvi.domain.c(new C6064c(oVar), new b(oVar)));
            this.f203521c = uVarD;
            this.f203522d = new com.avito.android.mortgage.sending_confirm.mvi.b(uVarD);
            this.f203523e = new com.avito.android.mortgage.sending_confirm.mvi.d(l.a(sendingConfirmArguments));
            this.f203525g = new j(new l10.c(new C6063a(oVar)));
            this.f203526h = new d(oVar);
            this.f203527i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f203526h);
            this.f203528j = new p(new f(this.f203522d, this.f203523e, h.a(), this.f203525g, this.f203527i));
        }

        @Override // com.avito.android.mortgage.sending_confirm.di.b
        public final void a(SendingConfirmDialog sendingConfirmDialog) {
            sendingConfirmDialog.f203485h0 = this.f203528j;
            sendingConfirmDialog.f203487j0 = this.f203527i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
