package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypes.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u000b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethod;", "Landroid/os/Parcelable;", "", "paymentType", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethodIcon;", "icon", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "", "isSelected", "isNew", "<init>", "(Ljava/lang/String;Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethodIcon;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethodIcon;", "c", "()Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethodIcon;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentMethod implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new a();

    @c("icon")
    @k
    private final PaymentMethodIcon icon;

    @c("isNew")
    @l
    private final Boolean isNew;

    @c("isSelected")
    @l
    private final Boolean isSelected;

    @c("paymentType")
    @k
    private final String paymentType;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: PaymentTypes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            PaymentMethodIcon paymentMethodIconCreateFromParcel = PaymentMethodIcon.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PaymentMethod.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(PaymentMethod.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PaymentMethod(string, paymentMethodIconCreateFromParcel, attributedText, attributedText2, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i12) {
            return new PaymentMethod[i12];
        }
    }

    public PaymentMethod(@k String str, @k PaymentMethodIcon paymentMethodIcon, @k AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool, @l Boolean bool2) {
        this.paymentType = str;
        this.icon = paymentMethodIcon;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.isSelected = bool;
        this.isNew = bool2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final PaymentMethodIcon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return L.f(this.paymentType, paymentMethod.paymentType) && L.f(this.icon, paymentMethod.icon) && L.f(this.title, paymentMethod.title) && L.f(this.subtitle, paymentMethod.subtitle) && L.f(this.isSelected, paymentMethod.isSelected) && L.f(this.isNew, paymentMethod.isNew);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b((this.icon.hashCode() + (this.paymentType.hashCode() * 31)) * 31, 31, this.title);
        AttributedText attributedText = this.subtitle;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isNew;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    /* renamed from: isNew, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentMethod(paymentType=");
        sb2.append(this.paymentType);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", isNew=");
        return C0.g(sb2, this.isNew, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.paymentType);
        this.icon.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.subtitle, i12);
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isNew;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
