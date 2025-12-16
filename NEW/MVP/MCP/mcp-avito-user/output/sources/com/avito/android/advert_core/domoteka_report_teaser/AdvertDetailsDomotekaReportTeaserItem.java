package com.avito.android.advert_core.domoteka_report_teaser;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.domoteka_report_teaser.Action;
import com.avito.android.remote.model.domoteka_report_teaser.Info;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsDomotekaReportTeaserItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/domoteka_report_teaser/AdvertDetailsDomotekaReportTeaserItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDomotekaReportTeaserItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDomotekaReportTeaserItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f83441b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f83442c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f83443d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f83444e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83445f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f83446g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Theme f83447h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<Info> f83448i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<Action> f83449j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f83450k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f83451l;

    /* compiled from: AdvertDetailsDomotekaReportTeaserItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDomotekaReportTeaserItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDomotekaReportTeaserItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            Theme themeValueOf = Theme.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsDomotekaReportTeaserItem.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsDomotekaReportTeaserItem.class, parcel, arrayList4, iL3, 1);
                }
                arrayList2 = arrayList4;
            }
            return new AdvertDetailsDomotekaReportTeaserItem(j12, string, serpDisplayTypeValueOf, serpViewTypeValueOf, i12, string2, themeValueOf, arrayList, arrayList2, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDomotekaReportTeaserItem[] newArray(int i12) {
            return new AdvertDetailsDomotekaReportTeaserItem[i12];
        }
    }

    public AdvertDetailsDomotekaReportTeaserItem(long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, int i12, @k String str2, @k Theme theme, @l List<Info> list, @l List<Action> list2, @l String str3, boolean z12) {
        this.f83441b = j12;
        this.f83442c = str;
        this.f83443d = serpDisplayType;
        this.f83444e = serpViewType;
        this.f83445f = i12;
        this.f83446g = str2;
        this.f83447h = theme;
        this.f83448i = list;
        this.f83449j = list2;
        this.f83450k = str3;
        this.f83451l = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDomotekaReportTeaserItem(this.f83441b, this.f83442c, this.f83443d, this.f83444e, i12, this.f83446g, this.f83447h, this.f83448i, this.f83449j, this.f83450k, this.f83451l);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f83443d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDomotekaReportTeaserItem)) {
            return false;
        }
        AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem = (AdvertDetailsDomotekaReportTeaserItem) obj;
        return this.f83441b == advertDetailsDomotekaReportTeaserItem.f83441b && L.f(this.f83442c, advertDetailsDomotekaReportTeaserItem.f83442c) && this.f83443d == advertDetailsDomotekaReportTeaserItem.f83443d && this.f83444e == advertDetailsDomotekaReportTeaserItem.f83444e && this.f83445f == advertDetailsDomotekaReportTeaserItem.f83445f && L.f(this.f83446g, advertDetailsDomotekaReportTeaserItem.f83446g) && this.f83447h == advertDetailsDomotekaReportTeaserItem.f83447h && L.f(this.f83448i, advertDetailsDomotekaReportTeaserItem.f83448i) && L.f(this.f83449j, advertDetailsDomotekaReportTeaserItem.f83449j) && L.f(this.f83450k, advertDetailsDomotekaReportTeaserItem.f83450k) && this.f83451l == advertDetailsDomotekaReportTeaserItem.f83451l;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f83441b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75325l() {
        return this.f83445f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75316c() {
        return this.f83442c;
    }

    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF83446g() {
        return this.f83446g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75327n() {
        return this.f83444e;
    }

    public final int hashCode() {
        int iHashCode = (this.f83447h.hashCode() + H.d(r.e(this.f83445f, com.avito.android.actions_sheet.a.j(this.f83444e, com.avito.android.actions_sheet.a.h(this.f83443d, H.d(Long.hashCode(this.f83441b) * 31, 31, this.f83442c), 31), 31), 31), 31, this.f83446g)) * 31;
        List<Info> list = this.f83448i;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Action> list2 = this.f83449j;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f83450k;
        return Boolean.hashCode(this.f83451l) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDomotekaReportTeaserItem(id=");
        sb2.append(this.f83441b);
        sb2.append(", stringId=");
        sb2.append(this.f83442c);
        sb2.append(", displayType=");
        sb2.append(this.f83443d);
        sb2.append(", viewType=");
        sb2.append(this.f83444e);
        sb2.append(", spanCount=");
        sb2.append(this.f83445f);
        sb2.append(", title=");
        sb2.append(this.f83446g);
        sb2.append(", theme=");
        sb2.append(this.f83447h);
        sb2.append(", insights=");
        sb2.append(this.f83448i);
        sb2.append(", actions=");
        sb2.append(this.f83449j);
        sb2.append(", hint=");
        sb2.append(this.f83450k);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f83451l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f83441b);
        parcel.writeString(this.f83442c);
        parcel.writeString(this.f83443d.name());
        parcel.writeString(this.f83444e.name());
        parcel.writeInt(this.f83445f);
        parcel.writeString(this.f83446g);
        parcel.writeString(this.f83447h.name());
        List<Info> list = this.f83448i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<Action> list2 = this.f83449j;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        parcel.writeString(this.f83450k);
        parcel.writeInt(this.f83451l ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDomotekaReportTeaserItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, String str2, Theme theme, List list, List list2, String str3, boolean z12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 144;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? "ITEM_DOMOTEKA_REPORT_TEASER" : str, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, i12, str2, theme, list, list2, str3, (i13 & 1024) != 0 ? false : z12);
    }
}
