package com.avito.android.service_booking_schedule_repetition_public;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.service_booking_day_settings.breaks.e;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServiceBookingScheduleRepetitionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Break", "b", "_avito_service-booking-schedule-repetition_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceBookingScheduleRepetitionLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServiceBookingScheduleRepetitionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f277759b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f277760c;

    /* renamed from: d, reason: collision with root package name */
    public final int f277761d;

    /* renamed from: e, reason: collision with root package name */
    public final int f277762e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArrayList f277763f;

    /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$Break;", "Landroid/os/Parcelable;", "Lcom/avito/android/service_booking_day_settings/breaks/e;", "_avito_service-booking-schedule-repetition_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Break implements Parcelable, e {

        @k
        public static final Parcelable.Creator<Break> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f277764b;

        /* renamed from: c, reason: collision with root package name */
        public final int f277765c;

        /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Break> {
            @Override // android.os.Parcelable.Creator
            public final Break createFromParcel(Parcel parcel) {
                return new Break(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Break[] newArray(int i12) {
                return new Break[i12];
            }
        }

        public Break(int i12, int i13) {
            this.f277764b = i12;
            this.f277765c = i13;
        }

        @Override // com.avito.android.service_booking_day_settings.breaks.e
        @k
        public final Integer L() {
            return Integer.valueOf(this.f277765c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Break)) {
                return false;
            }
            Break r52 = (Break) obj;
            return this.f277764b == r52.f277764b && this.f277765c == r52.f277765c;
        }

        @Override // com.avito.android.service_booking_day_settings.breaks.e
        @k
        public final Integer f() {
            return Integer.valueOf(this.f277764b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.f277765c) + (Integer.hashCode(this.f277764b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Break(from=");
            sb2.append(this.f277764b);
            sb2.append(", to=");
            return r.t(sb2, this.f277765c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f277764b);
            parcel.writeInt(this.f277765c);
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingScheduleRepetitionLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingScheduleRepetitionLink createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(Break.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ServiceBookingScheduleRepetitionLink(j12, z12, i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingScheduleRepetitionLink[] newArray(int i12) {
            return new ServiceBookingScheduleRepetitionLink[i12];
        }
    }

    /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b;", "", "a", "b", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b$a;", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b$b;", "_avito_service-booking-schedule-repetition_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b$a;", "LJu/c$b;", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b;", "_avito_service-booking-schedule-repetition_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final BookingSettingsStatus f277766b;

            public a(@l BookingSettingsStatus bookingSettingsStatus) {
                this.f277766b = bookingSettingsStatus;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f277766b == ((a) obj).f277766b;
            }

            public final int hashCode() {
                BookingSettingsStatus bookingSettingsStatus = this.f277766b;
                if (bookingSettingsStatus == null) {
                    return 0;
                }
                return bookingSettingsStatus.hashCode();
            }

            @k
            public final String toString() {
                return "Cancelled(settingsStatus=" + this.f277766b + ')';
            }
        }

        /* compiled from: ServiceBookingScheduleRepetitionLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b$b;", "LJu/c$b;", "Lcom/avito/android/service_booking_schedule_repetition_public/ServiceBookingScheduleRepetitionLink$b;", "_avito_service-booking-schedule-repetition_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8246b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f277767b;

            public C8246b(@l String str) {
                this.f277767b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8246b) && L.f(this.f277767b, ((C8246b) obj).f277767b);
            }

            public final int hashCode() {
                String str = this.f277767b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(message="), this.f277767b, ')');
            }
        }
    }

    public ServiceBookingScheduleRepetitionLink(long j12, boolean z12, int i12, int i13, @l ArrayList arrayList) {
        this.f277759b = j12;
        this.f277760c = z12;
        this.f277761d = i12;
        this.f277762e = i13;
        this.f277763f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f277759b);
        parcel.writeInt(this.f277760c ? 1 : 0);
        parcel.writeInt(this.f277761d);
        parcel.writeInt(this.f277762e);
        ArrayList arrayList = this.f277763f;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            ((Break) itY.next()).writeToParcel(parcel, i12);
        }
    }
}
