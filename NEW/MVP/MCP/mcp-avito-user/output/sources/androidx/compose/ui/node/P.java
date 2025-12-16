package androidx.compose.ui.node;

import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.InterfaceC22280q0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import j.InterfaceC42167x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LayoutNodeDrawScope.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/P;", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/drawscope/d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P implements androidx.compose.ui.graphics.drawscope.g, androidx.compose.ui.graphics.drawscope.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.a f40671b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC22438u f40672c;

    /* compiled from: LayoutNodeDrawScope.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22438u f40674m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f40675n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC22438u interfaceC22438u, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, kotlin.G0> lVar) {
            super(1);
            this.f40674m = interfaceC22438u;
            this.f40675n = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r10v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) throws Throwable {
            InterfaceC22438u interfaceC22438u;
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            P p12 = P.this;
            InterfaceC22438u interfaceC22438u2 = p12.f40672c;
            androidx.compose.ui.graphics.drawscope.a aVar = p12.f40671b;
            p12.f40672c = this.f40674m;
            try {
                androidx.compose.ui.unit.d dVarB = gVar2.getF39478c().b();
                LayoutDirection layoutDirectionD = gVar2.getF39478c().d();
                androidx.compose.ui.graphics.M mA2 = gVar2.getF39478c().a();
                long jE2 = gVar2.getF39478c().e();
                C22267c c22267c = gVar2.getF39478c().f39486b;
                ?? r102 = this.f40675n;
                androidx.compose.ui.unit.d dVarB2 = aVar.f39478c.b();
                LayoutDirection layoutDirectionD2 = aVar.f39478c.d();
                androidx.compose.ui.graphics.M mA3 = aVar.f39478c.a();
                long jE3 = aVar.f39478c.e();
                a.b bVar = aVar.f39478c;
                try {
                    C22267c c22267c2 = bVar.f39486b;
                    bVar.g(dVarB);
                    bVar.i(layoutDirectionD);
                    bVar.f(mA2);
                    bVar.j(jE2);
                    bVar.f39486b = c22267c;
                    mA2.k();
                    try {
                        r102.invoke(p12);
                        mA2.i();
                        a.b bVar2 = aVar.f39478c;
                        bVar2.g(dVarB2);
                        bVar2.i(layoutDirectionD2);
                        bVar2.f(mA3);
                        bVar2.j(jE3);
                        bVar2.f39486b = c22267c2;
                        p12.f40672c = interfaceC22438u2;
                        return kotlin.G0.f406611a;
                    } catch (Throwable th2) {
                        interfaceC22438u = interfaceC22438u2;
                        try {
                            mA2.i();
                            a.b bVar3 = aVar.f39478c;
                            bVar3.g(dVarB2);
                            bVar3.i(layoutDirectionD2);
                            bVar3.f(mA3);
                            bVar3.j(jE3);
                            bVar3.f39486b = c22267c2;
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            p12.f40672c = interfaceC22438u;
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC22438u = interfaceC22438u2;
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC22438u = interfaceC22438u2;
            }
        }
    }

    public P() {
        this(null, 1, null);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float A0(long j12) {
        return this.f40671b.A0(j12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void B1(@Y61.k ArrayList arrayList, long j12, float f12, int i12, int i13) {
        this.f40671b.B1(arrayList, j12, f12, i12, i13);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final float E(long j12) {
        return this.f40671b.E(j12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void E1(long j12, long j13, long j14, float f12, int i12, @Y61.l androidx.compose.ui.graphics.I0 i02, int i13) {
        this.f40671b.E1(j12, j13, j14, f12, i12, i02, i13);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void I0(@Y61.k Path path, long j12, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, int i12) {
        this.f40671b.I0(path, j12, f12, jVar, i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float J(int i12) {
        return this.f40671b.J(i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float K(float f12) {
        return this.f40671b.K(f12);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF42847c() {
        return this.f40671b.getF42847c();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long L(long j12) {
        return this.f40671b.L(j12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void L1(long j12, float f12, long j13, @InterfaceC42167x float f13, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, int i12) {
        this.f40671b.L1(j12, f12, j13, f13, jVar, i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float M0(float f12) {
        return this.f40671b.getF42846b() * f12;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int O0(long j12) {
        return this.f40671b.O0(j12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void P0(@Y61.k InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, @Y61.l androidx.compose.ui.graphics.U u12, int i12, int i13) {
        this.f40671b.P0(interfaceC22280q0, j12, j13, j14, j15, f12, jVar, u12, i12, i13);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void P1(long j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, @Y61.l androidx.compose.ui.graphics.U u12, int i12) {
        this.f40671b.P1(j12, j13, j14, f12, jVar, u12, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void S(long j12, @Y61.k Y41.l lVar, @Y61.k C22267c c22267c) {
        c22267c.e(this, getLayoutDirection(), j12, new a(this.f40672c, lVar));
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void T1(@Y61.k androidx.compose.ui.graphics.J j12, long j13, long j14, float f12, @InterfaceC42167x float f13, int i12) {
        this.f40671b.T1(j12, j13, j14, f12, f13, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void V0(@Y61.k InterfaceC22280q0 interfaceC22280q0, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, @Y61.l androidx.compose.ui.graphics.F f12, int i12) {
        this.f40671b.V0(interfaceC22280q0, jVar, f12, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void V1(long j12, float f12, float f13, long j13, long j14, @InterfaceC42167x float f14, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, int i12) {
        this.f40671b.V1(j12, f12, f13, j13, j14, f14, jVar, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void Y(@Y61.k androidx.compose.ui.graphics.J j12, long j13, long j14, long j15, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, int i12) {
        this.f40671b.Y(j12, j13, j14, j15, f12, jVar, i12);
    }

    public final void f(@Y61.k androidx.compose.ui.graphics.M m12, long j12, @Y61.k AbstractC22443w0 abstractC22443w0, @Y61.k InterfaceC22438u interfaceC22438u, @Y61.l C22267c c22267c) {
        InterfaceC22438u interfaceC22438u2 = this.f40672c;
        this.f40672c = interfaceC22438u;
        LayoutDirection layoutDirection = abstractC22443w0.f40909n.f40609C;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f40671b;
        androidx.compose.ui.unit.d dVarB = aVar.f39478c.b();
        a.b bVar = aVar.f39478c;
        LayoutDirection layoutDirectionD = bVar.d();
        androidx.compose.ui.graphics.M mA2 = bVar.a();
        long jE2 = bVar.e();
        C22267c c22267c2 = bVar.f39486b;
        bVar.g(abstractC22443w0);
        bVar.i(layoutDirection);
        bVar.f(m12);
        bVar.j(j12);
        bVar.f39486b = c22267c;
        m12.k();
        try {
            interfaceC22438u.t(this);
            m12.i();
            bVar.g(dVarB);
            bVar.i(layoutDirectionD);
            bVar.f(mA2);
            bVar.j(jE2);
            bVar.f39486b = c22267c2;
            this.f40672c = interfaceC22438u2;
        } catch (Throwable th2) {
            m12.i();
            bVar.g(dVarB);
            bVar.i(layoutDirectionD);
            bVar.f(mA2);
            bVar.j(jE2);
            bVar.f39486b = c22267c2;
            throw th2;
        }
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF42846b() {
        return this.f40671b.getF42846b();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @Y61.k
    public final LayoutDirection getLayoutDirection() {
        return this.f40671b.f39477b.f39482b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final long i() {
        return this.f40671b.i();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    @Y61.k
    /* renamed from: j0 */
    public final a.b getF39478c() {
        return this.f40671b.f39478c;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long n(long j12) {
        return this.f40671b.n(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long o(float f12) {
        return this.f40671b.o(f12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void o1(@Y61.k androidx.compose.ui.graphics.J j12, long j13, long j14, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, @Y61.l androidx.compose.ui.graphics.U u12, int i12) {
        this.f40671b.o1(j12, j13, j14, f12, jVar, u12, i12);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final long s(float f12) {
        return this.f40671b.s(f12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void s0(long j12, long j13, long j14, long j15, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, @InterfaceC42167x float f12, int i12) {
        this.f40671b.s0(j12, j13, j14, j15, jVar, f12, i12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final long v1() {
        return this.f40671b.v1();
    }

    @Override // androidx.compose.ui.graphics.drawscope.g
    public final void x0(@Y61.k Path path, @Y61.k androidx.compose.ui.graphics.J j12, @InterfaceC42167x float f12, @Y61.k androidx.compose.ui.graphics.drawscope.j jVar, int i12) {
        this.f40671b.x0(path, j12, f12, jVar, i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int y0(float f12) {
        return this.f40671b.y0(f12);
    }

    @Override // androidx.compose.ui.graphics.drawscope.d
    public final void y1() {
        androidx.compose.ui.graphics.drawscope.a aVar = this.f40671b;
        androidx.compose.ui.graphics.M mA2 = aVar.f39478c.a();
        InterfaceC22438u interfaceC22438u = this.f40672c;
        if (interfaceC22438u == null) {
            throw androidx.compose.foundation.H.s("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        v.d dVarB = interfaceC22438u.getF42880b().f42885g;
        if (dVarB == null || (dVarB.f42883e & 4) == 0) {
            dVarB = null;
        } else {
            while (dVarB != null) {
                int i12 = dVarB.f42882d;
                if ((i12 & 2) != 0) {
                    break;
                } else if ((i12 & 4) != 0) {
                    break;
                } else {
                    dVarB = dVarB.f42885g;
                }
            }
            dVarB = null;
        }
        if (dVarB == null) {
            AbstractC22443w0 abstractC22443w0E = C22421l.e(interfaceC22438u, 4);
            if (abstractC22443w0E.j1() == interfaceC22438u.getF42880b()) {
                abstractC22443w0E = abstractC22443w0E.f40912q;
            }
            abstractC22443w0E.R1(mA2, aVar.f39478c.f39486b);
            return;
        }
        androidx.compose.runtime.collection.e eVar = null;
        while (dVarB != null) {
            if (dVarB instanceof InterfaceC22438u) {
                InterfaceC22438u interfaceC22438u2 = (InterfaceC22438u) dVarB;
                C22267c c22267c = aVar.f39478c.f39486b;
                AbstractC22443w0 abstractC22443w0E2 = C22421l.e(interfaceC22438u2, 4);
                long jC2 = androidx.compose.ui.unit.v.c(abstractC22443w0E2.f40347d);
                LayoutNode layoutNode = abstractC22443w0E2.f40909n;
                layoutNode.getClass();
                S.a(layoutNode).getSharedDrawScope().f(mA2, jC2, abstractC22443w0E2, interfaceC22438u2, c22267c);
            } else if ((dVarB.f42882d & 4) != 0 && (dVarB instanceof AbstractC22425n)) {
                int i13 = 0;
                for (v.d dVar = ((AbstractC22425n) dVarB).f40861q; dVar != null; dVar = dVar.f42885g) {
                    if ((dVar.f42882d & 4) != 0) {
                        i13++;
                        if (i13 == 1) {
                            dVarB = dVar;
                        } else {
                            if (eVar == null) {
                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                            }
                            if (dVarB != null) {
                                eVar.b(dVarB);
                                dVarB = null;
                            }
                            eVar.b(dVar);
                        }
                    }
                }
                if (i13 == 1) {
                }
            }
            dVarB = C22421l.b(eVar);
        }
    }

    public P(androidx.compose.ui.graphics.drawscope.a aVar, int i12, C42822w c42822w) {
        this.f40671b = (i12 & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar;
    }
}
