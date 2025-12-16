package com.avito.android.advert.item.travel.price;

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

/* compiled from: AdvertDetailsTravelPriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/travel/price/AdvertDetailsTravelPriceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Version", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsTravelPriceItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsTravelPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f80557c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f80559e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f80560f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f80561g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f80562h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f80563i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f80564j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Version f80565k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsTravelPriceItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/travel/price/AdvertDetailsTravelPriceItem$Version;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Version {

        /* renamed from: b, reason: collision with root package name */
        public static final Version f80566b;

        /* renamed from: c, reason: collision with root package name */
        public static final Version f80567c;

        /* renamed from: d, reason: collision with root package name */
        public static final Version f80568d;

        /* renamed from: e, reason: collision with root package name */
        public static final Version f80569e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Version[] f80570f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f80571g;

        static {
            Version version = new Version("NewPrice1Discount1", 0);
            f80566b = version;
            Version version2 = new Version("NewPrice1Discount2", 1);
            f80567c = version2;
            Version version3 = new Version("NewPrice2Discount1", 2);
            f80568d = version3;
            Version version4 = new Version("NewPrice2Discount2", 3);
            f80569e = version4;
            Version[] versionArr = {version, version2, version3, version4};
            f80570f = versionArr;
            f80571g = kotlin.enums.c.a(versionArr);
        }

        public Version() {
            throw null;
        }

        public static Version valueOf(String str) {
            return (Version) Enum.valueOf(Version.class, str);
        }

        public static Version[] values() {
            return (Version[]) f80570f.clone();
        }
    }

    /* compiled from: AdvertDetailsTravelPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsTravelPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPriceItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsTravelPriceItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Version.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPriceItem[] newArray(int i12) {
            return new AdvertDetailsTravelPriceItem[i12];
        }
    }

    public AdvertDetailsTravelPriceItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k Version version) {
        this.f80556b = j12;
        this.f80557c = str;
        this.f80558d = i12;
        this.f80559e = serpDisplayType;
        this.f80560f = serpViewType;
        this.f80561g = str2;
        this.f80562h = str3;
        this.f80563i = str4;
        this.f80564j = str5;
        this.f80565k = version;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsTravelPriceItem(this.f80556b, this.f80557c, i12, this.f80559e, this.f80560f, this.f80561g, this.f80562h, this.f80563i, this.f80564j, this.f80565k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f80559e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsTravelPriceItem)) {
            return false;
        }
        AdvertDetailsTravelPriceItem advertDetailsTravelPriceItem = (AdvertDetailsTravelPriceItem) obj;
        return this.f80556b == advertDetailsTravelPriceItem.f80556b && L.f(this.f80557c, advertDetailsTravelPriceItem.f80557c) && this.f80558d == advertDetailsTravelPriceItem.f80558d && this.f80559e == advertDetailsTravelPriceItem.f80559e && this.f80560f == advertDetailsTravelPriceItem.f80560f && L.f(this.f80561g, advertDetailsTravelPriceItem.f80561g) && L.f(this.f80562h, advertDetailsTravelPriceItem.f80562h) && L.f(this.f80563i, advertDetailsTravelPriceItem.f80563i) && L.f(this.f80564j, advertDetailsTravelPriceItem.f80564j) && this.f80565k == advertDetailsTravelPriceItem.f80565k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77564b() {
        return this.f80556b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75243e() {
        return this.f80558d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75240b() {
        return this.f80557c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75242d() {
        return this.f80560f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f80560f, com.avito.android.actions_sheet.a.h(this.f80559e, r.e(this.f80558d, H.d(Long.hashCode(this.f80556b) * 31, 31, this.f80557c), 31), 31), 31);
        String str = this.f80561g;
        int iHashCode = (iJ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80562h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80563i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f80564j;
        return this.f80565k.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsTravelPriceItem(id=" + this.f80556b + ", stringId=" + this.f80557c + ", spanCount=" + this.f80558d + ", displayType=" + this.f80559e + ", viewType=" + this.f80560f + ", price=" + this.f80561g + ", oldPrice=" + this.f80562h + ", discount=" + this.f80563i + ", subTitle=" + this.f80564j + ", version=" + this.f80565k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f80556b);
        parcel.writeString(this.f80557c);
        parcel.writeInt(this.f80558d);
        parcel.writeString(this.f80559e.name());
        parcel.writeString(this.f80560f.name());
        parcel.writeString(this.f80561g);
        parcel.writeString(this.f80562h);
        parcel.writeString(this.f80563i);
        parcel.writeString(this.f80564j);
        parcel.writeString(this.f80565k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsTravelPriceItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, String str2, String str3, String str4, String str5, Version version, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 211;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, str2, str3, str4, str5, version);
    }
}
