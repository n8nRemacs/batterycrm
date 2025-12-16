package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatDialogFragment;
import defpackage.ts0;
import defpackage.vs0;
import java.util.ArrayList;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public boolean y1;

    @Override // androidx.fragment.app.DialogFragment
    public final void s0() throws Resources.NotFoundException {
        Dialog dialog = this.t1;
        if (dialog instanceof vs0) {
            vs0 vs0Var = (vs0) dialog;
            BottomSheetBehavior bottomSheetBehaviorG = vs0Var.g();
            if (bottomSheetBehaviorG.I && vs0Var.t0) {
                this.y1 = true;
                if (bottomSheetBehaviorG.L == 5) {
                    y0();
                    return;
                }
                Dialog dialog2 = this.t1;
                if (dialog2 instanceof vs0) {
                    vs0 vs0Var2 = (vs0) dialog2;
                    BottomSheetBehavior bottomSheetBehavior = vs0Var2.X;
                    bottomSheetBehavior.W.remove(vs0Var2.A0);
                }
                ts0 ts0Var = new ts0(1, (ScheduledSendPickerDialogFragment) this);
                ArrayList arrayList = bottomSheetBehaviorG.W;
                if (!arrayList.contains(ts0Var)) {
                    arrayList.add(ts0Var);
                }
                bottomSheetBehaviorG.K(5);
                return;
            }
        }
        super.s0();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog v0() {
        return new vs0(v(), u0());
    }

    public final void y0() {
        if (this.y1) {
            super.s0();
        } else {
            t0(false, false);
        }
    }
}
