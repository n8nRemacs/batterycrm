package com.avito.android.advert.item.gig.duties;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDutiesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/gig/duties/AdvertDetailsDutiesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDutiesItem implements BlockItem {

    @k
    public static final Parcelable.Creator<AdvertDetailsDutiesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75737b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75738c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<String> f75739d;

    /* compiled from: AdvertDetailsDutiesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDutiesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDutiesItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDutiesItem(parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDutiesItem[] newArray(int i12) {
            return new AdvertDetailsDutiesItem[i12];
        }
    }

    public AdvertDetailsDutiesItem(int i12, @k String str, @k List<String> list) {
        this.f75737b = i12;
        this.f75738c = str;
        this.f75739d = list;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDutiesItem(i12, this.f75738c, this.f75739d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDutiesItem)) {
            return false;
        }
        AdvertDetailsDutiesItem advertDetailsDutiesItem = (AdvertDetailsDutiesItem) obj;
        return this.f75737b == advertDetailsDutiesItem.f75737b && L.f(this.f75738c, advertDetailsDutiesItem.f75738c) && L.f(this.f75739d, advertDetailsDutiesItem.f75739d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF72731b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75219b() {
        return this.f75737b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75220c() {
        return this.f75738c;
    }

    public final int hashCode() {
        return this.f75739d.hashCode() + H.d(Integer.hashCode(this.f75737b) * 31, 31, this.f75738c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDutiesItem(spanCount=");
        sb2.append(this.f75737b);
        sb2.append(", stringId=");
        sb2.append(this.f75738c);
        sb2.append(", data=");
        return H.p(sb2, this.f75739d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75737b);
        parcel.writeString(this.f75738c);
        parcel.writeStringList(this.f75739d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDutiesItem(int i12, String str, List list, int i13, C42822w c42822w) {
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            str = "ITEM_GIG_DUTIES";
        }
        this(i12, str, list);
    }
}
