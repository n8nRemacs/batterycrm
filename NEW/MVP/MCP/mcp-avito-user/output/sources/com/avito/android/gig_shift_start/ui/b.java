package com.avito.android.gig_shift_start.ui;

import Y41.l;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.gig_shift_start.mvi.j;
import com.avito.android.gig_shift_start.ui.GigShiftStartDialogFragment;
import com.avito.android.gig_shift_start.ui.GigShiftStartResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: GigShiftStartDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class b extends H implements l<j, G0> {
    @Override // Y41.l
    public final G0 invoke(j jVar) {
        j jVar2 = jVar;
        GigShiftStartDialogFragment gigShiftStartDialogFragment = (GigShiftStartDialogFragment) this.receiver;
        GigShiftStartDialogFragment.a aVar = GigShiftStartDialogFragment.f160821o0;
        gigShiftStartDialogFragment.getClass();
        if (jVar2 instanceof j.c) {
            C22960s.a(C22777e.b(new Q("GIG_SHIFT_START_BOTTOM_SHEET_RESULT_KEY", GigShiftStartResult.OpenScan.f160843b)), gigShiftStartDialogFragment, "GIG_SHIFT_START_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftStartDialogFragment.dismiss();
        } else if (jVar2 instanceof j.b) {
            C22960s.a(C22777e.b(new Q("GIG_SHIFT_START_BOTTOM_SHEET_RESULT_KEY", GigShiftStartResult.OpenAction.f160842b)), gigShiftStartDialogFragment, "GIG_SHIFT_START_BOTTOM_SHEET_REQUEST_KEY");
            gigShiftStartDialogFragment.dismiss();
        }
        return G0.f406611a;
    }
}
