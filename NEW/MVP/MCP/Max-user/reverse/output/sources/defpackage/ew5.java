package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ew5 extends View {
    public yt0 a;
    public final ow5 b;
    public final px5 c;
    public final pw5 d;

    public ew5(Context context) {
        super(context, null);
        v1a v1aVar = a93.s0;
        this.a = v1aVar.y(this).a().i();
        int i = v1aVar.y(this).a().i().b.f;
        ow5 ow5Var = new ow5(context);
        ow5Var.setCallback(this);
        this.b = ow5Var;
        px5 px5Var = new px5();
        float f = 2;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD2 = (kti.d(12 * vw4.d().getDisplayMetrics().density) - iD) - (kti.d(f * vw4.d().getDisplayMetrics().density) * 2);
        px5Var.c(iD2, iD2, kti.d(5 * vw4.d().getDisplayMetrics().density) - iD);
        px5Var.d(i, i);
        px5Var.setCallback(this);
        this.c = px5Var;
        pw5 pw5Var = new pw5(context, ow5Var);
        pw5Var.setCallback(this);
        this.d = pw5Var;
        this.a = this.a;
        pw5Var.onThemeChanged(v1aVar.y(this));
        gv5 gv5Var = pw5Var.c;
        if (gv5Var == null) {
            return;
        }
        int iG = v1aVar.y(this).a().g(gv5Var.c().d);
        px5Var.d(iG, iG);
    }

    public final void a(gv5 gv5Var, boolean z) {
        px5 px5Var = this.c;
        if (!hbj.d(px5Var.f, 0.0f, 0.01f)) {
            px5Var.f = 0.0f;
            if (!z) {
                px5Var.e = 0.0f;
            }
            px5Var.invalidateSelf();
        }
        pw5 pw5Var = this.d;
        pw5Var.a(gv5Var);
        gv5 gv5Var2 = pw5Var.c;
        if (gv5Var2 == null) {
            return;
        }
        int iG = a93.s0.y(this).a().g(gv5Var2.c().d);
        px5Var.d(iG, iG);
    }

    public final void b(gv5 gv5Var, float f, boolean z) {
        float f2 = f / 100.0f;
        px5 px5Var = this.c;
        nx5 nx5Var = px5Var.h;
        ox5 ox5Var = px5Var.i;
        lx5 lx5Var = px5Var.c;
        lx5 lx5Var2 = lx5.b;
        if (lx5Var != lx5Var2 || !hbj.d(ox5Var.h, f2, 0.01f) || !hbj.d(px5Var.f, 1.0f, 0.01f)) {
            if (!px5Var.b()) {
                px5Var.b = lx5Var2;
                nx5Var.h = 1.0f;
                nx5Var.i = 1.0f;
                nx5Var.j = 1.0f;
                ox5Var.i = 1.0f;
                ox5Var.k = 1.0f;
            }
            px5Var.c = lx5Var2;
            px5Var.f = 1.0f;
            ox5Var.h = f2;
            nx5Var.j = 1.0f;
            if (!z) {
                px5Var.b = lx5Var2;
                ox5Var.g = f2;
                ox5Var.i = 1.0f;
                ox5Var.k = 1.0f;
                nx5Var.h = 1.0f;
                nx5Var.i = 1.0f;
                nx5Var.j = 1.0f;
                px5Var.e = 1.0f;
            }
            px5Var.invalidateSelf();
        }
        pw5 pw5Var = this.d;
        pw5Var.a(gv5Var);
        gv5 gv5Var2 = pw5Var.c;
        if (gv5Var2 == null) {
            return;
        }
        int iG = a93.s0.y(this).a().g(gv5Var2.c().d);
        px5Var.d(iG, iG);
    }

    public final void c(gv5 gv5Var, boolean z) {
        px5 px5Var = this.c;
        ox5 ox5Var = px5Var.i;
        nx5 nx5Var = px5Var.h;
        lx5 lx5Var = px5Var.c;
        lx5 lx5Var2 = lx5.a;
        if (lx5Var != lx5Var2 || !hbj.d(nx5Var.j, 0.0f, 0.01f) || !hbj.d(px5Var.f, 1.0f, 0.01f)) {
            if (!px5Var.b()) {
                px5Var.b = lx5Var2;
                nx5Var.h = 1.0f;
                nx5Var.i = 0.0f;
                nx5Var.j = 0.0f;
                ox5Var.i = 0.0f;
                ox5Var.k = 0.0f;
            }
            px5Var.c = lx5Var2;
            nx5Var.j = 0.0f;
            px5Var.f = 1.0f;
            if (!z) {
                px5Var.b = lx5Var2;
                nx5Var.h = 1.0f;
                nx5Var.i = 0.0f;
                nx5Var.j = 0.0f;
                ox5Var.i = 0.0f;
                ox5Var.k = 0.0f;
                px5Var.e = 1.0f;
            }
            px5Var.invalidateSelf();
        }
        pw5 pw5Var = this.d;
        pw5Var.a(gv5Var);
        gv5 gv5Var2 = pw5Var.c;
        if (gv5Var2 == null) {
            return;
        }
        int iG = a93.s0.y(this).a().g(gv5Var2.c().d);
        px5Var.d(iG, iG);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long drawingTime = getDrawingTime();
        px5 px5Var = this.c;
        nx5 nx5Var = px5Var.h;
        ox5 ox5Var = px5Var.i;
        if (px5Var.b()) {
            float fB = px5Var.j == 0 ? 0.0f : n7j.b((drawingTime - r7) / 1000.0f, 0.0f, 0.1f) * px5Var.g;
            px5Var.j = drawingTime;
            float f = 3.0f * fB;
            if (hbj.d(px5Var.f, px5Var.e, f)) {
                px5Var.e = px5Var.f;
            } else {
                float f2 = px5Var.e;
                px5Var.e = (Math.signum(px5Var.f - f2) * f) + f2;
                px5Var.invalidateSelf();
            }
            int iOrdinal = px5Var.a().ordinal();
            if (iOrdinal != 0) {
                int i = 1;
                if (iOrdinal == 1) {
                    px5Var.invalidateSelf();
                    float f3 = nx5Var.i + f;
                    nx5Var.i = f3;
                    if (f3 >= 1.0d) {
                        nx5Var.i = 1.0f;
                        px5Var.b = lx5.b;
                        ox5Var.i = 1.0f;
                        ox5Var.f = 0.0f;
                        ox5Var.g = 0.0f;
                    }
                } else if (iOrdinal == 2) {
                    px5Var.invalidateSelf();
                    float f4 = fB * 2.0f;
                    float f5 = ox5Var.g - f4;
                    ox5Var.g = f5;
                    if (f5 <= 0.0f) {
                        ox5Var.g = 0.0f;
                    } else {
                        i = 0;
                    }
                    float f6 = ox5Var.k - f;
                    ox5Var.k = f6;
                    if (f6 <= 0.0f) {
                        ox5Var.k = 0.0f;
                        i++;
                    }
                    float f7 = ox5Var.f + f4;
                    ox5Var.f = f7;
                    if (f7 > 0.9900000002235174d) {
                        ox5Var.f = 1.0f;
                        i++;
                    }
                    if (i == 3) {
                        ox5Var.i = 0.0f;
                        ox5Var.k = 0.0f;
                        nx5Var.j = 0.0f;
                        nx5Var.i = 1.0f;
                        nx5Var.h = 1.0f;
                        px5Var.b = lx5.a;
                    }
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    px5Var.invalidateSelf();
                    float f8 = 2.0f * fB;
                    ox5Var.f = (ox5Var.f + fB) % 1.0f;
                    ox5Var.i = 1.0f;
                    ox5Var.k = Math.min(1.0f, ox5Var.k + f);
                    if (hbj.d(ox5Var.g, ox5Var.h, f8)) {
                        ox5Var.g = ox5Var.h;
                    } else {
                        float f9 = ox5Var.g;
                        ox5Var.g = (Math.signum(ox5Var.h - f9) * f8) + f9;
                    }
                }
            } else if (hbj.d(nx5Var.j, nx5Var.i, f)) {
                nx5Var.i = nx5Var.j;
            } else {
                float f10 = nx5Var.i;
                nx5Var.i = (Math.signum(nx5Var.j - f10) * f) + f10;
                px5Var.invalidateSelf();
            }
        }
        int iSqrt = (int) (((float) Math.sqrt(Math.max(1.0f - px5Var.e, 1.0f - px5Var.h.i))) * 255.0f);
        pw5 pw5Var = this.d;
        pw5Var.setAlpha(iSqrt);
        pw5Var.draw(canvas);
        int iSave = canvas.save();
        canvas.translate((getWidth() - px5Var.getBounds().width()) * 0.5f, (getHeight() - px5Var.getBounds().height()) * 0.5f);
        try {
            px5Var.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            size = kti.d(40 * vw4.d().getDisplayMetrics().density);
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = kti.d(40 * vw4.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ow5 ow5Var = this.b;
        float intrinsicWidth = ow5Var.getIntrinsicWidth();
        float intrinsicHeight = ow5Var.getIntrinsicHeight();
        float fMin = Math.min(i / intrinsicWidth, i2 / intrinsicHeight);
        ow5Var.setBounds(0, 0, (int) (intrinsicWidth * fMin), (int) (intrinsicHeight * fMin));
        float f = 2;
        int iD = (int) (kti.d(vw4.d().getDisplayMetrics().density * f) * fMin);
        int iD2 = (int) (kti.d(f * vw4.d().getDisplayMetrics().density) * fMin);
        int iD3 = ((int) (kti.d(12 * vw4.d().getDisplayMetrics().density) * fMin)) - iD;
        int i5 = iD3 - (iD2 * 2);
        px5 px5Var = this.c;
        px5Var.c(i5, i5, ((int) (kti.d(5 * vw4.d().getDisplayMetrics().density) * fMin)) - iD);
        px5Var.setBounds(0, 0, i / 2, i2 / 2);
        this.d.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(null);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.c) {
            return true;
        }
        pw5 pw5Var = this.d;
        if (pw5Var != drawable) {
            return pw5Var.b == drawable;
        }
        pw5Var.getClass();
        return true;
    }
}
