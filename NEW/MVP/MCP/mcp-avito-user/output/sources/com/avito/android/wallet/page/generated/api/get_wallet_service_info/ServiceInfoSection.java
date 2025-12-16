package com.avito.android.wallet.page.generated.api.get_wallet_service_info;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection;", "", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection$HistoryId;", "historyId", "", "title", "<init>", "(Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection$HistoryId;Ljava/lang/String;)V", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection$HistoryId;", "getHistoryId", "()Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection$HistoryId;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "HistoryId", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceInfoSection {

    @c("historyId")
    @k
    private final HistoryId historyId;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWalletServiceInfoResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoSection$HistoryId;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Service", "Topup", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HistoryId {

        @c("service")
        public static final HistoryId Service;

        @c("topup")
        public static final HistoryId Topup;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ HistoryId[] f327826b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f327827c;

        static {
            HistoryId historyId = new HistoryId("Service", 0, "service");
            Service = historyId;
            HistoryId historyId2 = new HistoryId("Topup", 1, "topup");
            Topup = historyId2;
            HistoryId[] historyIdArr = {historyId, historyId2};
            f327826b = historyIdArr;
            f327827c = kotlin.enums.c.a(historyIdArr);
        }

        private HistoryId(String str, int i12, String str2) {
        }

        public static HistoryId valueOf(String str) {
            return (HistoryId) Enum.valueOf(HistoryId.class, str);
        }

        public static HistoryId[] values() {
            return (HistoryId[]) f327826b.clone();
        }
    }

    public ServiceInfoSection(@k HistoryId historyId, @k String str) {
        this.historyId = historyId;
        this.title = str;
    }
}
