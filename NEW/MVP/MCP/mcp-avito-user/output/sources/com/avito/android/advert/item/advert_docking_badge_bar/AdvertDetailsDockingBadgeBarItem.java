package com.avito.android.advert.item.advert_docking_badge_bar;

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

/* compiled from: AdvertDetailsDockingBadgeBarItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/advert_docking_badge_bar/AdvertDetailsDockingBadgeBarItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDockingBadgeBarItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDockingBadgeBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72692b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f72693c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<DockingBadgeItem> f72694d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72695e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f72696f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f72697g;

    /* compiled from: AdvertDetailsDockingBadgeBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDockingBadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDockingBadgeBarItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsDockingBadgeBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsDockingBadgeBarItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDockingBadgeBarItem[] newArray(int i12) {
            return new AdvertDetailsDockingBadgeBarItem[i12];
        }
    }

    public AdvertDetailsDockingBadgeBarItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k List list) {
        this.f72692b = j12;
        this.f72693c = str;
        this.f72694d = list;
        this.f72695e = i12;
        this.f72696f = serpDisplayType;
        this.f72697g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72696f;
        return new AdvertDetailsDockingBadgeBarItem(i12, this.f72692b, serpDisplayType, this.f72697g, this.f72693c, this.f72694d);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f72696f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDockingBadgeBarItem)) {
            return false;
        }
        AdvertDetailsDockingBadgeBarItem advertDetailsDockingBadgeBarItem = (AdvertDetailsDockingBadgeBarItem) obj;
        return this.f72692b == advertDetailsDockingBadgeBarItem.f72692b && L.f(this.f72693c, advertDetailsDockingBadgeBarItem.f72693c) && L.f(this.f72694d, advertDetailsDockingBadgeBarItem.f72694d) && this.f72695e == advertDetailsDockingBadgeBarItem.f72695e && this.f72696f == advertDetailsDockingBadgeBarItem.f72696f && this.f72697g == advertDetailsDockingBadgeBarItem.f72697g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f72692b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75325l() {
        return this.f72695e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75316c() {
        return this.f72693c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75327n() {
        return this.f72697g;
    }

    public final int hashCode() {
        return this.f72697g.hashCode() + com.avito.android.actions_sheet.a.h(this.f72696f, r.e(this.f72695e, H.e(H.d(Long.hashCode(this.f72692b) * 31, 31, this.f72693c), 31, this.f72694d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDockingBadgeBarItem(id=");
        sb2.append(this.f72692b);
        sb2.append(", stringId=");
        sb2.append(this.f72693c);
        sb2.append(", badges=");
        sb2.append(this.f72694d);
        sb2.append(", spanCount=");
        sb2.append(this.f72695e);
        sb2.append(", displayType=");
        sb2.append(this.f72696f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72697g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f72692b);
        parcel.writeString(this.f72693c);
        Iterator itJ = C0.j(this.f72694d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f72695e);
        parcel.writeString(this.f72696f.name());
        parcel.writeString(this.f72697g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDockingBadgeBarItem(long j12, String str, List list, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 140;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, list);
    }
}
