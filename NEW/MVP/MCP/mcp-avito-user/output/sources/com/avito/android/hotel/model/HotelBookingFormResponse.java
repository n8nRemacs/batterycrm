package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingForm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingFormResponse;", "Landroid/os/Parcelable;", "BookingUnavailable", "Form", "Lcom/avito/android/hotel/model/HotelBookingFormResponse$BookingUnavailable;", "Lcom/avito/android/hotel/model/HotelBookingFormResponse$Form;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HotelBookingFormResponse extends Parcelable {

    /* compiled from: HotelBookingForm.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingFormResponse$BookingUnavailable;", "Lcom/avito/android/hotel/model/HotelBookingFormResponse;", "", "title", "subtitle", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingUnavailable implements HotelBookingFormResponse {

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

    /* compiled from: HotelBookingForm.kt */
    @d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingFormResponse$Form;", "Lcom/avito/android/hotel/model/HotelBookingFormResponse;", "Lcom/avito/android/hotel/model/HotelBookingInfo;", RequestReviewResultKt.INFO_TYPE, "", "onAppearToastMessage", "", "Lcom/avito/android/hotel/model/HotelBookingFormItem;", "items", "<init>", "(Lcom/avito/android/hotel/model/HotelBookingInfo;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/hotel/model/HotelBookingInfo;", "c", "()Lcom/avito/android/hotel/model/HotelBookingInfo;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Form implements HotelBookingFormResponse {

        @k
        public static final Parcelable.Creator<Form> CREATOR = new a();

        @c(RequestReviewResultKt.INFO_TYPE)
        @l
        private final HotelBookingInfo info;

        @c("items")
        @l
        private final List<HotelBookingFormItem> items;

        @c("onAppearToastMessage")
        @l
        private final String onAppearToastMessage;

        /* compiled from: HotelBookingForm.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Form> {
            @Override // android.os.Parcelable.Creator
            public final Form createFromParcel(Parcel parcel) {
                ArrayList arrayList = null;
                HotelBookingInfo hotelBookingInfoCreateFromParcel = parcel.readInt() == 0 ? null : HotelBookingInfo.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Form.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Form(hotelBookingInfoCreateFromParcel, string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Form[] newArray(int i12) {
                return new Form[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Form(@l HotelBookingInfo hotelBookingInfo, @l String str, @l List<? extends HotelBookingFormItem> list) {
            this.info = hotelBookingInfo;
            this.onAppearToastMessage = str;
            this.items = list;
        }

        public static Form a(Form form, List list) {
            HotelBookingInfo hotelBookingInfo = form.info;
            String str = form.onAppearToastMessage;
            form.getClass();
            return new Form(hotelBookingInfo, str, list);
        }

        @l
        /* renamed from: c, reason: from getter */
        public final HotelBookingInfo getInfo() {
            return this.info;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getOnAppearToastMessage() {
            return this.onAppearToastMessage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Form)) {
                return false;
            }
            Form form = (Form) obj;
            return L.f(this.info, form.info) && L.f(this.onAppearToastMessage, form.onAppearToastMessage) && L.f(this.items, form.items);
        }

        @l
        public final List<HotelBookingFormItem> getItems() {
            return this.items;
        }

        public final int hashCode() {
            HotelBookingInfo hotelBookingInfo = this.info;
            int iHashCode = (hotelBookingInfo == null ? 0 : hotelBookingInfo.hashCode()) * 31;
            String str = this.onAppearToastMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<HotelBookingFormItem> list = this.items;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Form(info=");
            sb2.append(this.info);
            sb2.append(", onAppearToastMessage=");
            sb2.append(this.onAppearToastMessage);
            sb2.append(", items=");
            return H.p(sb2, this.items, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            HotelBookingInfo hotelBookingInfo = this.info;
            if (hotelBookingInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                hotelBookingInfo.writeToParcel(parcel, i12);
            }
            parcel.writeString(this.onAppearToastMessage);
            List<HotelBookingFormItem> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
    }
}
