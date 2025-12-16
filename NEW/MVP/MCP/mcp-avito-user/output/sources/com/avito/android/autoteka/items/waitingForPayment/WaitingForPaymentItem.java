package com.avito.android.autoteka.items.waitingForPayment;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WaitingForPaymentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPayment/WaitingForPaymentItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WaitingForPaymentItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<WaitingForPaymentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97029b;

    /* compiled from: WaitingForPaymentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WaitingForPaymentItem> {
        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentItem createFromParcel(Parcel parcel) {
            return new WaitingForPaymentItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentItem[] newArray(int i12) {
            return new WaitingForPaymentItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WaitingForPaymentItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WaitingForPaymentItem) && L.f(this.f97029b, ((WaitingForPaymentItem) obj).f97029b);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96889b() {
        return this.f97029b;
    }

    public final int hashCode() {
        return this.f97029b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("WaitingForPaymentItem(stringId="), this.f97029b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f97029b);
    }

    public WaitingForPaymentItem(@k String str) {
        this.f97029b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WaitingForPaymentItem(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_WAITING_FOR_PAYMENT";
        }
        this(str);
    }
}
