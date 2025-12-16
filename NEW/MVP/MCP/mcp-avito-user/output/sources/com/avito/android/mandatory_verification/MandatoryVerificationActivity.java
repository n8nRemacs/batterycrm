package com.avito.android.mandatory_verification;

import Y61.l;
import android.R;
import android.os.Bundle;
import androidx.fragment.app.H;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.mandatory_verification.MandatoryVerificationFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MandatoryVerificationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mandatory_verification/MandatoryVerificationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MandatoryVerificationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* compiled from: MandatoryVerificationActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mandatory_verification/MandatoryVerificationActivity$a;", "", "<init>", "()V", "", "KEY_ITEM_ID", "Ljava/lang/String;", "TAG_MANDATORY_VERIFICATION", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MandatoryVerificationFragment.a aVar = MandatoryVerificationFragment.f184394w0;
            long longExtra = getIntent().getLongExtra("key.mandatory_verification_item_id", 0L);
            aVar.getClass();
            MandatoryVerificationFragment mandatoryVerificationFragment = new MandatoryVerificationFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("key.mandatory_verification_item_id", longExtra);
            mandatoryVerificationFragment.setArguments(bundle2);
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.content, mandatoryVerificationFragment, "tag.mandatory_verification");
            hE2.e();
        }
    }
}
