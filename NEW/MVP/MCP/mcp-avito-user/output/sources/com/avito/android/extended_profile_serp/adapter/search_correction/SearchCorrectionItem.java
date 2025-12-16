package com.avito.android.extended_profile_serp.adapter.search_correction;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchCorrectionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/adapter/search_correction/SearchCorrectionItem;", "Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpItem;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchCorrectionItem implements ExtendedProfileSerpItem {

    @k
    public static final Parcelable.Creator<SearchCorrectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152612c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f152613d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f152614e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f152615f;

    /* compiled from: SearchCorrectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchCorrectionItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchCorrectionItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            return new SearchCorrectionItem(string, parcel.readString(), (DeepLink) parcel.readParcelable(SearchCorrectionItem.class.getClassLoader()), i12, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchCorrectionItem[] newArray(int i12) {
            return new SearchCorrectionItem[i12];
        }
    }

    public SearchCorrectionItem(@k String str, @k String str2, @l DeepLink deepLink, int i12, @l String str3) {
        this.f152611b = str;
        this.f152612c = i12;
        this.f152613d = str2;
        this.f152614e = str3;
        this.f152615f = deepLink;
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
        return L.f(this.f152611b, searchCorrectionItem.f152611b) && this.f152612c == searchCorrectionItem.f152612c && L.f(this.f152613d, searchCorrectionItem.f152613d) && L.f(this.f152614e, searchCorrectionItem.f152614e) && L.f(this.f152615f, searchCorrectionItem.f152615f);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270105i() {
        return this.f152612c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96755b() {
        return this.f152611b;
    }

    public final int hashCode() {
        int iD2 = H.d(r.e(this.f152612c, this.f152611b.hashCode() * 31, 31), 31, this.f152613d);
        String str = this.f152614e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f152615f;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchCorrectionItem(stringId=");
        sb2.append(this.f152611b);
        sb2.append(", spanCount=");
        sb2.append(this.f152612c);
        sb2.append(", title=");
        sb2.append(this.f152613d);
        sb2.append(", actionTitle=");
        sb2.append(this.f152614e);
        sb2.append(", actionDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f152615f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152611b);
        parcel.writeInt(this.f152612c);
        parcel.writeString(this.f152613d);
        parcel.writeString(this.f152614e);
        parcel.writeParcelable(this.f152615f, i12);
    }

    public /* synthetic */ SearchCorrectionItem(String str, int i12, String str2, String str3, DeepLink deepLink, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "search_correction_item" : str, str2, deepLink, i12, str3);
    }
}
