package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class be0 extends Drawable implements u6g {
    public final Object X;
    public final Drawable a;
    public final nxa b;
    public final em6 c;
    public final em6 d;
    public final Paint o;

    public be0(Drawable drawable, nxa nxaVar, yeb yebVar, em6 em6Var, em6 em6Var2) {
        Paint paint;
        this.a = drawable;
        this.b = nxaVar;
        this.c = em6Var;
        this.d = em6Var2;
        if (em6Var2 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) em6Var2.invoke(yebVar)).intValue());
        } else {
            paint = null;
        }
        this.o = paint;
        k18 k18VarB = ipi.b(3, new l(18));
        this.X = k18VarB;
        if ((nxaVar instanceof mxa) && paint != null) {
            hte.a((Path) k18VarB.getValue(), getBounds());
        }
        if (em6Var != null) {
            t35.g(drawable, ((Number) em6Var.invoke(yebVar)).intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.o;
        if (paint != null) {
            nxa nxaVar = this.b;
            if (nxaVar instanceof kxa) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
            } else if (nxaVar instanceof mxa) {
                canvas.drawPath((Path) this.X.getValue(), paint);
            } else if (!fni.a(nxaVar, lxa.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Drawable drawable = this.a;
        float fWidth = drawable.getBounds().width() / 2.0f;
        float fExactCenterX = getBounds().exactCenterX() - fWidth;
        float fExactCenterY = getBounds().exactCenterY() - fWidth;
        int iSave = canvas.save();
        canvas.translate(fExactCenterX, fExactCenterY);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        nxa nxaVar = this.b;
        boolean z = nxaVar instanceof mxa;
        Drawable drawable = this.a;
        Paint paint = this.o;
        if (z) {
            hte.a((Path) this.X.getValue(), rect);
        } else if (nxaVar instanceof lxa) {
            int iMin = Math.min(rect.width(), rect.height());
            if (paint != null) {
                int i = uxa.K0;
                iMin = mzi.b(iMin);
            }
            drawable.setBounds(0, 0, iMin, iMin);
        }
        int iMin2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            int i2 = uxa.K0;
            iMin2 = mzi.b(iMin2);
        }
        drawable.setBounds(0, 0, iMin2, iMin2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        em6 em6Var;
        Paint paint = this.o;
        if (paint != null && (em6Var = this.d) != null) {
            paint.setColor(((Number) em6Var.invoke(yebVar)).intValue());
        }
        Drawable drawable = this.a;
        em6 em6Var2 = this.c;
        if (em6Var2 != null) {
            t35.g(drawable, ((Number) em6Var2.invoke(yebVar)).intValue());
        }
        if (paint == null && em6Var2 == null) {
            u6g u6gVar = drawable instanceof u6g ? (u6g) drawable : null;
            if (u6gVar != null) {
                u6gVar.onThemeChanged(yebVar);
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
