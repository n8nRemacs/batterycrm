package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import defpackage.s5j;

/* loaded from: classes.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public AlertDialog A1;
    public Dialog y1;
    public DialogInterface.OnCancelListener z1;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.z1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        Dialog dialog = this.y1;
        if (dialog != null) {
            return dialog;
        }
        this.p1 = false;
        if (this.A1 == null) {
            Context contextV = v();
            s5j.g(contextV);
            this.A1 = new AlertDialog.Builder(contextV).create();
        }
        return this.A1;
    }
}
