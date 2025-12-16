package com.avito.android.gig_shift_cancel.ui;

import Y41.l;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.gig_shift_cancel.mvi.s;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelDialogFragment;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: GigShiftCancelDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class c extends H implements l<s, G0> {
    @Override // Y41.l
    public final G0 invoke(s sVar) {
        GigShiftCancelDialogFragment gigShiftCancelDialogFragment = (GigShiftCancelDialogFragment) this.receiver;
        GigShiftCancelDialogFragment.a aVar = GigShiftCancelDialogFragment.f160706u0;
        gigShiftCancelDialogFragment.getClass();
        if (sVar instanceof s.a) {
            C22960s.a(C22777e.b(new Q("GIG_SHIFT_CANCEL_DIALOG_FRAGMENT_RESULT_KEY", GigShiftCancelResult.Closed.f160730b)), gigShiftCancelDialogFragment, "GIG_SHIFT_CANCEL_DIALOG_FRAGMENT_REQUEST_KEY");
            gigShiftCancelDialogFragment.dismiss();
        }
        return G0.f406611a;
    }
}
