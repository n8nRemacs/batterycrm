package com.avito.android.iac_dialer_ui.pub.util;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDataUpdater.kt */
@s0
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003¨\u0006\u0002²\u0006\u0014\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"T", "value", "_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@k Y41.a aVar, long j12, @l v vVar, @k C22096n c22096n, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1720163183);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        int i14 = i13;
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(-1083672902);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(aVar.invoke());
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            bE2.C(-1083670334);
            boolean z12 = ((i14 & 112) == 32) | ((i14 & 14) == 4);
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                g gVar = new g(j12, aVar, interfaceC22204y1, null);
                bE2.H(gVar);
                objT2 = gVar;
            }
            bE2.X(false);
            C22187u0.d((p) objT2, bE2, aVar);
            c22096n.invoke(interfaceC22204y1.getF42167b(), vVar, bE2, Integer.valueOf((i14 >> 3) & 1008));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(aVar, j12, vVar, c22096n, i12);
        }
    }
}
