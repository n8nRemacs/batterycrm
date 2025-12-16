package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ai6;
import defpackage.aw4;
import defpackage.bw4;
import defpackage.ho7;
import defpackage.pai;
import defpackage.pl3;
import defpackage.q08;
import defpackage.ri6;
import defpackage.ue;
import defpackage.ue0;
import defpackage.vz5;
import defpackage.w0d;
import defpackage.wqi;
import defpackage.zv4;

/* loaded from: classes.dex */
public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler i1;
    public boolean r1;
    public Dialog t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public final ue j1 = new ue(12, this);
    public final zv4 k1 = new zv4(this);
    public final aw4 l1 = new aw4(this);
    public int m1 = 0;
    public int n1 = 0;
    public boolean o1 = true;
    public boolean p1 = true;
    public int q1 = -1;
    public final vz5 s1 = new vz5(this, 2);
    public boolean x1 = false;

    @Override // androidx.fragment.app.a
    public final void I(Bundle bundle) {
        this.Q0 = true;
    }

    @Override // androidx.fragment.app.a
    public final void L(Context context) {
        super.L(context);
        this.c1.f(this.s1);
        if (this.w1) {
            return;
        }
        this.v1 = false;
    }

    @Override // androidx.fragment.app.a
    public void M(Bundle bundle) {
        super.M(bundle);
        this.i1 = new Handler();
        this.p1 = this.I0 == 0;
        if (bundle != null) {
            this.m1 = bundle.getInt("android:style", 0);
            this.n1 = bundle.getInt("android:theme", 0);
            this.o1 = bundle.getBoolean("android:cancelable", true);
            this.p1 = bundle.getBoolean("android:showsDialog", this.p1);
            this.q1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.a
    public final void Q() {
        this.Q0 = true;
        Dialog dialog = this.t1;
        if (dialog != null) {
            this.u1 = true;
            dialog.setOnDismissListener(null);
            this.t1.dismiss();
            if (!this.v1) {
                onDismiss(this.t1);
            }
            this.t1 = null;
            this.x1 = false;
        }
    }

    @Override // androidx.fragment.app.a
    public final void R() {
        this.Q0 = true;
        if (!this.w1 && !this.v1) {
            this.v1 = true;
        }
        this.c1.j(this.s1);
    }

    @Override // androidx.fragment.app.a
    public final LayoutInflater S(Bundle bundle) {
        LayoutInflater layoutInflaterS = super.S(bundle);
        boolean z = this.p1;
        if (z && !this.r1) {
            if (z && !this.x1) {
                try {
                    this.r1 = true;
                    Dialog dialogV0 = v0();
                    this.t1 = dialogV0;
                    if (this.p1) {
                        w0(dialogV0, this.m1);
                        Context contextV = v();
                        if (contextV != null) {
                            this.t1.setOwnerActivity((Activity) contextV);
                        }
                        this.t1.setCancelable(this.o1);
                        this.t1.setOnCancelListener(this.k1);
                        this.t1.setOnDismissListener(this.l1);
                        this.x1 = true;
                    } else {
                        this.t1 = null;
                    }
                    this.r1 = false;
                } catch (Throwable th) {
                    this.r1 = false;
                    throw th;
                }
            }
            if (c.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.t1;
            if (dialog != null) {
                return layoutInflaterS.cloneInContext(dialog.getContext());
            }
        } else if (c.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.p1) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterS;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterS;
    }

    @Override // androidx.fragment.app.a
    public void b0(Bundle bundle) {
        Dialog dialog = this.t1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.m1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.n1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.o1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.p1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.q1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.a
    public void c0() {
        this.Q0 = true;
        Dialog dialog = this.t1;
        if (dialog != null) {
            this.u1 = false;
            dialog.show();
            View decorView = this.t1.getWindow().getDecorView();
            pai.d(decorView, this);
            decorView.setTag(w0d.view_tree_view_model_store_owner, this);
            wqi.l(decorView, this);
        }
    }

    @Override // androidx.fragment.app.a
    public void d0() {
        this.Q0 = true;
        Dialog dialog = this.t1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.a
    public final void f0(Bundle bundle) {
        Bundle bundle2;
        this.Q0 = true;
        if (this.t1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.t1.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.a
    public final void g0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.g0(layoutInflater, viewGroup, bundle);
        if (this.S0 != null || this.t1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.t1.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.u1) {
            return;
        }
        if (c.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        t0(true, true);
    }

    @Override // androidx.fragment.app.a
    public final q08 r() {
        return new bw4(this, new ai6(this));
    }

    public void s0() {
        t0(true, false);
    }

    public final void t0(boolean z, boolean z2) {
        if (this.v1) {
            return;
        }
        this.v1 = true;
        this.w1 = false;
        Dialog dialog = this.t1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.t1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.i1.getLooper()) {
                    onDismiss(this.t1);
                } else {
                    this.i1.post(this.j1);
                }
            }
        }
        this.u1 = true;
        if (this.q1 >= 0) {
            c cVarX = x();
            int i = this.q1;
            if (i < 0) {
                throw new IllegalArgumentException(ho7.f(i, "Bad id: "));
            }
            cVarX.x(new ri6(cVarX, i), z);
            this.q1 = -1;
            return;
        }
        ue0 ue0Var = new ue0(x());
        ue0Var.o = true;
        ue0Var.h(this);
        if (z) {
            ue0Var.d(true);
        } else {
            ue0Var.d(false);
        }
    }

    public int u0() {
        return this.n1;
    }

    public Dialog v0() {
        if (c.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new pl3(k0(), u0());
    }

    public void w0(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void x0(c cVar, String str) {
        this.v1 = false;
        this.w1 = true;
        cVar.getClass();
        ue0 ue0Var = new ue0(cVar);
        ue0Var.o = true;
        ue0Var.f(0, this, str, 1);
        ue0Var.d(false);
    }
}
