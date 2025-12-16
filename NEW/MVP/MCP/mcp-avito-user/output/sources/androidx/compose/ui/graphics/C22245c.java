package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.unit.q;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: AndroidCanvas.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Landroidx/compose/ui/graphics/M;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* renamed from: androidx.compose.ui.graphics.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22245c implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Canvas f39351a = C22247d.f39473a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Rect f39352b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Rect f39353c;

    @Override // androidx.compose.ui.graphics.M
    public final void a(@Y61.k InterfaceC22280q0 interfaceC22280q0, long j12, long j13, long j14, long j15, @Y61.k F0 f02) {
        if (this.f39352b == null) {
            this.f39352b = new Rect();
            this.f39353c = new Rect();
        }
        Canvas canvas = this.f39351a;
        Bitmap bitmapA = C22263l.a(interfaceC22280q0);
        Rect rect = this.f39352b;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        int i12 = (int) (j12 >> 32);
        rect.left = i12;
        int i13 = (int) (j12 & 4294967295L);
        rect.top = i13;
        rect.right = i12 + ((int) (j13 >> 32));
        rect.bottom = i13 + ((int) (j13 & 4294967295L));
        kotlin.G0 g02 = kotlin.G0.f406611a;
        Rect rect2 = this.f39353c;
        int i14 = (int) (j14 >> 32);
        rect2.left = i14;
        int i15 = (int) (j14 & 4294967295L);
        rect2.top = i15;
        rect2.right = i14 + ((int) (j15 >> 32));
        rect2.bottom = i15 + ((int) (j15 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void b(float f12, float f13, float f14, float f15, float f16, float f17, @Y61.k F0 f02) {
        this.f39351a.drawArc(f12, f13, f14, f15, f16, f17, false, f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void c(float f12, float f13, float f14, float f15, int i12) {
        Canvas canvas = this.f39351a;
        S.f39317b.getClass();
        canvas.clipRect(f12, f13, f14, f15, i12 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void d(@Y61.k InterfaceC22280q0 interfaceC22280q0, @Y61.k F0 f02) {
        this.f39351a.drawBitmap(C22263l.a(interfaceC22280q0), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void e(@Y61.k l0.j jVar, @Y61.k F0 f02) {
        Canvas canvas = this.f39351a;
        Paint paintC = f02.c();
        canvas.saveLayer(jVar.f413390a, jVar.f413391b, jVar.f413392c, jVar.f413393d, paintC, 31);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void f() {
        P p12 = P.f39294a;
        Canvas canvas = this.f39351a;
        p12.getClass();
        P.a(canvas, false);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void g(float f12, float f13) {
        this.f39351a.scale(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void h(@Y61.k Path path, int i12) {
        Canvas canvas = this.f39351a;
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path2 = ((C22277p) path).f39716a;
        S.f39317b.getClass();
        canvas.clipPath(path2, i12 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void i() {
        this.f39351a.restore();
    }

    @Override // androidx.compose.ui.graphics.M
    public final void j(long j12, long j13, @Y61.k F0 f02) {
        this.f39351a.drawLine(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void k() {
        this.f39351a.save();
    }

    @Override // androidx.compose.ui.graphics.M
    public final void l(@Y61.k float[] fArr) {
        if (B0.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        C22271m.a(matrix, fArr);
        this.f39351a.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void m(float f12, float f13) {
        this.f39351a.translate(f12, f13);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void p(float f12, long j12, @Y61.k F0 f02) {
        this.f39351a.drawCircle(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f12, f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void q(float f12, float f13, float f14, float f15, @Y61.k F0 f02) {
        this.f39351a.drawRect(f12, f13, f14, f15, f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void s() {
        P p12 = P.f39294a;
        Canvas canvas = this.f39351a;
        p12.getClass();
        P.a(canvas, true);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void t(@Y61.k ArrayList arrayList, @Y61.k F0 f02) {
        U0.f39334b.getClass();
        if (U0.a(0, U0.f39335c)) {
            x(arrayList, f02, 2);
            return;
        }
        if (U0.a(0, U0.f39336d)) {
            x(arrayList, f02, 1);
            return;
        }
        if (U0.a(0, 0)) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                long j12 = ((l0.g) arrayList.get(i12)).f413387a;
                this.f39351a.drawPoint(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f02.c());
            }
        }
    }

    @Override // androidx.compose.ui.graphics.M
    public final void u(float f12) {
        this.f39351a.rotate(f12);
    }

    @Override // androidx.compose.ui.graphics.M
    public final void v(@Y61.k Path path, @Y61.k F0 f02) {
        Canvas canvas = this.f39351a;
        if (!(path instanceof C22277p)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C22277p) path).f39716a, f02.c());
    }

    @Override // androidx.compose.ui.graphics.M
    public final void w(float f12, float f13, float f14, float f15, float f16, float f17, @Y61.k F0 f02) {
        this.f39351a.drawRoundRect(f12, f13, f14, f15, f16, f17, f02.c());
    }

    public final void x(ArrayList arrayList, F0 f02, int i12) {
        if (arrayList.size() >= 2) {
            Paint paintC = f02.c();
            int i13 = 0;
            while (i13 < arrayList.size() - 1) {
                long j12 = ((l0.g) arrayList.get(i13)).f413387a;
                long j13 = ((l0.g) arrayList.get(i13 + 1)).f413387a;
                this.f39351a.drawLine(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), paintC);
                i13 += i12;
            }
        }
    }

    @Y61.k
    /* renamed from: y, reason: from getter */
    public final Canvas getF39351a() {
        return this.f39351a;
    }

    public final void z(@Y61.k Canvas canvas) {
        this.f39351a = canvas;
    }
}
