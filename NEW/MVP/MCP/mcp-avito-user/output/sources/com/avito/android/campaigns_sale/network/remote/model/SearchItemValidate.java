package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.delivery_suggests.l;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleItemsInfoResult.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/SearchItemValidate;", "Landroid/os/Parcelable;", "", "minDiscount", "maxDiscount", "", "suggestions", "<init>", "(IILjava/util/List;)V", "I", "d", "()I", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchItemValidate implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchItemValidate> CREATOR = new a();

    @c("maxDiscount")
    private final int maxDiscount;

    @c("minDiscount")
    private final int minDiscount;

    @c("suggestions")
    @k
    private final List<Integer> suggestions;

    /* compiled from: CampaignsSaleItemsInfoResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchItemValidate> {
        @Override // android.os.Parcelable.Creator
        public final SearchItemValidate createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD2 = 0;
            while (iD2 != i14) {
                iD2 = l.d(parcel, arrayList, iD2, 1);
            }
            return new SearchItemValidate(i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchItemValidate[] newArray(int i12) {
            return new SearchItemValidate[i12];
        }
    }

    public SearchItemValidate(int i12, int i13, @k List<Integer> list) {
        this.minDiscount = i12;
        this.maxDiscount = i13;
        this.suggestions = list;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxDiscount() {
        return this.maxDiscount;
    }

    /* renamed from: d, reason: from getter */
    public final int getMinDiscount() {
        return this.minDiscount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<Integer> e() {
        return this.suggestions;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItemValidate)) {
            return false;
        }
        SearchItemValidate searchItemValidate = (SearchItemValidate) obj;
        return this.minDiscount == searchItemValidate.minDiscount && this.maxDiscount == searchItemValidate.maxDiscount && L.f(this.suggestions, searchItemValidate.suggestions);
    }

    public final int hashCode() {
        return this.suggestions.hashCode() + r.e(this.maxDiscount, Integer.hashCode(this.minDiscount) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchItemValidate(minDiscount=");
        sb2.append(this.minDiscount);
        sb2.append(", maxDiscount=");
        sb2.append(this.maxDiscount);
        sb2.append(", suggestions=");
        return H.p(sb2, this.suggestions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.minDiscount);
        parcel.writeInt(this.maxDiscount);
        Iterator itJ = C0.j(this.suggestions, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
    }
}
