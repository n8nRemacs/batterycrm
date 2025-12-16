package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertHotelRoom.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel/model/HotelActionButton;", "Landroid/os/Parcelable;", "DeeplinkButton", "SearchButton", "Lcom/avito/android/hotel/model/HotelActionButton$DeeplinkButton;", "Lcom/avito/android/hotel/model/HotelActionButton$SearchButton;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class HotelActionButton implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f162610b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f162611c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f162612d;

    /* compiled from: AdvertHotelRoom.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel/model/HotelActionButton$DeeplinkButton;", "Lcom/avito/android/hotel/model/HotelActionButton;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeeplinkButton extends HotelActionButton {

        @k
        public static final Parcelable.Creator<DeeplinkButton> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f162613e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f162614f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Boolean f162615g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final DeepLink f162616h;

        /* compiled from: AdvertHotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeeplinkButton> {
            @Override // android.os.Parcelable.Creator
            public final DeeplinkButton createFromParcel(Parcel parcel) {
                PrintableText printableText = (PrintableText) parcel.readParcelable(DeeplinkButton.class.getClassLoader());
                Boolean boolValueOf = null;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new DeeplinkButton(printableText, numValueOf, boolValueOf, (DeepLink) parcel.readParcelable(DeeplinkButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeeplinkButton[] newArray(int i12) {
                return new DeeplinkButton[i12];
            }
        }

        public DeeplinkButton(@k PrintableText printableText, @l Integer num, @l Boolean bool, @l DeepLink deepLink) {
            super(printableText, num, bool, null);
            this.f162613e = printableText;
            this.f162614f = num;
            this.f162615g = bool;
            this.f162616h = deepLink;
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @l
        /* renamed from: c, reason: from getter */
        public final Integer getF162611c() {
            return this.f162614f;
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @k
        /* renamed from: d, reason: from getter */
        public final PrintableText getF162610b() {
            return this.f162613e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeeplinkButton)) {
                return false;
            }
            DeeplinkButton deeplinkButton = (DeeplinkButton) obj;
            return L.f(this.f162613e, deeplinkButton.f162613e) && L.f(this.f162614f, deeplinkButton.f162614f) && L.f(this.f162615g, deeplinkButton.f162615g) && L.f(this.f162616h, deeplinkButton.f162616h);
        }

        public final int hashCode() {
            int iHashCode = this.f162613e.hashCode() * 31;
            Integer num = this.f162614f;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.f162615g;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            DeepLink deepLink = this.f162616h;
            return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @l
        /* renamed from: isEnabled, reason: from getter */
        public final Boolean getF162612d() {
            return this.f162615g;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkButton(title=");
            sb2.append(this.f162613e);
            sb2.append(", style=");
            sb2.append(this.f162614f);
            sb2.append(", isEnabled=");
            sb2.append(this.f162615g);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f162616h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f162613e, i12);
            Integer num = this.f162614f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Boolean bool = this.f162615g;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.f162616h, i12);
        }
    }

    /* compiled from: AdvertHotelRoom.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel/model/HotelActionButton$SearchButton;", "Lcom/avito/android/hotel/model/HotelActionButton;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchButton extends HotelActionButton {

        @k
        public static final Parcelable.Creator<SearchButton> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f162617e;

        /* renamed from: f, reason: collision with root package name */
        public final int f162618f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Boolean f162619g;

        /* compiled from: AdvertHotelRoom.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchButton> {
            @Override // android.os.Parcelable.Creator
            public final SearchButton createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                PrintableText printableText = (PrintableText) parcel.readParcelable(SearchButton.class.getClassLoader());
                int i12 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SearchButton(printableText, i12, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final SearchButton[] newArray(int i12) {
                return new SearchButton[i12];
            }
        }

        public SearchButton(@k PrintableText printableText, int i12, @l Boolean bool) {
            super(printableText, Integer.valueOf(i12), bool, null);
            this.f162617e = printableText;
            this.f162618f = i12;
            this.f162619g = bool;
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @k
        /* renamed from: c */
        public final Integer getF162611c() {
            return Integer.valueOf(this.f162618f);
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @k
        /* renamed from: d, reason: from getter */
        public final PrintableText getF162610b() {
            return this.f162617e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchButton)) {
                return false;
            }
            SearchButton searchButton = (SearchButton) obj;
            return L.f(this.f162617e, searchButton.f162617e) && this.f162618f == searchButton.f162618f && L.f(this.f162619g, searchButton.f162619g);
        }

        public final int hashCode() {
            int iE2 = r.e(this.f162618f, this.f162617e.hashCode() * 31, 31);
            Boolean bool = this.f162619g;
            return iE2 + (bool == null ? 0 : bool.hashCode());
        }

        @Override // com.avito.android.hotel.model.HotelActionButton
        @l
        /* renamed from: isEnabled, reason: from getter */
        public final Boolean getF162612d() {
            return this.f162619g;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchButton(title=");
            sb2.append(this.f162617e);
            sb2.append(", style=");
            sb2.append(this.f162618f);
            sb2.append(", isEnabled=");
            return C0.g(sb2, this.f162619g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f162617e, i12);
            parcel.writeInt(this.f162618f);
            Boolean bool = this.f162619g;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    public HotelActionButton(PrintableText printableText, Integer num, Boolean bool, C42822w c42822w) {
        this.f162610b = printableText;
        this.f162611c = num;
        this.f162612d = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public Integer getF162611c() {
        return this.f162611c;
    }

    @k
    /* renamed from: d, reason: from getter */
    public PrintableText getF162610b() {
        return this.f162610b;
    }

    @l
    /* renamed from: isEnabled, reason: from getter */
    public Boolean getF162612d() {
        return this.f162612d;
    }
}
