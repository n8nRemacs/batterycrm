package com.avito.android.developments_agency_search.screen.deal_cabinet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealCabinetArguments.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/DealCabinetArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DealCabinetArguments implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<DealCabinetArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f136756b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f136757c;

    /* compiled from: DealCabinetArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DealCabinetArguments> {
        @Override // android.os.Parcelable.Creator
        public final DealCabinetArguments createFromParcel(Parcel parcel) {
            return new DealCabinetArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DealCabinetArguments[] newArray(int i12) {
            return new DealCabinetArguments[i12];
        }
    }

    public DealCabinetArguments(@Y61.k String str, @Y61.l String str2) {
        this.f136756b = str;
        this.f136757c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DealCabinetArguments)) {
            return false;
        }
        DealCabinetArguments dealCabinetArguments = (DealCabinetArguments) obj;
        return L.f(this.f136756b, dealCabinetArguments.f136756b) && L.f(this.f136757c, dealCabinetArguments.f136757c);
    }

    public final int hashCode() {
        int iHashCode = this.f136756b.hashCode() * 31;
        String str = this.f136757c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DealCabinetArguments(parentScreenId=");
        sb2.append(this.f136756b);
        sb2.append(", locationId=");
        return C22026a.c(sb2, this.f136757c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f136756b);
        parcel.writeString(this.f136757c);
    }
}
