package com.avito.android.advert_core.service_education;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceEducationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/service_education/ServiceEducationValue;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServiceEducationValue implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<ServiceEducationValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f84301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f84302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f84303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84304e;

    /* compiled from: ServiceEducationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceEducationValue> {
        @Override // android.os.Parcelable.Creator
        public final ServiceEducationValue createFromParcel(Parcel parcel) {
            return new ServiceEducationValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceEducationValue[] newArray(int i12) {
            return new ServiceEducationValue[i12];
        }
    }

    public ServiceEducationValue(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, int i12) {
        this.f84301b = str;
        this.f84302c = str2;
        this.f84303d = str3;
        this.f84304e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceEducationValue)) {
            return false;
        }
        ServiceEducationValue serviceEducationValue = (ServiceEducationValue) obj;
        return L.f(this.f84301b, serviceEducationValue.f84301b) && L.f(this.f84302c, serviceEducationValue.f84302c) && L.f(this.f84303d, serviceEducationValue.f84303d) && this.f84304e == serviceEducationValue.f84304e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82737f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84135b() {
        return this.f84301b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84304e) + H.d(H.d(this.f84301b.hashCode() * 31, 31, this.f84302c), 31, this.f84303d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceEducationValue(stringId=");
        sb2.append(this.f84301b);
        sb2.append(", institution=");
        sb2.append(this.f84302c);
        sb2.append(", speciality=");
        sb2.append(this.f84303d);
        sb2.append(", year=");
        return r.t(sb2, this.f84304e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f84301b);
        parcel.writeString(this.f84302c);
        parcel.writeString(this.f84303d);
        parcel.writeInt(this.f84304e);
    }
}
