package com.avito.android.vas_planning.remove;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlannerRemoveActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_planning/remove/VasPlannerRemoveActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasPlannerRemoveActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("vas_plan_remove_info_extra", VasPlannerRemoveInfo.class) : intent.getParcelableExtra("vas_plan_remove_info_extra");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("vas_plan_remove_info_extra must be set");
        }
        VasPlannerRemoveInfo vasPlannerRemoveInfo = (VasPlannerRemoveInfo) parcelableExtra;
        if (bundle == null) {
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("vas_plan_remove_info_arg", vasPlannerRemoveInfo);
            VasPlannerRemoveDialogFragment vasPlannerRemoveDialogFragment = new VasPlannerRemoveDialogFragment();
            vasPlannerRemoveDialogFragment.setArguments(bundle2);
            vasPlannerRemoveDialogFragment.show(getSupportFragmentManager(), "remove_dialog_tag");
        }
    }
}
