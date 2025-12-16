package com.avito.android.wallet.page.generated.api.get_wallet_service_info;

import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "toastText", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData$ToastType;", "toastType", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData$ToastType;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData$ToastType;", "b", "()Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData$ToastType;", "ToastType", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServiceInfoToastData {

    @c("toastText")
    @k
    private final AttributedText toastText;

    @c("toastType")
    @k
    private final ToastType toastType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWalletServiceInfoResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/page/generated/api/get_wallet_service_info/ServiceInfoToastData$ToastType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "Error", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ToastType {

        @c("default")
        public static final ToastType Default;

        @c("error")
        public static final ToastType Error;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ToastType[] f327828b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f327829c;

        static {
            ToastType toastType = new ToastType("Default", 0, "default");
            Default = toastType;
            ToastType toastType2 = new ToastType("Error", 1, "error");
            Error = toastType2;
            ToastType[] toastTypeArr = {toastType, toastType2};
            f327828b = toastTypeArr;
            f327829c = kotlin.enums.c.a(toastTypeArr);
        }

        private ToastType(String str, int i12, String str2) {
        }

        public static ToastType valueOf(String str) {
            return (ToastType) Enum.valueOf(ToastType.class, str);
        }

        public static ToastType[] values() {
            return (ToastType[]) f327828b.clone();
        }
    }

    public ServiceInfoToastData(@k AttributedText attributedText, @k ToastType toastType) {
        this.toastText = attributedText;
        this.toastType = toastType;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getToastText() {
        return this.toastText;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final ToastType getToastType() {
        return this.toastType;
    }
}
