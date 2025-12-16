package com.avito.android.mnz_common.compose.preview;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: MnzSegmentedControlPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f197937l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12) {
        super(2);
        this.f197937l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197937l | 1);
        B bE2 = a12.E(1624708798);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1913998727);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = U2.a(0);
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            bE2.X(false);
            List listU = C42745f0.U("Option 1", "Option 2");
            bE2.C(-1913994441);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new j(interfaceC22196w1);
                bE2.H(objT2);
            }
            bE2.X(false);
            Integer numValueOf = Integer.valueOf(interfaceC22196w1.e());
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.avito.android.mnz_common.compose.B.a(listU, (Y41.l) objT2, numValueOf, R1.i(v.f42878y1, 16), bE2, 3126);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(iA2);
        }
        return G0.f406611a;
    }
}
