package androidx.compose.ui.text.platform.style;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22279q;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.I0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.d1;
import androidx.compose.ui.graphics.drawscope.j;
import androidx.compose.ui.graphics.drawscope.n;
import androidx.compose.ui.graphics.drawscope.o;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.m;
import l0.n;

/* compiled from: BulletSpan.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/style/b;", "Landroid/text/style/LeadingMarginSpan;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements LeadingMarginSpan {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h1 f42585b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42586c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42587d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final J f42588e;

    /* renamed from: f, reason: collision with root package name */
    public final float f42589f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final j f42590g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final androidx.compose.ui.unit.d f42591h;

    /* renamed from: i, reason: collision with root package name */
    public final int f42592i;

    /* renamed from: j, reason: collision with root package name */
    public final int f42593j;

    /* compiled from: BulletSpan.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f42595m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f42596n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Canvas f42597o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Paint f42598p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f42599q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ float f42600r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, int i12, Canvas canvas, Paint paint, int i13, float f12) {
            super(0);
            this.f42595m = j12;
            this.f42596n = i12;
            this.f42597o = canvas;
            this.f42598p = paint;
            this.f42599q = i13;
            this.f42600r = f12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b bVar = b.this;
            int i12 = this.f42596n;
            D0 d0A = bVar.f42585b.a(this.f42595m, i12 > 0 ? LayoutDirection.f42838b : LayoutDirection.f42839c, bVar.f42591h);
            float f12 = this.f42599q;
            boolean z12 = d0A instanceof D0.a;
            Canvas canvas = this.f42597o;
            Paint paint = this.f42598p;
            float f13 = this.f42600r;
            if (z12) {
                canvas.save();
                l0.j jVarW = ((D0.a) d0A).f39221a.w();
                canvas.translate(f12, f13 - ((jVarW.f413393d - jVarW.f413391b) / 2.0f));
                C22277p c22277p = ((D0.a) d0A).f39221a;
                if (c22277p == null) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                canvas.drawPath(c22277p.f39716a, paint);
                canvas.restore();
            } else if (d0A instanceof D0.c) {
                D0.c cVar = (D0.c) d0A;
                boolean zC2 = m.c(cVar.f39223a);
                l0.l lVar = cVar.f39223a;
                if (zC2) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lVar.f413398e >> 32));
                    canvas.drawRoundRect(f12, f13 - (lVar.b() / 2.0f), (lVar.c() * i12) + f12, (lVar.b() / 2.0f) + f13, fIntBitsToFloat, fIntBitsToFloat, paint);
                } else {
                    C22277p c22277pA = C22315w.a();
                    Path.b(c22277pA, lVar);
                    canvas.save();
                    canvas.translate(f12, f13 - (lVar.b() / 2.0f));
                    canvas.drawPath(c22277pA.f39716a, paint);
                    canvas.restore();
                }
            } else if (d0A instanceof D0.b) {
                l0.j jVar = ((D0.b) d0A).f39222a;
                float f14 = (jVar.f413393d - jVar.f413391b) / 2.0f;
                canvas.drawRect(f12, f13 - f14, r.c(jVar.f413392c, jVar.f413390a, i12, f12), f14 + f13, paint);
            }
            return G0.f406611a;
        }
    }

    public b(@k h1 h1Var, float f12, float f13, float f14, @l J j12, float f15, @k j jVar, @k androidx.compose.ui.unit.d dVar, float f16) {
        this.f42585b = h1Var;
        this.f42586c = f12;
        this.f42587d = f13;
        this.f42588e = j12;
        this.f42589f = f15;
        this.f42590g = jVar;
        this.f42591h = dVar;
        int iB2 = kotlin.math.b.b(f12 + f14);
        this.f42592i = iB2;
        this.f42593j = kotlin.math.b.b(f16) - iB2;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@l Canvas canvas, @l Paint paint, int i12, int i13, int i14, int i15, int i16, @l CharSequence charSequence, int i17, int i18, boolean z12, @l Layout layout) {
        if (canvas == null) {
            return;
        }
        float f12 = (i14 + i16) / 2.0f;
        int i19 = i12 - this.f42592i;
        if (i19 < 0) {
            i19 = 0;
        }
        int i22 = i19;
        if (((Spanned) charSequence).getSpanStart(this) != i17 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        n nVar = n.f39497a;
        j jVar = this.f42590g;
        Integer numValueOf = null;
        if (L.f(jVar, nVar)) {
            paint.setStyle(Paint.Style.FILL);
        } else if (jVar instanceof o) {
            paint.setStyle(Paint.Style.STROKE);
            o oVar = (o) jVar;
            paint.setStrokeWidth(oVar.f39499a);
            paint.setStrokeMiter(oVar.f39500b);
            paint.setStrokeCap(d.a(oVar.f39501c));
            paint.setStrokeJoin(d.b(oVar.f39502d));
            I0 i02 = oVar.f39503e;
            paint.setPathEffect(i02 != null ? ((C22279q) i02).f39745b : null);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f42586c) << 32) | (Float.floatToRawIntBits(this.f42587d) & 4294967295L);
        n.a aVar = l0.n.f413402b;
        a aVar2 = new a(jFloatToRawIntBits, i13, canvas, paint, i22, f12);
        J j12 = this.f42588e;
        float f13 = this.f42589f;
        if (j12 == null) {
            if (!Float.isNaN(f13)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f13 * 255.0f));
            }
            aVar2.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (j12 instanceof k1) {
            int color = paint.getColor();
            if (!Float.isNaN(f13)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f13 * 255.0f));
            }
            paint.setColor(V.j(((k1) j12).f39547b));
            aVar2.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (j12 instanceof d1) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f13)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f13 * 255.0f));
            }
            paint.setShader(((d1) j12).b(jFloatToRawIntBits));
            aVar2.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        int i12 = this.f42593j;
        if (i12 >= 0) {
            return 0;
        }
        return Math.abs(i12);
    }
}
