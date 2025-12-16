package androidx.compose.ui.scrollcapture;

import Y41.p;
import androidx.compose.foundation.H;
import androidx.compose.ui.layout.B;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.platform.C22481h2;
import androidx.compose.ui.semantics.E;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.t;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScrollCapture.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {
    public static final void a(u uVar, int i12, Y41.l<? super n, G0> lVar) {
        u uVar2;
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new u[16], 0);
        List listG = uVar.g(false, false);
        while (true) {
            eVar.d(eVar.f38262d, listG);
            while (true) {
                int i13 = eVar.f38262d;
                if (i13 == 0) {
                    return;
                }
                uVar2 = (u) eVar.k(i13 - 1);
                if (!C22481h2.e(uVar2)) {
                    y.f41820a.getClass();
                    E<G0> e12 = y.f41829j;
                    androidx.compose.ui.semantics.l lVar2 = uVar2.f41797d;
                    if (lVar2.f41786b.c(e12)) {
                        continue;
                    } else {
                        AbstractC22443w0 abstractC22443w0C = uVar2.c();
                        if (abstractC22443w0C == null) {
                            throw H.s("Expected semantics node to have a coordinator.");
                        }
                        s sVarB = t.b(B.b(abstractC22443w0C));
                        if (sVarB.f42867a < sVarB.f42869c && sVarB.f42868b < sVarB.f42870d) {
                            androidx.compose.ui.semantics.k.f41760a.getClass();
                            p pVar = (p) androidx.compose.ui.semantics.m.a(lVar2, androidx.compose.ui.semantics.k.f41765f);
                            androidx.compose.ui.semantics.j jVar = (androidx.compose.ui.semantics.j) androidx.compose.ui.semantics.m.a(lVar2, y.f41840u);
                            if (pVar == null || jVar == null || jVar.f41755b.invoke().floatValue() <= 0.0f) {
                                break;
                            }
                            int i14 = i12 + 1;
                            ((j) lVar).invoke(new n(uVar2, i14, sVarB, abstractC22443w0C));
                            a(uVar2, i14, lVar);
                        }
                    }
                }
            }
            listG = uVar2.g(false, false);
        }
    }
}
