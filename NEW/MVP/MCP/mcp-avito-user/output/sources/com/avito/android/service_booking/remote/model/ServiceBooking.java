package com.avito.android.service_booking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ServiceBooking.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/service_booking/remote/model/ServiceBooking;", "Landroid/os/Parcelable;", "Lcom/avito/android/service_booking/remote/model/ServiceBookingAction;", "action", "", "description", "Lcom/avito/android/service_booking/remote/model/ServiceBookingTooltip;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Lcom/avito/android/service_booking/remote/model/ServiceBookingAction;Ljava/lang/String;Lcom/avito/android/service_booking/remote/model/ServiceBookingTooltip;)V", "Lcom/avito/android/service_booking/remote/model/ServiceBookingAction;", "c", "()Lcom/avito/android/service_booking/remote/model/ServiceBookingAction;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Lcom/avito/android/service_booking/remote/model/ServiceBookingTooltip;", "d", "()Lcom/avito/android/service_booking/remote/model/ServiceBookingTooltip;", "_avito_service-booking-utils_remote"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBooking implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBooking> CREATOR = new a();

    @c("action")
    @k
    private final ServiceBookingAction action;

    @c("description")
    @l
    private final String description;

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final ServiceBookingTooltip tooltip;

    /* compiled from: ServiceBooking.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBooking> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBooking createFromParcel(Parcel parcel) {
            return new ServiceBooking(ServiceBookingAction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ServiceBookingTooltip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBooking[] newArray(int i12) {
            return new ServiceBooking[i12];
        }
    }

    public ServiceBooking(@k ServiceBookingAction serviceBookingAction, @l String str, @l ServiceBookingTooltip serviceBookingTooltip) {
        this.action = serviceBookingAction;
        this.description = str;
        this.tooltip = serviceBookingTooltip;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ServiceBookingAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ServiceBookingTooltip getTooltip() {
        return this.tooltip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.action.writeToParcel(parcel, i12);
        parcel.writeString(this.description);
        ServiceBookingTooltip serviceBookingTooltip = this.tooltip;
        if (serviceBookingTooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingTooltip.writeToParcel(parcel, i12);
        }
    }
}
