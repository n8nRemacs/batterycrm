package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import hq0.InterfaceC40971a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MetroSelectedStationsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lhq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class MetroSelectedStationsItem implements ParcelableItem, InterfaceC40971a {

    @k
    public static final Parcelable.Creator<MetroSelectedStationsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f266194c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f266195d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<SelectedStationInfo> f266196e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashSet f266197f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashSet f266198g;

    /* compiled from: MetroSelectedStationsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroSelectedStationsItem> {
        @Override // android.os.Parcelable.Creator
        public final MetroSelectedStationsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SelectedStationInfo.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MetroSelectedStationsItem(i12, string, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MetroSelectedStationsItem[] newArray(int i12) {
            return new MetroSelectedStationsItem[i12];
        }
    }

    public MetroSelectedStationsItem(int i12, @k String str, boolean z12, @k List list) {
        this.f266193b = str;
        this.f266194c = i12;
        this.f266195d = z12;
        this.f266196e = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        this.f266197f = linkedHashSet;
        this.f266198g = linkedHashSet;
    }

    public static MetroSelectedStationsItem a(MetroSelectedStationsItem metroSelectedStationsItem, List list) {
        String str = metroSelectedStationsItem.f266193b;
        int i12 = metroSelectedStationsItem.f266194c;
        boolean z12 = metroSelectedStationsItem.f266195d;
        metroSelectedStationsItem.getClass();
        return new MetroSelectedStationsItem(i12, str, z12, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroSelectedStationsItem)) {
            return false;
        }
        MetroSelectedStationsItem metroSelectedStationsItem = (MetroSelectedStationsItem) obj;
        return L.f(this.f266193b, metroSelectedStationsItem.f266193b) && this.f266194c == metroSelectedStationsItem.f266194c && this.f266195d == metroSelectedStationsItem.f266195d && L.f(this.f266196e, metroSelectedStationsItem.f266196e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247679b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266193b() {
        return this.f266193b;
    }

    public final int hashCode() {
        return this.f266196e.hashCode() + r.i(r.e(this.f266194c, this.f266193b.hashCode() * 31, 31), 31, this.f266195d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetroSelectedStationsItem(stringId=");
        sb2.append(this.f266193b);
        sb2.append(", minimumShowedLines=");
        sb2.append(this.f266194c);
        sb2.append(", showAll=");
        sb2.append(this.f266195d);
        sb2.append(", items=");
        return H.p(sb2, this.f266196e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266193b);
        parcel.writeInt(this.f266194c);
        parcel.writeInt(this.f266195d ? 1 : 0);
        Iterator itJ = C0.j(this.f266196e, parcel);
        while (itJ.hasNext()) {
            ((SelectedStationInfo) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public MetroSelectedStationsItem(String str, int i12, boolean z12, List list, int i13, C42822w c42822w) {
        this((i13 & 2) != 0 ? 3 : i12, str, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? C42784z0.f406748b : list);
    }
}
