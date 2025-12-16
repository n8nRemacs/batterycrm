package com.avito.android.code_confirmation.phone_management.di;

import Sm0.C15204c;
import android.app.Activity;
import android.content.res.Resources;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.C29405s;
import com.avito.android.code_confirmation.code_confirmation.InterfaceC29394g;
import com.avito.android.code_confirmation.code_confirmation.W;
import com.avito.android.code_confirmation.code_confirmation.Y;
import com.avito.android.code_confirmation.phone_management.PhoneManagementActivity;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.code_confirmation.phone_management.di.b;
import com.avito.android.code_confirmation.phone_management.g;
import com.avito.android.code_confirmation.phone_management.i;
import com.avito.android.code_confirmation.phone_management.j;
import com.avito.android.code_confirmation.phone_management.x;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.dialog.o;
import com.avito.android.remote.error.f;
import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.S3;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPhoneManagementComponent.java */
@e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerPhoneManagementComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.code_confirmation.phone_management.di.b.a
        public final com.avito.android.code_confirmation.phone_management.di.b a(com.avito.android.code_confirmation.phone_management.di.c cVar, InterfaceC39417a interfaceC39417a, Resources resources, PhoneManagementActivity phoneManagementActivity, Kundle kundle, PhoneManagementIntentFactory.CallSource callSource, CodeConfirmationSource codeConfirmationSource) {
            interfaceC39417a.getClass();
            callSource.getClass();
            return new c(cVar, interfaceC39417a, resources, phoneManagementActivity, kundle, callSource, codeConfirmationSource, Boolean.FALSE, null);
        }
    }

    /* compiled from: DaggerPhoneManagementComponent.java */
    public static final class c implements com.avito.android.code_confirmation.phone_management.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.code_confirmation.phone_management.di.c f119668a;

        /* renamed from: b, reason: collision with root package name */
        public final u<r> f119669b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f119670c;

        /* renamed from: d, reason: collision with root package name */
        public final l f119671d;

        /* renamed from: e, reason: collision with root package name */
        public final u<W> f119672e;

        /* renamed from: f, reason: collision with root package name */
        public final u<f> f119673f;

        /* renamed from: g, reason: collision with root package name */
        public final l f119674g;

        /* renamed from: h, reason: collision with root package name */
        public final l f119675h;

        /* renamed from: i, reason: collision with root package name */
        public final u<InterfaceC29394g> f119676i;

        /* renamed from: j, reason: collision with root package name */
        public final u<g> f119677j;

        /* renamed from: k, reason: collision with root package name */
        public final C15204c f119678k;

        /* renamed from: l, reason: collision with root package name */
        public final l f119679l;

        /* renamed from: m, reason: collision with root package name */
        public final l f119680m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.lib.deprecated_design.dialog.a> f119681n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC30274a> f119682o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f119683p;

        /* renamed from: q, reason: collision with root package name */
        public final u<j> f119684q;

        /* compiled from: DaggerPhoneManagementComponent.java */
        /* renamed from: com.avito.android.code_confirmation.phone_management.di.a$c$a, reason: collision with other inner class name */
        public static final class C3513a implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.phone_management.di.c f119685a;

            public C3513a(com.avito.android.code_confirmation.phone_management.di.c cVar) {
                this.f119685a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f119685a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerPhoneManagementComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f119686a;

            public b(cv.b bVar) {
                this.f119686a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f119686a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPhoneManagementComponent.java */
        /* renamed from: com.avito.android.code_confirmation.phone_management.di.a$c$c, reason: collision with other inner class name */
        public static final class C3514c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.phone_management.di.c f119687a;

            public C3514c(com.avito.android.code_confirmation.phone_management.di.c cVar) {
                this.f119687a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f119687a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPhoneManagementComponent.java */
        public static final class d implements u<f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.code_confirmation.phone_management.di.c f119688a;

            public d(com.avito.android.code_confirmation.phone_management.di.c cVar) {
                this.f119688a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f119688a.o();
            }
        }

        public c(com.avito.android.code_confirmation.phone_management.di.c cVar, cv.b bVar, Resources resources, Activity activity, Kundle kundle, PhoneManagementIntentFactory.CallSource callSource, CodeConfirmationSource codeConfirmationSource, Boolean bool, C3512a c3512a) {
            this.f119668a = cVar;
            this.f119669b = new C3513a(cVar);
            this.f119670c = new C3514c(cVar);
            l lVarA = l.a(resources);
            this.f119671d = lVarA;
            this.f119672e = B.a(new Y(lVarA, S3.f318734a));
            this.f119673f = new d(cVar);
            this.f119674g = l.a(bool);
            l lVarA2 = l.a(codeConfirmationSource);
            this.f119675h = lVarA2;
            u<InterfaceC29394g> uVarD = dagger.internal.g.d(new C29405s(this.f119669b, this.f119670c, this.f119672e, this.f119673f, this.f119674g, lVarA2));
            this.f119676i = uVarD;
            this.f119677j = dagger.internal.g.d(new i(uVarD));
            this.f119678k = new C15204c(this.f119671d);
            this.f119679l = l.a(callSource);
            l lVarA3 = l.a(activity);
            this.f119680m = lVarA3;
            u<com.avito.android.lib.deprecated_design.dialog.a> uVarA = B.a(new KU.b(lVarA3));
            this.f119681n = uVarA;
            this.f119682o = B.a(new o(uVarA, this.f119680m));
            this.f119683p = new b(bVar);
            this.f119684q = dagger.internal.g.d(new x(this.f119677j, this.f119678k, this.f119670c, this.f119679l, this.f119682o, this.f119675h, this.f119683p, l.b(kundle)));
        }

        @Override // com.avito.android.code_confirmation.phone_management.di.b
        public final void a(PhoneManagementActivity phoneManagementActivity) {
            phoneManagementActivity.f119660m = this.f119668a.a5();
            phoneManagementActivity.f119661n = this.f119684q.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
