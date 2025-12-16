package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsResult.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/ItemMinDiscountPair;", "Landroid/os/Parcelable;", "", "minDiscount", "", "", "itemIds", "<init>", "(ILjava/util/List;)V", "I", "d", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ItemMinDiscountPair implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemMinDiscountPair> CREATOR = new a();

    @c("itemIds")
    @k
    private final List<Long> itemIds;

    @c("minDiscount")
    private final int minDiscount;

    /* compiled from: CampaignsSaleItemsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemMinDiscountPair> {
        @Override // android.os.Parcelable.Creator
        public final ItemMinDiscountPair createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new ItemMinDiscountPair(i12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemMinDiscountPair[] newArray(int i12) {
            return new ItemMinDiscountPair[i12];
        }
    }

    public ItemMinDiscountPair(int i12, @k List<Long> list) {
        this.minDiscount = i12;
        this.itemIds = list;
    }

    @k
    public final List<Long> c() {
        return this.itemIds;
    }

    /* renamed from: d, reason: from getter */
    public final int getMinDiscount() {
        return this.minDiscount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMinDiscountPair)) {
            return false;
        }
        ItemMinDiscountPair itemMinDiscountPair = (ItemMinDiscountPair) obj;
        return this.minDiscount == itemMinDiscountPair.minDiscount && L.f(this.itemIds, itemMinDiscountPair.itemIds);
    }

    public final int hashCode() {
        return this.itemIds.hashCode() + (Integer.hashCode(this.minDiscount) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemMinDiscountPair(minDiscount=");
        sb2.append(this.minDiscount);
        sb2.append(", itemIds=");
        return H.p(sb2, this.itemIds, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.minDiscount);
        Iterator itJ = C0.j(this.itemIds, parcel);
        while (itJ.hasNext()) {
            parcel.writeLong(((Number) itJ.next()).longValue());
        }
    }
}
