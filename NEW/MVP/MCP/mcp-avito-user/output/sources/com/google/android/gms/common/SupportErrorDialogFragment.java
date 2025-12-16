package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public AlertDialog f348883f0;

    /* renamed from: g0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f348884g0;

    /* renamed from: h0, reason: collision with root package name */
    @j.P
    public AlertDialog f348885h0;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@j.N DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f348884g0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @j.N
    public final Dialog onCreateDialog(@j.P Bundle bundle) {
        AlertDialog alertDialog = this.f348883f0;
        if (alertDialog != null) {
            return alertDialog;
        }
        setShowsDialog(false);
        if (this.f348885h0 == null) {
            Context context = getContext();
            C36729v.j(context);
            this.f348885h0 = new AlertDialog.Builder(context).create();
        }
        return this.f348885h0;
    }
}
