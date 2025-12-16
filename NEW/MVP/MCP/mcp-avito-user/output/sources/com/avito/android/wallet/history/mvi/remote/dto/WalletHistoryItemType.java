package com.avito.android.wallet.history.mvi.remote.dto;

import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletHistoryResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemType;", "", "(Ljava/lang/String;I)V", "OPERATION", "INFO", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletHistoryItemType {

    @c(RequestReviewResultKt.INFO_TYPE)
    public static final WalletHistoryItemType INFO;

    @c("operation")
    public static final WalletHistoryItemType OPERATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ WalletHistoryItemType[] f327725b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f327726c;

    static {
        WalletHistoryItemType walletHistoryItemType = new WalletHistoryItemType("OPERATION", 0);
        OPERATION = walletHistoryItemType;
        WalletHistoryItemType walletHistoryItemType2 = new WalletHistoryItemType("INFO", 1);
        INFO = walletHistoryItemType2;
        WalletHistoryItemType[] walletHistoryItemTypeArr = {walletHistoryItemType, walletHistoryItemType2};
        f327725b = walletHistoryItemTypeArr;
        f327726c = kotlin.enums.c.a(walletHistoryItemTypeArr);
    }

    private WalletHistoryItemType(String str, int i12) {
    }

    public static WalletHistoryItemType valueOf(String str) {
        return (WalletHistoryItemType) Enum.valueOf(WalletHistoryItemType.class, str);
    }

    public static WalletHistoryItemType[] values() {
        return (WalletHistoryItemType[]) f327725b.clone();
    }
}
