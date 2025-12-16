package com.avito.android.guests_selector.items.adults_stepper;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdultsStepperItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/items/adults_stepper/AdultsStepperItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AdultsStepperItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<AdultsStepperItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f161452b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f161453c;

    /* renamed from: d, reason: collision with root package name */
    public final int f161454d;

    /* renamed from: e, reason: collision with root package name */
    public final int f161455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f161456f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f161457g;

    /* compiled from: AdultsStepperItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdultsStepperItem> {
        @Override // android.os.Parcelable.Creator
        public final AdultsStepperItem createFromParcel(Parcel parcel) {
            return new AdultsStepperItem((PrintableText) parcel.readParcelable(AdultsStepperItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(AdultsStepperItem.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdultsStepperItem[] newArray(int i12) {
            return new AdultsStepperItem[i12];
        }
    }

    public AdultsStepperItem(@k PrintableText printableText, @k PrintableText printableText2, int i12, int i13, int i14, @k String str) {
        this.f161452b = printableText;
        this.f161453c = printableText2;
        this.f161454d = i12;
        this.f161455e = i13;
        this.f161456f = i14;
        this.f161457g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdultsStepperItem)) {
            return false;
        }
        AdultsStepperItem adultsStepperItem = (AdultsStepperItem) obj;
        return L.f(this.f161452b, adultsStepperItem.f161452b) && L.f(this.f161453c, adultsStepperItem.f161453c) && this.f161454d == adultsStepperItem.f161454d && this.f161455e == adultsStepperItem.f161455e && this.f161456f == adultsStepperItem.f161456f && L.f(this.f161457g, adultsStepperItem.f161457g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309317b() {
        return this.f161457g;
    }

    public final int hashCode() {
        return this.f161457g.hashCode() + r.e(this.f161456f, r.e(this.f161455e, r.e(this.f161454d, com.avito.android.actions_sheet.a.f(this.f161453c, this.f161452b.hashCode() * 31, 31), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdultsStepperItem(title=");
        sb2.append(this.f161452b);
        sb2.append(", description=");
        sb2.append(this.f161453c);
        sb2.append(", stepperValue=");
        sb2.append(this.f161454d);
        sb2.append(", stepperMinValue=");
        sb2.append(this.f161455e);
        sb2.append(", stepperMaxValue=");
        sb2.append(this.f161456f);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f161457g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f161452b, i12);
        parcel.writeParcelable(this.f161453c, i12);
        parcel.writeInt(this.f161454d);
        parcel.writeInt(this.f161455e);
        parcel.writeInt(this.f161456f);
        parcel.writeString(this.f161457g);
    }

    public /* synthetic */ AdultsStepperItem(PrintableText printableText, PrintableText printableText2, int i12, int i13, int i14, String str, int i15, C42822w c42822w) {
        this(printableText, printableText2, i12, i13, i14, (i15 & 32) != 0 ? "ADULTS_STEPPER_ITEM_STRING_ID" : str);
    }
}
