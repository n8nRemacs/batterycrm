package com.avito.android.auto_select.booking.di;

import Ye.InterfaceC18256a;
import af.C19881c;
import af.InterfaceC19879a;
import com.avito.android.auto_select.booking.data.f;
import com.avito.android.auto_select.booking.di.b;
import com.avito.android.auto_select.booking.domain.models.AutoSelectConfirmationDialogData;
import com.avito.android.auto_select.booking.mvi.h;
import com.avito.android.auto_select.booking.mvi.j;
import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetV2;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import df.C39721b;
import kf.InterfaceC42678a;

/* compiled from: DaggerConfirmationBottomSheetComponentV2.java */
@e
/* loaded from: classes11.dex */
public final class d {

    /* compiled from: DaggerConfirmationBottomSheetComponentV2.java */
    public static final class b implements com.avito.android.auto_select.booking.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.auto_select.booking.mvi.e f95823a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC18256a> f95824b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.auto_select.booking.data.a> f95825c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC19879a> f95826d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC42678a> f95827e;

        /* renamed from: f, reason: collision with root package name */
        public final C39721b f95828f;

        /* compiled from: DaggerConfirmationBottomSheetComponentV2.java */
        public static final class a implements u<InterfaceC18256a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auto_select.booking.di.a f95829a;

            public a(com.avito.android.auto_select.booking.di.a aVar) {
                this.f95829a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC18256a interfaceC18256aFg = this.f95829a.Fg();
                t.c(interfaceC18256aFg);
                return interfaceC18256aFg;
            }
        }

        /* compiled from: DaggerConfirmationBottomSheetComponentV2.java */
        /* renamed from: com.avito.android.auto_select.booking.di.d$b$b, reason: collision with other inner class name */
        public static final class C2833b implements u<InterfaceC42678a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.auto_select.booking.di.a f95830a;

            public C2833b(com.avito.android.auto_select.booking.di.a aVar) {
                this.f95830a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC42678a interfaceC42678aA4 = this.f95830a.A4();
                t.c(interfaceC42678aA4);
                return interfaceC42678aA4;
            }
        }

        public b(cv.b bVar, com.avito.android.auto_select.booking.di.a aVar, AutoSelectConfirmationDialogData autoSelectConfirmationDialogData, a aVar2) {
            this.f95823a = new com.avito.android.auto_select.booking.mvi.e(l.a(autoSelectConfirmationDialogData));
            u<com.avito.android.auto_select.booking.data.a> uVarD = g.d(new f(new a(aVar)));
            this.f95825c = uVarD;
            u<InterfaceC19879a> uVarD2 = g.d(new C19881c(uVarD));
            this.f95826d = uVarD2;
            this.f95828f = new C39721b(new h(this.f95823a, new com.avito.android.auto_select.booking.mvi.c(uVarD2, new C2833b(aVar)), j.a(), com.avito.android.auto_select.booking.mvi.l.a()));
        }

        @Override // com.avito.android.auto_select.booking.di.b
        public final void a(AutoSelectConfirmationBottomSheetV2 autoSelectConfirmationBottomSheetV2) {
            autoSelectConfirmationBottomSheetV2.f95872i0 = this.f95828f;
        }
    }

    /* compiled from: DaggerConfirmationBottomSheetComponentV2.java */
    public static final class c implements b.a {
        public c() {
        }

        @Override // com.avito.android.auto_select.booking.di.b.a
        public final com.avito.android.auto_select.booking.di.b a(InterfaceC39417a interfaceC39417a, com.avito.android.auto_select.booking.di.a aVar, AutoSelectConfirmationDialogData autoSelectConfirmationDialogData) {
            interfaceC39417a.getClass();
            autoSelectConfirmationDialogData.getClass();
            return new b(interfaceC39417a, aVar, autoSelectConfirmationDialogData, null);
        }
    }

    public static b.a a() {
        return new c();
    }
}
