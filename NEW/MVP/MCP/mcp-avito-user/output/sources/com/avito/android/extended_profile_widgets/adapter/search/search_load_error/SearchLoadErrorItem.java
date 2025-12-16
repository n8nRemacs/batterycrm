package com.avito.android.extended_profile_widgets.adapter.search.search_load_error;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchLoadErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_load_error/SearchLoadErrorItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchLoadErrorItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchLoadErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154834c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154835d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ExtendedProfileSearchTabType f154836e;

    /* compiled from: SearchLoadErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchLoadErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchLoadErrorItem createFromParcel(Parcel parcel) {
            return new SearchLoadErrorItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchLoadErrorItem.class.getClassLoader()), parcel.readString(), ExtendedProfileSearchTabType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchLoadErrorItem[] newArray(int i12) {
            return new SearchLoadErrorItem[i12];
        }
    }

    public SearchLoadErrorItem(@k String str, @k GridElementType gridElementType, @k String str2, @k ExtendedProfileSearchTabType extendedProfileSearchTabType) {
        this.f154833b = str;
        this.f154834c = gridElementType;
        this.f154835d = str2;
        this.f154836e = extendedProfileSearchTabType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLoadErrorItem)) {
            return false;
        }
        SearchLoadErrorItem searchLoadErrorItem = (SearchLoadErrorItem) obj;
        return L.f(this.f154833b, searchLoadErrorItem.f154833b) && L.f(this.f154834c, searchLoadErrorItem.f154834c) && L.f(this.f154835d, searchLoadErrorItem.f154835d) && this.f154836e == searchLoadErrorItem.f154836e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154353c() {
        return this.f154834c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80109b() {
        return this.f154833b;
    }

    public final int hashCode() {
        return this.f154836e.hashCode() + H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154834c, this.f154833b.hashCode() * 31, 31), 31, this.f154835d);
    }

    @k
    public final String toString() {
        return "SearchLoadErrorItem(stringId=" + this.f154833b + ", gridType=" + this.f154834c + ", text=" + this.f154835d + ", tab=" + this.f154836e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154833b);
        parcel.writeParcelable(this.f154834c, i12);
        parcel.writeString(this.f154835d);
        parcel.writeString(this.f154836e.name());
    }

    public /* synthetic */ SearchLoadErrorItem(String str, GridElementType gridElementType, String str2, ExtendedProfileSearchTabType extendedProfileSearchTabType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_load_error" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, extendedProfileSearchTabType);
    }
}
