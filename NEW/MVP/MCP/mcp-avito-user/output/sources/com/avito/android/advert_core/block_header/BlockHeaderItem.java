package com.avito.android.advert_core.block_header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BlockHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/block_header/BlockHeaderItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BlockHeaderItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<BlockHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82997b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82998c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f82999d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f83000e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f83001f;

    /* compiled from: BlockHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BlockHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final BlockHeaderItem createFromParcel(Parcel parcel) {
            return new BlockHeaderItem(parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(BlockHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BlockHeaderItem[] newArray(int i12) {
            return new BlockHeaderItem[i12];
        }
    }

    public BlockHeaderItem(@k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l AttributedText attributedText) {
        this.f82997b = str;
        this.f82998c = i12;
        this.f82999d = serpDisplayType;
        this.f83000e = serpViewType;
        this.f83001f = attributedText;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new BlockHeaderItem(this.f82997b, i12, this.f82999d, this.f83000e, this.f83001f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f82999d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockHeaderItem)) {
            return false;
        }
        BlockHeaderItem blockHeaderItem = (BlockHeaderItem) obj;
        return L.f(this.f82997b, blockHeaderItem.f82997b) && this.f82998c == blockHeaderItem.f82998c && this.f82999d == blockHeaderItem.f82999d && this.f83000e == blockHeaderItem.f83000e && L.f(this.f83001f, blockHeaderItem.f83001f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78219b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF82955g() {
        return this.f82998c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82954f() {
        return this.f82997b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF82956h() {
        return this.f83000e;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f83000e, com.avito.android.actions_sheet.a.h(this.f82999d, r.e(this.f82998c, this.f82997b.hashCode() * 31, 31), 31), 31);
        AttributedText attributedText = this.f83001f;
        return iJ2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockHeaderItem(stringId=");
        sb2.append(this.f82997b);
        sb2.append(", spanCount=");
        sb2.append(this.f82998c);
        sb2.append(", displayType=");
        sb2.append(this.f82999d);
        sb2.append(", viewType=");
        sb2.append(this.f83000e);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f83001f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f82997b);
        parcel.writeInt(this.f82998c);
        parcel.writeString(this.f82999d.name());
        parcel.writeString(this.f83000e.name());
        parcel.writeParcelable(this.f83001f, i12);
    }

    public /* synthetic */ BlockHeaderItem(String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AttributedText attributedText, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, attributedText);
    }
}
