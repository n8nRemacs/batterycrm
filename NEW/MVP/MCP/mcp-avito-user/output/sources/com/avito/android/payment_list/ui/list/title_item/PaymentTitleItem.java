package com.avito.android.payment_list.ui.list.title_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment_list/ui/list/title_item/PaymentTitleItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PaymentTitleItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PaymentTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215074b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f215075c;

    /* compiled from: PaymentTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentTitleItem createFromParcel(Parcel parcel) {
            return new PaymentTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentTitleItem[] newArray(int i12) {
            return new PaymentTitleItem[i12];
        }
    }

    public PaymentTitleItem(@k String str, @k String str2) {
        this.f215074b = str;
        this.f215075c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTitleItem)) {
            return false;
        }
        PaymentTitleItem paymentTitleItem = (PaymentTitleItem) obj;
        return L.f(this.f215074b, paymentTitleItem.f215074b) && L.f(this.f215075c, paymentTitleItem.f215075c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return getF215050i().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215050i() {
        return this.f215074b;
    }

    public final int hashCode() {
        return this.f215075c.hashCode() + (this.f215074b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentTitleItem(stringId=");
        sb2.append(this.f215074b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f215075c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215074b);
        parcel.writeString(this.f215075c);
    }
}
