package com.avito.android.autoteka.items.skeleton.payment;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentSkeletonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/skeleton/payment/PaymentSkeletonItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentSkeletonItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PaymentSkeletonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97017b;

    /* compiled from: PaymentSkeletonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentSkeletonItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentSkeletonItem createFromParcel(Parcel parcel) {
            return new PaymentSkeletonItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentSkeletonItem[] newArray(int i12) {
            return new PaymentSkeletonItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSkeletonItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF95199b() {
        return this.f97017b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f97017b);
    }

    public PaymentSkeletonItem(@k String str) {
        this.f97017b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentSkeletonItem(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_PAYMENT_SKELETON";
        }
        this(str);
    }
}
