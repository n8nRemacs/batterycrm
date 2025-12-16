package com.avito.android.inline_filters.dialog.group.item.multiselect;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiselectItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/item/multiselect/MultiselectItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MultiselectItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MultiselectItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f171602b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Filter f171603c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final InlineFilterValue.InlineFilterMultiSelectValue f171604d;

    /* compiled from: MultiselectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiselectItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiselectItem createFromParcel(Parcel parcel) {
            return new MultiselectItem(parcel.readString(), (Filter) parcel.readParcelable(MultiselectItem.class.getClassLoader()), (InlineFilterValue.InlineFilterMultiSelectValue) parcel.readParcelable(MultiselectItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MultiselectItem[] newArray(int i12) {
            return new MultiselectItem[i12];
        }
    }

    public MultiselectItem(@k String str, @k Filter filter, @l InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue) {
        this.f171602b = str;
        this.f171603c = filter;
        this.f171604d = inlineFilterMultiSelectValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiselectItem)) {
            return false;
        }
        MultiselectItem multiselectItem = (MultiselectItem) obj;
        return L.f(this.f171602b, multiselectItem.f171602b) && L.f(this.f171603c, multiselectItem.f171603c) && L.f(this.f171604d, multiselectItem.f171604d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78718j() {
        return this.f171602b;
    }

    public final int hashCode() {
        int iHashCode = (this.f171603c.hashCode() + (this.f171602b.hashCode() * 31)) * 31;
        InlineFilterValue.InlineFilterMultiSelectValue inlineFilterMultiSelectValue = this.f171604d;
        return iHashCode + (inlineFilterMultiSelectValue == null ? 0 : inlineFilterMultiSelectValue.hashCode());
    }

    @k
    public final String toString() {
        return "MultiselectItem(stringId=" + this.f171602b + ", filter=" + this.f171603c + ", value=" + this.f171604d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f171602b);
        parcel.writeParcelable(this.f171603c, i12);
        parcel.writeParcelable(this.f171604d, i12);
    }
}
