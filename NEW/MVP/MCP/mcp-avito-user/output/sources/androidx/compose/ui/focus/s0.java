package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.layout.InterfaceC22368k;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import s0.C47949a;

/* compiled from: TwoDimensionalFocusSearch.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* compiled from: TwoDimensionalFocusSearch.kt */
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

    /* compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/k$a;", "", "invoke", "(Landroidx/compose/ui/layout/k$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22368k.a, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f39206l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k0 f39207m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39208n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39209o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l0.j f39210p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f39211q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<FocusTargetNode, Boolean> f39212r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, k0 k0Var, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, l0.j jVar, int i13, Y41.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f39206l = i12;
            this.f39207m = k0Var;
            this.f39208n = focusTargetNode;
            this.f39209o = focusTargetNode2;
            this.f39210p = jVar;
            this.f39211q = i13;
            this.f39212r = lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4.f39208n != androidx.compose.ui.node.C22421l.h(r1).getFocusOwner().b()) goto L15;
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
                androidx.compose.ui.focus.k0 r0 = r4.f39207m
                int r0 = r0.f39179d
                int r1 = r4.f39206l
                if (r1 != r0) goto L3a
                boolean r0 = androidx.compose.ui.l.f40323d
                androidx.compose.ui.focus.FocusTargetNode r1 = r4.f39209o
                if (r0 == 0) goto L21
                androidx.compose.ui.node.J0 r0 = androidx.compose.ui.node.C22421l.h(r1)
                androidx.compose.ui.focus.B r0 = r0.getFocusOwner()
                androidx.compose.ui.focus.FocusTargetNode r0 = r0.getF39110l()
                androidx.compose.ui.focus.FocusTargetNode r2 = r4.f39208n
                if (r2 == r0) goto L21
                goto L3a
            L21:
                Y41.l<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> r0 = r4.f39212r
                l0.j r2 = r4.f39210p
                int r3 = r4.f39211q
                boolean r0 = androidx.compose.ui.focus.s0.j(r3, r0, r1, r2)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s0.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r1 < r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(l0.j r18, l0.j r19, l0.j r20, int r21) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s0.a(l0.j, l0.j, l0.j, int):boolean");
    }

    public static final boolean b(int i12, l0.j jVar, l0.j jVar2) {
        boolean zB2;
        boolean zB3;
        C22220e.a aVar = C22220e.f39163b;
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39166e)) {
            zB2 = true;
        } else {
            aVar.getClass();
            zB2 = C22220e.b(i12, C22220e.f39167f);
        }
        if (!zB2) {
            aVar.getClass();
            if (C22220e.b(i12, C22220e.f39168g)) {
                zB3 = true;
            } else {
                aVar.getClass();
                zB3 = C22220e.b(i12, C22220e.f39169h);
            }
            if (!zB3) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (jVar.f413392c > jVar2.f413390a && jVar.f413390a < jVar2.f413392c) {
                return true;
            }
        } else if (jVar.f413393d > jVar2.f413391b && jVar.f413391b < jVar2.f413393d) {
            return true;
        }
        return false;
    }

    public static final void c(FocusTargetNode focusTargetNode, androidx.compose.runtime.collection.e eVar) {
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
                return;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarB;
                                if (focusTargetNode2.f42893o && !C22421l.g(focusTargetNode2).f40625S) {
                                    if (focusTargetNode2.m2().f39135a) {
                                        eVar.b(focusTargetNode2);
                                    } else {
                                        c(focusTargetNode2, eVar);
                                    }
                                }
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
    }

    public static final FocusTargetNode d(androidx.compose.runtime.collection.e<FocusTargetNode> eVar, l0.j jVar, int i12) {
        l0.j jVarM;
        C22220e.f39163b.getClass();
        if (C22220e.b(i12, C22220e.f39166e)) {
            jVarM = jVar.m((jVar.f413392c - jVar.f413390a) + 1, 0.0f);
        } else if (C22220e.b(i12, C22220e.f39167f)) {
            jVarM = jVar.m(-((jVar.f413392c - jVar.f413390a) + 1), 0.0f);
        } else if (C22220e.b(i12, C22220e.f39168g)) {
            jVarM = jVar.m(0.0f, (jVar.f413393d - jVar.f413391b) + 1);
        } else {
            if (!C22220e.b(i12, C22220e.f39169h)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            jVarM = jVar.m(0.0f, -((jVar.f413393d - jVar.f413391b) + 1));
        }
        FocusTargetNode[] focusTargetNodeArr = eVar.f38260b;
        int i13 = eVar.f38262d;
        FocusTargetNode focusTargetNode = null;
        for (int i14 = 0; i14 < i13; i14++) {
            FocusTargetNode focusTargetNode2 = focusTargetNodeArr[i14];
            if (n0.d(focusTargetNode2)) {
                l0.j jVarB = n0.b(focusTargetNode2);
                if (g(jVarB, jVarM, jVar, i12)) {
                    focusTargetNode = focusTargetNode2;
                    jVarM = jVarB;
                }
            }
        }
        return focusTargetNode;
    }

    public static final boolean e(@Y61.k FocusTargetNode focusTargetNode, int i12, @Y61.k Y41.l<? super FocusTargetNode, Boolean> lVar) {
        l0.j jVar;
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new FocusTargetNode[16], 0);
        c(focusTargetNode, eVar);
        int i13 = eVar.f38262d;
        if (i13 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i13 == 0 ? null : eVar.f38260b[0]);
            if (focusTargetNode2 != null) {
                return lVar.invoke(focusTargetNode2).booleanValue();
            }
            return false;
        }
        C22220e.f39163b.getClass();
        if (C22220e.b(i12, C22220e.f39170i)) {
            i12 = C22220e.f39167f;
        }
        if (C22220e.b(i12, C22220e.f39167f) ? true : C22220e.b(i12, C22220e.f39169h)) {
            l0.j jVarB = n0.b(focusTargetNode);
            float f12 = jVarB.f413390a;
            float f13 = jVarB.f413391b;
            jVar = new l0.j(f12, f13, f12, f13);
        } else {
            if (!(C22220e.b(i12, C22220e.f39166e) ? true : C22220e.b(i12, C22220e.f39168g))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            l0.j jVarB2 = n0.b(focusTargetNode);
            float f14 = jVarB2.f413392c;
            float f15 = jVarB2.f413393d;
            jVar = new l0.j(f14, f15, f14, f15);
        }
        FocusTargetNode focusTargetNodeD = d(eVar, jVar, i12);
        if (focusTargetNodeD != null) {
            return lVar.invoke(focusTargetNodeD).booleanValue();
        }
        return false;
    }

    public static final boolean f(int i12, Y41.l lVar, FocusTargetNode focusTargetNode, l0.j jVar) {
        if (j(i12, lVar, focusTargetNode, jVar)) {
            return true;
        }
        k0 k0VarM = C22421l.h(focusTargetNode).getFocusOwner().getF39106h();
        Boolean bool = (Boolean) C22216a.a(focusTargetNode, i12, new b(k0VarM.f39179d, k0VarM, C22421l.h(focusTargetNode).getFocusOwner().getF39110l(), focusTargetNode, jVar, i12, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean g(@Y61.k l0.j jVar, @Y61.k l0.j jVar2, @Y61.k l0.j jVar3, int i12) {
        if (h(i12, jVar, jVar3)) {
            return !h(i12, jVar2, jVar3) || a(jVar3, jVar, jVar2, i12) || (!a(jVar3, jVar2, jVar, i12) && i(i12, jVar3, jVar) < i(i12, jVar3, jVar2));
        }
        return false;
    }

    public static final boolean h(int i12, l0.j jVar, l0.j jVar2) {
        C22220e.a aVar = C22220e.f39163b;
        aVar.getClass();
        if (C22220e.b(i12, C22220e.f39166e)) {
            float f12 = jVar2.f413392c;
            float f13 = jVar.f413392c;
            float f14 = jVar2.f413390a;
            if ((f12 <= f13 && f14 < f13) || f14 <= jVar.f413390a) {
                return false;
            }
        } else {
            aVar.getClass();
            if (C22220e.b(i12, C22220e.f39167f)) {
                float f15 = jVar2.f413390a;
                float f16 = jVar.f413390a;
                float f17 = jVar2.f413392c;
                if ((f15 >= f16 && f17 > f16) || f17 >= jVar.f413392c) {
                    return false;
                }
            } else {
                aVar.getClass();
                if (C22220e.b(i12, C22220e.f39168g)) {
                    float f18 = jVar2.f413393d;
                    float f19 = jVar.f413393d;
                    float f22 = jVar2.f413391b;
                    if ((f18 <= f19 && f22 < f19) || f22 <= jVar.f413391b) {
                        return false;
                    }
                } else {
                    aVar.getClass();
                    if (!C22220e.b(i12, C22220e.f39169h)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    float f23 = jVar2.f413391b;
                    float f24 = jVar.f413391b;
                    float f25 = jVar2.f413393d;
                    if ((f23 >= f24 && f25 > f24) || f25 >= jVar.f413393d) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final long i(int i12, l0.j jVar, l0.j jVar2) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        C22220e.a aVar = C22220e.f39163b;
        aVar.getClass();
        int i13 = C22220e.f39166e;
        if (C22220e.b(i12, i13)) {
            f12 = jVar.f413390a;
            f13 = jVar2.f413392c;
        } else if (C22220e.b(i12, C22220e.f39167f)) {
            f12 = jVar2.f413390a;
            f13 = jVar.f413392c;
        } else if (C22220e.b(i12, C22220e.f39168g)) {
            f12 = jVar.f413391b;
            f13 = jVar2.f413393d;
        } else {
            if (!C22220e.b(i12, C22220e.f39169h)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f12 = jVar2.f413391b;
            f13 = jVar.f413393d;
        }
        float f18 = f12 - f13;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        }
        long j12 = (long) f18;
        aVar.getClass();
        if (C22220e.b(i12, i13) ? true : C22220e.b(i12, C22220e.f39167f)) {
            float f19 = jVar.f413393d;
            float f22 = jVar.f413391b;
            f14 = 2;
            f15 = ((f19 - f22) / f14) + f22;
            f16 = jVar2.f413393d;
            f17 = jVar2.f413391b;
        } else {
            if (!(C22220e.b(i12, C22220e.f39168g) ? true : C22220e.b(i12, C22220e.f39169h))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f23 = jVar.f413392c;
            float f24 = jVar.f413390a;
            f14 = 2;
            f15 = ((f23 - f24) / f14) + f24;
            f16 = jVar2.f413392c;
            f17 = jVar2.f413390a;
        }
        long j13 = (long) (f15 - (((f16 - f17) / f14) + f17));
        return (j13 * j13) + (13 * j12 * j12);
    }

    public static final boolean j(int i12, Y41.l lVar, FocusTargetNode focusTargetNode, l0.j jVar) {
        FocusTargetNode focusTargetNodeD;
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
            int i13 = eVar2.f38262d;
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
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarB;
                                if (focusTargetNode2.f42893o) {
                                    eVar.b(focusTargetNode2);
                                }
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i14 = 0;
                                for (v.d dVar3 = ((AbstractC22425n) dVarB).f40861q; dVar3 != null; dVar3 = dVar3.f42885g) {
                                    if ((dVar3.f42882d & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
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
        while (eVar.f38262d != 0 && (focusTargetNodeD = d(eVar, jVar, i12)) != null) {
            if (focusTargetNodeD.m2().f39135a) {
                return ((Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNodeD)).booleanValue();
            }
            if (f(i12, lVar, focusTargetNodeD, jVar)) {
                return true;
            }
            eVar.j(focusTargetNodeD);
        }
        return false;
    }

    @Y61.l
    public static final Boolean k(int i12, @Y61.k Y41.l lVar, @Y61.k FocusTargetNode focusTargetNode, @Y61.l l0.j jVar) {
        int iOrdinal = focusTargetNode.q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeC = n0.c(focusTargetNode);
                if (focusTargetNodeC == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeC.q0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolK = k(i12, lVar, focusTargetNodeC, jVar);
                        if (!kotlin.jvm.internal.L.f(boolK, Boolean.FALSE)) {
                            return boolK;
                        }
                        if (jVar == null) {
                            if (focusTargetNodeC.q0() != FocusStateImpl.f39119c) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode focusTargetNodeA = n0.a(focusTargetNodeC);
                            if (focusTargetNodeA == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            jVar = n0.b(focusTargetNodeA);
                        }
                        return Boolean.valueOf(f(i12, lVar, focusTargetNode, jVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (jVar == null) {
                    jVar = n0.b(focusTargetNodeC);
                }
                return Boolean.valueOf(f(i12, lVar, focusTargetNode, jVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.m2().f39135a ? (Boolean) ((FocusOwnerImpl.e) lVar).invoke(focusTargetNode) : jVar == null ? Boolean.valueOf(e(focusTargetNode, i12, lVar)) : Boolean.valueOf(j(i12, lVar, focusTargetNode, jVar));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(e(focusTargetNode, i12, lVar));
    }
}
