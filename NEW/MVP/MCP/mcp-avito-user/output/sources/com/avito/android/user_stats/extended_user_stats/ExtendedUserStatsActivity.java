package com.avito.android.user_stats.extended_user_stats;

import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedUserStatsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ExtendedUserStatsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ExtendedUserStatsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.stats_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ExtendedUserStatsFragment.a aVar = ExtendedUserStatsFragment.f317014I0;
            int intExtra = getIntent().getIntExtra("requestKeyTabsPosition", 0);
            long longExtra = getIntent().getLongExtra("requestKeyStartDate", 0L);
            long longExtra2 = getIntent().getLongExtra("requestKeyEndDate", 0L);
            String stringExtra = getIntent().getStringExtra("requestKeyMetric");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = getIntent().getStringExtra("requestKeyViews");
            String str = stringExtra2 != null ? stringExtra2 : "";
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("requestKeyItemId");
            ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("requestKeySpaces");
            aVar.getClass();
            ExtendedUserStatsFragment extendedUserStatsFragment = new ExtendedUserStatsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("requestKeyTabsPosition", intExtra);
            bundle2.putLong("requestKeyStartDate", longExtra);
            bundle2.putLong("requestKeyEndDate", longExtra2);
            bundle2.putString("requestKeyMetric", stringExtra);
            bundle2.putString("requestKeyViews", str);
            bundle2.putStringArrayList("requestKeyItemId", stringArrayListExtra);
            bundle2.putStringArrayList("requestKeySpaces", stringArrayListExtra2);
            extendedUserStatsFragment.setArguments(bundle2);
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, extendedUserStatsFragment, null);
            hE2.e();
        }
    }
}
