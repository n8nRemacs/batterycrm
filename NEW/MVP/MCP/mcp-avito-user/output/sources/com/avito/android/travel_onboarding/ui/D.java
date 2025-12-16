package com.avito.android.travel_onboarding.ui;

import ZE0.d;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TravelOnboardingScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_travel-onboarding_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class D {

    /* compiled from: TravelOnboardingScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ZE0.d f302331l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<ZE0.a, G0> f302332m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ZE0.d dVar, Y41.l<? super ZE0.a, G0> lVar, int i12) {
            super(2);
            this.f302331l = dVar;
            this.f302332m = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            Y41.l<ZE0.a, G0> lVar = this.f302332m;
            D.a(this.f302331l, lVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k ZE0.d dVar, @Y61.k Y41.l<? super ZE0.a, G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1804040921);
        int i13 = (bE2.B(dVar) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else if (dVar instanceof d.C1430d) {
            bE2.C(17618977);
            C.a(null, bE2, 0);
            bE2.X(false);
        } else if (dVar instanceof d.c) {
            bE2.C(17620967);
            y.a((i13 >> 3) & 14, lVar, bE2, null);
            bE2.X(false);
        } else if (dVar instanceof d.b) {
            bE2.C(17623220);
            u.a((d.b) dVar, lVar, bE2, (i13 & 112) | 8);
            bE2.X(false);
        } else {
            bE2.C(546373824);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(dVar, lVar, i12);
        }
    }
}
