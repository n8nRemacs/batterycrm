package com.avito.android.advert.item.beduin_block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBeduinFormItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsBeduinFormItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsBeduinFormItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertDetailsBlockId f73387b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BeduinForm f73388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73390e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f73391f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f73392g;

    /* compiled from: AdvertDetailsBeduinFormItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsBeduinFormItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBeduinFormItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsBeduinFormItem(AdvertDetailsBlockId.valueOf(parcel.readString()), (BeduinForm) parcel.readParcelable(AdvertDetailsBeduinFormItem.class.getClassLoader()), parcel.readInt(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBeduinFormItem[] newArray(int i12) {
            return new AdvertDetailsBeduinFormItem[i12];
        }
    }

    public AdvertDetailsBeduinFormItem(@k AdvertDetailsBlockId advertDetailsBlockId, @k BeduinForm beduinForm, int i12, @InterfaceC42161q int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f73387b = advertDetailsBlockId;
        this.f73388c = beduinForm;
        this.f73389d = i12;
        this.f73390e = i13;
        this.f73391f = serpDisplayType;
        this.f73392g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsBeduinFormItem(this.f73387b, this.f73388c, i12, this.f73390e, this.f73391f, this.f73392g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f73391f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsBeduinFormItem)) {
            return false;
        }
        AdvertDetailsBeduinFormItem advertDetailsBeduinFormItem = (AdvertDetailsBeduinFormItem) obj;
        return this.f73387b == advertDetailsBeduinFormItem.f73387b && L.f(this.f73388c, advertDetailsBeduinFormItem.f73388c) && this.f73389d == advertDetailsBeduinFormItem.f73389d && this.f73390e == advertDetailsBeduinFormItem.f73390e && this.f73391f == advertDetailsBeduinFormItem.f73391f && this.f73392g == advertDetailsBeduinFormItem.f73392g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268904i() {
        return this.f73389d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF283214b() {
        return this.f73388c.getF105312b();
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF268903h() {
        return this.f73392g;
    }

    public final int hashCode() {
        return this.f73392g.hashCode() + com.avito.android.actions_sheet.a.h(this.f73391f, r.e(this.f73390e, r.e(this.f73389d, (this.f73388c.hashCode() + (this.f73387b.hashCode() * 31)) * 31, 31), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsBeduinFormItem(blockId=");
        sb2.append(this.f73387b);
        sb2.append(", beduinForm=");
        sb2.append(this.f73388c);
        sb2.append(", spanCount=");
        sb2.append(this.f73389d);
        sb2.append(", horizontalPadding=");
        sb2.append(this.f73390e);
        sb2.append(", displayType=");
        sb2.append(this.f73391f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f73392g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f73387b.name());
        parcel.writeParcelable(this.f73388c, i12);
        parcel.writeInt(this.f73389d);
        parcel.writeInt(this.f73390e);
        parcel.writeString(this.f73391f.name());
        parcel.writeString(this.f73392g.name());
    }

    public /* synthetic */ AdvertDetailsBeduinFormItem(AdvertDetailsBlockId advertDetailsBlockId, BeduinForm beduinForm, int i12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        this(advertDetailsBlockId, beduinForm, i12, i13, (i14 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
