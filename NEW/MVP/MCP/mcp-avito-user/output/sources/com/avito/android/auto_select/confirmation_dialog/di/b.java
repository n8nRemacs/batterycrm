package com.avito.android.auto_select.confirmation_dialog.di;

import com.avito.android.auto_select.confirmation_dialog.AutoSelectConfirmationBottomSheetFragment;
import com.avito.android.auto_select.confirmation_dialog.di.a;
import com.avito.android.auto_select.confirmation_dialog.j;
import com.avito.android.auto_select.confirmation_dialog.k;
import com.avito.android.auto_select.confirmation_dialog.mvi.d;
import com.avito.android.auto_select.confirmation_dialog.mvi.g;
import com.avito.android.auto_select.confirmation_dialog.mvi.i;
import com.avito.android.deep_linking.links.AutoSelectContactConfirmation;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import p002if.InterfaceC41393a;

/* compiled from: DaggerConfirmationBottomSheetComponent.java */
@e
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: DaggerConfirmationBottomSheetComponent.java */
    /* renamed from: com.avito.android.auto_select.confirmation_dialog.di.b$b, reason: collision with other inner class name */
    public static final class C2835b implements com.avito.android.auto_select.confirmation_dialog.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC41393a f95885a;

        /* renamed from: b, reason: collision with root package name */
        public final l f95886b;

        public C2835b(cv.b bVar, InterfaceC41393a interfaceC41393a, AutoSelectContactConfirmation autoSelectContactConfirmation, a aVar) {
            this.f95885a = interfaceC41393a;
            this.f95886b = l.a(new com.avito.android.auto_select.confirmation_dialog.l(new k(new g(new d(l.a(autoSelectContactConfirmation)), com.avito.android.auto_select.confirmation_dialog.mvi.b.a(), i.a(), com.avito.android.auto_select.confirmation_dialog.mvi.k.a()))));
        }

        @Override // com.avito.android.auto_select.confirmation_dialog.di.a
        public final void a(AutoSelectConfirmationBottomSheetFragment autoSelectConfirmationBottomSheetFragment) {
            autoSelectConfirmationBottomSheetFragment.f95855h0 = (j.a) this.f95886b.f393949a;
            com.avito.android.util.text.a aVarE = this.f95885a.e();
            t.c(aVarE);
            autoSelectConfirmationBottomSheetFragment.f95857j0 = aVarE;
        }
    }

    /* compiled from: DaggerConfirmationBottomSheetComponent.java */
    public static final class c implements a.InterfaceC2834a {
        public c() {
        }

        @Override // com.avito.android.auto_select.confirmation_dialog.di.a.InterfaceC2834a
        public final com.avito.android.auto_select.confirmation_dialog.di.a a(InterfaceC39417a interfaceC39417a, InterfaceC41393a interfaceC41393a, AutoSelectContactConfirmation autoSelectContactConfirmation) {
            interfaceC39417a.getClass();
            autoSelectContactConfirmation.getClass();
            return new C2835b(interfaceC39417a, interfaceC41393a, autoSelectContactConfirmation, null);
        }
    }

    public static a.InterfaceC2834a a() {
        return new c();
    }
}
