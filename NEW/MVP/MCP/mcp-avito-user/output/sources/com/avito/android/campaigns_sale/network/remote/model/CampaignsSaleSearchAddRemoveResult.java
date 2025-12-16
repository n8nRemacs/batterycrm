package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleSearchAddRemoveResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleSearchAddRemoveResult;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "price", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "bonuses", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "c", "()Lcom/avito/android/campaigns_sale/network/remote/model/SearchBonusInfoCard;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleSearchAddRemoveResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleSearchAddRemoveResult> CREATOR = new a();

    @c("bonuses")
    @l
    private final SearchBonusInfoCard bonuses;

    @c("price")
    @k
    private final AttributedText price;

    /* compiled from: CampaignsSaleSearchAddRemoveResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleSearchAddRemoveResult> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchAddRemoveResult createFromParcel(Parcel parcel) {
            return new CampaignsSaleSearchAddRemoveResult((AttributedText) parcel.readParcelable(CampaignsSaleSearchAddRemoveResult.class.getClassLoader()), parcel.readInt() == 0 ? null : SearchBonusInfoCard.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchAddRemoveResult[] newArray(int i12) {
            return new CampaignsSaleSearchAddRemoveResult[i12];
        }
    }

    public CampaignsSaleSearchAddRemoveResult(@k AttributedText attributedText, @l SearchBonusInfoCard searchBonusInfoCard) {
        this.price = attributedText;
        this.bonuses = searchBonusInfoCard;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final SearchBonusInfoCard getBonuses() {
        return this.bonuses;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getPrice() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleSearchAddRemoveResult)) {
            return false;
        }
        CampaignsSaleSearchAddRemoveResult campaignsSaleSearchAddRemoveResult = (CampaignsSaleSearchAddRemoveResult) obj;
        return L.f(this.price, campaignsSaleSearchAddRemoveResult.price) && L.f(this.bonuses, campaignsSaleSearchAddRemoveResult.bonuses);
    }

    public final int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        SearchBonusInfoCard searchBonusInfoCard = this.bonuses;
        return iHashCode + (searchBonusInfoCard == null ? 0 : searchBonusInfoCard.hashCode());
    }

    @k
    public final String toString() {
        return "CampaignsSaleSearchAddRemoveResult(price=" + this.price + ", bonuses=" + this.bonuses + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.price, i12);
        SearchBonusInfoCard searchBonusInfoCard = this.bonuses;
        if (searchBonusInfoCard == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchBonusInfoCard.writeToParcel(parcel, i12);
        }
    }
}
