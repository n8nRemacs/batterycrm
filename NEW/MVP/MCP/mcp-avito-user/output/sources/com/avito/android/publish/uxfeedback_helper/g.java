package com.avito.android.publish.uxfeedback_helper;

import AK0.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.uxfeedback_helper.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PublishUxFeedbackStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/uxfeedback_helper/g;", "Lcom/avito/android/publish/uxfeedback_helper/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f245521a;

    @Inject
    public g(@k l lVar) {
        this.f245521a = lVar;
    }

    @Override // com.avito.android.publish.uxfeedback_helper.f
    public final void a(@k a.C7356a c7356a) {
        if (c7356a != null) {
            this.f245521a.putBoolean("publish_skip_auction_ux_feedback_shown_pref_key", true);
        }
    }

    @Override // com.avito.android.publish.uxfeedback_helper.f
    public final boolean b(@k a.C7356a c7356a) {
        if (c7356a != null) {
            return !this.f245521a.getBoolean("publish_skip_auction_ux_feedback_shown_pref_key", false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
