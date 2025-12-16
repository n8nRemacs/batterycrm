package com.avito.android.safety.sessions.info;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.auth.SessionsInfoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SessionsInfoActvity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/sessions/info/SessionsInfoActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionsInfoActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Fragment fragmentH = getSupportFragmentManager().H("sessions_info_tag");
        G0 g02 = null;
        SessionsInfoFragment sessionsInfoFragment = fragmentH instanceof SessionsInfoFragment ? (SessionsInfoFragment) fragmentH : null;
        if (sessionsInfoFragment != null) {
            sessionsInfoFragment.q5();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        SessionsInfoLink.SessionsInfoParams sessionsInfoParams;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                sessionsInfoParams = (SessionsInfoLink.SessionsInfoParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("params", SessionsInfoLink.SessionsInfoParams.class) : extras.getParcelable("params"));
            } else {
                sessionsInfoParams = null;
            }
            SessionsInfoFragment.f257943r0.getClass();
            SessionsInfoFragment sessionsInfoFragment = new SessionsInfoFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("params", sessionsInfoParams);
            sessionsInfoFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, sessionsInfoFragment, "sessions_info_tag", 1);
            hE2.e();
        }
    }
}
