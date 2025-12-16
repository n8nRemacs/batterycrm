package com.avito.android.authorization.select_profile.social_login;

import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.select_profile.social_login.SocialRegistrationSuggestsFragment;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: SocialRegistrationSuggestsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/SocialRegistrationSuggestsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SocialRegistrationSuggestsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            SocialRegistrationSuggestsFragment.a aVar = SocialRegistrationSuggestsFragment.f94342u0;
            SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = (SocialRegistrationSuggestsParams) getIntent().getParcelableExtra("extra_srs_params");
            if (socialRegistrationSuggestsParams == null) {
                throw new IllegalStateException("Params must not be null");
            }
            aVar.getClass();
            SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment = new SocialRegistrationSuggestsFragment();
            socialRegistrationSuggestsFragment.setArguments(C22777e.b(new Q("extra_srs_params", socialRegistrationSuggestsParams)));
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, socialRegistrationSuggestsFragment, "select_profile_social_tag", 1);
            hE2.e();
        }
    }
}
