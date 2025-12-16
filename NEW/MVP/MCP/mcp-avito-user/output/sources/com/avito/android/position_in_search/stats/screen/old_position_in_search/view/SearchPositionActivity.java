package com.avito.android.position_in_search.stats.screen.old_position_in_search.view;

import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.SearchPositionDialogFragment;
import com.avito.android.position_in_search.stats.view.SearchPositionParams;
import kotlin.Metadata;

/* compiled from: SearchPositionActivity.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/SearchPositionActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SearchPositionActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            SearchPositionDialogFragment.a aVar = SearchPositionDialogFragment.f220693f0;
            SearchPositionParams.a aVar2 = SearchPositionParams.f221755d;
            Intent intent = getIntent();
            aVar2.getClass();
            SearchPositionParams searchPositionParams = (SearchPositionParams) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("position_in_search.stats.search_position_params_key", SearchPositionParams.class) : intent.getParcelableExtra("position_in_search.stats.search_position_params_key"));
            if (searchPositionParams == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            aVar.getClass();
            SearchPositionDialogFragment searchPositionDialogFragment = new SearchPositionDialogFragment();
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("position_in_search.stats.search_position_params_key", searchPositionParams);
            searchPositionDialogFragment.setArguments(bundle2);
            searchPositionDialogFragment.show(getSupportFragmentManager(), (String) null);
        }
    }
}
