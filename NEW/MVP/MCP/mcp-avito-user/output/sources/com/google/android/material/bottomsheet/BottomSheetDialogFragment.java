package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j.I;
import j.N;
import j.P;

/* loaded from: classes6.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    private boolean waitingForDismissAllowingStateLoss;

    public BottomSheetDialogFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissAfterAnimation() {
        if (this.waitingForDismissAllowingStateLoss) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(@N BottomSheetBehavior<?> bottomSheetBehavior, boolean z12) {
        this.waitingForDismissAllowingStateLoss = z12;
        if (bottomSheetBehavior.f355975L == 5) {
            dismissAfterAnimation();
            return;
        }
        if (getDialog() instanceof h) {
            h hVar = (h) getDialog();
            hVar.f356044g.G(hVar.f356053p);
        }
        bottomSheetBehavior.v(new b(null));
        bottomSheetBehavior.b(5);
    }

    private boolean tryDismissWithAnimation(boolean z12) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof h)) {
            return false;
        }
        boolean z13 = ((h) dialog).s().f355972I;
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (tryDismissWithAnimation(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (tryDismissWithAnimation(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @N
    public Dialog onCreateDialog(@P Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@I int i12) {
        super(i12);
    }

    public class b extends BottomSheetBehavior.c {
        public b(a aVar) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@N View view, int i12) {
            if (i12 == 5) {
                BottomSheetDialogFragment.this.dismissAfterAnimation();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@N View view, float f12) {
        }
    }
}
