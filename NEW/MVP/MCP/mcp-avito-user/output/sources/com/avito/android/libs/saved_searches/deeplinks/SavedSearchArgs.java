package com.avito.android.libs.saved_searches.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchLink.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/libs/saved_searches/deeplinks/SavedSearchArgs;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavedSearchArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedSearchArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f181430b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f181431c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f181432d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Area f181433e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f181434f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PresentationType f181435g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f181436h;

    /* compiled from: SavedSearchLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchArgs> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchArgs createFromParcel(Parcel parcel) {
            SearchParams searchParams = (SearchParams) parcel.readParcelable(SavedSearchArgs.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new SavedSearchArgs(parcel.readInt() == 0 ? null : PresentationType.valueOf(parcel.readString()), searchParams, (Area) parcel.readParcelable(SavedSearchArgs.class.getClassLoader()), string, string2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchArgs[] newArray(int i12) {
            return new SavedSearchArgs[i12];
        }
    }

    public SavedSearchArgs(@l PresentationType presentationType, @k SearchParams searchParams, @l Area area, @l String str, @k String str2, @l String str3, @l String str4) {
        this.f181430b = searchParams;
        this.f181431c = str;
        this.f181432d = str2;
        this.f181433e = area;
        this.f181434f = str3;
        this.f181435g = presentationType;
        this.f181436h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchArgs)) {
            return false;
        }
        SavedSearchArgs savedSearchArgs = (SavedSearchArgs) obj;
        return L.f(this.f181430b, savedSearchArgs.f181430b) && L.f(this.f181431c, savedSearchArgs.f181431c) && L.f(this.f181432d, savedSearchArgs.f181432d) && L.f(this.f181433e, savedSearchArgs.f181433e) && L.f(this.f181434f, savedSearchArgs.f181434f) && this.f181435g == savedSearchArgs.f181435g && L.f(this.f181436h, savedSearchArgs.f181436h);
    }

    public final int hashCode() {
        int iHashCode = this.f181430b.hashCode() * 31;
        String str = this.f181431c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f181432d);
        Area area = this.f181433e;
        int iHashCode2 = (iD2 + (area == null ? 0 : area.hashCode())) * 31;
        String str2 = this.f181434f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentationType presentationType = this.f181435g;
        int iHashCode4 = (iHashCode3 + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
        String str3 = this.f181436h;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchArgs(searchParams=");
        sb2.append(this.f181430b);
        sb2.append(", categoryId=");
        sb2.append(this.f181431c);
        sb2.append(", fromSource=");
        sb2.append(this.f181432d);
        sb2.append(", searchArea=");
        sb2.append(this.f181433e);
        sb2.append(", xHash=");
        sb2.append(this.f181434f);
        sb2.append(", presentationType=");
        sb2.append(this.f181435g);
        sb2.append(", entryPoint=");
        return C22026a.c(sb2, this.f181436h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f181430b, i12);
        parcel.writeString(this.f181431c);
        parcel.writeString(this.f181432d);
        parcel.writeParcelable(this.f181433e, i12);
        parcel.writeString(this.f181434f);
        PresentationType presentationType = this.f181435g;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
        parcel.writeString(this.f181436h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedSearchArgs(SearchParams searchParams, String str, String str2, Area area, String str3, PresentationType presentationType, String str4, int i12, C42822w c42822w) {
        SearchParams searchParams2 = (i12 & 1) != 0 ? new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null) : searchParams;
        String categoryId = (i12 & 2) != 0 ? searchParams2.getCategoryId() : str;
        this((i12 & 32) != 0 ? null : presentationType, searchParams2, (i12 & 8) != 0 ? null : area, categoryId, str2, (i12 & 16) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4);
    }
}
