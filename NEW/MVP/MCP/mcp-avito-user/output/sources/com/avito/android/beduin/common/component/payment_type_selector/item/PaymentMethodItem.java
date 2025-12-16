package com.avito.android.beduin.common.component.payment_type_selector.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.payment_type_selector.PaymentMethodElement;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethodItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/item/PaymentMethodItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentMethodItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PaymentMethodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f101819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PaymentMethodElement f101820c;

    /* compiled from: PaymentMethodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethodItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodItem createFromParcel(Parcel parcel) {
            return new PaymentMethodItem(parcel.readString(), PaymentMethodElement.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodItem[] newArray(int i12) {
            return new PaymentMethodItem[i12];
        }
    }

    public PaymentMethodItem(@k String str, @k PaymentMethodElement paymentMethodElement) {
        this.f101819b = str;
        this.f101820c = paymentMethodElement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodItem)) {
            return false;
        }
        PaymentMethodItem paymentMethodItem = (PaymentMethodItem) obj;
        return L.f(this.f101819b, paymentMethodItem.f101819b) && L.f(this.f101820c, paymentMethodItem.f101820c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96889b() {
        return this.f101819b;
    }

    public final int hashCode() {
        return this.f101820c.hashCode() + (this.f101819b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PaymentMethodItem(stringId=" + this.f101819b + ", element=" + this.f101820c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f101819b);
        this.f101820c.writeToParcel(parcel, i12);
    }
}
