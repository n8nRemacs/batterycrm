package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class okf extends vhd {
    public final phd b;
    public final pkf c;
    public final w86 d;
    public final RecyclerView o;
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final boolean X = true;
    public final Rect Y = new Rect();
    public final Rect Z = new Rect();
    public final mc5 s0 = new mc5(18);
    public final AtomicBoolean t0 = new AtomicBoolean(true);
    public final lkf u0 = new lkf(this, 0);

    public okf(RecyclerView recyclerView, phd phdVar, pkf pkfVar) {
        this.b = phdVar;
        this.c = pkfVar;
        w86 w86Var = new w86();
        w86Var.c = new SparseArray();
        w86Var.d = new SparseArray();
        w86Var.e = new SparseArray();
        w86Var.a = recyclerView;
        w86Var.b = pkfVar;
        phdVar.z(new kkf(w86Var, 0, recyclerView));
        this.d = w86Var;
        this.o = recyclerView;
        phdVar.z(new mkf(this, 0, recyclerView));
    }

    public static final void i(okf okfVar) {
        RecyclerView recyclerView = okfVar.o;
        okfVar.a.clear();
        if (okfVar.t0.compareAndSet(true, false)) {
            y7j.c(5, recyclerView, okfVar.u0, null);
            recyclerView.post(new lkf(okfVar, 1));
        }
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        boolean zL = l(iR);
        mc5 mc5Var = this.s0;
        if (zL) {
            w86 w86Var = this.d;
            if (w86Var.d(iR) != null) {
                jkf jkfVarE = w86Var.e(iR);
                int i = jkfVarE.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = jkfVarE.a.getMeasuredHeight() + rect.top;
                mc5Var.w(rect, view, recyclerView);
                return;
            }
        }
        mc5Var.w(rect, view, recyclerView);
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        phd phdVar = this.b;
        int iJ = phdVar.j();
        if (childCount <= 0 || iJ <= 0) {
            return;
        }
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
            int iR = RecyclerView.R(childAt);
            if (iR != -1) {
                w86 w86Var = this.d;
                if (w86Var.d(iR) == null) {
                    continue;
                } else {
                    boolean zL = l(iR);
                    mc5 mc5Var = this.s0;
                    Rect rect = this.Y;
                    mc5Var.h(rect, childAt, iR);
                    boolean z = rect.top <= 0 && rect.bottom > 0;
                    if (zL || z) {
                        jkf jkfVarE = w86Var.e(iR);
                        boolean z2 = z && this.X;
                        int measuredHeight = w86Var.e(iR).a.getMeasuredHeight();
                        mc5Var.h(rect, childAt, iR);
                        Rect rect2 = this.Z;
                        mc5Var.v(rect2, childAt, iR);
                        if (z2) {
                            if (iR >= phdVar.j() - 1 || !l(iR + 1)) {
                                this.c.getClass();
                                if (!zL || rect2.top < 0) {
                                    rect2.offsetTo(rect2.left, 0);
                                }
                            } else {
                                int i3 = rect.bottom;
                                if (measuredHeight > i3) {
                                    rect2.offsetTo(rect2.left, i3 - measuredHeight);
                                } else {
                                    rect2.offsetTo(rect2.left, 0);
                                }
                            }
                        }
                        float f = rect2.top;
                        int iSave = canvas.save();
                        canvas.translate(0.0f, f);
                        try {
                            View view = jkfVarE.a;
                            if (m8j.d(view)) {
                                canvas.translate((canvas.getWidth() - view.getMeasuredWidth()) - jkfVarE.b, 0.0f);
                            } else {
                                canvas.translate(jkfVarE.b, 0.0f);
                            }
                            view.draw(canvas);
                        } finally {
                            canvas.restoreToCount(iSave);
                        }
                    }
                }
            }
            i = i2;
        }
    }

    public final void j() {
        w86 w86Var = this.d;
        ((SparseArray) w86Var.d).clear();
        ((SparseArray) w86Var.c).clear();
        ((SparseArray) w86Var.e).clear();
    }

    public final boolean l(int i) {
        Object objD;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        w86 w86Var = this.d;
        Object objD2 = w86Var.d(i);
        boolean z = false;
        if (objD2 != null && (i <= 0 || (objD = w86Var.d(i - 1)) == null || !objD2.equals(objD))) {
            z = true;
        }
        sparseBooleanArray.put(i, z);
        return z;
    }
}
