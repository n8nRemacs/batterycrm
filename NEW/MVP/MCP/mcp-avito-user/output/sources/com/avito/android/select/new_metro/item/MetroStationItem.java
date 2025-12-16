package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MetroStationItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/new_metro/item/MetroStationItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lhq0/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MetroStationItem implements ParcelableItem, InterfaceC40971a {

    @k
    public static final Parcelable.Creator<MetroStationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Integer> f266200c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CharSequence f266201d;

    /* renamed from: e, reason: collision with root package name */
    public final int f266202e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f266203f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f266204g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f266205h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f266206i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<Integer> f266207j;

    /* compiled from: MetroStationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroStationItem> {
        @Override // android.os.Parcelable.Creator
        public final MetroStationItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iD2 = 0;
            int iD3 = 0;
            while (iD3 != i12) {
                iD3 = l.d(parcel, arrayList, iD3, 1);
            }
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            while (iD2 != i14) {
                iD2 = l.d(parcel, arrayList2, iD2, 1);
            }
            return new MetroStationItem(string, arrayList, charSequence, i13, string2, z12, z13, z14, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MetroStationItem[] newArray(int i12) {
            return new MetroStationItem[i12];
        }
    }

    public MetroStationItem(@k String str, @k List<Integer> list, @k CharSequence charSequence, int i12, @k String str2, boolean z12, boolean z13, boolean z14, @k List<Integer> list2) {
        this.f266199b = str;
        this.f266200c = list;
        this.f266201d = charSequence;
        this.f266202e = i12;
        this.f266203f = str2;
        this.f266204g = z12;
        this.f266205h = z13;
        this.f266206i = z14;
        this.f266207j = list2;
    }

    public static MetroStationItem a(MetroStationItem metroStationItem, int i12) {
        String str = metroStationItem.f266199b;
        List<Integer> list = metroStationItem.f266200c;
        CharSequence charSequence = metroStationItem.f266201d;
        int i13 = metroStationItem.f266202e;
        String str2 = metroStationItem.f266203f;
        boolean z12 = (i12 & 32) != 0 ? metroStationItem.f266204g : true;
        boolean z13 = metroStationItem.f266205h;
        boolean z14 = (i12 & 128) != 0 ? metroStationItem.f266206i : true;
        List<Integer> list2 = metroStationItem.f266207j;
        metroStationItem.getClass();
        return new MetroStationItem(str, list, charSequence, i13, str2, z12, z13, z14, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroStationItem)) {
            return false;
        }
        MetroStationItem metroStationItem = (MetroStationItem) obj;
        return L.f(this.f266199b, metroStationItem.f266199b) && L.f(this.f266200c, metroStationItem.f266200c) && L.f(this.f266201d, metroStationItem.f266201d) && this.f266202e == metroStationItem.f266202e && L.f(this.f266203f, metroStationItem.f266203f) && this.f266204g == metroStationItem.f266204g && this.f266205h == metroStationItem.f266205h && this.f266206i == metroStationItem.f266206i && L.f(this.f266207j, metroStationItem.f266207j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266199b() {
        return this.f266199b;
    }

    public final int hashCode() {
        return this.f266207j.hashCode() + r.i(r.i(r.i(H.d(r.e(this.f266202e, l.c(H.e(this.f266199b.hashCode() * 31, 31, this.f266200c), 31, this.f266201d), 31), 31, this.f266203f), 31, this.f266204g), 31, this.f266205h), 31, this.f266206i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetroStationItem(lineIds=");
        sb2.append(this.f266200c);
        sb2.append(", stationId=");
        sb2.append(this.f266202e);
        sb2.append(", stationName='");
        sb2.append(this.f266203f);
        sb2.append("', isChecked=");
        return r.x(sb2, this.f266204g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266199b);
        Iterator itJ = C0.j(this.f266200c, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
        TextUtils.writeToParcel(this.f266201d, parcel, i12);
        parcel.writeInt(this.f266202e);
        parcel.writeString(this.f266203f);
        parcel.writeInt(this.f266204g ? 1 : 0);
        parcel.writeInt(this.f266205h ? 1 : 0);
        parcel.writeInt(this.f266206i ? 1 : 0);
        Iterator itJ2 = C0.j(this.f266207j, parcel);
        while (itJ2.hasNext()) {
            parcel.writeInt(((Number) itJ2.next()).intValue());
        }
    }

    public MetroStationItem(String str, List list, CharSequence charSequence, int i12, String str2, boolean z12, boolean z13, boolean z14, List list2, int i13, C42822w c42822w) {
        this(str, list, charSequence, i12, str2, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? true : z13, (i13 & 128) != 0 ? false : z14, (i13 & 256) != 0 ? C42784z0.f406748b : list2);
    }
}
