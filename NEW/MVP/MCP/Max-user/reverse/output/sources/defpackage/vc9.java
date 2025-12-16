package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class vc9 extends vhd implements u6g {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Object c;
    public final Object d;

    public vc9(int i, yeb yebVar) {
        this.a = i;
        switch (i) {
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.b = paint;
                this.d = new RectF();
                this.c = new Rect();
                onThemeChanged(yebVar);
                break;
            default:
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(vw4.d().getDisplayMetrics().density * 0.5f);
                this.b = paint2;
                this.c = new Rect();
                this.d = new mc5(18);
                onThemeChanged(yebVar);
                break;
        }
    }

    public static boolean i(View view, RecyclerView recyclerView) {
        phd adapter = recyclerView.getAdapter();
        y0f y0fVar = adapter instanceof y0f ? (y0f) adapter : null;
        if (y0fVar != null) {
            iv ivVar = y0fVar.d;
            int iR = RecyclerView.R(view);
            int i = iR - 1;
            if (iR > 0) {
                int iL = y0fVar.l(iR);
                int iL2 = y0fVar.l(i);
                Object objJ = ue3.J(iR, ivVar.f);
                kc9 kc9Var = objJ instanceof kc9 ? (kc9) objJ : null;
                boolean z = (kc9Var == null || kc9Var.s0) ? false : true;
                Object objJ2 = ue3.J(i, ivVar.f);
                kc9 kc9Var2 = objJ2 instanceof kc9 ? (kc9) objJ2 : null;
                boolean z2 = kc9Var2 != null && kc9Var2.s0;
                if ((iL == j7b.F && iL2 == j7b.D) || (z && z2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vhd
    public void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, iidVar);
                if (i(view, recyclerView)) {
                    rect.top = (int) ((kti.d(10 * vw4.d().getDisplayMetrics().density) * 2) + 0.5f);
                }
                ((mc5) this.d).w(rect, view, recyclerView);
                break;
            case 1:
                mid midVarT = recyclerView.T(view);
                if (midVarT != null && (midVarT instanceof b03) && (iR = RecyclerView.R(view)) != -1) {
                    Boolean boolValueOf = Boolean.valueOf(((b03) midVarT).X == c03.b);
                    if (iidVar.b == null) {
                        iidVar.b = new SparseArray();
                    }
                    iidVar.b.put(iR, boolValueOf);
                    break;
                }
                break;
            default:
                super.f(rect, view, recyclerView, iidVar);
                break;
        }
    }

    @Override // defpackage.vhd
    public void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 1:
                Rect rect = (Rect) this.c;
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int iR = RecyclerView.R(childAt);
                    if (recyclerView.T(childAt) instanceof b03) {
                        SparseArray sparseArray = iidVar.b;
                        boolean zA = fni.a(sparseArray == null ? null : sparseArray.get(iR), Boolean.TRUE);
                        if (zA) {
                            RecyclerView.V(rect, childAt);
                            if (rectF.height() == 0.0f) {
                                rectF.set(rect);
                            } else {
                                rectF.left = Math.min(rectF.left, rect.left);
                                rectF.top = Math.min(rectF.top, rect.top);
                                rectF.right = Math.max(rectF.right, rect.right);
                                rectF.bottom = Math.max(rectF.bottom, rect.bottom);
                            }
                        }
                        if ((!zA || i == recyclerView.getChildCount() - 1) && rectF.height() != 0.0f) {
                            canvas.drawRect(rectF, this.b);
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.vhd
    public void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.c;
                int i = 0;
                while (true) {
                    if (!(i < recyclerView.getChildCount())) {
                        return;
                    }
                    int i2 = i + 1;
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    if (i(childAt, recyclerView)) {
                        ((mc5) this.d).v(rect, childAt, RecyclerView.R(childAt));
                        canvas2 = canvas;
                        canvas2.drawLine(rect.left, rect.centerY(), rect.right, rect.centerY(), this.b);
                    } else {
                        canvas2 = canvas;
                    }
                    i = i2;
                    canvas = canvas2;
                }
            case 1:
            default:
                return;
            case 2:
                RectF rectF = (RectF) this.d;
                int childCount = recyclerView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    int iR = RecyclerView.R(recyclerView.getChildAt(i3));
                    if (iR != -1 && ((Boolean) ((cr) this.c).invoke(Integer.valueOf(iR))).booleanValue()) {
                        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        rectF.set(r3.getLeft() - iD, r3.getTop() - iD, r3.getRight() + iD, r3.getBottom() + iD);
                        canvas.drawRoundRect(rectF, vw4.d().getDisplayMetrics().density * 12.0f, vw4.d().getDisplayMetrics().density * 12.0f, this.b);
                    }
                }
                return;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        switch (this.a) {
            case 0:
                this.b.setColor(yebVar.i().b.b);
                break;
            case 1:
                this.b.setColor(yebVar.b().n);
                break;
            default:
                this.b.setColor(yebVar.i().h);
                break;
        }
    }

    public vc9(Context context, cr crVar) {
        this.a = 2;
        this.c = crVar;
        this.d = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
        this.b = paint;
        onThemeChanged(a93.s0.x(context).k());
    }
}
