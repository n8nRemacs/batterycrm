package com.avito.android.messenger.deeplink.bottom_sheet;

import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import kotlin.Metadata;

/* compiled from: BottomSheetInputActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/bottom_sheet/BottomSheetInputActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class BottomSheetInputActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            ChannelBottomSheetInputLink channelBottomSheetInputLink = (ChannelBottomSheetInputLink) getIntent().getParcelableExtra("deeplink_key");
            if (channelBottomSheetInputLink == null) {
                throw new IllegalArgumentException("dialog params must be set");
            }
            BottomSheetInputDialogFragment.f195452l0.getClass();
            BottomSheetInputDialogFragment bottomSheetInputDialogFragment = new BottomSheetInputDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("deeplink_key", channelBottomSheetInputLink);
            bottomSheetInputDialogFragment.setArguments(bundle2);
            bottomSheetInputDialogFragment.show(getSupportFragmentManager(), "Bottom_sheet_input_tag");
        }
    }
}
