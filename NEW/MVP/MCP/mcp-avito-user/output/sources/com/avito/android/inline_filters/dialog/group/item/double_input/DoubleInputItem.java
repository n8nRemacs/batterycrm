package com.avito.android.inline_filters.dialog.group.item.double_input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DoubleInputItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/double_input/DoubleInputItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DoubleInputItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<DoubleInputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f171574b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Filter f171575c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InlineFilterValue.InlineFilterNumericRangeValue f171576d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f171577e;

    /* compiled from: DoubleInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DoubleInputItem> {
        @Override // android.os.Parcelable.Creator
        public final DoubleInputItem createFromParcel(Parcel parcel) {
            return new DoubleInputItem(parcel.readString(), (Filter) parcel.readParcelable(DoubleInputItem.class.getClassLoader()), (InlineFilterValue.InlineFilterNumericRangeValue) parcel.readParcelable(DoubleInputItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DoubleInputItem[] newArray(int i12) {
            return new DoubleInputItem[i12];
        }
    }

    public DoubleInputItem(@k String str, @k Filter filter, @l InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue, boolean z12) {
        this.f171574b = str;
        this.f171575c = filter;
        this.f171576d = inlineFilterNumericRangeValue;
        this.f171577e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleInputItem)) {
            return false;
        }
        DoubleInputItem doubleInputItem = (DoubleInputItem) obj;
        return L.f(this.f171574b, doubleInputItem.f171574b) && L.f(this.f171575c, doubleInputItem.f171575c) && L.f(this.f171576d, doubleInputItem.f171576d) && this.f171577e == doubleInputItem.f171577e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171574b() {
        return this.f171574b;
    }

    public final int hashCode() {
        int iHashCode = (this.f171575c.hashCode() + (this.f171574b.hashCode() * 31)) * 31;
        InlineFilterValue.InlineFilterNumericRangeValue inlineFilterNumericRangeValue = this.f171576d;
        return Boolean.hashCode(this.f171577e) + ((iHashCode + (inlineFilterNumericRangeValue == null ? 0 : inlineFilterNumericRangeValue.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DoubleInputItem(stringId=");
        sb2.append(this.f171574b);
        sb2.append(", filter=");
        sb2.append(this.f171575c);
        sb2.append(", value=");
        sb2.append(this.f171576d);
        sb2.append(", autofocus=");
        return r.x(sb2, this.f171577e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f171574b);
        parcel.writeParcelable(this.f171575c, i12);
        parcel.writeParcelable(this.f171576d, i12);
        parcel.writeInt(this.f171577e ? 1 : 0);
    }
}
