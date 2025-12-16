package com.avito.android.advert.item.wallet_info;

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

/* compiled from: WalletInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/wallet_info/WalletInfoItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WalletInfoItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<WalletInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f80715b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f80716c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f80717d;

    /* renamed from: e, reason: collision with root package name */
    public final long f80718e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f80719f;

    /* renamed from: g, reason: collision with root package name */
    public final int f80720g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f80721h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f80722i;

    /* compiled from: WalletInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final WalletInfoItem createFromParcel(Parcel parcel) {
            return new WalletInfoItem(parcel.readString(), (AttributedText) parcel.readParcelable(WalletInfoItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(WalletInfoItem.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final WalletInfoItem[] newArray(int i12) {
            return new WalletInfoItem[i12];
        }
    }

    public WalletInfoItem(@l String str, @l AttributedText attributedText, @l UniversalImage universalImage, long j12, @k String str2, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f80715b = str;
        this.f80716c = attributedText;
        this.f80717d = universalImage;
        this.f80718e = j12;
        this.f80719f = str2;
        this.f80720g = i12;
        this.f80721h = serpDisplayType;
        this.f80722i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new WalletInfoItem(this.f80715b, this.f80716c, this.f80717d, this.f80718e, this.f80719f, i12, this.f80721h, this.f80722i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f80721h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletInfoItem)) {
            return false;
        }
        WalletInfoItem walletInfoItem = (WalletInfoItem) obj;
        return L.f(this.f80715b, walletInfoItem.f80715b) && L.f(this.f80716c, walletInfoItem.f80716c) && L.f(this.f80717d, walletInfoItem.f80717d) && this.f80718e == walletInfoItem.f80718e && L.f(this.f80719f, walletInfoItem.f80719f) && this.f80720g == walletInfoItem.f80720g && this.f80721h == walletInfoItem.f80721h && this.f80722i == walletInfoItem.f80722i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85764e() {
        return this.f80718e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85766g() {
        return this.f80720g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85765f() {
        return this.f80719f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85768i() {
        return this.f80722i;
    }

    public final int hashCode() {
        String str = this.f80715b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f80716c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.f80717d;
        return this.f80722i.hashCode() + com.avito.android.actions_sheet.a.h(this.f80721h, r.e(this.f80720g, H.d(r.g((iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0)) * 31, 31, this.f80718e), 31, this.f80719f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletInfoItem(deeplink=");
        sb2.append(this.f80715b);
        sb2.append(", title=");
        sb2.append(this.f80716c);
        sb2.append(", icon=");
        sb2.append(this.f80717d);
        sb2.append(", id=");
        sb2.append(this.f80718e);
        sb2.append(", stringId=");
        sb2.append(this.f80719f);
        sb2.append(", spanCount=");
        sb2.append(this.f80720g);
        sb2.append(", displayType=");
        sb2.append(this.f80721h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f80722i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f80715b);
        parcel.writeParcelable(this.f80716c, i12);
        parcel.writeParcelable(this.f80717d, i12);
        parcel.writeLong(this.f80718e);
        parcel.writeString(this.f80719f);
        parcel.writeInt(this.f80720g);
        parcel.writeString(this.f80721h.name());
        parcel.writeString(this.f80722i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WalletInfoItem(String str, AttributedText attributedText, UniversalImage universalImage, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
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
