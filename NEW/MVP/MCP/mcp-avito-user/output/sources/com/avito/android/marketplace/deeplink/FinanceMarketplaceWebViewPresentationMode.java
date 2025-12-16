package com.avito.android.marketplace.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FinanceMarketplaceLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/marketplace/deeplink/FinanceMarketplaceWebViewPresentationMode;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "Push", "Modal", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinanceMarketplaceWebViewPresentationMode implements Parcelable {

    @k
    public static final Parcelable.Creator<FinanceMarketplaceWebViewPresentationMode> CREATOR;

    @c("modal")
    public static final FinanceMarketplaceWebViewPresentationMode Modal;

    @c("push")
    public static final FinanceMarketplaceWebViewPresentationMode Push;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FinanceMarketplaceWebViewPresentationMode[] f185898b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f185899c;

    static {
        FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode = new FinanceMarketplaceWebViewPresentationMode("Push", 0);
        Push = financeMarketplaceWebViewPresentationMode;
        FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode2 = new FinanceMarketplaceWebViewPresentationMode("Modal", 1);
        Modal = financeMarketplaceWebViewPresentationMode2;
        FinanceMarketplaceWebViewPresentationMode[] financeMarketplaceWebViewPresentationModeArr = {financeMarketplaceWebViewPresentationMode, financeMarketplaceWebViewPresentationMode2};
        f185898b = financeMarketplaceWebViewPresentationModeArr;
        f185899c = kotlin.enums.c.a(financeMarketplaceWebViewPresentationModeArr);
        CREATOR = new Parcelable.Creator<FinanceMarketplaceWebViewPresentationMode>() { // from class: com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewPresentationMode.a
            @Override // android.os.Parcelable.Creator
            public final FinanceMarketplaceWebViewPresentationMode createFromParcel(Parcel parcel) {
                return FinanceMarketplaceWebViewPresentationMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FinanceMarketplaceWebViewPresentationMode[] newArray(int i12) {
                return new FinanceMarketplaceWebViewPresentationMode[i12];
            }
        };
    }

    private FinanceMarketplaceWebViewPresentationMode(String str, int i12) {
    }

    public static FinanceMarketplaceWebViewPresentationMode valueOf(String str) {
        return (FinanceMarketplaceWebViewPresentationMode) Enum.valueOf(FinanceMarketplaceWebViewPresentationMode.class, str);
    }

    public static FinanceMarketplaceWebViewPresentationMode[] values() {
        return (FinanceMarketplaceWebViewPresentationMode[]) f185898b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
