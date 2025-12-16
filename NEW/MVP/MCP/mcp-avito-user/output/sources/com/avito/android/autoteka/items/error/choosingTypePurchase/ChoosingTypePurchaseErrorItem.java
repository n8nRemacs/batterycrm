package com.avito.android.autoteka.items.error.choosingTypePurchase;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChoosingTypePurchaseErrorItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/error/choosingTypePurchase/ChoosingTypePurchaseErrorItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChoosingTypePurchaseErrorItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ChoosingTypePurchaseErrorItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96755b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f96756c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f96757d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f96758e;

    /* compiled from: ChoosingTypePurchaseErrorItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChoosingTypePurchaseErrorItem> {
        @Override // android.os.Parcelable.Creator
        public final ChoosingTypePurchaseErrorItem createFromParcel(Parcel parcel) {
            return new ChoosingTypePurchaseErrorItem(parcel.readString(), (PrintableText) parcel.readParcelable(ChoosingTypePurchaseErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(ChoosingTypePurchaseErrorItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(ChoosingTypePurchaseErrorItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChoosingTypePurchaseErrorItem[] newArray(int i12) {
            return new ChoosingTypePurchaseErrorItem[i12];
        }
    }

    public ChoosingTypePurchaseErrorItem(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3) {
        this.f96755b = str;
        this.f96756c = printableText;
        this.f96757d = printableText2;
        this.f96758e = printableText3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoosingTypePurchaseErrorItem)) {
            return false;
        }
        ChoosingTypePurchaseErrorItem choosingTypePurchaseErrorItem = (ChoosingTypePurchaseErrorItem) obj;
        return L.f(this.f96755b, choosingTypePurchaseErrorItem.f96755b) && L.f(this.f96756c, choosingTypePurchaseErrorItem.f96756c) && L.f(this.f96757d, choosingTypePurchaseErrorItem.f96757d) && L.f(this.f96758e, choosingTypePurchaseErrorItem.f96758e);
    }

    @Override // TV0.a
    public final long getId() {
        return getF291445k().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF291445k() {
        return this.f96755b;
    }

    public final int hashCode() {
        return this.f96758e.hashCode() + com.avito.android.actions_sheet.a.f(this.f96757d, com.avito.android.actions_sheet.a.f(this.f96756c, this.f96755b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChoosingTypePurchaseErrorItem(stringId=");
        sb2.append(this.f96755b);
        sb2.append(", title=");
        sb2.append(this.f96756c);
        sb2.append(", text=");
        sb2.append(this.f96757d);
        sb2.append(", buttonText=");
        return AK.c.m(sb2, this.f96758e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96755b);
        parcel.writeParcelable(this.f96756c, i12);
        parcel.writeParcelable(this.f96757d, i12);
        parcel.writeParcelable(this.f96758e, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChoosingTypePurchaseErrorItem(String str, PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_CHOOSING_TYPE_PURCHASE_ERROR";
        }
        this(str, printableText, printableText2, printableText3);
    }
}
