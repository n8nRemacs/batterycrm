package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import hq0.InterfaceC40971a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MetroFilterItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lhq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MetroFilterItem implements ParcelableItem, InterfaceC40971a {

    @k
    public static final Parcelable.Creator<MetroFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266176b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Set<Integer> f266177c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f266178d;

    /* renamed from: e, reason: collision with root package name */
    public final int f266179e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f266180f;

    /* compiled from: MetroFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final MetroFilterItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(Integer.valueOf(parcel.readInt()));
            }
            return new MetroFilterItem(string, linkedHashSet, parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MetroFilterItem[] newArray(int i12) {
            return new MetroFilterItem[i12];
        }
    }

    public MetroFilterItem(@k String str, @k Set<Integer> set, @k String str2, int i12, boolean z12) {
        this.f266176b = str;
        this.f266177c = set;
        this.f266178d = str2;
        this.f266179e = i12;
        this.f266180f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroFilterItem)) {
            return false;
        }
        MetroFilterItem metroFilterItem = (MetroFilterItem) obj;
        return L.f(this.f266176b, metroFilterItem.f266176b) && L.f(this.f266177c, metroFilterItem.f266177c) && L.f(this.f266178d, metroFilterItem.f266178d) && this.f266179e == metroFilterItem.f266179e && this.f266180f == metroFilterItem.f266180f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266176b() {
        return this.f266176b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266180f) + r.e(this.f266179e, H.d(m.g(this.f266177c, this.f266176b.hashCode() * 31, 31), 31, this.f266178d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetroFilterItem(stringId=");
        sb2.append(this.f266176b);
        sb2.append(", stationIds=");
        sb2.append(this.f266177c);
        sb2.append(", name=");
        sb2.append(this.f266178d);
        sb2.append(", filterId=");
        sb2.append(this.f266179e);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f266180f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266176b);
        Set<Integer> set = this.f266177c;
        parcel.writeInt(set.size());
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        parcel.writeString(this.f266178d);
        parcel.writeInt(this.f266179e);
        parcel.writeInt(this.f266180f ? 1 : 0);
    }

    public /* synthetic */ MetroFilterItem(String str, Set set, String str2, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, set, str2, i12, (i13 & 16) != 0 ? false : z12);
    }
}
