package com.avito.android.extended_profile_selection_create.select.adapter.search_empty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/search_empty/SearchEmptyItem;", "Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateItem;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchEmptyItem implements ExtendedProfileSelectionCreateItem {

    @k
    public static final Parcelable.Creator<SearchEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f152093c;

    /* compiled from: SearchEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchEmptyItem createFromParcel(Parcel parcel) {
            return new SearchEmptyItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchEmptyItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchEmptyItem[] newArray(int i12) {
            return new SearchEmptyItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchEmptyItem() {
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
        if (!(obj instanceof SearchEmptyItem)) {
            return false;
        }
        SearchEmptyItem searchEmptyItem = (SearchEmptyItem) obj;
        return L.f(this.f152092b, searchEmptyItem.f152092b) && L.f(this.f152093c, searchEmptyItem.f152093c);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF152037c() {
        return this.f152093c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152036b() {
        return this.f152092b;
    }

    public final int hashCode() {
        return this.f152093c.hashCode() + (this.f152092b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "SearchEmptyItem(stringId=" + this.f152092b + ", gridType=" + this.f152093c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152092b);
        parcel.writeParcelable(this.f152093c, i12);
    }

    public SearchEmptyItem(@k String str, @k GridElementType gridElementType) {
        this.f152092b = str;
        this.f152093c = gridElementType;
    }

    public /* synthetic */ SearchEmptyItem(String str, GridElementType gridElementType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_empty_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType);
    }
}
