package com.avito.android.payment_list.ui.list.load_more_item;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: PaymentLoadMoreItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment_list/ui/list/load_more_item/PaymentLoadMoreItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentLoadMoreItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PaymentLoadMoreItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f215037b;

    /* compiled from: PaymentLoadMoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentLoadMoreItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentLoadMoreItem createFromParcel(Parcel parcel) {
            return new PaymentLoadMoreItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentLoadMoreItem[] newArray(int i12) {
            return new PaymentLoadMoreItem[i12];
        }
    }

    public PaymentLoadMoreItem(@k String str) {
        this.f215037b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186614b() {
        return getF215074b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215074b() {
        return this.f215037b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f215037b);
    }
}
