package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class qh9 extends Drawable {
    public final Path f;
    public Path g;
    public final float h;
    public final float i;
    public final float[] j;
    public int k;
    public LinearGradient l;
    public LinearGradient m;
    public final Matrix n;
    public final ph9 o;
    public final ph9 p;
    public float q;
    public static final /* synthetic */ yy7[] t = {new z8a(qh9.class, "incomingBackgroundColor", "getIncomingBackgroundColor()[I"), u45.h(vid.a, qh9.class, "outgoingBackgroundColor", "getOutgoingBackgroundColor()[I")};
    public static final kk4 s = new kk4(24);
    public static final Paint u = new Paint(1);
    public boolean a = false;
    public int r = 3;
    public boolean b = true;
    public boolean c = true;
    public boolean d = false;
    public final RectF e = new RectF();

    public qh9(int[] iArr, int[] iArr2) {
        float[] fArr;
        new RectF();
        this.f = new Path();
        this.h = vw4.d().getDisplayMetrics().density * 6.0f;
        this.i = vw4.d().getDisplayMetrics().density * 16.0f;
        float f = vw4.d().getDisplayMetrics().density;
        kti.d(2 * vw4.d().getDisplayMetrics().density);
        if (this.c) {
            fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = this.i;
            }
        } else {
            fArr = new float[8];
        }
        this.j = fArr;
        this.k = 255;
        this.n = new Matrix();
        this.o = new ph9(iArr, this, 0);
        this.p = new ph9(iArr2, this, 1);
    }

    public static boolean b(qh9 qh9Var, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4) {
        boolean z5 = (qh9Var.b == z3 && qh9Var.a == z && qh9Var.r == i && qh9Var.c == z2 && qh9Var.d == z4) ? false : true;
        qh9Var.b = z3;
        qh9Var.a = z;
        qh9Var.r = i;
        qh9Var.c = z2;
        qh9Var.d = z4;
        if (z5) {
            qh9Var.c(qh9Var.getBounds());
        }
        return z5;
    }

    public final float[] a() {
        float[] fArr = this.j;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final void c(Rect rect) {
        int i = this.r;
        boolean z = this.a;
        boolean z2 = this.c;
        boolean z3 = this.d;
        float[] fArr = this.j;
        if (z2) {
            ys.q(fArr, this.i);
            int i2 = i == 0 ? -1 : rh9.$EnumSwitchMapping$0[az1.v(i)];
            if (i2 != -1) {
                float f = this.h;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z) {
                                fArr[0] = f;
                                fArr[1] = f;
                            } else {
                                fArr[3] = f;
                                fArr[2] = f;
                            }
                        } else if (z) {
                            fArr[0] = f;
                            fArr[1] = f;
                            fArr[6] = f;
                            fArr[7] = f;
                        } else {
                            fArr[2] = f;
                            fArr[3] = f;
                            fArr[4] = f;
                            fArr[5] = f;
                        }
                    } else if (z) {
                        fArr[7] = f;
                        fArr[6] = f;
                    } else {
                        fArr[5] = f;
                        fArr[4] = f;
                    }
                } else if (z3) {
                    fArr[4] = f;
                    fArr[5] = f;
                    fArr[6] = f;
                    fArr[7] = f;
                }
            }
        }
        Path path = this.f;
        path.reset();
        float f2 = (rect.bottom - 0.0f) - this.q;
        RectF rectF = this.e;
        rectF.set(rect.left + 0.0f, rect.top + 0.0f, rect.right - 0.0f, f2);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.g = null;
        yy7[] yy7VarArr = t;
        yy7 yy7Var = yy7VarArr[0];
        d((int[]) this.o.b, rect);
        yy7 yy7Var2 = yy7VarArr[1];
        e((int[]) this.p.b, rect);
    }

    public final void d(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.n;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.l = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        if (u35.a(this) == 1) {
            float f = 2;
            canvas.scale(-1.0f, 1.0f, getBounds().width() / f, getBounds().height() / f);
        }
        if (this.b) {
            LinearGradient linearGradient = this.a ? this.l : this.m;
            Paint paint = u;
            paint.setShader(linearGradient);
            paint.setStyle(Paint.Style.FILL);
            paint.setAlpha(this.k);
            canvas.drawPath(this.f, paint);
        }
        canvas.restore();
    }

    public final void e(int[] iArr, Rect rect) {
        LinearGradient linearGradient = new LinearGradient(1.0f, 0.1f, 0.0f, 0.9f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.n;
        matrix.reset();
        matrix.setScale(rect.width(), rect.height());
        matrix.postTranslate(rect.left, rect.top);
        linearGradient.setLocalMatrix(matrix);
        this.m = linearGradient;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            super.getOutline(outline);
            return;
        }
        Path path = this.g;
        if (path == null) {
            path = this.f;
        }
        outline.setPath(path);
        outline.setAlpha(0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
