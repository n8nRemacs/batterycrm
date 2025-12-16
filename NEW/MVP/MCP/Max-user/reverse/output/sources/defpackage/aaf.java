package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class aaf extends eg9 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int E0 = p1d.abc_popup_menu_item_layout;
    public boolean A0;
    public int B0;
    public boolean D0;
    public final int X;
    public final int Y;
    public final kg9 Z;
    public final Context b;
    public final vf9 c;
    public final sf9 d;
    public final boolean o;
    public PopupWindow.OnDismissListener u0;
    public View v0;
    public View w0;
    public lg9 x0;
    public ViewTreeObserver y0;
    public boolean z0;
    public final vo s0 = new vo(4, this);
    public final rk t0 = new rk(9, this);
    public int C0 = 0;

    public aaf(Context context, vf9 vf9Var, View view, int i, boolean z) {
        this.b = context;
        this.c = vf9Var;
        this.o = z;
        this.d = new sf9(vf9Var, LayoutInflater.from(context), z, E0);
        this.Y = i;
        Resources resources = context.getResources();
        this.X = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(hwc.abc_config_prefDialogWidth));
        this.v0 = view;
        this.Z = new kg9(context, null, i, 0);
        vf9Var.b(this, context);
    }

    @Override // defpackage.yye
    public final boolean a() {
        return !this.z0 && this.Z.J0.isShowing();
    }

    @Override // defpackage.mg9
    public final boolean b(qnf qnfVar) {
        boolean z;
        if (qnfVar.hasVisibleItems()) {
            gg9 gg9Var = new gg9(this.b, qnfVar, this.w0, this.o, this.Y, 0);
            lg9 lg9Var = this.x0;
            gg9Var.h = lg9Var;
            eg9 eg9Var = gg9Var.i;
            if (eg9Var != null) {
                eg9Var.e(lg9Var);
            }
            int size = qnfVar.X.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = qnfVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            gg9Var.g = z;
            eg9 eg9Var2 = gg9Var.i;
            if (eg9Var2 != null) {
                eg9Var2.o(z);
            }
            gg9Var.j = this.u0;
            this.u0 = null;
            this.c.c(false);
            kg9 kg9Var = this.Z;
            int width = kg9Var.X;
            int iO = kg9Var.o();
            if ((Gravity.getAbsoluteGravity(this.C0, this.v0.getLayoutDirection()) & 7) == 5) {
                width += this.v0.getWidth();
            }
            if (!gg9Var.b()) {
                if (gg9Var.e != null) {
                    gg9Var.d(width, iO, true, true);
                }
            }
            lg9 lg9Var2 = this.x0;
            if (lg9Var2 != null) {
                lg9Var2.x(qnfVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mg9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.yye
    public final void dismiss() {
        if (a()) {
            this.Z.dismiss();
        }
    }

    @Override // defpackage.mg9
    public final void e(lg9 lg9Var) {
        this.x0 = lg9Var;
    }

    @Override // defpackage.mg9
    public final void f(vf9 vf9Var, boolean z) {
        if (vf9Var != this.c) {
            return;
        }
        dismiss();
        lg9 lg9Var = this.x0;
        if (lg9Var != null) {
            lg9Var.f(vf9Var, z);
        }
    }

    @Override // defpackage.yye
    public final void g() {
        View view;
        if (a()) {
            return;
        }
        if (this.z0 || (view = this.v0) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.w0 = view;
        kg9 kg9Var = this.Z;
        kg9Var.J0.setOnDismissListener(this);
        kg9Var.z0 = this;
        kg9Var.I0 = true;
        kg9Var.J0.setFocusable(true);
        View view2 = this.w0;
        boolean z = this.y0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.y0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.s0);
        }
        view2.addOnAttachStateChangeListener(this.t0);
        kg9Var.y0 = view2;
        kg9Var.v0 = this.C0;
        boolean z2 = this.A0;
        Context context = this.b;
        sf9 sf9Var = this.d;
        if (!z2) {
            this.B0 = eg9.m(sf9Var, context, this.X);
            this.A0 = true;
        }
        kg9Var.r(this.B0);
        kg9Var.J0.setInputMethodMode(2);
        Rect rect = this.a;
        kg9Var.H0 = rect != null ? new Rect(rect) : null;
        kg9Var.g();
        q55 q55Var = kg9Var.c;
        q55Var.setOnKeyListener(this);
        if (this.D0) {
            vf9 vf9Var = this.c;
            if (vf9Var.w0 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(p1d.abc_popup_menu_header_item_layout, (ViewGroup) q55Var, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(vf9Var.w0);
                }
                frameLayout.setEnabled(false);
                q55Var.addHeaderView(frameLayout, null, false);
            }
        }
        kg9Var.p(sf9Var);
        kg9Var.g();
    }

    @Override // defpackage.mg9
    public final void i() {
        this.A0 = false;
        sf9 sf9Var = this.d;
        if (sf9Var != null) {
            sf9Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.yye
    public final q55 j() {
        return this.Z.c;
    }

    @Override // defpackage.eg9
    public final void l(vf9 vf9Var) {
    }

    @Override // defpackage.eg9
    public final void n(View view) {
        this.v0 = view;
    }

    @Override // defpackage.eg9
    public final void o(boolean z) {
        this.d.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.z0 = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.y0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.y0 = this.w0.getViewTreeObserver();
            }
            this.y0.removeGlobalOnLayoutListener(this.s0);
            this.y0 = null;
        }
        this.w0.removeOnAttachStateChangeListener(this.t0);
        PopupWindow.OnDismissListener onDismissListener = this.u0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.C0 = i;
    }

    @Override // defpackage.eg9
    public final void q(int i) {
        this.Z.X = i;
    }

    @Override // defpackage.eg9
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.u0 = onDismissListener;
    }

    @Override // defpackage.eg9
    public final void s(boolean z) {
        this.D0 = z;
    }

    @Override // defpackage.eg9
    public final void t(int i) {
        this.Z.l(i);
    }
}
