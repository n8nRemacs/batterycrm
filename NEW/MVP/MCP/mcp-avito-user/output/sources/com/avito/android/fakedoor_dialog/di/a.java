package com.avito.android.fakedoor_dialog.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.fakedoor_dialog.FakeDoorDialogFragment;
import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import com.avito.android.fakedoor_dialog.di.b;
import com.avito.android.fakedoor_dialog.mvi.h;
import com.avito.android.fakedoor_dialog.mvi.j;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import jC.InterfaceC42231a;
import nC.C44230c;
import nC.InterfaceC44228a;

/* compiled from: DaggerFakeDoorDialogComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: DaggerFakeDoorDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.fakedoor_dialog.di.b.a
        public final com.avito.android.fakedoor_dialog.di.b a(e eVar, InterfaceC39417a interfaceC39417a, FakeDoorDialogParams fakeDoorDialogParams) {
            interfaceC39417a.getClass();
            fakeDoorDialogParams.getClass();
            return new c(eVar, interfaceC39417a, fakeDoorDialogParams, null);
        }
    }

    /* compiled from: DaggerFakeDoorDialogComponent.java */
    public static final class c implements com.avito.android.fakedoor_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final e f155107a;

        /* renamed from: b, reason: collision with root package name */
        public final cv.b f155108b;

        /* renamed from: c, reason: collision with root package name */
        public final l f155109c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f155110d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC42231a> f155111e;

        /* renamed from: f, reason: collision with root package name */
        public final u<AK0.l> f155112f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC44228a> f155113g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f155114h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.fakedoor_dialog.e f155115i;

        /* compiled from: DaggerFakeDoorDialogComponent.java */
        /* renamed from: com.avito.android.fakedoor_dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C4545a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f155116a;

            public C4545a(e eVar) {
                this.f155116a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f155116a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerFakeDoorDialogComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f155117a;

            public b(cv.b bVar) {
                this.f155117a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f155117a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFakeDoorDialogComponent.java */
        /* renamed from: com.avito.android.fakedoor_dialog.di.a$c$c, reason: collision with other inner class name */
        public static final class C4546c implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final e f155118a;

            public C4546c(e eVar) {
                this.f155118a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f155118a.r();
            }
        }

        public c(e eVar, cv.b bVar, FakeDoorDialogParams fakeDoorDialogParams, C4544a c4544a) {
            this.f155107a = eVar;
            this.f155108b = bVar;
            this.f155109c = l.a(fakeDoorDialogParams);
            this.f155111e = dagger.internal.g.d(new jC.c(new C4545a(eVar)));
            u<InterfaceC44228a> uVarD = dagger.internal.g.d(new C44230c(new C4546c(eVar)));
            this.f155113g = uVarD;
            l lVar = this.f155109c;
            u<InterfaceC42231a> uVar = this.f155111e;
            this.f155115i = new com.avito.android.fakedoor_dialog.e(new h(new com.avito.android.fakedoor_dialog.mvi.e(lVar, uVarD, uVar), new com.avito.android.fakedoor_dialog.mvi.c(lVar, uVar), new j(new b(bVar)), com.avito.android.fakedoor_dialog.mvi.l.a(), this.f155109c));
        }

        @Override // com.avito.android.fakedoor_dialog.di.b
        public final void a(FakeDoorDialogFragment fakeDoorDialogFragment) {
            fakeDoorDialogFragment.f155084i0 = this.f155115i;
            com.avito.android.util.text.a aVarE = this.f155107a.e();
            t.c(aVarE);
            fakeDoorDialogFragment.f155086k0 = aVarE;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f155108b.u4();
            t.c(aVarU4);
            fakeDoorDialogFragment.f155087l0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
