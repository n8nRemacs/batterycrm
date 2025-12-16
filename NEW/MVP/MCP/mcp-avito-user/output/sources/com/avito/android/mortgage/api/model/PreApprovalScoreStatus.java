package com.avito.android.mortgage.api.model;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PreApprovalScore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/api/model/PreApprovalScoreStatus;", "", "(Ljava/lang/String;I)V", "HIGH_LEVEL", "CAN_IMPROVE", "FAILED", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreApprovalScoreStatus {

    @c("can_improve")
    public static final PreApprovalScoreStatus CAN_IMPROVE;

    @c(PaymentStateKt.PAYMENT_STATE_FAILED)
    public static final PreApprovalScoreStatus FAILED;

    @c("high_level")
    public static final PreApprovalScoreStatus HIGH_LEVEL;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PreApprovalScoreStatus[] f198211b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f198212c;

    static {
        PreApprovalScoreStatus preApprovalScoreStatus = new PreApprovalScoreStatus("HIGH_LEVEL", 0);
        HIGH_LEVEL = preApprovalScoreStatus;
        PreApprovalScoreStatus preApprovalScoreStatus2 = new PreApprovalScoreStatus("CAN_IMPROVE", 1);
        CAN_IMPROVE = preApprovalScoreStatus2;
        PreApprovalScoreStatus preApprovalScoreStatus3 = new PreApprovalScoreStatus("FAILED", 2);
        FAILED = preApprovalScoreStatus3;
        PreApprovalScoreStatus[] preApprovalScoreStatusArr = {preApprovalScoreStatus, preApprovalScoreStatus2, preApprovalScoreStatus3};
        f198211b = preApprovalScoreStatusArr;
        f198212c = kotlin.enums.c.a(preApprovalScoreStatusArr);
    }

    private PreApprovalScoreStatus(String str, int i12) {
    }

    public static PreApprovalScoreStatus valueOf(String str) {
        return (PreApprovalScoreStatus) Enum.valueOf(PreApprovalScoreStatus.class, str);
    }

    public static PreApprovalScoreStatus[] values() {
        return (PreApprovalScoreStatus[]) f198211b.clone();
    }
}
