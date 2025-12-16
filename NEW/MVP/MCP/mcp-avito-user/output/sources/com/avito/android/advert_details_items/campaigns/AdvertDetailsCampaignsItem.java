package com.avito.android.advert_details_items.campaigns;

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
import com.avito.android.remote.model.CampaignOption;
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

/* compiled from: AdvertDetailsCampaignsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/AdvertDetailsCampaignsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsCampaignsItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsCampaignsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84501c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<CampaignOption> f84502d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f84504f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f84505g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f84506h;

    /* compiled from: AdvertDetailsCampaignsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsCampaignsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCampaignsItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsCampaignsItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsCampaignsItem(j12, string, arrayList, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsCampaignsItem[] newArray(int i12) {
            return new AdvertDetailsCampaignsItem[i12];
        }
    }

    public AdvertDetailsCampaignsItem(long j12, @k String str, @k List<CampaignOption> list, boolean z12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f84500b = j12;
        this.f84501c = str;
        this.f84502d = list;
        this.f84503e = z12;
        this.f84504f = i12;
        this.f84505g = serpDisplayType;
        this.f84506h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsCampaignsItem(this.f84500b, this.f84501c, this.f84502d, this.f84503e, i12, this.f84505g, this.f84506h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84505g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsCampaignsItem)) {
            return false;
        }
        AdvertDetailsCampaignsItem advertDetailsCampaignsItem = (AdvertDetailsCampaignsItem) obj;
        return this.f84500b == advertDetailsCampaignsItem.f84500b && L.f(this.f84501c, advertDetailsCampaignsItem.f84501c) && L.f(this.f84502d, advertDetailsCampaignsItem.f84502d) && this.f84503e == advertDetailsCampaignsItem.f84503e && this.f84504f == advertDetailsCampaignsItem.f84504f && this.f84505g == advertDetailsCampaignsItem.f84505g && this.f84506h == advertDetailsCampaignsItem.f84506h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f84500b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75325l() {
        return this.f84504f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75316c() {
        return this.f84501c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75327n() {
        return this.f84506h;
    }

    public final int hashCode() {
        return this.f84506h.hashCode() + com.avito.android.actions_sheet.a.h(this.f84505g, r.e(this.f84504f, r.i(H.e(H.d(Long.hashCode(this.f84500b) * 31, 31, this.f84501c), 31, this.f84502d), 31, this.f84503e), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsCampaignsItem(id=");
        sb2.append(this.f84500b);
        sb2.append(", stringId=");
        sb2.append(this.f84501c);
        sb2.append(", options=");
        sb2.append(this.f84502d);
        sb2.append(", isRestyle=");
        sb2.append(this.f84503e);
        sb2.append(", spanCount=");
        sb2.append(this.f84504f);
        sb2.append(", displayType=");
        sb2.append(this.f84505g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84506h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84500b);
        parcel.writeString(this.f84501c);
        Iterator itJ = C0.j(this.f84502d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f84503e ? 1 : 0);
        parcel.writeInt(this.f84504f);
        parcel.writeString(this.f84505g.name());
        parcel.writeString(this.f84506h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsCampaignsItem(long j12, String str, List list, boolean z12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 4;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, list, (i13 & 8) != 0 ? false : z12, i12, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
