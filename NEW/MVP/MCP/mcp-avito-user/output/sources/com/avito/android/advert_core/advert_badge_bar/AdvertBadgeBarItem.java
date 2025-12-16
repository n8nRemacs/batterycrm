package com.avito.android.advert_core.advert_badge_bar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_badge_bar.BadgeBarOrientation;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertBadgeBarItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/advert_badge_bar/AdvertBadgeBarItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertBadgeBarItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertBadgeBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f82706b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f82707c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f82708d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<BadgeItem> f82709e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BadgeBarOrientation f82710f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82711g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f82712h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82713i;

    /* renamed from: j, reason: collision with root package name */
    public final int f82714j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f82715k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f82716l;

    /* compiled from: AdvertBadgeBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertBadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertBadgeBarItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertBadgeBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertBadgeBarItem(j12, string, string2, arrayList, BadgeBarOrientation.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertBadgeBarItem[] newArray(int i12) {
            return new AdvertBadgeBarItem[i12];
        }
    }

    public AdvertBadgeBarItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k List<BadgeItem> list, @Y61.k BadgeBarOrientation badgeBarOrientation, int i12, @Y61.k String str3, boolean z12, int i13, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f82706b = j12;
        this.f82707c = str;
        this.f82708d = str2;
        this.f82709e = list;
        this.f82710f = badgeBarOrientation;
        this.f82711g = i12;
        this.f82712h = str3;
        this.f82713i = z12;
        this.f82714j = i13;
        this.f82715k = serpDisplayType;
        this.f82716l = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertBadgeBarItem(this.f82706b, this.f82707c, this.f82708d, this.f82709e, this.f82710f, this.f82711g, this.f82712h, this.f82713i, i12, this.f82715k, this.f82716l);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f82715k = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertBadgeBarItem)) {
            return false;
        }
        AdvertBadgeBarItem advertBadgeBarItem = (AdvertBadgeBarItem) obj;
        return this.f82706b == advertBadgeBarItem.f82706b && L.f(this.f82707c, advertBadgeBarItem.f82707c) && L.f(this.f82708d, advertBadgeBarItem.f82708d) && L.f(this.f82709e, advertBadgeBarItem.f82709e) && this.f82710f == advertBadgeBarItem.f82710f && this.f82711g == advertBadgeBarItem.f82711g && L.f(this.f82712h, advertBadgeBarItem.f82712h) && this.f82713i == advertBadgeBarItem.f82713i && this.f82714j == advertBadgeBarItem.f82714j && this.f82715k == advertBadgeBarItem.f82715k && this.f82716l == advertBadgeBarItem.f82716l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF272342b() {
        return this.f82706b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272344d() {
        return this.f82714j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309179b() {
        return this.f82707c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    public final SerpViewType getViewType() {
        return this.f82716l;
    }

    public final int hashCode() {
        return this.f82716l.hashCode() + com.avito.android.actions_sheet.a.h(this.f82715k, r.e(this.f82714j, r.i(H.d(r.e(this.f82711g, (this.f82710f.hashCode() + H.e(H.d(H.d(Long.hashCode(this.f82706b) * 31, 31, this.f82707c), 31, this.f82708d), 31, this.f82709e)) * 31, 31), 31, this.f82712h), 31, this.f82713i), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertBadgeBarItem(id=");
        sb2.append(this.f82706b);
        sb2.append(", stringId=");
        sb2.append(this.f82707c);
        sb2.append(", advertId=");
        sb2.append(this.f82708d);
        sb2.append(", badges=");
        sb2.append(this.f82709e);
        sb2.append(", orientation=");
        sb2.append(this.f82710f);
        sb2.append(", preloadCount=");
        sb2.append(this.f82711g);
        sb2.append(", showMoreTitle=");
        sb2.append(this.f82712h);
        sb2.append(", isExpanded=");
        sb2.append(this.f82713i);
        sb2.append(", spanCount=");
        sb2.append(this.f82714j);
        sb2.append(", displayType=");
        sb2.append(this.f82715k);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f82716l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f82706b);
        parcel.writeString(this.f82707c);
        parcel.writeString(this.f82708d);
        Iterator itJ = C0.j(this.f82709e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f82710f.name());
        parcel.writeInt(this.f82711g);
        parcel.writeString(this.f82712h);
        parcel.writeInt(this.f82713i ? 1 : 0);
        parcel.writeInt(this.f82714j);
        parcel.writeString(this.f82715k.name());
        parcel.writeString(this.f82716l.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertBadgeBarItem(long j12, String str, String str2, List list, BadgeBarOrientation badgeBarOrientation, int i12, String str3, boolean z12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 93;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, str2, list, badgeBarOrientation, i12, str3, (i14 & 128) != 0 ? false : z12, i13, (i14 & 512) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 1024) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
