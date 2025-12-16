package com.avito.android.guests_selector.items.children_add_button;

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

/* compiled from: ChildrenAddButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/items/children_add_button/ChildrenAddButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChildrenAddButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ChildrenAddButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f161487b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f161488c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161489d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f161490e;

    /* compiled from: ChildrenAddButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChildrenAddButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ChildrenAddButtonItem createFromParcel(Parcel parcel) {
            return new ChildrenAddButtonItem((PrintableText) parcel.readParcelable(ChildrenAddButtonItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(ChildrenAddButtonItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChildrenAddButtonItem[] newArray(int i12) {
            return new ChildrenAddButtonItem[i12];
        }
    }

    public ChildrenAddButtonItem(@k PrintableText printableText, @k PrintableText printableText2, boolean z12, @k String str) {
        this.f161487b = printableText;
        this.f161488c = printableText2;
        this.f161489d = z12;
        this.f161490e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildrenAddButtonItem)) {
            return false;
        }
        ChildrenAddButtonItem childrenAddButtonItem = (ChildrenAddButtonItem) obj;
        return L.f(this.f161487b, childrenAddButtonItem.f161487b) && L.f(this.f161488c, childrenAddButtonItem.f161488c) && this.f161489d == childrenAddButtonItem.f161489d && L.f(this.f161490e, childrenAddButtonItem.f161490e);
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
        return this.f161490e;
    }

    public final int hashCode() {
        return this.f161490e.hashCode() + r.i(com.avito.android.actions_sheet.a.f(this.f161488c, this.f161487b.hashCode() * 31, 31), 31, this.f161489d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChildrenAddButtonItem(title=");
        sb2.append(this.f161487b);
        sb2.append(", description=");
        sb2.append(this.f161488c);
        sb2.append(", isAddButtonEnabled=");
        sb2.append(this.f161489d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f161490e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f161487b, i12);
        parcel.writeParcelable(this.f161488c, i12);
        parcel.writeInt(this.f161489d ? 1 : 0);
        parcel.writeString(this.f161490e);
    }

    public /* synthetic */ ChildrenAddButtonItem(PrintableText printableText, PrintableText printableText2, boolean z12, String str, int i12, C42822w c42822w) {
        this(printableText, printableText2, z12, (i12 & 8) != 0 ? "CHILDREN_ADD_BUTTON_ITEM_STRING_ID" : str);
    }
}
