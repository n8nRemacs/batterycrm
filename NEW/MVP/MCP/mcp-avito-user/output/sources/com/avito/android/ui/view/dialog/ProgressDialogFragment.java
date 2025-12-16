package com.avito.android.ui.view.dialog;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.l;
import androidx.fragment.app.DialogFragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;

/* compiled from: ProgressDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ui/view/dialog/ProgressDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_progress-overlay_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressDialogFragment extends DialogFragment implements InterfaceC28477j.a {
    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        l.a aVar = new l.a(requireActivity());
        aVar.setCancelable(false);
        aVar.setView(R.layout.progress_dialog);
        return aVar.create();
    }
}
