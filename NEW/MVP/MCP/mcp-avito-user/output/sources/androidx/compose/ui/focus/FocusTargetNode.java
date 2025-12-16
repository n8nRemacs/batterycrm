package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.collection.R0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.D0;
import androidx.compose.ui.node.E0;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import q0.C47175a;
import q0.InterfaceC47176b;
import s0.C47949a;

/* compiled from: FocusTargetNode.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0014Be\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012:\b\u0002\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/focus/g0;", "Landroidx/compose/ui/node/D0;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/focus/o0;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/f0;", "Lkotlin/S;", "name", "previous", "current", "Lkotlin/G0;", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(ILY41/p;LY41/l;Lkotlin/jvm/internal/w;)V", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetNode extends v.d implements InterfaceC22415i, g0, D0, androidx.compose.ui.modifier.k {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Y41.p<f0, f0, G0> f39124p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Y41.l<FocusTargetNode, G0> f39125q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39126r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39127s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public FocusStateImpl f39128t;

    /* renamed from: u, reason: collision with root package name */
    public final int f39129u;

    /* renamed from: v, reason: collision with root package name */
    public int f39130v;

    /* compiled from: FocusTargetNode.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FocusTargetElement extends AbstractC22430p0<FocusTargetNode> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final FocusTargetElement f39131b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final v.d a() {
            return new FocusTargetNode(0, null, null, 7, null);
        }

        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final /* bridge */ /* synthetic */ void b(v.d dVar) {
        }

        public final boolean equals(@Y61.l Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return 1739042953;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CustomDestinationResult customDestinationResult = CustomDestinationResult.f39092b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.f39092b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CustomDestinationResult customDestinationResult3 = CustomDestinationResult.f39092b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.f39118b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.f39118b;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.f39118b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<J> f39132l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39133m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<J> hVar, FocusTargetNode focusTargetNode) {
            super(0);
            this.f39132l = hVar;
            this.f39133m = focusTargetNode;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.ui.focus.K] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f39132l.f406842b = this.f39133m.m2();
            return G0.f406611a;
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            FocusTargetNode focusTargetNode = FocusTargetNode.this;
            if (focusTargetNode.f42880b.f42893o) {
                focusTargetNode.k2();
            }
            return G0.f406611a;
        }
    }

    public FocusTargetNode() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FocusTargetNode(int i12, Y41.p pVar, Y41.l lVar, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            o0.f39183b.getClass();
            i12 = o0.f39184c;
        }
        this(i12, (i13 & 2) != 0 ? null : pVar, (i13 & 4) != 0 ? null : lVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean o2(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            androidx.compose.ui.v$d r0 = r11.f42880b
            boolean r0 = r0.f42893o
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            s0.C47949a.b(r0)
        Lb:
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r1 = 16
            androidx.compose.ui.v$d[] r2 = new androidx.compose.ui.v.d[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.v$d r11 = r11.f42880b
            androidx.compose.ui.v$d r2 = r11.f42885g
            if (r2 != 0) goto L1f
            androidx.compose.ui.node.C22421l.a(r0, r11)
            goto L22
        L1f:
            r0.b(r2)
        L22:
            int r11 = r0.f38262d
            if (r11 == 0) goto Lad
            int r11 = r11 + (-1)
            java.lang.Object r11 = r0.k(r11)
            androidx.compose.ui.v$d r11 = (androidx.compose.ui.v.d) r11
            int r2 = r11.f42883e
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto La8
            r2 = r11
        L35:
            if (r2 == 0) goto La8
            int r4 = r2.f42882d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La5
            r4 = 0
            r5 = r2
            r6 = r4
        L40:
            if (r5 == 0) goto La5
            boolean r7 = r5 instanceof androidx.compose.ui.focus.FocusTargetNode
            r8 = 1
            if (r7 == 0) goto L6a
            androidx.compose.ui.focus.FocusTargetNode r5 = (androidx.compose.ui.focus.FocusTargetNode) r5
            boolean r7 = r5.s2()
            if (r7 != 0) goto L50
            goto La0
        L50:
            androidx.compose.ui.focus.FocusStateImpl r11 = r5.q0()
            int r11 = r11.ordinal()
            if (r11 == 0) goto L69
            if (r11 == r8) goto L69
            r2 = 2
            if (r11 == r2) goto L69
            r2 = 3
            if (r11 != r2) goto L63
            goto L22
        L63:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L69:
            return r8
        L6a:
            int r7 = r5.f42882d
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La0
            boolean r7 = r5 instanceof androidx.compose.ui.node.AbstractC22425n
            if (r7 == 0) goto La0
            r7 = r5
            androidx.compose.ui.node.n r7 = (androidx.compose.ui.node.AbstractC22425n) r7
            androidx.compose.ui.v$d r7 = r7.f40861q
            r9 = r3
        L7a:
            if (r7 == 0) goto L9d
            int r10 = r7.f42882d
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L9a
            int r9 = r9 + 1
            if (r9 != r8) goto L88
            r5 = r7
            goto L9a
        L88:
            if (r6 != 0) goto L91
            androidx.compose.runtime.collection.e r6 = new androidx.compose.runtime.collection.e
            androidx.compose.ui.v$d[] r10 = new androidx.compose.ui.v.d[r1]
            r6.<init>(r10, r3)
        L91:
            if (r5 == 0) goto L97
            r6.b(r5)
            r5 = r4
        L97:
            r6.b(r7)
        L9a:
            androidx.compose.ui.v$d r7 = r7.f42885g
            goto L7a
        L9d:
            if (r9 != r8) goto La0
            goto L40
        La0:
            androidx.compose.ui.v$d r5 = androidx.compose.ui.node.C22421l.b(r6)
            goto L40
        La5:
            androidx.compose.ui.v$d r2 = r2.f42885g
            goto L35
        La8:
            androidx.compose.ui.node.C22421l.a(r0, r11)
            goto L22
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.o2(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean p2(FocusTargetNode focusTargetNode) {
        C22437t0 c22437t0;
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = focusTargetNode.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(focusTargetNode);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 1024) != 0) {
                        v.d dVarB = dVar;
                        androidx.compose.runtime.collection.e eVar = null;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) dVarB;
                                if (focusTargetNode2.s2()) {
                                    int iOrdinal = focusTargetNode2.q0().ordinal();
                                    if (iOrdinal == 0) {
                                        return false;
                                    }
                                    if (iOrdinal == 1) {
                                        return true;
                                    }
                                    if (iOrdinal == 2 || iOrdinal == 3) {
                                        return false;
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                int i12 = 0;
                                for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                    if ((dVar2.f42882d & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
        return false;
    }

    @Override // androidx.compose.ui.focus.g0
    public final boolean C1(int i12) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zF2 = false;
            if (!m2().f39135a) {
                Trace.endSection();
                return false;
            }
            if (androidx.compose.ui.l.f40323d) {
                int iOrdinal = l0.e(this, i12).ordinal();
                if (iOrdinal == 0) {
                    zF2 = l0.f(this);
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        zF2 = true;
                    } else if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                k0 k0VarM = C22421l.h(this).getFocusOwner().getF39106h();
                c cVar = new c();
                try {
                    if (k0VarM.f39178c) {
                        k0.a(k0VarM);
                    }
                    k0VarM.f39178c = true;
                    k0VarM.f39177b.b(cVar);
                    int iOrdinal2 = l0.e(this, i12).ordinal();
                    if (iOrdinal2 == 0) {
                        zF2 = l0.f(this);
                    } else if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            zF2 = true;
                        } else if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } finally {
                    k0.b(k0VarM);
                }
            }
            return zF2;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        if (androidx.compose.ui.l.f40323d) {
            r2();
            return;
        }
        FocusStateImpl focusStateImplQ0 = q0();
        r2();
        if (focusStateImplQ0 != q0()) {
            k2();
        }
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        if (androidx.compose.ui.l.f40323d) {
            return;
        }
        C22421l.h(this).getFocusOwner().q(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // androidx.compose.ui.v.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d2() {
        /*
            r4 = this;
            androidx.compose.ui.focus.FocusStateImpl r0 = r4.q0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L3c
            goto L62
        L11:
            boolean r0 = androidx.compose.ui.l.f40323d
            if (r0 != 0) goto L62
            androidx.compose.ui.node.J0 r0 = androidx.compose.ui.node.C22421l.h(r4)
            androidx.compose.ui.focus.B r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.k0 r0 = r0.getF39106h()
            boolean r2 = r0.f39178c     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L2b
            androidx.compose.ui.focus.k0.a(r0)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            r1 = move-exception
            goto L38
        L2b:
            r0.f39178c = r1     // Catch: java.lang.Throwable -> L29
            androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.ui.focus.FocusStateImpl.f39121e     // Catch: java.lang.Throwable -> L29
            r4.t2(r1)     // Catch: java.lang.Throwable -> L29
            kotlin.G0 r1 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L29
            androidx.compose.ui.focus.k0.b(r0)
            goto L62
        L38:
            androidx.compose.ui.focus.k0.b(r0)
            throw r1
        L3c:
            androidx.compose.ui.node.J0 r0 = androidx.compose.ui.node.C22421l.h(r4)
            androidx.compose.ui.focus.B r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.e$a r2 = androidx.compose.ui.focus.C22220e.f39163b
            r2.getClass()
            int r2 = androidx.compose.ui.focus.C22220e.f39171j
            r3 = 0
            r0.k(r2, r1, r3)
            boolean r1 = androidx.compose.ui.l.f40323d
            if (r1 == 0) goto L57
            r0.n()
            goto L62
        L57:
            androidx.compose.ui.node.J0 r0 = androidx.compose.ui.node.C22421l.h(r4)
            androidx.compose.ui.focus.B r0 = r0.getFocusOwner()
            r0.q(r4)
        L62:
            r0 = 0
            r4.f39128t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.d2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.collection.e] */
    public final void k2() {
        C22437t0 c22437t0;
        Y41.p<f0, f0, G0> pVar;
        FocusStateImpl focusStateImpl = this.f39128t;
        if (focusStateImpl == null) {
            focusStateImpl = FocusStateImpl.f39121e;
        }
        FocusStateImpl focusStateImplQ0 = q0();
        if (focusStateImpl != focusStateImplQ0 && (pVar = this.f39124p) != null) {
            pVar.invoke(focusStateImpl, focusStateImplQ0);
        }
        v.d dVar = this.f42880b;
        if (!dVar.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = this.f42880b;
        LayoutNode layoutNodeG = C22421l.g(this);
        loop0: while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 5120) != 0) {
                while (dVar2 != null) {
                    int i12 = dVar2.f42882d;
                    if ((i12 & 5120) != 0) {
                        if (dVar2 != dVar && (i12 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i12 & 4096) != 0) {
                            AbstractC22425n abstractC22425nB = dVar2;
                            ?? eVar = 0;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof InterfaceC22224i) {
                                    InterfaceC22224i interfaceC22224i = (InterfaceC22224i) abstractC22425nB;
                                    interfaceC22224i.u(C22225j.a(interfaceC22224i));
                                } else if ((abstractC22425nB.f42882d & 4096) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar3 = abstractC22425nB.f40861q;
                                    int i13 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar3 != null) {
                                        if ((dVar3.f42882d & 4096) != 0) {
                                            i13++;
                                            eVar = eVar;
                                            if (i13 == 1) {
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
                                    if (i13 == 1) {
                                    }
                                }
                                abstractC22425nB = C22421l.b(eVar);
                            }
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        Y41.l<FocusTargetNode, G0> lVar = this.f39125q;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.e] */
    public final void l2(@Y61.k FocusStateImpl focusStateImpl, @Y61.k FocusStateImpl focusStateImpl2) {
        C22437t0 c22437t0;
        Y41.p<f0, f0, G0> pVar;
        B focusOwner = C22421l.h(this).getFocusOwner();
        FocusTargetNode focusTargetNodeB = focusOwner.getF39110l();
        if (!focusStateImpl.equals(focusStateImpl2) && (pVar = this.f39124p) != null) {
            pVar.invoke(focusStateImpl, focusStateImpl2);
        }
        v.d dVar = this.f42880b;
        if (!dVar.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = this.f42880b;
        LayoutNode layoutNodeG = C22421l.g(this);
        loop0: while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 5120) != 0) {
                while (dVar2 != null) {
                    int i12 = dVar2.f42882d;
                    if ((i12 & 5120) != 0) {
                        if (dVar2 != dVar && (i12 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i12 & 4096) != 0) {
                            AbstractC22425n abstractC22425nB = dVar2;
                            ?? eVar = 0;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof InterfaceC22224i) {
                                    InterfaceC22224i interfaceC22224i = (InterfaceC22224i) abstractC22425nB;
                                    if (focusTargetNodeB == focusOwner.getF39110l()) {
                                        interfaceC22224i.u(focusStateImpl2);
                                    }
                                } else if ((abstractC22425nB.f42882d & 4096) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar3 = abstractC22425nB.f40861q;
                                    int i13 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar3 != null) {
                                        if ((dVar3.f42882d & 4096) != 0) {
                                            i13++;
                                            eVar = eVar;
                                            if (i13 == 1) {
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
                                    if (i13 == 1) {
                                    }
                                }
                                abstractC22425nB = C22421l.b(eVar);
                            }
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        Y41.l<FocusTargetNode, G0> lVar = this.f39125q;
        if (lVar != null) {
            lVar.invoke(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.e] */
    @Y61.k
    public final K m2() {
        boolean z12;
        C22437t0 c22437t0;
        K k12 = new K();
        int i12 = o0.f39184c;
        int i13 = this.f39129u;
        if (o0.a(i13, i12)) {
            z12 = true;
        } else if (o0.a(i13, 0)) {
            int iA2 = ((InterfaceC47176b) C22417j.a(this, Q0.f41204m)).a();
            C47175a.f428938b.getClass();
            z12 = !(iA2 == C47175a.f428939c);
        } else {
            if (!o0.a(i13, o0.f39185d)) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z12 = false;
        }
        k12.f39135a = z12;
        v.d dVar = this.f42880b;
        if (!dVar.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar2 = this.f42880b;
        LayoutNode layoutNodeG = C22421l.g(this);
        loop0: while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 3072) != 0) {
                while (dVar2 != null) {
                    int i14 = dVar2.f42882d;
                    if ((i14 & 3072) != 0) {
                        if (dVar2 != dVar && (i14 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i14 & 2048) != 0) {
                            AbstractC22425n abstractC22425nB = dVar2;
                            ?? eVar = 0;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof N) {
                                    ((N) abstractC22425nB).E0(k12);
                                } else if ((abstractC22425nB.f42882d & 2048) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar3 = abstractC22425nB.f40861q;
                                    int i15 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar3 != null) {
                                        if ((dVar3.f42882d & 2048) != 0) {
                                            i15++;
                                            eVar = eVar;
                                            if (i15 == 1) {
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
                                    if (i15 == 1) {
                                    }
                                }
                                abstractC22425nB = C22421l.b(eVar);
                            }
                        }
                    }
                    dVar2 = dVar2.f42884f;
                }
            }
            layoutNodeG = layoutNodeG.K();
            dVar2 = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
        }
        return k12;
    }

    @Override // androidx.compose.ui.focus.g0
    @Y61.k
    /* renamed from: n2, reason: merged with bridge method [inline-methods] */
    public final FocusStateImpl q0() {
        C22437t0 c22437t0;
        if (!androidx.compose.ui.l.f40323d) {
            k0 k0VarA = j0.a(this);
            if (k0VarA != null) {
                if (androidx.compose.ui.l.f40323d) {
                    throw new IllegalStateException("uncommittedFocusState must not be accessed when isTrackFocusEnabled is on");
                }
                FocusStateImpl focusStateImplE = k0VarA.f39176a.e(this);
                if (focusStateImplE != null) {
                    return focusStateImplE;
                }
            }
            FocusStateImpl focusStateImpl = this.f39128t;
            return focusStateImpl == null ? FocusStateImpl.f39121e : focusStateImpl;
        }
        if (!this.f42893o) {
            return FocusStateImpl.f39121e;
        }
        B focusOwner = C22421l.h(this).getFocusOwner();
        FocusTargetNode focusTargetNodeB = focusOwner.getF39110l();
        if (focusTargetNodeB == null) {
            return FocusStateImpl.f39121e;
        }
        if (this == focusTargetNodeB) {
            return focusOwner.d() ? FocusStateImpl.f39120d : FocusStateImpl.f39118b;
        }
        if (focusTargetNodeB.f42893o) {
            if (!focusTargetNodeB.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar = focusTargetNodeB.f42880b.f42884f;
            LayoutNode layoutNodeG = C22421l.g(focusTargetNodeB);
            while (layoutNodeG != null) {
                if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                    while (dVar != null) {
                        if ((dVar.f42882d & 1024) != 0) {
                            v.d dVarB = dVar;
                            androidx.compose.runtime.collection.e eVar = null;
                            while (dVarB != null) {
                                if (dVarB instanceof FocusTargetNode) {
                                    if (this == ((FocusTargetNode) dVarB)) {
                                        return FocusStateImpl.f39119c;
                                    }
                                } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                    int i12 = 0;
                                    for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                        if ((dVar2.f42882d & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
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
        }
        return FocusStateImpl.f39121e;
    }

    public final void q2(@Y61.l FocusStateImpl focusStateImpl) {
        if (s2()) {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
        if (androidx.compose.ui.l.f40323d) {
            return;
        }
        k0 k0VarM = C22421l.h(this).getFocusOwner().getF39106h();
        try {
            if (k0VarM.f39178c) {
                k0.a(k0VarM);
            }
            k0VarM.f39178c = true;
            if (focusStateImpl == null) {
                focusStateImpl = (p2(this) && o2(this)) ? FocusStateImpl.f39119c : FocusStateImpl.f39121e;
            }
            t2(focusStateImpl);
            G0 g02 = G0.f406611a;
            k0.b(k0VarM);
        } catch (Throwable th2) {
            k0.b(k0VarM);
            throw th2;
        }
    }

    public final void r2() {
        if (!s2()) {
            q2(null);
        }
        int iOrdinal = q0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 2) {
            l0.h hVar = new l0.h();
            E0.a(this, new b(hVar, this));
            T t12 = hVar.f406842b;
            if ((t12 != 0 ? (J) t12 : null).getF39135a()) {
                return;
            }
            C22421l.h(this).getFocusOwner().u(true);
        }
    }

    public final boolean s2() {
        return androidx.compose.ui.l.f40323d || this.f39128t != null;
    }

    public final void t2(@Y61.k FocusStateImpl focusStateImpl) {
        boolean z12 = androidx.compose.ui.l.f40323d;
        if (z12) {
            return;
        }
        k0 k0VarM = C22421l.h(this).getFocusOwner().getF39106h();
        k0VarM.getClass();
        if (z12) {
            return;
        }
        R0<FocusTargetNode, FocusStateImpl> r02 = k0VarM.f39176a;
        FocusStateImpl focusStateImplE = r02.e(this);
        if (focusStateImplE == null) {
            focusStateImplE = FocusStateImpl.f39121e;
        }
        if (focusStateImplE != focusStateImpl) {
            k0VarM.f39179d++;
        }
        r02.m(this, focusStateImpl);
    }

    public FocusTargetNode(int i12, Y41.p pVar, Y41.l lVar, C42822w c42822w) {
        this.f39124p = pVar;
        this.f39125q = lVar;
        this.f39129u = i12;
    }
}
