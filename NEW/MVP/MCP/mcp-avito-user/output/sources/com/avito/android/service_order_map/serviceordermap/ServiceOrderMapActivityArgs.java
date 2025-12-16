package com.avito.android.service_order_map.serviceordermap;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderMapActivityArgs.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapActivityArgs;", "Landroid/os/Parcelable;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrderMapActivityArgs implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f278610b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f278611c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Double f278612d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Double f278613e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f278608f = new a(null);

    @Y61.k
    public static final Parcelable.Creator<ServiceOrderMapActivityArgs> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final ServiceOrderMapActivityArgs f278609g = new ServiceOrderMapActivityArgs(null, null, null, null);

    /* compiled from: ServiceOrderMapActivityArgs.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/ServiceOrderMapActivityArgs$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrderMapActivityArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ServiceOrderMapActivityArgs> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapActivityArgs createFromParcel(Parcel parcel) {
            return new ServiceOrderMapActivityArgs(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrderMapActivityArgs[] newArray(int i12) {
            return new ServiceOrderMapActivityArgs[i12];
        }
    }

    public ServiceOrderMapActivityArgs(@Y61.l Double d12, @Y61.l Double d13, @Y61.l String str, @Y61.l String str2) {
        this.f278610b = str;
        this.f278611c = str2;
        this.f278612d = d12;
        this.f278613e = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrderMapActivityArgs)) {
            return false;
        }
        ServiceOrderMapActivityArgs serviceOrderMapActivityArgs = (ServiceOrderMapActivityArgs) obj;
        return L.f(this.f278610b, serviceOrderMapActivityArgs.f278610b) && L.f(this.f278611c, serviceOrderMapActivityArgs.f278611c) && L.f(this.f278612d, serviceOrderMapActivityArgs.f278612d) && L.f(this.f278613e, serviceOrderMapActivityArgs.f278613e);
    }

    public final int hashCode() {
        String str = this.f278610b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f278611c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d12 = this.f278612d;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f278613e;
        return iHashCode3 + (d13 != null ? d13.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrderMapActivityArgs(title=");
        sb2.append(this.f278610b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f278611c);
        sb2.append(", lat=");
        sb2.append(this.f278612d);
        sb2.append(", lng=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f278613e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f278610b);
        parcel.writeString(this.f278611c);
        Double d12 = this.f278612d;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.f278613e;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
