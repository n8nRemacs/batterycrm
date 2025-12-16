package com.avito.android.early_access.adapter.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/banner/EarlyAccessBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145080b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f145081c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f145082d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final BannerType f145083e;

    /* compiled from: EarlyAccessBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBannerItem createFromParcel(Parcel parcel) {
            return new EarlyAccessBannerItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(EarlyAccessBannerItem.class.getClassLoader()), BannerType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessBannerItem[] newArray(int i12) {
            return new EarlyAccessBannerItem[i12];
        }
    }

    public EarlyAccessBannerItem(@k String str, @k String str2, @k Image image, @k BannerType bannerType) {
        this.f145080b = str;
        this.f145081c = str2;
        this.f145082d = image;
        this.f145083e = bannerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessBannerItem)) {
            return false;
        }
        EarlyAccessBannerItem earlyAccessBannerItem = (EarlyAccessBannerItem) obj;
        return L.f(this.f145080b, earlyAccessBannerItem.f145080b) && L.f(this.f145081c, earlyAccessBannerItem.f145081c) && L.f(this.f145082d, earlyAccessBannerItem.f145082d) && this.f145083e == earlyAccessBannerItem.f145083e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF73058b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF95179b() {
        return this.f145080b;
    }

    public final int hashCode() {
        return this.f145083e.hashCode() + com.avito.android.actions_sheet.a.g(this.f145082d, H.d(this.f145080b.hashCode() * 31, 31, this.f145081c), 31);
    }

    @k
    public final String toString() {
        return "EarlyAccessBannerItem(stringId=" + this.f145080b + ", text=" + this.f145081c + ", icon=" + this.f145082d + ", bannerType=" + this.f145083e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145080b);
        parcel.writeString(this.f145081c);
        parcel.writeParcelable(this.f145082d, i12);
        parcel.writeString(this.f145083e.name());
    }

    public /* synthetic */ EarlyAccessBannerItem(String str, String str2, Image image, BannerType bannerType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessBannerItem.class.getName() : str, str2, image, (i12 & 8) != 0 ? BannerType.f145076b : bannerType);
    }
}
