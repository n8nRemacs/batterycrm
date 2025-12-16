package com.avito.android.service_booking_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockIcon;", "Landroid/os/Parcelable;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingBlockIcon> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278202b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f278203c;

    /* compiled from: ServiceBookingBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingBlockIcon> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockIcon createFromParcel(Parcel parcel) {
            return new ServiceBookingBlockIcon(parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingBlockIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockIcon[] newArray(int i12) {
            return new ServiceBookingBlockIcon[i12];
        }
    }

    public ServiceBookingBlockIcon(@k String str, @l DeepLink deepLink) {
        this.f278202b = str;
        this.f278203c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockIcon)) {
            return false;
        }
        ServiceBookingBlockIcon serviceBookingBlockIcon = (ServiceBookingBlockIcon) obj;
        return L.f(this.f278202b, serviceBookingBlockIcon.f278202b) && L.f(this.f278203c, serviceBookingBlockIcon.f278203c);
    }

    public final int hashCode() {
        int iHashCode = this.f278202b.hashCode() * 31;
        DeepLink deepLink = this.f278203c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingBlockIcon(name=");
        sb2.append(this.f278202b);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f278203c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278202b);
        parcel.writeParcelable(this.f278203c, i12);
    }
}
