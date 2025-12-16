package com.avito.android.search.filter.location_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.FiltersMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Arguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/Arguments;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Arguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Arguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParams f263428b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ParameterSlot> f263429c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FiltersMode f263430d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f263431e;

    /* compiled from: Arguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Arguments> {
        @Override // android.os.Parcelable.Creator
        public final Arguments createFromParcel(Parcel parcel) {
            SearchParams searchParams = (SearchParams) parcel.readParcelable(Arguments.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(Arguments.class, parcel, arrayList, iL2, 1);
            }
            return new Arguments(searchParams, arrayList, (FiltersMode) parcel.readParcelable(Arguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Arguments[] newArray(int i12) {
            return new Arguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Arguments(@Y61.k SearchParams searchParams, @Y61.k List<? extends ParameterSlot> list, @Y61.k FiltersMode filtersMode, @Y61.l String str) {
        this.f263428b = searchParams;
        this.f263429c = list;
        this.f263430d = filtersMode;
        this.f263431e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Arguments)) {
            return false;
        }
        Arguments arguments = (Arguments) obj;
        return L.f(this.f263428b, arguments.f263428b) && L.f(this.f263429c, arguments.f263429c) && L.f(this.f263430d, arguments.f263430d) && L.f(this.f263431e, arguments.f263431e);
    }

    public final int hashCode() {
        int iHashCode = (this.f263430d.hashCode() + H.e(this.f263428b.hashCode() * 31, 31, this.f263429c)) * 31;
        String str = this.f263431e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arguments(searchParams=");
        sb2.append(this.f263428b);
        sb2.append(", initialParameters=");
        sb2.append(this.f263429c);
        sb2.append(", mode=");
        sb2.append(this.f263430d);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f263431e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f263428b, i12);
        Iterator itJ = C0.j(this.f263429c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f263430d, i12);
        parcel.writeString(this.f263431e);
    }
}
