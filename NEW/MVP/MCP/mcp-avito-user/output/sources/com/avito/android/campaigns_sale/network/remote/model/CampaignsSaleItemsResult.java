package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsResult.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/CampaignsSaleItemsResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/campaigns_sale/network/remote/model/ItemMinDiscountPair;", "discounts", "", "loading", "<init>", "(Ljava/util/List;Z)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "d", "()Z", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CampaignsSaleItemsResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CampaignsSaleItemsResult> CREATOR = new a();

    @c("discounts")
    @k
    private final List<ItemMinDiscountPair> discounts;

    @c("loading")
    private final boolean loading;

    /* compiled from: CampaignsSaleItemsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CampaignsSaleItemsResult> {
        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleItemsResult createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ItemMinDiscountPair.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CampaignsSaleItemsResult(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CampaignsSaleItemsResult[] newArray(int i12) {
            return new CampaignsSaleItemsResult[i12];
        }
    }

    public CampaignsSaleItemsResult(@k List<ItemMinDiscountPair> list, boolean z12) {
        this.discounts = list;
        this.loading = z12;
    }

    @k
    public final List<ItemMinDiscountPair> c() {
        return this.discounts;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CampaignsSaleItemsResult)) {
            return false;
        }
        CampaignsSaleItemsResult campaignsSaleItemsResult = (CampaignsSaleItemsResult) obj;
        return L.f(this.discounts, campaignsSaleItemsResult.discounts) && this.loading == campaignsSaleItemsResult.loading;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.loading) + (this.discounts.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CampaignsSaleItemsResult(discounts=");
        sb2.append(this.discounts);
        sb2.append(", loading=");
        return r.x(sb2, this.loading, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.discounts, parcel);
        while (itJ.hasNext()) {
            ((ItemMinDiscountPair) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.loading ? 1 : 0);
    }
}
