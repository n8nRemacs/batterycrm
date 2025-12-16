package com.avito.android.extended_profile_widgets.adapter.search.search_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_button/SearchButtonItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchButtonItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154763c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f154764d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f154765e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ExtendedProfileSearchTabType f154766f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f154767g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f154768h;

    /* compiled from: SearchButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchButtonItem createFromParcel(Parcel parcel) {
            return new SearchButtonItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchButtonItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, ExtendedProfileSearchTabType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(SearchButtonItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchButtonItem[] newArray(int i12) {
            return new SearchButtonItem[i12];
        }
    }

    public SearchButtonItem() {
        this(null, null, null, false, null, null, false, 127, null);
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
        return L.f(this.f154762b, searchButtonItem.f154762b) && L.f(this.f154763c, searchButtonItem.f154763c) && L.f(this.f154764d, searchButtonItem.f154764d) && this.f154765e == searchButtonItem.f154765e && this.f154766f == searchButtonItem.f154766f && L.f(this.f154767g, searchButtonItem.f154767g) && this.f154768h == searchButtonItem.f154768h;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154834c() {
        return this.f154763c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80343f() {
        return this.f154762b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154763c, this.f154762b.hashCode() * 31, 31);
        String str = this.f154764d;
        int iHashCode = (this.f154766f.hashCode() + r.i((iB2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154765e)) * 31;
        DeepLink deepLink = this.f154767g;
        return Boolean.hashCode(this.f154768h) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchButtonItem(stringId=");
        sb2.append(this.f154762b);
        sb2.append(", gridType=");
        sb2.append(this.f154763c);
        sb2.append(", title=");
        sb2.append(this.f154764d);
        sb2.append(", isLoading=");
        sb2.append(this.f154765e);
        sb2.append(", tab=");
        sb2.append(this.f154766f);
        sb2.append(", searchPageDeeplink=");
        sb2.append(this.f154767g);
        sb2.append(", isFullWidthButton=");
        return r.x(sb2, this.f154768h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154762b);
        parcel.writeParcelable(this.f154763c, i12);
        parcel.writeString(this.f154764d);
        parcel.writeInt(this.f154765e ? 1 : 0);
        parcel.writeString(this.f154766f.name());
        parcel.writeParcelable(this.f154767g, i12);
        parcel.writeInt(this.f154768h ? 1 : 0);
    }

    public SearchButtonItem(@k String str, @k GridElementType gridElementType, @l String str2, boolean z12, @k ExtendedProfileSearchTabType extendedProfileSearchTabType, @l DeepLink deepLink, boolean z13) {
        this.f154762b = str;
        this.f154763c = gridElementType;
        this.f154764d = str2;
        this.f154765e = z12;
        this.f154766f = extendedProfileSearchTabType;
        this.f154767g = deepLink;
        this.f154768h = z13;
    }

    public /* synthetic */ SearchButtonItem(String str, GridElementType gridElementType, String str2, boolean z12, ExtendedProfileSearchTabType extendedProfileSearchTabType, DeepLink deepLink, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_button" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? ExtendedProfileSearchTabType.f154620c : extendedProfileSearchTabType, (i12 & 32) == 0 ? deepLink : null, (i12 & 64) != 0 ? false : z13);
    }
}
