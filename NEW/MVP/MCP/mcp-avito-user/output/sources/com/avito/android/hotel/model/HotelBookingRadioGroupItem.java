package com.avito.android.hotel.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.hotel.model.HotelBookingParameter;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingRadioGroupItem.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem;", "Lcom/avito/android/hotel/model/HotelBookingParameter;", "", "id", "value", "", "_updateForm", "", "Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$Option;", "options", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getValue", "Ljava/lang/Boolean;", "O2", "()Ljava/lang/Boolean;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Option", "OptionIcon", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HotelBookingRadioGroupItem implements HotelBookingParameter<String> {

    @k
    public static final Parcelable.Creator<HotelBookingRadioGroupItem> CREATOR = new a();

    @c("updateForm")
    @l
    private final Boolean _updateForm;

    @c("id")
    @l
    private final String id;

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    @c("options")
    @l
    private final List<Option> options;

    @c("value")
    @l
    private final String value;

    /* compiled from: HotelBookingRadioGroupItem.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$Option;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$OptionIcon;", "icon", "", "showNewBadge", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$OptionIcon;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$OptionIcon;", "c", "()Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$OptionIcon;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @c("description")
        @l
        private final AttributedText description;

        @c("icon")
        @l
        private final OptionIcon icon;

        @c("id")
        @k
        private final String id;

        @c("showNewBadge")
        @l
        private final Boolean showNewBadge;

        @c("title")
        @l
        private final AttributedText title;

        /* compiled from: HotelBookingRadioGroupItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Option.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Option.class.getClassLoader());
                OptionIcon optionIconCreateFromParcel = parcel.readInt() == 0 ? null : OptionIcon.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Option(string, attributedText, attributedText2, optionIconCreateFromParcel, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        public Option(@k String str, @l AttributedText attributedText, @l AttributedText attributedText2, @l OptionIcon optionIcon, @l Boolean bool) {
            this.id = str;
            this.title = attributedText;
            this.description = attributedText2;
            this.icon = optionIcon;
            this.showNewBadge = bool;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final OptionIcon getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Boolean getShowNewBadge() {
            return this.showNewBadge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.description, option.description) && L.f(this.icon, option.icon) && L.f(this.showNewBadge, option.showNewBadge);
        }

        @l
        public final AttributedText getDescription() {
            return this.description;
        }

        @k
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            AttributedText attributedText = this.title;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.description;
            int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            OptionIcon optionIcon = this.icon;
            int iHashCode4 = (iHashCode3 + (optionIcon == null ? 0 : optionIcon.hashCode())) * 31;
            Boolean bool = this.showNewBadge;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Option(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", description=");
            sb2.append(this.description);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", showNewBadge=");
            return C0.g(sb2, this.showNewBadge, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.description, i12);
            OptionIcon optionIcon = this.icon;
            if (optionIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                optionIcon.writeToParcel(parcel, i12);
            }
            Boolean bool = this.showNewBadge;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: HotelBookingRadioGroupItem.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/hotel/model/HotelBookingRadioGroupItem$OptionIcon;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_hotel_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OptionIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionIcon> CREATOR = new a();

        @c("color")
        @l
        private final UniversalColor color;

        @c("name")
        @l
        private final String name;

        /* compiled from: HotelBookingRadioGroupItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OptionIcon> {
            @Override // android.os.Parcelable.Creator
            public final OptionIcon createFromParcel(Parcel parcel) {
                return new OptionIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(OptionIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OptionIcon[] newArray(int i12) {
                return new OptionIcon[i12];
            }
        }

        public OptionIcon(@l String str, @l UniversalColor universalColor) {
            this.name = str;
            this.color = universalColor;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionIcon)) {
                return false;
            }
            OptionIcon optionIcon = (OptionIcon) obj;
            return L.f(this.name, optionIcon.name) && L.f(this.color, optionIcon.color);
        }

        @l
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.color;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OptionIcon(name=");
            sb2.append(this.name);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.name);
            parcel.writeParcelable(this.color, i12);
        }
    }

    /* compiled from: HotelBookingRadioGroupItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HotelBookingRadioGroupItem> {
        @Override // android.os.Parcelable.Creator
        public final HotelBookingRadioGroupItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new HotelBookingRadioGroupItem(string, string2, boolValueOf, arrayList, (ParametrizedEvent) parcel.readParcelable(HotelBookingRadioGroupItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HotelBookingRadioGroupItem[] newArray(int i12) {
            return new HotelBookingRadioGroupItem[i12];
        }
    }

    public HotelBookingRadioGroupItem(@l String str, @l String str2, @l Boolean bool, @l List<Option> list, @l ParametrizedEvent parametrizedEvent) {
        this.id = str;
        this.value = str2;
        this._updateForm = bool;
        this.options = list;
        this.onShowEvent = parametrizedEvent;
    }

    public static HotelBookingRadioGroupItem a(HotelBookingRadioGroupItem hotelBookingRadioGroupItem, String str) {
        String str2 = hotelBookingRadioGroupItem.id;
        Boolean bool = hotelBookingRadioGroupItem._updateForm;
        List<Option> list = hotelBookingRadioGroupItem.options;
        ParametrizedEvent parametrizedEvent = hotelBookingRadioGroupItem.onShowEvent;
        hotelBookingRadioGroupItem.getClass();
        return new HotelBookingRadioGroupItem(str2, str, bool, list, parametrizedEvent);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final boolean C5() {
        return HotelBookingParameter.a.a(this);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    /* renamed from: O2, reason: from getter */
    public final Boolean get_updateForm() {
        return this._updateForm;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @l
    public final List<Option> d() {
        return this.options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HotelBookingRadioGroupItem)) {
            return false;
        }
        HotelBookingRadioGroupItem hotelBookingRadioGroupItem = (HotelBookingRadioGroupItem) obj;
        return L.f(this.id, hotelBookingRadioGroupItem.id) && L.f(this.value, hotelBookingRadioGroupItem.value) && L.f(this._updateForm, hotelBookingRadioGroupItem._updateForm) && L.f(this.options, hotelBookingRadioGroupItem.options) && L.f(this.onShowEvent, hotelBookingRadioGroupItem.onShowEvent);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getId() {
        return this.id;
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this._updateForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Option> list = this.options;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        return iHashCode4 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HotelBookingRadioGroupItem(id=");
        sb2.append(this.id);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", _updateForm=");
        sb2.append(this._updateForm);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onShowEvent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        Boolean bool = this._updateForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<Option> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Option) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.onShowEvent, i12);
    }

    @Override // com.avito.android.hotel.model.HotelBookingParameter
    @l
    public final String getValue() {
        return this.value;
    }
}
