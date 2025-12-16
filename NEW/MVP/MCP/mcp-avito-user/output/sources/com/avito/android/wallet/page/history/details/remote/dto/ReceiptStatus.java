package com.avito.android.wallet.page.history.details.remote.dto;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Receipt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/details/remote/dto/ReceiptStatus;", "", "(Ljava/lang/String;I)V", "DONE", "WAIT", "FAIL", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ReceiptStatus {

    @c(PaymentStateKt.PAYMENT_STATE_DONE)
    public static final ReceiptStatus DONE;

    @c("fail")
    public static final ReceiptStatus FAIL;

    @c("wait")
    public static final ReceiptStatus WAIT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ReceiptStatus[] f327968b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f327969c;

    static {
        ReceiptStatus receiptStatus = new ReceiptStatus("DONE", 0);
        DONE = receiptStatus;
        ReceiptStatus receiptStatus2 = new ReceiptStatus("WAIT", 1);
        WAIT = receiptStatus2;
        ReceiptStatus receiptStatus3 = new ReceiptStatus("FAIL", 2);
        FAIL = receiptStatus3;
        ReceiptStatus[] receiptStatusArr = {receiptStatus, receiptStatus2, receiptStatus3};
        f327968b = receiptStatusArr;
        f327969c = kotlin.enums.c.a(receiptStatusArr);
    }

    private ReceiptStatus(String str, int i12) {
    }

    public static ReceiptStatus valueOf(String str) {
        return (ReceiptStatus) Enum.valueOf(ReceiptStatus.class, str);
    }

    public static ReceiptStatus[] values() {
        return (ReceiptStatus[]) f327968b.clone();
    }
}
