package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationDialogFragment;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.model.ReAgentShortFlowCreationArguments;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentShortFlowCreationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/ReAgentShortFlowCreationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReAgentShortFlowCreationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f211511m = new a(null);

    /* compiled from: ReAgentShortFlowCreationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/ReAgentShortFlowCreationActivity$a;", "", "<init>", "()V", "", "EXTRA_NAVIGATION_BACK_DEEPLINK", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_re_agent_short_flow_creation;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        DeepLink deepLink;
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("navigationBackDeeplink", DeepLink.class) : extras.getParcelable("navigationBackDeeplink"));
            } else {
                deepLink = null;
            }
            ReAgentShortFlowCreationDialogFragment.a aVar = ReAgentShortFlowCreationDialogFragment.f211512o0;
            ReAgentShortFlowCreationArguments reAgentShortFlowCreationArguments = new ReAgentShortFlowCreationArguments(deepLink);
            aVar.getClass();
            ReAgentShortFlowCreationDialogFragment reAgentShortFlowCreationDialogFragment = new ReAgentShortFlowCreationDialogFragment();
            C35966w1.a(reAgentShortFlowCreationDialogFragment, -1, new com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.a(reAgentShortFlowCreationArguments));
            reAgentShortFlowCreationDialogFragment.show(getSupportFragmentManager(), "re_agent_short_flow_creation");
        }
    }
}
