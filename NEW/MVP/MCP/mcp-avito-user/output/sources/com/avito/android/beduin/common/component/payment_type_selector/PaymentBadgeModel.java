package com.avito.android.beduin.common.component.payment_type_selector;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPaymentMethodSelectorModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentBadgeModel implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentBadgeModel> CREATOR = new a();

    @l
    private final UniversalColor color;

    @l
    private final String style;

    @k
    private final String text;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinPaymentMethodSelectorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentBadgeModel> {
        @Override // android.os.Parcelable.Creator
        public final PaymentBadgeModel createFromParcel(Parcel parcel) {
            return new PaymentBadgeModel(parcel.readString(), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), parcel.readString(), (UniversalColor) parcel.readParcelable(PaymentBadgeModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentBadgeModel[] newArray(int i12) {
            return new PaymentBadgeModel[i12];
        }
    }

    public PaymentBadgeModel(@k String str, @l BeduinComponentTheme beduinComponentTheme, @l String str2, @l UniversalColor universalColor) {
        this.text = str;
        this.theme = beduinComponentTheme;
        this.style = str2;
        this.color = universalColor;
    }

    public static /* synthetic */ PaymentBadgeModel copy$default(PaymentBadgeModel paymentBadgeModel, String str, BeduinComponentTheme beduinComponentTheme, String str2, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = paymentBadgeModel.text;
        }
        if ((i12 & 2) != 0) {
            beduinComponentTheme = paymentBadgeModel.theme;
        }
        if ((i12 & 4) != 0) {
            str2 = paymentBadgeModel.style;
        }
        if ((i12 & 8) != 0) {
            universalColor = paymentBadgeModel.color;
        }
        return paymentBadgeModel.copy(str, beduinComponentTheme, str2, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final PaymentBadgeModel copy(@k String text, @l BeduinComponentTheme theme, @l String style, @l UniversalColor color) {
        return new PaymentBadgeModel(text, theme, style, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentBadgeModel)) {
            return false;
        }
        PaymentBadgeModel paymentBadgeModel = (PaymentBadgeModel) other;
        return L.f(this.text, paymentBadgeModel.text) && this.theme == paymentBadgeModel.theme && L.f(this.style, paymentBadgeModel.style) && L.f(this.color, paymentBadgeModel.color);
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode3 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentBadgeModel(text=");
        sb2.append(this.text);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.style);
        parcel.writeParcelable(this.color, flags);
    }

    public /* synthetic */ PaymentBadgeModel(String str, BeduinComponentTheme beduinComponentTheme, String str2, UniversalColor universalColor, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : beduinComponentTheme, str2, universalColor);
    }
}
