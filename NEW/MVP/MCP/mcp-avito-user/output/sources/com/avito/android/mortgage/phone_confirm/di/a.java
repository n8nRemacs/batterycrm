package com.avito.android.mortgage.phone_confirm.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.phone_confirm.PhoneConfirmDialog;
import com.avito.android.mortgage.phone_confirm.di.b;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage.phone_confirm.mvi.f;
import com.avito.android.mortgage.phone_confirm.mvi.h;
import com.avito.android.mortgage.phone_confirm.mvi.j;
import com.avito.android.mortgage.phone_confirm.mvi.l;
import com.avito.android.mortgage.phone_confirm.w;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPhoneConfirmComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPhoneConfirmComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.mortgage.phone_confirm.di.b.a
        public final com.avito.android.mortgage.phone_confirm.di.b a(o oVar, C28478k c28478k, PhoneConfirmArguments phoneConfirmArguments) {
            return new c(oVar, c28478k, phoneConfirmArguments, null);
        }
    }

    /* compiled from: DaggerPhoneConfirmComponent.java */
    public static final class c implements com.avito.android.mortgage.phone_confirm.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.mortgage.domain.check_access.b> f201543a;

        /* renamed from: b, reason: collision with root package name */
        public final u<IZ.a> f201544b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f201545c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.mortgage.phone_confirm.mvi.domain.a> f201546d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.mortgage.phone_confirm.mvi.domain.d> f201547e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.mortgage.phone_confirm.mvi.d f201548f;

        /* renamed from: g, reason: collision with root package name */
        public final f f201549g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28373a> f201550h;

        /* renamed from: i, reason: collision with root package name */
        public final u<I00.a> f201551i;

        /* renamed from: j, reason: collision with root package name */
        public final l f201552j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f201553k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f201554l;

        /* renamed from: m, reason: collision with root package name */
        public final w f201555m;

        /* compiled from: DaggerPhoneConfirmComponent.java */
        /* renamed from: com.avito.android.mortgage.phone_confirm.di.a$c$a, reason: collision with other inner class name */
        public static final class C5974a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201556a;

            public C5974a(o oVar) {
                this.f201556a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f201556a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPhoneConfirmComponent.java */
        public static final class b implements u<com.avito.android.mortgage.domain.check_access.b> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201557a;

            public b(o oVar) {
                this.f201557a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f201557a.O5();
            }
        }

        /* compiled from: DaggerPhoneConfirmComponent.java */
        /* renamed from: com.avito.android.mortgage.phone_confirm.di.a$c$c, reason: collision with other inner class name */
        public static final class C5975c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201558a;

            public C5975c(o oVar) {
                this.f201558a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f201558a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerPhoneConfirmComponent.java */
        public static final class d implements u<IZ.a> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201559a;

            public d(o oVar) {
                this.f201559a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                IZ.a aVarLc = this.f201559a.lc();
                t.c(aVarLc);
                return aVarLc;
            }
        }

        /* compiled from: DaggerPhoneConfirmComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final o f201560a;

            public e(o oVar) {
                this.f201560a = oVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f201560a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(o oVar, C28478k c28478k, PhoneConfirmArguments phoneConfirmArguments, C5973a c5973a) {
            this.f201543a = new b(oVar);
            d dVar = new d(oVar);
            C5975c c5975c = new C5975c(oVar);
            this.f201545c = c5975c;
            this.f201546d = g.d(new com.avito.android.mortgage.phone_confirm.mvi.domain.c(dVar, c5975c));
            u<com.avito.android.mortgage.phone_confirm.mvi.domain.d> uVarD = g.d(com.avito.android.mortgage.phone_confirm.mvi.domain.e.a());
            this.f201547e = uVarD;
            this.f201548f = new com.avito.android.mortgage.phone_confirm.mvi.d(uVarD, this.f201543a, this.f201546d, this.f201545c);
            this.f201549g = new f(dagger.internal.l.a(phoneConfirmArguments), this.f201547e);
            u<I00.a> uVarD2 = g.d(new I00.c(new C5974a(oVar)));
            this.f201551i = uVarD2;
            this.f201552j = new l(uVarD2);
            this.f201553k = new e(oVar);
            this.f201554l = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f201553k);
            this.f201555m = new w(new h(this.f201548f, this.f201549g, j.a(), this.f201552j, this.f201554l));
        }

        @Override // com.avito.android.mortgage.phone_confirm.di.b
        public final void a(PhoneConfirmDialog phoneConfirmDialog) {
            phoneConfirmDialog.f201525h0 = this.f201555m;
            phoneConfirmDialog.f201527j0 = this.f201554l.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
