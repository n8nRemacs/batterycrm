package com.avito.android.autoteka.items.fullScreenError.waitingForPaymentError;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WaitingForPaymentErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/fullScreenError/waitingForPaymentError/WaitingForPaymentErrorItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WaitingForPaymentErrorItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<WaitingForPaymentErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96825b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f96826c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f96827d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f96828e;

    /* compiled from: WaitingForPaymentErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WaitingForPaymentErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentErrorItem createFromParcel(Parcel parcel) {
            return new WaitingForPaymentErrorItem(parcel.readString(), (PrintableText) parcel.readParcelable(WaitingForPaymentErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(WaitingForPaymentErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(WaitingForPaymentErrorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WaitingForPaymentErrorItem[] newArray(int i12) {
            return new WaitingForPaymentErrorItem[i12];
        }
    }

    public WaitingForPaymentErrorItem(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3) {
        this.f96825b = str;
        this.f96826c = printableText;
        this.f96827d = printableText2;
        this.f96828e = printableText3;
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
        return this.f96825b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96825b);
        parcel.writeParcelable(this.f96826c, i12);
        parcel.writeParcelable(this.f96827d, i12);
        parcel.writeParcelable(this.f96828e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WaitingForPaymentErrorItem(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_WAITING_FOR_PAYMENT_ERROR";
        }
        this(str, printableText, printableText2, printableText3);
    }
}
