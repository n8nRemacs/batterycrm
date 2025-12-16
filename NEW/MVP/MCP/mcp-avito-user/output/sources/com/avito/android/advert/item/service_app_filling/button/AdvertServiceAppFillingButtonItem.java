package com.avito.android.advert.item.service_app_filling.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SimpleAdvertAction;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertServiceAppFillingButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/service_app_filling/button/AdvertServiceAppFillingButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertServiceAppFillingButtonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertServiceAppFillingButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79781b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79782c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f79783d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f79784e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79785f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleAdvertAction f79786g;

    /* compiled from: AdvertServiceAppFillingButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertServiceAppFillingButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertServiceAppFillingButtonItem createFromParcel(Parcel parcel) {
            return new AdvertServiceAppFillingButtonItem(parcel.readLong(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt(), (SimpleAdvertAction) parcel.readParcelable(AdvertServiceAppFillingButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertServiceAppFillingButtonItem[] newArray(int i12) {
            return new AdvertServiceAppFillingButtonItem[i12];
        }
    }

    public AdvertServiceAppFillingButtonItem(long j12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, int i12, @k SimpleAdvertAction simpleAdvertAction) {
        this.f79781b = j12;
        this.f79782c = str;
        this.f79783d = serpDisplayType;
        this.f79784e = serpViewType;
        this.f79785f = i12;
        this.f79786g = simpleAdvertAction;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertServiceAppFillingButtonItem(this.f79781b, this.f79782c, this.f79783d, this.f79784e, i12, this.f79786g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79783d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertServiceAppFillingButtonItem)) {
            return false;
        }
        AdvertServiceAppFillingButtonItem advertServiceAppFillingButtonItem = (AdvertServiceAppFillingButtonItem) obj;
        return this.f79781b == advertServiceAppFillingButtonItem.f79781b && L.f(this.f79782c, advertServiceAppFillingButtonItem.f79782c) && this.f79783d == advertServiceAppFillingButtonItem.f79783d && this.f79784e == advertServiceAppFillingButtonItem.f79784e && this.f79785f == advertServiceAppFillingButtonItem.f79785f && L.f(this.f79786g, advertServiceAppFillingButtonItem.f79786g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80368b() {
        return this.f79781b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80370d() {
        return this.f79785f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173917b() {
        return this.f79782c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80372f() {
        return this.f79784e;
    }

    public final int hashCode() {
        return this.f79786g.hashCode() + r.e(this.f79785f, com.avito.android.actions_sheet.a.j(this.f79784e, com.avito.android.actions_sheet.a.h(this.f79783d, H.d(Long.hashCode(this.f79781b) * 31, 31, this.f79782c), 31), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertServiceAppFillingButtonItem(id=" + this.f79781b + ", stringId=" + this.f79782c + ", displayType=" + this.f79783d + ", viewType=" + this.f79784e + ", spanCount=" + this.f79785f + ", button=" + this.f79786g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79781b);
        parcel.writeString(this.f79782c);
        parcel.writeString(this.f79783d.name());
        parcel.writeString(this.f79784e.name());
        parcel.writeInt(this.f79785f);
        parcel.writeParcelable(this.f79786g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertServiceAppFillingButtonItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, SimpleAdvertAction simpleAdvertAction, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 105;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, i12, simpleAdvertAction);
    }
}
