package com.avito.android.advert.item.services_price;

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

/* compiled from: ServicesPriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/services_price/ServicesPriceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServicesPriceItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<ServicesPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79953b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79955d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f79956e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f79957f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f79958g;

    /* compiled from: ServicesPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final ServicesPriceItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            return new ServicesPriceItem(parcel.readInt(), j12, SerpDisplayType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(ServicesPriceItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), string);
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesPriceItem[] newArray(int i12) {
            return new ServicesPriceItem[i12];
        }
    }

    public ServicesPriceItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @l AttributedText attributedText, @k SerpViewType serpViewType, @k String str) {
        this.f79953b = j12;
        this.f79954c = str;
        this.f79955d = i12;
        this.f79956e = serpViewType;
        this.f79957f = serpDisplayType;
        this.f79958g = attributedText;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f79957f;
        long j12 = this.f79953b;
        String str = this.f79954c;
        return new ServicesPriceItem(i12, j12, serpDisplayType, this.f79958g, this.f79956e, str);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f79957f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServicesPriceItem)) {
            return false;
        }
        ServicesPriceItem servicesPriceItem = (ServicesPriceItem) obj;
        return this.f79953b == servicesPriceItem.f79953b && L.f(this.f79954c, servicesPriceItem.f79954c) && this.f79955d == servicesPriceItem.f79955d && this.f79956e == servicesPriceItem.f79956e && this.f79957f == servicesPriceItem.f79957f && L.f(this.f79958g, servicesPriceItem.f79958g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF282036b() {
        return this.f79953b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f79955d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145080b() {
        return this.f79954c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f79956e;
    }

    public final int hashCode() {
        int iH2 = com.avito.android.actions_sheet.a.h(this.f79957f, com.avito.android.actions_sheet.a.j(this.f79956e, r.e(this.f79955d, H.d(Long.hashCode(this.f79953b) * 31, 31, this.f79954c), 31), 31), 31);
        AttributedText attributedText = this.f79958g;
        return iH2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServicesPriceItem(id=");
        sb2.append(this.f79953b);
        sb2.append(", stringId=");
        sb2.append(this.f79954c);
        sb2.append(", spanCount=");
        sb2.append(this.f79955d);
        sb2.append(", viewType=");
        sb2.append(this.f79956e);
        sb2.append(", displayType=");
        sb2.append(this.f79957f);
        sb2.append(", price=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f79958g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f79953b);
        parcel.writeString(this.f79954c);
        parcel.writeInt(this.f79955d);
        parcel.writeString(this.f79956e.name());
        parcel.writeString(this.f79957f.name());
        parcel.writeParcelable(this.f79958g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServicesPriceItem(long j12, String str, int i12, SerpViewType serpViewType, SerpDisplayType serpDisplayType, AttributedText attributedText, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 166;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, attributedText, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str);
    }
}
