package com.avito.android.autoteka.di.confirmEmail;

import com.avito.android.account.G;
import com.avito.android.autoteka.di.confirmEmail.a;
import com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails;
import com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog;
import com.avito.android.autoteka.presentation.confirmEmail.f;
import com.avito.android.autoteka.presentation.confirmEmail.mvi.h;
import com.avito.android.autoteka.presentation.confirmEmail.mvi.j;
import com.avito.android.remote.InterfaceC34401z0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import yf.l;

/* compiled from: DaggerAutotekaConfirmEmailComponent.java */
@e
/* loaded from: classes11.dex */
public final class c {

    /* compiled from: DaggerAutotekaConfirmEmailComponent.java */
    public static final class b implements com.avito.android.autoteka.di.confirmEmail.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC34401z0> f96409a;

        /* renamed from: b, reason: collision with root package name */
        public final u<G> f96410b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.autoteka.data.order.a> f96411c;

        /* renamed from: d, reason: collision with root package name */
        public final f f96412d;

        /* compiled from: DaggerAutotekaConfirmEmailComponent.java */
        public static final class a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96413a;

            public a(l lVar) {
                this.f96413a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f96413a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerAutotekaConfirmEmailComponent.java */
        /* renamed from: com.avito.android.autoteka.di.confirmEmail.c$b$b, reason: collision with other inner class name */
        public static final class C2854b implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final l f96414a;

            public C2854b(l lVar) {
                this.f96414a = lVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f96414a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        public b() {
            throw null;
        }

        public b(l lVar, cv.b bVar, Y41.l lVar2, ConfirmEmailDetails confirmEmailDetails, a aVar) {
            this.f96411c = g.d(new com.avito.android.autoteka.data.order.e(new C2854b(lVar), new a(lVar)));
            this.f96412d = new f(new h(new com.avito.android.autoteka.presentation.confirmEmail.mvi.c(dagger.internal.l.a(confirmEmailDetails), this.f96411c), com.avito.android.autoteka.presentation.confirmEmail.mvi.e.a(), j.a(), com.avito.android.autoteka.presentation.confirmEmail.mvi.l.a()));
        }

        @Override // com.avito.android.autoteka.di.confirmEmail.a
        public final void a(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog) {
            autotekaConfirmEmailBottomSheetDialog.f97215h0 = this.f96412d;
        }
    }

    /* compiled from: DaggerAutotekaConfirmEmailComponent.java */
    /* renamed from: com.avito.android.autoteka.di.confirmEmail.c$c, reason: collision with other inner class name */
    public static final class C2855c implements a.InterfaceC2853a {
        public C2855c() {
        }

        @Override // com.avito.android.autoteka.di.confirmEmail.a.InterfaceC2853a
        public final com.avito.android.autoteka.di.confirmEmail.a a(l lVar, InterfaceC39417a interfaceC39417a, Y41.l lVar2, ConfirmEmailDetails confirmEmailDetails) {
            interfaceC39417a.getClass();
            return new b(lVar, interfaceC39417a, lVar2, confirmEmailDetails, null);
        }
    }

    public static a.InterfaceC2853a a() {
        return new C2855c();
    }
}
