package com.avito.android.autoteka.presentation.landing;

import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaLandingActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/AutotekaLandingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaLandingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* compiled from: AutotekaLandingActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/AutotekaLandingActivity$a;", "", "<init>", "()V", "", "KEY_AUTOTEKA_LANDING_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_landing_activity;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("KeyAutotekaLandingUtmParams");
            if (parcelableExtra == null) {
                throw new IllegalArgumentException("AutotekaLandingDetails should be pass to Activity");
            }
            AutotekaLandingFragment.f97301I0.getClass();
            AutotekaLandingFragment autotekaLandingFragment = new AutotekaLandingFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("KeyAutotekaLandingUtmParams", (LandingDetails) parcelableExtra);
            autotekaLandingFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.j(R.id.fragment_container, autotekaLandingFragment, null, 1);
            hE2.e();
        }
    }
}
