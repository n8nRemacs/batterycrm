package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentSetProfileNameActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReAgentSetProfileNameActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f211374m = new a(null);

    /* compiled from: ReAgentSetProfileNameActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameActivity$a;", "", "<init>", "()V", "", "EXTRA_ARG", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_re_agent_set_profile_name;
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("passport.add_profile.re_agent_set_profile_name_args", ReAgentSetProfileNameArgs.class) : intent.getParcelableExtra("passport.add_profile.re_agent_set_profile_name_args");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ReAgentSetProfileNameFragment.f211382C0.getClass();
            ReAgentSetProfileNameFragment reAgentSetProfileNameFragment = new ReAgentSetProfileNameFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("passport.add_profile.re_agent_set_profile_name.args", (ReAgentSetProfileNameArgs) parcelableExtra);
            reAgentSetProfileNameFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.content_container, reAgentSetProfileNameFragment, null);
            hE2.c(null);
            hE2.e();
        }
    }
}
