package com.avito.android.verification.di.verification_activity;

import com.avito.android.deep_linking.x;
import com.avito.android.verification.VerificationActivity;
import com.avito.android.verification.di.verification_activity.b;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;

/* compiled from: DaggerVerificationActivityComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVerificationActivityComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.verification.di.verification_activity.b.a
        public final com.avito.android.verification.di.verification_activity.b a(com.avito.android.verification.di.verification_activity.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerVerificationActivityComponent.java */
    public static final class c implements com.avito.android.verification.di.verification_activity.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.verification.di.verification_activity.c f323861a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f323862b;

        public c(com.avito.android.verification.di.verification_activity.c cVar, cv.b bVar, C10027a c10027a) {
            this.f323861a = cVar;
            this.f323862b = bVar;
        }

        @Override // com.avito.android.verification.di.verification_activity.b
        public final void a(VerificationActivity verificationActivity) {
            com.avito.android.verification.di.verification_activity.c cVar = this.f323861a;
            verificationActivity.f323374m = cVar.O();
            x xVarQ = cVar.q();
            t.c(xVarQ);
            verificationActivity.f323375n = xVarQ;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f323862b.u4();
            t.c(aVarU4);
            verificationActivity.f323376o = aVarU4;
            verificationActivity.f323377p = cVar.E();
            verificationActivity.f323378q = cVar.Cd();
        }
    }

    public static b.a a() {
        return new b();
    }
}
