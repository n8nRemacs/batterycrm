package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.InterfaceC22385t;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RenderNodeLayer.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/Z1;", "Landroidx/compose/ui/node/I0;", "Landroidx/compose/ui/layout/t;", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
public final class Z1 implements androidx.compose.ui.node.I0, InterfaceC22385t {

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<W0, Matrix, kotlin.G0> f41347o;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41348b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> f41349c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f41350d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41351e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41353g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41354h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public C22273n f41355i;

    /* renamed from: l, reason: collision with root package name */
    public long f41358l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final W0 f41359m;

    /* renamed from: n, reason: collision with root package name */
    public int f41360n;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final L1 f41352f = new L1();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C1<W0> f41356j = new C1<>(f41347o);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.N f41357k = new androidx.compose.ui.graphics.N();

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/W0;", "rn", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/W0;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<W0, Matrix, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41361l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(W0 w02, Matrix matrix) {
            w02.B(matrix);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/Z1$b;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/W0;", "Landroid/graphics/Matrix;", "Lkotlin/G0;", "getMatrix", "LY41/p;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/Z1$c;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    public static final class c {
        static {
            new c();
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/M;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/M;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.M, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.ui.graphics.M, C22267c, kotlin.G0> f41362l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar) {
            super(1);
            this.f41362l = pVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.M m12) {
            this.f41362l.invoke(m12, null);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new b(null);
        f41347o = a.f41361l;
    }

    public Z1(@Y61.k AndroidComposeView androidComposeView, @Y61.k Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        this.f41348b = androidComposeView;
        this.f41349c = pVar;
        this.f41350d = aVar;
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41358l = androidx.compose.ui.graphics.r1.f39756c;
        W0 x12 = Build.VERSION.SDK_INT >= 29 ? new X1() : new W1(androidComposeView);
        x12.z();
        x12.o(false);
        this.f41359m = x12;
    }

    @Override // androidx.compose.ui.node.I0
    public final void a(@Y61.k Y41.a aVar, @Y61.k Y41.p pVar) {
        C1<W0> c12 = this.f41356j;
        c12.f41088e = false;
        c12.f41089f = false;
        c12.f41091h = true;
        c12.f41090g = true;
        androidx.compose.ui.graphics.A0.e(c12.f41086c);
        androidx.compose.ui.graphics.A0.e(c12.f41087d);
        l(false);
        this.f41353g = false;
        this.f41354h = false;
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41358l = androidx.compose.ui.graphics.r1.f39756c;
        this.f41349c = pVar;
        this.f41350d = aVar;
    }

    @Override // androidx.compose.ui.node.I0
    public final void b(@Y61.k float[] fArr) {
        androidx.compose.ui.graphics.A0.h(fArr, this.f41356j.b(this.f41359m));
    }

    @Override // androidx.compose.ui.node.I0
    public final long c(long j12, boolean z12) {
        W0 w02 = this.f41359m;
        C1<W0> c12 = this.f41356j;
        if (!z12) {
            return !c12.f41091h ? androidx.compose.ui.graphics.A0.c(j12, c12.b(w02)) : j12;
        }
        float[] fArrA = c12.a(w02);
        if (fArrA != null) {
            return !c12.f41091h ? androidx.compose.ui.graphics.A0.c(j12, fArrA) : j12;
        }
        l0.g.f413384b.getClass();
        return l0.g.f413385c;
    }

    @Override // androidx.compose.ui.node.I0
    public final boolean d(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j12));
        W0 w02 = this.f41359m;
        if (w02.getF41299f()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) w02.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) w02.getHeight());
        }
        if (w02.A()) {
            return this.f41352f.c(j12);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.I0
    public final void destroy() {
        W0 w02 = this.f41359m;
        if (w02.a()) {
            w02.f();
        }
        this.f41349c = null;
        this.f41350d = null;
        this.f41353g = true;
        l(false);
        AndroidComposeView androidComposeView = this.f41348b;
        androidComposeView.f40978G = true;
        androidComposeView.H(this);
    }

    @Override // androidx.compose.ui.node.I0
    public final void e(@Y61.k float[] fArr) {
        float[] fArrA = this.f41356j.a(this.f41359m);
        if (fArrA != null) {
            androidx.compose.ui.graphics.A0.h(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void f(long j12) {
        W0 w02 = this.f41359m;
        int f41295b = w02.getF41295b();
        int f41296c = w02.getF41296c();
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        if (f41295b == i12 && f41296c == i13) {
            return;
        }
        if (f41295b != i12) {
            w02.C(i12 - f41295b);
        }
        if (f41296c != i13) {
            w02.y(i13 - f41296c);
        }
        Z2.f41363a.getClass();
        View view = this.f41348b;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
        this.f41356j.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // androidx.compose.ui.node.I0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r4 = this;
            boolean r0 = r4.f41351e
            androidx.compose.ui.platform.W0 r1 = r4.f41359m
            if (r0 != 0) goto Lc
            boolean r0 = r1.a()
            if (r0 != 0) goto L31
        Lc:
            boolean r0 = r1.A()
            if (r0 == 0) goto L1e
            androidx.compose.ui.platform.L1 r0 = r4.f41352f
            boolean r2 = r0.f41160g
            if (r2 == 0) goto L1e
            r0.e()
            androidx.compose.ui.graphics.Path r0 = r0.f41158e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            Y41.p<? super androidx.compose.ui.graphics.M, ? super androidx.compose.ui.graphics.layer.c, kotlin.G0> r2 = r4.f41349c
            if (r2 == 0) goto L2d
            androidx.compose.ui.platform.Z1$d r3 = new androidx.compose.ui.platform.Z1$d
            r3.<init>(r2)
            androidx.compose.ui.graphics.N r2 = r4.f41357k
            r1.p(r2, r0, r3)
        L2d:
            r0 = 0
            r4.l(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.Z1.g():void");
    }

    @Override // androidx.compose.ui.node.I0
    @Y61.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return this.f41356j.b(this.f41359m);
    }

    @Override // androidx.compose.ui.node.I0
    public final void h(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) m12).f39351a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        W0 w02 = this.f41359m;
        if (zIsHardwareAccelerated) {
            g();
            boolean z12 = w02.G() > 0.0f;
            this.f41354h = z12;
            if (z12) {
                m12.s();
            }
            w02.n(canvas2);
            if (this.f41354h) {
                m12.f();
                return;
            }
            return;
        }
        float f41295b = w02.getF41295b();
        float f41296c = w02.getF41296c();
        float f41297d = w02.getF41297d();
        float f41298e = w02.getF41298e();
        if (w02.getAlpha() < 1.0f) {
            C22273n c22273n = this.f41355i;
            if (c22273n == null) {
                c22273n = new C22273n();
                this.f41355i = c22273n;
            }
            c22273n.setAlpha(w02.getAlpha());
            canvas2.saveLayer(f41295b, f41296c, f41297d, f41298e, c22273n.f39702a);
        } else {
            m12.k();
        }
        m12.m(f41295b, f41296c);
        m12.l(this.f41356j.b(w02));
        if (w02.A() || w02.getF41299f()) {
            this.f41352f.a(m12);
        }
        Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar = this.f41349c;
        if (pVar != null) {
            pVar.invoke(m12, null);
        }
        m12.i();
        l(false);
    }

    @Override // androidx.compose.ui.node.I0
    public final void i(@Y61.k l0.e eVar, boolean z12) {
        W0 w02 = this.f41359m;
        C1<W0> c12 = this.f41356j;
        if (!z12) {
            float[] fArrB = c12.b(w02);
            if (c12.f41091h) {
                return;
            }
            androidx.compose.ui.graphics.A0.d(fArrB, eVar);
            return;
        }
        float[] fArrA = c12.a(w02);
        if (fArrA != null) {
            if (c12.f41091h) {
                return;
            }
            androidx.compose.ui.graphics.A0.d(fArrA, eVar);
        } else {
            eVar.f413380a = 0.0f;
            eVar.f413381b = 0.0f;
            eVar.f413382c = 0.0f;
            eVar.f413383d = 0.0f;
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void invalidate() {
        if (this.f41351e || this.f41353g) {
            return;
        }
        this.f41348b.invalidate();
        l(true);
    }

    @Override // androidx.compose.ui.node.I0
    public final void j(long j12) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        float fC2 = androidx.compose.ui.graphics.r1.c(this.f41358l) * i12;
        W0 w02 = this.f41359m;
        w02.q(fC2);
        w02.r(androidx.compose.ui.graphics.r1.d(this.f41358l) * i13);
        if (w02.F(w02.getF41295b(), w02.getF41296c(), w02.getF41295b() + i12, w02.getF41296c() + i13)) {
            w02.s(this.f41352f.b());
            if (!this.f41351e && !this.f41353g) {
                this.f41348b.invalidate();
                l(true);
            }
            this.f41356j.c();
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void k(@Y61.k androidx.compose.ui.graphics.c1 c1Var) {
        Y41.a<kotlin.G0> aVar;
        int i12 = c1Var.f39355b | this.f41360n;
        int i13 = i12 & 4096;
        if (i13 != 0) {
            this.f41358l = c1Var.f39368o;
        }
        W0 w02 = this.f41359m;
        boolean zA2 = w02.A();
        L1 l12 = this.f41352f;
        boolean z12 = false;
        boolean z13 = zA2 && l12.f41160g;
        if ((i12 & 1) != 0) {
            w02.j(c1Var.f39356c);
        }
        if ((i12 & 2) != 0) {
            w02.k(c1Var.f39357d);
        }
        if ((i12 & 4) != 0) {
            w02.setAlpha(c1Var.f39358e);
        }
        if ((i12 & 8) != 0) {
            w02.l(c1Var.f39359f);
        }
        if ((i12 & 16) != 0) {
            w02.g(c1Var.f39360g);
        }
        if ((i12 & 32) != 0) {
            w02.x(c1Var.f39361h);
        }
        if ((i12 & 64) != 0) {
            w02.v(androidx.compose.ui.graphics.V.j(c1Var.f39362i));
        }
        if ((i12 & 128) != 0) {
            w02.w(androidx.compose.ui.graphics.V.j(c1Var.f39363j));
        }
        if ((i12 & 1024) != 0) {
            w02.d(c1Var.f39366m);
        }
        if ((i12 & 256) != 0) {
            w02.b(c1Var.f39364k);
        }
        if ((i12 & 512) != 0) {
            w02.c(c1Var.f39365l);
        }
        if ((i12 & 2048) != 0) {
            w02.h(c1Var.f39367n);
        }
        if (i13 != 0) {
            w02.q(androidx.compose.ui.graphics.r1.c(this.f41358l) * w02.getWidth());
            w02.r(androidx.compose.ui.graphics.r1.d(this.f41358l) * w02.getHeight());
        }
        boolean z14 = c1Var.f39370q && c1Var.f39369p != androidx.compose.ui.graphics.Y0.f39346a;
        if ((i12 & 24576) != 0) {
            w02.t(z14);
            w02.o(c1Var.f39370q && c1Var.f39369p == androidx.compose.ui.graphics.Y0.f39346a);
        }
        if ((131072 & i12) != 0) {
            w02.e(c1Var.f39375v);
        }
        if ((32768 & i12) != 0) {
            w02.H(c1Var.f39371r);
        }
        boolean zD2 = this.f41352f.d(c1Var.f39376w, c1Var.f39358e, z14, c1Var.f39361h, c1Var.f39372s);
        if (l12.f41159f) {
            w02.s(l12.b());
        }
        if (z14 && l12.f41160g) {
            z12 = true;
        }
        View view = this.f41348b;
        if (z13 == z12 && (!z12 || !zD2)) {
            Z2.f41363a.getClass();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
        } else if (!this.f41351e && !this.f41353g) {
            view.invalidate();
            l(true);
        }
        if (!this.f41354h && w02.G() > 0.0f && (aVar = this.f41350d) != null) {
            aVar.invoke();
        }
        if ((i12 & 7963) != 0) {
            this.f41356j.c();
        }
        this.f41360n = c1Var.f39355b;
    }

    public final void l(boolean z12) {
        if (z12 != this.f41351e) {
            this.f41351e = z12;
            this.f41348b.y(this, z12);
        }
    }
}
