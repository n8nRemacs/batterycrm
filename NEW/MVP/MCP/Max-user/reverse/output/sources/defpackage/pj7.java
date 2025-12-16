package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pj7 extends f45 {
    public final q45 v0;
    public n2 w0;
    public izg x0;

    public pj7(Context context, rk0 rk0Var, q45 q45Var, n2 n2Var) {
        super(context, rk0Var);
        this.v0 = q45Var;
        this.w0 = n2Var;
        n2Var.b = this;
    }

    @Override // defpackage.f45
    public final boolean d(boolean z, boolean z2, boolean z3) {
        izg izgVar;
        boolean zD = super.d(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (izgVar = this.x0) != null) {
            return izgVar.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.w0.B();
        }
        if (z && z3) {
            this.w0.h0();
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        izg izgVar;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            jh jhVar = this.c;
            rk0 rk0Var = this.b;
            if (jhVar != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (izgVar = this.x0) != null) {
                izgVar.setBounds(getBounds());
                t35.g(this.x0, rk0Var.c[0]);
                this.x0.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.o;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            q45 q45Var = this.v0;
            q45Var.a.a();
            q45Var.a(canvas, bounds, fB, z, z2);
            int i2 = rk0Var.g;
            int i3 = this.t0;
            Paint paint = this.s0;
            if (i2 == 0) {
                this.v0.d(canvas, paint, 0.0f, 1.0f, rk0Var.d, i3, 0);
                i = i2;
            } else {
                p45 p45Var = (p45) ((ArrayList) this.w0.c).get(0);
                p45 p45Var2 = (p45) wy1.d((ArrayList) this.w0.c, 1);
                q45 q45Var2 = this.v0;
                if (q45Var2 instanceof r48) {
                    i = i2;
                    q45Var2.d(canvas, paint, 0.0f, p45Var.a, rk0Var.d, i3, i);
                    this.v0.d(canvas, paint, p45Var2.b, 1.0f, rk0Var.d, i3, i);
                } else {
                    i = i2;
                    i3 = 0;
                    q45Var2.d(canvas, paint, p45Var2.b, p45Var.a + 1.0f, rk0Var.d, 0, i);
                }
            }
            for (int i4 = 0; i4 < ((ArrayList) this.w0.c).size(); i4++) {
                p45 p45Var3 = (p45) ((ArrayList) this.w0.c).get(i4);
                this.v0.c(canvas, paint, p45Var3, this.t0);
                if (i4 > 0 && i > 0) {
                    this.v0.d(canvas, paint, ((p45) ((ArrayList) this.w0.c).get(i4 - 1)).b, p45Var3.a, rk0Var.d, i3, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.v0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.v0.f();
    }
}
