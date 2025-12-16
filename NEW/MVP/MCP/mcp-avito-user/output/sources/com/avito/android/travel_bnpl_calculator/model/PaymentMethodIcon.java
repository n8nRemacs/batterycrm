package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypes.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethodIcon;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentMethodIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentMethodIcon> CREATOR = new a();

    @c("color")
    @k
    private final UniversalColor color;

    @c("name")
    @k
    private final String name;

    /* compiled from: PaymentTypes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethodIcon> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodIcon createFromParcel(Parcel parcel) {
            return new PaymentMethodIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(PaymentMethodIcon.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodIcon[] newArray(int i12) {
            return new PaymentMethodIcon[i12];
        }
    }

    public PaymentMethodIcon(@k String str, @k UniversalColor universalColor) {
        this.name = str;
        this.color = universalColor;
    }

    @k
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
        if (!(obj instanceof PaymentMethodIcon)) {
            return false;
        }
        PaymentMethodIcon paymentMethodIcon = (PaymentMethodIcon) obj;
        return L.f(this.name, paymentMethodIcon.name) && L.f(this.color, paymentMethodIcon.color);
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.color.hashCode() + (this.name.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentMethodIcon(name=");
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
