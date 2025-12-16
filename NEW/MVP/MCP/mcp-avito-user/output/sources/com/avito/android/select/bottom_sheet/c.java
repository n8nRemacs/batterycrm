package com.avito.android.select.bottom_sheet;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SelectBottomSheetMviFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    @Y61.k
    public static final SelectBottomSheetMviFragment a(@Y61.l Fragment fragment, @Y61.k Arguments arguments) {
        SelectBottomSheetMviFragment.f265004s0.getClass();
        SelectBottomSheetMviFragment selectBottomSheetMviFragment = new SelectBottomSheetMviFragment();
        selectBottomSheetMviFragment.setArguments(C22777e.b(new Q("arguments", arguments)));
        selectBottomSheetMviFragment.setTargetFragment(fragment, 0);
        return selectBottomSheetMviFragment;
    }
}
