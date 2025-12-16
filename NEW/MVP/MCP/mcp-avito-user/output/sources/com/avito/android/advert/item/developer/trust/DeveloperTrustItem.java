package com.avito.android.advert.item.developer.trust;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.DeveloperCard;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeveloperTrustItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/developer/trust/DeveloperTrustItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DeveloperTrustItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<DeveloperTrustItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75180c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75181d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f75182e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f75183f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f75184g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f75185h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeveloperCard f75186i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeveloperCard f75187j;

    /* compiled from: DeveloperTrustItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeveloperTrustItem> {
        @Override // android.os.Parcelable.Creator
        public final DeveloperTrustItem createFromParcel(Parcel parcel) {
            return new DeveloperTrustItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(DeveloperTrustItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(DeveloperTrustItem.class.getClassLoader()), (DeveloperCard) parcel.readParcelable(DeveloperTrustItem.class.getClassLoader()), (DeveloperCard) parcel.readParcelable(DeveloperTrustItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeveloperTrustItem[] newArray(int i12) {
            return new DeveloperTrustItem[i12];
        }
    }

    public DeveloperTrustItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l AttributedText attributedText, @l AttributedText attributedText2, @l DeveloperCard developerCard, @l DeveloperCard developerCard2) {
        this.f75179b = j12;
        this.f75180c = str;
        this.f75181d = i12;
        this.f75182e = serpDisplayType;
        this.f75183f = serpViewType;
        this.f75184g = attributedText;
        this.f75185h = attributedText2;
        this.f75186i = developerCard;
        this.f75187j = developerCard2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new DeveloperTrustItem(this.f75179b, this.f75180c, i12, this.f75182e, this.f75183f, this.f75184g, this.f75185h, this.f75186i, this.f75187j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75182e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperTrustItem)) {
            return false;
        }
        DeveloperTrustItem developerTrustItem = (DeveloperTrustItem) obj;
        return this.f75179b == developerTrustItem.f75179b && L.f(this.f75180c, developerTrustItem.f75180c) && this.f75181d == developerTrustItem.f75181d && this.f75182e == developerTrustItem.f75182e && this.f75183f == developerTrustItem.f75183f && L.f(this.f75184g, developerTrustItem.f75184g) && L.f(this.f75185h, developerTrustItem.f75185h) && L.f(this.f75186i, developerTrustItem.f75186i) && L.f(this.f75187j, developerTrustItem.f75187j);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f75179b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272525c() {
        return this.f75181d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF130103b() {
        return this.f75180c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272524b() {
        return this.f75183f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f75183f, com.avito.android.actions_sheet.a.h(this.f75182e, r.e(this.f75181d, H.d(Long.hashCode(this.f75179b) * 31, 31, this.f75180c), 31), 31), 31);
        AttributedText attributedText = this.f75184g;
        int iHashCode = (iJ2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f75185h;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        DeveloperCard developerCard = this.f75186i;
        int iHashCode3 = (iHashCode2 + (developerCard == null ? 0 : developerCard.hashCode())) * 31;
        DeveloperCard developerCard2 = this.f75187j;
        return iHashCode3 + (developerCard2 != null ? developerCard2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DeveloperTrustItem(id=" + this.f75179b + ", stringId=" + this.f75180c + ", spanCount=" + this.f75181d + ", displayType=" + this.f75182e + ", viewType=" + this.f75183f + ", title=" + this.f75184g + ", description=" + this.f75185h + ", trustCard=" + this.f75186i + ", foundationCard=" + this.f75187j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75179b);
        parcel.writeString(this.f75180c);
        parcel.writeInt(this.f75181d);
        parcel.writeString(this.f75182e.name());
        parcel.writeString(this.f75183f.name());
        parcel.writeParcelable(this.f75184g, i12);
        parcel.writeParcelable(this.f75185h, i12);
        parcel.writeParcelable(this.f75186i, i12);
        parcel.writeParcelable(this.f75187j, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeveloperTrustItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AttributedText attributedText, AttributedText attributedText2, DeveloperCard developerCard, DeveloperCard developerCard2, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 95;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, attributedText, attributedText2, developerCard, developerCard2);
    }
}
