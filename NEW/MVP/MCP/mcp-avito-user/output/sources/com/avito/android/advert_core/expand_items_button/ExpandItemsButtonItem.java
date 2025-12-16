package com.avito.android.advert_core.expand_items_button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpandItemsButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/ExpandItemsButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExpandItemsButtonItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<ExpandItemsButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f83559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f83561e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f83562f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f83563g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f83564h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSpannedItem> f83565i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ExpandSource f83566j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f83567k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f83568l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f83569m;

    /* compiled from: ExpandItemsButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpandItemsButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ExpandItemsButtonItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(ExpandItemsButtonItem.class, parcel, arrayList, iL2, 1);
            }
            return new ExpandItemsButtonItem(j12, string, i12, serpDisplayTypeValueOf, serpViewTypeValueOf, string2, string3, arrayList, parcel.readInt() == 0 ? null : ExpandSource.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpandItemsButtonItem[] newArray(int i12) {
            return new ExpandItemsButtonItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandItemsButtonItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l String str2, @Y61.k String str3, @Y61.k List<? extends PersistableSpannedItem> list, @Y61.l ExpandSource expandSource, @Y61.l String str4, boolean z12, boolean z13) {
        this.f83558b = j12;
        this.f83559c = str;
        this.f83560d = i12;
        this.f83561e = serpDisplayType;
        this.f83562f = serpViewType;
        this.f83563g = str2;
        this.f83564h = str3;
        this.f83565i = list;
        this.f83566j = expandSource;
        this.f83567k = str4;
        this.f83568l = z12;
        this.f83569m = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ExpandItemsButtonItem b(ExpandItemsButtonItem expandItemsButtonItem, int i12, ArrayList arrayList, int i13) {
        long j12 = expandItemsButtonItem.f83558b;
        String str = expandItemsButtonItem.f83559c;
        int i14 = (i13 & 4) != 0 ? expandItemsButtonItem.f83560d : i12;
        SerpDisplayType serpDisplayType = expandItemsButtonItem.f83561e;
        SerpViewType serpViewType = expandItemsButtonItem.f83562f;
        String str2 = expandItemsButtonItem.f83563g;
        String str3 = expandItemsButtonItem.f83564h;
        List list = (i13 & 128) != 0 ? expandItemsButtonItem.f83565i : arrayList;
        ExpandSource expandSource = expandItemsButtonItem.f83566j;
        String str4 = expandItemsButtonItem.f83567k;
        boolean z12 = expandItemsButtonItem.f83568l;
        boolean z13 = expandItemsButtonItem.f83569m;
        expandItemsButtonItem.getClass();
        return new ExpandItemsButtonItem(j12, str, i14, serpDisplayType, serpViewType, str2, str3, list, expandSource, str4, z12, z13);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return b(this, i12, null, 4091);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f83561e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpandItemsButtonItem)) {
            return false;
        }
        ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) obj;
        return this.f83558b == expandItemsButtonItem.f83558b && L.f(this.f83559c, expandItemsButtonItem.f83559c) && this.f83560d == expandItemsButtonItem.f83560d && this.f83561e == expandItemsButtonItem.f83561e && this.f83562f == expandItemsButtonItem.f83562f && L.f(this.f83563g, expandItemsButtonItem.f83563g) && L.f(this.f83564h, expandItemsButtonItem.f83564h) && L.f(this.f83565i, expandItemsButtonItem.f83565i) && this.f83566j == expandItemsButtonItem.f83566j && L.f(this.f83567k, expandItemsButtonItem.f83567k) && this.f83568l == expandItemsButtonItem.f83568l && this.f83569m == expandItemsButtonItem.f83569m;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79541k() {
        return this.f83558b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79542l() {
        return this.f83560d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83387b() {
        return this.f83559c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79544n() {
        return this.f83562f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f83562f, com.avito.android.actions_sheet.a.h(this.f83561e, r.e(this.f83560d, H.d(Long.hashCode(this.f83558b) * 31, 31, this.f83559c), 31), 31), 31);
        String str = this.f83563g;
        int iE2 = H.e(H.d((iJ2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f83564h), 31, this.f83565i);
        ExpandSource expandSource = this.f83566j;
        int iHashCode = (iE2 + (expandSource == null ? 0 : expandSource.hashCode())) * 31;
        String str2 = this.f83567k;
        return Boolean.hashCode(this.f83569m) + r.i((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f83568l);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandItemsButtonItem(id=");
        sb2.append(this.f83558b);
        sb2.append(", stringId=");
        sb2.append(this.f83559c);
        sb2.append(", spanCount=");
        sb2.append(this.f83560d);
        sb2.append(", displayType=");
        sb2.append(this.f83561e);
        sb2.append(", viewType=");
        sb2.append(this.f83562f);
        sb2.append(", analyticsParamsTitle=");
        sb2.append(this.f83563g);
        sb2.append(", expandButtonTitle=");
        sb2.append(this.f83564h);
        sb2.append(", allItems=");
        sb2.append(this.f83565i);
        sb2.append(", source=");
        sb2.append(this.f83566j);
        sb2.append(", flatSectionTitle=");
        sb2.append(this.f83567k);
        sb2.append(", isAutoFlatsRedesign=");
        sb2.append(this.f83568l);
        sb2.append(", isServicesRedesign=");
        return r.x(sb2, this.f83569m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f83558b);
        parcel.writeString(this.f83559c);
        parcel.writeInt(this.f83560d);
        parcel.writeString(this.f83561e.name());
        parcel.writeString(this.f83562f.name());
        parcel.writeString(this.f83563g);
        parcel.writeString(this.f83564h);
        Iterator itJ = C0.j(this.f83565i, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        ExpandSource expandSource = this.f83566j;
        if (expandSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(expandSource.name());
        }
        parcel.writeString(this.f83567k);
        parcel.writeInt(this.f83568l ? 1 : 0);
        parcel.writeInt(this.f83569m ? 1 : 0);
    }

    public /* synthetic */ ExpandItemsButtonItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, String str3, List list, ExpandSource expandSource, String str4, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? String.valueOf(j12) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, str3, list, (i13 & 256) != 0 ? null : expandSource, (i13 & 512) != 0 ? null : str4, (i13 & 1024) != 0 ? false : z12, (i13 & 2048) != 0 ? false : z13);
    }
}
