package com.avito.android.important_addresses_selection.data.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesData.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0002*+BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "hint", "Lcom/avito/android/remote/model/text/AttributedText;", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Button;", "button", "", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address;", "addresses", "", "departureTime", "analyticsType", "", "maxShow", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Button;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "g", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "i", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Button;", "e", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Button;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "d", "I", "h", "()I", "Address", "Button", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesData implements Parcelable {

    @k
    public static final Parcelable.Creator<ImportantAddressesData> CREATOR = new a();

    @c("addresses")
    @l
    private final List<Address> addresses;

    @c("analyticsType")
    @k
    private final String analyticsType;

    @c("button")
    @k
    private final Button button;

    @c("departureTime")
    @l
    private final Long departureTime;

    @c("hint")
    @l
    private final DeepLink hint;

    @c("maxShow")
    private final int maxShow;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final AttributedText placeholder;

    @c("title")
    @l
    private final String title;

    /* compiled from: ImportantAddressesData.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address$Coords;", "coords", "", "icon", "title", "<init>", "(ILcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address$Coords;Ljava/lang/String;Ljava/lang/String;)V", "I", "d", "()I", "Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address$Coords;", "c", "()Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address$Coords;", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "getTitle", "Coords", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Address implements Parcelable {

        @k
        public static final Parcelable.Creator<Address> CREATOR = new a();

        @c("coords")
        @k
        private final Coords coords;

        @c("icon")
        @k
        private final String icon;

        @c("id")
        private final int id;

        @c("title")
        @k
        private final String title;

        /* compiled from: ImportantAddressesData.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Address$Coords;", "Landroid/os/Parcelable;", "", "lat", AddressParameter.Value.LNG, "<init>", "(DD)V", "D", "c", "()D", "d", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Coords implements Parcelable {

            @k
            public static final Parcelable.Creator<Coords> CREATOR = new a();

            @c("lat")
            private final double lat;

            @c(AddressParameter.Value.LNG)
            private final double lng;

            /* compiled from: ImportantAddressesData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Coords> {
                @Override // android.os.Parcelable.Creator
                public final Coords createFromParcel(Parcel parcel) {
                    return new Coords(parcel.readDouble(), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Coords[] newArray(int i12) {
                    return new Coords[i12];
                }
            }

            public Coords(double d12, double d13) {
                this.lat = d12;
                this.lng = d13;
            }

            /* renamed from: c, reason: from getter */
            public final double getLat() {
                return this.lat;
            }

            /* renamed from: d, reason: from getter */
            public final double getLng() {
                return this.lng;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Coords)) {
                    return false;
                }
                Coords coords = (Coords) obj;
                return Double.compare(this.lat, coords.lat) == 0 && Double.compare(this.lng, coords.lng) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.lng) + (Double.hashCode(this.lat) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Coords(lat=");
                sb2.append(this.lat);
                sb2.append(", lng=");
                return e.o(sb2, this.lng, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeDouble(this.lat);
                parcel.writeDouble(this.lng);
            }
        }

        /* compiled from: ImportantAddressesData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel.readInt(), Coords.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        public Address(int i12, @k Coords coords, @k String str, @k String str2) {
            this.id = i12;
            this.coords = coords;
            this.icon = str;
            this.title = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Coords getCoords() {
            return this.coords;
        }

        /* renamed from: d, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return this.id == address.id && L.f(this.coords, address.coords) && L.f(this.icon, address.icon) && L.f(this.title, address.title);
        }

        @k
        public final String getIcon() {
            return this.icon;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode() + H.d((this.coords.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.icon);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Address(id=");
            sb2.append(this.id);
            sb2.append(", coords=");
            sb2.append(this.coords);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.id);
            this.coords.writeToParcel(parcel, i12);
            parcel.writeString(this.icon);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: ImportantAddressesData.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/important_addresses_selection/data/model/ImportantAddressesData$Button;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_important-addresses-selection_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("text")
        @k
        private final String text;

        /* compiled from: ImportantAddressesData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l String str2, @k DeepLink deepLink) {
            this.text = str;
            this.style = str2;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.text, button.text) && L.f(this.style, button.style) && L.f(this.deepLink, button.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public final int hashCode() {
            int iHashCode = this.text.hashCode() * 31;
            String str = this.style;
            return this.deepLink.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.text);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.text);
            parcel.writeString(this.style);
            parcel.writeParcelable(this.deepLink, i12);
        }
    }

    /* compiled from: ImportantAddressesData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesData> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ImportantAddressesData.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ImportantAddressesData.class.getClassLoader());
            Button buttonCreateFromParcel = Button.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Address.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ImportantAddressesData(string, deepLink, attributedText, buttonCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesData[] newArray(int i12) {
            return new ImportantAddressesData[i12];
        }
    }

    public ImportantAddressesData(@l String str, @l DeepLink deepLink, @l AttributedText attributedText, @k Button button, @l List<Address> list, @l Long l12, @k String str2, int i12) {
        this.title = str;
        this.hint = deepLink;
        this.placeholder = attributedText;
        this.button = button;
        this.addresses = list;
        this.departureTime = l12;
        this.analyticsType = str2;
        this.maxShow = i12;
    }

    @l
    public final List<Address> c() {
        return this.addresses;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getAnalyticsType() {
        return this.analyticsType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesData)) {
            return false;
        }
        ImportantAddressesData importantAddressesData = (ImportantAddressesData) obj;
        return L.f(this.title, importantAddressesData.title) && L.f(this.hint, importantAddressesData.hint) && L.f(this.placeholder, importantAddressesData.placeholder) && L.f(this.button, importantAddressesData.button) && L.f(this.addresses, importantAddressesData.addresses) && L.f(this.departureTime, importantAddressesData.departureTime) && L.f(this.analyticsType, importantAddressesData.analyticsType) && this.maxShow == importantAddressesData.maxShow;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getDepartureTime() {
        return this.departureTime;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final DeepLink getHint() {
        return this.hint;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final int getMaxShow() {
        return this.maxShow;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DeepLink deepLink = this.hint;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText = this.placeholder;
        int iHashCode3 = (this.button.hashCode() + ((iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        List<Address> list = this.addresses;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l12 = this.departureTime;
        return Integer.hashCode(this.maxShow) + H.d((iHashCode4 + (l12 != null ? l12.hashCode() : 0)) * 31, 31, this.analyticsType);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final AttributedText getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesData(title=");
        sb2.append(this.title);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", addresses=");
        sb2.append(this.addresses);
        sb2.append(", departureTime=");
        sb2.append(this.departureTime);
        sb2.append(", analyticsType=");
        sb2.append(this.analyticsType);
        sb2.append(", maxShow=");
        return r.t(sb2, this.maxShow, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.hint, i12);
        parcel.writeParcelable(this.placeholder, i12);
        this.button.writeToParcel(parcel, i12);
        List<Address> list = this.addresses;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Address) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Long l12 = this.departureTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.analyticsType);
        parcel.writeInt(this.maxShow);
    }
}
