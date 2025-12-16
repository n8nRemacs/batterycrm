package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.I0;
import androidx.collection.N0;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import okhttp3.internal.http2.Http2;
import s0.C47949a;

/* compiled from: FocusOwnerImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/B;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<C22220e, l0.j, Boolean> f39099a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22220e, Boolean> f39100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f39101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<l0.j> f39102d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<LayoutDirection> f39103e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FocusTargetNode f39104f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C22231p f39105g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final k0 f39106h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FocusOwnerImpl$modifier$1 f39107i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public I0 f39108j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final N0<InterfaceC22232q> f39109k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public FocusTargetNode f39110l;

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CustomDestinationResult customDestinationResult = CustomDestinationResult.f39092b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CustomDestinationResult customDestinationResult2 = CustomDestinationResult.f39092b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CustomDestinationResult customDestinationResult3 = CustomDestinationResult.f39092b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) this.receiver;
            focusOwnerImpl.getClass();
            if ((androidx.compose.ui.l.f40323d && focusOwnerImpl.f39110l == null) || focusOwnerImpl.f39104f.q0() == FocusStateImpl.f39121e) {
                focusOwnerImpl.f39101c.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.f0 {
        @Override // kotlin.jvm.internal.f0, kotlin.reflect.o
        public final Object get() {
            return ((FocusOwnerImpl) this.receiver).f39104f.q0();
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.W {
        @Override // kotlin.jvm.internal.W, kotlin.reflect.o
        public final Object get() {
            return ((FocusOwnerImpl) this.receiver).f39110l;
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39111l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ FocusOwnerImpl f39112m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f39113n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, Y41.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f39111l = focusTargetNode;
            this.f39112m = focusOwnerImpl;
            this.f39113n = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            FocusTargetNode focusTargetNode2 = focusTargetNode;
            if (kotlin.jvm.internal.L.f(focusTargetNode2, this.f39111l)) {
                zBooleanValue = false;
            } else {
                if (kotlin.jvm.internal.L.f(focusTargetNode2, this.f39112m.f39104f)) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = ((Boolean) this.f39113n.invoke(focusTargetNode2)).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/focus/FocusTargetNode;", "invoke", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<FocusTargetNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<Boolean> f39114l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f39115m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l0.h<Boolean> hVar, int i12) {
            super(1);
            this.f39114l = hVar;
            this.f39115m = i12;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
        @Override // Y41.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zC1 = focusTargetNode.C1(this.f39115m);
            this.f39114l.f406842b = Boolean.valueOf(zC1);
            return Boolean.valueOf(zC1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public FocusOwnerImpl(@Y61.k Y41.l<? super Y41.a<G0>, G0> lVar, @Y61.k Y41.p<? super C22220e, ? super l0.j, Boolean> pVar, @Y61.k Y41.l<? super C22220e, Boolean> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<l0.j> aVar2, @Y61.k Y41.a<? extends LayoutDirection> aVar3) {
        this.f39099a = pVar;
        this.f39100b = lVar2;
        this.f39101c = aVar;
        this.f39102d = aVar2;
        this.f39103e = aVar3;
        o0.f39183b.getClass();
        this.f39104f = new FocusTargetNode(o0.f39185d, null, null, 6, null);
        this.f39105g = new C22231p(lVar, new b(0, this, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0), new c(this, FocusOwnerImpl.class, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;", 0), new d(this, FocusOwnerImpl.class, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;", 0));
        this.f39106h = new k0();
        this.f39107i = new AbstractC22430p0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.AbstractC22430p0
            public final v.d a() {
                return this.f39116b.f39104f;
            }

            @Override // androidx.compose.ui.node.AbstractC22430p0
            public final /* bridge */ /* synthetic */ void b(v.d dVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f39116b.f39104f.hashCode();
            }
        };
        this.f39109k = new N0<>(1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // androidx.compose.ui.focus.B
    public final boolean a(@Y61.k KeyEvent keyEvent) {
        androidx.compose.ui.input.key.j jVar;
        int size;
        C22437t0 c22437t0;
        AbstractC22425n abstractC22425nB;
        C22437t0 c22437t02;
        if (this.f39105g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = n0.a(this.f39104f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar = focusTargetNodeA.f42880b;
            LayoutNode layoutNodeG = C22421l.g(focusTargetNodeA);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    abstractC22425nB = 0;
                    break;
                }
                if ((layoutNodeG.f40615I.f40878e.f42883e & 131072) != 0) {
                    while (dVar != null) {
                        if ((dVar.f42882d & 131072) != 0) {
                            ?? eVar = 0;
                            abstractC22425nB = dVar;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof androidx.compose.ui.input.key.j) {
                                    break loop0;
                                }
                                if ((abstractC22425nB.f42882d & 131072) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar2 = abstractC22425nB.f40861q;
                                    int i12 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar2 != null) {
                                        if ((dVar2.f42882d & 131072) != 0) {
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
                dVar = (layoutNodeG == null || (c22437t02 = layoutNodeG.f40615I) == null) ? null : c22437t02.f40877d;
            }
            jVar = (androidx.compose.ui.input.key.j) abstractC22425nB;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            if (!jVar.getF42880b().f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar3 = jVar.getF42880b().f42884f;
            LayoutNode layoutNodeG2 = C22421l.g(jVar);
            ArrayList arrayList = null;
            while (layoutNodeG2 != null) {
                if ((layoutNodeG2.f40615I.f40878e.f42883e & 131072) != 0) {
                    while (dVar3 != null) {
                        if ((dVar3.f42882d & 131072) != 0) {
                            v.d dVarB = dVar3;
                            androidx.compose.runtime.collection.e eVar2 = null;
                            while (dVarB != null) {
                                if (dVarB instanceof androidx.compose.ui.input.key.j) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVarB);
                                } else if ((dVarB.f42882d & 131072) != 0 && (dVarB instanceof AbstractC22425n)) {
                                    int i13 = 0;
                                    for (v.d dVar4 = ((AbstractC22425n) dVarB).f40861q; dVar4 != null; dVar4 = dVar4.f42885g) {
                                        if ((dVar4.f42882d & 131072) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                dVarB = dVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (dVarB != null) {
                                                    eVar2.b(dVarB);
                                                    dVarB = null;
                                                }
                                                eVar2.b(dVar4);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                dVarB = C22421l.b(eVar2);
                            }
                        }
                        dVar3 = dVar3.f42884f;
                    }
                }
                layoutNodeG2 = layoutNodeG2.K();
                dVar3 = (layoutNodeG2 == null || (c22437t0 = layoutNodeG2.f40615I) == null) ? null : c22437t0.f40877d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i14 = size - 1;
                    if (((androidx.compose.ui.input.key.j) arrayList.get(size)).T0(keyEvent)) {
                        return true;
                    }
                    if (i14 < 0) {
                        break;
                    }
                    size = i14;
                }
            }
            AbstractC22425n f42880b = jVar.getF42880b();
            ?? eVar3 = 0;
            while (f42880b != 0) {
                if (f42880b instanceof androidx.compose.ui.input.key.j) {
                    if (((androidx.compose.ui.input.key.j) f42880b).T0(keyEvent)) {
                        return true;
                    }
                } else if ((f42880b.f42882d & 131072) != 0 && (f42880b instanceof AbstractC22425n)) {
                    v.d dVar5 = f42880b.f40861q;
                    int i15 = 0;
                    f42880b = f42880b;
                    eVar3 = eVar3;
                    while (dVar5 != null) {
                        if ((dVar5.f42882d & 131072) != 0) {
                            i15++;
                            eVar3 = eVar3;
                            if (i15 == 1) {
                                f42880b = dVar5;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (f42880b != 0) {
                                    eVar3.b(f42880b);
                                    f42880b = 0;
                                }
                                eVar3.b(dVar5);
                            }
                        }
                        dVar5 = dVar5.f42885g;
                        f42880b = f42880b;
                        eVar3 = eVar3;
                    }
                    if (i15 == 1) {
                    }
                }
                f42880b = C22421l.b(eVar3);
            }
            AbstractC22425n f42880b2 = jVar.getF42880b();
            ?? eVar4 = 0;
            while (f42880b2 != 0) {
                if (f42880b2 instanceof androidx.compose.ui.input.key.j) {
                    if (((androidx.compose.ui.input.key.j) f42880b2).f1(keyEvent)) {
                        return true;
                    }
                } else if ((f42880b2.f42882d & 131072) != 0 && (f42880b2 instanceof AbstractC22425n)) {
                    v.d dVar6 = f42880b2.f40861q;
                    int i16 = 0;
                    f42880b2 = f42880b2;
                    eVar4 = eVar4;
                    while (dVar6 != null) {
                        if ((dVar6.f42882d & 131072) != 0) {
                            i16++;
                            eVar4 = eVar4;
                            if (i16 == 1) {
                                f42880b2 = dVar6;
                            } else {
                                if (eVar4 == 0) {
                                    eVar4 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (f42880b2 != 0) {
                                    eVar4.b(f42880b2);
                                    f42880b2 = 0;
                                }
                                eVar4.b(dVar6);
                            }
                        }
                        dVar6 = dVar6.f42885g;
                        f42880b2 = f42880b2;
                        eVar4 = eVar4;
                    }
                    if (i16 == 1) {
                    }
                }
                f42880b2 = C22421l.b(eVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    if (((androidx.compose.ui.input.key.j) arrayList.get(i17)).f1(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final FocusTargetNode getF39110l() {
        return this.f39110l;
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final FocusOwnerImpl$modifier$1 getF39107i() {
        return this.f39107i;
    }

    @Override // androidx.compose.ui.focus.B
    public final boolean d() {
        return false;
    }

    @Override // androidx.compose.ui.focus.B
    public final void f(@Y61.l FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.f39110l;
        this.f39110l = focusTargetNode;
        if (androidx.compose.ui.l.f40322c) {
            N0<InterfaceC22232q> n02 = this.f39109k;
            Object[] objArr = n02.f25659a;
            int i12 = n02.f25660b;
            for (int i13 = 0; i13 < i12; i13++) {
                ((InterfaceC22232q) objArr[i13]).a(focusTargetNode2, focusTargetNode);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:3:0x0008, B:5:0x0011, B:10:0x001f, B:14:0x0029, B:17:0x0034, B:19:0x003a, B:20:0x003f, B:22:0x0047, B:24:0x004c, B:26:0x0052, B:30:0x0058, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d8, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c2, B:159:0x01cb, B:160:0x01cf, B:161:0x01d2, B:165:0x01dd, B:166:0x01e0, B:168:0x01e6, B:170:0x01ea, B:173:0x01f1, B:175:0x01f9, B:182:0x0210, B:183:0x0212, B:184:0x0220, B:186:0x0224, B:188:0x0228, B:215:0x027d, B:192:0x0234, B:194:0x023d, B:196:0x0241, B:198:0x0248, B:200:0x024e, B:202:0x0251, B:203:0x0254, B:205:0x025a, B:206:0x0261, B:208:0x0269, B:209:0x026e, B:211:0x0274, B:212:0x0277, B:216:0x0288, B:220:0x0298, B:221:0x02a6, B:223:0x02aa, B:225:0x02ae, B:252:0x0303, B:229:0x02ba, B:231:0x02c3, B:233:0x02c7, B:235:0x02ce, B:237:0x02d4, B:239:0x02d7, B:240:0x02da, B:242:0x02e0, B:243:0x02e7, B:245:0x02ef, B:246:0x02f4, B:248:0x02fa, B:249:0x02fd, B:254:0x0310, B:256:0x0317, B:261:0x0329, B:262:0x032b, B:34:0x0060, B:36:0x0066, B:37:0x0069, B:39:0x0071, B:42:0x007d, B:46:0x0087, B:77:0x00d9, B:79:0x00dd, B:49:0x008c, B:51:0x0092, B:53:0x0096, B:55:0x009e, B:57:0x00a4, B:61:0x00ab, B:63:0x00b4, B:64:0x00b8, B:65:0x00bb, B:68:0x00c1, B:69:0x00c6, B:70:0x00c9, B:72:0x00cf, B:74:0x00d3, B:80:0x00e3, B:82:0x00e9, B:83:0x00ec, B:85:0x00f6, B:88:0x0102, B:92:0x010c, B:123:0x015e, B:125:0x0162, B:95:0x0111, B:97:0x0117, B:99:0x011b, B:101:0x0123, B:103:0x0129, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:267:0x0008 }] */
    /* JADX WARN: Type inference failed for: r10v17, types: [T, androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r15v11, types: [T, androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r15v14, types: [T, androidx.compose.ui.v$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [T, androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r1v22, types: [T, androidx.compose.ui.v$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r8v34, types: [T, androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47 */
    @Override // androidx.compose.ui.focus.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(@Y61.k android.view.KeyEvent r14, @Y61.k Y41.a<java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.g(android.view.KeyEvent, Y41.a):boolean");
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.l
    public final l0.j getFocusRect() {
        FocusTargetNode focusTargetNodeA = n0.a(this.f39104f);
        if (focusTargetNodeA != null) {
            return n0.b(focusTargetNodeA);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.r
    public final boolean h(int i12) {
        boolean z12 = androidx.compose.ui.l.f40320a;
        l0.h hVar = new l0.h();
        hVar.f406842b = Boolean.FALSE;
        k0 k0Var = this.f39106h;
        int i13 = k0Var.f39179d;
        FocusTargetNode focusTargetNode = this.f39110l;
        Boolean boolT = t(i12, this.f39102d.invoke(), new f(hVar, i12));
        int i14 = k0Var.f39179d;
        Boolean bool = Boolean.TRUE;
        if (kotlin.jvm.internal.L.f(boolT, bool) && (i13 != i14 || (androidx.compose.ui.l.f40323d && focusTargetNode != this.f39110l))) {
            return true;
        }
        if (boolT == null || hVar.f406842b == 0) {
            return false;
        }
        if (boolT.equals(bool) && kotlin.jvm.internal.L.f(hVar.f406842b, bool)) {
            return true;
        }
        if (!E.a(i12)) {
            return this.f39100b.invoke(C22220e.a(i12)).booleanValue();
        }
        if (k(i12, false, false)) {
            Boolean boolT2 = t(i12, null, new D(i12));
            if (boolT2 != null ? boolT2.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.B
    public final boolean i() {
        return this.f39099a.invoke(null, null).booleanValue();
    }

    @Override // androidx.compose.ui.focus.B
    public final void j(@Y61.k N n12) {
        C22231p c22231p = this.f39105g;
        c22231p.c(c22231p.f39195i, n12);
    }

    @Override // androidx.compose.ui.focus.B
    public final boolean k(int i12, boolean z12, boolean z13) {
        int iOrdinal;
        int iOrdinal2;
        boolean z14 = androidx.compose.ui.l.f40323d;
        FocusTargetNode focusTargetNode = this.f39104f;
        boolean zA2 = false;
        if (!z14) {
            k0 k0Var = this.f39106h;
            C c12 = C.f39091l;
            try {
                if (k0Var.f39178c) {
                    k0.a(k0Var);
                }
                k0Var.f39178c = true;
                if (c12 != null) {
                    k0Var.f39177b.b(c12);
                }
                if (z12 || ((iOrdinal = l0.c(focusTargetNode, i12).ordinal()) != 1 && iOrdinal != 2 && iOrdinal != 3)) {
                    zA2 = l0.a(focusTargetNode, z12);
                }
                k0.b(k0Var);
            } catch (Throwable th2) {
                k0.b(k0Var);
                throw th2;
            }
        } else if (z12 || (iOrdinal2 = l0.c(focusTargetNode, i12).ordinal()) == 0) {
            v(z12);
            zA2 = true;
        } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (zA2 && z13) {
            this.f39101c.invoke();
        }
        return zA2;
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.k
    public final N0<InterfaceC22232q> l() {
        return this.f39109k;
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.k
    /* renamed from: m, reason: from getter */
    public final k0 getF39106h() {
        return this.f39106h;
    }

    @Override // androidx.compose.ui.focus.B
    public final void n() {
        C22231p c22231p = this.f39105g;
        if (c22231p.f39197k) {
            return;
        }
        c22231p.f39187a.invoke(new C22230o(0, c22231p, C22231p.class, "invalidateNodes", "invalidateNodes()V", 0));
        c22231p.f39197k = true;
    }

    @Override // androidx.compose.ui.focus.B
    public final void o(@Y61.k InterfaceC22224i interfaceC22224i) {
        C22231p c22231p = this.f39105g;
        c22231p.getClass();
        if (!androidx.compose.ui.l.f40323d) {
            c22231p.c(c22231p.f39194h, interfaceC22224i);
        } else {
            if (!c22231p.f39192f.e(interfaceC22224i) || c22231p.f39197k) {
                return;
            }
            c22231p.f39187a.invoke(new C22230o(0, c22231p, C22231p.class, "invalidateNodes", "invalidateNodes()V", 0));
            c22231p.f39197k = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r15v10, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r15v5, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.compose.ui.focus.B
    public final boolean p(@Y61.k androidx.compose.ui.input.rotary.d dVar, @Y61.k Y41.a<Boolean> aVar) {
        androidx.compose.ui.input.rotary.b bVar;
        int size;
        C22437t0 c22437t0;
        AbstractC22425n abstractC22425nB;
        C22437t0 c22437t02;
        if (this.f39105g.b()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeA = n0.a(this.f39104f);
        if (focusTargetNodeA != null) {
            if (!focusTargetNodeA.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar2 = focusTargetNodeA.f42880b;
            LayoutNode layoutNodeG = C22421l.g(focusTargetNodeA);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    abstractC22425nB = 0;
                    break;
                }
                if ((layoutNodeG.f40615I.f40878e.f42883e & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (dVar2 != null) {
                        if ((dVar2.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            ?? eVar = 0;
                            abstractC22425nB = dVar2;
                            while (abstractC22425nB != 0) {
                                if (abstractC22425nB instanceof androidx.compose.ui.input.rotary.b) {
                                    break loop0;
                                }
                                if ((abstractC22425nB.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                    v.d dVar3 = abstractC22425nB.f40861q;
                                    int i12 = 0;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                    while (dVar3 != null) {
                                        if ((dVar3.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
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
                dVar2 = (layoutNodeG == null || (c22437t02 = layoutNodeG.f40615I) == null) ? null : c22437t02.f40877d;
            }
            bVar = (androidx.compose.ui.input.rotary.b) abstractC22425nB;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            if (!bVar.getF42880b().f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar4 = bVar.getF42880b().f42884f;
            LayoutNode layoutNodeG2 = C22421l.g(bVar);
            ArrayList arrayList = null;
            while (layoutNodeG2 != null) {
                if ((layoutNodeG2.f40615I.f40878e.f42883e & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                    while (dVar4 != null) {
                        if ((dVar4.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            v.d dVarB = dVar4;
                            androidx.compose.runtime.collection.e eVar2 = null;
                            while (dVarB != null) {
                                if (dVarB instanceof androidx.compose.ui.input.rotary.b) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(dVarB);
                                } else if ((dVarB.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (dVarB instanceof AbstractC22425n)) {
                                    int i13 = 0;
                                    for (v.d dVar5 = ((AbstractC22425n) dVarB).f40861q; dVar5 != null; dVar5 = dVar5.f42885g) {
                                        if ((dVar5.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                dVarB = dVar5;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (dVarB != null) {
                                                    eVar2.b(dVarB);
                                                    dVarB = null;
                                                }
                                                eVar2.b(dVar5);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                dVarB = C22421l.b(eVar2);
                            }
                        }
                        dVar4 = dVar4.f42884f;
                    }
                }
                layoutNodeG2 = layoutNodeG2.K();
                dVar4 = (layoutNodeG2 == null || (c22437t0 = layoutNodeG2.f40615I) == null) ? null : c22437t0.f40877d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i14 = size - 1;
                    if (((androidx.compose.ui.input.rotary.b) arrayList.get(size)).G1(dVar)) {
                        return true;
                    }
                    if (i14 < 0) {
                        break;
                    }
                    size = i14;
                }
            }
            AbstractC22425n f42880b = bVar.getF42880b();
            ?? eVar3 = 0;
            while (f42880b != 0) {
                if (f42880b instanceof androidx.compose.ui.input.rotary.b) {
                    if (((androidx.compose.ui.input.rotary.b) f42880b).G1(dVar)) {
                        return true;
                    }
                } else if ((f42880b.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (f42880b instanceof AbstractC22425n)) {
                    v.d dVar6 = f42880b.f40861q;
                    int i15 = 0;
                    f42880b = f42880b;
                    eVar3 = eVar3;
                    while (dVar6 != null) {
                        if ((dVar6.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i15++;
                            eVar3 = eVar3;
                            if (i15 == 1) {
                                f42880b = dVar6;
                            } else {
                                if (eVar3 == 0) {
                                    eVar3 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (f42880b != 0) {
                                    eVar3.b(f42880b);
                                    f42880b = 0;
                                }
                                eVar3.b(dVar6);
                            }
                        }
                        dVar6 = dVar6.f42885g;
                        f42880b = f42880b;
                        eVar3 = eVar3;
                    }
                    if (i15 == 1) {
                    }
                }
                f42880b = C22421l.b(eVar3);
            }
            if (aVar.invoke().booleanValue()) {
                return true;
            }
            AbstractC22425n f42880b2 = bVar.getF42880b();
            ?? eVar4 = 0;
            while (f42880b2 != 0) {
                if (f42880b2 instanceof androidx.compose.ui.input.rotary.b) {
                    if (((androidx.compose.ui.input.rotary.b) f42880b2).F0(dVar)) {
                        return true;
                    }
                } else if ((f42880b2.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0 && (f42880b2 instanceof AbstractC22425n)) {
                    v.d dVar7 = f42880b2.f40861q;
                    int i16 = 0;
                    eVar4 = eVar4;
                    f42880b2 = f42880b2;
                    while (dVar7 != null) {
                        if ((dVar7.f42882d & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                            i16++;
                            eVar4 = eVar4;
                            if (i16 == 1) {
                                f42880b2 = dVar7;
                            } else {
                                if (eVar4 == 0) {
                                    eVar4 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                }
                                if (f42880b2 != 0) {
                                    eVar4.b(f42880b2);
                                    f42880b2 = 0;
                                }
                                eVar4.b(dVar7);
                            }
                        }
                        dVar7 = dVar7.f42885g;
                        eVar4 = eVar4;
                        f42880b2 = f42880b2;
                    }
                    if (i16 == 1) {
                    }
                }
                f42880b2 = C22421l.b(eVar4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    if (((androidx.compose.ui.input.rotary.b) arrayList.get(i17)).F0(dVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.B
    public final void q(@Y61.k FocusTargetNode focusTargetNode) {
        C22231p c22231p = this.f39105g;
        c22231p.getClass();
        if (!androidx.compose.ui.l.f40323d) {
            c22231p.c(c22231p.f39193g, focusTargetNode);
        } else {
            if (!c22231p.f39191e.e(focusTargetNode) || c22231p.f39197k) {
                return;
            }
            c22231p.f39187a.invoke(new C22230o(0, c22231p, C22231p.class, "invalidateNodes", "invalidateNodes()V", 0));
            c22231p.f39197k = true;
        }
    }

    @Override // androidx.compose.ui.focus.B
    @Y61.k
    public final FocusStateImpl r() {
        return this.f39104f.q0();
    }

    @Override // androidx.compose.ui.focus.B
    public final void s() {
        boolean z12 = androidx.compose.ui.l.f40323d;
        FocusTargetNode focusTargetNode = this.f39104f;
        if (z12) {
            l0.a(focusTargetNode, true);
            return;
        }
        k0 k0Var = this.f39106h;
        if (k0Var.f39178c) {
            l0.a(focusTargetNode, true);
            return;
        }
        try {
            k0Var.f39178c = true;
            l0.a(focusTargetNode, true);
        } finally {
            k0.b(k0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r10v18, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.ui.focus.B
    @Y61.l
    public final Boolean t(int i12, @Y61.l l0.j jVar, @Y61.k Y41.l<? super FocusTargetNode, Boolean> lVar) {
        C22437t0 c22437t0;
        boolean zA2;
        S s5;
        S s12;
        FocusTargetNode focusTargetNode = this.f39104f;
        FocusTargetNode focusTargetNodeA = n0.a(focusTargetNode);
        Y41.a<LayoutDirection> aVar = this.f39103e;
        FocusTargetNode focusTargetNode2 = null;
        if (focusTargetNodeA != null) {
            LayoutDirection layoutDirection = (LayoutDirection) ((kotlin.jvm.internal.V) aVar).get();
            K kM2 = focusTargetNodeA.m2();
            C22220e.f39163b.getClass();
            if (C22220e.b(i12, C22220e.f39164c)) {
                s12 = kM2.f39136b;
            } else if (C22220e.b(i12, C22220e.f39165d)) {
                s12 = kM2.f39137c;
            } else if (C22220e.b(i12, C22220e.f39168g)) {
                s12 = kM2.f39138d;
            } else if (C22220e.b(i12, C22220e.f39169h)) {
                s12 = kM2.f39139e;
            } else if (C22220e.b(i12, C22220e.f39166e)) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal == 0) {
                    s12 = kM2.f39142h;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s12 = kM2.f39143i;
                }
                S.f39148b.getClass();
                if (s12 == S.f39149c) {
                    s12 = null;
                }
                if (s12 == null) {
                    s12 = kM2.f39140f;
                }
            } else if (C22220e.b(i12, C22220e.f39167f)) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    s12 = kM2.f39143i;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s12 = kM2.f39142h;
                }
                S.f39148b.getClass();
                if (s12 == S.f39149c) {
                    s12 = null;
                }
                if (s12 == null) {
                    s12 = kM2.f39141g;
                }
            } else {
                int i13 = C22220e.f39170i;
                if (!(C22220e.b(i12, i13) ? true : C22220e.b(i12, C22220e.f39171j))) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                C22217b c22217b = new C22217b(i12, null);
                k0 k0VarA = j0.a(focusTargetNodeA);
                int i14 = k0VarA != null ? k0VarA.f39179d : 0;
                B focusOwner = C22421l.h(focusTargetNodeA).getFocusOwner();
                FocusTargetNode f39110l = focusOwner.getF39110l();
                if (C22220e.b(i12, i13)) {
                    kM2.f39144j.invoke(c22217b);
                } else {
                    kM2.f39145k.invoke(c22217b);
                }
                int i15 = k0VarA != null ? k0VarA.f39179d : 0;
                if (c22217b.f39157b) {
                    S.f39148b.getClass();
                    s5 = S.f39150d;
                } else if (i14 != i15 || (androidx.compose.ui.l.f40323d && f39110l != focusOwner.getF39110l())) {
                    S.f39148b.getClass();
                    s5 = S.f39151e;
                } else {
                    S.f39148b.getClass();
                    s5 = S.f39149c;
                }
                s12 = s5;
            }
            S.f39148b.getClass();
            if (kotlin.jvm.internal.L.f(s12, S.f39150d)) {
                return null;
            }
            if (kotlin.jvm.internal.L.f(s12, S.f39151e)) {
                FocusTargetNode focusTargetNodeA2 = n0.a(focusTargetNode);
                if (focusTargetNodeA2 != null) {
                    return lVar.invoke(focusTargetNodeA2);
                }
                return null;
            }
            if (!kotlin.jvm.internal.L.f(s12, S.f39149c)) {
                return Boolean.valueOf(s12.a(lVar));
            }
        } else {
            focusTargetNodeA = null;
        }
        LayoutDirection layoutDirection2 = (LayoutDirection) ((kotlin.jvm.internal.V) aVar).get();
        e eVar = new e(focusTargetNodeA, this, lVar);
        C22220e.f39163b.getClass();
        int i16 = C22220e.f39164c;
        if (C22220e.b(i12, i16) ? true : C22220e.b(i12, C22220e.f39165d)) {
            if (C22220e.b(i12, i16)) {
                zA2 = r0.b(focusTargetNode, eVar);
            } else {
                if (!C22220e.b(i12, C22220e.f39165d)) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zA2 = r0.a(focusTargetNode, eVar);
            }
            return Boolean.valueOf(zA2);
        }
        int i17 = C22220e.f39166e;
        if (C22220e.b(i12, i17) ? true : C22220e.b(i12, C22220e.f39167f) ? true : C22220e.b(i12, C22220e.f39168g) ? true : C22220e.b(i12, C22220e.f39169h)) {
            return s0.k(i12, eVar, focusTargetNode, jVar);
        }
        if (C22220e.b(i12, C22220e.f39170i)) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 == 0) {
                i17 = C22220e.f39167f;
            } else if (iOrdinal3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetNode focusTargetNodeA3 = n0.a(focusTargetNode);
            if (focusTargetNodeA3 != null) {
                return s0.k(i17, eVar, focusTargetNodeA3, jVar);
            }
            return null;
        }
        if (!C22220e.b(i12, C22220e.f39171j)) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C22220e.c(i12))).toString());
        }
        FocusTargetNode focusTargetNodeA4 = n0.a(focusTargetNode);
        if (focusTargetNodeA4 != null) {
            if (!focusTargetNodeA4.f42880b.f42893o) {
                C47949a.b("visitAncestors called on an unattached node");
            }
            v.d dVar = focusTargetNodeA4.f42880b.f42884f;
            LayoutNode layoutNodeG = C22421l.g(focusTargetNodeA4);
            loop0: while (true) {
                if (layoutNodeG == null) {
                    break;
                }
                if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                    while (dVar != null) {
                        if ((dVar.f42882d & 1024) != 0) {
                            v.d dVarB = dVar;
                            androidx.compose.runtime.collection.e eVar2 = null;
                            while (dVarB != null) {
                                if (dVarB instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) dVarB;
                                    if (focusTargetNode3.m2().f39135a) {
                                        focusTargetNode2 = focusTargetNode3;
                                        break loop0;
                                    }
                                } else if ((dVarB.f42882d & 1024) != 0 && (dVarB instanceof AbstractC22425n)) {
                                    int i18 = 0;
                                    for (v.d dVar2 = ((AbstractC22425n) dVarB).f40861q; dVar2 != null; dVar2 = dVar2.f42885g) {
                                        if ((dVar2.f42882d & 1024) != 0) {
                                            i18++;
                                            if (i18 == 1) {
                                                dVarB = dVar2;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                                }
                                                if (dVarB != null) {
                                                    eVar2.b(dVarB);
                                                    dVarB = null;
                                                }
                                                eVar2.b(dVar2);
                                            }
                                        }
                                    }
                                    if (i18 != 1) {
                                        dVarB = C22421l.b(eVar2);
                                    }
                                }
                                dVarB = C22421l.b(eVar2);
                            }
                        }
                        dVar = dVar.f42884f;
                    }
                }
                layoutNodeG = layoutNodeG.K();
                dVar = (layoutNodeG == null || (c22437t0 = layoutNodeG.f40615I) == null) ? null : c22437t0.f40877d;
            }
        }
        return Boolean.valueOf((focusTargetNode2 == null || focusTargetNode2.equals(focusTargetNode)) ? false : ((Boolean) eVar.invoke(focusTargetNode2)).booleanValue());
    }

    @Override // androidx.compose.ui.focus.r
    public final void u(boolean z12) {
        C22220e.f39163b.getClass();
        k(C22220e.f39171j, z12, true);
    }

    public final boolean v(boolean z12) {
        C22437t0 c22437t0;
        FocusTargetNode focusTargetNode = this.f39110l;
        if (focusTargetNode == null) {
            return true;
        }
        f(null);
        focusTargetNode.l2(FocusStateImpl.f39118b, FocusStateImpl.f39121e);
        if (!focusTargetNode.f42880b.f42893o) {
            C47949a.b("visitAncestors called on an unattached node");
        }
        v.d dVar = focusTargetNode.f42880b.f42884f;
        LayoutNode layoutNodeG = C22421l.g(focusTargetNode);
        while (layoutNodeG != null) {
            if ((layoutNodeG.f40615I.f40878e.f42883e & 1024) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 1024) != 0) {
                        androidx.compose.runtime.collection.e eVar = null;
                        v.d dVarB = dVar;
                        while (dVarB != null) {
                            if (dVarB instanceof FocusTargetNode) {
                                ((FocusTargetNode) dVarB).l2(FocusStateImpl.f39119c, FocusStateImpl.f39121e);
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
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
        int iB2 = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.f40069b.getClass();
        if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40071d)) {
            I0 i02 = this.f39108j;
            if (i02 == null) {
                i02 = new I0(3);
                this.f39108j = i02;
            }
            i02.d(jA2);
        } else if (androidx.compose.ui.input.key.d.a(iB2, androidx.compose.ui.input.key.d.f40070c)) {
            I0 i03 = this.f39108j;
            if (i03 == null || !i03.a(jA2)) {
                return false;
            }
            I0 i04 = this.f39108j;
            if (i04 != null) {
                i04.e(jA2);
            }
        }
        return true;
    }
}
