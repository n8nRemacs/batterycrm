package com.avito.android.gig_shift_action.ui;

import Y41.l;
import androidx.core.os.C22777e;
import com.avito.android.gig_shift_action.mvi.r;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
import com.avito.android.gig_shift_action.ui.GigShiftActionResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: GigShiftActionDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class d extends H implements l<r, G0> {
    @Override // Y41.l
    public final G0 invoke(r rVar) {
        r rVar2 = rVar;
        GigShiftActionDialogFragment gigShiftActionDialogFragment = (GigShiftActionDialogFragment) this.receiver;
        GigShiftActionDialogFragment.a aVar = GigShiftActionDialogFragment.f160550v0;
        gigShiftActionDialogFragment.getClass();
        if (rVar2 instanceof r.a) {
            gigShiftActionDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", GigShiftActionResult.Closed.f160577b)), "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftActionDialogFragment.dismiss();
        } else if (rVar2 instanceof r.b) {
            gigShiftActionDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", GigShiftActionResult.OpenBarcodeScanner.f160578b)), "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftActionDialogFragment.dismiss();
        } else if (rVar2 instanceof r.c) {
            gigShiftActionDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", new GigShiftActionResult.OpenRating(((r.c) rVar2).f160517a))), "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftActionDialogFragment.dismiss();
        } else if (rVar2 instanceof r.d) {
            gigShiftActionDialogFragment.getParentFragmentManager().o0(C22777e.b(new Q("GIG_SHIFT_ACTION_BOTTOM_SHEET_RESULT_KEY", new GigShiftActionResult.OpenDeeplink(((r.d) rVar2).f160518a))), "GIG_SHIFT_ACTION_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftActionDialogFragment.dismiss();
        }
        return G0.f406611a;
    }
}
