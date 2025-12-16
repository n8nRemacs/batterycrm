package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.q;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import s0.C47949a;

/* compiled from: LookaheadDelegate.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/X;", "Landroidx/compose/ui/layout/K0;", "Landroidx/compose/ui/node/m0;", "Landroidx/compose/ui/node/q0;", "<init>", "()V", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class X extends androidx.compose.ui.layout.K0 implements InterfaceC22424m0, InterfaceC22432q0 {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<O0, kotlin.G0> f40702m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40703g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f40705i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final K0.a f40706j = androidx.compose.ui.layout.L0.a(this);

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public androidx.collection.L0<androidx.compose.ui.layout.Q0> f40707k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.collection.L0<androidx.compose.ui.layout.Q0> f40708l;

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/O0;", "result", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/O0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<O0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40709l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(O0 o02) {
            O0 o03 = o02;
            if (o03.n1()) {
                o03.f40670c.t0(o03);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/X$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/O0;", "Lkotlin/G0;", "onCommitAffectingRuler", "LY41/l;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LookaheadDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ O0 f40710l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ X f40711m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(O0 o02, X x12) {
            super(0);
            this.f40710l = o02;
            this.f40711m = x12;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            Y41.l<androidx.compose.ui.layout.R0, kotlin.G0> lVarV = this.f40710l.f40669b.v();
            if (lVarV != null) {
                X x12 = this.f40711m;
                x12.getClass();
                lVarV.invoke(new Z(x12));
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new b(null);
        f40702m = a.f40709l;
    }

    public static void E0(@Y61.k AbstractC22443w0 abstractC22443w0) {
        O o12;
        AbstractC22443w0 abstractC22443w02 = abstractC22443w0.f40912q;
        LayoutNode layoutNode = abstractC22443w02 != null ? abstractC22443w02.f40909n : null;
        LayoutNode layoutNode2 = abstractC22443w0.f40909n;
        if (!kotlin.jvm.internal.L.f(layoutNode, layoutNode2)) {
            layoutNode2.f40616J.f40693p.f40853z.g();
            return;
        }
        InterfaceC22401b interfaceC22401bV = layoutNode2.f40616J.f40693p.V();
        if (interfaceC22401bV == null || (o12 = ((C22418j0) interfaceC22401bV).f40853z) == null) {
            return;
        }
        o12.g();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22369k0
    @Y61.k
    public final InterfaceC22367j0 A1(int i12, int i13, @Y61.k Map map, @Y61.k Y41.l lVar) {
        if ((i12 & (-16777216)) != 0 || ((-16777216) & i13) != 0) {
            C47949a.b("Size(" + i12 + " x " + i13 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new Y(i12, i13, map, lVar, this);
    }

    @Y61.l
    public abstract X B0();

    /* renamed from: D0 */
    public abstract long getF40898A();

    public abstract void F0();

    @Override // androidx.compose.ui.layout.InterfaceC22393x
    public boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22375n0
    public final int d0(@Y61.k AbstractC22348a abstractC22348a) {
        int iR02;
        long j12;
        if (!w0() || (iR02 = r0(abstractC22348a)) == Integer.MIN_VALUE) {
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (abstractC22348a instanceof g1) {
            long j13 = this.f40349f;
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j12 = j13 >> 32;
        } else {
            long j14 = this.f40349f;
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j12 = j14 & 4294967295L;
        }
        return iR02 + ((int) j12);
    }

    public abstract int r0(@Y61.k AbstractC22348a abstractC22348a);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        r34 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ff, code lost:
    
        r3 = r4.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if (r4.f25563f != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011b, code lost:
    
        if (((r4.f25642a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        r47 = r0;
        r44 = r5;
        r35 = r11;
        r40 = r12;
        r31 = r14;
        r32 = r15;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012c, code lost:
    
        r3 = r4.f25645d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        if (r3 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0132, code lost:
    
        r6 = r4.f25646e;
        r10 = kotlin.w0.f410662c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
    
        if (java.lang.Long.compareUnsigned(r6 * 32, r3 * 25) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        r3 = r4.f25642a;
        r6 = r4.f25645d;
        r7 = r4.f25643b;
        r8 = r4.f25644c;
        r10 = (r6 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0154, code lost:
    
        if (r9 >= r10) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0156, code lost:
    
        r34 = r10;
        r10 = r3[r9] & (-9187201950435737472L);
        r3[r9] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r9 = r9 + 1;
        r14 = r14;
        r15 = r15;
        r10 = r34;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        r35 = r11;
        r31 = r14;
        r32 = r15;
        r9 = r3.length;
        r11 = r9 - 1;
        r9 = r9 - 2;
        r3[r9] = (r3[r9] & 72057594037927935L) | (-72057594037927936L);
        r3[r11] = r3[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019c, code lost:
    
        if (r9 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019e, code lost:
    
        r10 = r9 >> 3;
        r11 = (r9 & 7) << 3;
        r14 = (r3[r10] >> r11) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b0, code lost:
    
        if (r14 != 128) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b4, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bd, code lost:
    
        if (r14 == 254) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c0, code lost:
    
        r14 = r7[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        if (r14 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01c4, code lost:
    
        r14 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c9, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ca, code lost:
    
        r14 = r14 * (-862048943);
        r40 = r12;
        r12 = (r14 ^ (r14 << 16)) >>> 7;
        r13 = r4.c(r12);
        r12 = r12 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e7, code lost:
    
        if ((((r13 - r12) & r6) / 8) != (((r9 - r12) & r6) / 8)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e9, code lost:
    
        r3[r10] = ((~(255 << r11)) & r3[r10]) | ((r14 & 127) << r11);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r6;
        r12 = r40;
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0211, code lost:
    
        r44 = r5;
        r34 = r6;
        r5 = r13 >> 3;
        r45 = r3[r5];
        r6 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0228, code lost:
    
        if (((r45 >> r6) & 255) != 128) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022a, code lost:
    
        r47 = r0;
        r3[r5] = (r45 & (~(255 << r6))) | ((r14 & 127) << r6);
        r3[r10] = (r3[r10] & (~(255 << r11))) | (128 << r11);
        r7[r13] = r7[r9];
        r7[r9] = null;
        r8[r13] = r8[r9];
        r8[r9] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0254, code lost:
    
        r47 = r0;
        r3[r5] = (r45 & (~(255 << r6))) | ((r14 & 127) << r6);
        r0 = r7[r13];
        r7[r13] = r7[r9];
        r7[r9] = r0;
        r0 = r8[r13];
        r8[r13] = r8[r9];
        r8[r9] = r0;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0277, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r34;
        r12 = r40;
        r5 = r44;
        r0 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028e, code lost:
    
        r47 = r0;
        r44 = r5;
        r40 = r12;
        r4.f25563f = androidx.collection.i1.a(r4.f25645d) - r4.f25646e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a0, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02a3, code lost:
    
        r47 = r0;
        r44 = r5;
        r35 = r11;
        r40 = r12;
        r31 = r14;
        r32 = r15;
        r5 = 0;
        r0 = androidx.collection.i1.c(r4.f25645d);
        r1 = r4.f25642a;
        r3 = r4.f25643b;
        r6 = r4.f25644c;
        r7 = r4.f25645d;
        r4.d(r0);
        r0 = r4.f25642a;
        r8 = r4.f25643b;
        r9 = r4.f25644c;
        r10 = r4.f25645d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ca, code lost:
    
        if (r11 >= r7) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02dd, code lost:
    
        if (((r1[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= 128) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02df, code lost:
    
        r12 = r3[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e1, code lost:
    
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e3, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e8, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02e9, code lost:
    
        r13 = r13 * (-862048943);
        r13 = r13 ^ (r13 << 16);
        r15 = r4.c(r13 >>> 7);
        r28 = r6;
        r5 = r13 & 127;
        r13 = r15 >> 3;
        r27 = (r15 & 7) << 3;
        r5 = (r5 << r27) | (r0[r13] & (~(255 << r27)));
        r0[r13] = r5;
        r0[(((r15 - 7) & r10) + (r10 & 7)) >> 3] = r5;
        r8[r15] = r12;
        r9[r15] = r28[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0324, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0327, code lost:
    
        r11 = r11 + 1;
        r6 = r28;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x032c, code lost:
    
        r3 = r4.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0330, code lost:
    
        r4.f25646e += r5;
        r0 = r4.f25563f;
        r1 = r4.f25642a;
        r2 = r3 >> 3;
        r5 = r1[r2];
        r7 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x034b, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x034d, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x034f, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0350, code lost:
    
        r4.f25563f = r0 - r8;
        r0 = r4.f25645d;
        r5 = (r5 & (~(255 << r7))) | (r47 << r7);
        r1[r2] = r5;
        r1[(((r3 - 7) & r0) + (r0 & 7)) >> 3] = r5;
        r0 = ~r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(androidx.compose.ui.node.O0 r50) {
        /*
            Method dump skipped, instructions count: 1169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.X.t0(androidx.compose.ui.node.O0):void");
    }

    @Override // androidx.compose.ui.node.InterfaceC22432q0
    public final void u(boolean z12) {
        X xB02 = B0();
        LayoutNode f40909n = xB02 != null ? xB02.getF40909n() : null;
        if (kotlin.jvm.internal.L.f(f40909n, getF40909n())) {
            this.f40703g = z12;
            return;
        }
        if ((f40909n != null ? f40909n.f40616J.f40681d : null) != LayoutNode.LayoutState.f40653d) {
            if ((f40909n != null ? f40909n.f40616J.f40681d : null) != LayoutNode.LayoutState.f40654e) {
                return;
            }
        }
        this.f40703g = z12;
    }

    @Y61.l
    public abstract X u0();

    @Y61.k
    public abstract androidx.compose.ui.layout.A v0();

    public abstract boolean w0();

    @Override // androidx.compose.ui.node.InterfaceC22424m0
    @Y61.k
    /* renamed from: w1 */
    public abstract LayoutNode getF40909n();

    @Y61.k
    public abstract InterfaceC22367j0 z0();
}
