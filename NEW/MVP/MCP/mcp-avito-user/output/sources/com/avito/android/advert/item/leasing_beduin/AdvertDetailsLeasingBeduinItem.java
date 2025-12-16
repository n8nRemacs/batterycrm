package com.avito.android.advert.item.leasing_beduin;

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
import com.avito.android.beduin_models.BeduinModel;
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

/* compiled from: AdvertDetailsLeasingBeduinItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leasing_beduin/AdvertDetailsLeasingBeduinItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsLeasingBeduinItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsLeasingBeduinItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77336b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77337c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f77338d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f77339e;

    /* renamed from: f, reason: collision with root package name */
    public final int f77340f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<BeduinModel> f77341g;

    /* compiled from: AdvertDetailsLeasingBeduinItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsLeasingBeduinItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingBeduinItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsLeasingBeduinItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsLeasingBeduinItem(i12, j12, serpDisplayTypeValueOf, serpViewTypeValueOf, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsLeasingBeduinItem[] newArray(int i12) {
            return new AdvertDetailsLeasingBeduinItem[i12];
        }
    }

    public AdvertDetailsLeasingBeduinItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k List list) {
        this.f77336b = j12;
        this.f77337c = str;
        this.f77338d = serpDisplayType;
        this.f77339e = serpViewType;
        this.f77340f = i12;
        this.f77341g = list;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f77338d;
        return new AdvertDetailsLeasingBeduinItem(i12, this.f77336b, serpDisplayType, this.f77339e, this.f77337c, this.f77341g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77338d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsLeasingBeduinItem)) {
            return false;
        }
        AdvertDetailsLeasingBeduinItem advertDetailsLeasingBeduinItem = (AdvertDetailsLeasingBeduinItem) obj;
        return this.f77336b == advertDetailsLeasingBeduinItem.f77336b && L.f(this.f77337c, advertDetailsLeasingBeduinItem.f77337c) && this.f77338d == advertDetailsLeasingBeduinItem.f77338d && this.f77339e == advertDetailsLeasingBeduinItem.f77339e && this.f77340f == advertDetailsLeasingBeduinItem.f77340f && L.f(this.f77341g, advertDetailsLeasingBeduinItem.f77341g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77948b() {
        return this.f77336b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77950d() {
        return this.f77340f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77949c() {
        return this.f77337c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77952f() {
        return this.f77339e;
    }

    public final int hashCode() {
        return this.f77341g.hashCode() + r.e(this.f77340f, com.avito.android.actions_sheet.a.j(this.f77339e, com.avito.android.actions_sheet.a.h(this.f77338d, H.d(Long.hashCode(this.f77336b) * 31, 31, this.f77337c), 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsLeasingBeduinItem(id=");
        sb2.append(this.f77336b);
        sb2.append(", stringId=");
        sb2.append(this.f77337c);
        sb2.append(", displayType=");
        sb2.append(this.f77338d);
        sb2.append(", viewType=");
        sb2.append(this.f77339e);
        sb2.append(", spanCount=");
        sb2.append(this.f77340f);
        sb2.append(", leasingBeduinModels=");
        return H.p(sb2, this.f77341g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77336b);
        parcel.writeString(this.f77337c);
        parcel.writeString(this.f77338d.name());
        parcel.writeString(this.f77339e.name());
        parcel.writeInt(this.f77340f);
        Iterator itJ = C0.j(this.f77341g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsLeasingBeduinItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, List list, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 122;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, list);
    }
}
