package com.avito.android.service_booking_common.link.confirm;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingConfirmLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingConfirmLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingConfirmLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f276594c;

    /* compiled from: ServiceBookingConfirmLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingConfirmLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingConfirmLink createFromParcel(Parcel parcel) {
            return new ServiceBookingConfirmLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingConfirmLink[] newArray(int i12) {
            return new ServiceBookingConfirmLink[i12];
        }
    }

    /* compiled from: ServiceBookingConfirmLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b$a;", "Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingConfirmLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f276595b;

            public a(@l String str) {
                this.f276595b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f276595b, ((a) obj).f276595b);
            }

            public final int hashCode() {
                String str = this.f276595b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f276595b, ')');
            }
        }

        /* compiled from: ServiceBookingConfirmLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/confirm/ServiceBookingConfirmLink$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_common.link.confirm.ServiceBookingConfirmLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8218b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f276596b;

            public C8218b(@l String str) {
                this.f276596b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8218b) && L.f(this.f276596b, ((C8218b) obj).f276596b);
            }

            public final int hashCode() {
                String str = this.f276596b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f276596b, ')');
            }
        }
    }

    public ServiceBookingConfirmLink(@k String str, @k String str2) {
        this.f276593b = str;
        this.f276594c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingConfirmLink)) {
            return false;
        }
        ServiceBookingConfirmLink serviceBookingConfirmLink = (ServiceBookingConfirmLink) obj;
        return L.f(this.f276593b, serviceBookingConfirmLink.f276593b) && L.f(this.f276594c, serviceBookingConfirmLink.f276594c);
    }

    public final int hashCode() {
        return this.f276594c.hashCode() + (this.f276593b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingConfirmLink(id=");
        sb2.append(this.f276593b);
        sb2.append(", type=");
        return C22026a.c(sb2, this.f276594c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f276593b);
        parcel.writeString(this.f276594c);
    }
}
