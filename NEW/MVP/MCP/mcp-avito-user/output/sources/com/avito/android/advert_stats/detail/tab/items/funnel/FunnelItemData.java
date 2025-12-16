package com.avito.android.advert_stats.detail.tab.items.funnel;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_stats.detail.tab.stats_item_tab.mvi.entity.StatsItem;
import com.avito.android.advert_stats.remote.model.detail_stats.FunnelItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FunnelItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/funnel/FunnelItemData;", "Lcom/avito/android/advert_stats/detail/tab/stats_item_tab/mvi/entity/StatsItem;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FunnelItemData implements StatsItem {

    @k
    public static final Parcelable.Creator<FunnelItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86439b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<FunnelItem> f86440c;

    /* compiled from: FunnelItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FunnelItemData> {
        @Override // android.os.Parcelable.Creator
        public final FunnelItemData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FunnelItemData.class, parcel, arrayList, iL2, 1);
            }
            return new FunnelItemData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FunnelItemData[] newArray(int i12) {
            return new FunnelItemData[i12];
        }
    }

    public FunnelItemData(@k String str, @k List<FunnelItem> list) {
        this.f86439b = str;
        this.f86440c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80597c() {
        return this.f86439b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f86439b);
        Iterator itJ = C0.j(this.f86440c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
