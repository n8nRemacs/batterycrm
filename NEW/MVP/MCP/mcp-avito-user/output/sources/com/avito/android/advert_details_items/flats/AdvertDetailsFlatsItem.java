package com.avito.android.advert_details_items.flats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsFlatsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/flats/AdvertDetailsFlatsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsFlatsItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsFlatsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84655c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AdvertParameters.Parameter> f84656d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84657e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f84658f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f84659g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f84660h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final AdvertDetailsFlatViewType f84661i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84662j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84663k;

    /* renamed from: l, reason: collision with root package name */
    public final int f84664l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public SerpDisplayType f84665m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final SerpViewType f84666n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f84667o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final List<AdvertParameters.WorkingCondition> f84668p;

    /* compiled from: AdvertDetailsFlatsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsFlatsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFlatsItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsFlatsItem.class, parcel, arrayList2, iL3, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsFlatsItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AdvertDetailsFlatsItem.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            AdvertDetailsFlatViewType advertDetailsFlatViewTypeValueOf = AdvertDetailsFlatViewType.valueOf(parcel.readString());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsFlatsItem.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            return new AdvertDetailsFlatsItem(j12, string, arrayList2, z12, attributedText, attributedText2, numValueOf, advertDetailsFlatViewTypeValueOf, z13, z14, i13, serpDisplayTypeValueOf, serpViewTypeValueOf, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsFlatsItem[] newArray(int i12) {
            return new AdvertDetailsFlatsItem[i12];
        }
    }

    public AdvertDetailsFlatsItem(long j12, @k String str, @k List<AdvertParameters.Parameter> list, boolean z12, @l AttributedText attributedText, @l AttributedText attributedText2, @l Integer num, @k AdvertDetailsFlatViewType advertDetailsFlatViewType, boolean z13, boolean z14, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, boolean z15, @l List<AdvertParameters.WorkingCondition> list2) {
        this.f84654b = j12;
        this.f84655c = str;
        this.f84656d = list;
        this.f84657e = z12;
        this.f84658f = attributedText;
        this.f84659g = attributedText2;
        this.f84660h = num;
        this.f84661i = advertDetailsFlatViewType;
        this.f84662j = z13;
        this.f84663k = z14;
        this.f84664l = i12;
        this.f84665m = serpDisplayType;
        this.f84666n = serpViewType;
        this.f84667o = z15;
        this.f84668p = list2;
    }

    public static AdvertDetailsFlatsItem b(AdvertDetailsFlatsItem advertDetailsFlatsItem, List list, int i12, int i13) {
        long j12 = advertDetailsFlatsItem.f84654b;
        String str = advertDetailsFlatsItem.f84655c;
        List list2 = (i13 & 4) != 0 ? advertDetailsFlatsItem.f84656d : list;
        boolean z12 = advertDetailsFlatsItem.f84657e;
        AttributedText attributedText = advertDetailsFlatsItem.f84658f;
        AttributedText attributedText2 = advertDetailsFlatsItem.f84659g;
        Integer num = (i13 & 64) != 0 ? advertDetailsFlatsItem.f84660h : 2;
        AdvertDetailsFlatViewType advertDetailsFlatViewType = advertDetailsFlatsItem.f84661i;
        boolean z13 = advertDetailsFlatsItem.f84662j;
        boolean z14 = advertDetailsFlatsItem.f84663k;
        int i14 = (i13 & 1024) != 0 ? advertDetailsFlatsItem.f84664l : i12;
        SerpDisplayType serpDisplayType = advertDetailsFlatsItem.f84665m;
        SerpViewType serpViewType = advertDetailsFlatsItem.f84666n;
        boolean z15 = advertDetailsFlatsItem.f84667o;
        List<AdvertParameters.WorkingCondition> list3 = advertDetailsFlatsItem.f84668p;
        advertDetailsFlatsItem.getClass();
        return new AdvertDetailsFlatsItem(j12, str, list2, z12, attributedText, attributedText2, num, advertDetailsFlatViewType, z13, z14, i14, serpDisplayType, serpViewType, z15, list3);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return b(this, null, i12, 31743);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84665m = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsFlatsItem)) {
            return false;
        }
        AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) obj;
        return this.f84654b == advertDetailsFlatsItem.f84654b && L.f(this.f84655c, advertDetailsFlatsItem.f84655c) && L.f(this.f84656d, advertDetailsFlatsItem.f84656d) && this.f84657e == advertDetailsFlatsItem.f84657e && L.f(this.f84658f, advertDetailsFlatsItem.f84658f) && L.f(this.f84659g, advertDetailsFlatsItem.f84659g) && L.f(this.f84660h, advertDetailsFlatsItem.f84660h) && this.f84661i == advertDetailsFlatsItem.f84661i && this.f84662j == advertDetailsFlatsItem.f84662j && this.f84663k == advertDetailsFlatsItem.f84663k && this.f84664l == advertDetailsFlatsItem.f84664l && this.f84665m == advertDetailsFlatsItem.f84665m && this.f84666n == advertDetailsFlatsItem.f84666n && this.f84667o == advertDetailsFlatsItem.f84667o && L.f(this.f84668p, advertDetailsFlatsItem.f84668p);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getF84658f() {
        return this.f84658f;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF84603b() {
        return this.f84654b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84614m() {
        return this.f84664l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84604c() {
        return this.f84655c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84616o() {
        return this.f84666n;
    }

    public final int hashCode() {
        int i12 = r.i(H.e(H.d(Long.hashCode(this.f84654b) * 31, 31, this.f84655c), 31, this.f84656d), 31, this.f84657e);
        AttributedText attributedText = this.f84658f;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f84659g;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Integer num = this.f84660h;
        int i13 = r.i(com.avito.android.actions_sheet.a.j(this.f84666n, com.avito.android.actions_sheet.a.h(this.f84665m, r.e(this.f84664l, r.i(r.i((this.f84661i.hashCode() + ((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f84662j), 31, this.f84663k), 31), 31), 31), 31, this.f84667o);
        List<AdvertParameters.WorkingCondition> list = this.f84668p;
        return i13 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsFlatsItem(id=");
        sb2.append(this.f84654b);
        sb2.append(", stringId=");
        sb2.append(this.f84655c);
        sb2.append(", parameters=");
        sb2.append(this.f84656d);
        sb2.append(", closedAdvert=");
        sb2.append(this.f84657e);
        sb2.append(", flatsTitle=");
        sb2.append(this.f84658f);
        sb2.append(", flatsDisclaimer=");
        sb2.append(this.f84659g);
        sb2.append(", bottomMargin=");
        sb2.append(this.f84660h);
        sb2.append(", type=");
        sb2.append(this.f84661i);
        sb2.append(", isRestyle=");
        sb2.append(this.f84662j);
        sb2.append(", isAutoFlatsRedesign=");
        sb2.append(this.f84663k);
        sb2.append(", spanCount=");
        sb2.append(this.f84664l);
        sb2.append(", displayType=");
        sb2.append(this.f84665m);
        sb2.append(", viewType=");
        sb2.append(this.f84666n);
        sb2.append(", isServicesRedesign=");
        sb2.append(this.f84667o);
        sb2.append(", workingConditions=");
        return H.p(sb2, this.f84668p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84654b);
        parcel.writeString(this.f84655c);
        Iterator itJ = C0.j(this.f84656d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f84657e ? 1 : 0);
        parcel.writeParcelable(this.f84658f, i12);
        parcel.writeParcelable(this.f84659g, i12);
        Integer num = this.f84660h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f84661i.name());
        parcel.writeInt(this.f84662j ? 1 : 0);
        parcel.writeInt(this.f84663k ? 1 : 0);
        parcel.writeInt(this.f84664l);
        parcel.writeString(this.f84665m.name());
        parcel.writeString(this.f84666n.name());
        parcel.writeInt(this.f84667o ? 1 : 0);
        List<AdvertParameters.WorkingCondition> list = this.f84668p;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }

    public /* synthetic */ AdvertDetailsFlatsItem(long j12, String str, List list, boolean z12, AttributedText attributedText, AttributedText attributedText2, Integer num, AdvertDetailsFlatViewType advertDetailsFlatViewType, boolean z13, boolean z14, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, boolean z15, List list2, int i13, C42822w c42822w) {
        this(j12, (i13 & 2) != 0 ? String.valueOf(j12) : str, list, z12, attributedText, attributedText2, (i13 & 64) != 0 ? null : num, (i13 & 128) != 0 ? AdvertDetailsFlatViewType.f82420b : advertDetailsFlatViewType, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? false : z14, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8192) != 0 ? false : z15, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list2);
    }
}
