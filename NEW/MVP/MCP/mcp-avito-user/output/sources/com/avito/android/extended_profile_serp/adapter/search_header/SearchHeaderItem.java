package com.avito.android.extended_profile_serp.adapter.search_header;

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

/* compiled from: SearchHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/search_header/SearchHeaderItem;", "Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpItem;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchHeaderItem implements ExtendedProfileSerpItem {

    @k
    public static final Parcelable.Creator<SearchHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152636b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152637c;

    /* renamed from: d, reason: collision with root package name */
    public final int f152638d;

    /* compiled from: SearchHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchHeaderItem createFromParcel(Parcel parcel) {
            return new SearchHeaderItem(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchHeaderItem[] newArray(int i12) {
            return new SearchHeaderItem[i12];
        }
    }

    public SearchHeaderItem(@k String str, int i12, int i13) {
        this.f152636b = str;
        this.f152637c = i12;
        this.f152638d = i13;
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
        return L.f(this.f152636b, searchHeaderItem.f152636b) && this.f152637c == searchHeaderItem.f152637c && this.f152638d == searchHeaderItem.f152638d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269901d() {
        return this.f152637c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152597b() {
        return this.f152636b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152638d) + r.e(this.f152637c, this.f152636b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchHeaderItem(stringId=");
        sb2.append(this.f152636b);
        sb2.append(", spanCount=");
        sb2.append(this.f152637c);
        sb2.append(", count=");
        return r.t(sb2, this.f152638d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152636b);
        parcel.writeInt(this.f152637c);
        parcel.writeInt(this.f152638d);
    }

    public /* synthetic */ SearchHeaderItem(String str, int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? "search_header_item" : str, i12, i13);
    }
}
