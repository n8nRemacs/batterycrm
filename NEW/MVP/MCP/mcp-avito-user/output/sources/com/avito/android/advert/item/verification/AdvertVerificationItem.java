package com.avito.android.advert.item.verification;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertVerificationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/verification/AdvertVerificationItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertVerificationItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertVerificationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f80655c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f80656d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f80657e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BadgeItem f80658f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80659g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f80660h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f80661i;

    /* compiled from: AdvertVerificationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertVerificationItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertVerificationItem createFromParcel(Parcel parcel) {
            return new AdvertVerificationItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (BadgeItem) parcel.readParcelable(AdvertVerificationItem.class.getClassLoader()), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertVerificationItem[] newArray(int i12) {
            return new AdvertVerificationItem[i12];
        }
    }

    public AdvertVerificationItem(long j12, @k String str, @k String str2, @k String str3, @k BadgeItem badgeItem, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80654b = j12;
        this.f80655c = str;
        this.f80656d = str2;
        this.f80657e = str3;
        this.f80658f = badgeItem;
        this.f80659g = i12;
        this.f80660h = serpDisplayType;
        this.f80661i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f80660h;
        return new AdvertVerificationItem(this.f80654b, this.f80655c, this.f80656d, this.f80657e, this.f80658f, i12, serpDisplayType, this.f80661i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80660h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertVerificationItem)) {
            return false;
        }
        AdvertVerificationItem advertVerificationItem = (AdvertVerificationItem) obj;
        return this.f80654b == advertVerificationItem.f80654b && L.f(this.f80655c, advertVerificationItem.f80655c) && L.f(this.f80656d, advertVerificationItem.f80656d) && L.f(this.f80657e, advertVerificationItem.f80657e) && L.f(this.f80658f, advertVerificationItem.f80658f) && this.f80659g == advertVerificationItem.f80659g && this.f80660h == advertVerificationItem.f80660h && this.f80661i == advertVerificationItem.f80661i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85532b() {
        return this.f80654b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85534d() {
        return this.f80659g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154734b() {
        return this.f80655c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85540j() {
        return this.f80661i;
    }

    public final int hashCode() {
        return this.f80661i.hashCode() + com.avito.android.actions_sheet.a.h(this.f80660h, r.e(this.f80659g, (this.f80658f.hashCode() + H.d(H.d(H.d(Long.hashCode(this.f80654b) * 31, 31, this.f80655c), 31, this.f80656d), 31, this.f80657e)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertVerificationItem(id=");
        sb2.append(this.f80654b);
        sb2.append(", stringId=");
        sb2.append(this.f80655c);
        sb2.append(", descriptionTitle=");
        sb2.append(this.f80656d);
        sb2.append(", description=");
        sb2.append(this.f80657e);
        sb2.append(", badgeItem=");
        sb2.append(this.f80658f);
        sb2.append(", spanCount=");
        sb2.append(this.f80659g);
        sb2.append(", displayType=");
        sb2.append(this.f80660h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80661i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f80654b);
        parcel.writeString(this.f80655c);
        parcel.writeString(this.f80656d);
        parcel.writeString(this.f80657e);
        parcel.writeParcelable(this.f80658f, i12);
        parcel.writeInt(this.f80659g);
        parcel.writeString(this.f80660h.name());
        parcel.writeString(this.f80661i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertVerificationItem(long j12, String str, String str2, String str3, BadgeItem badgeItem, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 74;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2, str3, badgeItem, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
