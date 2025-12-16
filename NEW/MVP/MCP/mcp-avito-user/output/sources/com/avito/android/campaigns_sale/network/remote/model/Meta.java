package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleLoadPageResult.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/Meta;", "Landroid/os/Parcelable;", "", "isParticipant", "isTerminated", "", "", "discounts", "minDiscount", "maxDiscount", "Lcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;", "headerTooltip", "itemsTooltip", "Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "bonusInfo", "<init>", "(ZZLjava/util/List;IILcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;Lcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;)V", "Z", "i", "()Z", "j", "Ljava/util/List;", "d", "()Ljava/util/List;", "I", "h", "()I", "g", "Lcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;", "e", "()Lcom/avito/android/campaigns_sale/network/remote/model/HeaderTooltip;", "f", "Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "c", "()Lcom/avito/android/campaigns_sale/network/remote/model/BonusInfo;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Meta implements Parcelable {

    @k
    public static final Parcelable.Creator<Meta> CREATOR = new a();

    @c("bonuses")
    @l
    private final BonusInfo bonusInfo;

    @c("discounts")
    @k
    private final List<Integer> discounts;

    @c("discountTooltip")
    @k
    private final HeaderTooltip headerTooltip;

    @c("isParticipant")
    private final boolean isParticipant;

    @c("isTerminated")
    private final boolean isTerminated;

    @c("itemsTooltip")
    @k
    private final HeaderTooltip itemsTooltip;

    @c("maxDiscount")
    private final int maxDiscount;

    @c("minDiscount")
    private final int minDiscount;

    /* compiled from: CampaignsSaleLoadPageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Meta> {
        @Override // android.os.Parcelable.Creator
        public final Meta createFromParcel(Parcel parcel) {
            int iD2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iD2 != i12) {
                iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
            }
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            Parcelable.Creator<HeaderTooltip> creator = HeaderTooltip.CREATOR;
            return new Meta(z12, z13, arrayList, i13, i14, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : BonusInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Meta[] newArray(int i12) {
            return new Meta[i12];
        }
    }

    public Meta(boolean z12, boolean z13, @k List<Integer> list, int i12, int i13, @k HeaderTooltip headerTooltip, @k HeaderTooltip headerTooltip2, @l BonusInfo bonusInfo) {
        this.isParticipant = z12;
        this.isTerminated = z13;
        this.discounts = list;
        this.minDiscount = i12;
        this.maxDiscount = i13;
        this.headerTooltip = headerTooltip;
        this.itemsTooltip = headerTooltip2;
        this.bonusInfo = bonusInfo;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final BonusInfo getBonusInfo() {
        return this.bonusInfo;
    }

    @k
    public final List<Integer> d() {
        return this.discounts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final HeaderTooltip getHeaderTooltip() {
        return this.headerTooltip;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        return this.isParticipant == meta.isParticipant && this.isTerminated == meta.isTerminated && L.f(this.discounts, meta.discounts) && this.minDiscount == meta.minDiscount && this.maxDiscount == meta.maxDiscount && L.f(this.headerTooltip, meta.headerTooltip) && L.f(this.itemsTooltip, meta.itemsTooltip) && L.f(this.bonusInfo, meta.bonusInfo);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final HeaderTooltip getItemsTooltip() {
        return this.itemsTooltip;
    }

    /* renamed from: g, reason: from getter */
    public final int getMaxDiscount() {
        return this.maxDiscount;
    }

    /* renamed from: h, reason: from getter */
    public final int getMinDiscount() {
        return this.minDiscount;
    }

    public final int hashCode() {
        int iHashCode = (this.itemsTooltip.hashCode() + ((this.headerTooltip.hashCode() + r.e(this.maxDiscount, r.e(this.minDiscount, H.e(r.i(Boolean.hashCode(this.isParticipant) * 31, 31, this.isTerminated), 31, this.discounts), 31), 31)) * 31)) * 31;
        BonusInfo bonusInfo = this.bonusInfo;
        return iHashCode + (bonusInfo == null ? 0 : bonusInfo.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsParticipant() {
        return this.isParticipant;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsTerminated() {
        return this.isTerminated;
    }

    @k
    public final String toString() {
        return "Meta(isParticipant=" + this.isParticipant + ", isTerminated=" + this.isTerminated + ", discounts=" + this.discounts + ", minDiscount=" + this.minDiscount + ", maxDiscount=" + this.maxDiscount + ", headerTooltip=" + this.headerTooltip + ", itemsTooltip=" + this.itemsTooltip + ", bonusInfo=" + this.bonusInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.isParticipant ? 1 : 0);
        parcel.writeInt(this.isTerminated ? 1 : 0);
        Iterator itJ = C0.j(this.discounts, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
        parcel.writeInt(this.minDiscount);
        parcel.writeInt(this.maxDiscount);
        this.headerTooltip.writeToParcel(parcel, i12);
        this.itemsTooltip.writeToParcel(parcel, i12);
        BonusInfo bonusInfo = this.bonusInfo;
        if (bonusInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bonusInfo.writeToParcel(parcel, i12);
        }
    }
}
