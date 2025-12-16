package com.avito.android.advert.item.groups;

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
import com.avito.android.remote.model.AdvertParameters;
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

/* compiled from: AdvertDetailsGroupsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/groups/AdvertDetailsGroupsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGroupsItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsGroupsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75794c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<AdvertParameters.Group> f75795d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75796e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f75797f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f75798g;

    /* compiled from: AdvertDetailsGroupsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGroupsItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGroupsItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsGroupsItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsGroupsItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGroupsItem[] newArray(int i12) {
            return new AdvertDetailsGroupsItem[i12];
        }
    }

    public AdvertDetailsGroupsItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k List list) {
        this.f75793b = j12;
        this.f75794c = str;
        this.f75795d = list;
        this.f75796e = i12;
        this.f75797f = serpDisplayType;
        this.f75798g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f75797f;
        return new AdvertDetailsGroupsItem(i12, this.f75793b, serpDisplayType, this.f75798g, this.f75794c, this.f75795d);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75797f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGroupsItem)) {
            return false;
        }
        AdvertDetailsGroupsItem advertDetailsGroupsItem = (AdvertDetailsGroupsItem) obj;
        return this.f75793b == advertDetailsGroupsItem.f75793b && L.f(this.f75794c, advertDetailsGroupsItem.f75794c) && L.f(this.f75795d, advertDetailsGroupsItem.f75795d) && this.f75796e == advertDetailsGroupsItem.f75796e && this.f75797f == advertDetailsGroupsItem.f75797f && this.f75798g == advertDetailsGroupsItem.f75798g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85650b() {
        return this.f75793b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85652d() {
        return this.f75796e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85651c() {
        return this.f75794c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85654f() {
        return this.f75798g;
    }

    public final int hashCode() {
        return this.f75798g.hashCode() + com.avito.android.actions_sheet.a.h(this.f75797f, r.e(this.f75796e, H.e(H.d(Long.hashCode(this.f75793b) * 31, 31, this.f75794c), 31, this.f75795d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGroupsItem(id=");
        sb2.append(this.f75793b);
        sb2.append(", stringId=");
        sb2.append(this.f75794c);
        sb2.append(", groups=");
        sb2.append(this.f75795d);
        sb2.append(", spanCount=");
        sb2.append(this.f75796e);
        sb2.append(", displayType=");
        sb2.append(this.f75797f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75798g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75793b);
        parcel.writeString(this.f75794c);
        Iterator itJ = C0.j(this.f75795d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f75796e);
        parcel.writeString(this.f75797f.name());
        parcel.writeString(this.f75798g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGroupsItem(long j12, String str, List list, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 14;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, list);
    }
}
