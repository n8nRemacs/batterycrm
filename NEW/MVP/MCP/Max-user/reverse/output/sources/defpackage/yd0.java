package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yd0 extends Drawable {
    public final Drawable a;
    public final nxa b;
    public final Paint c;
    public final Object d;

    public yd0(Drawable drawable, nxa nxaVar, Context context, em6 em6Var, em6 em6Var2) {
        this.a = drawable;
        this.b = nxaVar;
        v1a v1aVar = a93.s0;
        t35.g(drawable, ((Number) em6Var.invoke(v1aVar.x(context).k())).intValue());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) em6Var2.invoke(v1aVar.x(context).k())).intValue());
        this.c = paint;
        k18 k18VarB = ipi.b(3, new l(17));
        this.d = k18VarB;
        if (nxaVar instanceof mxa) {
            hte.a((Path) k18VarB.getValue(), getBounds());
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iMin = Math.min(getBounds().width(), getBounds().height());
        nxa nxaVar = this.b;
        boolean z = nxaVar instanceof kxa;
        Paint paint = this.c;
        if (z) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
        } else if (nxaVar instanceof mxa) {
            canvas.drawPath((Path) this.d.getValue(), paint);
        } else if (!fni.a(nxaVar, lxa.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = uxa.K0;
        int iB = mzi.b(iMin);
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iB, iB);
        canvas.save();
        float f = iB / 2.0f;
        canvas.translate(getBounds().exactCenterX() - f, getBounds().exactCenterY() - f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.b instanceof mxa) {
            hte.a((Path) this.d.getValue(), rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
