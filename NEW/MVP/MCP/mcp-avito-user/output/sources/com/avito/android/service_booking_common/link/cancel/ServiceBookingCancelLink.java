package com.avito.android.service_booking_common.link.cancel;

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

/* compiled from: ServiceBookingCancelLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingCancelLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingCancelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276568b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f276569c;

    /* compiled from: ServiceBookingCancelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingCancelLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCancelLink createFromParcel(Parcel parcel) {
            return new ServiceBookingCancelLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingCancelLink[] newArray(int i12) {
            return new ServiceBookingCancelLink[i12];
        }
    }

    /* compiled from: ServiceBookingCancelLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b$a;", "Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingCancelLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f276570b;

            public a(@l String str) {
                this.f276570b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f276570b, ((a) obj).f276570b);
            }

            public final int hashCode() {
                String str = this.f276570b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Failure(message="), this.f276570b, ')');
            }
        }

        /* compiled from: ServiceBookingCancelLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_common/link/cancel/ServiceBookingCancelLink$b;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_common.link.cancel.ServiceBookingCancelLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8217b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f276571b;

            public C8217b(@l String str) {
                this.f276571b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8217b) && L.f(this.f276571b, ((C8217b) obj).f276571b);
            }

            public final int hashCode() {
                String str = this.f276571b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f276571b, ')');
            }
        }
    }

    public ServiceBookingCancelLink(@k String str, @k String str2) {
        this.f276568b = str;
        this.f276569c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f276568b);
        parcel.writeString(this.f276569c);
    }
}
