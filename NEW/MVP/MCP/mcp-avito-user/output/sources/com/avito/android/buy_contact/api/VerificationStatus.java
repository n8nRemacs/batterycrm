package com.avito.android.buy_contact.api;

import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CheckVerificationResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/buy_contact/api/VerificationStatus;", "", "(Ljava/lang/String;I)V", "VERIFICATION_REQUIRED", "VERIFICATION_PENDING", "_avito_job_publish-check-verification_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerificationStatus {

    @c("verificationPending")
    public static final VerificationStatus VERIFICATION_PENDING;

    @c("verificationRequired")
    public static final VerificationStatus VERIFICATION_REQUIRED;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VerificationStatus[] f108766b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f108767c;

    static {
        VerificationStatus verificationStatus = new VerificationStatus("VERIFICATION_REQUIRED", 0);
        VERIFICATION_REQUIRED = verificationStatus;
        VerificationStatus verificationStatus2 = new VerificationStatus("VERIFICATION_PENDING", 1);
        VERIFICATION_PENDING = verificationStatus2;
        VerificationStatus[] verificationStatusArr = {verificationStatus, verificationStatus2};
        f108766b = verificationStatusArr;
        f108767c = kotlin.enums.c.a(verificationStatusArr);
    }

    private VerificationStatus(String str, int i12) {
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) f108766b.clone();
    }
}
