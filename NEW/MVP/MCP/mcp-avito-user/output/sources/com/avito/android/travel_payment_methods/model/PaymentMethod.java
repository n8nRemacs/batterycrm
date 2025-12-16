package com.avito.android.travel_payment_methods.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethod.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_payment_methods/model/PaymentMethod;", "Landroid/os/Parcelable;", "PaymentMethodIcon", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentMethod implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PaymentMethodIcon f302550b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f302551c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f302552d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f302553e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f302554f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f302555g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AttributedText f302556h;

    /* compiled from: PaymentMethod.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/model/PaymentMethod$PaymentMethodIcon;", "Landroid/os/Parcelable;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentMethodIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<PaymentMethodIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UniversalColor f302557b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f302558c;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PaymentMethodIcon> {
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodIcon createFromParcel(Parcel parcel) {
                return new PaymentMethodIcon((UniversalColor) parcel.readParcelable(PaymentMethodIcon.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentMethodIcon[] newArray(int i12) {
                return new PaymentMethodIcon[i12];
            }
        }

        public PaymentMethodIcon(@l UniversalColor universalColor, @l String str) {
            this.f302557b = universalColor;
            this.f302558c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodIcon)) {
                return false;
            }
            PaymentMethodIcon paymentMethodIcon = (PaymentMethodIcon) obj;
            return L.f(this.f302557b, paymentMethodIcon.f302557b) && L.f(this.f302558c, paymentMethodIcon.f302558c);
        }

        public final int hashCode() {
            UniversalColor universalColor = this.f302557b;
            int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
            String str = this.f302558c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentMethodIcon(color=");
            sb2.append(this.f302557b);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f302558c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f302557b, i12);
            parcel.writeString(this.f302558c);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            return new PaymentMethod(PaymentMethodIcon.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PaymentMethod.class.getClassLoader()), (AttributedText) parcel.readParcelable(PaymentMethod.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i12) {
            return new PaymentMethod[i12];
        }
    }

    public PaymentMethod(@k PaymentMethodIcon paymentMethodIcon, boolean z12, boolean z13, @k String str, @k String str2, @l AttributedText attributedText, @k AttributedText attributedText2) {
        this.f302550b = paymentMethodIcon;
        this.f302551c = z12;
        this.f302552d = z13;
        this.f302553e = str;
        this.f302554f = str2;
        this.f302555g = attributedText;
        this.f302556h = attributedText2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return L.f(this.f302550b, paymentMethod.f302550b) && this.f302551c == paymentMethod.f302551c && this.f302552d == paymentMethod.f302552d && L.f(this.f302553e, paymentMethod.f302553e) && L.f(this.f302554f, paymentMethod.f302554f) && L.f(this.f302555g, paymentMethod.f302555g) && L.f(this.f302556h, paymentMethod.f302556h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(r.i(r.i(this.f302550b.hashCode() * 31, 31, this.f302551c), 31, this.f302552d), 31, this.f302553e), 31, this.f302554f);
        AttributedText attributedText = this.f302555g;
        return this.f302556h.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentMethod(icon=");
        sb2.append(this.f302550b);
        sb2.append(", isNew=");
        sb2.append(this.f302551c);
        sb2.append(", isSelected=");
        sb2.append(this.f302552d);
        sb2.append(", paymentType=");
        sb2.append(this.f302553e);
        sb2.append(", planId=");
        sb2.append(this.f302554f);
        sb2.append(", subtitle=");
        sb2.append(this.f302555g);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f302556h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f302550b.writeToParcel(parcel, i12);
        parcel.writeInt(this.f302551c ? 1 : 0);
        parcel.writeInt(this.f302552d ? 1 : 0);
        parcel.writeString(this.f302553e);
        parcel.writeString(this.f302554f);
        parcel.writeParcelable(this.f302555g, i12);
        parcel.writeParcelable(this.f302556h, i12);
    }
}
