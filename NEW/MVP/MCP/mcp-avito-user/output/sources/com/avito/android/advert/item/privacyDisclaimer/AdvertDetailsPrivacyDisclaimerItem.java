package com.avito.android.advert.item.privacyDisclaimer;

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

/* compiled from: AdvertDetailsPrivacyDisclaimerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/privacyDisclaimer/AdvertDetailsPrivacyDisclaimerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsPrivacyDisclaimerItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsPrivacyDisclaimerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78240b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78241c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f78242d;

    /* renamed from: e, reason: collision with root package name */
    public final int f78243e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f78244f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f78245g;

    /* compiled from: AdvertDetailsPrivacyDisclaimerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsPrivacyDisclaimerItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPrivacyDisclaimerItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsPrivacyDisclaimerItem(parcel.readInt(), parcel.readLong(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsPrivacyDisclaimerItem[] newArray(int i12) {
            return new AdvertDetailsPrivacyDisclaimerItem[i12];
        }
    }

    public AdvertDetailsPrivacyDisclaimerItem(int i12, long j12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k String str, @k String str2) {
        this.f78240b = j12;
        this.f78241c = str;
        this.f78242d = str2;
        this.f78243e = i12;
        this.f78244f = serpDisplayType;
        this.f78245g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f78244f;
        return new AdvertDetailsPrivacyDisclaimerItem(i12, this.f78240b, serpDisplayType, this.f78245g, this.f78241c, this.f78242d);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f78244f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsPrivacyDisclaimerItem)) {
            return false;
        }
        AdvertDetailsPrivacyDisclaimerItem advertDetailsPrivacyDisclaimerItem = (AdvertDetailsPrivacyDisclaimerItem) obj;
        return this.f78240b == advertDetailsPrivacyDisclaimerItem.f78240b && L.f(this.f78241c, advertDetailsPrivacyDisclaimerItem.f78241c) && L.f(this.f78242d, advertDetailsPrivacyDisclaimerItem.f78242d) && this.f78243e == advertDetailsPrivacyDisclaimerItem.f78243e && this.f78244f == advertDetailsPrivacyDisclaimerItem.f78244f && this.f78245g == advertDetailsPrivacyDisclaimerItem.f78245g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF77336b() {
        return this.f78240b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77340f() {
        return this.f78243e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77337c() {
        return this.f78241c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77339e() {
        return this.f78245g;
    }

    public final int hashCode() {
        return this.f78245g.hashCode() + com.avito.android.actions_sheet.a.h(this.f78244f, r.e(this.f78243e, H.d(H.d(Long.hashCode(this.f78240b) * 31, 31, this.f78241c), 31, this.f78242d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsPrivacyDisclaimerItem(id=");
        sb2.append(this.f78240b);
        sb2.append(", stringId=");
        sb2.append(this.f78241c);
        sb2.append(", text=");
        sb2.append(this.f78242d);
        sb2.append(", spanCount=");
        sb2.append(this.f78243e);
        sb2.append(", displayType=");
        sb2.append(this.f78244f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f78245g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f78240b);
        parcel.writeString(this.f78241c);
        parcel.writeString(this.f78242d);
        parcel.writeInt(this.f78243e);
        parcel.writeString(this.f78244f.name());
        parcel.writeString(this.f78245g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsPrivacyDisclaimerItem(long j12, String str, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 6;
        } else {
            j13 = j12;
        }
        this(i12, j13, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 2) != 0 ? String.valueOf(j13) : str, str2);
    }
}
