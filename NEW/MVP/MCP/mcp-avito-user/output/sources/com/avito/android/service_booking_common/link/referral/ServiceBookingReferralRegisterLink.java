package com.avito.android.service_booking_common.link.referral;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingReferralRegisterLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "refKey", "redirect", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "f", "()Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingReferralRegisterLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingReferralRegisterLink> CREATOR = new a();

    @com.google.gson.annotations.c("redirect")
    @k
    private final DeepLink redirect;

    @com.google.gson.annotations.c("refKey")
    @k
    private final String refKey;

    /* compiled from: ServiceBookingReferralRegisterLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingReferralRegisterLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingReferralRegisterLink createFromParcel(Parcel parcel) {
            return new ServiceBookingReferralRegisterLink(parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingReferralRegisterLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingReferralRegisterLink[] newArray(int i12) {
            return new ServiceBookingReferralRegisterLink[i12];
        }
    }

    /* compiled from: ServiceBookingReferralRegisterLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink$b;", "", "a", "Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink$b$a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingReferralRegisterLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink$b$a;", "LJu/c$a;", "Lcom/avito/android/service_booking_common/link/referral/ServiceBookingReferralRegisterLink$b;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f276654b = new a();
        }
    }

    public ServiceBookingReferralRegisterLink(@k String str, @k DeepLink deepLink) {
        this.refKey = str;
        this.redirect = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final DeepLink getRedirect() {
        return this.redirect;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getRefKey() {
        return this.refKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.refKey);
        parcel.writeParcelable(this.redirect, i12);
    }
}
