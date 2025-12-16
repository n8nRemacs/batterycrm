package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.F0;
import androidx.compose.ui.graphics.H0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.d1;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.style.j;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidTextPaint.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/m;", "Landroid/text/TextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public C22273n f42569a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.style.j f42570b;

    /* renamed from: c, reason: collision with root package name */
    public int f42571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public f1 f42572d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public T f42573e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public J f42574f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public I3<? extends Shader> f42575g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public l0.n f42576h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.drawscope.j f42577i;

    /* compiled from: AndroidTextPaint.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Shader> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J f42578l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f42579m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j12, long j13) {
            super(0);
            this.f42578l = j12;
            this.f42579m = j13;
        }

        @Override // Y41.a
        public final Shader invoke() {
            return ((d1) this.f42578l).b(this.f42579m);
        }
    }

    public final F0 a() {
        C22273n c22273n = this.f42569a;
        if (c22273n != null) {
            return c22273n;
        }
        C22273n c22273n2 = new C22273n(this);
        this.f42569a = c22273n2;
        return c22273n2;
    }

    public final void b(int i12) {
        if (E.a(i12, this.f42571c)) {
            return;
        }
        ((C22273n) a()).i(i12);
        this.f42571c = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@Y61.l androidx.compose.ui.graphics.J r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f42575g = r0
            r5.f42574f = r0
            r5.f42576h = r0
            r5.setShader(r0)
            goto L71
        Ld:
            boolean r1 = r6 instanceof androidx.compose.ui.graphics.k1
            if (r1 == 0) goto L1d
            androidx.compose.ui.graphics.k1 r6 = (androidx.compose.ui.graphics.k1) r6
            long r6 = r6.f39547b
            long r6 = androidx.compose.ui.text.style.l.b(r6, r9)
            r5.d(r6)
            goto L71
        L1d:
            boolean r1 = r6 instanceof androidx.compose.ui.graphics.d1
            if (r1 == 0) goto L71
            androidx.compose.ui.graphics.J r1 = r5.f42574f
            boolean r1 = kotlin.jvm.internal.L.f(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            l0.n r1 = r5.f42576h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f413404a
            boolean r1 = l0.n.b(r3, r7)
        L36:
            if (r1 != 0) goto L57
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L57
            r5.f42574f = r6
            l0.n r1 = l0.n.a(r7)
            r5.f42576h = r1
            androidx.compose.ui.text.platform.m$a r1 = new androidx.compose.ui.text.platform.m$a
            r1.<init>(r6, r7)
            androidx.compose.runtime.I3 r6 = androidx.compose.runtime.C22126m3.d(r1)
            r5.f42575g = r6
        L57:
            androidx.compose.ui.graphics.F0 r6 = r5.a()
            androidx.compose.runtime.I3<? extends android.graphics.Shader> r7 = r5.f42575g
            if (r7 == 0) goto L66
            java.lang.Object r7 = r7.getF42167b()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L67
        L66:
            r7 = r0
        L67:
            androidx.compose.ui.graphics.n r6 = (androidx.compose.ui.graphics.C22273n) r6
            r6.e(r7)
            r5.f42573e = r0
            androidx.compose.ui.text.platform.n.a(r5, r9)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.m.c(androidx.compose.ui.graphics.J, long, float):void");
    }

    public final void d(long j12) {
        T t12 = this.f42573e;
        if (t12 == null ? false : T.d(t12.f39331a, j12)) {
            return;
        }
        if (j12 != 16) {
            this.f42573e = T.a(j12);
            setColor(V.j(j12));
            this.f42575g = null;
            this.f42574f = null;
            this.f42576h = null;
            setShader(null);
        }
    }

    public final void e(@Y61.l androidx.compose.ui.graphics.drawscope.j jVar) {
        if (jVar == null || L.f(this.f42577i, jVar)) {
            return;
        }
        this.f42577i = jVar;
        if (jVar.equals(androidx.compose.ui.graphics.drawscope.n.f39497a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (jVar instanceof androidx.compose.ui.graphics.drawscope.o) {
            F0 f0A = a();
            H0.f39278b.getClass();
            ((C22273n) f0A).q(H0.f39279c);
            androidx.compose.ui.graphics.drawscope.o oVar = (androidx.compose.ui.graphics.drawscope.o) jVar;
            ((C22273n) a()).p(oVar.f39499a);
            ((C22273n) a()).o(oVar.f39500b);
            ((C22273n) a()).n(oVar.f39502d);
            ((C22273n) a()).m(oVar.f39501c);
            ((C22273n) a()).l(oVar.f39503e);
        }
    }

    public final void f(@Y61.l f1 f1Var) {
        if (f1Var == null || L.f(this.f42572d, f1Var)) {
            return;
        }
        this.f42572d = f1Var;
        f1.f39508d.getClass();
        if (f1Var.equals(f1.f39509e)) {
            clearShadowLayer();
            return;
        }
        f1 f1Var2 = this.f42572d;
        float f12 = f1Var2.f39512c;
        if (f12 == 0.0f) {
            f12 = Float.MIN_VALUE;
        }
        setShadowLayer(f12, Float.intBitsToFloat((int) (f1Var2.f39511b >> 32)), Float.intBitsToFloat((int) (this.f42572d.f39511b & 4294967295L)), V.j(this.f42572d.f39510a));
    }

    public final void g(@Y61.l androidx.compose.ui.text.style.j jVar) {
        if (jVar == null || L.f(this.f42570b, jVar)) {
            return;
        }
        this.f42570b = jVar;
        j.a aVar = androidx.compose.ui.text.style.j.f42684b;
        aVar.getClass();
        setUnderlineText(jVar.a(androidx.compose.ui.text.style.j.f42686d));
        androidx.compose.ui.text.style.j jVar2 = this.f42570b;
        aVar.getClass();
        setStrikeThruText(jVar2.a(androidx.compose.ui.text.style.j.f42687e));
    }
}
