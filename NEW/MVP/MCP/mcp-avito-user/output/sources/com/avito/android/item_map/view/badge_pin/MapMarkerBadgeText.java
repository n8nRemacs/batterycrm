package com.avito.android.item_map.view.badge_pin;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapPointData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapMarkerBadgeText.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/badge_pin/MapMarkerBadgeText;", "Lcom/avito/android/avito_map/AvitoMapPointData;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapMarkerBadgeText implements AvitoMapPointData {

    @k
    public static final Parcelable.Creator<MapMarkerBadgeText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173609b;

    /* compiled from: MapMarkerBadgeText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapMarkerBadgeText> {
        @Override // android.os.Parcelable.Creator
        public final MapMarkerBadgeText createFromParcel(Parcel parcel) {
            return new MapMarkerBadgeText(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MapMarkerBadgeText[] newArray(int i12) {
            return new MapMarkerBadgeText[i12];
        }
    }

    public MapMarkerBadgeText(@k String str) {
        this.f173609b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MapMarkerBadgeText) && L.f(this.f173609b, ((MapMarkerBadgeText) obj).f173609b);
    }

    public final int hashCode() {
        return this.f173609b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("MapMarkerBadgeText(badgeText="), this.f173609b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173609b);
    }
}
