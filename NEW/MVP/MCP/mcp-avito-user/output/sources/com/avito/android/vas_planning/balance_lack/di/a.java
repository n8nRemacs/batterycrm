package com.avito.android.vas_planning.balance_lack.di;

import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.R0;
import com.avito.android.vas_planning.balance_lack.VasPlanBalanceLackDialogFragment;
import com.avito.android.vas_planning.balance_lack.di.b;
import com.avito.android.vas_planning.balance_lack.j;
import com.avito.android.vas_planning.balance_lack.l;
import cv.InterfaceC39417a;
import dagger.internal.t;

/* compiled from: DaggerVasPlanBalanceLackComponent.java */
@dagger.internal.e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerVasPlanBalanceLackComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.vas_planning.balance_lack.di.b.a
        public final com.avito.android.vas_planning.balance_lack.di.b a(VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment, com.avito.android.vas_planning.balance_lack.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, vasPlanBalanceLackDialogFragment, null);
        }
    }

    /* compiled from: DaggerVasPlanBalanceLackComponent.java */
    public static final class c implements com.avito.android.vas_planning.balance_lack.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.vas_planning.balance_lack.di.c f322216a;

        /* renamed from: b, reason: collision with root package name */
        public final VasPlanBalanceLackDialogFragment f322217b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f322218c;

        public c(com.avito.android.vas_planning.balance_lack.di.c cVar, cv.b bVar, VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment, C9959a c9959a) {
            this.f322216a = cVar;
            this.f322217b = vasPlanBalanceLackDialogFragment;
            this.f322218c = bVar;
        }

        @Override // com.avito.android.vas_planning.balance_lack.di.b
        public final void a(VasPlanBalanceLackDialogFragment vasPlanBalanceLackDialogFragment) {
            com.avito.android.vas_planning.balance_lack.di.c cVar = this.f322216a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            YL0.a aVarK8 = cVar.K8();
            t.c(aVarK8);
            R0 r0C = cVar.c();
            t.c(r0C);
            l lVar = new l(interfaceC28373aA, aVarK8, r0C);
            d.f322219a.getClass();
            vasPlanBalanceLackDialogFragment.f322200h0 = (j) new P0(this.f322217b, lVar).a(j.class);
            com.avito.android.util.text.a aVarE = cVar.e();
            t.c(aVarE);
            vasPlanBalanceLackDialogFragment.f322201i0 = aVarE;
            cv.b bVar = this.f322218c;
            com.avito.android.deeplink_handler.view.d dVarC = bVar.c();
            t.c(dVarC);
            vasPlanBalanceLackDialogFragment.f322202j0 = dVarC;
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = bVar.u4();
            t.c(aVarU4);
            vasPlanBalanceLackDialogFragment.f322203k0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
