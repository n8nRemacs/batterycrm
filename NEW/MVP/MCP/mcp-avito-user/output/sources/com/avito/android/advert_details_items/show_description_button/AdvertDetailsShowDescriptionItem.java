package com.avito.android.advert_details_items.show_description_button;

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
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsShowDescriptionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/show_description_button/AdvertDetailsShowDescriptionItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsShowDescriptionItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsShowDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f85685b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85686c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f85687d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85688e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f85689f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f85690g;

    /* compiled from: AdvertDetailsShowDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsShowDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShowDescriptionItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsShowDescriptionItem(parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsShowDescriptionItem[] newArray(int i12) {
            return new AdvertDetailsShowDescriptionItem[i12];
        }
    }

    public AdvertDetailsShowDescriptionItem(boolean z12, long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85685b = z12;
        this.f85686c = j12;
        this.f85687d = str;
        this.f85688e = i12;
        this.f85689f = serpDisplayType;
        this.f85690g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsShowDescriptionItem(this.f85685b, this.f85686c, this.f85687d, i12, this.f85689f, this.f85690g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85689f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsShowDescriptionItem)) {
            return false;
        }
        AdvertDetailsShowDescriptionItem advertDetailsShowDescriptionItem = (AdvertDetailsShowDescriptionItem) obj;
        return this.f85685b == advertDetailsShowDescriptionItem.f85685b && this.f85686c == advertDetailsShowDescriptionItem.f85686c && L.f(this.f85687d, advertDetailsShowDescriptionItem.f85687d) && this.f85688e == advertDetailsShowDescriptionItem.f85688e && this.f85689f == advertDetailsShowDescriptionItem.f85689f && this.f85690g == advertDetailsShowDescriptionItem.f85690g;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getF85685b() {
        return this.f85685b;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75367b() {
        return this.f85686c;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75369d() {
        return this.f85688e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75368c() {
        return this.f85687d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75370e() {
        return this.f85690g;
    }

    public final int hashCode() {
        return this.f85690g.hashCode() + com.avito.android.actions_sheet.a.h(this.f85689f, r.e(this.f85688e, H.d(r.g(Boolean.hashCode(this.f85685b) * 31, 31, this.f85686c), 31, this.f85687d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsShowDescriptionItem(descriptionShown=");
        sb2.append(this.f85685b);
        sb2.append(", id=");
        sb2.append(this.f85686c);
        sb2.append(", stringId=");
        sb2.append(this.f85687d);
        sb2.append(", spanCount=");
        sb2.append(this.f85688e);
        sb2.append(", displayType=");
        sb2.append(this.f85689f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85690g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f85685b ? 1 : 0);
        parcel.writeLong(this.f85686c);
        parcel.writeString(this.f85687d);
        parcel.writeInt(this.f85688e);
        parcel.writeString(this.f85689f.name());
        parcel.writeString(this.f85690g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsShowDescriptionItem(boolean z12, long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        boolean z13 = (i13 & 1) != 0 ? false : z12;
        if ((i13 & 2) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 69;
        } else {
            j13 = j12;
        }
        this(z13, j13, (i13 & 4) != 0 ? String.valueOf(j13) : str, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
