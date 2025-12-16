package com.avito.android.services_onboarding;

import Y61.k;
import Y61.l;
import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesOnboardingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServicesOnboardingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f279768m = new a(null);

    /* compiled from: ServicesOnboardingActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/services_onboarding/ServicesOnboardingActivity$a;", "", "<init>", "()V", "", "SERVICES_ONBOARDING_STEP_EXTRA_KEY", "Ljava/lang/String;", "SERVICES_ONBOARDING_TARGET_EXTRA_KEY", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("services_onboarding_target_extra_key", ServicesOnboardingTarget.class) : intent.getParcelableExtra("services_onboarding_target_extra_key");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("services onboarding target extra parameter must not be null");
            }
            int intExtra = getIntent().getIntExtra("services_onboarding_step_extra_key", -1);
            H hE2 = getSupportFragmentManager().e();
            ServicesOnboardingFragment.f279769y0.getClass();
            ServicesOnboardingFragment servicesOnboardingFragment = new ServicesOnboardingFragment();
            C35966w1.a(servicesOnboardingFragment, -1, new d((ServicesOnboardingTarget) parcelableExtra, intExtra));
            hE2.n(R.id.content, servicesOnboardingFragment, null);
            hE2.e();
        }
    }
}
