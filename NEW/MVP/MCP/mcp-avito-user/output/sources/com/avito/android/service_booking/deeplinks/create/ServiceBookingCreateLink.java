package com.avito.android.service_booking.deeplinks.create;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingCreateLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "advertId", "stepId", "mcId", SearchParamsConverterKt.LOCATION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getAdvertId", "()Ljava/lang/String;", "g", "f", "getLocationId", "b", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingCreateLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingCreateLink> CREATOR = new a();

    @com.google.gson.annotations.c("advertId")
    @k
    private final String advertId;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    @com.google.gson.annotations.c("mcId")
    @l
    private final String mcId;

    @com.google.gson.annotations.c("stepId")
    @k
    private final String stepId;

    /* compiled from: ServiceBookingCreateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCreateLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreateLink createFromParcel(Parcel parcel) {
            return new ServiceBookingCreateLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCreateLink[] newArray(int i12) {
            return new ServiceBookingCreateLink[i12];
        }
    }

    /* compiled from: ServiceBookingCreateLink.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b;", "", "a", "b", "c", "d", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$a;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$b;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$c;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$d;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingCreateLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f274183b = new a();
        }

        /* compiled from: ServiceBookingCreateLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b;", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking.deeplinks.create.ServiceBookingCreateLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8135b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f274184b;

            public C8135b(@k String str) {
                this.f274184b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8135b) && L.f(this.f274184b, ((C8135b) obj).f274184b);
            }

            public final int hashCode() {
                return this.f274184b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f274184b, ')');
            }
        }

        /* compiled from: ServiceBookingCreateLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$c;", "LJu/c$a;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f274185b = new c();
        }

        /* compiled from: ServiceBookingCreateLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b$d;", "LJu/c$b;", "Lcom/avito/android/service_booking/deeplinks/create/ServiceBookingCreateLink$b;", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f274186b = new d();
        }
    }

    public ServiceBookingCreateLink(@k String str, @k String str2, @l String str3, @l String str4) {
        this.advertId = str;
        this.stepId = str2;
        this.mcId = str3;
        this.locationId = str4;
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
    /* renamed from: g, reason: from getter */
    public final String getStepId() {
        return this.stepId;
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
        parcel.writeString(this.stepId);
        parcel.writeString(this.mcId);
        parcel.writeString(this.locationId);
    }
}
