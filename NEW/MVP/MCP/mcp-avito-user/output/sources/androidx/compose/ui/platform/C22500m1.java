package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.C22266b;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.InterfaceC22385t;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import l0.g;
import l0.n;
import okhttp3.internal.http2.Http2;
import s0.C47949a;

/* compiled from: GraphicsLayerOwnerLayer.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/m1;", "Landroidx/compose/ui/node/I0;", "Landroidx/compose/ui/layout/t;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22500m1 implements androidx.compose.ui.node.I0, InterfaceC22385t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public C22267c f41493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22264l0 f41494c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41495d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> f41496e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f41497f;

    /* renamed from: g, reason: collision with root package name */
    public long f41498g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41499h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final float[] f41500i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public float[] f41501j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f41502k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f41503l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f41504m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.a f41505n;

    /* renamed from: o, reason: collision with root package name */
    public int f41506o;

    /* renamed from: p, reason: collision with root package name */
    public long f41507p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.D0 f41508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41509r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f41510s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f41511t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41512u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> f41513v;

    /* compiled from: GraphicsLayerOwnerLayer.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.m1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            androidx.compose.ui.graphics.M mA2 = gVar2.getF39478c().a();
            Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar = C22500m1.this.f41496e;
            if (pVar != null) {
                pVar.invoke(mA2, gVar2.getF39478c().f39486b);
            }
            return kotlin.G0.f406611a;
        }
    }

    public C22500m1(@Y61.k C22267c c22267c, @Y61.l InterfaceC22264l0 interfaceC22264l0, @Y61.k AndroidComposeView androidComposeView, @Y61.k Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f41493b = c22267c;
        this.f41494c = interfaceC22264l0;
        this.f41495d = androidComposeView;
        this.f41496e = pVar;
        this.f41497f = aVar;
        long j12 = Integer.MAX_VALUE;
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        this.f41498g = (j12 & 4294967295L) | (j12 << 32);
        this.f41500i = androidx.compose.ui.graphics.A0.b();
        this.f41503l = androidx.compose.ui.unit.f.b();
        this.f41504m = LayoutDirection.f42838b;
        this.f41505n = new androidx.compose.ui.graphics.drawscope.a();
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41507p = androidx.compose.ui.graphics.r1.f39756c;
        this.f41511t = true;
        this.f41513v = new a();
    }

    @Override // androidx.compose.ui.node.I0
    public final void a(@Y61.k Y41.a aVar, @Y61.k Y41.p pVar) {
        InterfaceC22264l0 interfaceC22264l0 = this.f41494c;
        if (interfaceC22264l0 == null) {
            throw androidx.compose.foundation.H.s("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f41493b.f39594s) {
            C47949a.a("layer should have been released before reuse");
        }
        this.f41493b = interfaceC22264l0.a();
        this.f41499h = false;
        this.f41496e = pVar;
        this.f41497f = aVar;
        this.f41509r = false;
        this.f41510s = false;
        this.f41511t = true;
        androidx.compose.ui.graphics.A0.e(this.f41500i);
        float[] fArr = this.f41501j;
        if (fArr != null) {
            androidx.compose.ui.graphics.A0.e(fArr);
        }
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41507p = androidx.compose.ui.graphics.r1.f39756c;
        this.f41512u = false;
        long j12 = Integer.MAX_VALUE;
        u.a aVar2 = androidx.compose.ui.unit.u.f42871b;
        this.f41498g = (j12 & 4294967295L) | (j12 << 32);
        this.f41508q = null;
        this.f41506o = 0;
    }

    @Override // androidx.compose.ui.node.I0
    public final void b(@Y61.k float[] fArr) {
        androidx.compose.ui.graphics.A0.h(fArr, m());
    }

    @Override // androidx.compose.ui.node.I0
    public final long c(long j12, boolean z12) {
        float[] fArrM;
        if (z12) {
            fArrM = l();
            if (fArrM == null) {
                l0.g.f413384b.getClass();
                return l0.g.f413385c;
            }
        } else {
            fArrM = m();
        }
        return this.f41511t ? j12 : androidx.compose.ui.graphics.A0.c(j12, fArrM);
    }

    @Override // androidx.compose.ui.node.I0
    public final boolean d(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        C22267c c22267c = this.f41493b;
        if (c22267c.f39598w) {
            return C22485i2.a(c22267c.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.I0
    public final void destroy() {
        this.f41496e = null;
        this.f41497f = null;
        this.f41499h = true;
        boolean z12 = this.f41502k;
        AndroidComposeView androidComposeView = this.f41495d;
        if (z12) {
            this.f41502k = false;
            androidComposeView.y(this, false);
        }
        InterfaceC22264l0 interfaceC22264l0 = this.f41494c;
        if (interfaceC22264l0 != null) {
            interfaceC22264l0.b(this.f41493b);
            androidComposeView.H(this);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void e(@Y61.k float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            androidx.compose.ui.graphics.A0.h(fArr, fArrL);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void f(long j12) {
        C22267c c22267c = this.f41493b;
        if (!androidx.compose.ui.unit.q.c(c22267c.f39595t, j12)) {
            c22267c.f39595t = j12;
            long j13 = c22267c.f39596u;
            c22267c.f39576a.F((int) (j12 >> 32), (int) (j12 & 4294967295L), j13);
        }
        Z2.f41363a.getClass();
        View view = this.f41495d;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void g() {
        if (this.f41502k) {
            long j12 = this.f41507p;
            androidx.compose.ui.graphics.r1.f39755b.getClass();
            if (!androidx.compose.ui.graphics.r1.b(j12, androidx.compose.ui.graphics.r1.f39756c) && !androidx.compose.ui.unit.u.c(this.f41493b.f39596u, this.f41498g)) {
                C22267c c22267c = this.f41493b;
                float fC2 = androidx.compose.ui.graphics.r1.c(this.f41507p) * ((int) (this.f41498g >> 32));
                float fD2 = androidx.compose.ui.graphics.r1.d(this.f41507p) * ((int) (this.f41498g & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fD2) & 4294967295L) | (Float.floatToRawIntBits(fC2) << 32);
                g.a aVar = l0.g.f413384b;
                if (!l0.g.d(c22267c.f39597v, jFloatToRawIntBits)) {
                    c22267c.f39597v = jFloatToRawIntBits;
                    c22267c.f39576a.y(jFloatToRawIntBits);
                }
            }
            this.f41493b.e(this.f41503l, this.f41504m, this.f41498g, this.f41513v);
            if (this.f41502k) {
                this.f41502k = false;
                this.f41495d.y(this, false);
            }
        }
    }

    @Override // androidx.compose.ui.node.I0
    @Y61.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // androidx.compose.ui.node.I0
    public final void h(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        g();
        this.f41512u = this.f41493b.f39576a.getF39680u() > 0.0f;
        androidx.compose.ui.graphics.drawscope.a aVar = this.f41505n;
        a.b bVar = aVar.f39478c;
        bVar.f(m12);
        bVar.f39486b = c22267c;
        androidx.compose.ui.graphics.layer.h.a(aVar, this.f41493b);
    }

    @Override // androidx.compose.ui.node.I0
    public final void i(@Y61.k l0.e eVar, boolean z12) {
        float[] fArrL = z12 ? l() : m();
        if (this.f41511t) {
            return;
        }
        if (fArrL != null) {
            androidx.compose.ui.graphics.A0.d(fArrL, eVar);
            return;
        }
        eVar.f413380a = 0.0f;
        eVar.f413381b = 0.0f;
        eVar.f413382c = 0.0f;
        eVar.f413383d = 0.0f;
    }

    @Override // androidx.compose.ui.node.I0
    public final void invalidate() {
        if (this.f41502k || this.f41499h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f41495d;
        androidComposeView.invalidate();
        if (true != this.f41502k) {
            this.f41502k = true;
            androidComposeView.y(this, true);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void j(long j12) {
        if (androidx.compose.ui.unit.u.c(j12, this.f41498g)) {
            return;
        }
        this.f41498g = j12;
        if (this.f41502k || this.f41499h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f41495d;
        androidComposeView.invalidate();
        if (true != this.f41502k) {
            this.f41502k = true;
            androidComposeView.y(this, true);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void k(@Y61.k androidx.compose.ui.graphics.c1 c1Var) {
        Y41.a<kotlin.G0> aVar;
        int i12;
        Y41.a<kotlin.G0> aVar2;
        boolean z12 = true;
        int i13 = c1Var.f39355b | this.f41506o;
        this.f41504m = c1Var.f39374u;
        this.f41503l = c1Var.f39373t;
        int i14 = i13 & 4096;
        if (i14 != 0) {
            this.f41507p = c1Var.f39368o;
        }
        if ((i13 & 1) != 0) {
            C22267c c22267c = this.f41493b;
            float f12 = c1Var.f39356c;
            androidx.compose.ui.graphics.layer.g gVar = c22267c.f39576a;
            if (gVar.getF39676q() != f12) {
                gVar.j(f12);
            }
        }
        if ((i13 & 2) != 0) {
            C22267c c22267c2 = this.f41493b;
            float f13 = c1Var.f39357d;
            androidx.compose.ui.graphics.layer.g gVar2 = c22267c2.f39576a;
            if (gVar2.getF39677r() != f13) {
                gVar2.k(f13);
            }
        }
        if ((i13 & 4) != 0) {
            this.f41493b.g(c1Var.f39358e);
        }
        if ((i13 & 8) != 0) {
            C22267c c22267c3 = this.f41493b;
            float f14 = c1Var.f39359f;
            androidx.compose.ui.graphics.layer.g gVar3 = c22267c3.f39576a;
            if (gVar3.getF39678s() != f14) {
                gVar3.l(f14);
            }
        }
        if ((i13 & 16) != 0) {
            C22267c c22267c4 = this.f41493b;
            float f15 = c1Var.f39360g;
            androidx.compose.ui.graphics.layer.g gVar4 = c22267c4.f39576a;
            if (gVar4.getF39679t() != f15) {
                gVar4.g(f15);
            }
        }
        if ((i13 & 32) != 0) {
            C22267c c22267c5 = this.f41493b;
            float f16 = c1Var.f39361h;
            androidx.compose.ui.graphics.layer.g gVar5 = c22267c5.f39576a;
            if (gVar5.getF39680u() != f16) {
                gVar5.q(f16);
                c22267c5.f39582g = true;
                c22267c5.a();
            }
            if (c1Var.f39361h > 0.0f && !this.f41512u && (aVar2 = this.f41497f) != null) {
                aVar2.invoke();
            }
        }
        if ((i13 & 64) != 0) {
            C22267c c22267c6 = this.f41493b;
            long j12 = c1Var.f39362i;
            androidx.compose.ui.graphics.layer.g gVar6 = c22267c6.f39576a;
            if (!androidx.compose.ui.graphics.T.d(j12, gVar6.getF39681v())) {
                gVar6.v(j12);
            }
        }
        if ((i13 & 128) != 0) {
            C22267c c22267c7 = this.f41493b;
            long j13 = c1Var.f39363j;
            androidx.compose.ui.graphics.layer.g gVar7 = c22267c7.f39576a;
            if (!androidx.compose.ui.graphics.T.d(j13, gVar7.getF39682w())) {
                gVar7.w(j13);
            }
        }
        if ((i13 & 1024) != 0) {
            C22267c c22267c8 = this.f41493b;
            float f17 = c1Var.f39366m;
            androidx.compose.ui.graphics.layer.g gVar8 = c22267c8.f39576a;
            if (gVar8.getF39685z() != f17) {
                gVar8.d(f17);
            }
        }
        if ((i13 & 256) != 0) {
            C22267c c22267c9 = this.f41493b;
            float f18 = c1Var.f39364k;
            androidx.compose.ui.graphics.layer.g gVar9 = c22267c9.f39576a;
            if (gVar9.getF39683x() != f18) {
                gVar9.b(f18);
            }
        }
        if ((i13 & 512) != 0) {
            C22267c c22267c10 = this.f41493b;
            float f19 = c1Var.f39365l;
            androidx.compose.ui.graphics.layer.g gVar10 = c22267c10.f39576a;
            if (gVar10.getF39684y() != f19) {
                gVar10.c(f19);
            }
        }
        if ((i13 & 2048) != 0) {
            C22267c c22267c11 = this.f41493b;
            float f22 = c1Var.f39367n;
            androidx.compose.ui.graphics.layer.g gVar11 = c22267c11.f39576a;
            if (gVar11.getF39653t() != f22) {
                gVar11.h(f22);
            }
        }
        if (i14 != 0) {
            long j14 = this.f41507p;
            androidx.compose.ui.graphics.r1.f39755b.getClass();
            if (androidx.compose.ui.graphics.r1.b(j14, androidx.compose.ui.graphics.r1.f39756c)) {
                C22267c c22267c12 = this.f41493b;
                l0.g.f413384b.getClass();
                long j15 = l0.g.f413386d;
                if (!l0.g.d(c22267c12.f39597v, j15)) {
                    c22267c12.f39597v = j15;
                    c22267c12.f39576a.y(j15);
                }
            } else {
                C22267c c22267c13 = this.f41493b;
                float fC2 = androidx.compose.ui.graphics.r1.c(this.f41507p) * ((int) (this.f41498g >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(androidx.compose.ui.graphics.r1.d(this.f41507p) * ((int) (this.f41498g & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fC2) << 32);
                g.a aVar3 = l0.g.f413384b;
                if (!l0.g.d(c22267c13.f39597v, jFloatToRawIntBits)) {
                    c22267c13.f39597v = jFloatToRawIntBits;
                    c22267c13.f39576a.y(jFloatToRawIntBits);
                }
            }
        }
        if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            C22267c c22267c14 = this.f41493b;
            boolean z13 = c1Var.f39370q;
            if (c22267c14.f39598w != z13) {
                c22267c14.f39598w = z13;
                c22267c14.f39582g = true;
                c22267c14.a();
            }
        }
        if ((131072 & i13) != 0) {
            C22267c c22267c15 = this.f41493b;
            androidx.compose.ui.graphics.Z0 z02 = c1Var.f39375v;
            androidx.compose.ui.graphics.layer.g gVar12 = c22267c15.f39576a;
            if (!kotlin.jvm.internal.L.f(gVar12.getF39660A(), z02)) {
                gVar12.e(z02);
            }
        }
        if ((32768 & i13) != 0) {
            C22267c c22267c16 = this.f41493b;
            int i15 = c1Var.f39371r;
            C22250e0.f39504b.getClass();
            if (C22250e0.a(i15, 0)) {
                C22266b.f39571b.getClass();
                i12 = 0;
            } else if (C22250e0.a(i15, C22250e0.f39505c)) {
                C22266b.f39571b.getClass();
                i12 = C22266b.f39572c;
            } else {
                if (!C22250e0.a(i15, C22250e0.f39506d)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                C22266b.f39571b.getClass();
                i12 = C22266b.f39573d;
            }
            androidx.compose.ui.graphics.layer.g gVar13 = c22267c16.f39576a;
            if (!C22266b.a(gVar13.getF39673n(), i12)) {
                gVar13.I(i12);
            }
        }
        if ((i13 & 7963) != 0) {
            this.f41509r = true;
            this.f41510s = true;
        }
        if (kotlin.jvm.internal.L.f(this.f41508q, c1Var.f39376w)) {
            z12 = false;
        } else {
            androidx.compose.ui.graphics.D0 d02 = c1Var.f39376w;
            this.f41508q = d02;
            if (d02 != null) {
                C22267c c22267c17 = this.f41493b;
                if (d02 instanceof D0.b) {
                    l0.j jVar = ((D0.b) d02).f39222a;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(jVar.f413390a);
                    float f23 = jVar.f413391b;
                    long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(f23) & 4294967295L);
                    g.a aVar4 = l0.g.f413384b;
                    float f24 = jVar.f413392c - jVar.f413390a;
                    float f25 = jVar.f413393d - f23;
                    long jFloatToRawIntBits4 = Float.floatToRawIntBits(f24);
                    n.a aVar5 = l0.n.f413402b;
                    c22267c17.h(jFloatToRawIntBits3, (4294967295L & Float.floatToRawIntBits(f25)) | (jFloatToRawIntBits4 << 32), 0.0f);
                } else if (d02 instanceof D0.a) {
                    c22267c17.f();
                    c22267c17.f39587l = ((D0.a) d02).f39221a;
                    c22267c17.a();
                } else if (d02 instanceof D0.c) {
                    D0.c cVar = (D0.c) d02;
                    C22277p c22277p = cVar.f39224b;
                    if (c22277p != null) {
                        c22267c17.f();
                        c22267c17.f39587l = c22277p;
                        c22267c17.a();
                    } else {
                        l0.l lVar = cVar.f39223a;
                        g.a aVar6 = l0.g.f413384b;
                        float fC3 = lVar.c();
                        float fB2 = lVar.b();
                        long jFloatToRawIntBits5 = Float.floatToRawIntBits(fC3);
                        n.a aVar7 = l0.n.f413402b;
                        c22267c17.h((Float.floatToRawIntBits(lVar.f413394a) << 32) | (Float.floatToRawIntBits(lVar.f413395b) & 4294967295L), (4294967295L & Float.floatToRawIntBits(fB2)) | (jFloatToRawIntBits5 << 32), Float.intBitsToFloat((int) (lVar.f413401h >> 32)));
                    }
                }
                if ((d02 instanceof D0.a) && Build.VERSION.SDK_INT < 33 && (aVar = this.f41497f) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f41506o = c1Var.f39355b;
        if (i13 != 0 || z12) {
            Z2.f41363a.getClass();
            View view = this.f41495d;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
        }
    }

    public final float[] l() {
        float[] fArrB = this.f41501j;
        if (fArrB == null) {
            fArrB = androidx.compose.ui.graphics.A0.b();
            this.f41501j = fArrB;
        }
        if (!this.f41510s) {
            if (Float.isNaN(fArrB[0])) {
                return null;
            }
            return fArrB;
        }
        this.f41510s = false;
        float[] fArrM = m();
        if (this.f41511t) {
            return fArrM;
        }
        if (A1.a(fArrM, fArrB)) {
            return fArrB;
        }
        fArrB[0] = Float.NaN;
        return null;
    }

    public final float[] m() {
        boolean z12 = this.f41509r;
        float[] fArr = this.f41500i;
        if (z12) {
            C22267c c22267c = this.f41493b;
            long jB2 = c22267c.f39597v;
            if ((9223372034707292159L & jB2) == 9205357640488583168L) {
                jB2 = l0.o.b(androidx.compose.ui.unit.v.c(this.f41498g));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jB2 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
            androidx.compose.ui.graphics.layer.g gVar = c22267c.f39576a;
            float f39678s = gVar.getF39678s();
            float f39679t = gVar.getF39679t();
            float f39683x = gVar.getF39683x();
            float f39684y = gVar.getF39684y();
            float f39685z = gVar.getF39685z();
            float f39676q = gVar.getF39676q();
            float f39677r = gVar.getF39677r();
            int i12 = androidx.compose.ui.graphics.A0.f39215b;
            double d12 = f39683x * 0.017453292519943295d;
            float fSin = (float) Math.sin(d12);
            float fCos = (float) Math.cos(d12);
            float f12 = -fSin;
            float f13 = (f39679t * fCos) - (1.0f * fSin);
            float f14 = (1.0f * fCos) + (f39679t * fSin);
            double d13 = f39684y * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d13);
            float fCos2 = (float) Math.cos(d13);
            float f15 = -fSin2;
            float f16 = fSin * fSin2;
            float f17 = fSin * fCos2;
            float f18 = fCos * fSin2;
            float f19 = fCos * fCos2;
            float f22 = (f14 * fSin2) + (f39678s * fCos2);
            float f23 = (f14 * fCos2) + ((-f39678s) * fSin2);
            double d14 = f39685z * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d14);
            float fCos3 = (float) Math.cos(d14);
            float f24 = -fSin3;
            float f25 = (fCos3 * f16) + (f24 * fCos2);
            float f26 = (f16 * fSin3) + (fCos2 * fCos3);
            float f27 = fSin3 * fCos;
            float f28 = fCos3 * f17;
            float f29 = fSin3 * f17;
            float f32 = f26 * f39676q;
            float f33 = f27 * f39676q;
            float f34 = (f29 + (fCos3 * f15)) * f39676q;
            float f35 = f25 * f39677r;
            float f36 = fCos * fCos3 * f39677r;
            float f37 = (f28 + (f24 * f15)) * f39677r;
            float f38 = f18 * 1.0f;
            float f39 = f12 * 1.0f;
            float f42 = f19 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f32;
                fArr[1] = f33;
                fArr[2] = f34;
                fArr[3] = 0.0f;
                fArr[4] = f35;
                fArr[5] = f36;
                fArr[6] = f37;
                fArr[7] = 0.0f;
                fArr[8] = f38;
                fArr[9] = f39;
                fArr[10] = f42;
                fArr[11] = 0.0f;
                float f43 = -fIntBitsToFloat;
                fArr[12] = ((f32 * f43) - (f35 * fIntBitsToFloat2)) + f22 + fIntBitsToFloat;
                fArr[13] = ((f33 * f43) - (f36 * fIntBitsToFloat2)) + f13 + fIntBitsToFloat2;
                fArr[14] = ((f43 * f34) - (fIntBitsToFloat2 * f37)) + f23;
                fArr[15] = 1.0f;
            }
            this.f41509r = false;
            this.f41511t = androidx.compose.ui.graphics.B0.a(fArr);
        }
        return fArr;
    }
}
