package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.layout.InterfaceC22368k;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import s0.C47949a;

/* compiled from: OneDimensionalFocusSearch.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.f39118b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.f39118b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.f39118b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: OneDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/k$a;", "", "invoke", "(Landroidx/compose/ui/layout/k$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22368k.a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f39199l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k0 f39200m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39201n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39202o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39203p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f39204q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<FocusTargetNode, Boolean> f39205r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, k0 k0Var, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i13, Y41.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f39199l = i12;
            this.f39200m = k0Var;
            this.f39201n = focusTargetNode;
            this.f39202o = focusTargetNode2;
            this.f39203p = focusTargetNode3;
            this.f39204q = i13;
            this.f39205r = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4.f39201n != androidx.compose.ui.node.C22421l.h(r1).getFocusOwner().getF39110l()) goto L15;
         */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(androidx.compose.ui.layout.InterfaceC22368k.a r5) {
            /*
                r4 = this;
                androidx.compose.ui.layout.k$a r5 = (androidx.compose.ui.layout.InterfaceC22368k.a) r5
                androidx.compose.ui.focus.k0 r0 = r4.f39200m
                int r0 = r0.f39179d
                int r1 = r4.f39199l
                if (r1 != r0) goto L3a
                boolean r0 = androidx.compose.ui.l.f40323d
                androidx.compose.ui.focus.FocusTargetNode r1 = r4.f39202o
                if (r0 == 0) goto L21
                androidx.compose.ui.node.J0 r0 = androidx.compose.ui.node.C22421l.h(r1)
                androidx.compose.ui.focus.B r0 = r0.getFocusOwner()
                androidx.compose.ui.focus.FocusTargetNode r0 = r0.getF39110l()
                androidx.compose.ui.focus.FocusTargetNode r2 = r4.f39201n
                if (r2 == r0) goto L21
                goto L3a
            L21:
                Y41.l<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r0 = r4.f39205r
                androidx.compose.ui.focus.FocusTargetNode r2 = r4.f39203p
                int r3 = r4.f39204q
                boolean r0 = androidx.compose.ui.focus.r0.f(r1, r2, r3, r0)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                if (r0 != 0) goto L3c
                boolean r5 = r5.a()
                if (r5 != 0) goto L38
                goto L3c
            L38:
                r1 = 0
                goto L3c
            L3a:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
            L3c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.r0.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(FocusTargetNode focusTargetNode, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(focusTargetNodeC, lVar)) {
                        C22220e.f39163b.getClass();
                        if (!c(focusTargetNode, focusTargetNodeC, C22220e.f39165d, lVar) && (!focusTargetNodeC.m2().f39135a || !((Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNodeC)).booleanValue())) {
                            return false;
                        }
                    }
                }
                C22220e.f39163b.getClass();
                return c(focusTargetNode, focusTargetNodeC, C22220e.f39165d, lVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!d(focusTargetNode, lVar)) {
                    if (!(focusTargetNode.m2().f39135a ? ((Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNode)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return d(focusTargetNode, lVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                if (b(focusTargetNodeC, lVar)) {
                    return true;
                }
                C22220e.f39163b.getClass();
                return c(focusTargetNode, focusTargetNodeC, C22220e.f39164c, lVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.m2().f39135a ? ((Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNode)).booleanValue() : e(focusTargetNode, lVar);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return e(focusTargetNode, lVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i12, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        if (f(focusTargetNode, focusTargetNode2, i12, lVar)) {
            return true;
        }
        k0 f39106h = C22421l.h(focusTargetNode).getFocusOwner().getF39106h();
        Boolean bool = (Boolean) C22216a.a(focusTargetNode, i12, new b(f39106h.f39179d, f39106h, C22421l.h(focusTargetNode).getFocusOwner().getF39110l(), focusTargetNode, focusTargetNode2, i12, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new FocusTargetNode[16], 0);
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar = focusTargetNode.f42880b;
        v.d dVar2 = dVar.f42885g;
        if (dVar2 == null) {
            C22421l.a(eVar2, dVar);
        } else {
            eVar2.b(dVar2);
        }
        while (true) {
            int i12 = eVar2.f38262d;
            if (i12 == 0) {
                break;
            }
            v.d dVarB = (v.d) eVar2.k(i12 - 1);
            if ((dVarB.f42883e & 1024) == 0) {
                C22421l.a(eVar2, dVarB);
            } else {
                while (true) {
                    if (dVarB == null) {
                        break;
                    }
                    if ((dVarB.f42882d & 1024) != 0) {
                        androidx.compose.runtime.collection.e eVar3 = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                eVar.b((FocusTargetNode) dVarB);
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i13 = 0;
                                for (v.d dVar3 = ((AbstractC22425n) dVarB).f40861q; dVar3 != null; dVar3 = dVar3.f42885g) {
                                    if ((dVar3.f42882d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            dVarB = dVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar3.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar3.b(dVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar3);
                        }
                    } else {
                        dVarB = dVarB.f42885g;
                    }
                }
            }
        }
        eVar.n(p0.f39198b);
        int i14 = eVar.f38262d - 1;
        Object[] objArr = eVar.f38260b;
        if (i14 < objArr.length) {
            while (i14 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i14];
                if (n0.d(focusTargetNode2) && a(focusTargetNode2, lVar)) {
                    return true;
                }
                i14--;
            }
        }
        return false;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new FocusTargetNode[16], 0);
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar = focusTargetNode.f42880b;
        v.d dVar2 = dVar.f42885g;
        if (dVar2 == null) {
            C22421l.a(eVar2, dVar);
        } else {
            eVar2.b(dVar2);
        }
        while (true) {
            int i12 = eVar2.f38262d;
            if (i12 == 0) {
                break;
            }
            v.d dVarB = (v.d) eVar2.k(i12 - 1);
            if ((dVarB.f42883e & 1024) == 0) {
                C22421l.a(eVar2, dVarB);
            } else {
                while (true) {
                    if (dVarB == null) {
                        break;
                    }
                    if ((dVarB.f42882d & 1024) != 0) {
                        androidx.compose.runtime.collection.e eVar3 = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                eVar.b((FocusTargetNode) dVarB);
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i13 = 0;
                                for (v.d dVar3 = ((AbstractC22425n) dVarB).f40861q; dVar3 != null; dVar3 = dVar3.f42885g) {
                                    if ((dVar3.f42882d & 1024) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            dVarB = dVar3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar3.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar3.b(dVar3);
                                        }
                                    }
                                }
                                if (i13 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar3);
                        }
                    } else {
                        dVarB = dVarB.f42885g;
                    }
                }
            }
        }
        eVar.n(p0.f39198b);
        Object[] objArr = eVar.f38260b;
        int i14 = eVar.f38262d;
        for (int i15 = 0; i15 < i14; i15++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i15];
            if (n0.d(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean f(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i12, Y41.l<? super FocusTargetNode, Boolean> lVar) {
        v.d dVar;
        C22437t0 c22437t0;
        if (focusTargetNode.q0() != FocusStateImpl.f39119c) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new FocusTargetNode[16], 0);
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar2 = focusTargetNode.f42880b;
        v.d dVar3 = dVar2.f42885g;
        if (dVar3 == null) {
            C22421l.a(eVar2, dVar2);
        } else {
            eVar2.b(dVar3);
        }
        while (true) {
            int i13 = eVar2.f38262d;
            dVar = null;
            if (i13 == 0) {
                break;
            }
            v.d dVarB = (v.d) eVar2.k(i13 - 1);
            if ((dVarB.f42883e & 1024) == 0) {
                C22421l.a(eVar2, dVarB);
            } else {
                while (true) {
                    if (dVarB == null) {
                        break;
                    }
                    if ((dVarB.f42882d & 1024) != 0) {
                        androidx.compose.runtime.collection.e eVar3 = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                eVar.b((FocusTargetNode) dVarB);
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i14 = 0;
                                for (v.d dVar4 = ((AbstractC22425n) dVarB).f40861q; dVar4 != null; dVar4 = dVar4.f42885g) {
                                    if ((dVar4.f42882d & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            dVarB = dVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (dVarB != null) {
                                                eVar3.b(dVarB);
                                                dVarB = null;
                                            }
                                            eVar3.b(dVar4);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            dVarB = C22421l.b(eVar3);
                        }
                    } else {
                        dVarB = dVarB.f42885g;
                    }
                }
            }
        }
        eVar.n(p0.f39198b);
        C22220e.f39163b.getClass();
        if (C22220e.b(i12, C22220e.f39164c)) {
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, eVar.f38262d);
            int i15 = lVarR.f406905b;
            int i16 = lVarR.f406906c;
            if (i15 <= i16) {
                boolean z12 = false;
                while (true) {
                    if (z12) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) eVar.f38260b[i15];
                        if (n0.d(focusTargetNode3) && b(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.L.f(eVar.f38260b[i15], focusTargetNode2)) {
                        z12 = true;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            if (!C22220e.b(i12, C22220e.f39165d)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            kotlin.ranges.l lVarR2 = kotlin.ranges.s.r(0, eVar.f38262d);
            int i17 = lVarR2.f406905b;
            int i18 = lVarR2.f406906c;
            if (i17 <= i18) {
                boolean z13 = false;
                while (true) {
                    if (z13) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) eVar.f38260b[i18];
                        if (n0.d(focusTargetNode4) && a(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.L.f(eVar.f38260b[i18], focusTargetNode2)) {
                        z13 = true;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18--;
                }
            }
        }
        C22220e.f39163b.getClass();
        if (!C22220e.b(i12, C22220e.f39164c) && focusTargetNode.m2().f39135a) {
            if (!focusTargetNode.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar5 = focusTargetNode.f42880b.f42884f;
            LayoutNode layoutNodeG = C22421l.g(focusTargetNode);
            loop5: while (true) {
                if (layoutNodeG == null) {
                    break;
                }
                if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                    while (dVar5 != null) {
                        if ((dVar5.f42882d & 1024) != 0) {
                            v.d dVarB2 = dVar5;
                            androidx.compose.runtime.collection.e eVar4 = null;
                            while (dVarB2 != null) {
                                if (dVarB2 instanceof FocusTargetNode) {
                                    dVar = dVarB2;
                                    break loop5;
                                }
                                if ((dVarB2.f42882d & 1024) != 0 && (dVarB2 instanceof AbstractC22425n)) {
                                    int i19 = 0;
                                    for (v.d dVar6 = ((AbstractC22425n) dVarB2).f40861q; dVar6 != null; dVar6 = dVar6.f42885g) {
                                        if ((dVar6.f42882d & 1024) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                dVarB2 = dVar6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (dVarB2 != null) {
                                                    eVar4.b(dVarB2);
                                                    dVarB2 = null;
                                                }
                                                eVar4.b(dVar6);
                                            }
                                        }
                                    }
                                    if (i19 == 1) {
                                    }
                                }
                                dVarB2 = C22421l.b(eVar4);
                            }
                        }
                        dVar5 = dVar5.f42884f;
                    }
                }
                layoutNodeG = layoutNodeG.K();
                dVar5 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
            }
            if (dVar != null) {
                return ((Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }
}
