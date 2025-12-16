package com.avito.android.extended_profile_widgets.adapter.search.search_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_header/SearchHeaderItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchHeaderItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f154826d;

    /* compiled from: SearchHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchHeaderItem createFromParcel(Parcel parcel) {
            return new SearchHeaderItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchHeaderItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchHeaderItem[] newArray(int i12) {
            return new SearchHeaderItem[i12];
        }
    }

    public SearchHeaderItem(@k String str, @k GridElementType gridElementType, int i12) {
        this.f154824b = str;
        this.f154825c = gridElementType;
        this.f154826d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHeaderItem)) {
            return false;
        }
        SearchHeaderItem searchHeaderItem = (SearchHeaderItem) obj;
        return L.f(this.f154824b, searchHeaderItem.f154824b) && L.f(this.f154825c, searchHeaderItem.f154825c) && this.f154826d == searchHeaderItem.f154826d;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154934c() {
        return this.f154825c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154408b() {
        return this.f154824b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154826d) + com.avito.android.bxcontent.mvi.entity.f.b(this.f154825c, this.f154824b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchHeaderItem(stringId=");
        sb2.append(this.f154824b);
        sb2.append(", gridType=");
        sb2.append(this.f154825c);
        sb2.append(", count=");
        return r.t(sb2, this.f154826d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154824b);
        parcel.writeParcelable(this.f154825c, i12);
        parcel.writeInt(this.f154826d);
    }

    public /* synthetic */ SearchHeaderItem(String str, GridElementType gridElementType, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "search_header_item" : str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, i12);
    }
}
