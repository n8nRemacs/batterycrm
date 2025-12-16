package com.avito.android.advert.item.similars;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.marker.MarkerItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SimilarsStartMarkerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/SimilarsStartMarkerItem;", "Lcom/avito/android/advert/item/marker/MarkerItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SimilarsStartMarkerItem implements MarkerItem {

    @Y61.k
    public static final Parcelable.Creator<SimilarsStartMarkerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f80206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80207d;

    /* compiled from: SimilarsStartMarkerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SimilarsStartMarkerItem> {
        @Override // android.os.Parcelable.Creator
        public final SimilarsStartMarkerItem createFromParcel(Parcel parcel) {
            return new SimilarsStartMarkerItem(parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SimilarsStartMarkerItem[] newArray(int i12) {
            return new SimilarsStartMarkerItem[i12];
        }
    }

    public SimilarsStartMarkerItem() {
        this(0L, null, 0, 7, null);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new SimilarsStartMarkerItem(i12, this.f80205b, this.f80206c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimilarsStartMarkerItem)) {
            return false;
        }
        SimilarsStartMarkerItem similarsStartMarkerItem = (SimilarsStartMarkerItem) obj;
        return this.f80205b == similarsStartMarkerItem.f80205b && L.f(this.f80206c, similarsStartMarkerItem.f80206c) && this.f80207d == similarsStartMarkerItem.f80207d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80205b() {
        return this.f80205b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80207d() {
        return this.f80207d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80206c() {
        return this.f80206c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80207d) + H.d(Long.hashCode(this.f80205b) * 31, 31, this.f80206c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimilarsStartMarkerItem(id=");
        sb2.append(this.f80205b);
        sb2.append(", stringId=");
        sb2.append(this.f80206c);
        sb2.append(", spanCount=");
        return androidx.appcompat.app.r.t(sb2, this.f80207d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f80205b);
        parcel.writeString(this.f80206c);
        parcel.writeInt(this.f80207d);
    }

    public SimilarsStartMarkerItem(int i12, long j12, @Y61.k String str) {
        this.f80205b = j12;
        this.f80206c = str;
        this.f80207d = i12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SimilarsStartMarkerItem(long j12, String str, int i12, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 51;
        }
        this((i13 & 4) != 0 ? 0 : i12, j12, (i13 & 2) != 0 ? String.valueOf(j12) : str);
    }
}
