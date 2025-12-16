package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsInfoResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD, "Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "bottomSheet", "<init>", "(Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;)V", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "d", "()Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "c", "()Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBonusInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchBonusInfo> CREATOR = new a();

    @c("bottomSheet")
    @l
    private final BonusInfo bottomSheet;

    @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD)
    @l
    private final SearchBonusInfoCard card;

    /* compiled from: CampaignsSaleItemsInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchBonusInfo> {
        @Override // android.os.Parcelable.Creator
        public final SearchBonusInfo createFromParcel(Parcel parcel) {
            return new SearchBonusInfo(parcel.readInt() == 0 ? null : SearchBonusInfoCard.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BonusInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchBonusInfo[] newArray(int i12) {
            return new SearchBonusInfo[i12];
        }
    }

    public SearchBonusInfo(@l SearchBonusInfoCard searchBonusInfoCard, @l BonusInfo bonusInfo) {
        this.card = searchBonusInfoCard;
        this.bottomSheet = bonusInfo;
    }

    public static SearchBonusInfo a(SearchBonusInfo searchBonusInfo, SearchBonusInfoCard searchBonusInfoCard) {
        BonusInfo bonusInfo = searchBonusInfo.bottomSheet;
        searchBonusInfo.getClass();
        return new SearchBonusInfo(searchBonusInfoCard, bonusInfo);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final BonusInfo getBottomSheet() {
        return this.bottomSheet;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final SearchBonusInfoCard getCard() {
        return this.card;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBonusInfo)) {
            return false;
        }
        SearchBonusInfo searchBonusInfo = (SearchBonusInfo) obj;
        return L.f(this.card, searchBonusInfo.card) && L.f(this.bottomSheet, searchBonusInfo.bottomSheet);
    }

    public final int hashCode() {
        SearchBonusInfoCard searchBonusInfoCard = this.card;
        int iHashCode = (searchBonusInfoCard == null ? 0 : searchBonusInfoCard.hashCode()) * 31;
        BonusInfo bonusInfo = this.bottomSheet;
        return iHashCode + (bonusInfo != null ? bonusInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SearchBonusInfo(card=" + this.card + ", bottomSheet=" + this.bottomSheet + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SearchBonusInfoCard searchBonusInfoCard = this.card;
        if (searchBonusInfoCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchBonusInfoCard.writeToParcel(parcel, i12);
        }
        BonusInfo bonusInfo = this.bottomSheet;
        if (bonusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bonusInfo.writeToParcel(parcel, i12);
        }
    }
}
