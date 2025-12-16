package com.avito.android.extended_profile_widgets.adapter.floating_buy_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.floating_buy_block.FloatingBuyBlockItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingBuyBlockWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/floating_buy_block/FloatingBuyBlockWidgetItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FloatingBuyBlockWidgetItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<FloatingBuyBlockWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154379b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154380c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FloatingBuyBlockItem f154381d;

    /* compiled from: FloatingBuyBlockWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FloatingBuyBlockWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final FloatingBuyBlockWidgetItem createFromParcel(Parcel parcel) {
            return new FloatingBuyBlockWidgetItem(parcel.readString(), (GridElementType) parcel.readParcelable(FloatingBuyBlockWidgetItem.class.getClassLoader()), (FloatingBuyBlockItem) parcel.readParcelable(FloatingBuyBlockWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FloatingBuyBlockWidgetItem[] newArray(int i12) {
            return new FloatingBuyBlockWidgetItem[i12];
        }
    }

    public FloatingBuyBlockWidgetItem(@k String str, @k GridElementType gridElementType, @k FloatingBuyBlockItem floatingBuyBlockItem) {
        this.f154379b = str;
        this.f154380c = gridElementType;
        this.f154381d = floatingBuyBlockItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingBuyBlockWidgetItem)) {
            return false;
        }
        FloatingBuyBlockWidgetItem floatingBuyBlockWidgetItem = (FloatingBuyBlockWidgetItem) obj;
        return L.f(this.f154379b, floatingBuyBlockWidgetItem.f154379b) && L.f(this.f154380c, floatingBuyBlockWidgetItem.f154380c) && L.f(this.f154381d, floatingBuyBlockWidgetItem.f154381d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154418c() {
        return this.f154380c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154417b() {
        return this.f154379b;
    }

    public final int hashCode() {
        return this.f154381d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f154380c, this.f154379b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "FloatingBuyBlockWidgetItem(stringId=" + this.f154379b + ", gridType=" + this.f154380c + ", floatingBuyBlock=" + this.f154381d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154379b);
        parcel.writeParcelable(this.f154380c, i12);
        parcel.writeParcelable(this.f154381d, i12);
    }

    public /* synthetic */ FloatingBuyBlockWidgetItem(String str, GridElementType gridElementType, FloatingBuyBlockItem floatingBuyBlockItem, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, floatingBuyBlockItem);
    }
}
