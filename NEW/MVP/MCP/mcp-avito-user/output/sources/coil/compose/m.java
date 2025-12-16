package coil.compose;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.S0;
import androidx.compose.ui.layout.T0;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.X;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.v;
import coil.view.C27251e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContentPainterModifier.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcoil/compose/m;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/K;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends v.d implements InterfaceC22438u, K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.graphics.painter.e f58244p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public InterfaceC22215f f58245q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public InterfaceC22374n f58246r;

    /* renamed from: s, reason: collision with root package name */
    public float f58247s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public U f58248t;

    /* compiled from: ContentPainterModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f58249l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f58249l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.h(this.f58249l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return interfaceC22391w.R(i12);
        }
        int iR2 = interfaceC22391w.R(C22712b.j(l2(C22713c.b(i12, 0, 13))));
        return Math.max(kotlin.math.b.b(l0.n.c(k2(l0.o.a(i12, iR2)))), iR2);
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        K0 k0I = interfaceC22363h0.I(l2(j12));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }

    public final long k2(long j12) {
        if (l0.n.f(j12)) {
            l0.n.f413402b.getClass();
            return 0L;
        }
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return j12;
        }
        float fE2 = l0.n.e(f39738j);
        if (Float.isInfinite(fE2) || Float.isNaN(fE2)) {
            fE2 = l0.n.e(j12);
        }
        float fC2 = l0.n.c(f39738j);
        if (Float.isInfinite(fC2) || Float.isNaN(fC2)) {
            fC2 = l0.n.c(j12);
        }
        long jA2 = l0.o.a(fE2, fC2);
        long jA3 = this.f58246r.a(jA2, j12);
        int i12 = S0.f40400b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA3 >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j12;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA3));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j12 : T0.a(jA2, jA3);
    }

    public final long l2(long j12) {
        float fL2;
        int iK2;
        float f12;
        boolean zH2 = C22712b.h(j12);
        boolean zG2 = C22712b.g(j12);
        if (zH2 && zG2) {
            return j12;
        }
        boolean z12 = C22712b.f(j12) && C22712b.e(j12);
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return z12 ? C22712b.c(j12, C22712b.j(j12), 0, C22712b.i(j12), 0, 10) : j12;
        }
        if (z12 && (zH2 || zG2)) {
            fL2 = C22712b.j(j12);
            iK2 = C22712b.i(j12);
        } else {
            float fE2 = l0.n.e(f39738j);
            float fC2 = l0.n.c(f39738j);
            if (Float.isInfinite(fE2) || Float.isNaN(fE2)) {
                fL2 = C22712b.l(j12);
            } else {
                C27251e c27251e = G.f58164b;
                fL2 = kotlin.ranges.s.f(fE2, C22712b.l(j12), C22712b.j(j12));
            }
            if (!Float.isInfinite(fC2) && !Float.isNaN(fC2)) {
                C27251e c27251e2 = G.f58164b;
                f12 = kotlin.ranges.s.f(fC2, C22712b.k(j12), C22712b.i(j12));
                long jK2 = k2(l0.o.a(fL2, f12));
                return C22712b.c(j12, C22713c.g(kotlin.math.b.b(l0.n.e(jK2)), j12), 0, C22713c.f(kotlin.math.b.b(l0.n.c(jK2)), j12), 0, 10);
            }
            iK2 = C22712b.k(j12);
        }
        f12 = iK2;
        long jK22 = k2(l0.o.a(fL2, f12));
        return C22712b.c(j12, C22713c.g(kotlin.math.b.b(l0.n.e(jK22)), j12), 0, C22713c.f(kotlin.math.b.b(l0.n.c(jK22)), j12), 0, 10);
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return interfaceC22391w.G(i12);
        }
        int iG2 = interfaceC22391w.G(C22712b.i(l2(C22713c.b(0, i12, 7))));
        return Math.max(kotlin.math.b.b(l0.n.e(k2(l0.o.a(iG2, i12)))), iG2);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
        long jK2 = k2(aVar.i());
        InterfaceC22215f interfaceC22215f = this.f58245q;
        C27251e c27251e = G.f58164b;
        long jA2 = androidx.compose.ui.unit.v.a(kotlin.math.b.b(l0.n.e(jK2)), kotlin.math.b.b(l0.n.c(jK2)));
        long jI2 = aVar.i();
        long jA3 = interfaceC22215f.a(jA2, androidx.compose.ui.unit.v.a(kotlin.math.b.b(l0.n.e(jI2)), kotlin.math.b.b(l0.n.c(jI2))), p12.getLayoutDirection());
        q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        float f12 = (int) (jA3 >> 32);
        float f13 = (int) (jA3 & 4294967295L);
        aVar.f39478c.f39485a.f(f12, f13);
        this.f58244p.g(p12, jK2, this.f58247s, this.f58248t);
        aVar.f39478c.f39485a.f(-f12, -f13);
        p12.y1();
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return interfaceC22391w.X(i12);
        }
        int iX2 = interfaceC22391w.X(C22712b.j(l2(C22713c.b(i12, 0, 13))));
        return Math.max(kotlin.math.b.b(l0.n.c(k2(l0.o.a(i12, iX2)))), iX2);
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        long f39738j = this.f58244p.getF39738j();
        l0.n.f413402b.getClass();
        if (f39738j == l0.n.f413403c) {
            return interfaceC22391w.b0(i12);
        }
        int iB02 = interfaceC22391w.b0(C22712b.i(l2(C22713c.b(0, i12, 7))));
        return Math.max(kotlin.math.b.b(l0.n.e(k2(l0.o.a(iB02, i12)))), iB02);
    }
}
