package com.avito.android.service_orders;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/ServiceOrdersArguments;", "Landroid/os/Parcelable;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrdersArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceOrdersArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f279051b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f279052c;

    /* compiled from: ServiceOrdersArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceOrdersArguments> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrdersArguments createFromParcel(Parcel parcel) {
            return new ServiceOrdersArguments(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrdersArguments[] newArray(int i12) {
            return new ServiceOrdersArguments[i12];
        }
    }

    public ServiceOrdersArguments(boolean z12, @l String str) {
        this.f279051b = z12;
        this.f279052c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrdersArguments)) {
            return false;
        }
        ServiceOrdersArguments serviceOrdersArguments = (ServiceOrdersArguments) obj;
        return this.f279051b == serviceOrdersArguments.f279051b && L.f(this.f279052c, serviceOrdersArguments.f279052c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f279051b) * 31;
        String str = this.f279052c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceOrdersArguments(shouldOpenScheduleSelection=");
        sb2.append(this.f279051b);
        sb2.append(", flow=");
        return C22026a.c(sb2, this.f279052c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f279051b ? 1 : 0);
        parcel.writeString(this.f279052c);
    }
}
