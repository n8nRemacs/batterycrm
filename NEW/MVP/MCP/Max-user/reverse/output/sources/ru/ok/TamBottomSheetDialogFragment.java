package ru.ok;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import defpackage.r5d;
import defpackage.u1g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/TamBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lu1g;", "ui-utils_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TamBottomSheetDialogFragment extends BottomSheetDialogFragment implements u1g {
    public final int z1;

    public TamBottomSheetDialogFragment(int i) {
        this.z1 = i;
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.t1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        return layoutInflater.inflate(this.z1, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int u0() {
        return r5d.UiUtils_LightBottomSheetDialog;
    }
}
