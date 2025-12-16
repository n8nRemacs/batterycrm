package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class r67 extends vhd implements u6g {
    public final Rect X;
    public final Paint Y;
    public final float a;
    public final xu9 b;
    public final int c;
    public final int d;
    public final mc5 o;

    public r67(yeb yebVar, xu9 xu9Var) {
        float f = vw4.d().getDisplayMetrics().density * 1.0f;
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
        this.a = f;
        this.b = xu9Var;
        this.c = iD;
        this.d = iD2;
        this.o = new mc5(18);
        this.X = new Rect();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(f);
        this.Y = paint;
        onThemeChanged(yebVar);
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        if (iR == -1 || !this.b.c(iR).equals(Boolean.TRUE)) {
            return;
        }
        rect.top = this.d + ((int) this.a) + rect.top;
        this.o.w(rect, view, recyclerView);
    }

    @Override // defpackage.vhd
    public final void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        Canvas canvas2;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int iR = RecyclerView.R(childAt);
            if (this.b.c(iR).equals(Boolean.TRUE)) {
                mc5 mc5Var = this.o;
                Rect rect = this.X;
                mc5Var.h(rect, childAt, iR);
                float f = (this.a / 2.0f) + (this.d / 2.0f) + rect.top;
                float f2 = rect.left;
                float f3 = this.c;
                canvas2 = canvas;
                canvas2.drawLine(f2 + f3, f, rect.right - f3, f, this.Y);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.Y.setColor(yebVar.i().b.c);
    }
}
