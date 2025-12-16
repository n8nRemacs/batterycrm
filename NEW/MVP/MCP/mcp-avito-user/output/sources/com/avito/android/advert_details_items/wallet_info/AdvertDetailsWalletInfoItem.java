package com.avito.android.advert_details_items.wallet_info;

import K51.d;
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
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsWalletInfoItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/wallet_info/AdvertDetailsWalletInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsWalletInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsWalletInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f85761b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f85762c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f85763d;

    /* renamed from: e, reason: collision with root package name */
    public final long f85764e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f85765f;

    /* renamed from: g, reason: collision with root package name */
    public final int f85766g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f85767h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f85768i;

    /* compiled from: AdvertDetailsWalletInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsWalletInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsWalletInfoItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsWalletInfoItem(parcel.readString(), (AttributedText) parcel.readParcelable(AdvertDetailsWalletInfoItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(AdvertDetailsWalletInfoItem.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsWalletInfoItem[] newArray(int i12) {
            return new AdvertDetailsWalletInfoItem[i12];
        }
    }

    public AdvertDetailsWalletInfoItem(@l String str, @l AttributedText attributedText, @l UniversalImage universalImage, long j12, @k String str2, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f85761b = str;
        this.f85762c = attributedText;
        this.f85763d = universalImage;
        this.f85764e = j12;
        this.f85765f = str2;
        this.f85766g = i12;
        this.f85767h = serpDisplayType;
        this.f85768i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        SerpDisplayType serpDisplayType = this.f85767h;
        return new AdvertDetailsWalletInfoItem(this.f85761b, this.f85762c, this.f85763d, this.f85764e, this.f85765f, i12, serpDisplayType, this.f85768i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f85767h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsWalletInfoItem)) {
            return false;
        }
        AdvertDetailsWalletInfoItem advertDetailsWalletInfoItem = (AdvertDetailsWalletInfoItem) obj;
        return L.f(this.f85761b, advertDetailsWalletInfoItem.f85761b) && L.f(this.f85762c, advertDetailsWalletInfoItem.f85762c) && L.f(this.f85763d, advertDetailsWalletInfoItem.f85763d) && this.f85764e == advertDetailsWalletInfoItem.f85764e && L.f(this.f85765f, advertDetailsWalletInfoItem.f85765f) && this.f85766g == advertDetailsWalletInfoItem.f85766g && this.f85767h == advertDetailsWalletInfoItem.f85767h && this.f85768i == advertDetailsWalletInfoItem.f85768i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85764e() {
        return this.f85764e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85766g() {
        return this.f85766g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85765f() {
        return this.f85765f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85768i() {
        return this.f85768i;
    }

    public final int hashCode() {
        String str = this.f85761b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f85762c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f85763d;
        return this.f85768i.hashCode() + com.avito.android.actions_sheet.a.h(this.f85767h, r.e(this.f85766g, H.d(r.g((iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0)) * 31, 31, this.f85764e), 31, this.f85765f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsWalletInfoItem(deeplink=");
        sb2.append(this.f85761b);
        sb2.append(", title=");
        sb2.append(this.f85762c);
        sb2.append(", icon=");
        sb2.append(this.f85763d);
        sb2.append(", id=");
        sb2.append(this.f85764e);
        sb2.append(", stringId=");
        sb2.append(this.f85765f);
        sb2.append(", spanCount=");
        sb2.append(this.f85766g);
        sb2.append(", displayType=");
        sb2.append(this.f85767h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f85768i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85761b);
        parcel.writeParcelable(this.f85762c, i12);
        parcel.writeParcelable(this.f85763d, i12);
        parcel.writeLong(this.f85764e);
        parcel.writeString(this.f85765f);
        parcel.writeInt(this.f85766g);
        parcel.writeString(this.f85767h.name());
        parcel.writeString(this.f85768i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsWalletInfoItem(String str, AttributedText attributedText, UniversalImage universalImage, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 8) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 180;
        } else {
            j13 = j12;
        }
        this(str, attributedText, universalImage, j13, (i13 & 16) != 0 ? String.valueOf(j13) : str2, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
