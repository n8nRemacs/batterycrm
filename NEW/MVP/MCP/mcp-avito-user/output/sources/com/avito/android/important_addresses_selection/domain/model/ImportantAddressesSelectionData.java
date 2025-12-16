package com.avito.android.important_addresses_selection.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.common.C23088b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesSelectionData.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData;", "Landroid/os/Parcelable;", "AdditionalAction", "Address", "Button", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImportantAddressesSelectionData implements Parcelable {

    @k
    public static final Parcelable.Creator<ImportantAddressesSelectionData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169760b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f169761c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f169762d;

    /* renamed from: e, reason: collision with root package name */
    public final int f169763e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdditionalAction f169764f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f169765g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f169766h;

    /* compiled from: ImportantAddressesSelectionData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData$AdditionalAction;", "Landroid/os/Parcelable;", "Button", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AdditionalAction implements Parcelable {

        @k
        public static final Parcelable.Creator<AdditionalAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f169767b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Button f169768c;

        /* compiled from: ImportantAddressesSelectionData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData$AdditionalAction$Button;", "Landroid/os/Parcelable;", "ButtonType", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ButtonType f169769b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f169770c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final DeepLink f169771d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: ImportantAddressesSelectionData.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData$AdditionalAction$Button$ButtonType;", "", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ButtonType {

                /* renamed from: b, reason: collision with root package name */
                public static final ButtonType f169772b;

                /* renamed from: c, reason: collision with root package name */
                public static final ButtonType f169773c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ ButtonType[] f169774d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f169775e;

                static {
                    ButtonType buttonType = new ButtonType("ADD_ADDRESS", 0);
                    f169772b = buttonType;
                    ButtonType buttonType2 = new ButtonType("PROFILE", 1);
                    f169773c = buttonType2;
                    ButtonType[] buttonTypeArr = {buttonType, buttonType2};
                    f169774d = buttonTypeArr;
                    f169775e = c.a(buttonTypeArr);
                }

                public ButtonType() {
                    throw null;
                }

                public static ButtonType valueOf(String str) {
                    return (ButtonType) Enum.valueOf(ButtonType.class, str);
                }

                public static ButtonType[] values() {
                    return (ButtonType[]) f169774d.clone();
                }
            }

            /* compiled from: ImportantAddressesSelectionData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(ButtonType.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k ButtonType buttonType, @k String str, @k DeepLink deepLink) {
                this.f169769b = buttonType;
                this.f169770c = str;
                this.f169771d = deepLink;
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
                return this.f169769b == button.f169769b && L.f(this.f169770c, button.f169770c) && L.f(this.f169771d, button.f169771d);
            }

            public final int hashCode() {
                return this.f169771d.hashCode() + H.d(this.f169769b.hashCode() * 31, 31, this.f169770c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(type=");
                sb2.append(this.f169769b);
                sb2.append(", text=");
                sb2.append(this.f169770c);
                sb2.append(", uri=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f169771d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f169769b.name());
                parcel.writeString(this.f169770c);
                parcel.writeParcelable(this.f169771d, i12);
            }
        }

        /* compiled from: ImportantAddressesSelectionData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdditionalAction> {
            @Override // android.os.Parcelable.Creator
            public final AdditionalAction createFromParcel(Parcel parcel) {
                return new AdditionalAction((AttributedText) parcel.readParcelable(AdditionalAction.class.getClassLoader()), Button.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AdditionalAction[] newArray(int i12) {
                return new AdditionalAction[i12];
            }
        }

        public AdditionalAction(@l AttributedText attributedText, @k Button button) {
            this.f169767b = attributedText;
            this.f169768c = button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdditionalAction)) {
                return false;
            }
            AdditionalAction additionalAction = (AdditionalAction) obj;
            return L.f(this.f169767b, additionalAction.f169767b) && L.f(this.f169768c, additionalAction.f169768c);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f169767b;
            return this.f169768c.hashCode() + ((attributedText == null ? 0 : attributedText.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "AdditionalAction(info=" + this.f169767b + ", button=" + this.f169768c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f169767b, i12);
            this.f169768c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: ImportantAddressesSelectionData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData$Address;", "Landroid/os/Parcelable;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Address implements Parcelable {

        @k
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f169776b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f169777c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f169778d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f169779e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f169780f;

        /* compiled from: ImportantAddressesSelectionData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                return new Address(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i12) {
                return new Address[i12];
            }
        }

        public Address(int i12, @k String str, @k String str2, boolean z12, boolean z13) {
            this.f169776b = i12;
            this.f169777c = str;
            this.f169778d = str2;
            this.f169779e = z12;
            this.f169780f = z13;
        }

        public static Address a(Address address, boolean z12, boolean z13, int i12) {
            int i13 = address.f169776b;
            String str = address.f169777c;
            String str2 = address.f169778d;
            if ((i12 & 8) != 0) {
                z12 = address.f169779e;
            }
            boolean z14 = z12;
            if ((i12 & 16) != 0) {
                z13 = address.f169780f;
            }
            address.getClass();
            return new Address(i13, str, str2, z14, z13);
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
            return this.f169776b == address.f169776b && L.f(this.f169777c, address.f169777c) && L.f(this.f169778d, address.f169778d) && this.f169779e == address.f169779e && this.f169780f == address.f169780f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f169780f) + r.i(H.d(H.d(Integer.hashCode(this.f169776b) * 31, 31, this.f169777c), 31, this.f169778d), 31, this.f169779e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Address(id=");
            sb2.append(this.f169776b);
            sb2.append(", title=");
            sb2.append(this.f169777c);
            sb2.append(", location=");
            sb2.append(this.f169778d);
            sb2.append(", checked=");
            sb2.append(this.f169779e);
            sb2.append(", enabled=");
            return r.x(sb2, this.f169780f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f169776b);
            parcel.writeString(this.f169777c);
            parcel.writeString(this.f169778d);
            parcel.writeInt(this.f169779e ? 1 : 0);
            parcel.writeInt(this.f169780f ? 1 : 0);
        }
    }

    /* compiled from: ImportantAddressesSelectionData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/domain/model/ImportantAddressesSelectionData$Button;", "Landroid/os/Parcelable;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f169781b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f169782c;

        /* compiled from: ImportantAddressesSelectionData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k String str2) {
            this.f169781b = str;
            this.f169782c = str2;
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
            return L.f(this.f169781b, button.f169781b) && L.f(this.f169782c, button.f169782c);
        }

        public final int hashCode() {
            return this.f169782c.hashCode() + (this.f169781b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f169781b);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f169782c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f169781b);
            parcel.writeString(this.f169782c);
        }
    }

    /* compiled from: ImportantAddressesSelectionData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImportantAddressesSelectionData> {
        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Address.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImportantAddressesSelectionData(string, string2, arrayList, parcel.readInt(), AdditionalAction.CREATOR.createFromParcel(parcel), Button.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImportantAddressesSelectionData[] newArray(int i12) {
            return new ImportantAddressesSelectionData[i12];
        }
    }

    public ImportantAddressesSelectionData(@k String str, @l String str2, @k List<Address> list, int i12, @k AdditionalAction additionalAction, @k Button button, @k String str3) {
        this.f169760b = str;
        this.f169761c = str2;
        this.f169762d = list;
        this.f169763e = i12;
        this.f169764f = additionalAction;
        this.f169765g = button;
        this.f169766h = str3;
    }

    public static ImportantAddressesSelectionData a(ImportantAddressesSelectionData importantAddressesSelectionData, ArrayList arrayList) {
        String str = importantAddressesSelectionData.f169760b;
        String str2 = importantAddressesSelectionData.f169761c;
        int i12 = importantAddressesSelectionData.f169763e;
        AdditionalAction additionalAction = importantAddressesSelectionData.f169764f;
        Button button = importantAddressesSelectionData.f169765g;
        String str3 = importantAddressesSelectionData.f169766h;
        importantAddressesSelectionData.getClass();
        return new ImportantAddressesSelectionData(str, str2, arrayList, i12, additionalAction, button, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportantAddressesSelectionData)) {
            return false;
        }
        ImportantAddressesSelectionData importantAddressesSelectionData = (ImportantAddressesSelectionData) obj;
        return L.f(this.f169760b, importantAddressesSelectionData.f169760b) && L.f(this.f169761c, importantAddressesSelectionData.f169761c) && L.f(this.f169762d, importantAddressesSelectionData.f169762d) && this.f169763e == importantAddressesSelectionData.f169763e && L.f(this.f169764f, importantAddressesSelectionData.f169764f) && L.f(this.f169765g, importantAddressesSelectionData.f169765g) && L.f(this.f169766h, importantAddressesSelectionData.f169766h);
    }

    public final int hashCode() {
        int iHashCode = this.f169760b.hashCode() * 31;
        String str = this.f169761c;
        return this.f169766h.hashCode() + ((this.f169765g.hashCode() + ((this.f169764f.hashCode() + r.e(this.f169763e, C23088b.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f169762d), 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImportantAddressesSelectionData(dialogTitle=");
        sb2.append(this.f169760b);
        sb2.append(", constraintWarning=");
        sb2.append(this.f169761c);
        sb2.append(", addressList=");
        sb2.append(this.f169762d);
        sb2.append(", realtyAddressMaxCount=");
        sb2.append(this.f169763e);
        sb2.append(", additionalAction=");
        sb2.append(this.f169764f);
        sb2.append(", dialogButton=");
        sb2.append(this.f169765g);
        sb2.append(", xGeoSession=");
        return C22026a.c(sb2, this.f169766h, ')');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169760b);
        parcel.writeString(this.f169761c);
        ?? r02 = this.f169762d;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            ((Address) it.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f169763e);
        this.f169764f.writeToParcel(parcel, i12);
        this.f169765g.writeToParcel(parcel, i12);
        parcel.writeString(this.f169766h);
    }
}
