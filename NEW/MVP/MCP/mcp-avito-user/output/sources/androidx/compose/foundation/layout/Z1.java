package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/Z1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/w;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Z1 extends v.d implements androidx.compose.ui.modifier.k, androidx.compose.ui.node.K, InterfaceC22442w {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28571p;

    /* renamed from: q, reason: collision with root package name */
    public long f28572q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.modifier.t f28573r;

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28574l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28574l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f28574l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: WindowInsetsPadding.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22363h0 f28576m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f28577n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f28578o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22363h0 interfaceC22363h0, int i12, int i13) {
            super(1);
            this.f28576m = interfaceC22363h0;
            this.f28577n = i12;
            this.f28578o = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            InterfaceC20639x2 interfaceC20639x2;
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.A aB2 = aVar2.b();
            Z1 z12 = Z1.this;
            if (aB2 != null) {
                z12.f28572q = androidx.compose.ui.unit.r.c(androidx.compose.ui.layout.B.e(aB2));
            }
            if (aB2 == null) {
                interfaceC20639x2 = (InterfaceC20639x2) z12.G(N2.f28440a);
            } else {
                long jE2 = androidx.compose.ui.layout.B.e(aB2);
                long jA2 = aB2.a();
                long jY2 = aB2.y((Float.floatToRawIntBits((int) (jA2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (jA2 >> 32)) << 32));
                long jA3 = androidx.compose.ui.layout.B.c(aB2).a();
                int iRound = Math.round(Float.intBitsToFloat((int) (jE2 >> 32)));
                int iRound2 = Math.round(Float.intBitsToFloat((int) (jE2 & 4294967295L)));
                int iRound3 = ((int) (jA3 >> 32)) - Math.round(Float.intBitsToFloat((int) (jY2 >> 32)));
                int iRound4 = ((int) (jA3 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jY2 & 4294967295L)));
                C20638x1 c20638x1E = z12.f28571p.e();
                int i12 = c20638x1E.f28796a;
                C20631v2 c20631v2 = z12.f28571p;
                if (i12 != iRound || c20638x1E.f28797b != iRound2 || c20638x1E.f28798c != iRound3 || c20638x1E.f28799d != iRound4) {
                    c20631v2.f(new C20638x1(iRound, iRound2, iRound3, iRound4));
                }
                interfaceC20639x2 = c20631v2;
            }
            z12.j1(N2.f28440a, interfaceC20639x2);
            C22712b.f42842b.getClass();
            aVar2.e(this.f28576m.I(C22712b.a.c(this.f28577n, this.f28578o)), 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public Z1() {
        C20631v2 c20631v2 = new C20631v2(new C20638x1(0, 0, 0, 0), "reset");
        this.f28571p = c20631v2;
        androidx.compose.ui.unit.q.f42862b.getClass();
        this.f28572q = 0L;
        this.f28573r = androidx.compose.ui.modifier.l.a(new kotlin.Q(N2.f28440a, c20631v2));
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.R(i12);
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        long jC2 = androidx.compose.ui.unit.r.c(androidx.compose.ui.layout.B.e(abstractC22443w0));
        boolean zC2 = androidx.compose.ui.unit.q.c(this.f28572q, jC2);
        this.f28572q = jC2;
        if (zC2) {
            return;
        }
        LayoutNode layoutNodeG = C22421l.g(this);
        LayoutNode.d dVar = LayoutNode.f40602T;
        layoutNodeG.n0(false);
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.modifier.k
    @Y61.k
    public final androidx.compose.ui.modifier.j c1() {
        return this.f28573r;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        if (C22712b.h(j12) && C22712b.g(j12)) {
            int iJ2 = C22712b.j(j12);
            int i12 = C22712b.i(j12);
            return interfaceC22369k0.L0(iJ2, i12, kotlin.collections.P0.c(), new b(interfaceC22363h0, iJ2, i12));
        }
        androidx.compose.ui.modifier.s<InterfaceC20639x2> sVar = N2.f28440a;
        j1(sVar, G(sVar));
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I));
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.G(i12);
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.X(i12);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.b0(i12);
    }
}
