package androidx.compose.ui.draw;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.layout.T0;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.P;
import androidx.compose.ui.node.X;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PainterModifier.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draw/t;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/u;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class t extends v.d implements K, InterfaceC22438u {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.graphics.painter.e f39064p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39065q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public InterfaceC22215f f39066r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public InterfaceC22374n f39067s;

    /* renamed from: t, reason: collision with root package name */
    public float f39068t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public U f39069u;

    /* compiled from: PainterModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f39070l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f39070l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.h(this.f39070l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(androidx.compose.ui.graphics.painter.e eVar, boolean z12, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, float f12, U u12, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f = InterfaceC22215f.a.f39080f;
        }
        InterfaceC22215f interfaceC22215f2 = interfaceC22215f;
        if ((i12 & 8) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n = InterfaceC22374n.a.f40497f;
        }
        this(eVar, z12, interfaceC22215f2, interfaceC22374n, (i12 & 16) != 0 ? 1.0f : f12, (i12 & 32) != 0 ? null : u12);
    }

    public static boolean l2(long j12) {
        l0.n.f413402b.getClass();
        return !l0.n.b(j12, l0.n.f413403c) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean m2(long j12) {
        l0.n.f413402b.getClass();
        return !l0.n.b(j12, l0.n.f413403c) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        if (!k2()) {
            return interfaceC22391w.R(i12);
        }
        long jN2 = n2(C22713c.b(i12, 0, 13));
        return Math.max(C22712b.k(jN2), interfaceC22391w.R(i12));
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        K0 k0I = interfaceC22363h0.I(n2(j12));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }

    public final boolean k2() {
        return this.f39065q && this.f39064p.getF39738j() != 9205357640488583168L;
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        if (!k2()) {
            return interfaceC22391w.G(i12);
        }
        long jN2 = n2(C22713c.b(0, i12, 7));
        return Math.max(C22712b.l(jN2), interfaceC22391w.G(i12));
    }

    public final long n2(long j12) {
        boolean z12 = false;
        boolean z13 = C22712b.f(j12) && C22712b.e(j12);
        if (C22712b.h(j12) && C22712b.g(j12)) {
            z12 = true;
        }
        if ((!k2() && z13) || z12) {
            return C22712b.c(j12, C22712b.j(j12), 0, C22712b.i(j12), 0, 10);
        }
        long f39738j = this.f39064p.getF39738j();
        int iRound = m2(f39738j) ? Math.round(Float.intBitsToFloat((int) (f39738j >> 32))) : C22712b.l(j12);
        int iRound2 = l2(f39738j) ? Math.round(Float.intBitsToFloat((int) (f39738j & 4294967295L))) : C22712b.k(j12);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(C22713c.g(iRound, j12)) << 32) | (Float.floatToRawIntBits(C22713c.f(iRound2, j12)) & 4294967295L);
        if (k2()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!m2(this.f39064p.getF39738j()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f39064p.getF39738j() >> 32))) << 32) | (Float.floatToRawIntBits(!l2(this.f39064p.getF39738j()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f39064p.getF39738j() & 4294967295L))) & 4294967295L);
            if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) {
                l0.n.f413402b.getClass();
                jFloatToRawIntBits = 0;
            } else {
                jFloatToRawIntBits = T0.a(jFloatToRawIntBits2, this.f39067s.a(jFloatToRawIntBits2, jFloatToRawIntBits));
            }
        }
        return C22712b.c(j12, C22713c.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j12), 0, C22713c.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j12), 0, 10);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k P p12) {
        long jA2;
        long f39738j = this.f39064p.getF39738j();
        boolean zM2 = m2(f39738j);
        androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
        float fIntBitsToFloat = zM2 ? Float.intBitsToFloat((int) (f39738j >> 32)) : Float.intBitsToFloat((int) (aVar.i() >> 32));
        float fIntBitsToFloat2 = l2(f39738j) ? Float.intBitsToFloat((int) (f39738j & 4294967295L)) : Float.intBitsToFloat((int) (aVar.i() & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (aVar.i() >> 32)) == 0.0f || Float.intBitsToFloat((int) (aVar.i() & 4294967295L)) == 0.0f) {
            l0.n.f413402b.getClass();
            jA2 = 0;
        } else {
            jA2 = T0.a(jFloatToRawIntBits, this.f39067s.a(jFloatToRawIntBits, aVar.i()));
        }
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        long jA3 = this.f39066r.a((Math.round(Float.intBitsToFloat((int) (jA2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (jA2 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (aVar.i() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (aVar.i() & 4294967295L))) & 4294967295L), p12.getLayoutDirection());
        q.a aVar3 = androidx.compose.ui.unit.q.f42862b;
        float f12 = (int) (jA3 >> 32);
        float f13 = (int) (jA3 & 4294967295L);
        aVar.f39478c.f39485a.f(f12, f13);
        try {
            this.f39064p.g(p12, jA2, this.f39068t, this.f39069u);
            aVar.f39478c.f39485a.f(-f12, -f13);
            p12.y1();
        } catch (Throwable th2) {
            aVar.f39478c.f39485a.f(-f12, -f13);
            throw th2;
        }
    }

    @Y61.k
    public final String toString() {
        return "PainterModifier(painter=" + this.f39064p + ", sizeToIntrinsics=" + this.f39065q + ", alignment=" + this.f39066r + ", alpha=" + this.f39068t + ", colorFilter=" + this.f39069u + ')';
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        if (!k2()) {
            return interfaceC22391w.X(i12);
        }
        long jN2 = n2(C22713c.b(i12, 0, 13));
        return Math.max(C22712b.k(jN2), interfaceC22391w.X(i12));
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        if (!k2()) {
            return interfaceC22391w.b0(i12);
        }
        long jN2 = n2(C22713c.b(0, i12, 7));
        return Math.max(C22712b.l(jN2), interfaceC22391w.b0(i12));
    }

    public t(@Y61.k androidx.compose.ui.graphics.painter.e eVar, boolean z12, @Y61.k InterfaceC22215f interfaceC22215f, @Y61.k InterfaceC22374n interfaceC22374n, float f12, @Y61.l U u12) {
        this.f39064p = eVar;
        this.f39065q = z12;
        this.f39066r = interfaceC22215f;
        this.f39067s = interfaceC22374n;
        this.f39068t = f12;
        this.f39069u = u12;
    }
}
