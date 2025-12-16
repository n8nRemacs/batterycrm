package com.avito.android.advert_details_items.title;

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

/* compiled from: AdvertDetailsTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/title/AdvertDetailsTitleItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsTitleItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85713b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85714c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85715d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f85716e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85717f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85718g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85719h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85720i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f85721j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85722k;

    /* renamed from: l, reason: collision with root package name */
    public final int f85723l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public SerpDisplayType f85724m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final SerpViewType f85725n;

    /* compiled from: AdvertDetailsTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTitleItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsTitleItem(parcel.readLong(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AdvertDetailsTitleItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTitleItem[] newArray(int i12) {
            return new AdvertDetailsTitleItem[i12];
        }
    }

    public AdvertDetailsTitleItem(long j12, @k String str, @k String str2, @l AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85713b = j12;
        this.f85714c = str;
        this.f85715d = str2;
        this.f85716e = attributedText;
        this.f85717f = z12;
        this.f85718g = z13;
        this.f85719h = z14;
        this.f85720i = z15;
        this.f85721j = z16;
        this.f85722k = z17;
        this.f85723l = i12;
        this.f85724m = serpDisplayType;
        this.f85725n = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsTitleItem(this.f85713b, this.f85714c, this.f85715d, this.f85716e, this.f85717f, this.f85718g, this.f85719h, this.f85720i, this.f85721j, this.f85722k, i12, this.f85724m, this.f85725n);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85724m = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsTitleItem)) {
            return false;
        }
        AdvertDetailsTitleItem advertDetailsTitleItem = (AdvertDetailsTitleItem) obj;
        return this.f85713b == advertDetailsTitleItem.f85713b && L.f(this.f85714c, advertDetailsTitleItem.f85714c) && L.f(this.f85715d, advertDetailsTitleItem.f85715d) && L.f(this.f85716e, advertDetailsTitleItem.f85716e) && this.f85717f == advertDetailsTitleItem.f85717f && this.f85718g == advertDetailsTitleItem.f85718g && this.f85719h == advertDetailsTitleItem.f85719h && this.f85720i == advertDetailsTitleItem.f85720i && this.f85721j == advertDetailsTitleItem.f85721j && this.f85722k == advertDetailsTitleItem.f85722k && this.f85723l == advertDetailsTitleItem.f85723l && this.f85724m == advertDetailsTitleItem.f85724m && this.f85725n == advertDetailsTitleItem.f85725n;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF282036b() {
        return this.f85713b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f85723l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145080b() {
        return this.f85714c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f85725n;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f85713b) * 31, 31, this.f85714c), 31, this.f85715d);
        AttributedText attributedText = this.f85716e;
        return this.f85725n.hashCode() + com.avito.android.actions_sheet.a.h(this.f85724m, r.e(this.f85723l, r.i(r.i(r.i(r.i(r.i(r.i((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f85717f), 31, this.f85718g), 31, this.f85719h), 31, this.f85720i), 31, this.f85721j), 31, this.f85722k), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsTitleItem(id=");
        sb2.append(this.f85713b);
        sb2.append(", stringId=");
        sb2.append(this.f85714c);
        sb2.append(", title=");
        sb2.append(this.f85715d);
        sb2.append(", subtitle=");
        sb2.append(this.f85716e);
        sb2.append(", closedAdvert=");
        sb2.append(this.f85717f);
        sb2.append(", isRestyle=");
        sb2.append(this.f85718g);
        sb2.append(", isGigRedesign=");
        sb2.append(this.f85719h);
        sb2.append(", isJobRedesign=");
        sb2.append(this.f85720i);
        sb2.append(", isServicesRedesign=");
        sb2.append(this.f85721j);
        sb2.append(", isHotel=");
        sb2.append(this.f85722k);
        sb2.append(", spanCount=");
        sb2.append(this.f85723l);
        sb2.append(", displayType=");
        sb2.append(this.f85724m);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85725n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f85713b);
        parcel.writeString(this.f85714c);
        parcel.writeString(this.f85715d);
        parcel.writeParcelable(this.f85716e, i12);
        parcel.writeInt(this.f85717f ? 1 : 0);
        parcel.writeInt(this.f85718g ? 1 : 0);
        parcel.writeInt(this.f85719h ? 1 : 0);
        parcel.writeInt(this.f85720i ? 1 : 0);
        parcel.writeInt(this.f85721j ? 1 : 0);
        parcel.writeInt(this.f85722k ? 1 : 0);
        parcel.writeInt(this.f85723l);
        parcel.writeString(this.f85724m.name());
        parcel.writeString(this.f85725n.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsTitleItem(long j12, String str, String str2, AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 1;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, attributedText, z12, (i13 & 32) != 0 ? false : z13, (i13 & 64) != 0 ? false : z14, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? false : z16, (i13 & 512) != 0 ? false : z17, i12, (i13 & 2048) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 4096) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
