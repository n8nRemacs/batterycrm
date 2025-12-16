package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {
    @W0
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k kotlin.reflect.o oVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l C20714d0 c20714d0, @Y61.k Y41.p pVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(2002163445);
        int i13 = (bE2.u(oVar) ? 4 : 2) | i12 | (bE2.B(vVar) ? 32 : 16) | (bE2.B(c20714d0) ? 256 : 128) | (bE2.u(pVar) ? 2048 : 1024);
        if (bE2.p(i13 & 1, (i13 & 1171) != 1170)) {
            A0.a(androidx.compose.runtime.internal.r.c(-1488997347, new N(c20714d0, vVar, pVar, C22126m3.m(oVar, bE2)), bE2), bE2, 6);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O(oVar, vVar, c20714d0, pVar, i12);
        }
    }
}
