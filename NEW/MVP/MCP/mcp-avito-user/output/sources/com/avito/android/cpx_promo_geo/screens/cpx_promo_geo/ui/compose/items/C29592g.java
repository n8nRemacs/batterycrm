package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoAutoManualChooserItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29592g extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128032l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29592g(int i12) {
        super(2);
        this.f128032l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128032l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1567133390);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(885759245);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = U2.a(0);
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            bE2.X(false);
            com.akita.compose.theme.re23.g.f65049a.getClass();
            C48709c.C48711b c48711b = new C48709c.C48711b("Как настраивать", new C48709c.z(com.akita.compose.theme.re23.g.a("questionFilled"), null), false, C42745f0.U(new C48709c.v(true, "Автоматически"), new C48709c.v(false, "Вручную")));
            C29590e c29590e = C29590e.f128030l;
            bE2.C(885783019);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new C29591f(interfaceC22196w1);
                bE2.H(objT2);
            }
            Y41.l lVar = (Y41.l) objT2;
            bE2.X(false);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            C29593h.a(c48711b, c29590e, lVar, R1.i(androidx.compose.ui.v.f42878y1, 16), bE2, 3504);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29592g(iA2);
        }
        return G0.f406611a;
    }
}
