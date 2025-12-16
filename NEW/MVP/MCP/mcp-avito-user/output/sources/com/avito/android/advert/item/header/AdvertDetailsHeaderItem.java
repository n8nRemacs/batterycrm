package com.avito.android.advert.item.header;

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
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/header/AdvertDetailsHeaderItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsHeaderItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75824b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75825c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f75826d;

    /* renamed from: e, reason: collision with root package name */
    public final int f75827e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f75828f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f75829g;

    /* compiled from: AdvertDetailsHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHeaderItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            return new AdvertDetailsHeaderItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AdvertDetailsHeaderItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHeaderItem[] newArray(int i12) {
            return new AdvertDetailsHeaderItem[i12];
        }
    }

    public AdvertDetailsHeaderItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k AttributedText attributedText, @k SerpViewType serpViewType, @k String str) {
        this.f75824b = j12;
        this.f75825c = str;
        this.f75826d = attributedText;
        this.f75827e = i12;
        this.f75828f = serpDisplayType;
        this.f75829g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f75828f;
        return new AdvertDetailsHeaderItem(i12, this.f75824b, serpDisplayType, this.f75826d, this.f75829g, this.f75825c);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75828f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsHeaderItem)) {
            return false;
        }
        AdvertDetailsHeaderItem advertDetailsHeaderItem = (AdvertDetailsHeaderItem) obj;
        return this.f75824b == advertDetailsHeaderItem.f75824b && L.f(this.f75825c, advertDetailsHeaderItem.f75825c) && L.f(this.f75826d, advertDetailsHeaderItem.f75826d) && this.f75827e == advertDetailsHeaderItem.f75827e && this.f75828f == advertDetailsHeaderItem.f75828f && this.f75829g == advertDetailsHeaderItem.f75829g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF72541b() {
        return this.f75824b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF72543d() {
        return this.f75827e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72542c() {
        return this.f75825c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF72545f() {
        return this.f75829g;
    }

    public final int hashCode() {
        return this.f75829g.hashCode() + com.avito.android.actions_sheet.a.h(this.f75828f, r.e(this.f75827e, com.avito.android.actions_sheet.a.b(H.d(Long.hashCode(this.f75824b) * 31, 31, this.f75825c), 31, this.f75826d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsHeaderItem(id=");
        sb2.append(this.f75824b);
        sb2.append(", stringId=");
        sb2.append(this.f75825c);
        sb2.append(", header=");
        sb2.append(this.f75826d);
        sb2.append(", spanCount=");
        sb2.append(this.f75827e);
        sb2.append(", displayType=");
        sb2.append(this.f75828f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f75829g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75824b);
        parcel.writeString(this.f75825c);
        parcel.writeParcelable(this.f75826d, i12);
        parcel.writeInt(this.f75827e);
        parcel.writeString(this.f75828f.name());
        parcel.writeString(this.f75829g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsHeaderItem(long j12, String str, AttributedText attributedText, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 138;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, attributedText, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str);
    }
}
