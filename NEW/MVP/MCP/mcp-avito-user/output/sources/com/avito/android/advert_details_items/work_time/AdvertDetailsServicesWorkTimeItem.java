package com.avito.android.advert_details_items.work_time;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsServicesWorkTimeItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/work_time/AdvertDetailsServicesWorkTimeItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsServicesWorkTimeItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsServicesWorkTimeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f85769b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f85770c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f85771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85772e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f85773f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public SerpDisplayType f85774g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f85775h;

    /* compiled from: AdvertDetailsServicesWorkTimeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsServicesWorkTimeItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesWorkTimeItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsServicesWorkTimeItem((AttributedText) parcel.readParcelable(AdvertDetailsServicesWorkTimeItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsServicesWorkTimeItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsServicesWorkTimeItem.class.getClassLoader()), parcel.readInt(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsServicesWorkTimeItem[] newArray(int i12) {
            return new AdvertDetailsServicesWorkTimeItem[i12];
        }
    }

    public AdvertDetailsServicesWorkTimeItem(@k AttributedText attributedText, @l AttributedText attributedText2, @l AttributedText attributedText3, int i12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85769b = attributedText;
        this.f85770c = attributedText2;
        this.f85771d = attributedText3;
        this.f85772e = i12;
        this.f85773f = str;
        this.f85774g = serpDisplayType;
        this.f85775h = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f85774g;
        return new AdvertDetailsServicesWorkTimeItem(this.f85769b, this.f85770c, this.f85771d, i12, this.f85773f, serpDisplayType, this.f85775h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85774g = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsServicesWorkTimeItem)) {
            return false;
        }
        AdvertDetailsServicesWorkTimeItem advertDetailsServicesWorkTimeItem = (AdvertDetailsServicesWorkTimeItem) obj;
        return L.f(this.f85769b, advertDetailsServicesWorkTimeItem.f85769b) && L.f(this.f85770c, advertDetailsServicesWorkTimeItem.f85770c) && L.f(this.f85771d, advertDetailsServicesWorkTimeItem.f85771d) && this.f85772e == advertDetailsServicesWorkTimeItem.f85772e && L.f(this.f85773f, advertDetailsServicesWorkTimeItem.f85773f) && this.f85774g == advertDetailsServicesWorkTimeItem.f85774g && this.f85775h == advertDetailsServicesWorkTimeItem.f85775h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f85772e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145080b() {
        return this.f85773f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f85775h;
    }

    public final int hashCode() {
        int iHashCode = this.f85769b.hashCode() * 31;
        AttributedText attributedText = this.f85770c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f85771d;
        return this.f85775h.hashCode() + com.avito.android.actions_sheet.a.h(this.f85774g, H.d(r.e(this.f85772e, (iHashCode2 + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31, 31), 31, this.f85773f), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsServicesWorkTimeItem(common=");
        sb2.append(this.f85769b);
        sb2.append(", delimeter=");
        sb2.append(this.f85770c);
        sb2.append(", details=");
        sb2.append(this.f85771d);
        sb2.append(", spanCount=");
        sb2.append(this.f85772e);
        sb2.append(", stringId=");
        sb2.append(this.f85773f);
        sb2.append(", displayType=");
        sb2.append(this.f85774g);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85775h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f85769b, i12);
        parcel.writeParcelable(this.f85770c, i12);
        parcel.writeParcelable(this.f85771d, i12);
        parcel.writeInt(this.f85772e);
        parcel.writeString(this.f85773f);
        parcel.writeString(this.f85774g.name());
        parcel.writeString(this.f85775h.name());
    }

    public /* synthetic */ AdvertDetailsServicesWorkTimeItem(AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, int i12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        this(attributedText, attributedText2, attributedText3, i12, str, (i13 & 32) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 64) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
