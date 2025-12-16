package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class vs0 extends jo {
    public final ts0 A0;
    public BottomSheetBehavior X;
    public FrameLayout Y;
    public CoordinatorLayout Z;
    public FrameLayout s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public us0 x0;
    public final boolean y0;
    public jdc z0;

    public vs0(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(dvc.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : m5d.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.u0 = true;
        this.v0 = true;
        this.A0 = new ts0(0, this);
        c().i(1);
        this.y0 = getContext().getTheme().obtainStyledAttributes(new int[]{dvc.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorG = g();
        if (!this.t0 || bottomSheetBehaviorG.L == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorG.K(5);
        }
    }

    public final void f() throws Resources.NotFoundException {
        if (this.Y == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), k1d.design_bottom_sheet_dialog, null);
            this.Y = frameLayout;
            this.Z = (CoordinatorLayout) frameLayout.findViewById(uxc.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.Y.findViewById(uxc.design_bottom_sheet);
            this.s0 = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.X = bottomSheetBehaviorC;
            ArrayList arrayList = bottomSheetBehaviorC.W;
            ts0 ts0Var = this.A0;
            if (!arrayList.contains(ts0Var)) {
                arrayList.add(ts0Var);
            }
            this.X.I(this.u0);
            this.z0 = new jdc(this.X, this.s0);
        }
    }

    public final BottomSheetBehavior g() throws Resources.NotFoundException {
        if (this.X == null) {
            f();
        }
        return this.X;
    }

    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.Y.findViewById(uxc.coordinator);
        int i2 = 0;
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.y0) {
            FrameLayout frameLayout = this.s0;
            y6i y6iVar = new y6i(5, this);
            WeakHashMap weakHashMap = hfh.a;
            veh.u(frameLayout, y6iVar);
        }
        this.s0.removeAllViews();
        if (layoutParams == null) {
            this.s0.addView(view);
        } else {
            this.s0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(uxc.touch_outside).setOnClickListener(new r6(2, this));
        hfh.n(this.s0, new ss0(i2, this));
        this.s0.setOnTouchListener(new gah(2));
        return this.Y;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.y0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.Y;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.Z;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            dsi.d(window, !z);
            us0 us0Var = this.x0;
            if (us0Var != null) {
                us0Var.e(window);
            }
        }
        jdc jdcVar = this.z0;
        if (jdcVar == null) {
            return;
        }
        View view = (View) jdcVar.d;
        cq8 cq8Var = (cq8) jdcVar.b;
        if (this.u0) {
            if (cq8Var != null) {
                cq8Var.b((bq8) jdcVar.c, view, false);
            }
        } else if (cq8Var != null) {
            cq8Var.c(view);
        }
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        cq8 cq8Var;
        us0 us0Var = this.x0;
        if (us0Var != null) {
            us0Var.e(null);
        }
        jdc jdcVar = this.z0;
        if (jdcVar == null || (cq8Var = (cq8) jdcVar.b) == null) {
            return;
        }
        cq8Var.c((View) jdcVar.d);
    }

    @Override // defpackage.pl3, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.X;
        if (bottomSheetBehavior == null || bottomSheetBehavior.L != 5) {
            return;
        }
        bottomSheetBehavior.K(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        jdc jdcVar;
        super.setCancelable(z);
        if (this.u0 != z) {
            this.u0 = z;
            BottomSheetBehavior bottomSheetBehavior = this.X;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.I(z);
            }
            if (getWindow() == null || (jdcVar = this.z0) == null) {
                return;
            }
            View view = (View) jdcVar.d;
            cq8 cq8Var = (cq8) jdcVar.b;
            if (this.u0) {
                if (cq8Var != null) {
                    cq8Var.b((bq8) jdcVar.c, view, false);
                }
            } else if (cq8Var != null) {
                cq8Var.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.u0) {
            this.u0 = true;
        }
        this.v0 = z;
        this.w0 = true;
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }
}
