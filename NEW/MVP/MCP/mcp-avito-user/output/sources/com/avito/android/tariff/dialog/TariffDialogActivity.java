package com.avito.android.tariff.dialog;

import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.paid_services.routing.DialogInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffDialogActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/dialog/TariffDialogActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffDialogActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Intent intent = getIntent();
            DialogInfo dialogInfo = (DialogInfo) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("dialog_params", DialogInfo.class) : intent.getParcelableExtra("dialog_params"));
            if (dialogInfo == null) {
                throw new IllegalArgumentException("dialog params must be set");
            }
            TariffDialogFragment.f297465j0.getClass();
            TariffDialogFragment tariffDialogFragment = new TariffDialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("dialog_params", dialogInfo);
            tariffDialogFragment.setArguments(bundle2);
            tariffDialogFragment.show(getSupportFragmentManager(), "dialog_tag");
        }
    }
}
