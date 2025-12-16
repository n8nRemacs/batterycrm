package androidx.compose.ui.relocation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.collection.e;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: BringIntoViewModifierNode.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @l
    public static final Object a(@k InterfaceC22419k interfaceC22419k, @l Y41.a aVar, @k ContinuationImpl continuationImpl) {
        Object obj;
        C22437t0 c22437t0;
        if (!interfaceC22419k.getF42880b().f42893o) {
            return G0.f406611a;
        }
        if (!interfaceC22419k.getF42880b().f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = interfaceC22419k.getF42880b().f42884f;
        LayoutNode layoutNodeG = C22421l.g(interfaceC22419k);
        loop0: while (true) {
            obj = null;
            if (layoutNodeG == null) {
                break;
            }
            if ((layoutNodeG.f40615I.f40878e.f42883e & 524288) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 524288) != 0) {
                        v.d dVarB = dVar;
                        e eVar = null;
                        while (dVarB != null) {
                            if (dVarB instanceof a) {
                                obj = dVarB;
                                break loop0;
                            }
                            if ((dVarB.f42882d & 524288) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i12 = 0;
                                for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                    if ((dVar2.f42882d & 524288) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            dVarB = dVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar.b(dVarB);
                                                Boxing.boxBoolean(true);
                                                dVarB = null;
                                            }
                                            eVar.b(dVar2);
                                            Boxing.boxBoolean(true);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar);
                        }
                    }
                    dVar = dVar.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        a aVar2 = (a) obj;
        if (aVar2 == null) {
            return G0.f406611a;
        }
        AbstractC22443w0 abstractC22443w0F = C22421l.f(interfaceC22419k);
        Object objI0 = aVar2.i0(abstractC22443w0F, new b(aVar, abstractC22443w0F), continuationImpl);
        return objI0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI0 : G0.f406611a;
    }
}
