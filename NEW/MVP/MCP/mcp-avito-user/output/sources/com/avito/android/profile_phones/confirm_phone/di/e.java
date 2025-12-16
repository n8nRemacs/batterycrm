package com.avito.android.profile_phones.confirm_phone.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.InterfaceC23487e;
import androidx.view.S0;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.profile_phones.confirm_phone.ConfirmPhoneFragment;
import com.avito.android.profile_phones.confirm_phone.di.a;
import com.avito.android.profile_phones.confirm_phone.k;
import com.avito.android.profile_phones.confirm_phone.n;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35745a5;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerConfirmPhoneComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class e {

    /* compiled from: DaggerConfirmPhoneComponent.java */
    public static final class b implements com.avito.android.profile_phones.confirm_phone.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile_phones.confirm_phone.di.b f227010a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f227011b;

        /* renamed from: c, reason: collision with root package name */
        public final l f227012c;

        /* renamed from: d, reason: collision with root package name */
        public final l f227013d;

        /* renamed from: e, reason: collision with root package name */
        public final u<r> f227014e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f227015f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f227016g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> f227017h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.d f227018i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC34401z0> f227019j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.profile_phones.validation.f f227020k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.confirm_phone.l> f227021l;

        /* renamed from: m, reason: collision with root package name */
        public final l f227022m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f227023n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC30274a> f227024o;

        /* compiled from: DaggerConfirmPhoneComponent.java */
        public static final class a implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.confirm_phone.di.b f227025a;

            public a(com.avito.android.profile_phones.confirm_phone.di.b bVar) {
                this.f227025a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f227025a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerConfirmPhoneComponent.java */
        /* renamed from: com.avito.android.profile_phones.confirm_phone.di.e$b$b, reason: collision with other inner class name */
        public static final class C6893b implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.confirm_phone.di.b f227026a;

            public C6893b(com.avito.android.profile_phones.confirm_phone.di.b bVar) {
                this.f227026a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f227026a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerConfirmPhoneComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.confirm_phone.di.b f227027a;

            public c(com.avito.android.profile_phones.confirm_phone.di.b bVar) {
                this.f227027a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f227027a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerConfirmPhoneComponent.java */
        public static final class d implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.confirm_phone.di.b f227028a;

            public d(com.avito.android.profile_phones.confirm_phone.di.b bVar) {
                this.f227028a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f227028a.o3();
            }
        }

        public b(com.avito.android.profile_phones.confirm_phone.di.c cVar, com.avito.android.profile_phones.confirm_phone.di.b bVar, cv.b bVar2, Activity activity, S0 s02, Resources resources, InterfaceC23487e interfaceC23487e, k kVar, a aVar) {
            this.f227010a = bVar;
            this.f227011b = bVar2;
            this.f227012c = l.a(s02);
            this.f227013d = l.a(kVar);
            this.f227014e = new a(bVar);
            this.f227015f = new c(bVar);
            this.f227016g = new d(bVar);
            u<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> uVarD = dagger.internal.g.d(new com.avito.android.code_confirmation.code_confirmation.phone_confirm.h(l.a(resources)));
            this.f227017h = uVarD;
            u<r> uVar = this.f227014e;
            u<InterfaceC35745a5> uVar2 = this.f227015f;
            u<com.avito.android.remote.error.f> uVar3 = this.f227016g;
            this.f227018i = new com.avito.android.code_confirmation.code_confirmation.phone_confirm.d(uVar, uVar2, uVar3, uVarD);
            this.f227020k = new com.avito.android.profile_phones.validation.f(new C6893b(bVar), uVar2, uVar3);
            this.f227021l = dagger.internal.g.d(new com.avito.android.profile_phones.confirm_phone.di.d(cVar, this.f227012c, new n(this.f227013d, this.f227018i, this.f227017h, this.f227020k, this.f227015f, l.a(interfaceC23487e))));
            l lVarA = l.a(activity);
            this.f227022m = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f227023n = uVarA;
            this.f227024o = B.a(new o(uVarA, this.f227022m));
        }

        @Override // com.avito.android.profile_phones.confirm_phone.di.a
        public final void a(ConfirmPhoneFragment confirmPhoneFragment) {
            com.avito.android.profile_phones.confirm_phone.di.b bVar = this.f227010a;
            com.google.android.gms.auth.api.phone.f fVarRb = bVar.rb();
            t.c(fVarRb);
            confirmPhoneFragment.f226984x0 = fVarRb;
            confirmPhoneFragment.f226985y0 = this.f227021l.get();
            confirmPhoneFragment.f226986z0 = bVar.p3();
            confirmPhoneFragment.f226970A0 = this.f227024o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f227011b.u4();
            t.c(aVarU4);
            confirmPhoneFragment.f226971B0 = aVarU4;
        }
    }

    /* compiled from: DaggerConfirmPhoneComponent.java */
    public static final class c implements a.InterfaceC6892a {
        public c() {
        }

        @Override // com.avito.android.profile_phones.confirm_phone.di.a.InterfaceC6892a
        public final com.avito.android.profile_phones.confirm_phone.di.a a(com.avito.android.profile_phones.confirm_phone.di.b bVar, InterfaceC39417a interfaceC39417a, ActivityC22955m activityC22955m, S0 s02, Resources resources, ConfirmPhoneFragment confirmPhoneFragment, k kVar) {
            interfaceC39417a.getClass();
            return new b(new com.avito.android.profile_phones.confirm_phone.di.c(), bVar, interfaceC39417a, activityC22955m, s02, resources, confirmPhoneFragment, kVar, null);
        }
    }

    public static a.InterfaceC6892a a() {
        return new c();
    }
}
