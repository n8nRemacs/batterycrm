package com.avito.android.travel_search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.travel_search.deeplink.TravelSearchLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/TravelSearchOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelSearchOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<TravelSearchOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f302764b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TravelSearchLink.TravelSearchFlow f302765c;

    /* compiled from: TravelSearchOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelSearchOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final TravelSearchOpenParams createFromParcel(Parcel parcel) {
            return new TravelSearchOpenParams((SearchParams) parcel.readParcelable(TravelSearchOpenParams.class.getClassLoader()), TravelSearchLink.TravelSearchFlow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TravelSearchOpenParams[] newArray(int i12) {
            return new TravelSearchOpenParams[i12];
        }
    }

    public TravelSearchOpenParams(@k SearchParams searchParams, @k TravelSearchLink.TravelSearchFlow travelSearchFlow) {
        this.f302764b = searchParams;
        this.f302765c = travelSearchFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelSearchOpenParams)) {
            return false;
        }
        TravelSearchOpenParams travelSearchOpenParams = (TravelSearchOpenParams) obj;
        return L.f(this.f302764b, travelSearchOpenParams.f302764b) && this.f302765c == travelSearchOpenParams.f302765c;
    }

    public final int hashCode() {
        return this.f302765c.hashCode() + (this.f302764b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "TravelSearchOpenParams(searchParams=" + this.f302764b + ", flow=" + this.f302765c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f302764b, i12);
        parcel.writeString(this.f302765c.name());
    }
}
