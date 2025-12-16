package com.avito.android.delivery_combined_buttons_public;

import Ev.InterfaceC13530a;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtons.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/CartButton;", "Landroid/os/Parcelable;", "AddToCartButton", "GoToCartButton", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CartButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AddToCartButton f134935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GoToCartButton f134936c;

    /* renamed from: d, reason: collision with root package name */
    public final int f134937d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134938e;

    /* compiled from: CombinedButtons.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/CartButton$AddToCartButton;", "LEv/a;", "Landroid/os/Parcelable;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddToCartButton implements InterfaceC13530a, Parcelable {

        @k
        public static final Parcelable.Creator<AddToCartButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f134939b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f134940c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f134941d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f134942e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Boolean f134943f;

        /* compiled from: CombinedButtons.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddToCartButton> {
            @Override // android.os.Parcelable.Creator
            public final AddToCartButton createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AddToCartButton(string, string2, string3, string4, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final AddToCartButton[] newArray(int i12) {
                return new AddToCartButton[i12];
            }
        }

        public AddToCartButton(@k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool) {
            this.f134939b = str;
            this.f134940c = str2;
            this.f134941d = str3;
            this.f134942e = str4;
            this.f134943f = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddToCartButton)) {
                return false;
            }
            AddToCartButton addToCartButton = (AddToCartButton) obj;
            return L.f(this.f134939b, addToCartButton.f134939b) && L.f(this.f134940c, addToCartButton.f134940c) && L.f(this.f134941d, addToCartButton.f134941d) && L.f(this.f134942e, addToCartButton.f134942e) && L.f(this.f134943f, addToCartButton.f134943f);
        }

        @Override // Ev.InterfaceC13530a
        @k
        /* renamed from: getStyle, reason: from getter */
        public final String getF134944b() {
            return this.f134939b;
        }

        @Override // Ev.InterfaceC13530a
        @l
        /* renamed from: getSubtitle, reason: from getter */
        public final String getF134947e() {
            return this.f134942e;
        }

        @Override // Ev.InterfaceC13530a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF134946d() {
            return this.f134941d;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f134939b.hashCode() * 31, 31, this.f134940c), 31, this.f134941d);
            String str = this.f134942e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f134943f;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Override // Ev.InterfaceC13530a
        @l
        /* renamed from: isLoading, reason: from getter */
        public final Boolean getF134948f() {
            return this.f134943f;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddToCartButton(style=");
            sb2.append(this.f134939b);
            sb2.append(", theme=");
            sb2.append(this.f134940c);
            sb2.append(", title=");
            sb2.append(this.f134941d);
            sb2.append(", subtitle=");
            sb2.append(this.f134942e);
            sb2.append(", isLoading=");
            return C0.g(sb2, this.f134943f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f134939b);
            parcel.writeString(this.f134940c);
            parcel.writeString(this.f134941d);
            parcel.writeString(this.f134942e);
            Boolean bool = this.f134943f;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: CombinedButtons.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/CartButton$GoToCartButton;", "LEv/a;", "Landroid/os/Parcelable;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GoToCartButton implements InterfaceC13530a, Parcelable {

        @k
        public static final Parcelable.Creator<GoToCartButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f134944b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f134945c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f134946d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f134947e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Boolean f134948f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final DeepLink f134949g;

        /* compiled from: CombinedButtons.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GoToCartButton> {
            @Override // android.os.Parcelable.Creator
            public final GoToCartButton createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new GoToCartButton(string, string2, string3, string4, boolValueOf, (DeepLink) parcel.readParcelable(GoToCartButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final GoToCartButton[] newArray(int i12) {
                return new GoToCartButton[i12];
            }
        }

        public GoToCartButton(@k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool, @k DeepLink deepLink) {
            this.f134944b = str;
            this.f134945c = str2;
            this.f134946d = str3;
            this.f134947e = str4;
            this.f134948f = bool;
            this.f134949g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoToCartButton)) {
                return false;
            }
            GoToCartButton goToCartButton = (GoToCartButton) obj;
            return L.f(this.f134944b, goToCartButton.f134944b) && L.f(this.f134945c, goToCartButton.f134945c) && L.f(this.f134946d, goToCartButton.f134946d) && L.f(this.f134947e, goToCartButton.f134947e) && L.f(this.f134948f, goToCartButton.f134948f) && L.f(this.f134949g, goToCartButton.f134949g);
        }

        @Override // Ev.InterfaceC13530a
        @k
        /* renamed from: getStyle, reason: from getter */
        public final String getF134944b() {
            return this.f134944b;
        }

        @Override // Ev.InterfaceC13530a
        @l
        /* renamed from: getSubtitle, reason: from getter */
        public final String getF134947e() {
            return this.f134947e;
        }

        @Override // Ev.InterfaceC13530a
        @k
        /* renamed from: getTitle, reason: from getter */
        public final String getF134946d() {
            return this.f134946d;
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f134944b.hashCode() * 31, 31, this.f134945c), 31, this.f134946d);
            String str = this.f134947e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f134948f;
            return this.f134949g.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        @Override // Ev.InterfaceC13530a
        @l
        /* renamed from: isLoading, reason: from getter */
        public final Boolean getF134948f() {
            return this.f134948f;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoToCartButton(style=");
            sb2.append(this.f134944b);
            sb2.append(", theme=");
            sb2.append(this.f134945c);
            sb2.append(", title=");
            sb2.append(this.f134946d);
            sb2.append(", subtitle=");
            sb2.append(this.f134947e);
            sb2.append(", isLoading=");
            sb2.append(this.f134948f);
            sb2.append(", onTapDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f134949g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f134944b);
            parcel.writeString(this.f134945c);
            parcel.writeString(this.f134946d);
            parcel.writeString(this.f134947e);
            Boolean bool = this.f134948f;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.f134949g, i12);
        }
    }

    /* compiled from: CombinedButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartButton> {
        @Override // android.os.Parcelable.Creator
        public final CartButton createFromParcel(Parcel parcel) {
            return new CartButton(AddToCartButton.CREATOR.createFromParcel(parcel), GoToCartButton.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CartButton[] newArray(int i12) {
            return new CartButton[i12];
        }
    }

    public CartButton(@k AddToCartButton addToCartButton, @k GoToCartButton goToCartButton, int i12, int i13) {
        this.f134935b = addToCartButton;
        this.f134936c = goToCartButton;
        this.f134937d = i12;
        this.f134938e = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartButton)) {
            return false;
        }
        CartButton cartButton = (CartButton) obj;
        return L.f(this.f134935b, cartButton.f134935b) && L.f(this.f134936c, cartButton.f134936c) && this.f134937d == cartButton.f134937d && this.f134938e == cartButton.f134938e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134938e) + r.e(this.f134937d, (this.f134936c.hashCode() + (this.f134935b.hashCode() * 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartButton(addToCartButton=");
        sb2.append(this.f134935b);
        sb2.append(", goToCartButton=");
        sb2.append(this.f134936c);
        sb2.append(", maxQuantity=");
        sb2.append(this.f134937d);
        sb2.append(", quantity=");
        return r.t(sb2, this.f134938e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f134935b.writeToParcel(parcel, i12);
        this.f134936c.writeToParcel(parcel, i12);
        parcel.writeInt(this.f134937d);
        parcel.writeInt(this.f134938e);
    }
}
