package com.avito.android.select.new_districts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_districts/SelectDistrictParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectDistrictParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SelectDistrictParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f265687b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DistrictsWithRegions f265688c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ParcelableEntity<String>> f265689d;

    /* compiled from: SelectDistrictParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DistrictsWithRegions districtsWithRegions = (DistrictsWithRegions) parcel.readParcelable(SelectDistrictParams.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectDistrictParams.class, parcel, arrayList, iL2, 1);
            }
            return new SelectDistrictParams(districtsWithRegions, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictParams[] newArray(int i12) {
            return new SelectDistrictParams[i12];
        }
    }

    public SelectDistrictParams(@k DistrictsWithRegions districtsWithRegions, @k String str, @k List list) {
        this.f265687b = str;
        this.f265688c = districtsWithRegions;
        this.f265689d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDistrictParams)) {
            return false;
        }
        SelectDistrictParams selectDistrictParams = (SelectDistrictParams) obj;
        return L.f(this.f265687b, selectDistrictParams.f265687b) && L.f(this.f265688c, selectDistrictParams.f265688c) && L.f(this.f265689d, selectDistrictParams.f265689d);
    }

    public final int hashCode() {
        return this.f265689d.hashCode() + ((this.f265688c.hashCode() + (this.f265687b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDistrictParams(requestId=");
        sb2.append(this.f265687b);
        sb2.append(", districtInfo=");
        sb2.append(this.f265688c);
        sb2.append(", selectedValues=");
        return H.p(sb2, this.f265689d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f265687b);
        parcel.writeParcelable(this.f265688c, i12);
        Iterator itJ = C0.j(this.f265689d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
