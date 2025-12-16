package com.avito.android.extended_profile_widgets.adapter.search.search_empty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_empty/SearchEmptyItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchEmptyItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154799b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154800c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154801d;

    /* compiled from: SearchEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchEmptyItem createFromParcel(Parcel parcel) {
            return new SearchEmptyItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchEmptyItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchEmptyItem[] newArray(int i12) {
            return new SearchEmptyItem[i12];
        }
    }

    public SearchEmptyItem(@k String str, @k GridElementType gridElementType, @k String str2) {
        this.f154799b = str;
        this.f154800c = gridElementType;
        this.f154801d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchEmptyItem)) {
            return false;
        }
        SearchEmptyItem searchEmptyItem = (SearchEmptyItem) obj;
        return L.f(this.f154799b, searchEmptyItem.f154799b) && L.f(this.f154800c, searchEmptyItem.f154800c) && L.f(this.f154801d, searchEmptyItem.f154801d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154849c() {
        return this.f154800c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154848b() {
        return this.f154799b;
    }

    public final int hashCode() {
        return this.f154801d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f154800c, this.f154799b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchEmptyItem(stringId=");
        sb2.append(this.f154799b);
        sb2.append(", gridType=");
        sb2.append(this.f154800c);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f154801d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154799b);
        parcel.writeParcelable(this.f154800c, i12);
        parcel.writeString(this.f154801d);
    }

    public /* synthetic */ SearchEmptyItem(String str, GridElementType gridElementType, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_empty_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2);
    }
}
