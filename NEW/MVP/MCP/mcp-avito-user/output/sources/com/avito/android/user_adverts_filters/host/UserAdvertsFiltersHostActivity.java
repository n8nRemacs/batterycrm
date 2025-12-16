package com.avito.android.user_adverts_filters.host;

import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import kotlin.Metadata;

/* compiled from: UserAdvertsFiltersHostActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts_filters/host/UserAdvertsFiltersHostActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsFiltersHostActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            UserAdvertsFiltersData.a aVar = UserAdvertsFiltersData.f315950e;
            Intent intent = getIntent();
            aVar.getClass();
            UserAdvertsFiltersData userAdvertsFiltersDataA = UserAdvertsFiltersData.a.a(intent);
            UserAdvertsFiltersHostFragment userAdvertsFiltersHostFragment = new UserAdvertsFiltersHostFragment();
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("arg_user_adverts_filters_host_data", userAdvertsFiltersDataA);
            userAdvertsFiltersHostFragment.setArguments(bundle2);
            userAdvertsFiltersHostFragment.show(getSupportFragmentManager(), (String) null);
        }
    }
}
