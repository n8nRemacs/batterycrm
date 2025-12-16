package com.avito.android.advert_details_items.rich_geo_block;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.remote.model.rich_geo_block.RichGeoBlock;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRichGeoBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/AdvertDetailsRichGeoBlockItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsRichGeoBlockItem implements PersistableSpannedItem {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsRichGeoBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85410c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85411d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RichGeoBlock f85412e;

    /* compiled from: AdvertDetailsRichGeoBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsRichGeoBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRichGeoBlockItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsRichGeoBlockItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (RichGeoBlock) parcel.readParcelable(AdvertDetailsRichGeoBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRichGeoBlockItem[] newArray(int i12) {
            return new AdvertDetailsRichGeoBlockItem[i12];
        }
    }

    public AdvertDetailsRichGeoBlockItem(long j12, @Y61.k String str, int i12, @Y61.k RichGeoBlock richGeoBlock) {
        this.f85409b = j12;
        this.f85410c = str;
        this.f85411d = i12;
        this.f85412e = richGeoBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsRichGeoBlockItem)) {
            return false;
        }
        AdvertDetailsRichGeoBlockItem advertDetailsRichGeoBlockItem = (AdvertDetailsRichGeoBlockItem) obj;
        return this.f85409b == advertDetailsRichGeoBlockItem.f85409b && L.f(this.f85410c, advertDetailsRichGeoBlockItem.f85410c) && this.f85411d == advertDetailsRichGeoBlockItem.f85411d && L.f(this.f85412e, advertDetailsRichGeoBlockItem.f85412e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80596b() {
        return this.f85409b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f85411d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296503b() {
        return this.f85410c;
    }

    public final int hashCode() {
        return this.f85412e.hashCode() + androidx.appcompat.app.r.e(this.f85411d, H.d(Long.hashCode(this.f85409b) * 31, 31, this.f85410c), 31);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsRichGeoBlockItem(id=" + this.f85409b + ", stringId=" + this.f85410c + ", spanCount=" + this.f85411d + ", richGeoBlock=" + this.f85412e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85409b);
        parcel.writeString(this.f85410c);
        parcel.writeInt(this.f85411d);
        parcel.writeParcelable(this.f85412e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsRichGeoBlockItem(long j12, String str, int i12, RichGeoBlock richGeoBlock, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 59;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, richGeoBlock);
    }
}
