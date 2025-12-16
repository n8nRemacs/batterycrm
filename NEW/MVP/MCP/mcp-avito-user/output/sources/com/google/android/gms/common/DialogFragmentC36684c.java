package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class DialogFragmentC36684c extends DialogFragment {

    /* renamed from: b, reason: collision with root package name */
    public AlertDialog f349264b;

    /* renamed from: c, reason: collision with root package name */
    public DialogInterface.OnCancelListener f349265c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public AlertDialog f349266d;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@j.N DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f349265c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @j.N
    public final Dialog onCreateDialog(@j.P Bundle bundle) {
        AlertDialog alertDialog = this.f349264b;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f349266d == null) {
            Activity activity = getActivity();
            C36729v.j(activity);
            this.f349266d = new AlertDialog.Builder(activity).create();
        }
        return this.f349266d;
    }
}
