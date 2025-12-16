package com.avito.android.search.filter.location_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResultArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/ResultArguments;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResultArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ResultArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SearchParams f263457b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ParametersTreeWithAdditional f263458c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f263459d;

    /* compiled from: ResultArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ResultArguments> {
        @Override // android.os.Parcelable.Creator
        public final ResultArguments createFromParcel(Parcel parcel) {
            return new ResultArguments((SearchParams) parcel.readParcelable(ResultArguments.class.getClassLoader()), (ParametersTreeWithAdditional) parcel.readParcelable(ResultArguments.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultArguments[] newArray(int i12) {
            return new ResultArguments[i12];
        }
    }

    public ResultArguments(@Y61.l SearchParams searchParams, @Y61.l ParametersTreeWithAdditional parametersTreeWithAdditional, boolean z12) {
        this.f263457b = searchParams;
        this.f263458c = parametersTreeWithAdditional;
        this.f263459d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultArguments)) {
            return false;
        }
        ResultArguments resultArguments = (ResultArguments) obj;
        return L.f(this.f263457b, resultArguments.f263457b) && L.f(this.f263458c, resultArguments.f263458c) && this.f263459d == resultArguments.f263459d;
    }

    public final int hashCode() {
        SearchParams searchParams = this.f263457b;
        int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263458c;
        return Boolean.hashCode(this.f263459d) + ((iHashCode + (parametersTreeWithAdditional != null ? parametersTreeWithAdditional.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultArguments(searchParams=");
        sb2.append(this.f263457b);
        sb2.append(", resultTree=");
        sb2.append(this.f263458c);
        sb2.append(", resetAreaOnChange=");
        return androidx.appcompat.app.r.x(sb2, this.f263459d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f263457b, i12);
        parcel.writeParcelable(this.f263458c, i12);
        parcel.writeInt(this.f263459d ? 1 : 0);
    }
}
