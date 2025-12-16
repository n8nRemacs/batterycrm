package com.google.accompanist.placeholder;

import Y41.q;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.E0;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.Metadata;
import l0.n;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"placeholder_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j {
    public static final void a(androidx.compose.ui.graphics.drawscope.d dVar, h1 h1Var, long j12, c cVar, float f12, D0 d02, LayoutDirection layoutDirection, n nVar) {
        if (h1Var == Y0.f39346a) {
            androidx.compose.ui.graphics.drawscope.g.c0(dVar, j12, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
            if (cVar != null) {
                l lVar = (l) cVar;
                androidx.compose.ui.graphics.drawscope.g.e0(dVar, lVar.b(dVar.i(), f12), 0L, 0L, lVar.a(f12), null, null, 118);
                return;
            }
            return;
        }
        long jI2 = dVar.i();
        n.a aVar = n.f413402b;
        D0 d0A = (nVar != null && jI2 == nVar.f413404a && dVar.getLayoutDirection() == layoutDirection) ? d02 : null;
        if (d0A == null) {
            d0A = h1Var.a(dVar.i(), dVar.getLayoutDirection(), dVar);
        }
        D0 d03 = d0A;
        E0.b(dVar, d03, j12, null, 60);
        if (cVar != null) {
            l lVar2 = (l) cVar;
            E0.a(dVar, d03, lVar2.b(dVar.i(), f12), lVar2.a(f12));
        }
    }

    @Y61.k
    public static final v b(@Y61.k v vVar, long j12, @Y61.k h1 h1Var, @Y61.l c cVar, @Y61.k q qVar, @Y61.k q qVar2) {
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new h(j12, qVar, qVar2, h1Var, cVar));
    }

    public static v c(v vVar, long j12, androidx.compose.foundation.shape.n nVar, c cVar) {
        return b(vVar, j12, nVar, cVar, e.f342889l, f.f342890l);
    }
}
