package com.avito.android.extended_profile_widgets.adapter.search.search_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchAdvertItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/SearchAdvertItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchAdvertItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchAdvertItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154689b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154690c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AdvertItem f154691d;

    /* compiled from: SearchAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchAdvertItem createFromParcel(Parcel parcel) {
            return new SearchAdvertItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchAdvertItem.class.getClassLoader()), (AdvertItem) parcel.readParcelable(SearchAdvertItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchAdvertItem[] newArray(int i12) {
            return new SearchAdvertItem[i12];
        }
    }

    public SearchAdvertItem(@k String str, @k GridElementType gridElementType, @k AdvertItem advertItem) {
        this.f154689b = str;
        this.f154690c = gridElementType;
        this.f154691d = advertItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAdvertItem)) {
            return false;
        }
        SearchAdvertItem searchAdvertItem = (SearchAdvertItem) obj;
        return L.f(this.f154689b, searchAdvertItem.f154689b) && L.f(this.f154690c, searchAdvertItem.f154690c) && L.f(this.f154691d, searchAdvertItem.f154691d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154690c() {
        return this.f154690c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154689b() {
        return this.f154689b;
    }

    public final int hashCode() {
        return this.f154691d.hashCode() + f.b(this.f154690c, this.f154689b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "SearchAdvertItem(stringId=" + this.f154689b + ", gridType=" + this.f154690c + ", advert=" + this.f154691d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154689b);
        parcel.writeParcelable(this.f154690c, i12);
        parcel.writeParcelable(this.f154691d, i12);
    }

    public /* synthetic */ SearchAdvertItem(String str, GridElementType gridElementType, AdvertItem advertItem, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.SingleSpan.f161210b : gridElementType, advertItem);
    }
}
