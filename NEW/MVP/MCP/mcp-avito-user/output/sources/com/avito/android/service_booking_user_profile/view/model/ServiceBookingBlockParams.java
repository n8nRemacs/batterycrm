package com.avito.android.service_booking_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/model/ServiceBookingBlockParams;", "Landroid/os/Parcelable;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockParams implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingBlockParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f278204b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f278205c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f278206d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f278207e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f278208f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ServiceBookingBlockIcon f278209g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ServiceBookingBlockActionData f278210h;

    /* compiled from: ServiceBookingBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingBlockParams> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockParams createFromParcel(Parcel parcel) {
            return new ServiceBookingBlockParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ServiceBookingBlockIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ServiceBookingBlockActionData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingBlockParams[] newArray(int i12) {
            return new ServiceBookingBlockParams[i12];
        }
    }

    public ServiceBookingBlockParams(@l String str, @l String str2, @k String str3, @l String str4, @l String str5, @l ServiceBookingBlockIcon serviceBookingBlockIcon, @l ServiceBookingBlockActionData serviceBookingBlockActionData) {
        this.f278204b = str;
        this.f278205c = str2;
        this.f278206d = str3;
        this.f278207e = str4;
        this.f278208f = str5;
        this.f278209g = serviceBookingBlockIcon;
        this.f278210h = serviceBookingBlockActionData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockParams)) {
            return false;
        }
        ServiceBookingBlockParams serviceBookingBlockParams = (ServiceBookingBlockParams) obj;
        return L.f(this.f278204b, serviceBookingBlockParams.f278204b) && L.f(this.f278205c, serviceBookingBlockParams.f278205c) && L.f(this.f278206d, serviceBookingBlockParams.f278206d) && L.f(this.f278207e, serviceBookingBlockParams.f278207e) && L.f(this.f278208f, serviceBookingBlockParams.f278208f) && L.f(this.f278209g, serviceBookingBlockParams.f278209g) && L.f(this.f278210h, serviceBookingBlockParams.f278210h);
    }

    public final int hashCode() {
        String str = this.f278204b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f278205c;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f278206d);
        String str3 = this.f278207e;
        int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f278208f;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ServiceBookingBlockIcon serviceBookingBlockIcon = this.f278209g;
        int iHashCode4 = (iHashCode3 + (serviceBookingBlockIcon == null ? 0 : serviceBookingBlockIcon.hashCode())) * 31;
        ServiceBookingBlockActionData serviceBookingBlockActionData = this.f278210h;
        return iHashCode4 + (serviceBookingBlockActionData != null ? serviceBookingBlockActionData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ServiceBookingBlockParams(fromPage=" + this.f278204b + ", blockId=" + this.f278205c + ", title=" + this.f278206d + ", badgeText=" + this.f278207e + ", badgeKey=" + this.f278208f + ", icon=" + this.f278209g + ", action=" + this.f278210h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278204b);
        parcel.writeString(this.f278205c);
        parcel.writeString(this.f278206d);
        parcel.writeString(this.f278207e);
        parcel.writeString(this.f278208f);
        ServiceBookingBlockIcon serviceBookingBlockIcon = this.f278209g;
        if (serviceBookingBlockIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingBlockIcon.writeToParcel(parcel, i12);
        }
        ServiceBookingBlockActionData serviceBookingBlockActionData = this.f278210h;
        if (serviceBookingBlockActionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingBlockActionData.writeToParcel(parcel, i12);
        }
    }
}
