package com.avito.android.wallet.history.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletHistoryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/entity/HistoryItemStatus;", "", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HistoryItemStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final HistoryItemStatus f327646b;

    /* renamed from: c, reason: collision with root package name */
    public static final HistoryItemStatus f327647c;

    /* renamed from: d, reason: collision with root package name */
    public static final HistoryItemStatus f327648d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ HistoryItemStatus[] f327649e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f327650f;

    static {
        HistoryItemStatus historyItemStatus = new HistoryItemStatus("PENDING", 0);
        f327646b = historyItemStatus;
        HistoryItemStatus historyItemStatus2 = new HistoryItemStatus("SUCCESS", 1);
        f327647c = historyItemStatus2;
        HistoryItemStatus historyItemStatus3 = new HistoryItemStatus("FAILED", 2);
        f327648d = historyItemStatus3;
        HistoryItemStatus[] historyItemStatusArr = {historyItemStatus, historyItemStatus2, historyItemStatus3};
        f327649e = historyItemStatusArr;
        f327650f = c.a(historyItemStatusArr);
    }

    public HistoryItemStatus() {
        throw null;
    }

    public static HistoryItemStatus valueOf(String str) {
        return (HistoryItemStatus) Enum.valueOf(HistoryItemStatus.class, str);
    }

    public static HistoryItemStatus[] values() {
        return (HistoryItemStatus[]) f327649e.clone();
    }
}
