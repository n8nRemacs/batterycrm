package com.avito.android.service_booking.deeplinks.verify_phone;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingVerifyPhoneLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "advertId", "mcId", SearchParamsConverterKt.LOCATION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAdvertId", "()Ljava/lang/String;", "f", "getLocationId", "b", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingVerifyPhoneLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingVerifyPhoneLink> CREATOR = new a();

    @com.google.gson.annotations.c("advertId")
    @k
    private final String advertId;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @com.google.gson.annotations.c("mcId")
    @l
    private final String mcId;

    /* compiled from: ServiceBookingVerifyPhoneLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingVerifyPhoneLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingVerifyPhoneLink createFromParcel(Parcel parcel) {
            return new ServiceBookingVerifyPhoneLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingVerifyPhoneLink[] newArray(int i12) {
            return new ServiceBookingVerifyPhoneLink[i12];
        }
    }

    /* compiled from: ServiceBookingVerifyPhoneLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b$a;", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b$b;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ServiceBookingVerifyPhoneLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b$a;", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f274260b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ServiceBookingVerifyPhoneLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b$b;", "Lcom/avito/android/service_booking/deeplinks/verify_phone/ServiceBookingVerifyPhoneLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking.deeplinks.verify_phone.ServiceBookingVerifyPhoneLink$b$b, reason: collision with other inner class name */
        public static final class C8145b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8145b f274261b = new C8145b();

            public C8145b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ServiceBookingVerifyPhoneLink(@k String str, @l String str2, @l String str3) {
        this.advertId = str;
        this.mcId = str2;
        this.locationId = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getMcId() {
        return this.mcId;
    }

    @k
    public final String getAdvertId() {
        return this.advertId;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.advertId);
        parcel.writeString(this.mcId);
        parcel.writeString(this.locationId);
    }
}
