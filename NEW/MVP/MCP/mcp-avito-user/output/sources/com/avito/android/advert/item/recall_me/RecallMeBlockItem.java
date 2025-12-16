package com.avito.android.advert.item.recall_me;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.RecallMeBlockDTO;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/recall_me/RecallMeBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RecallMeBlockItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<RecallMeBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f78466d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f78467e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f78468f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f78469g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecallMeBlockDTO f78470h;

    /* compiled from: RecallMeBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeBlockItem createFromParcel(Parcel parcel) {
            return new RecallMeBlockItem(parcel.readLong(), parcel.readInt(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readString(), (RecallMeBlockDTO) parcel.readParcelable(RecallMeBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeBlockItem[] newArray(int i12) {
            return new RecallMeBlockItem[i12];
        }
    }

    public RecallMeBlockItem(long j12, int i12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, @Y61.k String str2, @Y61.k RecallMeBlockDTO recallMeBlockDTO) {
        this.f78464b = j12;
        this.f78465c = i12;
        this.f78466d = str;
        this.f78467e = serpViewType;
        this.f78468f = serpDisplayType;
        this.f78469g = str2;
        this.f78470h = recallMeBlockDTO;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new RecallMeBlockItem(this.f78464b, i12, this.f78466d, this.f78467e, this.f78468f, this.f78469g, this.f78470h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f78468f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMeBlockItem)) {
            return false;
        }
        RecallMeBlockItem recallMeBlockItem = (RecallMeBlockItem) obj;
        return this.f78464b == recallMeBlockItem.f78464b && this.f78465c == recallMeBlockItem.f78465c && L.f(this.f78466d, recallMeBlockItem.f78466d) && this.f78467e == recallMeBlockItem.f78467e && this.f78468f == recallMeBlockItem.f78468f && L.f(this.f78469g, recallMeBlockItem.f78469g) && L.f(this.f78470h, recallMeBlockItem.f78470h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF269849b() {
        return this.f78464b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270704j() {
        return this.f78465c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF393799b() {
        return this.f78466d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270703i() {
        return this.f78467e;
    }

    public final int hashCode() {
        return this.f78470h.hashCode() + H.d(com.avito.android.actions_sheet.a.h(this.f78468f, com.avito.android.actions_sheet.a.j(this.f78467e, H.d(androidx.appcompat.app.r.e(this.f78465c, Long.hashCode(this.f78464b) * 31, 31), 31, this.f78466d), 31), 31), 31, this.f78469g);
    }

    @Y61.k
    public final String toString() {
        return "RecallMeBlockItem(id=" + this.f78464b + ", spanCount=" + this.f78465c + ", stringId=" + this.f78466d + ", viewType=" + this.f78467e + ", displayType=" + this.f78468f + ", advertId=" + this.f78469g + ", recallMeBlock=" + this.f78470h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f78464b);
        parcel.writeInt(this.f78465c);
        parcel.writeString(this.f78466d);
        parcel.writeString(this.f78467e.name());
        parcel.writeString(this.f78468f.name());
        parcel.writeString(this.f78469g);
        parcel.writeParcelable(this.f78470h, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecallMeBlockItem(long j12, int i12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, String str2, RecallMeBlockDTO recallMeBlockDTO, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 155;
        } else {
            j13 = j12;
        }
        this(j13, i12, (i13 & 4) != 0 ? String.valueOf(j13) : str, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, str2, recallMeBlockDTO);
    }
}
