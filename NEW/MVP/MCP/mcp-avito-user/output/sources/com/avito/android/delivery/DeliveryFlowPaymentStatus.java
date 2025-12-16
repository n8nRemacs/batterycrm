package com.avito.android.delivery;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeliveryFlowPaymentStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery/DeliveryFlowPaymentStatus;", "", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryFlowPaymentStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final DeliveryFlowPaymentStatus f134746b;

    /* renamed from: c, reason: collision with root package name */
    public static final DeliveryFlowPaymentStatus f134747c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DeliveryFlowPaymentStatus[] f134748d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f134749e;

    static {
        DeliveryFlowPaymentStatus deliveryFlowPaymentStatus = new DeliveryFlowPaymentStatus("PAID_SUCCESSFULLY", 0);
        f134746b = deliveryFlowPaymentStatus;
        DeliveryFlowPaymentStatus deliveryFlowPaymentStatus2 = new DeliveryFlowPaymentStatus("PAY_FAILED", 1);
        DeliveryFlowPaymentStatus deliveryFlowPaymentStatus3 = new DeliveryFlowPaymentStatus("PAYMENT_NOT_REACHED", 2);
        f134747c = deliveryFlowPaymentStatus3;
        DeliveryFlowPaymentStatus[] deliveryFlowPaymentStatusArr = {deliveryFlowPaymentStatus, deliveryFlowPaymentStatus2, deliveryFlowPaymentStatus3};
        f134748d = deliveryFlowPaymentStatusArr;
        f134749e = c.a(deliveryFlowPaymentStatusArr);
    }

    public DeliveryFlowPaymentStatus() {
        throw null;
    }

    public static DeliveryFlowPaymentStatus valueOf(String str) {
        return (DeliveryFlowPaymentStatus) Enum.valueOf(DeliveryFlowPaymentStatus.class, str);
    }

    public static DeliveryFlowPaymentStatus[] values() {
        return (DeliveryFlowPaymentStatus[]) f134748d.clone();
    }
}
