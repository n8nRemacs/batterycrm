package com.avito.android.travel_payment_methods.items.payment_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.travel_payment_methods.model.PaymentMethod;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/payment_method/PaymentMethodItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentMethodItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<PaymentMethodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f302516b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PaymentMethod f302517c;

    /* compiled from: PaymentMethodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethodItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodItem createFromParcel(Parcel parcel) {
            return new PaymentMethodItem(parcel.readString(), PaymentMethod.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodItem[] newArray(int i12) {
            return new PaymentMethodItem[i12];
        }
    }

    public PaymentMethodItem(@Y61.k String str, @Y61.k PaymentMethod paymentMethod) {
        this.f302516b = str;
        this.f302517c = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodItem)) {
            return false;
        }
        PaymentMethodItem paymentMethodItem = (PaymentMethodItem) obj;
        return L.f(this.f302516b, paymentMethodItem.f302516b) && L.f(this.f302517c, paymentMethodItem.f302517c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF300857b() {
        return this.f302516b;
    }

    public final int hashCode() {
        return this.f302517c.hashCode() + (this.f302516b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "PaymentMethodItem(stringId=" + this.f302516b + ", method=" + this.f302517c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f302516b);
        this.f302517c.writeToParcel(parcel, i12);
    }
}
