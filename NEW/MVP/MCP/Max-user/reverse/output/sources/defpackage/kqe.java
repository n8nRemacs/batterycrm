package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class kqe extends vhd implements u6g {
    public final Rect a = new Rect();
    public final Paint b;

    public kqe(Context context) {
        Paint paint = new Paint();
        paint.setColor(a93.s0.x(context).k().i().b.b);
        this.b = paint;
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        mid midVarU;
        phd phdVar = recyclerView.z0;
        long j = (phdVar == null || !phdVar.b || (midVarU = RecyclerView.U(view)) == null) ? -1L : midVarU.o;
        if (j == -1) {
            return;
        }
        if (j == lbb.i) {
            rect.bottom = u45.c(0.5f, vw4.d().getDisplayMetrics().density, rect.bottom);
        } else if (j == lbb.n) {
            rect.top = u45.c(0.5f, vw4.d().getDisplayMetrics().density, rect.top);
        }
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        mid midVarU;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                phd phdVar = recyclerView.z0;
                long j = -1;
                if (phdVar != null && phdVar.b && (midVarU = RecyclerView.U(childAt)) != null) {
                    j = midVarU.o;
                }
                long j2 = lbb.i;
                Paint paint = this.b;
                Rect rect = this.a;
                if (j == j2) {
                    rect.left = childAt.getLeft();
                    rect.top = childAt.getBottom();
                    rect.bottom = u45.c(0.5f, vw4.d().getDisplayMetrics().density, childAt.getBottom());
                    rect.right = childAt.getRight();
                    canvas.drawRect(rect, paint);
                    return;
                }
                if (j == lbb.n) {
                    rect.left = childAt.getLeft();
                    rect.top = u45.c(0.5f, vw4.d().getDisplayMetrics().density, childAt.getTop());
                    rect.bottom = childAt.getTop();
                    rect.right = childAt.getRight();
                    canvas.drawRect(rect, paint);
                    return;
                }
            }
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.setColor(yebVar.i().b.b);
    }
}
