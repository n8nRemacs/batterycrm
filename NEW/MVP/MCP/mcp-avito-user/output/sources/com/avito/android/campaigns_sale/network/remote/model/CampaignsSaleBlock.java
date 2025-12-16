package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleLoadPageResult.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleBlock;", "Landroid/os/Parcelable;", "", "discount", "", "", "itemIds", "Lcom/avito/android/remote/model/Image;", "images", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/util/List;", "d", "()Ljava/util/List;", "getImages", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleBlock> CREATOR = new a();

    @c("discount")
    @l
    private final Integer discount;

    @c("images")
    @l
    private final List<Image> images;

    @c("itemIds")
    @l
    private final List<Long> itemIds;

    /* compiled from: CampaignsSaleLoadPageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleBlock> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleBlock createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(CampaignsSaleBlock.class, parcel, arrayList3, iL2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new CampaignsSaleBlock(numValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleBlock[] newArray(int i12) {
            return new CampaignsSaleBlock[i12];
        }
    }

    public CampaignsSaleBlock(@l Integer num, @l List<Long> list, @l List<Image> list2) {
        this.discount = num;
        this.itemIds = list;
        this.images = list2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getDiscount() {
        return this.discount;
    }

    @l
    public final List<Long> d() {
        return this.itemIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleBlock)) {
            return false;
        }
        CampaignsSaleBlock campaignsSaleBlock = (CampaignsSaleBlock) obj;
        return L.f(this.discount, campaignsSaleBlock.discount) && L.f(this.itemIds, campaignsSaleBlock.itemIds) && L.f(this.images, campaignsSaleBlock.images);
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    public final int hashCode() {
        Integer num = this.discount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Long> list = this.itemIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.images;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleBlock(discount=");
        sb2.append(this.discount);
        sb2.append(", itemIds=");
        sb2.append(this.itemIds);
        sb2.append(", images=");
        return H.p(sb2, this.images, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Integer num = this.discount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<Long> list = this.itemIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeLong(((Number) itA.next()).longValue());
            }
        }
        List<Image> list2 = this.images;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }
}
