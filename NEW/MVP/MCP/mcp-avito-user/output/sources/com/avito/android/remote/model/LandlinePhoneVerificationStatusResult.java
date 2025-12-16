package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: LandlinePhoneVerificationStatusResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult;", "", "status", "Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult$VerificationStatus;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult$VerificationStatus;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getStatus", "()Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult$VerificationStatus;", "VerificationStatus", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LandlinePhoneVerificationStatusResult {

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("status")
    @l
    private final VerificationStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LandlinePhoneVerificationStatusResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LandlinePhoneVerificationStatusResult$VerificationStatus;", "", "(Ljava/lang/String;I)V", "ERROR", "SUCCESS", "PROCESSING", "FAILED", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VerificationStatus[] $VALUES;

        @c("internal-error")
        public static final VerificationStatus ERROR = new VerificationStatus("ERROR", 0);

        @c("success")
        public static final VerificationStatus SUCCESS = new VerificationStatus("SUCCESS", 1);

        @c("processing")
        public static final VerificationStatus PROCESSING = new VerificationStatus("PROCESSING", 2);

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final VerificationStatus FAILED = new VerificationStatus("FAILED", 3);

        private static final /* synthetic */ VerificationStatus[] $values() {
            return new VerificationStatus[]{ERROR, SUCCESS, PROCESSING, FAILED};
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

    public LandlinePhoneVerificationStatusResult(@l VerificationStatus verificationStatus, @l DeepLink deepLink) {
        this.status = verificationStatus;
        this.deeplink = deepLink;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final VerificationStatus getStatus() {
        return this.status;
    }
}
