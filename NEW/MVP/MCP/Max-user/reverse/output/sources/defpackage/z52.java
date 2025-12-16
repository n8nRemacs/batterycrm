package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z52 extends eg9 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int K0 = p1d.abc_cascading_menu_item_layout;
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public boolean F0;
    public lg9 G0;
    public ViewTreeObserver H0;
    public PopupWindow.OnDismissListener I0;
    public boolean J0;
    public final Handler X;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean o;
    public View x0;
    public View y0;
    public int z0;
    public final ArrayList Y = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final vo s0 = new vo(2, this);
    public final rk t0 = new rk(1, this);
    public final t9f u0 = new t9f(8, this);
    public int v0 = 0;
    public int w0 = 0;
    public boolean E0 = false;

    public z52(Context context, View view, int i, boolean z) {
        this.b = context;
        this.x0 = view;
        this.d = i;
        this.o = z;
        this.z0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(hwc.abc_config_prefDialogWidth));
        this.X = new Handler();
    }

    @Override // defpackage.yye
    public final boolean a() {
        ArrayList arrayList = this.Z;
        return arrayList.size() > 0 && ((y52) arrayList.get(0)).a.J0.isShowing();
    }

    @Override // defpackage.mg9
    public final boolean b(qnf qnfVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            y52 y52Var = (y52) it.next();
            if (qnfVar == y52Var.b) {
                y52Var.a.c.requestFocus();
                return true;
            }
        }
        if (!qnfVar.hasVisibleItems()) {
            return false;
        }
        l(qnfVar);
        lg9 lg9Var = this.G0;
        if (lg9Var != null) {
            lg9Var.x(qnfVar);
        }
        return true;
    }

    @Override // defpackage.mg9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yye
    public final void dismiss() {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        if (size > 0) {
            y52[] y52VarArr = (y52[]) arrayList.toArray(new y52[size]);
            for (int i = size - 1; i >= 0; i--) {
                y52 y52Var = y52VarArr[i];
                if (y52Var.a.J0.isShowing()) {
                    y52Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.mg9
    public final void e(lg9 lg9Var) {
        this.G0 = lg9Var;
    }

    @Override // defpackage.mg9
    public final void f(vf9 vf9Var, boolean z) {
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vf9Var == ((y52) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((y52) arrayList.get(i2)).b.c(false);
        }
        y52 y52Var = (y52) arrayList.remove(i);
        vf9 vf9Var2 = y52Var.b;
        kg9 kg9Var = y52Var.a;
        vf9Var2.r(this);
        if (this.J0) {
            hg9.b(kg9Var.J0, null);
            kg9Var.J0.setAnimationStyle(0);
        }
        kg9Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.z0 = ((y52) arrayList.get(size2 - 1)).c;
        } else {
            this.z0 = this.x0.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((y52) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        lg9 lg9Var = this.G0;
        if (lg9Var != null) {
            lg9Var.f(vf9Var, true);
        }
        ViewTreeObserver viewTreeObserver = this.H0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.H0.removeGlobalOnLayoutListener(this.s0);
            }
            this.H0 = null;
        }
        this.y0.removeOnAttachStateChangeListener(this.t0);
        this.I0.onDismiss();
    }

    @Override // defpackage.yye
    public final void g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.Y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((vf9) it.next());
        }
        arrayList.clear();
        View view = this.x0;
        this.y0 = view;
        if (view != null) {
            boolean z = this.H0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.H0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.s0);
            }
            this.y0.addOnAttachStateChangeListener(this.t0);
        }
    }

    @Override // defpackage.mg9
    public final void i() {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((y52) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((sf9) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.yye
    public final q55 j() {
        ArrayList arrayList = this.Z;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((y52) wy1.d(arrayList, 1)).a.c;
    }

    @Override // defpackage.eg9
    public final void l(vf9 vf9Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vf9Var.b(this, this.b);
        if (a()) {
            u(vf9Var);
        } else {
            this.Y.add(vf9Var);
        }
    }

    @Override // defpackage.eg9
    public final void n(View view) {
        if (this.x0 != view) {
            this.x0 = view;
            this.w0 = Gravity.getAbsoluteGravity(this.v0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.eg9
    public final void o(boolean z) {
        this.E0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        y52 y52Var;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                y52Var = null;
                break;
            }
            y52Var = (y52) arrayList.get(i);
            if (!y52Var.a.J0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (y52Var != null) {
            y52Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.eg9
    public final void p(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            this.w0 = Gravity.getAbsoluteGravity(i, this.x0.getLayoutDirection());
        }
    }

    @Override // defpackage.eg9
    public final void q(int i) {
        this.A0 = true;
        this.C0 = i;
    }

    @Override // defpackage.eg9
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.I0 = onDismissListener;
    }

    @Override // defpackage.eg9
    public final void s(boolean z) {
        this.F0 = z;
    }

    @Override // defpackage.eg9
    public final void t(int i) {
        this.B0 = true;
        this.D0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.vf9 r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z52.u(vf9):void");
    }
}
