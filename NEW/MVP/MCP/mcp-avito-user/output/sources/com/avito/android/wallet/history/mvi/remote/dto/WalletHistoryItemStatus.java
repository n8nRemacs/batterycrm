package com.avito.android.wallet.history.mvi.remote.dto;

import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletHistoryResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemStatus;", "", "(Ljava/lang/String;I)V", "PENDING", "SUCCESS", "FAILED", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletHistoryItemStatus {

    @c(PaymentStateKt.PAYMENT_STATE_FAILED)
    public static final WalletHistoryItemStatus FAILED;

    @c("pending")
    public static final WalletHistoryItemStatus PENDING;

    @c("success")
    public static final WalletHistoryItemStatus SUCCESS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WalletHistoryItemStatus[] f327723b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f327724c;

    static {
        WalletHistoryItemStatus walletHistoryItemStatus = new WalletHistoryItemStatus("PENDING", 0);
        PENDING = walletHistoryItemStatus;
        WalletHistoryItemStatus walletHistoryItemStatus2 = new WalletHistoryItemStatus("SUCCESS", 1);
        SUCCESS = walletHistoryItemStatus2;
        WalletHistoryItemStatus walletHistoryItemStatus3 = new WalletHistoryItemStatus("FAILED", 2);
        FAILED = walletHistoryItemStatus3;
        WalletHistoryItemStatus[] walletHistoryItemStatusArr = {walletHistoryItemStatus, walletHistoryItemStatus2, walletHistoryItemStatus3};
        f327723b = walletHistoryItemStatusArr;
        f327724c = kotlin.enums.c.a(walletHistoryItemStatusArr);
    }

    private WalletHistoryItemStatus(String str, int i12) {
    }

    public static WalletHistoryItemStatus valueOf(String str) {
        return (WalletHistoryItemStatus) Enum.valueOf(WalletHistoryItemStatus.class, str);
    }

    public static WalletHistoryItemStatus[] values() {
        return (WalletHistoryItemStatus[]) f327723b.clone();
    }
}
