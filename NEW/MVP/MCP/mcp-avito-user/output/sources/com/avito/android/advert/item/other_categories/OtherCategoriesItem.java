package com.avito.android.advert.item.other_categories;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.other_categories.item.CategoryItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
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

/* compiled from: OtherCategoriesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/other_categories/OtherCategoriesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OtherCategoriesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<OtherCategoriesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77833c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f77834d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<CategoryItem> f77835e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f77836f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f77837g;

    /* renamed from: h, reason: collision with root package name */
    public final int f77838h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public SerpDisplayType f77839i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f77840j;

    /* compiled from: OtherCategoriesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OtherCategoriesItem> {
        @Override // android.os.Parcelable.Creator
        public final OtherCategoriesItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CategoryItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new OtherCategoriesItem(j12, string, string2, arrayList, parcel.readInt() != 0, (DeepLink) parcel.readParcelable(OtherCategoriesItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final OtherCategoriesItem[] newArray(int i12) {
            return new OtherCategoriesItem[i12];
        }
    }

    public OtherCategoriesItem(long j12, @k String str, @k String str2, @k List<CategoryItem> list, boolean z12, @l DeepLink deepLink, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77832b = j12;
        this.f77833c = str;
        this.f77834d = str2;
        this.f77835e = list;
        this.f77836f = z12;
        this.f77837g = deepLink;
        this.f77838h = i12;
        this.f77839i = serpDisplayType;
        this.f77840j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new OtherCategoriesItem(this.f77832b, this.f77833c, this.f77834d, this.f77835e, this.f77836f, this.f77837g, i12, this.f77839i, this.f77840j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77839i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherCategoriesItem)) {
            return false;
        }
        OtherCategoriesItem otherCategoriesItem = (OtherCategoriesItem) obj;
        return this.f77832b == otherCategoriesItem.f77832b && L.f(this.f77833c, otherCategoriesItem.f77833c) && L.f(this.f77834d, otherCategoriesItem.f77834d) && L.f(this.f77835e, otherCategoriesItem.f77835e) && this.f77836f == otherCategoriesItem.f77836f && L.f(this.f77837g, otherCategoriesItem.f77837g) && this.f77838h == otherCategoriesItem.f77838h && this.f77839i == otherCategoriesItem.f77839i && this.f77840j == otherCategoriesItem.f77840j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80616b() {
        return this.f77832b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269108b() {
        return this.f77838h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323448b() {
        return this.f77833c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269112f() {
        return this.f77840j;
    }

    public final int hashCode() {
        int i12 = r.i(H.e(H.d(H.d(Long.hashCode(this.f77832b) * 31, 31, this.f77833c), 31, this.f77834d), 31, this.f77835e), 31, this.f77836f);
        DeepLink deepLink = this.f77837g;
        return this.f77840j.hashCode() + com.avito.android.actions_sheet.a.h(this.f77839i, r.e(this.f77838h, (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OtherCategoriesItem(id=");
        sb2.append(this.f77832b);
        sb2.append(", stringId=");
        sb2.append(this.f77833c);
        sb2.append(", title=");
        sb2.append(this.f77834d);
        sb2.append(", items=");
        sb2.append(this.f77835e);
        sb2.append(", showTitleArrow=");
        sb2.append(this.f77836f);
        sb2.append(", titleDeepLink=");
        sb2.append(this.f77837g);
        sb2.append(", spanCount=");
        sb2.append(this.f77838h);
        sb2.append(", displayType=");
        sb2.append(this.f77839i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77840j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77832b);
        parcel.writeString(this.f77833c);
        parcel.writeString(this.f77834d);
        Iterator itJ = C0.j(this.f77835e, parcel);
        while (itJ.hasNext()) {
            ((CategoryItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f77836f ? 1 : 0);
        parcel.writeParcelable(this.f77837g, i12);
        parcel.writeInt(this.f77838h);
        parcel.writeString(this.f77839i.name());
        parcel.writeString(this.f77840j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OtherCategoriesItem(long j12, String str, String str2, List list, boolean z12, DeepLink deepLink, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 145;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, list, z12, deepLink, i12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
