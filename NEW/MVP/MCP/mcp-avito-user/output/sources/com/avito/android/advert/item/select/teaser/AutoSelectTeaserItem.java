package com.avito.android.advert.item.select.teaser;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.auto_select.AutoSelectTeaser;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectTeaserItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/teaser/AutoSelectTeaserItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectTeaserItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AutoSelectTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79636b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79637c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SerpViewType f79638d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f79639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79640f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AutoSelectTeaser f79641g;

    /* compiled from: AutoSelectTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectTeaserItem createFromParcel(Parcel parcel) {
            return new AutoSelectTeaserItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), (AutoSelectTeaser) parcel.readParcelable(AutoSelectTeaserItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectTeaserItem[] newArray(int i12) {
            return new AutoSelectTeaserItem[i12];
        }
    }

    public AutoSelectTeaserItem(long j12, @k String str, @k SerpViewType serpViewType, @k SerpDisplayType serpDisplayType, int i12, @k AutoSelectTeaser autoSelectTeaser) {
        this.f79636b = j12;
        this.f79637c = str;
        this.f79638d = serpViewType;
        this.f79639e = serpDisplayType;
        this.f79640f = i12;
        this.f79641g = autoSelectTeaser;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AutoSelectTeaserItem(this.f79636b, this.f79637c, this.f79638d, this.f79639e, i12, this.f79641g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79639e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectTeaserItem)) {
            return false;
        }
        AutoSelectTeaserItem autoSelectTeaserItem = (AutoSelectTeaserItem) obj;
        return this.f79636b == autoSelectTeaserItem.f79636b && L.f(this.f79637c, autoSelectTeaserItem.f79637c) && this.f79638d == autoSelectTeaserItem.f79638d && this.f79639e == autoSelectTeaserItem.f79639e && this.f79640f == autoSelectTeaserItem.f79640f && L.f(this.f79641g, autoSelectTeaserItem.f79641g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF113512b() {
        return this.f79636b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272742i() {
        return this.f79640f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF279586d() {
        return this.f79637c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272741h() {
        return this.f79638d;
    }

    public final int hashCode() {
        return this.f79641g.hashCode() + r.e(this.f79640f, com.avito.android.actions_sheet.a.h(this.f79639e, com.avito.android.actions_sheet.a.j(this.f79638d, H.d(Long.hashCode(this.f79636b) * 31, 31, this.f79637c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AutoSelectTeaserItem(id=" + this.f79636b + ", stringId=" + this.f79637c + ", viewType=" + this.f79638d + ", displayType=" + this.f79639e + ", spanCount=" + this.f79640f + ", teaserData=" + this.f79641g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79636b);
        parcel.writeString(this.f79637c);
        parcel.writeString(this.f79638d.name());
        parcel.writeString(this.f79639e.name());
        parcel.writeInt(this.f79640f);
        parcel.writeParcelable(this.f79641g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoSelectTeaserItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, AutoSelectTeaser autoSelectTeaser, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 129;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, autoSelectTeaser);
    }
}
