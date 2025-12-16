package com.avito.android.extended_profile_serp.adapter.search_active_empty;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchActiveEmptyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/search_active_empty/SearchActiveEmptyItem;", "Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpItem;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchActiveEmptyItem implements ExtendedProfileSerpItem {

    @k
    public static final Parcelable.Creator<SearchActiveEmptyItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152604b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152605c;

    /* compiled from: SearchActiveEmptyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchActiveEmptyItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchActiveEmptyItem createFromParcel(Parcel parcel) {
            return new SearchActiveEmptyItem(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchActiveEmptyItem[] newArray(int i12) {
            return new SearchActiveEmptyItem[i12];
        }
    }

    public SearchActiveEmptyItem(@k String str, int i12) {
        this.f152604b = str;
        this.f152605c = i12;
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
        return L.f(this.f152604b, searchActiveEmptyItem.f152604b) && this.f152605c == searchActiveEmptyItem.f152605c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269901d() {
        return this.f152605c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF148522b() {
        return this.f152604b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152605c) + (this.f152604b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchActiveEmptyItem(stringId=");
        sb2.append(this.f152604b);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f152605c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152604b);
        parcel.writeInt(this.f152605c);
    }

    public /* synthetic */ SearchActiveEmptyItem(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "search_empty_active_item" : str, i12);
    }
}
