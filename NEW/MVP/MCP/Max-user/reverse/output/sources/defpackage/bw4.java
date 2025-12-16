package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes.dex */
public final class bw4 extends q08 {
    public final /* synthetic */ ai6 c;
    public final /* synthetic */ DialogFragment d;

    public bw4(DialogFragment dialogFragment, ai6 ai6Var) {
        this.d = dialogFragment;
        this.c = ai6Var;
    }

    @Override // defpackage.q08
    public final View d(int i) {
        ai6 ai6Var = this.c;
        if (ai6Var.e()) {
            return ai6Var.d(i);
        }
        Dialog dialog = this.d.t1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.q08
    public final boolean e() {
        return this.c.e() || this.d.x1;
    }
}
