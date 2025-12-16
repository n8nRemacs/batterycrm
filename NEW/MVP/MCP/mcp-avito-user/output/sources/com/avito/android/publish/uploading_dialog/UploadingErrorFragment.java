package com.avito.android.publish.uploading_dialog;

import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.modal.a;
import com.avito.android.publish.uploading_dialog.e;
import com.avito.android.ui.fragments.BaseDialogFragment;
import kotlin.Metadata;

/* compiled from: UploadingErrorFragment.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/uploading_dialog/UploadingErrorFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/publish/uploading_dialog/e$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UploadingErrorFragment extends BaseDialogFragment implements e.a, InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    public a f245505h0;

    /* renamed from: i0, reason: collision with root package name */
    public f f245506i0;

    public UploadingErrorFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        this.f245506i0 = new f();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, requireContext(), new d(this));
        f fVar = this.f245506i0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f245510a = this;
        this.f245505h0 = (a) getTargetFragment();
        return aVarC;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f fVar = this.f245506i0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f245510a = null;
    }
}
