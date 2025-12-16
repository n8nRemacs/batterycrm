package com.avito.android.service_booking_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockActionData;", "Landroid/os/Parcelable;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockActionData implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingBlockActionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DeepLink f278189b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f278190c;

    /* compiled from: ServiceBookingBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingBlockActionData> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockActionData createFromParcel(Parcel parcel) {
            return new ServiceBookingBlockActionData((DeepLink) parcel.readParcelable(ServiceBookingBlockActionData.class.getClassLoader()), (AttributedText) parcel.readParcelable(ServiceBookingBlockActionData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockActionData[] newArray(int i12) {
            return new ServiceBookingBlockActionData[i12];
        }
    }

    public ServiceBookingBlockActionData(@l DeepLink deepLink, @k AttributedText attributedText) {
        this.f278189b = deepLink;
        this.f278190c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockActionData)) {
            return false;
        }
        ServiceBookingBlockActionData serviceBookingBlockActionData = (ServiceBookingBlockActionData) obj;
        return L.f(this.f278189b, serviceBookingBlockActionData.f278189b) && L.f(this.f278190c, serviceBookingBlockActionData.f278190c);
    }

    public final int hashCode() {
        DeepLink deepLink = this.f278189b;
        return this.f278190c.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingBlockActionData(deepLink=");
        sb2.append(this.f278189b);
        sb2.append(", value=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f278190c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f278189b, i12);
        parcel.writeParcelable(this.f278190c, i12);
    }
}
