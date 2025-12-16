package com.avito.android.extended_profile_widgets.adapter.search.search_geo;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchGeoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_geo/SearchGeoItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchGeoItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchGeoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154808b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154809c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f154810d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f154811e;

    /* compiled from: SearchGeoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchGeoItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchGeoItem createFromParcel(Parcel parcel) {
            return new SearchGeoItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchGeoItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SearchGeoItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchGeoItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchGeoItem[] newArray(int i12) {
            return new SearchGeoItem[i12];
        }
    }

    public SearchGeoItem(@k String str, @k GridElementType gridElementType, @k AttributedText attributedText, @k DeepLink deepLink) {
        this.f154808b = str;
        this.f154809c = gridElementType;
        this.f154810d = attributedText;
        this.f154811e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchGeoItem)) {
            return false;
        }
        SearchGeoItem searchGeoItem = (SearchGeoItem) obj;
        return L.f(this.f154808b, searchGeoItem.f154808b) && L.f(this.f154809c, searchGeoItem.f154809c) && L.f(this.f154810d, searchGeoItem.f154810d) && L.f(this.f154811e, searchGeoItem.f154811e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154934c() {
        return this.f154809c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154571b() {
        return this.f154808b;
    }

    public final int hashCode() {
        return this.f154811e.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.bxcontent.mvi.entity.f.b(this.f154809c, this.f154808b.hashCode() * 31, 31), 31, this.f154810d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchGeoItem(stringId=");
        sb2.append(this.f154808b);
        sb2.append(", gridType=");
        sb2.append(this.f154809c);
        sb2.append(", richTitle=");
        sb2.append(this.f154810d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f154811e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154808b);
        parcel.writeParcelable(this.f154809c, i12);
        parcel.writeParcelable(this.f154810d, i12);
        parcel.writeParcelable(this.f154811e, i12);
    }

    public /* synthetic */ SearchGeoItem(String str, GridElementType gridElementType, AttributedText attributedText, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "extended_profile_search_geo_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, attributedText, deepLink);
    }
}
