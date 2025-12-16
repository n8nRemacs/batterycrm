package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: LookaheadPassDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/layout/K0;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/node/b;", "Landroidx/compose/ui/node/q0;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22404c0 extends androidx.compose.ui.layout.K0 implements InterfaceC22363h0, InterfaceC22401b, InterfaceC22432q0 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final T f40745g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40746h;

    /* renamed from: i, reason: collision with root package name */
    public int f40747i = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f40748j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public LayoutNode.UsageByParent f40749k = LayoutNode.UsageByParent.f40660d;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40750l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f40751m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f40752n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public C22712b f40753o;

    /* renamed from: p, reason: collision with root package name */
    public long f40754p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super InterfaceC22276o0, kotlin.G0> f40755q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public C22267c f40756r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public a f40757s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final W f40758t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C22404c0> f40759u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40760v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40761w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40762x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public Object f40763y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f40764z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LookaheadPassDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/c0$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c0$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40765b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f40766c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f40767d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f40768e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40769f;

        static {
            a aVar = new a("IsPlacedInLookahead", 0);
            f40765b = aVar;
            a aVar2 = new a("IsPlacedInApproach", 1);
            f40766c = aVar2;
            a aVar3 = new a("IsNotPlaced", 2);
            f40767d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f40768e = aVarArr;
            f40769f = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40768e.clone();
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c0$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f40651b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40651b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LayoutNode.LayoutState layoutState3 = LayoutNode.LayoutState.f40651b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LayoutNode.UsageByParent.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f40658b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.c0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AbstractC22400a0 f40771m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC22400a0 abstractC22400a0) {
            super(0);
            this.f40771m = abstractC22400a0;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22404c0 c22404c0 = C22404c0.this;
            T t12 = c22404c0.f40745g;
            t12.f40685h = 0;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                C22404c0 c22404c02 = layoutNodeArr[i13].f40616J.f40694q;
                c22404c02.f40747i = c22404c02.f40748j;
                c22404c02.f40748j = Integer.MAX_VALUE;
                if (c22404c02.f40749k == LayoutNode.UsageByParent.f40659c) {
                    c22404c02.f40749k = LayoutNode.UsageByParent.f40660d;
                }
            }
            c22404c0.N(C22406d0.f40774l);
            AbstractC22400a0 abstractC22400a0 = c22404c0.D().f40958U;
            T t13 = c22404c0.f40745g;
            if (abstractC22400a0 != null) {
                boolean z12 = abstractC22400a0.f40705i;
                List<LayoutNode> listC = t13.f40678a.C();
                int size = listC.size();
                for (int i14 = 0; i14 < size; i14++) {
                    AbstractC22400a0 f40580v = listC.get(i14).f40615I.f40876c.getF40958U();
                    if (f40580v != null) {
                        f40580v.f40705i = z12;
                    }
                }
            }
            this.f40771m.z0().u();
            if (c22404c0.D().f40958U != null) {
                List<LayoutNode> listC2 = t13.f40678a.C();
                int size2 = listC2.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    AbstractC22400a0 f40580v2 = listC2.get(i15).f40615I.f40876c.getF40958U();
                    if (f40580v2 != null) {
                        f40580v2.f40705i = false;
                    }
                }
            }
            androidx.compose.runtime.collection.e<LayoutNode> eVarO2 = t13.f40678a.O();
            LayoutNode[] layoutNodeArr2 = eVarO2.f38260b;
            int i16 = eVarO2.f38262d;
            for (int i17 = 0; i17 < i16; i17++) {
                C22404c0 c22404c03 = layoutNodeArr2[i17].f40616J.f40694q;
                int i18 = c22404c03.f40747i;
                int i19 = c22404c03.f40748j;
                if (i18 != i19 && i19 == Integer.MAX_VALUE) {
                    c22404c03.r0(true);
                }
            }
            c22404c0.N(C22408e0.f40780l);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LookaheadPassDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.c0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22401b, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f40772l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22401b interfaceC22401b) {
            interfaceC22401b.t().f40723c = false;
            return kotlin.G0.f406611a;
        }
    }

    public C22404c0(@Y61.k T t12) {
        this.f40745g = t12;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f40754p = 0L;
        this.f40757s = a.f40767d;
        this.f40758t = new W(this, null);
        this.f40759u = new androidx.compose.runtime.collection.e<>(new C22404c0[16], 0);
        this.f40760v = true;
        this.f40762x = true;
        this.f40763y = t12.f40693p.f40847t;
    }

    public final boolean B0(long j12) {
        long j13;
        T t12 = this.f40745g;
        if (t12.f40678a.f40625S) {
            C47949a.a("measure is called on a deactivated node");
        }
        LayoutNode layoutNode = t12.f40678a;
        LayoutNode layoutNodeK = layoutNode.K();
        layoutNode.f40614H = layoutNode.f40614H || (layoutNodeK != null && layoutNodeK.f40614H);
        if (!layoutNode.f40616J.f40682e) {
            C22712b c22712b = this.f40753o;
            if (c22712b == null ? false : C22712b.d(c22712b.f42843a, j12)) {
                AndroidComposeView androidComposeView = layoutNode.f40641q;
                if (androidComposeView != null) {
                    androidComposeView.o(layoutNode, true);
                }
                layoutNode.q0();
                return false;
            }
        }
        this.f40753o = C22712b.a(j12);
        q0(j12);
        this.f40758t.f40726f = false;
        N(d.f40772l);
        if (this.f40752n) {
            j13 = this.f40347d;
        } else {
            long j14 = BeduinInputModel.MIN_TEXT_VERSION;
            j13 = (j14 & 4294967295L) | (j14 << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
        }
        this.f40752n = true;
        AbstractC22400a0 f40580v = t12.a().getF40958U();
        if (!(f40580v != null)) {
            C47949a.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        C22404c0 c22404c0 = t12.f40694q;
        if (c22404c0 != null) {
            LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f40652c;
            T t13 = c22404c0.f40745g;
            t13.f40681d = layoutState;
            t13.f40682e = false;
            LayoutNode layoutNode2 = t13.f40678a;
            L0 snapshotObserver = S.a(layoutNode2).getSnapshotObserver();
            C22410f0 c22410f0 = new C22410f0(c22404c0, j12);
            snapshotObserver.getClass();
            if (layoutNode2.f40635k != null) {
                snapshotObserver.b(layoutNode2, snapshotObserver.f40587b, c22410f0);
            } else {
                snapshotObserver.b(layoutNode2, snapshotObserver.f40588c, c22410f0);
            }
            t13.f40683f = true;
            t13.f40684g = true;
            boolean zA2 = U.a(layoutNode2);
            C22418j0 c22418j0 = t13.f40693p;
            if (zA2) {
                c22418j0.f40851x = true;
                c22418j0.f40852y = true;
            } else {
                c22418j0.f40850w = true;
            }
            t13.f40681d = LayoutNode.LayoutState.f40655f;
        }
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        o0((f40580v.f40346c & 4294967295L) | (f40580v.f40345b << 32));
        return (((int) (j13 >> 32)) == f40580v.f40345b && ((int) (j13 & 4294967295L)) == f40580v.f40346c) ? false : true;
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void C() {
        this.f40761w = true;
        W w12 = this.f40758t;
        w12.i();
        T t12 = this.f40745g;
        boolean z12 = t12.f40683f;
        LayoutNode layoutNode = t12.f40678a;
        if (z12) {
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode2 = layoutNodeArr[i13];
                if (layoutNode2.f40616J.f40682e && layoutNode2.I() == LayoutNode.UsageByParent.f40658b) {
                    C22404c0 c22404c0 = layoutNode2.f40616J.f40694q;
                    if (c22404c0.B0((c22404c0 != null ? c22404c0.f40753o : null).f42843a)) {
                        LayoutNode.m0(layoutNode, false, 7);
                    }
                }
            }
        }
        AbstractC22400a0 abstractC22400a0 = D().f40958U;
        if (t12.f40684g || (!this.f40750l && !abstractC22400a0.f40705i && t12.f40683f)) {
            t12.f40683f = false;
            LayoutNode.LayoutState layoutState = t12.f40681d;
            t12.f40681d = LayoutNode.LayoutState.f40654e;
            J0 j0A = S.a(layoutNode);
            t12.h(false);
            L0 snapshotObserver = j0A.getSnapshotObserver();
            c cVar = new c(abstractC22400a0);
            snapshotObserver.getClass();
            if (layoutNode.f40635k != null) {
                snapshotObserver.b(layoutNode, snapshotObserver.f40593h, cVar);
            } else {
                snapshotObserver.b(layoutNode, snapshotObserver.f40590e, cVar);
            }
            t12.f40681d = layoutState;
            if (t12.f40690m && abstractC22400a0.f40705i) {
                requestLayout();
            }
            t12.f40684g = false;
        }
        if (w12.f40724d) {
            w12.f40725e = true;
        }
        if (w12.f40722b && w12.f()) {
            w12.h();
        }
        this.f40761w = false;
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.k
    public final C22448z D() {
        return this.f40745g.f40678a.f40615I.f40875b;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int G(int i12) {
        v0();
        return this.f40745g.a().getF40958U().G(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // androidx.compose.ui.layout.InterfaceC22363h0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.K0 I(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.node.T r0 = r5.f40745g
            androidx.compose.ui.node.LayoutNode r1 = r0.f40678a
            androidx.compose.ui.node.LayoutNode r1 = r1.K()
            r2 = 0
            if (r1 == 0) goto L10
            androidx.compose.ui.node.T r1 = r1.f40616J
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.f40681d
            goto L11
        L10:
            r1 = r2
        L11:
            androidx.compose.ui.node.LayoutNode$LayoutState r3 = androidx.compose.ui.node.LayoutNode.LayoutState.f40652c
            if (r1 == r3) goto L25
            androidx.compose.ui.node.LayoutNode r1 = r0.f40678a
            androidx.compose.ui.node.LayoutNode r1 = r1.K()
            if (r1 == 0) goto L21
            androidx.compose.ui.node.T r1 = r1.f40616J
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.f40681d
        L21:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.ui.node.LayoutNode.LayoutState.f40654e
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f40679b = r1
        L28:
            androidx.compose.ui.node.LayoutNode r1 = r0.f40678a
            androidx.compose.ui.node.LayoutNode r2 = r1.K()
            if (r2 == 0) goto L72
            androidx.compose.ui.node.LayoutNode$UsageByParent r3 = r5.f40749k
            androidx.compose.ui.node.LayoutNode$UsageByParent r4 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40660d
            if (r3 == r4) goto L40
            boolean r1 = r1.f40614H
            if (r1 == 0) goto L3b
            goto L40
        L3b:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            s0.C47949a.b(r1)
        L40:
            androidx.compose.ui.node.T r1 = r2.f40616J
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r1.f40681d
            int r2 = r2.ordinal()
            if (r2 == 0) goto L6d
            r3 = 1
            if (r2 == r3) goto L6d
            r3 = 2
            if (r2 == r3) goto L6a
            r3 = 3
            if (r2 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r1.f40681d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40659c
            goto L6f
        L6d:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40658b
        L6f:
            r5.f40749k = r1
            goto L76
        L72:
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40660d
            r5.f40749k = r1
        L76:
            androidx.compose.ui.node.LayoutNode r0 = r0.f40678a
            androidx.compose.ui.node.LayoutNode$UsageByParent r1 = r0.f40612F
            androidx.compose.ui.node.LayoutNode$UsageByParent r2 = androidx.compose.ui.node.LayoutNode.UsageByParent.f40660d
            if (r1 != r2) goto L81
            r0.q()
        L81:
            r5.B0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22404c0.I(long):androidx.compose.ui.layout.K0");
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void N(@Y61.k Y41.l<? super InterfaceC22401b, kotlin.G0> lVar) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = this.f40745g.f40678a.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            lVar.invoke(layoutNodeArr[i13].f40616J.f40694q);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void Q() {
        LayoutNode.m0(this.f40745g.f40678a, false, 7);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int R(int i12) {
        v0();
        return this.f40745g.a().getF40958U().R(i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.l
    public final InterfaceC22401b V() {
        T t12;
        LayoutNode layoutNodeK = this.f40745g.f40678a.K();
        if (layoutNodeK == null || (t12 = layoutNodeK.f40616J) == null) {
            return null;
        }
        return t12.f40694q;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int X(int i12) {
        v0();
        return this.f40745g.a().getF40958U().X(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22391w
    public final int b0(int i12) {
        v0();
        return this.f40745g.a().getF40958U().b0(i12);
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0
    public final int d0(@Y61.k AbstractC22348a abstractC22348a) {
        T t12 = this.f40745g;
        LayoutNode layoutNodeK = t12.f40678a.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.f40616J.f40681d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40652c;
        W w12 = this.f40758t;
        if (layoutState == layoutState2) {
            w12.f40723c = true;
        } else {
            LayoutNode layoutNodeK2 = t12.f40678a.K();
            if ((layoutNodeK2 != null ? layoutNodeK2.f40616J.f40681d : null) == LayoutNode.LayoutState.f40654e) {
                w12.f40724d = true;
            }
        }
        this.f40750l = true;
        int iD02 = t12.a().getF40958U().d0(abstractC22348a);
        this.f40750l = false;
        return iD02;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0, androidx.compose.ui.layout.InterfaceC22391w
    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Object getF40763y() {
        return this.f40763y;
    }

    @Override // androidx.compose.ui.layout.K0
    public final int f0() {
        return this.f40745g.a().getF40958U().f0();
    }

    @Override // androidx.compose.ui.layout.K0
    public final int g0() {
        return this.f40745g.a().getF40958U().g0();
    }

    @Override // androidx.compose.ui.layout.K0
    public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        z0(j12, lVar, null);
    }

    @Override // androidx.compose.ui.layout.K0
    public final void m0(long j12, float f12, @Y61.k C22267c c22267c) {
        z0(j12, null, c22267c);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    /* renamed from: r */
    public final boolean getF40848u() {
        return this.f40757s != a.f40767d;
    }

    public final void r0(boolean z12) {
        T t12 = this.f40745g;
        if (z12 && t12.f40680c) {
            return;
        }
        if (z12 || t12.f40680c) {
            this.f40757s = a.f40767d;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                layoutNodeArr[i13].f40616J.f40694q.r0(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    public final void requestLayout() {
        LayoutNode layoutNode = this.f40745g.f40678a;
        LayoutNode.d dVar = LayoutNode.f40602T;
        layoutNode.l0(false);
    }

    @Override // androidx.compose.ui.node.InterfaceC22401b
    @Y61.k
    public final AbstractC22399a t() {
        return this.f40758t;
    }

    public final void t0() {
        a aVar = this.f40757s;
        T t12 = this.f40745g;
        if (t12.f40680c) {
            this.f40757s = a.f40766c;
        } else {
            this.f40757s = a.f40765b;
        }
        a aVar2 = a.f40765b;
        LayoutNode layoutNode = t12.f40678a;
        if (aVar != aVar2 && t12.f40682e) {
            LayoutNode.m0(layoutNode, true, 6);
        }
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            C22404c0 c22404c0 = layoutNode2.f40616J.f40694q;
            if (c22404c0 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (c22404c0.f40748j != Integer.MAX_VALUE) {
                c22404c0.t0();
                LayoutNode.p0(layoutNode2);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22432q0
    public final void u(boolean z12) {
        AbstractC22400a0 f40580v;
        T t12 = this.f40745g;
        AbstractC22400a0 f40580v2 = t12.a().getF40958U();
        if (Boolean.valueOf(z12).equals(f40580v2 != null ? Boolean.valueOf(f40580v2.f40703g) : null) || (f40580v = t12.a().getF40958U()) == null) {
            return;
        }
        f40580v.f40703g = z12;
    }

    public final void u0() {
        T t12 = this.f40745g;
        if (t12.f40692o > 0) {
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = t12.f40678a.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode = layoutNodeArr[i13];
                T t13 = layoutNode.f40616J;
                if ((t13.f40690m || t13.f40691n) && !t13.f40683f) {
                    layoutNode.l0(false);
                }
                C22404c0 c22404c0 = t13.f40694q;
                if (c22404c0 != null) {
                    c22404c0.u0();
                }
            }
        }
    }

    public final void v0() {
        T t12 = this.f40745g;
        LayoutNode.m0(t12.f40678a, false, 7);
        LayoutNode layoutNode = t12.f40678a;
        LayoutNode layoutNodeK = layoutNode.K();
        if (layoutNodeK == null || layoutNode.f40612F != LayoutNode.UsageByParent.f40660d) {
            return;
        }
        int iOrdinal = layoutNodeK.f40616J.f40681d.ordinal();
        layoutNode.f40612F = iOrdinal != 0 ? iOrdinal != 2 ? layoutNodeK.f40612F : LayoutNode.UsageByParent.f40659c : LayoutNode.UsageByParent.f40658b;
    }

    public final void w0() {
        T t12;
        LayoutNode.LayoutState layoutState;
        this.f40764z = true;
        T t13 = this.f40745g;
        LayoutNode layoutNodeK = t13.f40678a.K();
        a aVar = this.f40757s;
        if ((aVar != a.f40765b && !t13.f40680c) || (aVar != a.f40766c && t13.f40680c)) {
            t0();
            if (this.f40746h && layoutNodeK != null) {
                layoutNodeK.l0(false);
            }
        }
        if (layoutNodeK == null) {
            this.f40748j = 0;
        } else if (!this.f40746h && ((layoutState = (t12 = layoutNodeK.f40616J).f40681d) == LayoutNode.LayoutState.f40653d || layoutState == LayoutNode.LayoutState.f40654e)) {
            if (this.f40748j != Integer.MAX_VALUE) {
                C47949a.b("Place was called on a node which was placed already");
            }
            int i12 = t12.f40685h;
            this.f40748j = i12;
            t12.f40685h = i12 + 1;
        }
        C();
    }

    public final void z0(long j12, Y41.l lVar, C22267c c22267c) {
        T t12 = this.f40745g;
        LayoutNode layoutNodeK = t12.f40678a.K();
        LayoutNode.LayoutState layoutState = layoutNodeK != null ? layoutNodeK.f40616J.f40681d : null;
        LayoutNode.LayoutState layoutState2 = LayoutNode.LayoutState.f40654e;
        if (layoutState == layoutState2) {
            t12.f40680c = false;
        }
        LayoutNode layoutNode = t12.f40678a;
        if (layoutNode.f40625S) {
            C47949a.a("place is called on a deactivated node");
        }
        t12.f40681d = layoutState2;
        this.f40751m = true;
        this.f40764z = false;
        if (!androidx.compose.ui.unit.q.c(j12, this.f40754p)) {
            if (t12.f40691n || t12.f40690m) {
                t12.f40683f = true;
            }
            u0();
        }
        J0 j0A = S.a(layoutNode);
        if (t12.f40683f || !getF40848u()) {
            t12.g(false);
            this.f40758t.f40727g = false;
            L0 snapshotObserver = j0A.getSnapshotObserver();
            C22412g0 c22412g0 = new C22412g0(this, j0A, j12);
            snapshotObserver.getClass();
            if (layoutNode.f40635k != null) {
                snapshotObserver.b(layoutNode, snapshotObserver.f40592g, c22412g0);
            } else {
                snapshotObserver.b(layoutNode, snapshotObserver.f40591f, c22412g0);
            }
        } else {
            AbstractC22400a0 f40580v = t12.a().getF40958U();
            f40580v.S0(androidx.compose.ui.unit.q.e(j12, f40580v.f40349f));
            w0();
        }
        this.f40754p = j12;
        this.f40755q = lVar;
        this.f40756r = c22267c;
        t12.f40681d = LayoutNode.LayoutState.f40655f;
    }
}
