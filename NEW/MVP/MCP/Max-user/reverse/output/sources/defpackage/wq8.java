package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class wq8 extends Drawable implements ite {
    public static final Paint H0;
    public final mc5 A0;
    public final y87 B0;
    public PorterDuffColorFilter C0;
    public PorterDuffColorFilter D0;
    public int E0;
    public final RectF F0;
    public final boolean G0;
    public final Matrix X;
    public final Path Y;
    public final Path Z;
    public vq8 a;
    public final fte[] b;
    public final fte[] c;
    public final BitSet d;
    public boolean o;
    public final RectF s0;
    public final RectF t0;
    public final Region u0;
    public final Region v0;
    public xse w0;
    public final Paint x0;
    public final Paint y0;
    public final vse z0;

    static {
        Paint paint = new Paint(1);
        H0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public wq8() {
        this(new xse());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        vq8 vq8Var = this.a;
        this.B0.c(vq8Var.a, vq8Var.i, rectF, this.A0, path);
        if (this.a.h != 1.0f) {
            Matrix matrix = this.X;
            matrix.reset();
            float f = this.a.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.F0, true);
    }

    public final int c(int i) {
        vq8 vq8Var = this.a;
        float f = vq8Var.m + 0.0f + vq8Var.l;
        ca5 ca5Var = vq8Var.b;
        return ca5Var != null ? ca5Var.a(i, f) : i;
    }

    public final void d(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("wq8", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.a.p;
        Path path = this.Y;
        vse vseVar = this.z0;
        if (i != 0) {
            canvas.drawPath(path, vseVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            fte fteVar = this.b[i2];
            int i3 = this.a.o;
            Matrix matrix = fte.b;
            fteVar.a(matrix, vseVar, i3, canvas);
            this.c[i2].a(matrix, vseVar, this.a.o, canvas);
        }
        if (this.G0) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * this.a.p);
            int iCos = (int) (Math.cos(Math.toRadians(d)) * this.a.p);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, H0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq8.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, xse xseVar, RectF rectF) {
        if (!xseVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = xseVar.f.a(rectF) * this.a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        xse xseVar = this.w0;
        RectF rectFG = g();
        RectF rectF = this.t0;
        rectF.set(rectFG);
        boolean zH = h();
        Paint paint = this.y0;
        float strokeWidth = zH ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.Z, xseVar, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.s0;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        vq8 vq8Var = this.a;
        if (vq8Var.n == 2) {
            return;
        }
        if (vq8Var.a.d(g())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(g()) * this.a.i);
            return;
        }
        RectF rectFG = g();
        Path path = this.Y;
        b(rectFG, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c45.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                b45.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            b45.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.u0;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.Y;
        b(rectFG, path);
        Region region2 = this.v0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.a.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.y0.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.a.b = new ca5(context);
        p();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.o = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.a.getClass();
        ColorStateList colorStateList2 = this.a.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.a.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(float f) {
        vq8 vq8Var = this.a;
        if (vq8Var.m != f) {
            vq8Var.m = f;
            p();
        }
    }

    public final void k(ColorStateList colorStateList) {
        vq8 vq8Var = this.a;
        if (vq8Var.c != colorStateList) {
            vq8Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void l() {
        vq8 vq8Var = this.a;
        if (vq8Var.n != 2) {
            vq8Var.n = 2;
            super.invalidateSelf();
        }
    }

    public final void m(ColorStateList colorStateList) {
        vq8 vq8Var = this.a;
        if (vq8Var.d != colorStateList) {
            vq8Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new vq8(this.a);
        return this;
    }

    public final boolean n(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.x0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.y0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean o() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.C0;
        PorterDuffColorFilter porterDuffColorFilter3 = this.D0;
        vq8 vq8Var = this.a;
        ColorStateList colorStateList = vq8Var.e;
        PorterDuff.Mode mode = vq8Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.x0.getColor();
            int iC = c(color);
            this.E0 = iC;
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iC2 = c(colorStateList.getColorForState(getState(), 0));
            this.E0 = iC2;
            porterDuffColorFilter = new PorterDuffColorFilter(iC2, mode);
        }
        this.C0 = porterDuffColorFilter;
        this.a.getClass();
        this.D0 = null;
        this.a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.C0) && Objects.equals(porterDuffColorFilter3, this.D0)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.o = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.z3g
    public boolean onStateChange(int[] iArr) {
        boolean z = n(iArr) || o();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p() {
        vq8 vq8Var = this.a;
        float f = vq8Var.m + 0.0f;
        vq8Var.o = (int) Math.ceil(0.75f * f);
        this.a.p = (int) Math.ceil(f * 0.25f);
        o();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        vq8 vq8Var = this.a;
        if (vq8Var.k != i) {
            vq8Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.ite
    public final void setShapeAppearanceModel(xse xseVar) {
        this.a.a = xseVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.e = colorStateList;
        o();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        vq8 vq8Var = this.a;
        if (vq8Var.f != mode) {
            vq8Var.f = mode;
            o();
            super.invalidateSelf();
        }
    }

    public wq8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(xse.b(context, attributeSet, i, i2).g());
    }

    public wq8(xse xseVar) {
        this(new vq8(xseVar));
    }

    public wq8(vq8 vq8Var) {
        y87 y87Var;
        this.b = new fte[4];
        this.c = new fte[4];
        this.d = new BitSet(8);
        this.X = new Matrix();
        this.Y = new Path();
        this.Z = new Path();
        this.s0 = new RectF();
        this.t0 = new RectF();
        this.u0 = new Region();
        this.v0 = new Region();
        Paint paint = new Paint(1);
        this.x0 = paint;
        Paint paint2 = new Paint(1);
        this.y0 = paint2;
        this.z0 = new vse();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            y87Var = yse.a;
        } else {
            y87Var = new y87();
        }
        this.B0 = y87Var;
        this.F0 = new RectF();
        this.G0 = true;
        this.a = vq8Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        o();
        n(getState());
        this.A0 = new mc5(20, this);
    }
}
