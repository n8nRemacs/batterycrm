package com.avito.android.guests_selector.items.child;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChildItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/items/child/ChildItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChildItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ChildItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f161471b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f161472c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PrintableText f161473d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f161474e;

    /* compiled from: ChildItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChildItem> {
        @Override // android.os.Parcelable.Creator
        public final ChildItem createFromParcel(Parcel parcel) {
            return new ChildItem(parcel.readInt(), (PrintableText) parcel.readParcelable(ChildItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(ChildItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChildItem[] newArray(int i12) {
            return new ChildItem[i12];
        }
    }

    public ChildItem(int i12, @k PrintableText printableText, @l PrintableText printableText2, @k String str) {
        this.f161471b = i12;
        this.f161472c = printableText;
        this.f161473d = printableText2;
        this.f161474e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItem)) {
            return false;
        }
        ChildItem childItem = (ChildItem) obj;
        return this.f161471b == childItem.f161471b && L.f(this.f161472c, childItem.f161472c) && L.f(this.f161473d, childItem.f161473d) && L.f(this.f161474e, childItem.f161474e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145250b() {
        return this.f161474e;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f161472c, Integer.hashCode(this.f161471b) * 31, 31);
        PrintableText printableText = this.f161473d;
        return this.f161474e.hashCode() + ((iF2 + (printableText == null ? 0 : printableText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChildItem(childId=");
        sb2.append(this.f161471b);
        sb2.append(", title=");
        sb2.append(this.f161472c);
        sb2.append(", description=");
        sb2.append(this.f161473d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f161474e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f161471b);
        parcel.writeParcelable(this.f161472c, i12);
        parcel.writeParcelable(this.f161473d, i12);
        parcel.writeString(this.f161474e);
    }
}
