package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StrBookingCalendar.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalendar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarData;", "bookingCalendarData", "<init>", "(Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarData;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarData;", "getBookingCalendarData", "()Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarData;", "AvailableCheckOutDateRange", "BookingCalendarData", "BookingCalendarItem", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrBookingCalendar implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingCalendar> CREATOR = new Creator();

    @c("bookingCalendarData")
    @k
    private final BookingCalendarData bookingCalendarData;

    /* compiled from: StrBookingCalendar.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalendar$AvailableCheckOutDateRange;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "minimalDurationCaption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "getEndDate", "getMinimalDurationCaption", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AvailableCheckOutDateRange implements Parcelable {

        @k
        public static final Parcelable.Creator<AvailableCheckOutDateRange> CREATOR = new Creator();

        @c("endDate")
        @k
        private final String endDate;

        @c("minimalDurationCaption")
        @l
        private final String minimalDurationCaption;

        @c("startDate")
        @k
        private final String startDate;

        /* compiled from: StrBookingCalendar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AvailableCheckOutDateRange> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AvailableCheckOutDateRange createFromParcel(@k Parcel parcel) {
                return new AvailableCheckOutDateRange(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AvailableCheckOutDateRange[] newArray(int i12) {
                return new AvailableCheckOutDateRange[i12];
            }
        }

        public AvailableCheckOutDateRange(@k String str, @k String str2, @l String str3) {
            this.startDate = str;
            this.endDate = str2;
            this.minimalDurationCaption = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getEndDate() {
            return this.endDate;
        }

        @l
        public final String getMinimalDurationCaption() {
            return this.minimalDurationCaption;
        }

        @k
        public final String getStartDate() {
            return this.startDate;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.startDate);
            parcel.writeString(this.endDate);
            parcel.writeString(this.minimalDurationCaption);
        }
    }

    /* compiled from: StrBookingCalendar.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarData;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarItem;", "items", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingCalendarData implements Parcelable {

        @k
        public static final Parcelable.Creator<BookingCalendarData> CREATOR = new Creator();

        @c("items")
        @k
        private final List<BookingCalendarItem> items;

        /* compiled from: StrBookingCalendar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BookingCalendarData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BookingCalendarData createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(BookingCalendarItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new BookingCalendarData(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BookingCalendarData[] newArray(int i12) {
                return new BookingCalendarData[i12];
            }
        }

        public BookingCalendarData(@k List<BookingCalendarItem> list) {
            this.items = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<BookingCalendarItem> getItems() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.items, parcel);
            while (itJ.hasNext()) {
                ((BookingCalendarItem) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: StrBookingCalendar.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/StrBookingCalendar$BookingCalendarItem;", "Landroid/os/Parcelable;", "", "date", "", "isCheckInAvailable", "Lcom/avito/android/remote/model/StrBookingCalendar$AvailableCheckOutDateRange;", "availableCheckOutDateRange", "<init>", "(Ljava/lang/String;ZLcom/avito/android/remote/model/StrBookingCalendar$AvailableCheckOutDateRange;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "Z", "()Z", "Lcom/avito/android/remote/model/StrBookingCalendar$AvailableCheckOutDateRange;", "getAvailableCheckOutDateRange", "()Lcom/avito/android/remote/model/StrBookingCalendar$AvailableCheckOutDateRange;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BookingCalendarItem implements Parcelable {

        @k
        public static final Parcelable.Creator<BookingCalendarItem> CREATOR = new Creator();

        @c("availableCheckOutDateRange")
        @l
        private final AvailableCheckOutDateRange availableCheckOutDateRange;

        @c("date")
        @k
        private final String date;

        @c("isCheckInAvailable")
        private final boolean isCheckInAvailable;

        /* compiled from: StrBookingCalendar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BookingCalendarItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BookingCalendarItem createFromParcel(@k Parcel parcel) {
                return new BookingCalendarItem(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : AvailableCheckOutDateRange.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BookingCalendarItem[] newArray(int i12) {
                return new BookingCalendarItem[i12];
            }
        }

        public BookingCalendarItem(@k String str, boolean z12, @l AvailableCheckOutDateRange availableCheckOutDateRange) {
            this.date = str;
            this.isCheckInAvailable = z12;
            this.availableCheckOutDateRange = availableCheckOutDateRange;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AvailableCheckOutDateRange getAvailableCheckOutDateRange() {
            return this.availableCheckOutDateRange;
        }

        @k
        public final String getDate() {
            return this.date;
        }

        /* renamed from: isCheckInAvailable, reason: from getter */
        public final boolean getIsCheckInAvailable() {
            return this.isCheckInAvailable;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.date);
            parcel.writeInt(this.isCheckInAvailable ? 1 : 0);
            AvailableCheckOutDateRange availableCheckOutDateRange = this.availableCheckOutDateRange;
            if (availableCheckOutDateRange == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                availableCheckOutDateRange.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: StrBookingCalendar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingCalendar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalendar createFromParcel(@k Parcel parcel) {
            return new StrBookingCalendar(BookingCalendarData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingCalendar[] newArray(int i12) {
            return new StrBookingCalendar[i12];
        }
    }

    public StrBookingCalendar(@k BookingCalendarData bookingCalendarData) {
        this.bookingCalendarData = bookingCalendarData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final BookingCalendarData getBookingCalendarData() {
        return this.bookingCalendarData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.bookingCalendarData.writeToParcel(parcel, flags);
    }
}
