package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Verification.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/VerificationStatus;", "", "(Ljava/lang/String;I)V", "OFFER", "CHECKING", "RETRY", "APPROVED", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationStatus[] $VALUES;

    @c("offer")
    public static final VerificationStatus OFFER = new VerificationStatus("OFFER", 0);

    @c("checking")
    public static final VerificationStatus CHECKING = new VerificationStatus("CHECKING", 1);

    @c("retry")
    public static final VerificationStatus RETRY = new VerificationStatus("RETRY", 2);

    @c("approved")
    public static final VerificationStatus APPROVED = new VerificationStatus("APPROVED", 3);

    private static final /* synthetic */ VerificationStatus[] $values() {
        return new VerificationStatus[]{OFFER, CHECKING, RETRY, APPROVED};
    }

    static {
        VerificationStatus[] verificationStatusArr$values = $values();
        $VALUES = verificationStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(verificationStatusArr$values);
    }

    private VerificationStatus(String str, int i12) {
    }

    @k
    public static a<VerificationStatus> getEntries() {
        return $ENTRIES;
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) $VALUES.clone();
    }
}
