package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.facebook.animated.gif.GifImage;

/* loaded from: classes.dex */
public final class uo0 {
    public final r2c a;
    public final bp0 b;
    public final a3b c;
    public final we d;
    public final boolean e;
    public final cp0 f;
    public final hk4 g;
    public final Bitmap.Config h = Bitmap.Config.ARGB_8888;
    public final Paint i = new Paint(6);
    public Rect j;
    public int k;
    public int l;

    public uo0(r2c r2cVar, bp0 bp0Var, a3b a3bVar, we weVar, boolean z, cp0 cp0Var, hk4 hk4Var) {
        this.a = r2cVar;
        this.b = bp0Var;
        this.c = a3bVar;
        this.d = weVar;
        this.e = z;
        this.f = cp0Var;
        this.g = hk4Var;
        new Path();
        new Matrix();
        d();
    }

    public final void a() {
        if (!this.e) {
            this.b.clear();
            return;
        }
        cp0 cp0Var = this.f;
        if (cp0Var != null) {
            cp0Var.g();
        }
    }

    public final boolean b(int i, vc3 vc3Var, Canvas canvas, int i2) {
        if (vc3Var == null || !vc3.i0(vc3Var)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) vc3Var.Z();
        Rect rect = this.j;
        Paint paint = this.i;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.e) {
            return true;
        }
        this.b.m(i, vc3Var);
        return true;
    }

    public final boolean c(Canvas canvas, int i, int i2) throws Throwable {
        vc3 vc3VarS;
        boolean zB;
        boolean zN;
        boolean zN2;
        vc3 vc3Var = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.e) {
                cp0 cp0Var = this.f;
                vc3 vc3VarF = cp0Var != null ? cp0Var.f(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (vc3VarF != null) {
                    try {
                        if (vc3VarF.h0()) {
                            Bitmap bitmap = (Bitmap) vc3VarF.Z();
                            Paint paint = this.i;
                            Rect rect = this.j;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            vc3VarF.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        vc3Var = vc3VarF;
                        vc3.P(vc3Var);
                        throw th;
                    }
                }
                if (cp0Var != null) {
                    cp0Var.i(canvas.getWidth(), canvas.getHeight());
                }
                vc3.P(vc3VarF);
                return false;
            }
            bp0 bp0Var = this.b;
            if (i2 != 0) {
                we weVar = this.d;
                if (i2 == 1) {
                    vc3VarS = bp0Var.p();
                    if (vc3VarS == null || !vc3VarS.h0()) {
                        zN = false;
                    } else {
                        zN = weVar.n((Bitmap) vc3VarS.Z(), i);
                        if (!zN) {
                            vc3VarS.close();
                        }
                    }
                    if (zN && b(i, vc3VarS, canvas, 1)) {
                        z = true;
                    }
                    zB = z;
                    i3 = 2;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            vc3VarS = bp0Var.l();
                            zB = b(i, vc3VarS, canvas, 3);
                            i3 = -1;
                        }
                        return false;
                    }
                    try {
                        vc3VarS = this.a.c(this.k, this.l, this.h);
                        if (vc3VarS == null || !vc3VarS.h0()) {
                            zN2 = false;
                        } else {
                            zN2 = weVar.n((Bitmap) vc3VarS.Z(), i);
                            if (!zN2) {
                                vc3VarS.close();
                            }
                        }
                        if (zN2 && b(i, vc3VarS, canvas, 2)) {
                            z = true;
                        }
                        zB = z;
                        i3 = 3;
                    } catch (RuntimeException e) {
                        op5.i(uo0.class, "Failed to create frame bitmap", e);
                    }
                }
            } else {
                vc3VarS = bp0Var.s(i);
                zB = b(i, vc3VarS, canvas, 0);
            }
            vc3.P(vc3VarS);
            return (zB || i3 == -1) ? zB : c(canvas, i, i3);
        } catch (Throwable th2) {
            th = th2;
            vc3.P(vc3Var);
            throw th;
        }
    }

    public final void d() {
        we weVar = this.d;
        int iK = ((GifImage) ((fs3) weVar.c).e).k();
        this.k = iK;
        if (iK == -1) {
            Rect rect = this.j;
            this.k = rect != null ? rect.width() : -1;
        }
        int iH = ((GifImage) ((fs3) weVar.c).e).h();
        this.l = iH;
        if (iH == -1) {
            Rect rect2 = this.j;
            this.l = rect2 != null ? rect2.height() : -1;
        }
    }
}
