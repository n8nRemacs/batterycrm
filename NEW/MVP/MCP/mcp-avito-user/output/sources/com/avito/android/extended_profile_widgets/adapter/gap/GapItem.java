package com.avito.android.extended_profile_widgets.adapter.gap;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/gap/GapItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GapItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<GapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154408b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154409c;

    /* renamed from: d, reason: collision with root package name */
    public final int f154410d;

    /* compiled from: GapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GapItem> {
        @Override // android.os.Parcelable.Creator
        public final GapItem createFromParcel(Parcel parcel) {
            return new GapItem(parcel.readString(), (GridElementType) parcel.readParcelable(GapItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final GapItem[] newArray(int i12) {
            return new GapItem[i12];
        }
    }

    public GapItem(@k String str, @k GridElementType gridElementType, int i12) {
        this.f154408b = str;
        this.f154409c = gridElementType;
        this.f154410d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GapItem)) {
            return false;
        }
        GapItem gapItem = (GapItem) obj;
        return L.f(this.f154408b, gapItem.f154408b) && L.f(this.f154409c, gapItem.f154409c) && this.f154410d == gapItem.f154410d;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154311c() {
        return this.f154409c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154310b() {
        return this.f154408b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154410d) + com.avito.android.bxcontent.mvi.entity.f.b(this.f154409c, this.f154408b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GapItem(stringId=");
        sb2.append(this.f154408b);
        sb2.append(", gridType=");
        sb2.append(this.f154409c);
        sb2.append(", height=");
        return r.t(sb2, this.f154410d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154408b);
        parcel.writeParcelable(this.f154409c, i12);
        parcel.writeInt(this.f154410d);
    }

    public /* synthetic */ GapItem(String str, GridElementType gridElementType, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "gap_item" : str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, i12);
    }
}
