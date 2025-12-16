package com.avito.android.publish.realty_address_submission;

import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.util.C35966w1;
import com.avito.android.util.NotFoundException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RealtyAddressSubmissionActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/RealtyAddressSubmissionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RealtyAddressSubmissionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) throws NotFoundException {
        super.onCreate(bundle);
        if (bundle == null) {
            RealtyAddressSubmissionInfo realtyAddressSubmissionInfo = (RealtyAddressSubmissionInfo) getIntent().getParcelableExtra("RealtyAddressSubmissionInfo");
            if (realtyAddressSubmissionInfo == null) {
                throw new NotFoundException("RealtyAddressSubmissionInfo", (Throwable) null, 2, (C42822w) null);
            }
            RealtyAddressSubmissionBottomSheetDialog.f239040k0.getClass();
            RealtyAddressSubmissionBottomSheetDialog realtyAddressSubmissionBottomSheetDialog = new RealtyAddressSubmissionBottomSheetDialog();
            C35966w1.a(realtyAddressSubmissionBottomSheetDialog, -1, new b(realtyAddressSubmissionInfo));
            realtyAddressSubmissionBottomSheetDialog.show(getSupportFragmentManager(), "RealtyAddressSubmissionBottomSheetDialog");
        }
    }
}
