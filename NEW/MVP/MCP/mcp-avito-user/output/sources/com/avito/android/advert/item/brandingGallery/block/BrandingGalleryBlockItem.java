package com.avito.android.advert.item.brandingGallery.block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.brandingGallery.items.BrandingGalleryBlockElementItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
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

/* compiled from: BrandingGalleryBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/block/BrandingGalleryBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BrandingGalleryBlockItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<BrandingGalleryBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<BrandingGalleryBlockElementItem> f74120b;

    /* renamed from: c, reason: collision with root package name */
    public final long f74121c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f74122d;

    /* renamed from: e, reason: collision with root package name */
    public final int f74123e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f74124f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f74125g;

    /* compiled from: BrandingGalleryBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingGalleryBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final BrandingGalleryBlockItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BrandingGalleryBlockElementItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BrandingGalleryBlockItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BrandingGalleryBlockItem[] newArray(int i12) {
            return new BrandingGalleryBlockItem[i12];
        }
    }

    public BrandingGalleryBlockItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k List list) {
        this.f74120b = list;
        this.f74121c = j12;
        this.f74122d = str;
        this.f74123e = i12;
        this.f74124f = serpDisplayType;
        this.f74125g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f74124f;
        List<BrandingGalleryBlockElementItem> list = this.f74120b;
        return new BrandingGalleryBlockItem(i12, this.f74121c, serpDisplayType, this.f74125g, this.f74122d, list);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74124f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingGalleryBlockItem)) {
            return false;
        }
        BrandingGalleryBlockItem brandingGalleryBlockItem = (BrandingGalleryBlockItem) obj;
        return L.f(this.f74120b, brandingGalleryBlockItem.f74120b) && this.f74121c == brandingGalleryBlockItem.f74121c && L.f(this.f74122d, brandingGalleryBlockItem.f74122d) && this.f74123e == brandingGalleryBlockItem.f74123e && this.f74124f == brandingGalleryBlockItem.f74124f && this.f74125g == brandingGalleryBlockItem.f74125g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75092b() {
        return this.f74121c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f74123e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288411b() {
        return this.f74122d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f74125g;
    }

    public final int hashCode() {
        return this.f74125g.hashCode() + com.avito.android.actions_sheet.a.h(this.f74124f, r.e(this.f74123e, H.d(r.g(this.f74120b.hashCode() * 31, 31, this.f74121c), 31, this.f74122d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingGalleryBlockItem(items=");
        sb2.append(this.f74120b);
        sb2.append(", id=");
        sb2.append(this.f74121c);
        sb2.append(", stringId=");
        sb2.append(this.f74122d);
        sb2.append(", spanCount=");
        sb2.append(this.f74123e);
        sb2.append(", displayType=");
        sb2.append(this.f74124f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74125g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f74120b, parcel);
        while (itJ.hasNext()) {
            ((BrandingGalleryBlockElementItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeLong(this.f74121c);
        parcel.writeString(this.f74122d);
        parcel.writeInt(this.f74123e);
        parcel.writeString(this.f74124f.name());
        parcel.writeString(this.f74125g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrandingGalleryBlockItem(List list, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 202;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 4) != 0 ? String.valueOf(j13) : str, list);
    }
}
