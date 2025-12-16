package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.d69;
import defpackage.dvi;
import defpackage.gvc;
import defpackage.jo;
import defpackage.o59;
import defpackage.x49;

/* loaded from: classes.dex */
public class MediaRouteChooserDialogFragment extends DialogFragment {
    public d69 A1;
    public final boolean y1 = false;
    public jo z1;

    public MediaRouteChooserDialogFragment() {
        this.o1 = true;
        Dialog dialog = this.t1;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        jo joVar = this.z1;
        if (joVar == null) {
            return;
        }
        if (!this.y1) {
            x49 x49Var = (x49) joVar;
            x49Var.getWindow().setLayout(dvi.a(x49Var.getContext()), -2);
        } else {
            o59 o59Var = (o59) joVar;
            Context context = o59Var.Z;
            o59Var.getWindow().setLayout(!context.getResources().getBoolean(gvc.is_tablet) ? -1 : dvi.a(context), context.getResources().getBoolean(gvc.is_tablet) ? -2 : -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog v0() {
        if (this.y1) {
            o59 o59Var = new o59(v());
            this.z1 = o59Var;
            y0();
            o59Var.g(this.A1);
        } else {
            x49 x49Var = new x49(v());
            this.z1 = x49Var;
            y0();
            x49Var.g(this.A1);
        }
        return this.z1;
    }

    public final void y0() {
        if (this.A1 == null) {
            Bundle bundle = this.X;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                d69 d69Var = null;
                if (bundle2 != null) {
                    d69Var = new d69(bundle2, null);
                } else {
                    d69 d69Var2 = d69.c;
                }
                this.A1 = d69Var;
            }
            if (this.A1 == null) {
                this.A1 = d69.c;
            }
        }
    }
}
