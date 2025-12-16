package com.avito.android.phone_confirmation.di;

import android.app.Activity;
import com.avito.android.phone_confirmation.PhoneConfirmationActivity;
import com.avito.android.phone_confirmation.U;
import com.avito.android.phone_confirmation.Z;
import com.avito.android.phone_confirmation.b0;
import com.avito.android.phone_confirmation.di.b;
import com.avito.android.phone_confirmation.state.PhoneConfirmationScreenState;
import com.avito.android.remote.r;
import com.avito.android.server_time.f;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.S3;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import s70.InterfaceC48008b;

/* compiled from: DaggerPhoneConfirmationComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPhoneConfirmationComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.phone_confirmation.di.c f215908a;

        /* renamed from: b, reason: collision with root package name */
        public PhoneConfirmationActivity f215909b;

        /* renamed from: c, reason: collision with root package name */
        public PhoneConfirmationScreenState f215910c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f215911d;

        public b() {
        }

        @Override // com.avito.android.phone_confirmation.di.b.a
        public final b.a a(PhoneConfirmationActivity phoneConfirmationActivity) {
            this.f215909b = phoneConfirmationActivity;
            return this;
        }

        @Override // com.avito.android.phone_confirmation.di.b.a
        public final b.a b(com.avito.android.phone_confirmation.di.c cVar) {
            this.f215908a = cVar;
            return this;
        }

        @Override // com.avito.android.phone_confirmation.di.b.a
        public final com.avito.android.phone_confirmation.di.b build() {
            t.a(com.avito.android.phone_confirmation.di.c.class, this.f215908a);
            t.a(Activity.class, this.f215909b);
            t.a(PhoneConfirmationScreenState.class, this.f215910c);
            t.a(Boolean.class, this.f215911d);
            return new c(new d(), this.f215908a, this.f215909b, this.f215910c, this.f215911d, null);
        }

        @Override // com.avito.android.phone_confirmation.di.b.a
        public final b.a c(boolean z12) {
            this.f215911d = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.phone_confirmation.di.b.a
        public final b.a d(PhoneConfirmationScreenState phoneConfirmationScreenState) {
            this.f215910c = phoneConfirmationScreenState;
            return this;
        }
    }

    /* compiled from: DaggerPhoneConfirmationComponent.java */
    public static final class c implements com.avito.android.phone_confirmation.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.phone_confirmation.di.c f215912a;

        /* renamed from: b, reason: collision with root package name */
        public final l f215913b;

        /* renamed from: c, reason: collision with root package name */
        public final u<r> f215914c;

        /* renamed from: d, reason: collision with root package name */
        public final u<f> f215915d;

        /* renamed from: e, reason: collision with root package name */
        public final u<AK0.l> f215916e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC48008b> f215917f;

        /* renamed from: g, reason: collision with root package name */
        public final u<U> f215918g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Z> f215919h;

        /* compiled from: DaggerPhoneConfirmationComponent.java */
        /* renamed from: com.avito.android.phone_confirmation.di.a$c$a, reason: collision with other inner class name */
        public static final class C6476a implements u<r> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_confirmation.di.c f215920a;

            public C6476a(com.avito.android.phone_confirmation.di.c cVar) {
                this.f215920a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                r rVarK0 = this.f215920a.K0();
                t.c(rVarK0);
                return rVarK0;
            }
        }

        /* compiled from: DaggerPhoneConfirmationComponent.java */
        public static final class b implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_confirmation.di.c f215921a;

            public b(com.avito.android.phone_confirmation.di.c cVar) {
                this.f215921a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f215921a.r();
            }
        }

        /* compiled from: DaggerPhoneConfirmationComponent.java */
        /* renamed from: com.avito.android.phone_confirmation.di.a$c$c, reason: collision with other inner class name */
        public static final class C6477c implements u<f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.phone_confirmation.di.c f215922a;

            public C6477c(com.avito.android.phone_confirmation.di.c cVar) {
                this.f215922a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                f fVarL = this.f215922a.l();
                t.c(fVarL);
                return fVarL;
            }
        }

        public c(d dVar, com.avito.android.phone_confirmation.di.c cVar, Activity activity, PhoneConfirmationScreenState phoneConfirmationScreenState, Boolean bool, C6475a c6475a) {
            this.f215912a = cVar;
            this.f215913b = l.a(bool);
            this.f215914c = new C6476a(cVar);
            this.f215915d = new C6477c(cVar);
            this.f215917f = g.d(new s70.d(new b(cVar)));
            this.f215918g = g.d(new e(dVar, this.f215913b, this.f215914c, this.f215915d, this.f215917f, l.a(phoneConfirmationScreenState), S3.f318734a));
            this.f215919h = g.d(new b0(l.a(activity)));
        }

        @Override // com.avito.android.phone_confirmation.di.b
        public final void a(PhoneConfirmationActivity phoneConfirmationActivity) {
            phoneConfirmationActivity.f215876m = this.f215918g.get();
            phoneConfirmationActivity.f215877n = this.f215919h.get();
            com.avito.android.phone_confirmation.di.c cVar = this.f215912a;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            phoneConfirmationActivity.f215878o = interfaceC35745a5D;
            C cJ2 = cVar.j();
            t.c(cJ2);
            phoneConfirmationActivity.f215879p = cJ2;
        }
    }

    public static b.a a() {
        return new b();
    }
}
