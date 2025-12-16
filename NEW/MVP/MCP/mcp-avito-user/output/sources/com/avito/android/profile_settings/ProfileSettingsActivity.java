package com.avito.android.profile_settings;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileSettingsActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings/ProfileSettingsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileSettingsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot() && this.f304538c != null) {
            V1();
        }
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof com.avito.android.ui.fragments.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
                return;
            }
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ProfileSettingsMviFragment.a aVar = ProfileSettingsMviFragment.f228358F0;
            String stringExtra = getIntent().getStringExtra("key_active_tab");
            String stringExtra2 = getIntent().getStringExtra("key_source");
            String stringExtra3 = getIntent().getStringExtra("start_fragment");
            String stringExtra4 = getIntent().getStringExtra("widgets_to_scroll");
            aVar.getClass();
            ProfileSettingsMviFragment profileSettingsMviFragment = new ProfileSettingsMviFragment();
            C35966w1.a(profileSettingsMviFragment, -1, new i(stringExtra, stringExtra2, stringExtra3, stringExtra4));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, profileSettingsMviFragment, "profile_settings_fragment", 1);
            hE2.f();
        }
    }
}
