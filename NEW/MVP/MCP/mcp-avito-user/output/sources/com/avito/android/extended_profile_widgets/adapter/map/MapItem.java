package com.avito.android.extended_profile_widgets.adapter.map;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.ExtendedProfileGeo;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/map/MapItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MapItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<MapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154542b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154543c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154544d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ExtendedProfileGeo f154545e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f154546f;

    /* compiled from: MapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapItem> {
        @Override // android.os.Parcelable.Creator
        public final MapItem createFromParcel(Parcel parcel) {
            return new MapItem(parcel.readString(), (GridElementType) parcel.readParcelable(MapItem.class.getClassLoader()), parcel.readString(), (ExtendedProfileGeo) parcel.readParcelable(MapItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MapItem[] newArray(int i12) {
            return new MapItem[i12];
        }
    }

    public MapItem(@k String str, @k GridElementType gridElementType, @k String str2, @k ExtendedProfileGeo extendedProfileGeo, boolean z12) {
        this.f154542b = str;
        this.f154543c = gridElementType;
        this.f154544d = str2;
        this.f154545e = extendedProfileGeo;
        this.f154546f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapItem)) {
            return false;
        }
        MapItem mapItem = (MapItem) obj;
        return L.f(this.f154542b, mapItem.f154542b) && L.f(this.f154543c, mapItem.f154543c) && L.f(this.f154544d, mapItem.f154544d) && L.f(this.f154545e, mapItem.f154545e) && this.f154546f == mapItem.f154546f;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154486c() {
        return this.f154543c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138301b() {
        return this.f154542b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154546f) + ((this.f154545e.hashCode() + H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154543c, this.f154542b.hashCode() * 31, 31), 31, this.f154544d)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapItem(stringId=");
        sb2.append(this.f154542b);
        sb2.append(", gridType=");
        sb2.append(this.f154543c);
        sb2.append(", title=");
        sb2.append(this.f154544d);
        sb2.append(", geo=");
        sb2.append(this.f154545e);
        sb2.append(", isInsideTabsWidget=");
        return r.x(sb2, this.f154546f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154542b);
        parcel.writeParcelable(this.f154543c, i12);
        parcel.writeString(this.f154544d);
        parcel.writeParcelable(this.f154545e, i12);
        parcel.writeInt(this.f154546f ? 1 : 0);
    }

    public /* synthetic */ MapItem(String str, GridElementType gridElementType, String str2, ExtendedProfileGeo extendedProfileGeo, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, extendedProfileGeo, z12);
    }
}
