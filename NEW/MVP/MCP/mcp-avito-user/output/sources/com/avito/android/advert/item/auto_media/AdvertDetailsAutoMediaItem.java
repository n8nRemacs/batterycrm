package com.avito.android.advert.item.auto_media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.auto_media.preview.AutoMediaPreviewItem;
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

/* compiled from: AdvertDetailsAutoMediaItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/auto_media/AdvertDetailsAutoMediaItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsAutoMediaItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsAutoMediaItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f72905b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72906c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f72907d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<AutoMediaPreviewItem> f72908e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72909f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f72910g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f72911h;

    /* compiled from: AdvertDetailsAutoMediaItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsAutoMediaItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoMediaItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoMediaPreviewItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDetailsAutoMediaItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsAutoMediaItem[] newArray(int i12) {
            return new AdvertDetailsAutoMediaItem[i12];
        }
    }

    public AdvertDetailsAutoMediaItem(int i12, long j12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.k String str, @Y61.k String str2, @Y61.k List list) {
        this.f72905b = j12;
        this.f72906c = str;
        this.f72907d = str2;
        this.f72908e = list;
        this.f72909f = i12;
        this.f72910g = serpDisplayType;
        this.f72911h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f72910g;
        return new AdvertDetailsAutoMediaItem(i12, this.f72905b, serpDisplayType, this.f72911h, this.f72906c, this.f72907d, this.f72908e);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f72910g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsAutoMediaItem)) {
            return false;
        }
        AdvertDetailsAutoMediaItem advertDetailsAutoMediaItem = (AdvertDetailsAutoMediaItem) obj;
        return this.f72905b == advertDetailsAutoMediaItem.f72905b && L.f(this.f72906c, advertDetailsAutoMediaItem.f72906c) && L.f(this.f72907d, advertDetailsAutoMediaItem.f72907d) && L.f(this.f72908e, advertDetailsAutoMediaItem.f72908e) && this.f72909f == advertDetailsAutoMediaItem.f72909f && this.f72910g == advertDetailsAutoMediaItem.f72910g && this.f72911h == advertDetailsAutoMediaItem.f72911h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83624b() {
        return this.f72905b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264948c() {
        return this.f72909f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324032b() {
        return this.f72906c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264884g() {
        return this.f72911h;
    }

    public final int hashCode() {
        return this.f72911h.hashCode() + com.avito.android.actions_sheet.a.h(this.f72910g, r.e(this.f72909f, H.e(H.d(H.d(Long.hashCode(this.f72905b) * 31, 31, this.f72906c), 31, this.f72907d), 31, this.f72908e), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoMediaItem(id=");
        sb2.append(this.f72905b);
        sb2.append(", stringId=");
        sb2.append(this.f72906c);
        sb2.append(", title=");
        sb2.append(this.f72907d);
        sb2.append(", previews=");
        sb2.append(this.f72908e);
        sb2.append(", spanCount=");
        sb2.append(this.f72909f);
        sb2.append(", displayType=");
        sb2.append(this.f72910g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f72911h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f72905b);
        parcel.writeString(this.f72906c);
        parcel.writeString(this.f72907d);
        Iterator itJ = C0.j(this.f72908e, parcel);
        while (itJ.hasNext()) {
            ((AutoMediaPreviewItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f72909f);
        parcel.writeString(this.f72910g.name());
        parcel.writeString(this.f72911h.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsAutoMediaItem(long j12, String str, String str2, List list, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 160;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, list);
    }
}
