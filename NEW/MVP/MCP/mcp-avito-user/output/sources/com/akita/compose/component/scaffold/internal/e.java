package com.akita.compose.component.scaffold.internal;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import shark.AndroidResourceIdNames;

/* compiled from: ScaffoldLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scaffold_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@k C22096n c22096n, @k C22096n c22096n2, @k Y41.a aVar, @k C22096n c22096n3, @k C22096n c22096n4, @k C22096n c22096n5, @l A a12, int i12) {
        B bE2 = a12.E(852756378);
        int i13 = i12 | (bE2.u(c22096n) ? 4 : 2) | (bE2.u(c22096n2) ? 32 : 16) | (bE2.u(aVar) ? 256 : 128) | (bE2.u(c22096n4) ? 16384 : 8192) | (bE2.u(c22096n5) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(2072990841);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new f();
                bE2.H(objT);
            }
            f fVar = (f) objT;
            bE2.X(false);
            bE2.C(2072996131);
            boolean z12 = ((i13 & 896) == 256) | ((i13 & 14) == 4) | ((57344 & i13) == 16384) | ((i13 & 112) == 32) | ((458752 & i13) == 131072);
            Object objT2 = bE2.t();
            if (z12 || objT2 == c1651a) {
                c cVar = new c(c22096n, c22096n4, c22096n2, c22096n3, aVar, fVar, c22096n5);
                bE2.H(cVar);
                objT2 = cVar;
            }
            bE2.X(false);
            V0.a(null, (p) objT2, bE2, 0, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(c22096n, c22096n2, aVar, c22096n3, c22096n4, c22096n5, i12);
        }
    }
}
