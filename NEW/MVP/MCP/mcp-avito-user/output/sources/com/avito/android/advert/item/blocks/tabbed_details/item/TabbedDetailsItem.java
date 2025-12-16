package com.avito.android.advert.item.blocks.tabbed_details.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabbedDetailsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/blocks/tabbed_details/item/TabbedDetailsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TabbedDetailsItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<TabbedDetailsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74095b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TabData> f74096c;

    /* renamed from: d, reason: collision with root package name */
    public int f74097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74098e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f74099f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f74100g;

    /* compiled from: TabbedDetailsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabbedDetailsItem> {
        @Override // android.os.Parcelable.Creator
        public final TabbedDetailsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TabData.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new TabbedDetailsItem(string, arrayList, parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TabbedDetailsItem[] newArray(int i12) {
            return new TabbedDetailsItem[i12];
        }
    }

    public TabbedDetailsItem(@k String str, @k List<TabData> list, int i12, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f74095b = str;
        this.f74096c = list;
        this.f74097d = i12;
        this.f74098e = i13;
        this.f74099f = serpDisplayType;
        this.f74100g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new TabbedDetailsItem(this.f74095b, this.f74096c, this.f74097d, i12, this.f74099f, this.f74100g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74099f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabbedDetailsItem)) {
            return false;
        }
        TabbedDetailsItem tabbedDetailsItem = (TabbedDetailsItem) obj;
        return L.f(this.f74095b, tabbedDetailsItem.f74095b) && L.f(this.f74096c, tabbedDetailsItem.f74096c) && this.f74097d == tabbedDetailsItem.f74097d && this.f74098e == tabbedDetailsItem.f74098e && this.f74099f == tabbedDetailsItem.f74099f && this.f74100g == tabbedDetailsItem.f74100g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84838g() {
        return this.f74098e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74202f() {
        return this.f74095b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84840i() {
        return this.f74100g;
    }

    public final int hashCode() {
        return this.f74100g.hashCode() + com.avito.android.actions_sheet.a.h(this.f74099f, r.e(this.f74098e, r.e(this.f74097d, H.e(this.f74095b.hashCode() * 31, 31, this.f74096c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabbedDetailsItem(stringId=");
        sb2.append(this.f74095b);
        sb2.append(", tabs=");
        sb2.append(this.f74096c);
        sb2.append(", selectedTabPosition=");
        sb2.append(this.f74097d);
        sb2.append(", spanCount=");
        sb2.append(this.f74098e);
        sb2.append(", displayType=");
        sb2.append(this.f74099f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74100g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f74095b);
        Iterator itJ = C0.j(this.f74096c, parcel);
        while (itJ.hasNext()) {
            ((TabData) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f74097d);
        parcel.writeInt(this.f74098e);
        parcel.writeString(this.f74099f.name());
        parcel.writeString(this.f74100g.name());
    }

    public /* synthetic */ TabbedDetailsItem(String str, List list, int i12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        this(str, list, (i14 & 4) != 0 ? 0 : i12, i13, (i14 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
