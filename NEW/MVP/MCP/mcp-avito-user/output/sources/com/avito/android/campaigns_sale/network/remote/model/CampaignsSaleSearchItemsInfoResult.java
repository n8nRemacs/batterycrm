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

/* compiled from: CampaignsSaleItemsInfoResult.kt */
@d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleSearchItemsInfoResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/campaigns_sale/network/remote/model/SearchItem;", "items", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleSearchItemsInfoResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleSearchItemsInfoResult> CREATOR = new a();

    @c("items")
    @k
    private final List<SearchItem> items;

    /* compiled from: CampaignsSaleItemsInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleSearchItemsInfoResult> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchItemsInfoResult createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SearchItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CampaignsSaleSearchItemsInfoResult(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleSearchItemsInfoResult[] newArray(int i12) {
            return new CampaignsSaleSearchItemsInfoResult[i12];
        }
    }

    public CampaignsSaleSearchItemsInfoResult(@k List<SearchItem> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CampaignsSaleSearchItemsInfoResult) && L.f(this.items, ((CampaignsSaleSearchItemsInfoResult) obj).items);
    }

    @k
    public final List<SearchItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("CampaignsSaleSearchItemsInfoResult(items="), this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((SearchItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
