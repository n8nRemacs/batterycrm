package com.avito.android.document_verification_status_screen.di;

import Cx.C13367a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.document_verification_status_screen.di.b;
import com.avito.android.document_verification_status_screen.mvi.f;
import com.avito.android.document_verification_status_screen.mvi.h;
import com.avito.android.document_verification_status_screen.mvi.k;
import com.avito.android.document_verification_status_screen.mvi.m;
import com.avito.android.document_verification_status_screen.mvi.o;
import com.avito.android.document_verification_status_screen.mvi.q;
import com.avito.android.document_verification_status_screen.ui.VerificationStatusActivity;
import com.avito.android.remote.H;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerVerificationStatusComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerVerificationStatusComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.document_verification_status_screen.di.b.a
        public final com.avito.android.document_verification_status_screen.di.b a(Y41.a aVar, d dVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, aVar, null);
        }
    }

    /* compiled from: DaggerVerificationStatusComponent.java */
    public static final class c implements com.avito.android.document_verification_status_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final d f144810a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f144811b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f144812c;

        /* renamed from: d, reason: collision with root package name */
        public final u<EF.a> f144813d;

        /* renamed from: e, reason: collision with root package name */
        public final f f144814e;

        /* renamed from: f, reason: collision with root package name */
        public final h f144815f;

        /* renamed from: g, reason: collision with root package name */
        public final l f144816g;

        /* renamed from: h, reason: collision with root package name */
        public final q f144817h;

        /* compiled from: DaggerVerificationStatusComponent.java */
        /* renamed from: com.avito.android.document_verification_status_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C4210a implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final d f144818a;

            public C4210a(d dVar) {
                this.f144818a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarQ = this.f144818a.q();
                t.c(xVarQ);
                return xVarQ;
            }
        }

        /* compiled from: DaggerVerificationStatusComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f144819a;

            public b(cv.b bVar) {
                this.f144819a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f144819a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVerificationStatusComponent.java */
        /* renamed from: com.avito.android.document_verification_status_screen.di.a$c$c, reason: collision with other inner class name */
        public static final class C4211c implements u<EF.a> {

            /* renamed from: a, reason: collision with root package name */
            public final d f144820a;

            public C4211c(d dVar) {
                this.f144820a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                EF.a aVarJj = this.f144820a.jj();
                t.c(aVarJj);
                return aVarJj;
            }
        }

        public c() {
            throw null;
        }

        public c(d dVar, cv.b bVar, Y41.a aVar, C4209a c4209a) {
            this.f144810a = dVar;
            b bVar2 = new b(bVar);
            com.avito.android.document_verification_status_screen.domain.b bVar3 = new com.avito.android.document_verification_status_screen.domain.b(new C4210a(dVar), new C4211c(dVar));
            this.f144814e = new f(bVar2, bVar3);
            this.f144815f = new h(bVar3);
            this.f144816g = l.a(aVar);
            this.f144817h = new q(new k(this.f144814e, m.a(), this.f144815f, o.a(), this.f144816g));
        }

        @Override // com.avito.android.document_verification_status_screen.di.b
        public final void a(VerificationStatusActivity verificationStatusActivity) {
            verificationStatusActivity.f144867m = this.f144817h;
            d dVar = this.f144810a;
            InterfaceC28373a interfaceC28373aA = dVar.a();
            t.c(interfaceC28373aA);
            com.avito.android.analytics.provider.a aVarV = dVar.v();
            t.c(aVarV);
            com.avito.android.server_time.f fVarL = dVar.l();
            t.c(fVarL);
            H hK2 = dVar.K();
            t.c(hK2);
            verificationStatusActivity.f144869o = new C13367a(interfaceC28373aA, aVarV, fVarL, hK2);
        }
    }

    public static b.a a() {
        return new b();
    }
}
