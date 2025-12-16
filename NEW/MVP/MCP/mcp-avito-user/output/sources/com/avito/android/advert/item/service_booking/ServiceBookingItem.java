package com.avito.android.advert.item.service_booking;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/service_booking/ServiceBookingItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "TooltipInfo", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServiceBookingItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<ServiceBookingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f79811b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f79812c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f79813d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TooltipInfo f79814e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79815f;

    /* renamed from: g, reason: collision with root package name */
    public final long f79816g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f79817h;

    /* renamed from: i, reason: collision with root package name */
    public final int f79818i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79819j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79820k;

    /* compiled from: ServiceBookingItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/service_booking/ServiceBookingItem$TooltipInfo;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class TooltipInfo implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<TooltipInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f79821b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f79822c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f79823d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f79824e;

        /* compiled from: ServiceBookingItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TooltipInfo> {
            @Override // android.os.Parcelable.Creator
            public final TooltipInfo createFromParcel(Parcel parcel) {
                return new TooltipInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TooltipInfo[] newArray(int i12) {
                return new TooltipInfo[i12];
            }
        }

        public TooltipInfo(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f79821b = str;
            this.f79822c = str2;
            this.f79823d = str3;
            this.f79824e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooltipInfo)) {
                return false;
            }
            TooltipInfo tooltipInfo = (TooltipInfo) obj;
            return L.f(this.f79821b, tooltipInfo.f79821b) && L.f(this.f79822c, tooltipInfo.f79822c) && L.f(this.f79823d, tooltipInfo.f79823d) && L.f(this.f79824e, tooltipInfo.f79824e);
        }

        public final int hashCode() {
            String str = this.f79821b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f79822c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f79823d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f79824e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TooltipInfo(title=");
            sb2.append(this.f79821b);
            sb2.append(", body=");
            sb2.append(this.f79822c);
            sb2.append(", key=");
            sb2.append(this.f79823d);
            sb2.append(", buttonText=");
            return C22026a.c(sb2, this.f79824e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f79821b);
            parcel.writeString(this.f79822c);
            parcel.writeString(this.f79823d);
            parcel.writeString(this.f79824e);
        }
    }

    /* compiled from: ServiceBookingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceBookingItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItem createFromParcel(Parcel parcel) {
            return new ServiceBookingItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingItem.class.getClassLoader()), parcel.readInt() == 0 ? null : TooltipInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingItem[] newArray(int i12) {
            return new ServiceBookingItem[i12];
        }
    }

    public ServiceBookingItem(@Y61.k String str, @Y61.l String str2, @Y61.k DeepLink deepLink, @Y61.l TooltipInfo tooltipInfo, boolean z12, long j12, @Y61.k String str3, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f79811b = str;
        this.f79812c = str2;
        this.f79813d = deepLink;
        this.f79814e = tooltipInfo;
        this.f79815f = z12;
        this.f79816g = j12;
        this.f79817h = str3;
        this.f79818i = i12;
        this.f79819j = serpDisplayType;
        this.f79820k = serpViewType;
    }

    public static ServiceBookingItem b(ServiceBookingItem serviceBookingItem, int i12, int i13) {
        String str = serviceBookingItem.f79811b;
        String str2 = serviceBookingItem.f79812c;
        DeepLink deepLink = serviceBookingItem.f79813d;
        TooltipInfo tooltipInfo = (i13 & 8) != 0 ? serviceBookingItem.f79814e : null;
        boolean z12 = serviceBookingItem.f79815f;
        long j12 = serviceBookingItem.f79816g;
        String str3 = serviceBookingItem.f79817h;
        if ((i13 & 128) != 0) {
            i12 = serviceBookingItem.f79818i;
        }
        SerpDisplayType serpDisplayType = serviceBookingItem.f79819j;
        SerpViewType serpViewType = serviceBookingItem.f79820k;
        serviceBookingItem.getClass();
        return new ServiceBookingItem(str, str2, deepLink, tooltipInfo, z12, j12, str3, i12, serpDisplayType, serpViewType);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return b(this, i12, 895);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79819j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingItem)) {
            return false;
        }
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) obj;
        return L.f(this.f79811b, serviceBookingItem.f79811b) && L.f(this.f79812c, serviceBookingItem.f79812c) && L.f(this.f79813d, serviceBookingItem.f79813d) && L.f(this.f79814e, serviceBookingItem.f79814e) && this.f79815f == serviceBookingItem.f79815f && this.f79816g == serviceBookingItem.f79816g && L.f(this.f79817h, serviceBookingItem.f79817h) && this.f79818i == serviceBookingItem.f79818i && this.f79819j == serviceBookingItem.f79819j && this.f79820k == serviceBookingItem.f79820k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78177b() {
        return this.f79816g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78180e() {
        return this.f79818i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78178c() {
        return this.f79817h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78182g() {
        return this.f79820k;
    }

    public final int hashCode() {
        int iHashCode = this.f79811b.hashCode() * 31;
        String str = this.f79812c;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f79813d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        TooltipInfo tooltipInfo = this.f79814e;
        return this.f79820k.hashCode() + com.avito.android.actions_sheet.a.h(this.f79819j, r.e(this.f79818i, H.d(r.g(r.i((iE2 + (tooltipInfo != null ? tooltipInfo.hashCode() : 0)) * 31, 31, this.f79815f), 31, this.f79816g), 31, this.f79817h), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingItem(title=");
        sb2.append(this.f79811b);
        sb2.append(", description=");
        sb2.append(this.f79812c);
        sb2.append(", uri=");
        sb2.append(this.f79813d);
        sb2.append(", tooltip=");
        sb2.append(this.f79814e);
        sb2.append(", isRestyle=");
        sb2.append(this.f79815f);
        sb2.append(", id=");
        sb2.append(this.f79816g);
        sb2.append(", stringId=");
        sb2.append(this.f79817h);
        sb2.append(", spanCount=");
        sb2.append(this.f79818i);
        sb2.append(", displayType=");
        sb2.append(this.f79819j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f79820k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f79811b);
        parcel.writeString(this.f79812c);
        parcel.writeParcelable(this.f79813d, i12);
        TooltipInfo tooltipInfo = this.f79814e;
        if (tooltipInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltipInfo.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f79815f ? 1 : 0);
        parcel.writeLong(this.f79816g);
        parcel.writeString(this.f79817h);
        parcel.writeInt(this.f79818i);
        parcel.writeString(this.f79819j.name());
        parcel.writeString(this.f79820k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ServiceBookingItem(String str, String str2, DeepLink deepLink, TooltipInfo tooltipInfo, boolean z12, long j12, String str3, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 32) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 61;
        } else {
            j13 = j12;
        }
        this(str, str2, deepLink, tooltipInfo, z12, j13, (i13 & 64) != 0 ? String.valueOf(j13) : str3, i12, (i13 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
