package com.avito.android.advert.item.address_centrity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.address_centrity.AddressCentrityBlock;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddressCentrityBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/address_centrity/AddressCentrityBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddressCentrityBlockItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AddressCentrityBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72640d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AddressCentrityBlock f72641e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72642f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72643g;

    /* compiled from: AddressCentrityBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddressCentrityBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AddressCentrityBlockItem createFromParcel(Parcel parcel) {
            return new AddressCentrityBlockItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (AddressCentrityBlock) parcel.readParcelable(AddressCentrityBlockItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddressCentrityBlockItem[] newArray(int i12) {
            return new AddressCentrityBlockItem[i12];
        }
    }

    public AddressCentrityBlockItem(long j12, @Y61.k String str, int i12, @Y61.k AddressCentrityBlock addressCentrityBlock, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f72638b = j12;
        this.f72639c = str;
        this.f72640d = i12;
        this.f72641e = addressCentrityBlock;
        this.f72642f = serpDisplayType;
        this.f72643g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AddressCentrityBlockItem(this.f72638b, this.f72639c, i12, this.f72641e, this.f72642f, this.f72643g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72642f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressCentrityBlockItem)) {
            return false;
        }
        AddressCentrityBlockItem addressCentrityBlockItem = (AddressCentrityBlockItem) obj;
        return this.f72638b == addressCentrityBlockItem.f72638b && L.f(this.f72639c, addressCentrityBlockItem.f72639c) && this.f72640d == addressCentrityBlockItem.f72640d && L.f(this.f72641e, addressCentrityBlockItem.f72641e) && this.f72642f == addressCentrityBlockItem.f72642f && this.f72643g == addressCentrityBlockItem.f72643g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f72638b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75425n() {
        return this.f72640d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74202f() {
        return this.f72639c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75427p() {
        return this.f72643g;
    }

    public final int hashCode() {
        return this.f72643g.hashCode() + com.avito.android.actions_sheet.a.h(this.f72642f, (this.f72641e.hashCode() + r.e(this.f72640d, H.d(Long.hashCode(this.f72638b) * 31, 31, this.f72639c), 31)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressCentrityBlockItem(id=");
        sb2.append(this.f72638b);
        sb2.append(", stringId=");
        sb2.append(this.f72639c);
        sb2.append(", spanCount=");
        sb2.append(this.f72640d);
        sb2.append(", block=");
        sb2.append(this.f72641e);
        sb2.append(", displayType=");
        sb2.append(this.f72642f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72643g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72638b);
        parcel.writeString(this.f72639c);
        parcel.writeInt(this.f72640d);
        parcel.writeParcelable(this.f72641e, i12);
        parcel.writeString(this.f72642f.name());
        parcel.writeString(this.f72643g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AddressCentrityBlockItem(long j12, String str, int i12, AddressCentrityBlock addressCentrityBlock, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 35;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, addressCentrityBlock, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
