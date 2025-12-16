package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
final class h extends g {
    @Override // com.google.android.play.core.review.g, com.google.android.play.core.review.internal.h
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.f358613b.d(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
