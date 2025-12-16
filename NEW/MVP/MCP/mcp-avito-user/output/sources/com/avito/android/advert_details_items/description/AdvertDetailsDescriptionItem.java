package com.avito.android.advert_details_items.description;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.html_formatter.HtmlCharSequence;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailDescriptionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/description/AdvertDetailsDescriptionItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsDescriptionItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84603b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84604c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final HtmlCharSequence f84605d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84606e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Parcelable f84607f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84608g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84609h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84610i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f84611j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f84612k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f84613l;

    /* renamed from: m, reason: collision with root package name */
    public final int f84614m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public SerpDisplayType f84615n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final SerpViewType f84616o;

    /* compiled from: AdvertDetailDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDescriptionItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsDescriptionItem(parcel.readLong(), parcel.readString(), (HtmlCharSequence) parcel.readParcelable(AdvertDetailsDescriptionItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(AdvertDetailsDescriptionItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsDescriptionItem[] newArray(int i12) {
            return new AdvertDetailsDescriptionItem[i12];
        }
    }

    public AdvertDetailsDescriptionItem(long j12, @k String str, @l HtmlCharSequence htmlCharSequence, boolean z12, @l Parcelable parcelable, int i12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f84603b = j12;
        this.f84604c = str;
        this.f84605d = htmlCharSequence;
        this.f84606e = z12;
        this.f84607f = parcelable;
        this.f84608g = i12;
        this.f84609h = z13;
        this.f84610i = z14;
        this.f84611j = z15;
        this.f84612k = z16;
        this.f84613l = z17;
        this.f84614m = i13;
        this.f84615n = serpDisplayType;
        this.f84616o = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsDescriptionItem(this.f84603b, this.f84604c, this.f84605d, this.f84606e, this.f84607f, this.f84608g, this.f84609h, this.f84610i, this.f84611j, this.f84612k, this.f84613l, i12, this.f84615n, this.f84616o);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84615n = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsDescriptionItem)) {
            return false;
        }
        AdvertDetailsDescriptionItem advertDetailsDescriptionItem = (AdvertDetailsDescriptionItem) obj;
        return this.f84603b == advertDetailsDescriptionItem.f84603b && L.f(this.f84604c, advertDetailsDescriptionItem.f84604c) && L.f(this.f84605d, advertDetailsDescriptionItem.f84605d) && this.f84606e == advertDetailsDescriptionItem.f84606e && L.f(this.f84607f, advertDetailsDescriptionItem.f84607f) && this.f84608g == advertDetailsDescriptionItem.f84608g && this.f84609h == advertDetailsDescriptionItem.f84609h && this.f84610i == advertDetailsDescriptionItem.f84610i && this.f84611j == advertDetailsDescriptionItem.f84611j && this.f84612k == advertDetailsDescriptionItem.f84612k && this.f84613l == advertDetailsDescriptionItem.f84613l && this.f84614m == advertDetailsDescriptionItem.f84614m && this.f84615n == advertDetailsDescriptionItem.f84615n && this.f84616o == advertDetailsDescriptionItem.f84616o;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78313b() {
        return this.f84603b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78315d() {
        return this.f84614m;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78314c() {
        return this.f84604c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78317f() {
        return this.f84616o;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f84603b) * 31, 31, this.f84604c);
        HtmlCharSequence htmlCharSequence = this.f84605d;
        int i12 = r.i((iD2 + (htmlCharSequence == null ? 0 : htmlCharSequence.hashCode())) * 31, 31, this.f84606e);
        Parcelable parcelable = this.f84607f;
        return this.f84616o.hashCode() + com.avito.android.actions_sheet.a.h(this.f84615n, r.e(this.f84614m, r.i(r.i(r.i(r.i(r.i(r.e(this.f84608g, (i12 + (parcelable != null ? parcelable.hashCode() : 0)) * 31, 31), 31, this.f84609h), 31, this.f84610i), 31, this.f84611j), 31, this.f84612k), 31, this.f84613l), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsDescriptionItem(id=");
        sb2.append(this.f84603b);
        sb2.append(", stringId=");
        sb2.append(this.f84604c);
        sb2.append(", description=");
        sb2.append((Object) this.f84605d);
        sb2.append(", showDivider=");
        sb2.append(this.f84606e);
        sb2.append(", expandPanelState=");
        sb2.append(this.f84607f);
        sb2.append(", collapsedLinesCount=");
        sb2.append(this.f84608g);
        sb2.append(", closedAdvert=");
        sb2.append(this.f84609h);
        sb2.append(", isRestyle=");
        sb2.append(this.f84610i);
        sb2.append(", isHotelRedesign=");
        sb2.append(this.f84611j);
        sb2.append(", isGigRedesign=");
        sb2.append(this.f84612k);
        sb2.append(", isServicesRedesign=");
        sb2.append(this.f84613l);
        sb2.append(", spanCount=");
        sb2.append(this.f84614m);
        sb2.append(", displayType=");
        sb2.append(this.f84615n);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84616o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f84603b);
        parcel.writeString(this.f84604c);
        parcel.writeParcelable(this.f84605d, i12);
        parcel.writeInt(this.f84606e ? 1 : 0);
        parcel.writeParcelable(this.f84607f, i12);
        parcel.writeInt(this.f84608g);
        parcel.writeInt(this.f84609h ? 1 : 0);
        parcel.writeInt(this.f84610i ? 1 : 0);
        parcel.writeInt(this.f84611j ? 1 : 0);
        parcel.writeInt(this.f84612k ? 1 : 0);
        parcel.writeInt(this.f84613l ? 1 : 0);
        parcel.writeInt(this.f84614m);
        parcel.writeString(this.f84615n.name());
        parcel.writeString(this.f84616o.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsDescriptionItem(long j12, String str, HtmlCharSequence htmlCharSequence, boolean z12, Parcelable parcelable, int i12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 7;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, htmlCharSequence, (i14 & 8) != 0 ? false : z12, (i14 & 16) != 0 ? null : parcelable, (i14 & 32) != 0 ? 4 : i12, z13, (i14 & 128) != 0 ? false : z14, (i14 & 256) != 0 ? false : z15, (i14 & 512) != 0 ? false : z16, (i14 & 1024) != 0 ? false : z17, i13, (i14 & 4096) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 8192) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
