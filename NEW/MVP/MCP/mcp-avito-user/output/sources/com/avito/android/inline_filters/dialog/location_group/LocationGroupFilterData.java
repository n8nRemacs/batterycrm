package com.avito.android.inline_filters.dialog.location_group;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationGroupFilterData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/LocationGroupFilterData;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LocationGroupFilterData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<LocationGroupFilterData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Filter> f171692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<SearchFormWidgetSubmitParam> f171693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f171694d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f171695e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f171696f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f171697g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f171698h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f171699i;

    /* compiled from: LocationGroupFilterData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocationGroupFilterData> {
        @Override // android.os.Parcelable.Creator
        public final LocationGroupFilterData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(LocationGroupFilterData.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(LocationGroupFilterData.class, parcel, arrayList2, iL3, 1);
            }
            return new LocationGroupFilterData(arrayList, arrayList2, parcel.readString(), (DeepLink) parcel.readParcelable(LocationGroupFilterData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (DeepLink) parcel.readParcelable(LocationGroupFilterData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LocationGroupFilterData[] newArray(int i12) {
            return new LocationGroupFilterData[i12];
        }
    }

    public LocationGroupFilterData(@Y61.k List<Filter> list, @Y61.k List<SearchFormWidgetSubmitParam> list2, @Y61.k String str, @Y61.k DeepLink deepLink, @Y61.l Integer num, @Y61.l DeepLink deepLink2, @Y61.l String str2, boolean z12) {
        this.f171692b = list;
        this.f171693c = list2;
        this.f171694d = str;
        this.f171695e = deepLink;
        this.f171696f = num;
        this.f171697g = deepLink2;
        this.f171698h = str2;
        this.f171699i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationGroupFilterData)) {
            return false;
        }
        LocationGroupFilterData locationGroupFilterData = (LocationGroupFilterData) obj;
        return kotlin.jvm.internal.L.f(this.f171692b, locationGroupFilterData.f171692b) && kotlin.jvm.internal.L.f(this.f171693c, locationGroupFilterData.f171693c) && kotlin.jvm.internal.L.f(this.f171694d, locationGroupFilterData.f171694d) && kotlin.jvm.internal.L.f(this.f171695e, locationGroupFilterData.f171695e) && kotlin.jvm.internal.L.f(this.f171696f, locationGroupFilterData.f171696f) && kotlin.jvm.internal.L.f(this.f171697g, locationGroupFilterData.f171697g) && kotlin.jvm.internal.L.f(this.f171698h, locationGroupFilterData.f171698h) && this.f171699i == locationGroupFilterData.f171699i;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f171695e, androidx.compose.foundation.H.d(androidx.compose.foundation.H.e(this.f171692b.hashCode() * 31, 31, this.f171693c), 31, this.f171694d), 31);
        Integer num = this.f171696f;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f171697g;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f171698h;
        return Boolean.hashCode(this.f171699i) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationGroupFilterData(filters=");
        sb2.append(this.f171692b);
        sb2.append(", submitParams=");
        sb2.append(this.f171693c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f171694d);
        sb2.append(", buttonLink=");
        sb2.append(this.f171695e);
        sb2.append(", selectedFiltersCount=");
        sb2.append(this.f171696f);
        sb2.append(", updateLocationLink=");
        sb2.append(this.f171697g);
        sb2.append(", locationId=");
        sb2.append(this.f171698h);
        sb2.append(", locationChanged=");
        return androidx.appcompat.app.r.x(sb2, this.f171699i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f171692b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f171693c, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeString(this.f171694d);
        parcel.writeParcelable(this.f171695e, i12);
        Integer num = this.f171696f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.f171697g, i12);
        parcel.writeString(this.f171698h);
        parcel.writeInt(this.f171699i ? 1 : 0);
    }
}
