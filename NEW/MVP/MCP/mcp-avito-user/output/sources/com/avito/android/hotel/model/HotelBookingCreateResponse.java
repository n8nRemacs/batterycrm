package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingForm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingCreateResponse;", "Landroid/os/Parcelable;", "BookingAvailable", "BookingUnavailable", "Lcom/avito/android/hotel/model/HotelBookingCreateResponse$BookingAvailable;", "Lcom/avito/android/hotel/model/HotelBookingCreateResponse$BookingUnavailable;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HotelBookingCreateResponse extends Parcelable {

    /* compiled from: HotelBookingForm.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingCreateResponse$BookingAvailable;", "Lcom/avito/android/hotel/model/HotelBookingCreateResponse;", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirect", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingAvailable implements HotelBookingCreateResponse {

        @k
        public static final Parcelable.Creator<BookingAvailable> CREATOR = new a();

        @c("redirect")
        @l
        private final DeepLink redirect;

        /* compiled from: HotelBookingForm.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BookingAvailable> {
            @Override // android.os.Parcelable.Creator
            public final BookingAvailable createFromParcel(Parcel parcel) {
                return new BookingAvailable((DeepLink) parcel.readParcelable(BookingAvailable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BookingAvailable[] newArray(int i12) {
                return new BookingAvailable[i12];
            }
        }

        public BookingAvailable(@l DeepLink deepLink) {
            this.redirect = deepLink;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final DeepLink getRedirect() {
            return this.redirect;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookingAvailable) && L.f(this.redirect, ((BookingAvailable) obj).redirect);
        }

        public final int hashCode() {
            DeepLink deepLink = this.redirect;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BookingAvailable(redirect="), this.redirect, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.redirect, i12);
        }
    }

    /* compiled from: HotelBookingForm.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingCreateResponse$BookingUnavailable;", "Lcom/avito/android/hotel/model/HotelBookingCreateResponse;", "", "title", "subtitle", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingUnavailable implements HotelBookingCreateResponse {

        @k
        public static final Parcelable.Creator<BookingUnavailable> CREATOR = new a();

        @c("button")
        @l
        private final ButtonAction button;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: HotelBookingForm.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BookingUnavailable> {
            @Override // android.os.Parcelable.Creator
            public final BookingUnavailable createFromParcel(Parcel parcel) {
                return new BookingUnavailable(parcel.readString(), parcel.readString(), (ButtonAction) parcel.readParcelable(BookingUnavailable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BookingUnavailable[] newArray(int i12) {
                return new BookingUnavailable[i12];
            }
        }

        public BookingUnavailable(@l String str, @l String str2, @l ButtonAction buttonAction) {
            this.title = str;
            this.subtitle = str2;
            this.button = buttonAction;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final ButtonAction getButton() {
            return this.button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingUnavailable)) {
                return false;
            }
            BookingUnavailable bookingUnavailable = (BookingUnavailable) obj;
            return L.f(this.title, bookingUnavailable.title) && L.f(this.subtitle, bookingUnavailable.subtitle) && L.f(this.button, bookingUnavailable.button);
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonAction buttonAction = this.button;
            return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BookingUnavailable(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", button=");
            return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.button, i12);
        }
    }
}
