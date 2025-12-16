package com.avito.android.suggest_locations.sheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.avito.android.suggest_locations.sheet.SuggestLocationsFragmentSheet;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View currentFocus;
        SuggestLocationsFragmentSheet.a aVar = SuggestLocationsFragmentSheet.f292358k0;
        Dialog dialog = dialogInterface instanceof Dialog ? (Dialog) dialogInterface : null;
        if (dialog == null || (currentFocus = dialog.getCurrentFocus()) == null) {
            return;
        }
        K2.k(currentFocus, 3);
    }
}
