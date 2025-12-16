package com.avito.android.service_booking.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ServiceBooking.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/service_booking/remote/model/ServiceBookingTooltip;", "Landroid/os/Parcelable;", "", "title", "body", "key", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "c", "e", "d", "_avito_service-booking-utils_remote"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingTooltip implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingTooltip> CREATOR = new a();

    @c("body")
    @l
    private final String body;

    @c("buttonText")
    @l
    private final String buttonText;

    @c("key")
    @l
    private final String key;

    @c("title")
    @l
    private final String title;

    /* compiled from: ServiceBooking.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingTooltip> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingTooltip createFromParcel(Parcel parcel) {
            return new ServiceBookingTooltip(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingTooltip[] newArray(int i12) {
            return new ServiceBookingTooltip[i12];
        }
    }

    public ServiceBookingTooltip(@l String str, @l String str2, @l String str3, @l String str4) {
        this.title = str;
        this.body = str2;
        this.key = str3;
        this.buttonText = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.key);
        parcel.writeString(this.buttonText);
    }
}
