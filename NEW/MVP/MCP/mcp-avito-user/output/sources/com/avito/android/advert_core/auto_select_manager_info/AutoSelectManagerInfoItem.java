package com.avito.android.advert_core.auto_select_manager_info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectManagerInfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/auto_select_manager_info/AutoSelectManagerInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectManagerInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AutoSelectManagerInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82920c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f82921d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f82922e;

    /* renamed from: f, reason: collision with root package name */
    public final long f82923f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82924g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f82925h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f82926i;

    /* compiled from: AutoSelectManagerInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectManagerInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectManagerInfoItem createFromParcel(Parcel parcel) {
            return new AutoSelectManagerInfoItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(AutoSelectManagerInfoItem.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectManagerInfoItem[] newArray(int i12) {
            return new AutoSelectManagerInfoItem[i12];
        }
    }

    public AutoSelectManagerInfoItem(@k String str, @k String str2, @k Image image, @k String str3, long j12, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f82919b = str;
        this.f82920c = str2;
        this.f82921d = image;
        this.f82922e = str3;
        this.f82923f = j12;
        this.f82924g = i12;
        this.f82925h = serpDisplayType;
        this.f82926i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AutoSelectManagerInfoItem(this.f82919b, this.f82920c, this.f82921d, this.f82922e, this.f82923f, i12, this.f82925h, this.f82926i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f82925h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectManagerInfoItem)) {
            return false;
        }
        AutoSelectManagerInfoItem autoSelectManagerInfoItem = (AutoSelectManagerInfoItem) obj;
        return L.f(this.f82919b, autoSelectManagerInfoItem.f82919b) && L.f(this.f82920c, autoSelectManagerInfoItem.f82920c) && L.f(this.f82921d, autoSelectManagerInfoItem.f82921d) && L.f(this.f82922e, autoSelectManagerInfoItem.f82922e) && this.f82923f == autoSelectManagerInfoItem.f82923f && this.f82924g == autoSelectManagerInfoItem.f82924g && this.f82925h == autoSelectManagerInfoItem.f82925h && this.f82926i == autoSelectManagerInfoItem.f82926i;
    }

    @Override // TV0.a
    public final long getId() {
        return this.f82923f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270732f() {
        return this.f82924g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF318498b() {
        return this.f82922e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270731e() {
        return this.f82926i;
    }

    public final int hashCode() {
        return this.f82926i.hashCode() + com.avito.android.actions_sheet.a.h(this.f82925h, r.e(this.f82924g, r.g(H.d(com.avito.android.actions_sheet.a.g(this.f82921d, H.d(this.f82919b.hashCode() * 31, 31, this.f82920c), 31), 31, this.f82922e), 31, this.f82923f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectManagerInfoItem(title=");
        sb2.append(this.f82919b);
        sb2.append(", subtitle=");
        sb2.append(this.f82920c);
        sb2.append(", imgUrl=");
        sb2.append(this.f82921d);
        sb2.append(", stringId=");
        sb2.append(this.f82922e);
        sb2.append(", id=");
        sb2.append(this.f82923f);
        sb2.append(", spanCount=");
        sb2.append(this.f82924g);
        sb2.append(", displayType=");
        sb2.append(this.f82925h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f82926i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f82919b);
        parcel.writeString(this.f82920c);
        parcel.writeParcelable(this.f82921d, i12);
        parcel.writeString(this.f82922e);
        parcel.writeLong(this.f82923f);
        parcel.writeInt(this.f82924g);
        parcel.writeString(this.f82925h.name());
        parcel.writeString(this.f82926i.name());
    }

    public /* synthetic */ AutoSelectManagerInfoItem(String str, String str2, Image image, String str3, long j12, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(str, str2, image, str3, j12, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
