package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.ui.graphics.C22275o;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/n;", "Landroidx/compose/ui/graphics/F0;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22273n implements F0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Paint f39702a;

    /* renamed from: b, reason: collision with root package name */
    public int f39703b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Shader f39704c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public U f39705d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public I0 f39706e;

    public C22273n(@Y61.k Paint paint) {
        this.f39702a = paint;
        E.f39229b.getClass();
        this.f39703b = E.f39232e;
    }

    @Override // androidx.compose.ui.graphics.F0
    public final long a() {
        return V.b(this.f39702a.getColor());
    }

    @Override // androidx.compose.ui.graphics.F0
    public final void b(long j12) {
        this.f39702a.setColor(V.j(j12));
    }

    @Override // androidx.compose.ui.graphics.F0
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final Paint getF39702a() {
        return this.f39702a;
    }

    @Override // androidx.compose.ui.graphics.F0
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Shader getF39704c() {
        return this.f39704c;
    }

    @Override // androidx.compose.ui.graphics.F0
    public final void e(@Y61.l Shader shader) {
        this.f39704c = shader;
        this.f39702a.setShader(shader);
    }

    public final int f() {
        if (this.f39702a.isFilterBitmap()) {
            C22258i0.f39518b.getClass();
            return C22258i0.f39519c;
        }
        C22258i0.f39518b.getClass();
        return 0;
    }

    public final int g() {
        Paint.Cap strokeCap = this.f39702a.getStrokeCap();
        int i12 = strokeCap == null ? -1 : C22275o.a.f39711a[strokeCap.ordinal()];
        if (i12 == 1) {
            m1.f39698b.getClass();
            return 0;
        }
        if (i12 == 2) {
            m1.f39698b.getClass();
            return m1.f39699c;
        }
        if (i12 != 3) {
            m1.f39698b.getClass();
            return 0;
        }
        m1.f39698b.getClass();
        return m1.f39700d;
    }

    @Override // androidx.compose.ui.graphics.F0
    public final float getAlpha() {
        return this.f39702a.getAlpha() / 255.0f;
    }

    public final int h() {
        Paint.Join strokeJoin = this.f39702a.getStrokeJoin();
        int i12 = strokeJoin == null ? -1 : C22275o.a.f39712b[strokeJoin.ordinal()];
        if (i12 == 1) {
            n1.f39707b.getClass();
            return 0;
        }
        if (i12 == 2) {
            n1.f39707b.getClass();
            return n1.f39709d;
        }
        if (i12 != 3) {
            n1.f39707b.getClass();
            return 0;
        }
        n1.f39707b.getClass();
        return n1.f39708c;
    }

    public final void i(int i12) {
        if (E.a(this.f39703b, i12)) {
            return;
        }
        this.f39703b = i12;
        int i13 = Build.VERSION.SDK_INT;
        Paint paint = this.f39702a;
        if (i13 < 29) {
            paint.setXfermode(new PorterDuffXfermode(C22243b.b(i12)));
        } else {
            v1.f39770a.getClass();
            paint.setBlendMode(C22243b.a(i12));
        }
    }

    public final void j(@Y61.l U u12) {
        this.f39705d = u12;
        this.f39702a.setColorFilter(u12 != null ? u12.f39333a : null);
    }

    public final void k(int i12) {
        C22258i0.f39518b.getClass();
        this.f39702a.setFilterBitmap(!C22258i0.a(i12, 0));
    }

    public final void l(@Y61.l I0 i02) {
        C22279q c22279q = (C22279q) i02;
        this.f39702a.setPathEffect(c22279q != null ? c22279q.f39745b : null);
        this.f39706e = i02;
    }

    public final void m(int i12) {
        m1.f39698b.getClass();
        this.f39702a.setStrokeCap(m1.b(i12, m1.f39700d) ? Paint.Cap.SQUARE : m1.b(i12, m1.f39699c) ? Paint.Cap.ROUND : m1.b(i12, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void n(int i12) {
        n1.f39707b.getClass();
        this.f39702a.setStrokeJoin(n1.b(i12, 0) ? Paint.Join.MITER : n1.b(i12, n1.f39709d) ? Paint.Join.BEVEL : n1.b(i12, n1.f39708c) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void o(float f12) {
        this.f39702a.setStrokeMiter(f12);
    }

    public final void p(float f12) {
        this.f39702a.setStrokeWidth(f12);
    }

    public final void q(int i12) {
        H0.f39278b.getClass();
        this.f39702a.setStyle(i12 == H0.f39279c ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @Override // androidx.compose.ui.graphics.F0
    public final void setAlpha(float f12) {
        this.f39702a.setAlpha((int) Math.rint(f12 * 255.0f));
    }

    public C22273n() {
        this(new Paint(7));
    }
}
