package com.avito.android.publish.realty_address_submission;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: RealtyAddressSubmissionBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ RealtyAddressSubmissionBottomSheetDialog f239045E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog, Context context) {
        super(context, 0, 2, null);
        this.f239045E = realtyAddressSubmissionBottomSheetDialog;
    }

    @Override // androidx.view.r, android.app.Dialog
    @SuppressLint({"MissingSuperCall"})
    @InterfaceC42830m
    public final void onBackPressed() {
        ActivityC22955m activityC22955mL1 = this.f239045E.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
    }
}
