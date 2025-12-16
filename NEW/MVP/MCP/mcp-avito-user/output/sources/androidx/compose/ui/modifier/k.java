package androidx.compose.ui.modifier;

import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: ModifierLocalModifierNode.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/modifier/q;", "Landroidx/compose/ui/node/k;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k extends q, InterfaceC22419k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // androidx.compose.ui.modifier.q
    default Object G(@Y61.k s sVar) {
        C22437t0 c22437t0;
        if (!getF42880b().f42893o) {
            C47949a.a("ModifierLocal accessed from an unattached node");
        }
        if (!getF42880b().f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = getF42880b().f42884f;
        LayoutNode layoutNodeG = C22421l.g(this);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 32) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 32) != 0) {
                        AbstractC22425n abstractC22425nB = dVar;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof k) {
                                k kVar = (k) abstractC22425nB;
                                if (kVar.c1().a(sVar)) {
                                    return kVar.c1().b(sVar);
                                }
                            } else if ((abstractC22425nB.f42882d & 32) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar2 = abstractC22425nB.f40861q;
                                int i12 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar = eVar;
                                while (dVar2 != null) {
                                    if ((dVar2.f42882d & 32) != 0) {
                                        i12++;
                                        eVar = eVar;
                                        if (i12 == 1) {
                                            abstractC22425nB = dVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar);
                        }
                    }
                    dVar = dVar.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        return sVar.f40530a.invoke();
    }

    @Y61.k
    default j c1() {
        return b.f40529a;
    }

    default void j1(@Y61.k s sVar, Object obj) {
        if (c1() == b.f40529a) {
            C47949a.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!c1().a(sVar)) {
            C47949a.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + sVar + " was not found.");
        }
        c1().c(sVar, obj);
    }
}
