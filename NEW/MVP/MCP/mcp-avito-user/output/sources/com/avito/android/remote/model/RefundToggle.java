package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/RefundToggle;", "Landroid/os/Parcelable;", "", "title", "value", "", "Lcom/avito/android/remote/model/RefundToggle$Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/RefundToggle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getValue", "Ljava/util/List;", "getButtons", "Button", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RefundToggle implements Parcelable {

    @k
    public static final Parcelable.Creator<RefundToggle> CREATOR = new Creator();

    @c("buttons")
    @k
    private final List<Button> buttons;

    @c("title")
    @k
    private final String title;

    @c("value")
    @k
    private final String value;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/RefundToggle$Button;", "Landroid/os/Parcelable;", "", "id", "discount", "priceWithDiscount", "text", "totalPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/RefundToggle$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getDiscount", "getPriceWithDiscount", "getText", "getTotalPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTooltip", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("discount")
        @l
        private final String discount;

        @c("id")
        @k
        private final String id;

        @c("priceWithDiscount")
        @l
        private final String priceWithDiscount;

        @c("text")
        @k
        private final String text;

        @c(TooltipAttribute.ATTRIBUTE_TYPE)
        @k
        private final DeepLink tooltip;

        @c("totalPrice")
        @k
        private final String totalPrice;

        /* compiled from: StrBookingCalculateDetailsResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l String str2, @l String str3, @k String str4, @k String str5, @k DeepLink deepLink) {
            this.id = str;
            this.discount = str2;
            this.priceWithDiscount = str3;
            this.text = str4;
            this.totalPrice = str5;
            this.tooltip = deepLink;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, String str4, String str5, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.id;
            }
            if ((i12 & 2) != 0) {
                str2 = button.discount;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = button.priceWithDiscount;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = button.text;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                str5 = button.totalPrice;
            }
            String str9 = str5;
            if ((i12 & 32) != 0) {
                deepLink = button.tooltip;
            }
            return button.copy(str, str6, str7, str8, str9, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getDiscount() {
            return this.discount;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getPriceWithDiscount() {
            return this.priceWithDiscount;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final DeepLink getTooltip() {
            return this.tooltip;
        }

        @k
        public final Button copy(@k String id2, @l String discount, @l String priceWithDiscount, @k String text, @k String totalPrice, @k DeepLink tooltip) {
            return new Button(id2, discount, priceWithDiscount, text, totalPrice, tooltip);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.id, button.id) && L.f(this.discount, button.discount) && L.f(this.priceWithDiscount, button.priceWithDiscount) && L.f(this.text, button.text) && L.f(this.totalPrice, button.totalPrice) && L.f(this.tooltip, button.tooltip);
        }

        @l
        public final String getDiscount() {
            return this.discount;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getPriceWithDiscount() {
            return this.priceWithDiscount;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final DeepLink getTooltip() {
            return this.tooltip;
        }

        @k
        public final String getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.discount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.priceWithDiscount;
            return this.tooltip.hashCode() + H.d(H.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.text), 31, this.totalPrice);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(id=");
            sb2.append(this.id);
            sb2.append(", discount=");
            sb2.append(this.discount);
            sb2.append(", priceWithDiscount=");
            sb2.append(this.priceWithDiscount);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", totalPrice=");
            sb2.append(this.totalPrice);
            sb2.append(", tooltip=");
            return a.v(sb2, this.tooltip, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.discount);
            parcel.writeString(this.priceWithDiscount);
            parcel.writeString(this.text);
            parcel.writeString(this.totalPrice);
            parcel.writeParcelable(this.tooltip, flags);
        }
    }

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RefundToggle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RefundToggle createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Button.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RefundToggle(string, string2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RefundToggle[] newArray(int i12) {
            return new RefundToggle[i12];
        }
    }

    public RefundToggle(@k String str, @k String str2, @k List<Button> list) {
        this.title = str;
        this.value = str2;
        this.buttons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RefundToggle copy$default(RefundToggle refundToggle, String str, String str2, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = refundToggle.title;
        }
        if ((i12 & 2) != 0) {
            str2 = refundToggle.value;
        }
        if ((i12 & 4) != 0) {
            list = refundToggle.buttons;
        }
        return refundToggle.copy(str, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final List<Button> component3() {
        return this.buttons;
    }

    @k
    public final RefundToggle copy(@k String title, @k String value, @k List<Button> buttons) {
        return new RefundToggle(title, value, buttons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundToggle)) {
            return false;
        }
        RefundToggle refundToggle = (RefundToggle) other;
        return L.f(this.title, refundToggle.title) && L.f(this.value, refundToggle.value) && L.f(this.buttons, refundToggle.buttons);
    }

    @k
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.buttons.hashCode() + H.d(this.title.hashCode() * 31, 31, this.value);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RefundToggle(title=");
        sb2.append(this.title);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.value);
        Iterator itJ = C0.j(this.buttons, parcel);
        while (itJ.hasNext()) {
            ((Button) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
