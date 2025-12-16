package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InlineFiltersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/inline_filters/InlineFiltersItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InlineFiltersItem implements ExtendedProfileWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<InlineFiltersItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f154625b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridElementType f154626c;

    /* compiled from: InlineFiltersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InlineFiltersItem> {
        @Override // android.os.Parcelable.Creator
        public final InlineFiltersItem createFromParcel(Parcel parcel) {
            return new InlineFiltersItem(parcel.readString(), (GridElementType) parcel.readParcelable(InlineFiltersItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InlineFiltersItem[] newArray(int i12) {
            return new InlineFiltersItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InlineFiltersItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineFiltersItem)) {
            return false;
        }
        InlineFiltersItem inlineFiltersItem = (InlineFiltersItem) obj;
        return L.f(this.f154625b, inlineFiltersItem.f154625b) && L.f(this.f154626c, inlineFiltersItem.f154626c);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154626c() {
        return this.f154626c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154625b() {
        return this.f154625b;
    }

    public final int hashCode() {
        return this.f154626c.hashCode() + (this.f154625b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "InlineFiltersItem(stringId=" + this.f154625b + ", gridType=" + this.f154626c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f154625b);
        parcel.writeParcelable(this.f154626c, i12);
    }

    public InlineFiltersItem(@Y61.k String str, @Y61.k GridElementType gridElementType) {
        this.f154625b = str;
        this.f154626c = gridElementType;
    }

    public /* synthetic */ InlineFiltersItem(String str, GridElementType gridElementType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "inline_filters_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType);
    }
}
