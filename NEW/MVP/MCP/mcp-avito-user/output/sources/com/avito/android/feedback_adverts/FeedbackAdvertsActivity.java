package com.avito.android.feedback_adverts;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: FeedbackAdvertsActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/feedback_adverts/FeedbackAdvertsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/feedback_adverts/s;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_feedback-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackAdvertsActivity extends com.avito.android.ui.activity.a implements s, InterfaceC28477j.a {
    @Override // com.avito.android.feedback_adverts.s
    public final void K0(@Y61.k FeedbackAdvertItem feedbackAdvertItem) {
        Intent intent = new Intent();
        intent.putExtra("item", feedbackAdvertItem);
        setResult(-1, intent);
        p();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("item_id_key");
            String stringExtra2 = getIntent().getStringExtra("channel_id_key");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            H hE2 = getSupportFragmentManager().e();
            FeedbackAdvertsFragment.f157727w0.getClass();
            FeedbackAdvertsFragment feedbackAdvertsFragment = new FeedbackAdvertsFragment();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("item_id_key", stringExtra);
            bundle2.putString("channel_id_key", stringExtra2);
            feedbackAdvertsFragment.setArguments(bundle2);
            hE2.j(R.id.fragment_container, feedbackAdvertsFragment, null, 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.feedback_adverts.s
    public final void p() {
        if (isFinishing()) {
            return;
        }
        K2.c(this);
        finish();
    }
}
