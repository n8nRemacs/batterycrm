package com.avito.android.search.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.search.filter.FiltersInteractor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/FiltersOverrideParams;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FiltersOverrideParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FiltersOverrideParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f261860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f261861c;

    /* compiled from: FiltersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersOverrideParams> {
        @Override // android.os.Parcelable.Creator
        public final FiltersOverrideParams createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(FiltersInteractor.ParameterValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FiltersOverrideParams(arrayList, (DeepLink) parcel.readParcelable(FiltersOverrideParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersOverrideParams[] newArray(int i12) {
            return new FiltersOverrideParams[i12];
        }
    }

    public FiltersOverrideParams(@Y61.k ArrayList arrayList, @Y61.l DeepLink deepLink) {
        this.f261860b = arrayList;
        this.f261861c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersOverrideParams)) {
            return false;
        }
        FiltersOverrideParams filtersOverrideParams = (FiltersOverrideParams) obj;
        return this.f261860b.equals(filtersOverrideParams.f261860b) && kotlin.jvm.internal.L.f(this.f261861c, filtersOverrideParams.f261861c);
    }

    public final int hashCode() {
        int iHashCode = this.f261860b.hashCode() * 31;
        DeepLink deepLink = this.f261861c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersOverrideParams(params=");
        sb2.append(this.f261860b);
        sb2.append(", onLoaded=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f261861c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f261860b, parcel);
        while (itZ.hasNext()) {
            ((FiltersInteractor.ParameterValue) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f261861c, i12);
    }
}
