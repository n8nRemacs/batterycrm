package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public final class zv4 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public zv4(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.t1;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
