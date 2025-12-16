package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ry6 extends View {
    public static final /* synthetic */ int d = 0;
    public final Paint a;
    public final py6 b;
    public qy6 c;

    public ry6(Context context) {
        super(context, null, 0);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = b6a.N();
        paint.setStyle(Paint.Style.FILL);
        this.b = getDrawConfiguration();
    }

    public static void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Pages number is negative");
        }
        if (i2 >= i) {
            throw new IllegalArgumentException("Selected page index is equal or bigger than pages number");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Selected page index is negative");
        }
    }

    private final int getBigDotsNumber() {
        return Math.min(1, this.c.a);
    }

    private static final qy6 getDefaultPageState() {
        return b6a.N();
    }

    private final float getDotsAnimationShift() {
        int iV = az1.v(this.c.f);
        if (iV == 0 || iV == 1) {
            return 0.0f;
        }
        py6 py6Var = this.b;
        if (iV == 2) {
            return (-this.c.c) * py6Var.d;
        }
        if (iV == 3) {
            return (1.0f - this.c.c) * py6Var.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final py6 getDrawConfiguration() {
        float f = vw4.d().getDisplayMetrics().density * 3.0f;
        float f2 = vw4.d().getDisplayMetrics().density * 2.0f;
        float f3 = vw4.d().getDisplayMetrics().density * 1.0f;
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        v1a v1aVar = a93.s0;
        int i = v1aVar.B(this).c.getIcon().h;
        yeb yebVar = v1aVar.B(this).c;
        return new py6(f, f2, f3, iD, i);
    }

    private final float getSelectedBigDotAnimationShift() {
        int iV = az1.v(this.c.f);
        if (iV == 0) {
            return 0.0f;
        }
        if (iV == 1) {
            return this.c.c * this.b.d;
        }
        if (iV == 2 || iV == 3) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(int i, int i2) {
        if (i == 0) {
            this.c = b6a.N();
            invalidate();
            return;
        }
        a(i, i2);
        qy6 qy6Var = this.c;
        if (i == qy6Var.a) {
            c(i2, 0.0f);
            return;
        }
        qy6Var.a = i;
        qy6Var.b = i2;
        qy6Var.c = 0.0f;
        if (qy6Var.d >= i) {
            qy6Var.d = Math.min(i - 1, 0);
        } else if (i <= 1) {
            qy6Var.d = i2;
        }
        qy6 qy6Var2 = this.c;
        qy6Var2.f = 1;
        qy6Var2.e = false;
        invalidate();
    }

    public final void c(int i, float f) {
        qy6 qy6Var = this.c;
        int i2 = qy6Var.b;
        qy6Var.b = i;
        int i3 = i - i2;
        int i4 = qy6Var.d;
        int i5 = i4 + i3;
        int i6 = 1;
        if (qy6Var.e && i3 == 1) {
            qy6Var.e = false;
            i3 = 0;
            i5 = 0;
        }
        if (i3 != 0) {
            qy6Var.e = i5 < 0;
        }
        qy6Var.d = n7j.c(i5, 0, 0);
        qy6 qy6Var2 = this.c;
        int i7 = qy6Var2.f;
        int i8 = qy6Var2.b;
        int i9 = qy6Var2.d;
        if (f != 0.0f) {
            if (i7 == 1 || i8 != i2) {
                i6 = 2;
                if (i8 < i2) {
                    if (i4 == 0 && i9 == 0) {
                        i6 = 4;
                    }
                } else if (i9 == 0) {
                    i6 = 3;
                }
            } else {
                i6 = i7;
            }
        }
        qy6Var2.f = i6;
        qy6Var2.c = f;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry6.onDraw(android.graphics.Canvas):void");
    }

    public final void setSelectedPageIndex(int i) {
        a(this.c.a, i);
        c(i, 0.0f);
    }
}
