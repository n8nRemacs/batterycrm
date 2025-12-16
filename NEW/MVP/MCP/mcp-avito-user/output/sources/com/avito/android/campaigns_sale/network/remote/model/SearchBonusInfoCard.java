package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsInfoResult.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "Landroid/os/Parcelable;", "", "hasIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(ZLcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;)V", "Z", "c", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBonusInfoCard implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchBonusInfoCard> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("hasIcon")
    private final boolean hasIcon;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: CampaignsSaleItemsInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchBonusInfoCard> {
        @Override // android.os.Parcelable.Creator
        public final SearchBonusInfoCard createFromParcel(Parcel parcel) {
            return new SearchBonusInfoCard(parcel.readInt() != 0, (DeepLink) parcel.readParcelable(SearchBonusInfoCard.class.getClassLoader()), (AttributedText) parcel.readParcelable(SearchBonusInfoCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchBonusInfoCard[] newArray(int i12) {
            return new SearchBonusInfoCard[i12];
        }
    }

    public SearchBonusInfoCard(boolean z12, @l DeepLink deepLink, @k AttributedText attributedText) {
        this.hasIcon = z12;
        this.deeplink = deepLink;
        this.text = attributedText;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasIcon() {
        return this.hasIcon;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBonusInfoCard)) {
            return false;
        }
        SearchBonusInfoCard searchBonusInfoCard = (SearchBonusInfoCard) obj;
        return this.hasIcon == searchBonusInfoCard.hasIcon && L.f(this.deeplink, searchBonusInfoCard.deeplink) && L.f(this.text, searchBonusInfoCard.text);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.hasIcon) * 31;
        DeepLink deepLink = this.deeplink;
        return this.text.hashCode() + ((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchBonusInfoCard(hasIcon=");
        sb2.append(this.hasIcon);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.hasIcon ? 1 : 0);
        parcel.writeParcelable(this.deeplink, i12);
        parcel.writeParcelable(this.text, i12);
    }
}
