package com.avito.android.reputation.ui;

import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.reputation.ui.ReputationFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReputationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/reputation/ui/ReputationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReputationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {
    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.reputation_activity;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        H hE2 = getSupportFragmentManager().e();
        ReputationFragment.a aVar = ReputationFragment.f254766A0;
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("args", ReputationArgs.class) : intent.getParcelableExtra("args");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVar.getClass();
        ReputationFragment reputationFragment = new ReputationFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("args_key", (ReputationArgs) parcelableExtra);
        reputationFragment.setArguments(bundle2);
        hE2.n(R.id.reputation_fragment_container, reputationFragment, null);
        hE2.e();
    }
}
