package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.E0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import s0.C47949a;

/* compiled from: FocusTransactions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.f39118b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.f39118b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.f39118b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final boolean a(@Y61.k FocusTargetNode focusTargetNode, boolean z12) {
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (!(focusTargetNodeC != null ? a(focusTargetNodeC, z12) : true)) {
                    return false;
                }
                if (androidx.compose.ui.l.f40323d) {
                    focusTargetNode.l2(FocusStateImpl.f39119c, FocusStateImpl.f39121e);
                } else {
                    focusTargetNode.t2(FocusStateImpl.f39121e);
                    focusTargetNode.k2();
                }
            } else {
                if (iOrdinal == 2) {
                    if (!z12) {
                        return z12;
                    }
                    if (androidx.compose.ui.l.f40323d) {
                        C22421l.h(focusTargetNode).getFocusOwner().f(null);
                        focusTargetNode.l2(FocusStateImpl.f39120d, FocusStateImpl.f39121e);
                        return z12;
                    }
                    focusTargetNode.t2(FocusStateImpl.f39121e);
                    focusTargetNode.k2();
                    return z12;
                }
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (androidx.compose.ui.l.f40323d) {
            C22421l.h(focusTargetNode).getFocusOwner().f(null);
            focusTargetNode.l2(FocusStateImpl.f39118b, FocusStateImpl.f39121e);
        } else {
            focusTargetNode.t2(FocusStateImpl.f39121e);
            focusTargetNode.k2();
        }
        return true;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        E0.a(focusTargetNode, new m0(focusTargetNode));
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            if (androidx.compose.ui.l.f40323d) {
                C22421l.h(focusTargetNode).getFocusOwner().f(focusTargetNode);
            } else {
                focusTargetNode.t2(FocusStateImpl.f39118b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Y61.k
    public static final CustomDestinationResult c(@Y61.k FocusTargetNode focusTargetNode, int i12) {
        CustomDestinationResult customDestinationResult;
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                CustomDestinationResult customDestinationResultC = c(focusTargetNodeC, i12);
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.f39092b;
                if (customDestinationResultC == customDestinationResult2) {
                    customDestinationResultC = null;
                }
                if (customDestinationResultC != null) {
                    return customDestinationResultC;
                }
                if (!focusTargetNode.f39126r) {
                    focusTargetNode.f39126r = true;
                    try {
                        K kM2 = focusTargetNode.m2();
                        C22217b c22217b = new C22217b(i12, null);
                        k0 k0VarA = j0.a(focusTargetNode);
                        int i13 = k0VarA != null ? k0VarA.f39179d : 0;
                        B focusOwner = C22421l.h(focusTargetNode).getFocusOwner();
                        FocusTargetNode f39110l = focusOwner.getF39110l();
                        kM2.f39145k.invoke(c22217b);
                        int i14 = k0VarA != null ? k0VarA.f39179d : 0;
                        FocusTargetNode f39110l2 = focusOwner.getF39110l();
                        if (c22217b.f39157b) {
                            S.f39148b.getClass();
                            customDestinationResult = CustomDestinationResult.f39093c;
                        } else if (i13 != i14 || (androidx.compose.ui.l.f40323d && f39110l != f39110l2 && f39110l2 != null)) {
                            S.f39148b.getClass();
                            customDestinationResult = S.f39151e == S.f39150d ? CustomDestinationResult.f39093c : CustomDestinationResult.f39094d;
                        }
                        focusTargetNode.f39126r = false;
                        return customDestinationResult;
                    } finally {
                        focusTargetNode.f39126r = false;
                    }
                }
                return customDestinationResult2;
            }
            if (iOrdinal == 2) {
                return CustomDestinationResult.f39093c;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.f39092b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    public static final CustomDestinationResult d(FocusTargetNode focusTargetNode, int i12) {
        if (!focusTargetNode.f39127s) {
            focusTargetNode.f39127s = true;
            try {
                K kM2 = focusTargetNode.m2();
                C22217b c22217b = new C22217b(i12, null);
                k0 k0VarA = j0.a(focusTargetNode);
                int i13 = k0VarA != null ? k0VarA.f39179d : 0;
                B focusOwner = C22421l.h(focusTargetNode).getFocusOwner();
                FocusTargetNode f39110l = focusOwner.getF39110l();
                kM2.f39144j.invoke(c22217b);
                int i14 = k0VarA != null ? k0VarA.f39179d : 0;
                FocusTargetNode f39110l2 = focusOwner.getF39110l();
                if (c22217b.f39157b) {
                    S.f39148b.getClass();
                    return CustomDestinationResult.f39093c;
                }
                if (i13 != i14 || (androidx.compose.ui.l.f40323d && f39110l != f39110l2 && f39110l2 != null)) {
                    S.f39148b.getClass();
                    return S.f39151e == S.f39150d ? CustomDestinationResult.f39093c : CustomDestinationResult.f39094d;
                }
            } finally {
                focusTargetNode.f39127s = false;
            }
        }
        return CustomDestinationResult.f39092b;
    }

    @Y61.k
    public static final CustomDestinationResult e(@Y61.k FocusTargetNode focusTargetNode, int i12) {
        v.d dVarB;
        C22437t0 c22437t0;
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (focusTargetNodeC != null) {
                    return c(focusTargetNodeC, i12);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!focusTargetNode.f42880b.f42893o) {
                    C47949a.b("visitAncestors called on an unattached node");
                }
                v.d dVar = focusTargetNode.f42880b.f42884f;
                LayoutNode layoutNodeG = C22421l.g(focusTargetNode);
                loop0: while (true) {
                    if (layoutNodeG == null) {
                        dVarB = null;
                        break;
                    }
                    if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                        while (dVar != null) {
                            if ((dVar.f42882d & 1024) != 0) {
                                dVarB = dVar;
                                androidx.compose.runtime.collection.e eVar = null;
                                while (dVarB != null) {
                                    if (dVarB instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                        int i13 = 0;
                                        for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                            if ((dVar2.f42882d & 1024) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    dVarB = dVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                    }
                                                    if (dVarB != null) {
                                                        eVar.b(dVarB);
                                                        dVarB = null;
                                                    }
                                                    eVar.b(dVar2);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
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
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarB;
                if (focusTargetNode2 == null) {
                    return CustomDestinationResult.f39092b;
                }
                int iOrdinal2 = focusTargetNode2.q0().ordinal();
                if (iOrdinal2 == 0) {
                    return d(focusTargetNode2, i12);
                }
                if (iOrdinal2 == 1) {
                    return e(focusTargetNode2, i12);
                }
                if (iOrdinal2 == 2) {
                    return CustomDestinationResult.f39093c;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                CustomDestinationResult customDestinationResultE = e(focusTargetNode2, i12);
                CustomDestinationResult customDestinationResult = customDestinationResultE != CustomDestinationResult.f39092b ? customDestinationResultE : null;
                return customDestinationResult == null ? d(focusTargetNode2, i12) : customDestinationResult;
            }
        }
        return CustomDestinationResult.f39092b;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(@Y61.k androidx.compose.ui.focus.FocusTargetNode r16) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.l0.f(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean g(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        v.d dVar;
        v.d dVarB;
        C22437t0 c22437t0;
        C22437t0 c22437t02;
        if (!focusTargetNode2.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = focusTargetNode2.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(focusTargetNode2);
        loop0: while (true) {
            dVar = null;
            if (layoutNodeG == null) {
                dVarB = null;
                break;
            }
            if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                while (dVar2 != null) {
                    if ((dVar2.f42882d & 1024) != 0) {
                        dVarB = dVar2;
                        androidx.compose.runtime.collection.e eVar = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i12 = 0;
                                for (v.d dVar3 = ((AbstractC22425n) dVarB).f40861q; dVar3 != null; dVar3 = dVar3.f42885g) {
                                    if ((dVar3.f42882d & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            dVarB = dVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar.b(dVar3);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar);
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t02 = layoutNodeG.f40615I) == null) ? null : c22437t02.f40877d;
        }
        if (!kotlin.jvm.internal.L.f(dVarB, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal == 0) {
            b(focusTargetNode2);
            focusTargetNode.t2(FocusStateImpl.f39119c);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return false;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (!focusTargetNode.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar4 = focusTargetNode.f42880b.f42884f;
            LayoutNode layoutNodeG2 = C22421l.g(focusTargetNode);
            loop4: while (true) {
                if (layoutNodeG2 == null) {
                    break;
                }
                if ((layoutNodeG2.f40615I.f40878e.f42883e & 1024) != 0) {
                    while (dVar4 != null) {
                        if ((dVar4.f42882d & 1024) != 0) {
                            v.d dVarB2 = dVar4;
                            androidx.compose.runtime.collection.e eVar2 = null;
                            while (dVarB2 != null) {
                                if (dVarB2 instanceof FocusTargetNode) {
                                    dVar = dVarB2;
                                    break loop4;
                                }
                                if ((dVarB2.f42882d & 1024) != 0 && (dVarB2 instanceof AbstractC22425n)) {
                                    int i13 = 0;
                                    for (v.d dVar5 = ((AbstractC22425n) dVarB2).f40861q; dVar5 != null; dVar5 = dVar5.f42885g) {
                                        if ((dVar5.f42882d & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                dVarB2 = dVar5;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (dVarB2 != null) {
                                                    eVar2.b(dVarB2);
                                                    dVarB2 = null;
                                                }
                                                eVar2.b(dVar5);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                dVarB2 = C22421l.b(eVar2);
                            }
                        }
                        dVar4 = dVar4.f42884f;
                    }
                }
                layoutNodeG2 = layoutNodeG2.K();
                dVar4 = (layoutNodeG2 == null || (c22437t0 = layoutNodeG2.f40615I) == null) ? null : c22437t0.f40877d;
            }
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVar;
            if (focusTargetNode3 != null || !C22421l.h(focusTargetNode).getFocusOwner().i()) {
                if (focusTargetNode3 == null || !g(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zG2 = g(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.q0() != FocusStateImpl.f39119c) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!zG2) {
                    return zG2;
                }
                focusTargetNode3.k2();
                return zG2;
            }
            b(focusTargetNode2);
            focusTargetNode.t2(FocusStateImpl.f39119c);
        } else {
            if (n0.c(focusTargetNode) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
            if (!(focusTargetNodeC != null ? a(focusTargetNodeC, false) : true)) {
                return false;
            }
            b(focusTargetNode2);
        }
        return true;
    }
}
