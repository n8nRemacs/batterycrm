package com.akita.compose.foundation;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.S;
import androidx.compose.runtime.Y1;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import okhttp3.internal.http2.Http2;

/* compiled from: DefaultTheme.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l v.a aVar, @Y61.l p pVar, @Y61.l p pVar2, @Y61.k Y41.p pVar3, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1809895594);
        if (((i12 | 1462 | (bE2.u(pVar3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192)) & 46811) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                aVar = v.f42878y1;
                p.f63635e.getClass();
                pVar = p.f63636f;
                pVar2 = (p) bE2.o(d.f63579a);
            } else {
                bE2.f();
            }
            bE2.Y();
            t0 t0Var = new t0(2);
            t0Var.a(d.f63579a.b(pVar2));
            bE2.C(777051111);
            bE2.X(false);
            t0Var.b(new Y1[0]);
            ArrayList<Object> arrayList = t0Var.f406850a;
            S.b((Y1[]) arrayList.toArray(new Y1[arrayList.size()]), androidx.compose.runtime.internal.r.c(-1295330326, new e(pVar, aVar, pVar3), bE2), bE2, 56);
        }
        v.a aVar2 = aVar;
        p pVar4 = pVar;
        p pVar5 = pVar2;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(aVar2, pVar4, pVar5, pVar3, i12);
        }
    }
}
