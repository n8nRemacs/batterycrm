package androidx.compose.ui.node;

import androidx.compose.ui.C22214e;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: TraversableNode.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T extends androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Y61.l
    public static final <T extends TraversableNode> T a(@Y61.k T t12) {
        C22437t0 c22437t0;
        v.d dVar = (v.d) t12;
        if (!dVar.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = dVar.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(t12);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 262144) != 0) {
                while (dVar2 != null) {
                    if ((dVar2.f42882d & 262144) != 0) {
                        AbstractC22425n abstractC22425nB = dVar2;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof TraversableNode) {
                                T t13 = (T) abstractC22425nB;
                                if (kotlin.jvm.internal.L.f(t12.getF39003r(), t13.getF39003r()) && C22214e.a(t12, t13)) {
                                    return t13;
                                }
                            } else if ((abstractC22425nB.f42882d & 262144) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar3 = abstractC22425nB.f40861q;
                                int i12 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar = eVar;
                                while (dVar3 != null) {
                                    if ((dVar3.f42882d & 262144) != 0) {
                                        i12++;
                                        eVar = eVar;
                                        if (i12 == 1) {
                                            abstractC22425nB = dVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar.b(dVar3);
                                        }
                                    }
                                    dVar3 = dVar3.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar);
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T extends androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.TraversableNode, androidx.compose.ui.node.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final <T extends TraversableNode> void b(@Y61.k T t12, @Y61.k Y41.l<? super T, Boolean> lVar) {
        C22437t0 c22437t0;
        v.d dVar = (v.d) t12;
        if (!dVar.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = dVar.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(t12);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 262144) != 0) {
                while (dVar2 != null) {
                    if ((dVar2.f42882d & 262144) != 0) {
                        AbstractC22425n abstractC22425nB = dVar2;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            boolean zBooleanValue = true;
                            if (abstractC22425nB instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) abstractC22425nB;
                                if (kotlin.jvm.internal.L.f(t12.getF39003r(), traversableNode.getF39003r()) && C22214e.a(t12, traversableNode)) {
                                    zBooleanValue = lVar.invoke(traversableNode).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((abstractC22425nB.f42882d & 262144) != 0) && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar3 = abstractC22425nB.f40861q;
                                    int i12 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar3 != null) {
                                        if ((dVar3.f42882d & 262144) != 0) {
                                            i12++;
                                            eVar = eVar;
                                            if (i12 == 1) {
                                                abstractC22425nB = dVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (abstractC22425nB != 0) {
                                                    eVar.b(abstractC22425nB);
                                                    abstractC22425nB = 0;
                                                }
                                                eVar.b(dVar3);
                                            }
                                        }
                                        dVar3 = dVar3.f42885g;
                                        abstractC22425nB = abstractC22425nB;
                                        eVar = eVar;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar);
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final <T extends TraversableNode> void c(@Y61.k T t12, @Y61.k Y41.l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (!t12.getF42880b().f42893o) {
            C47949a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar = t12.getF42880b().f42885g;
        if (dVar == null) {
            C22421l.a(eVar, t12.getF42880b());
        } else {
            eVar.b(dVar);
        }
        while (true) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                return;
            }
            v.d dVar2 = (v.d) eVar.k(i12 - 1);
            if ((dVar2.f42883e & 262144) != 0) {
                for (v.d dVar3 = dVar2; dVar3 != null; dVar3 = dVar3.f42885g) {
                    if ((dVar3.f42882d & 262144) != 0) {
                        AbstractC22425n abstractC22425nB = dVar3;
                        ?? eVar2 = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) abstractC22425nB;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke = (kotlin.jvm.internal.L.f(t12.getF39003r(), traversableNode.getF39003r()) && C22214e.a(t12, traversableNode)) ? lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.f40695b;
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.f40697d) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.f40696c) {
                                    break;
                                }
                            } else if ((abstractC22425nB.f42882d & 262144) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar4 = abstractC22425nB.f40861q;
                                int i13 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar2 = eVar2;
                                while (dVar4 != null) {
                                    if ((dVar4.f42882d & 262144) != 0) {
                                        i13++;
                                        eVar2 = eVar2;
                                        if (i13 == 1) {
                                            abstractC22425nB = dVar4;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar2.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar2.b(dVar4);
                                        }
                                    }
                                    dVar4 = dVar4.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar2 = eVar2;
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar2);
                        }
                    }
                }
            }
            C22421l.a(eVar, dVar2);
        }
    }
}
