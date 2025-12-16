package com.avito.android.extended_profile_widgets.adapter.search.search_correction;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchCorrectionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_correction/SearchCorrectionItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchCorrectionItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchCorrectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154783b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154784c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154785d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f154786e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f154787f;

    /* compiled from: SearchCorrectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchCorrectionItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchCorrectionItem createFromParcel(Parcel parcel) {
            return new SearchCorrectionItem(parcel.readString(), (GridElementType) parcel.readParcelable(SearchCorrectionItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SearchCorrectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SearchCorrectionItem[] newArray(int i12) {
            return new SearchCorrectionItem[i12];
        }
    }

    public SearchCorrectionItem(@k String str, @k GridElementType gridElementType, @k String str2, @l String str3, @l DeepLink deepLink) {
        this.f154783b = str;
        this.f154784c = gridElementType;
        this.f154785d = str2;
        this.f154786e = str3;
        this.f154787f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCorrectionItem)) {
            return false;
        }
        SearchCorrectionItem searchCorrectionItem = (SearchCorrectionItem) obj;
        return L.f(this.f154783b, searchCorrectionItem.f154783b) && L.f(this.f154784c, searchCorrectionItem.f154784c) && L.f(this.f154785d, searchCorrectionItem.f154785d) && L.f(this.f154786e, searchCorrectionItem.f154786e) && L.f(this.f154787f, searchCorrectionItem.f154787f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154528c() {
        return this.f154784c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF92545b() {
        return this.f154783b;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154784c, this.f154783b.hashCode() * 31, 31), 31, this.f154785d);
        String str = this.f154786e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f154787f;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchCorrectionItem(stringId=");
        sb2.append(this.f154783b);
        sb2.append(", gridType=");
        sb2.append(this.f154784c);
        sb2.append(", title=");
        sb2.append(this.f154785d);
        sb2.append(", actionTitle=");
        sb2.append(this.f154786e);
        sb2.append(", actionDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f154787f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154783b);
        parcel.writeParcelable(this.f154784c, i12);
        parcel.writeString(this.f154785d);
        parcel.writeString(this.f154786e);
        parcel.writeParcelable(this.f154787f, i12);
    }

    public /* synthetic */ SearchCorrectionItem(String str, GridElementType gridElementType, String str2, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "search_correction_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, str3, deepLink);
    }
}
