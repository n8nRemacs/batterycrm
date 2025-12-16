package com.avito.android.safety.sessions.social_logout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.safety.sessions.social_logout.SessionsSocialLogoutFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SessionsSocialLogoutActvity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/SessionsSocialLogoutActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionsSocialLogoutActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Intent intent = this.f304538c;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            SessionsSocialLogoutFragment.a aVar = SessionsSocialLogoutFragment.f257994u0;
            String stringExtra = getIntent().getStringExtra(SearchParamsConverterKt.SOURCE);
            String stringExtra2 = getIntent().getStringExtra("user_id");
            String stringExtra3 = getIntent().getStringExtra("login_type");
            String stringExtra4 = getIntent().getStringExtra("session_id_hash");
            String stringExtra5 = getIntent().getStringExtra("device_id");
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("up_intent", Intent.class) : extras.getParcelable("up_intent"));
            } else {
                intent = null;
            }
            Bundle extras2 = getIntent().getExtras();
            boolean z12 = extras2 != null ? extras2.getBoolean("is_from_safety_screen_param") : false;
            aVar.getClass();
            SessionsSocialLogoutFragment sessionsSocialLogoutFragment = new SessionsSocialLogoutFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString(SearchParamsConverterKt.SOURCE, stringExtra);
            bundle2.putString("user_id", stringExtra2);
            bundle2.putString("login_type", stringExtra3);
            bundle2.putString("session_id_hash", stringExtra4);
            bundle2.putString("device_id", stringExtra5);
            bundle2.putParcelable("up_intent", intent);
            bundle2.putBoolean("is_from_safety_screen_param", z12);
            sessionsSocialLogoutFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, sessionsSocialLogoutFragment, "sessions_social_logout_tag", 1);
            hE2.e();
        }
    }
}
