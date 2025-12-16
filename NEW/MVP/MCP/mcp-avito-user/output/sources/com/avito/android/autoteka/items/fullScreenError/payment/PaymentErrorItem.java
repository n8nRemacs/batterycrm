package com.avito.android.autoteka.items.fullScreenError.payment;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/payment/PaymentErrorItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentErrorItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PaymentErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96777b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f96778c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f96779d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f96780e;

    /* compiled from: PaymentErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final PaymentErrorItem createFromParcel(Parcel parcel) {
            return new PaymentErrorItem(parcel.readString(), (PrintableText) parcel.readParcelable(PaymentErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(PaymentErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(PaymentErrorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentErrorItem[] newArray(int i12) {
            return new PaymentErrorItem[i12];
        }
    }

    public PaymentErrorItem(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3) {
        this.f96777b = str;
        this.f96778c = printableText;
        this.f96779d = printableText2;
        this.f96780e = printableText3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85286b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96777b() {
        return this.f96777b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96777b);
        parcel.writeParcelable(this.f96778c, i12);
        parcel.writeParcelable(this.f96779d, i12);
        parcel.writeParcelable(this.f96780e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaymentErrorItem(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_PAYMENT_ERROR";
        }
        this(str, printableText, printableText2, printableText3);
    }
}
