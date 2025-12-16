package com.avito.android.buy_contact.api;

import Y61.l;
import androidx.annotation.Keep;
import kotlin.Metadata;

/* compiled from: CheckVerificationResponse.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/buy_contact/api/CheckVerificationResponse;", "", "needBlockVacancy", "", "verificationStatus", "Lcom/avito/android/buy_contact/api/VerificationStatus;", "(ZLcom/avito/android/buy_contact/api/VerificationStatus;)V", "getNeedBlockVacancy", "()Z", "getVerificationStatus", "()Lcom/avito/android/buy_contact/api/VerificationStatus;", "_avito_job_publish-check-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckVerificationResponse {
    private final boolean needBlockVacancy;

    @l
    private final VerificationStatus verificationStatus;

    public CheckVerificationResponse(boolean z12, @l VerificationStatus verificationStatus) {
        this.needBlockVacancy = z12;
        this.verificationStatus = verificationStatus;
    }

    public final boolean getNeedBlockVacancy() {
        return this.needBlockVacancy;
    }

    @l
    public final VerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }
}
