package com.avito.android.profile_phones.landline_verification.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationFragment;
import com.avito.android.profile_phones.landline_verification.di.b;
import com.avito.android.profile_phones.landline_verification.j;
import com.avito.android.profile_phones.landline_verification.m;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerLandlinePhoneVerificationComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerLandlinePhoneVerificationComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.profile_phones.landline_verification.di.c f227225a;

        public b() {
        }

        @Override // com.avito.android.profile_phones.landline_verification.di.b.a
        public final b.a a(com.avito.android.profile_phones.landline_verification.di.c cVar) {
            this.f227225a = cVar;
            return this;
        }

        @Override // com.avito.android.profile_phones.landline_verification.di.b.a
        public final com.avito.android.profile_phones.landline_verification.di.b build() {
            t.a(com.avito.android.profile_phones.landline_verification.di.c.class, this.f227225a);
            return new c(this.f227225a, null);
        }
    }

    /* compiled from: DaggerLandlinePhoneVerificationComponent.java */
    public static final class c implements com.avito.android.profile_phones.landline_verification.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.profile_phones.landline_verification.di.c f227226a;

        public c(com.avito.android.profile_phones.landline_verification.di.c cVar, C6902a c6902a) {
            this.f227226a = cVar;
        }

        @Override // com.avito.android.profile_phones.landline_verification.di.b
        public final void a(LandlinePhoneVerificationFragment landlinePhoneVerificationFragment) {
            com.avito.android.profile_phones.landline_verification.di.c cVar = this.f227226a;
            InterfaceC34401z0 interfaceC34401z0B = cVar.B();
            t.c(interfaceC34401z0B);
            r rVarK0 = cVar.K0();
            t.c(rVarK0);
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            landlinePhoneVerificationFragment.f227169v0 = new m(new j(interfaceC34401z0B, rVarK0, interfaceC35745a5D, cVar.o3()));
            landlinePhoneVerificationFragment.f227170w0 = cVar.g0();
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            landlinePhoneVerificationFragment.f227171x0 = aVarE;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            landlinePhoneVerificationFragment.f227172y0 = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
