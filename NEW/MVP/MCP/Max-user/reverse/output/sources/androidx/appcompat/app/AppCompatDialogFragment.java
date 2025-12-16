package androidx.appcompat.app;

import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import defpackage.jo;

/* loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog v0() {
        return new jo(v(), u0());
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void w0(Dialog dialog, int i) {
        if (!(dialog instanceof jo)) {
            super.w0(dialog, i);
            return;
        }
        jo joVar = (jo) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        joVar.c().i(1);
    }
}
