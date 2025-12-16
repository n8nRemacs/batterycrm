package com.avito.android.checkout.ui.items.promocode;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.checkout.data.CheckoutPromoCodeState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutPromoCodeItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/ui/items/promocode/CheckoutPromoCodeItem;", "Lcom/avito/conveyor_item/a;", "Button", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutPromoCodeItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f118439b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f118440c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f118441d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CheckoutPromoCodeState f118442e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f118443f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f118444g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f118445h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f118446i;

    public CheckoutPromoCodeItem(@Y61.k AttributedText attributedText, @l String str, @l String str2, @Y61.k CheckoutPromoCodeState checkoutPromoCodeState, @l String str3, @Y61.k Button button, boolean z12, boolean z13) {
        this.f118439b = attributedText;
        this.f118440c = str;
        this.f118441d = str2;
        this.f118442e = checkoutPromoCodeState;
        this.f118443f = str3;
        this.f118444g = button;
        this.f118445h = z12;
        this.f118446i = z13;
    }

    public static CheckoutPromoCodeItem a(CheckoutPromoCodeItem checkoutPromoCodeItem, String str, boolean z12, int i12) {
        CheckoutPromoCodeState checkoutPromoCodeState = CheckoutPromoCodeState.f118138b;
        checkoutPromoCodeItem.getClass();
        AttributedText attributedText = checkoutPromoCodeItem.f118439b;
        String str2 = checkoutPromoCodeItem.f118440c;
        if ((i12 & 8) != 0) {
            str = checkoutPromoCodeItem.f118441d;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            checkoutPromoCodeState = checkoutPromoCodeItem.f118442e;
        }
        CheckoutPromoCodeState checkoutPromoCodeState2 = checkoutPromoCodeState;
        String str4 = (i12 & 32) != 0 ? checkoutPromoCodeItem.f118443f : null;
        Button button = checkoutPromoCodeItem.f118444g;
        boolean z13 = checkoutPromoCodeItem.f118445h;
        if ((i12 & 256) != 0) {
            z12 = checkoutPromoCodeItem.f118446i;
        }
        checkoutPromoCodeItem.getClass();
        return new CheckoutPromoCodeItem(attributedText, str2, str3, checkoutPromoCodeState2, str4, button, z13, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutPromoCodeItem)) {
            return false;
        }
        CheckoutPromoCodeItem checkoutPromoCodeItem = (CheckoutPromoCodeItem) obj;
        checkoutPromoCodeItem.getClass();
        return L.f(this.f118439b, checkoutPromoCodeItem.f118439b) && L.f(this.f118440c, checkoutPromoCodeItem.f118440c) && L.f(this.f118441d, checkoutPromoCodeItem.f118441d) && this.f118442e == checkoutPromoCodeItem.f118442e && L.f(this.f118443f, checkoutPromoCodeItem.f118443f) && this.f118444g.equals(checkoutPromoCodeItem.f118444g) && this.f118445h == checkoutPromoCodeItem.f118445h && this.f118446i == checkoutPromoCodeItem.f118446i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF95530b() {
        return -843795037;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF116595b() {
        return "key_checkout_promocode";
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(-387842371, 31, this.f118439b);
        String str = this.f118440c;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f118441d;
        int iHashCode2 = (this.f118442e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f118443f;
        return Boolean.hashCode(this.f118446i) + r.i((this.f118444g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.f118445h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckoutPromoCodeItem(stringId=key_checkout_promocode, title=");
        sb2.append(this.f118439b);
        sb2.append(", placeholder=");
        sb2.append(this.f118440c);
        sb2.append(", promoCode=");
        sb2.append(this.f118441d);
        sb2.append(", state=");
        sb2.append(this.f118442e);
        sb2.append(", message=");
        sb2.append(this.f118443f);
        sb2.append(", button=");
        sb2.append(this.f118444g);
        sb2.append(", isFullFillLine=");
        sb2.append(this.f118445h);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f118446i, ')');
    }

    /* compiled from: CheckoutPromoCodeItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/ui/items/promocode/CheckoutPromoCodeItem$Button;", "Landroid/os/Parcelable;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f118447b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f118448c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f118449d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Boolean f118450e;

        /* compiled from: CheckoutPromoCodeItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Button.class.getClassLoader());
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Button(string, deepLink, string2, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@Y61.k String str, @l DeepLink deepLink, @l String str2, @l Boolean bool) {
            this.f118447b = str;
            this.f118448c = deepLink;
            this.f118449d = str2;
            this.f118450e = bool;
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
            return L.f(this.f118447b, button.f118447b) && L.f(this.f118448c, button.f118448c) && L.f(this.f118449d, button.f118449d) && L.f(this.f118450e, button.f118450e);
        }

        public final int hashCode() {
            int iHashCode = this.f118447b.hashCode() * 31;
            DeepLink deepLink = this.f118448c;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str = this.f118449d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f118450e;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f118447b);
            sb2.append(", deeplink=");
            sb2.append(this.f118448c);
            sb2.append(", style=");
            sb2.append(this.f118449d);
            sb2.append(", isEnabled=");
            return C0.g(sb2, this.f118450e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f118447b);
            parcel.writeParcelable(this.f118448c, i12);
            parcel.writeString(this.f118449d);
            Boolean bool = this.f118450e;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ Button(String str, DeepLink deepLink, String str2, Boolean bool, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool);
        }
    }
}
