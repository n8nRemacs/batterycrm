package com.avito.android.marketplace.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: FinanceMarketplaceLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/marketplace/deeplink/FinanceMarketplaceWebViewAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinanceMarketplaceWebViewAction implements Parcelable {

    @k
    public static final Parcelable.Creator<FinanceMarketplaceWebViewAction> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    /* compiled from: FinanceMarketplaceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FinanceMarketplaceWebViewAction> {
        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceWebViewAction createFromParcel(Parcel parcel) {
            return new FinanceMarketplaceWebViewAction((DeepLink) parcel.readParcelable(FinanceMarketplaceWebViewAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceWebViewAction[] newArray(int i12) {
            return new FinanceMarketplaceWebViewAction[i12];
        }
    }

    public FinanceMarketplaceWebViewAction(@k DeepLink deepLink) {
        this.deeplink = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.deeplink, i12);
    }
}
