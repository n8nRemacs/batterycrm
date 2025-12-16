package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h7 implements mg9 {
    public boolean A0;
    public final SparseBooleanArray B0;
    public e7 C0;
    public e7 D0;
    public zn6 E0;
    public f7 F0;
    public final r5j G0;
    public final int X;
    public final int Y;
    public og9 Z;
    public final Context a;
    public Context b;
    public vf9 c;
    public final LayoutInflater d;
    public lg9 o;
    public g7 s0;
    public Drawable t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public int x0;
    public int y0;
    public int z0;

    public h7(Context context) {
        int i = p1d.abc_action_menu_layout;
        int i2 = p1d.abc_action_menu_item_layout;
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.X = i;
        this.Y = i2;
        this.B0 = new SparseBooleanArray();
        this.G0 = new r5j(1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ng9] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(zf9 zf9Var, View view, ViewGroup viewGroup) {
        View actionView = zf9Var.getActionView();
        if (actionView == null || zf9Var.d()) {
            ActionMenuItemView actionMenuItemView = view instanceof ng9 ? (ng9) view : (ng9) this.d.inflate(this.Y, viewGroup, false);
            actionMenuItemView.c(zf9Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.Z);
            if (this.F0 == null) {
                this.F0 = new f7(this);
            }
            actionMenuItemView2.setPopupCallback(this.F0);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(zf9Var.M0 ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j7)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mg9
    public final boolean b(qnf qnfVar) {
        boolean z;
        if (qnfVar.hasVisibleItems()) {
            qnf qnfVar2 = qnfVar;
            while (true) {
                vf9 vf9Var = qnfVar2.J0;
                if (vf9Var == this.c) {
                    break;
                }
                qnfVar2 = (qnf) vf9Var;
            }
            zf9 zf9Var = qnfVar2.K0;
            ViewGroup viewGroup = (ViewGroup) this.Z;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof ng9) && ((ng9) childAt).getItemData() == zf9Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                qnfVar.K0.getClass();
                int size = qnfVar.X.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = qnfVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                e7 e7Var = new e7(this, this.b, qnfVar, view);
                this.D0 = e7Var;
                e7Var.g = z;
                eg9 eg9Var = e7Var.i;
                if (eg9Var != null) {
                    eg9Var.o(z);
                }
                e7 e7Var2 = this.D0;
                if (!e7Var2.b()) {
                    if (e7Var2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    e7Var2.d(0, 0, false, false);
                }
                lg9 lg9Var = this.o;
                if (lg9Var != null) {
                    lg9Var.x(qnfVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mg9
    public final boolean c() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        h7 h7Var = this;
        vf9 vf9Var = h7Var.c;
        if (vf9Var != null) {
            arrayListL = vf9Var.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = h7Var.z0;
        int i3 = h7Var.y0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) h7Var.Z;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            zf9 zf9Var = (zf9) arrayListL.get(i4);
            int i7 = zf9Var.I0;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (h7Var.A0 && zf9Var.M0) {
                i2 = 0;
            }
            i4++;
        }
        if (h7Var.v0 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = h7Var.B0;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            zf9 zf9Var2 = (zf9) arrayListL.get(i9);
            int i11 = zf9Var2.I0;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = zf9Var2.b;
            if (z3) {
                View viewA = h7Var.a(zf9Var2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                zf9Var2.f(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewA2 = h7Var.a(zf9Var2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        zf9 zf9Var3 = (zf9) arrayListL.get(i13);
                        if (zf9Var3.b == i12) {
                            if ((zf9Var3.H0 & 32) == 32) {
                                i8++;
                            }
                            zf9Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                zf9Var2.f(z5);
            } else {
                zf9Var2.f(false);
                i9++;
                i = 2;
                h7Var = this;
                z = true;
            }
            i9++;
            i = 2;
            h7Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.mg9
    public final boolean d(zf9 zf9Var) {
        return false;
    }

    @Override // defpackage.mg9
    public final void e(lg9 lg9Var) {
        throw null;
    }

    @Override // defpackage.mg9
    public final void f(vf9 vf9Var, boolean z) {
        g();
        e7 e7Var = this.D0;
        if (e7Var != null && e7Var.b()) {
            e7Var.i.dismiss();
        }
        lg9 lg9Var = this.o;
        if (lg9Var != null) {
            lg9Var.f(vf9Var, z);
        }
    }

    public final boolean g() {
        Object obj;
        zn6 zn6Var = this.E0;
        if (zn6Var != null && (obj = this.Z) != null) {
            ((View) obj).removeCallbacks(zn6Var);
            this.E0 = null;
            return true;
        }
        e7 e7Var = this.C0;
        if (e7Var == null) {
            return false;
        }
        if (e7Var.b()) {
            e7Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.mg9
    public final boolean h(zf9 zf9Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mg9
    public final void i() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.Z;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            vf9 vf9Var = this.c;
            if (vf9Var != null) {
                vf9Var.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    zf9 zf9Var = (zf9) arrayListL.get(i2);
                    if ((zf9Var.H0 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        zf9 itemData = childAt instanceof ng9 ? ((ng9) childAt).getItemData() : null;
                        View viewA = a(zf9Var, childAt, viewGroup);
                        if (zf9Var != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.Z).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.s0) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.Z).requestLayout();
        vf9 vf9Var2 = this.c;
        if (vf9Var2 != null) {
            vf9Var2.i();
            ArrayList arrayList2 = vf9Var2.s0;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                m7 m7Var = ((zf9) arrayList2.get(i3)).K0;
            }
        }
        vf9 vf9Var3 = this.c;
        if (vf9Var3 != null) {
            vf9Var3.i();
            arrayList = vf9Var3.t0;
        }
        if (this.v0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((zf9) arrayList.get(0)).M0;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.s0 == null) {
                this.s0 = new g7(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.s0.getParent();
            if (viewGroup3 != this.Z) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.s0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.Z;
                g7 g7Var = this.s0;
                actionMenuView.getClass();
                j7 j7VarD = ActionMenuView.d();
                j7VarD.a = true;
                actionMenuView.addView(g7Var, j7VarD);
            }
        } else {
            g7 g7Var2 = this.s0;
            if (g7Var2 != null) {
                Object parent = g7Var2.getParent();
                Object obj = this.Z;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.s0);
                }
            }
        }
        ((ActionMenuView) this.Z).setOverflowReserved(this.v0);
    }

    public final boolean j() {
        e7 e7Var = this.C0;
        return e7Var != null && e7Var.b();
    }

    @Override // defpackage.mg9
    public final void k(Context context, vf9 vf9Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = vf9Var;
        Resources resources = context.getResources();
        if (!this.w0) {
            this.v0 = true;
        }
        int i = 2;
        this.x0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.z0 = i;
        int measuredWidth = this.x0;
        if (this.v0) {
            if (this.s0 == null) {
                g7 g7Var = new g7(this, this.a);
                this.s0 = g7Var;
                if (this.u0) {
                    g7Var.setImageDrawable(this.t0);
                    this.t0 = null;
                    this.u0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.s0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.s0.getMeasuredWidth();
        } else {
            this.s0 = null;
        }
        this.y0 = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        vf9 vf9Var;
        if (!this.v0 || j() || (vf9Var = this.c) == null || this.Z == null || this.E0 != null) {
            return false;
        }
        vf9Var.i();
        if (vf9Var.t0.isEmpty()) {
            return false;
        }
        zn6 zn6Var = new zn6(this, new e7(this, this.b, this.c, this.s0), false, 1);
        this.E0 = zn6Var;
        ((View) this.Z).post(zn6Var);
        return true;
    }
}
