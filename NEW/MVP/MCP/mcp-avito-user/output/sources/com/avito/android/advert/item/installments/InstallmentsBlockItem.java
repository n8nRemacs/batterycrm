package com.avito.android.advert.item.installments;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/installments/InstallmentsBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InstallmentsBlockItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<InstallmentsBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InstallmentsBlock f76564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76565c;

    /* renamed from: d, reason: collision with root package name */
    public final long f76566d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f76567e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f76568f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f76569g;

    /* renamed from: h, reason: collision with root package name */
    public final long f76570h;

    /* compiled from: InstallmentsBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlockItem createFromParcel(Parcel parcel) {
            return new InstallmentsBlockItem((InstallmentsBlock) parcel.readParcelable(InstallmentsBlockItem.class.getClassLoader()), parcel.readInt(), parcel.readLong(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsBlockItem[] newArray(int i12) {
            return new InstallmentsBlockItem[i12];
        }
    }

    public InstallmentsBlockItem(@k InstallmentsBlock installmentsBlock, int i12, long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f76564b = installmentsBlock;
        this.f76565c = i12;
        this.f76566d = j12;
        this.f76567e = str;
        this.f76568f = serpDisplayType;
        this.f76569g = serpViewType;
        this.f76570h = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new InstallmentsBlockItem(this.f76564b, i12, this.f76566d, this.f76567e, this.f76568f, this.f76569g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f76568f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsBlockItem)) {
            return false;
        }
        InstallmentsBlockItem installmentsBlockItem = (InstallmentsBlockItem) obj;
        return L.f(this.f76564b, installmentsBlockItem.f76564b) && this.f76565c == installmentsBlockItem.f76565c && this.f76566d == installmentsBlockItem.f76566d && L.f(this.f76567e, installmentsBlockItem.f76567e) && this.f76568f == installmentsBlockItem.f76568f && this.f76569g == installmentsBlockItem.f76569g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75535g() {
        return this.f76566d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75537i() {
        return this.f76565c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75536h() {
        return this.f76567e;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77570h() {
        return this.f76570h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75539k() {
        return this.f76569g;
    }

    public final int hashCode() {
        return this.f76569g.hashCode() + com.avito.android.actions_sheet.a.h(this.f76568f, H.d(r.g(r.e(this.f76565c, this.f76564b.hashCode() * 31, 31), 31, this.f76566d), 31, this.f76567e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsBlockItem(installmentsBlock=");
        sb2.append(this.f76564b);
        sb2.append(", spanCount=");
        sb2.append(this.f76565c);
        sb2.append(", id=");
        sb2.append(this.f76566d);
        sb2.append(", stringId=");
        sb2.append(this.f76567e);
        sb2.append(", displayType=");
        sb2.append(this.f76568f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f76569g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f76564b, i12);
        parcel.writeInt(this.f76565c);
        parcel.writeLong(this.f76566d);
        parcel.writeString(this.f76567e);
        parcel.writeString(this.f76568f.name());
        parcel.writeString(this.f76569g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstallmentsBlockItem(InstallmentsBlock installmentsBlock, int i12, long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 4) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 21;
        } else {
            j13 = j12;
        }
        this(installmentsBlock, i12, j13, (i13 & 8) != 0 ? String.valueOf(j13) : str, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
