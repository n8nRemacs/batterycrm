package com.avito.android.extended_profile_selection_create.select.adapter.search_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/search_button/SearchButtonItem;", "Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateItem;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchButtonItem implements ExtendedProfileSelectionCreateItem {

    @k
    public static final Parcelable.Creator<SearchButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152064b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f152065c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f152066d;

    /* compiled from: SearchButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchButtonItem createFromParcel(Parcel parcel) {
            return new SearchButtonItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchButtonItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchButtonItem[] newArray(int i12) {
            return new SearchButtonItem[i12];
        }
    }

    public SearchButtonItem(@k String str, @k GridElementType gridElementType, boolean z12) {
        this.f152064b = str;
        this.f152065c = gridElementType;
        this.f152066d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchButtonItem)) {
            return false;
        }
        SearchButtonItem searchButtonItem = (SearchButtonItem) obj;
        return L.f(this.f152064b, searchButtonItem.f152064b) && L.f(this.f152065c, searchButtonItem.f152065c) && this.f152066d == searchButtonItem.f152066d;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF152065c() {
        return this.f152065c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152064b() {
        return this.f152064b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152066d) + com.avito.android.bxcontent.mvi.entity.f.b(this.f152065c, this.f152064b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchButtonItem(stringId=");
        sb2.append(this.f152064b);
        sb2.append(", gridType=");
        sb2.append(this.f152065c);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f152066d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152064b);
        parcel.writeParcelable(this.f152065c, i12);
        parcel.writeInt(this.f152066d ? 1 : 0);
    }

    public /* synthetic */ SearchButtonItem(String str, GridElementType gridElementType, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_button_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, z12);
    }
}
