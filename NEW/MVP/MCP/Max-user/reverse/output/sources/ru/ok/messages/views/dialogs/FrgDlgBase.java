package ru.ok.messages.views.dialogs;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.d6;
import defpackage.lk6;
import defpackage.wqi;

/* loaded from: classes2.dex */
public class FrgDlgBase extends DialogFragment {
    public boolean A1;
    public boolean y1 = true;
    public lk6 z1;

    @Override // androidx.fragment.app.a
    public final void K(Activity activity) {
        this.Q0 = true;
        wqi.c("ru.ok.messages.views.dialogs.FrgDlgBase", "onAttach: ".concat(getClass().getName()), new Object[0]);
        if (!(activity instanceof d6)) {
            throw new IllegalStateException("Use FrgDlgBase only in ActBase subclasses.");
        }
        this.y1 = false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (((t() == null || t().isFinishing()) ? null : (d6) t()) == null) {
            t0(false, false);
        } else if (this.y1) {
            throw new IllegalStateException("super.onAttachBase() not called");
        }
    }

    @Override // androidx.fragment.app.a
    public final void X() {
        this.Q0 = true;
        this.A1 = false;
    }

    @Override // androidx.fragment.app.a
    public final void Z(int i, String[] strArr, int[] iArr) {
        if (this.A1) {
            return;
        }
        this.z1 = new lk6(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.a
    public final void a0() {
        this.Q0 = true;
        this.A1 = true;
        lk6 lk6Var = this.z1;
        if (lk6Var != null) {
            int i = lk6Var.b;
            Object obj = lk6Var.c;
            Object obj2 = lk6Var.d;
            this.z1 = null;
        }
    }
}
