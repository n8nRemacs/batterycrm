package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidPath.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/p;", "Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22277p implements Path {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final android.graphics.Path f39716a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public RectF f39717b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public float[] f39718c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Matrix f39719d;

    /* JADX WARN: Multi-variable type inference failed */
    public C22277p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void a(@Y61.k l0.j jVar) {
        Path.Direction[] directionArr = Path.Direction.f39304b;
        boolean zIsNaN = Float.isNaN(jVar.f413390a);
        float f12 = jVar.f413393d;
        float f13 = jVar.f413392c;
        float f14 = jVar.f413391b;
        if (zIsNaN || Float.isNaN(f14) || Float.isNaN(f13) || Float.isNaN(f12)) {
            C22315w.b("Invalid rectangle, make sure no value is NaN");
        }
        if (this.f39717b == null) {
            this.f39717b = new RectF();
        }
        this.f39717b.set(jVar.f413390a, f14, f13, f12);
        this.f39716a.addRect(this.f39717b, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void c(@Y61.k l0.l lVar) {
        Path.Direction[] directionArr = Path.Direction.f39304b;
        if (this.f39717b == null) {
            this.f39717b = new RectF();
        }
        this.f39717b.set(lVar.f413394a, lVar.f413395b, lVar.f413396c, lVar.f413397d);
        if (this.f39718c == null) {
            this.f39718c = new float[8];
        }
        float[] fArr = this.f39718c;
        long j12 = lVar.f413398e;
        fArr[0] = Float.intBitsToFloat((int) (j12 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j12 & 4294967295L));
        long j13 = lVar.f413399f;
        fArr[2] = Float.intBitsToFloat((int) (j13 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j13 & 4294967295L));
        long j14 = lVar.f413400g;
        fArr[4] = Float.intBitsToFloat((int) (j14 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j14 & 4294967295L));
        long j15 = lVar.f413401h;
        fArr[6] = Float.intBitsToFloat((int) (j15 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j15 & 4294967295L));
        this.f39716a.addRoundRect(this.f39717b, this.f39718c, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void close() {
        this.f39716a.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void d(float f12, float f13, float f14, float f15) {
        this.f39716a.rQuadTo(f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void e(long j12) {
        Matrix matrix = this.f39719d;
        if (matrix == null) {
            this.f39719d = new Matrix();
        } else {
            matrix.reset();
        }
        this.f39719d.setTranslate(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        this.f39716a.transform(this.f39719d);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void f(float f12, float f13, float f14, float f15) {
        this.f39716a.rQuadTo(f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void g(@Y61.k l0.l lVar) {
        Path.Direction[] directionArr = Path.Direction.f39304b;
        c(lVar);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final int h() {
        if (this.f39716a.getFillType() == Path.FillType.EVEN_ODD) {
            J0.f39288b.getClass();
            return J0.f39289c;
        }
        J0.f39288b.getClass();
        return 0;
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void i(float f12, float f13) {
        this.f39716a.moveTo(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean j() {
        return this.f39716a.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void k(float f12, float f13, float f14, float f15) {
        this.f39716a.quadTo(f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void l(int i12) {
        J0.f39288b.getClass();
        this.f39716a.setFillType(i12 == J0.f39289c ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void m(float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f39716a.cubicTo(f12, f13, f14, f15, f16, f17);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void n(float f12, float f13) {
        this.f39716a.rLineTo(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void o(float f12, float f13) {
        this.f39716a.rMoveTo(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void p(float f12, float f13, float f14, float f15, float f16, float f17) {
        this.f39716a.rCubicTo(f12, f13, f14, f15, f16, f17);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void r(float f12, float f13) {
        this.f39716a.lineTo(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void reset() {
        this.f39716a.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void rewind() {
        this.f39716a.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public final void s(float f12, float f13, float f14, float f15) {
        this.f39716a.quadTo(f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public final boolean u(@Y61.k Path path, @Y61.k Path path2, int i12) {
        P0.f39298b.getClass();
        Path.Op op2 = P0.a(i12, 0) ? Path.Op.DIFFERENCE : P0.a(i12, P0.f39299c) ? Path.Op.INTERSECT : P0.a(i12, P0.f39302f) ? Path.Op.REVERSE_DIFFERENCE : P0.a(i12, P0.f39300d) ? Path.Op.UNION : Path.Op.XOR;
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((C22277p) path).f39716a;
        if (path2 instanceof C22277p) {
            return this.f39716a.op(path3, ((C22277p) path2).f39716a, op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void v(@Y61.k Path path, long j12) {
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.f39716a.addPath(((C22277p) path).f39716a, Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    @Y61.k
    public final l0.j w() {
        if (this.f39717b == null) {
            this.f39717b = new RectF();
        }
        RectF rectF = this.f39717b;
        this.f39716a.computeBounds(rectF, true);
        return new l0.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void x(@Y61.k float[] fArr) {
        if (this.f39719d == null) {
            this.f39719d = new Matrix();
        }
        C22271m.a(this.f39719d, fArr);
        this.f39716a.transform(this.f39719d);
    }

    public C22277p(@Y61.k android.graphics.Path path) {
        this.f39716a = path;
    }

    public /* synthetic */ C22277p(android.graphics.Path path, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
