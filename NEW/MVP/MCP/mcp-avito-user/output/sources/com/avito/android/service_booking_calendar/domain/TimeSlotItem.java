package com.avito.android.service_booking_calendar.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimeSlotItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "BusyTimeSlotItem", "EmptyTimeSlotItem", "InactiveTimeSlotItem", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$BusyTimeSlotItem;", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$EmptyTimeSlotItem;", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$InactiveTimeSlotItem;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeSlotItem extends ParcelableItem {

    /* compiled from: TimeSlotItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$BusyTimeSlotItem;", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem;", "Status", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class BusyTimeSlotItem implements TimeSlotItem {

        @k
        public static final Parcelable.Creator<BusyTimeSlotItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f275510b;

        /* renamed from: c, reason: collision with root package name */
        public final long f275511c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f275512d;

        /* renamed from: e, reason: collision with root package name */
        public final int f275513e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final Status f275514f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<String> f275515g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f275516h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f275517i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final DeepLink f275518j;

        /* renamed from: k, reason: collision with root package name */
        public final int f275519k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TimeSlotItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$BusyTimeSlotItem$Status;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Status {

            /* renamed from: c, reason: collision with root package name */
            public static final Status f275520c;

            /* renamed from: d, reason: collision with root package name */
            public static final Status f275521d;

            /* renamed from: e, reason: collision with root package name */
            public static final Status f275522e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Status[] f275523f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f275524g;

            /* renamed from: b, reason: collision with root package name */
            public final int f275525b;

            static {
                Status status = new Status("COMPLETED", 0, R.style.Timeslot_Card_Completed);
                f275520c = status;
                Status status2 = new Status("CONFIRMED", 1, R.style.Timeslot_Card_Confirmed);
                f275521d = status2;
                Status status3 = new Status("NEED_CONFIRMATION", 2, R.style.Timeslot_Card_NeedsConfirmation);
                f275522e = status3;
                Status[] statusArr = {status, status2, status3};
                f275523f = statusArr;
                f275524g = kotlin.enums.c.a(statusArr);
            }

            public Status(@f0 String str, int i12, int i13) {
                this.f275525b = i13;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f275523f.clone();
            }
        }

        /* compiled from: TimeSlotItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BusyTimeSlotItem> {
            @Override // android.os.Parcelable.Creator
            public final BusyTimeSlotItem createFromParcel(Parcel parcel) {
                return new BusyTimeSlotItem(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), Status.valueOf(parcel.readString()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(BusyTimeSlotItem.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final BusyTimeSlotItem[] newArray(int i12) {
                return new BusyTimeSlotItem[i12];
            }
        }

        public BusyTimeSlotItem(@k String str, long j12, @k String str2, int i12, @k Status status, @l List<String> list, @l String str3, @l String str4, @l DeepLink deepLink, int i13) {
            this.f275510b = str;
            this.f275511c = j12;
            this.f275512d = str2;
            this.f275513e = i12;
            this.f275514f = status;
            this.f275515g = list;
            this.f275516h = str3;
            this.f275517i = str4;
            this.f275518j = deepLink;
            this.f275519k = i13;
        }

        @Override // com.avito.android.service_booking_calendar.domain.TimeSlotItem
        /* renamed from: E0, reason: from getter */
        public final long getF275530c() {
            return this.f275511c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BusyTimeSlotItem)) {
                return false;
            }
            BusyTimeSlotItem busyTimeSlotItem = (BusyTimeSlotItem) obj;
            return L.f(this.f275510b, busyTimeSlotItem.f275510b) && this.f275511c == busyTimeSlotItem.f275511c && L.f(this.f275512d, busyTimeSlotItem.f275512d) && this.f275513e == busyTimeSlotItem.f275513e && this.f275514f == busyTimeSlotItem.f275514f && L.f(this.f275515g, busyTimeSlotItem.f275515g) && L.f(this.f275516h, busyTimeSlotItem.f275516h) && L.f(this.f275517i, busyTimeSlotItem.f275517i) && L.f(this.f275518j, busyTimeSlotItem.f275518j) && this.f275519k == busyTimeSlotItem.f275519k;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF182874b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF324780b() {
            return this.f275510b;
        }

        public final int hashCode() {
            int iHashCode = (this.f275514f.hashCode() + r.e(this.f275513e, H.d(r.g(this.f275510b.hashCode() * 31, 31, this.f275511c), 31, this.f275512d), 31)) * 31;
            List<String> list = this.f275515g;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.f275516h;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f275517i;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f275518j;
            return Integer.hashCode(this.f275519k) + ((iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BusyTimeSlotItem(stringId=");
            sb2.append(this.f275510b);
            sb2.append(", timeStart=");
            sb2.append(this.f275511c);
            sb2.append(", statusText=");
            sb2.append(this.f275512d);
            sb2.append(", cardSize=");
            sb2.append(this.f275513e);
            sb2.append(", status=");
            sb2.append(this.f275514f);
            sb2.append(", serviceNames=");
            sb2.append(this.f275515g);
            sb2.append(", totalAmount=");
            sb2.append(this.f275516h);
            sb2.append(", contactName=");
            sb2.append(this.f275517i);
            sb2.append(", action=");
            sb2.append(this.f275518j);
            sb2.append(", techBreakSize=");
            return r.t(sb2, this.f275519k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f275510b);
            parcel.writeLong(this.f275511c);
            parcel.writeString(this.f275512d);
            parcel.writeInt(this.f275513e);
            parcel.writeString(this.f275514f.name());
            parcel.writeStringList(this.f275515g);
            parcel.writeString(this.f275516h);
            parcel.writeString(this.f275517i);
            parcel.writeParcelable(this.f275518j, i12);
            parcel.writeInt(this.f275519k);
        }
    }

    /* compiled from: TimeSlotItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$EmptyTimeSlotItem;", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmptyTimeSlotItem implements TimeSlotItem {

        @k
        public static final Parcelable.Creator<EmptyTimeSlotItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f275526b;

        /* renamed from: c, reason: collision with root package name */
        public final long f275527c;

        /* renamed from: d, reason: collision with root package name */
        public final int f275528d;

        /* compiled from: TimeSlotItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<EmptyTimeSlotItem> {
            @Override // android.os.Parcelable.Creator
            public final EmptyTimeSlotItem createFromParcel(Parcel parcel) {
                return new EmptyTimeSlotItem(parcel.readString(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyTimeSlotItem[] newArray(int i12) {
                return new EmptyTimeSlotItem[i12];
            }
        }

        public EmptyTimeSlotItem(@k String str, long j12, int i12) {
            this.f275526b = str;
            this.f275527c = j12;
            this.f275528d = i12;
        }

        @Override // com.avito.android.service_booking_calendar.domain.TimeSlotItem
        /* renamed from: E0, reason: from getter */
        public final long getF275530c() {
            return this.f275527c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyTimeSlotItem)) {
                return false;
            }
            EmptyTimeSlotItem emptyTimeSlotItem = (EmptyTimeSlotItem) obj;
            return L.f(this.f275526b, emptyTimeSlotItem.f275526b) && this.f275527c == emptyTimeSlotItem.f275527c && this.f275528d == emptyTimeSlotItem.f275528d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF182874b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF324780b() {
            return this.f275526b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f275528d) + r.g(this.f275526b.hashCode() * 31, 31, this.f275527c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmptyTimeSlotItem(stringId=");
            sb2.append(this.f275526b);
            sb2.append(", timeStart=");
            sb2.append(this.f275527c);
            sb2.append(", size=");
            return r.t(sb2, this.f275528d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f275526b);
            parcel.writeLong(this.f275527c);
            parcel.writeInt(this.f275528d);
        }
    }

    /* compiled from: TimeSlotItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$InactiveTimeSlotItem;", "Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InactiveTimeSlotItem implements TimeSlotItem {

        @k
        public static final Parcelable.Creator<InactiveTimeSlotItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f275529b;

        /* renamed from: c, reason: collision with root package name */
        public final long f275530c;

        /* renamed from: d, reason: collision with root package name */
        public final int f275531d;

        /* compiled from: TimeSlotItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InactiveTimeSlotItem> {
            @Override // android.os.Parcelable.Creator
            public final InactiveTimeSlotItem createFromParcel(Parcel parcel) {
                return new InactiveTimeSlotItem(parcel.readString(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final InactiveTimeSlotItem[] newArray(int i12) {
                return new InactiveTimeSlotItem[i12];
            }
        }

        public InactiveTimeSlotItem(@k String str, long j12, int i12) {
            this.f275529b = str;
            this.f275530c = j12;
            this.f275531d = i12;
        }

        @Override // com.avito.android.service_booking_calendar.domain.TimeSlotItem
        /* renamed from: E0, reason: from getter */
        public final long getF275530c() {
            return this.f275530c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InactiveTimeSlotItem)) {
                return false;
            }
            InactiveTimeSlotItem inactiveTimeSlotItem = (InactiveTimeSlotItem) obj;
            return L.f(this.f275529b, inactiveTimeSlotItem.f275529b) && this.f275530c == inactiveTimeSlotItem.f275530c && this.f275531d == inactiveTimeSlotItem.f275531d;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF182874b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF324780b() {
            return this.f275529b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f275531d) + r.g(this.f275529b.hashCode() * 31, 31, this.f275530c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InactiveTimeSlotItem(stringId=");
            sb2.append(this.f275529b);
            sb2.append(", timeStart=");
            sb2.append(this.f275530c);
            sb2.append(", size=");
            return r.t(sb2, this.f275531d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f275529b);
            parcel.writeLong(this.f275530c);
            parcel.writeInt(this.f275531d);
        }
    }

    /* compiled from: TimeSlotItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* renamed from: E0 */
    long getF275530c();
}
