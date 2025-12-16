package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import com.avito.android.deep_linking.links.NoMatchLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoSeparateRegionsToggleItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class E extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f128012l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(int i12) {
        super(2);
        this.f128012l = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128012l | 1);
        androidx.compose.runtime.B bE2 = a12.E(330996218);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1487280381);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.TRUE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            com.akita.compose.theme.re23.g.f65049a.getClass();
            C48709c.w wVar = new C48709c.w(((Boolean) interfaceC22204y1.getF42167b()).booleanValue(), "Установить бюджет для каждого региона отдельно", new C48709c.z(com.akita.compose.theme.re23.g.a("questionFilled"), new NoMatchLink()));
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarI = R1.i(androidx.compose.ui.v.f42878y1, 16);
            bE2.C(-1487265344);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new C(interfaceC22204y1);
                bE2.H(objT2);
            }
            bE2.X(false);
            F.a(wVar, (Y41.l) objT2, D.f128011l, vVarI, bE2, 3504);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new E(iA2);
        }
        return G0.f406611a;
    }
}
