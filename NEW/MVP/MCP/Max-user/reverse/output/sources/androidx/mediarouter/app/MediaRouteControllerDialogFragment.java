package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import androidx.fragment.app.DialogFragment;
import defpackage.d69;
import defpackage.jo;
import defpackage.x59;

/* loaded from: classes.dex */
public class MediaRouteControllerDialogFragment extends DialogFragment {
    public d69 A1;
    public final boolean y1 = false;
    public jo z1;

    public MediaRouteControllerDialogFragment() {
        this.o1 = true;
        Dialog dialog = this.t1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.a
    public final void d0() {
        super.d0();
        jo joVar = this.z1;
        if (joVar == null || this.y1) {
            return;
        }
        ((d) joVar).i(false);
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        jo joVar = this.z1;
        if (joVar != null) {
            if (this.y1) {
                ((x59) joVar).j();
            } else {
                ((d) joVar).t();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        if (this.y1) {
            x59 x59Var = new x59(v());
            this.z1 = x59Var;
            x59Var.i(this.A1);
        } else {
            this.z1 = new d(v());
        }
        return this.z1;
    }
}
