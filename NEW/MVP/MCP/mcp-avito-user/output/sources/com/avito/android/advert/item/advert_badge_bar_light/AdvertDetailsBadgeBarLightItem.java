package com.avito.android.advert.item.advert_badge_bar_light;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBadgeBarLightItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/advert_badge_bar_light/AdvertDetailsBadgeBarLightItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsBadgeBarLightItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsBadgeBarLightItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72677b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72678c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<DockingBadgeItem> f72679d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f72680e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72681f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f72682g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f72683h;

    /* compiled from: AdvertDetailsBadgeBarLightItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsBadgeBarLightItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBadgeBarLightItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsBadgeBarLightItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsBadgeBarLightItem(j12, string, arrayList, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBadgeBarLightItem[] newArray(int i12) {
            return new AdvertDetailsBadgeBarLightItem[i12];
        }
    }

    public AdvertDetailsBadgeBarLightItem(long j12, @k String str, @k List<DockingBadgeItem> list, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f72677b = j12;
        this.f72678c = str;
        this.f72679d = list;
        this.f72680e = z12;
        this.f72681f = i12;
        this.f72682g = serpDisplayType;
        this.f72683h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsBadgeBarLightItem(this.f72677b, this.f72678c, this.f72679d, this.f72680e, i12, this.f72682g, this.f72683h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72682g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsBadgeBarLightItem)) {
            return false;
        }
        AdvertDetailsBadgeBarLightItem advertDetailsBadgeBarLightItem = (AdvertDetailsBadgeBarLightItem) obj;
        return this.f72677b == advertDetailsBadgeBarLightItem.f72677b && L.f(this.f72678c, advertDetailsBadgeBarLightItem.f72678c) && L.f(this.f72679d, advertDetailsBadgeBarLightItem.f72679d) && this.f72680e == advertDetailsBadgeBarLightItem.f72680e && this.f72681f == advertDetailsBadgeBarLightItem.f72681f && this.f72682g == advertDetailsBadgeBarLightItem.f72682g && this.f72683h == advertDetailsBadgeBarLightItem.f72683h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f72677b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75325l() {
        return this.f72681f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75316c() {
        return this.f72678c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75327n() {
        return this.f72683h;
    }

    public final int hashCode() {
        return this.f72683h.hashCode() + com.avito.android.actions_sheet.a.h(this.f72682g, r.e(this.f72681f, r.i(H.e(H.d(Long.hashCode(this.f72677b) * 31, 31, this.f72678c), 31, this.f72679d), 31, this.f72680e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsBadgeBarLightItem(id=");
        sb2.append(this.f72677b);
        sb2.append(", stringId=");
        sb2.append(this.f72678c);
        sb2.append(", badges=");
        sb2.append(this.f72679d);
        sb2.append(", shouldShowUnderGallery=");
        sb2.append(this.f72680e);
        sb2.append(", spanCount=");
        sb2.append(this.f72681f);
        sb2.append(", displayType=");
        sb2.append(this.f72682g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72683h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72677b);
        parcel.writeString(this.f72678c);
        Iterator itJ = C0.j(this.f72679d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f72680e ? 1 : 0);
        parcel.writeInt(this.f72681f);
        parcel.writeString(this.f72682g.name());
        parcel.writeString(this.f72683h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsBadgeBarLightItem(long j12, String str, List list, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 141;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, list, z12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
