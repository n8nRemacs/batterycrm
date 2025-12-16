package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import hq0.InterfaceC40971a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MetroLineItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroLineItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lhq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MetroLineItem implements ParcelableItem, InterfaceC40971a {

    @k
    public static final Parcelable.Creator<MetroLineItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266181b;

    /* renamed from: c, reason: collision with root package name */
    public final int f266182c;

    /* renamed from: d, reason: collision with root package name */
    public final int f266183d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Integer> f266184e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f266185f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f266186g;

    /* compiled from: MetroLineItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroLineItem> {
        @Override // android.os.Parcelable.Creator
        public final MetroLineItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD2 = 0;
            while (iD2 != i14) {
                iD2 = l.d(parcel, arrayList, iD2, 1);
            }
            return new MetroLineItem(string, i12, i13, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MetroLineItem[] newArray(int i12) {
            return new MetroLineItem[i12];
        }
    }

    public MetroLineItem(@k String str, int i12, int i13, @k List<Integer> list, @k String str2, boolean z12) {
        this.f266181b = str;
        this.f266182c = i12;
        this.f266183d = i13;
        this.f266184e = list;
        this.f266185f = str2;
        this.f266186g = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLineItem)) {
            return false;
        }
        MetroLineItem metroLineItem = (MetroLineItem) obj;
        return L.f(this.f266181b, metroLineItem.f266181b) && this.f266182c == metroLineItem.f266182c && this.f266183d == metroLineItem.f266183d && L.f(this.f266184e, metroLineItem.f266184e) && L.f(this.f266185f, metroLineItem.f266185f) && this.f266186g == metroLineItem.f266186g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266185f() {
        return this.f266185f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266186g) + H.d(H.e(r.e(this.f266183d, r.e(this.f266182c, this.f266181b.hashCode() * 31, 31), 31), 31, this.f266184e), 31, this.f266185f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetroLineItem(name=");
        sb2.append(this.f266181b);
        sb2.append(", lineColor=");
        sb2.append(this.f266182c);
        sb2.append(", lineId=");
        sb2.append(this.f266183d);
        sb2.append(", stationIds=");
        sb2.append(this.f266184e);
        sb2.append(", stringId=");
        sb2.append(this.f266185f);
        sb2.append(", isExpanded=");
        return r.x(sb2, this.f266186g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266181b);
        parcel.writeInt(this.f266182c);
        parcel.writeInt(this.f266183d);
        Iterator itJ = C0.j(this.f266184e, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
        parcel.writeString(this.f266185f);
        parcel.writeInt(this.f266186g ? 1 : 0);
    }

    public /* synthetic */ MetroLineItem(String str, int i12, int i13, List list, String str2, boolean z12, int i14, C42822w c42822w) {
        this(str, i12, i13, list, str2, (i14 & 32) != 0 ? false : z12);
    }
}
