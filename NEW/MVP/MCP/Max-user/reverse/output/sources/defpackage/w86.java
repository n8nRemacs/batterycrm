package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class w86 {
    public Object a = w86.class.getName();
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public w86(a84 a84Var, k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar) {
        this.b = d7j.a(((q2b) lzfVar).b().plus(a84Var));
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var;
    }

    public static final void a(w86 w86Var) {
        SparseArray sparseArray = (SparseArray) w86Var.e;
        SparseArray sparseArray2 = (SparseArray) w86Var.d;
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray2.keyAt(i);
            jkf jkfVar = (jkf) sparseArray2.valueAt(i);
            jkfVar.getClass();
            List arrayList = (List) sparseArray.get(0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(0, arrayList);
            }
            arrayList.add(jkfVar);
        }
        sparseArray2.clear();
        ((SparseArray) w86Var.c).clear();
    }

    public kb0 b() {
        String strI = ((zr4) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strI = strI.concat(" sharedSurfaces");
        }
        if (((Integer) this.c) == null) {
            strI = az1.i(strI, " mirrorMode");
        }
        if (((Integer) this.d) == null) {
            strI = az1.i(strI, " surfaceGroupId");
        }
        if (((u75) this.e) == null) {
            strI = az1.i(strI, " dynamicRange");
        }
        if (strI.isEmpty()) {
            return new kb0((zr4) this.a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (u75) this.e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public Object c(String str, dtf dtfVar) {
        Object objI = svi.i(((ContextScope) this.b).getCoroutineContext(), new v86(this, str, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public Object d(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.indexOfKey(i) >= 0) {
            return sparseArray.get(i);
        }
        Object objN = ((pkf) this.b).n(i);
        sparseArray.put(i, objN);
        return objN;
    }

    public jkf e(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        pkf pkfVar = (pkf) this.b;
        SparseArray sparseArray = (SparseArray) this.d;
        jkf jkfVarR = (jkf) sparseArray.get(i);
        if (jkfVarR == null) {
            SparseArray sparseArray2 = (SparseArray) this.e;
            pkfVar.getClass();
            List list = (List) sparseArray2.get(0);
            jkfVarR = (list == null || list.isEmpty()) ? pkfVar.r(recyclerView) : (jkf) list.remove(0);
            sparseArray.put(i, jkfVarR);
            pkfVar.t(jkfVarR, i);
            View view = jkfVarR.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            view.measure(marginLayoutParams.width == -1 ? View.MeasureSpec.makeMeasureSpec((recyclerView.getMeasuredWidth() - marginLayoutParams.rightMargin) - recyclerView.getScrollBarSize(), 1073741824) : ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredWidth(), 0, view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(recyclerView.getMeasuredHeight(), 0, view.getLayoutParams().height));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (m8j.d(view)) {
                view.layout(recyclerView.getMeasuredWidth() - measuredWidth, 0, recyclerView.getMeasuredWidth(), measuredHeight);
            } else {
                view.layout(0, 0, measuredWidth, measuredHeight);
            }
            jkfVarR.b = marginLayoutParams.getMarginStart();
            jkfVarR.c = marginLayoutParams.topMargin;
        }
        return jkfVarR;
    }

    public synchronized void f(chg chgVar) {
        try {
            hsi.g(((AtomicInteger) this.d).getAndDecrement() > 0);
            ft0 ft0VarA = ((chg) this.e).a();
            if (!Objects.equals(chgVar.b, ((chg) this.c).b)) {
                ft0VarA.b(chgVar.b);
            }
            if (!Objects.equals(chgVar.c, ((chg) this.c).c)) {
                ft0VarA.c(chgVar.c);
            }
            int i = chgVar.a;
            chg chgVar2 = (chg) this.c;
            if (i != chgVar2.a) {
                ft0VarA.a = i;
            }
            int i2 = chgVar.d;
            if (i2 != chgVar2.d) {
                ft0VarA.b = i2;
            }
            chg chgVarA = ft0VarA.a();
            this.e = chgVarA;
            if (((AtomicInteger) this.d).get() == 0 && !((chg) this.c).equals((chg) this.e)) {
                ((wwf) ((e07) this.b)).d(new kr4(this, 28, chgVarA));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
