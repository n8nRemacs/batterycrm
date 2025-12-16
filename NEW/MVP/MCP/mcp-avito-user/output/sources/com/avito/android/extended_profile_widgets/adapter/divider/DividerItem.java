package com.avito.android.extended_profile_widgets.adapter.divider;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DividerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/divider/DividerItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DividerItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<DividerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154372b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154373c;

    /* compiled from: DividerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DividerItem> {
        @Override // android.os.Parcelable.Creator
        public final DividerItem createFromParcel(Parcel parcel) {
            return new DividerItem(parcel.readString(), (GridElementType) parcel.readParcelable(DividerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DividerItem[] newArray(int i12) {
            return new DividerItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DividerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DividerItem)) {
            return false;
        }
        DividerItem dividerItem = (DividerItem) obj;
        return L.f(this.f154372b, dividerItem.f154372b) && L.f(this.f154373c, dividerItem.f154373c);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154200c() {
        return this.f154373c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154199b() {
        return this.f154372b;
    }

    public final int hashCode() {
        return this.f154373c.hashCode() + (this.f154372b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DividerItem(stringId=" + this.f154372b + ", gridType=" + this.f154373c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154372b);
        parcel.writeParcelable(this.f154373c, i12);
    }

    public DividerItem(@k String str, @k GridElementType gridElementType) {
        this.f154372b = str;
        this.f154373c = gridElementType;
    }

    public /* synthetic */ DividerItem(String str, GridElementType gridElementType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "divider_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType);
    }
}
