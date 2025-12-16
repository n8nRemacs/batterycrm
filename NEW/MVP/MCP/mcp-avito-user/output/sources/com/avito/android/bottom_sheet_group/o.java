package com.avito.android.bottom_sheet_group;

import android.content.DialogInterface;
import com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupMviFragment;
import com.avito.android.select.bottom_sheet.SelectBottomSheetMviFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class o implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107417b;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f107417b) {
            case 0:
                break;
            case 1:
                BottomSheetGroupMviFragment.a aVar = BottomSheetGroupMviFragment.f107192n0;
                break;
            case 2:
                SelectBottomSheetMviFragment.a aVar2 = SelectBottomSheetMviFragment.f265004s0;
                break;
            case 3:
                int i12 = com.avito.android.wallet.page.history.details.mvi.d.f327926M;
                break;
            default:
                int i13 = com.avito.android.wallet.page.history.mvi.b.f327999E;
                break;
        }
    }

    private final void a(DialogInterface dialogInterface) {
    }
}
