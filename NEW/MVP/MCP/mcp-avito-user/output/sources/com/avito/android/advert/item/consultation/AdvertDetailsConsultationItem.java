package com.avito.android.advert.item.consultation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advert_details.realty.DevelopmentsAdviceView;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsConsultationItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/AdvertDetailsConsultationItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsConsultationItem implements BlockItem, com.avito.android.serp.adapter.Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsConsultationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74628b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74630d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DevelopmentsAdviceView f74631e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ConsultationFormData f74632f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f74633g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f74634h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74635i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74636j;

    /* compiled from: AdvertDetailsConsultationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsConsultationItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsConsultationItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsConsultationItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (DevelopmentsAdviceView) parcel.readParcelable(AdvertDetailsConsultationItem.class.getClassLoader()), (ConsultationFormData) parcel.readParcelable(AdvertDetailsConsultationItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsConsultationItem[] newArray(int i12) {
            return new AdvertDetailsConsultationItem[i12];
        }
    }

    public AdvertDetailsConsultationItem(long j12, @Y61.k String str, int i12, @Y61.k DevelopmentsAdviceView developmentsAdviceView, @Y61.l ConsultationFormData consultationFormData, @Y61.l String str2, boolean z12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f74628b = j12;
        this.f74629c = str;
        this.f74630d = i12;
        this.f74631e = developmentsAdviceView;
        this.f74632f = consultationFormData;
        this.f74633g = str2;
        this.f74634h = z12;
        this.f74635i = serpDisplayType;
        this.f74636j = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsConsultationItem(this.f74628b, this.f74629c, i12, this.f74631e, this.f74632f, this.f74633g, this.f74634h, this.f74635i, this.f74636j);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74635i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsConsultationItem)) {
            return false;
        }
        AdvertDetailsConsultationItem advertDetailsConsultationItem = (AdvertDetailsConsultationItem) obj;
        return this.f74628b == advertDetailsConsultationItem.f74628b && kotlin.jvm.internal.L.f(this.f74629c, advertDetailsConsultationItem.f74629c) && this.f74630d == advertDetailsConsultationItem.f74630d && kotlin.jvm.internal.L.f(this.f74631e, advertDetailsConsultationItem.f74631e) && kotlin.jvm.internal.L.f(this.f74632f, advertDetailsConsultationItem.f74632f) && kotlin.jvm.internal.L.f(this.f74633g, advertDetailsConsultationItem.f74633g) && this.f74634h == advertDetailsConsultationItem.f74634h && this.f74635i == advertDetailsConsultationItem.f74635i && this.f74636j == advertDetailsConsultationItem.f74636j;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF75315b() {
        return this.f74628b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f74630d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f74629c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f74636j;
    }

    public final int hashCode() {
        int iHashCode = (this.f74631e.hashCode() + androidx.appcompat.app.r.e(this.f74630d, androidx.compose.foundation.H.d(Long.hashCode(this.f74628b) * 31, 31, this.f74629c), 31)) * 31;
        ConsultationFormData consultationFormData = this.f74632f;
        int iHashCode2 = (iHashCode + (consultationFormData == null ? 0 : consultationFormData.hashCode())) * 31;
        String str = this.f74633g;
        return this.f74636j.hashCode() + com.avito.android.actions_sheet.a.h(this.f74635i, androidx.appcompat.app.r.i((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f74634h), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsConsultationItem(id=");
        sb2.append(this.f74628b);
        sb2.append(", stringId=");
        sb2.append(this.f74629c);
        sb2.append(", spanCount=");
        sb2.append(this.f74630d);
        sb2.append(", viewData=");
        sb2.append(this.f74631e);
        sb2.append(", formData=");
        sb2.append(this.f74632f);
        sb2.append(", requestType=");
        sb2.append(this.f74633g);
        sb2.append(", isRedesign=");
        sb2.append(this.f74634h);
        sb2.append(", displayType=");
        sb2.append(this.f74635i);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74636j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74628b);
        parcel.writeString(this.f74629c);
        parcel.writeInt(this.f74630d);
        parcel.writeParcelable(this.f74631e, i12);
        parcel.writeParcelable(this.f74632f, i12);
        parcel.writeString(this.f74633g);
        parcel.writeInt(this.f74634h ? 1 : 0);
        parcel.writeString(this.f74635i.name());
        parcel.writeString(this.f74636j.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsConsultationItem(long j12, String str, int i12, DevelopmentsAdviceView developmentsAdviceView, ConsultationFormData consultationFormData, String str2, boolean z12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 37;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, developmentsAdviceView, (i13 & 16) != 0 ? null : consultationFormData, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? false : z12, (i13 & 128) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 256) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
