package com.avito.android.extended_profile_widgets.adapter.search.search_active_empty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchActiveEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_active_empty/SearchActiveEmptyItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchActiveEmptyItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchActiveEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154682b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154683c;

    /* compiled from: SearchActiveEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchActiveEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchActiveEmptyItem createFromParcel(Parcel parcel) {
            return new SearchActiveEmptyItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchActiveEmptyItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchActiveEmptyItem[] newArray(int i12) {
            return new SearchActiveEmptyItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchActiveEmptyItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchActiveEmptyItem)) {
            return false;
        }
        SearchActiveEmptyItem searchActiveEmptyItem = (SearchActiveEmptyItem) obj;
        return L.f(this.f154682b, searchActiveEmptyItem.f154682b) && L.f(this.f154683c, searchActiveEmptyItem.f154683c);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154610c() {
        return this.f154683c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154609b() {
        return this.f154682b;
    }

    public final int hashCode() {
        return this.f154683c.hashCode() + (this.f154682b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SearchActiveEmptyItem(stringId=" + this.f154682b + ", gridType=" + this.f154683c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154682b);
        parcel.writeParcelable(this.f154683c, i12);
    }

    public SearchActiveEmptyItem(@k String str, @k GridElementType gridElementType) {
        this.f154682b = str;
        this.f154683c = gridElementType;
    }

    public /* synthetic */ SearchActiveEmptyItem(String str, GridElementType gridElementType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_empty_active_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType);
    }
}
