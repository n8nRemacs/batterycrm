package com.avito.android.profile_phones.add_phone.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.module.C30060h5;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.profile_phones.add_phone.AddPhoneFragment;
import com.avito.android.profile_phones.add_phone.di.a;
import com.avito.android.profile_phones.add_phone.mvi.k;
import com.avito.android.profile_phones.add_phone.mvi.m;
import com.avito.android.profile_phones.add_phone.mvi.o;
import com.avito.android.profile_phones.add_phone.n;
import com.avito.android.profile_phones.add_phone.q;
import com.avito.android.profile_phones.add_phone.s;
import com.avito.android.remote.A1;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.O3;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import xb0.C49921c;
import xb0.InterfaceC49919a;

/* compiled from: DaggerAddPhoneComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class h {

    /* compiled from: DaggerAddPhoneComponent.java */
    public static final class b implements com.avito.android.profile_phones.add_phone.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile_phones.add_phone.di.b f226837a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f226838b;

        /* renamed from: c, reason: collision with root package name */
        public final u<r> f226839c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f226840d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f226841e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> f226842f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.d f226843g;

        /* renamed from: h, reason: collision with root package name */
        public final u<A1> f226844h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.profile_phones.validation.c f226845i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC34401z0> f226846j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.profile_phones.validation.f f226847k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.profile_phones.add_phone.raw_phones_list.a> f226848l;

        /* renamed from: m, reason: collision with root package name */
        public final u<n> f226849m;

        /* renamed from: n, reason: collision with root package name */
        public final l f226850n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.profile_phones.add_phone.mvi.h f226851o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC49919a> f226852p;

        /* renamed from: q, reason: collision with root package name */
        public final u<E> f226853q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f226854r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.profile_phones.add_phone.mvi.f f226855s;

        /* renamed from: t, reason: collision with root package name */
        public final m f226856t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC28481c> f226857u;

        /* renamed from: v, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f226858v;

        /* renamed from: w, reason: collision with root package name */
        public final s f226859w;

        /* renamed from: x, reason: collision with root package name */
        public final l f226860x;

        /* renamed from: y, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f226861y;

        /* renamed from: z, reason: collision with root package name */
        public final u<InterfaceC30274a> f226862z;

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226863a;

            public a(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226863a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f226863a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        /* renamed from: com.avito.android.profile_phones.add_phone.di.h$b$b, reason: collision with other inner class name */
        public static final class C6887b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226864a;

            public C6887b(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226864a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f226864a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class c implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226865a;

            public c(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226865a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f226865a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f226866a;

            public d(cv.b bVar) {
                this.f226866a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f226866a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class e implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226867a;

            public e(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226867a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f226867a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226868a;

            public f(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226868a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f226868a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226869a;

            public g(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226869a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f226869a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        /* renamed from: com.avito.android.profile_phones.add_phone.di.h$b$h, reason: collision with other inner class name */
        public static final class C6888h implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226870a;

            public C6888h(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226870a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f226870a.o3();
            }
        }

        /* compiled from: DaggerAddPhoneComponent.java */
        public static final class i implements u<A1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.profile_phones.add_phone.di.b f226871a;

            public i(com.avito.android.profile_phones.add_phone.di.b bVar) {
                this.f226871a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                A1 a1S0 = this.f226871a.s0();
                t.c(a1S0);
                return a1S0;
            }
        }

        public b(com.avito.android.profile_phones.add_phone.di.b bVar, cv.b bVar2, String str, Resources resources, Activity activity, com.avito.android.analytics.screens.r rVar, a aVar) {
            this.f226837a = bVar;
            this.f226838b = new d(bVar2);
            this.f226839c = new c(bVar);
            this.f226840d = new f(bVar);
            this.f226841e = new C6888h(bVar);
            u<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> uVarD = dagger.internal.g.d(new com.avito.android.code_confirmation.code_confirmation.phone_confirm.h(l.a(resources)));
            this.f226842f = uVarD;
            u<r> uVar = this.f226839c;
            u<InterfaceC35745a5> uVar2 = this.f226840d;
            u<com.avito.android.remote.error.f> uVar3 = this.f226841e;
            this.f226843g = new com.avito.android.code_confirmation.code_confirmation.phone_confirm.d(uVar, uVar2, uVar3, uVarD);
            this.f226845i = new com.avito.android.profile_phones.validation.c(new i(bVar), uVar2, uVar3);
            e eVar = new e(bVar);
            this.f226847k = new com.avito.android.profile_phones.validation.f(eVar, uVar2, uVar3);
            u<com.avito.android.profile_phones.add_phone.raw_phones_list.a> uVarD2 = dagger.internal.g.d(new com.avito.android.profile_phones.add_phone.raw_phones_list.c(eVar));
            this.f226848l = uVarD2;
            this.f226849m = dagger.internal.g.d(new q(this.f226843g, this.f226845i, this.f226847k, uVarD2));
            l lVarB = l.b(str);
            this.f226850n = lVarB;
            this.f226851o = new com.avito.android.profile_phones.add_phone.mvi.h(lVarB, this.f226838b, this.f226849m);
            u<InterfaceC49919a> uVarD3 = dagger.internal.g.d(new C49921c(O3.f318703a));
            this.f226852p = uVarD3;
            a aVar2 = new a(bVar);
            C6887b c6887b = new C6887b(bVar);
            this.f226855s = new com.avito.android.profile_phones.add_phone.mvi.f(this.f226850n, uVarD3, this.f226849m, this.f226842f, aVar2, c6887b);
            this.f226856t = new m(this.f226838b);
            this.f226857u = new g(bVar);
            this.f226858v = dagger.internal.g.d(new C30060h5(this.f226857u, new com.avito.android.profile_phones.add_phone.di.f(l.a(rVar))));
            this.f226859w = new s(new k(this.f226851o, this.f226855s, this.f226856t, o.a(), this.f226858v));
            l lVarA = l.a(activity);
            this.f226860x = lVarA;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA));
            this.f226861y = uVarA;
            this.f226862z = B.a(new com.avito.android.dialog.o(uVarA, this.f226860x));
        }

        @Override // com.avito.android.profile_phones.add_phone.di.a
        public final void a(AddPhoneFragment addPhoneFragment) {
            addPhoneFragment.f226810u0 = this.f226859w;
            addPhoneFragment.f226812w0 = this.f226858v.get();
            com.avito.android.profile_phones.add_phone.di.b bVar = this.f226837a;
            addPhoneFragment.f226813x0 = bVar.p3();
            addPhoneFragment.f226814y0 = bVar.T3();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            addPhoneFragment.f226815z0 = interfaceC28373aA;
            addPhoneFragment.f226798A0 = this.f226862z.get();
        }
    }

    /* compiled from: DaggerAddPhoneComponent.java */
    public static final class c implements a.InterfaceC6886a {
        public c() {
        }

        @Override // com.avito.android.profile_phones.add_phone.di.a.InterfaceC6886a
        public final com.avito.android.profile_phones.add_phone.di.a a(com.avito.android.profile_phones.add_phone.di.b bVar, InterfaceC39417a interfaceC39417a, String str, Resources resources, ActivityC22955m activityC22955m, com.avito.android.analytics.screens.r rVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, str, resources, activityC22955m, rVar, null);
        }
    }

    public static a.InterfaceC6886a a() {
        return new c();
    }
}
