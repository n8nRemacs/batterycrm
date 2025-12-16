package com.avito.android.advert.item.consultation.dynamic_content;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.advert_details.realty.TeaserBanner;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DynamicConsultationAfterIceBreakersItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/consultation/dynamic_content/DynamicConsultationAfterIceBreakersItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DynamicConsultationAfterIceBreakersItem implements BlockItem {

    @k
    public static final Parcelable.Creator<DynamicConsultationAfterIceBreakersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74736b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f74737c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74738d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final TeaserBanner f74739e;

    /* compiled from: DynamicConsultationAfterIceBreakersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicConsultationAfterIceBreakersItem> {
        @Override // android.os.Parcelable.Creator
        public final DynamicConsultationAfterIceBreakersItem createFromParcel(Parcel parcel) {
            return new DynamicConsultationAfterIceBreakersItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (TeaserBanner) parcel.readParcelable(DynamicConsultationAfterIceBreakersItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicConsultationAfterIceBreakersItem[] newArray(int i12) {
            return new DynamicConsultationAfterIceBreakersItem[i12];
        }
    }

    public DynamicConsultationAfterIceBreakersItem(long j12, @k String str, int i12, @l TeaserBanner teaserBanner) {
        this.f74736b = j12;
        this.f74737c = str;
        this.f74738d = i12;
        this.f74739e = teaserBanner;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new DynamicConsultationAfterIceBreakersItem(this.f74736b, this.f74737c, i12, this.f74739e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicConsultationAfterIceBreakersItem)) {
            return false;
        }
        DynamicConsultationAfterIceBreakersItem dynamicConsultationAfterIceBreakersItem = (DynamicConsultationAfterIceBreakersItem) obj;
        return this.f74736b == dynamicConsultationAfterIceBreakersItem.f74736b && L.f(this.f74737c, dynamicConsultationAfterIceBreakersItem.f74737c) && this.f74738d == dynamicConsultationAfterIceBreakersItem.f74738d && L.f(this.f74739e, dynamicConsultationAfterIceBreakersItem.f74739e);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80596b() {
        return this.f74736b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f74738d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97044b() {
        return this.f74737c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f74738d, H.d(Long.hashCode(this.f74736b) * 31, 31, this.f74737c), 31);
        TeaserBanner teaserBanner = this.f74739e;
        return iE2 + (teaserBanner == null ? 0 : teaserBanner.hashCode());
    }

    @k
    public final String toString() {
        return "DynamicConsultationAfterIceBreakersItem(id=" + this.f74736b + ", stringId=" + this.f74737c + ", spanCount=" + this.f74738d + ", data=" + this.f74739e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f74736b);
        parcel.writeString(this.f74737c);
        parcel.writeInt(this.f74738d);
        parcel.writeParcelable(this.f74739e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DynamicConsultationAfterIceBreakersItem(long j12, String str, int i12, TeaserBanner teaserBanner, int i13, C42822w c42822w) {
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j12 = 41;
        }
        long j13 = j12;
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, teaserBanner);
    }
}
