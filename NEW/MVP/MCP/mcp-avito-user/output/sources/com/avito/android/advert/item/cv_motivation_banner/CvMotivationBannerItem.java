package com.avito.android.advert.item.cv_motivation_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.cv.CvMotivationBanner;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvMotivationBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/cv_motivation_banner/CvMotivationBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CvMotivationBannerItem implements BlockItem {

    @k
    public static final Parcelable.Creator<CvMotivationBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f75008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75009c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CvMotivationBanner f75010d;

    /* compiled from: CvMotivationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvMotivationBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final CvMotivationBannerItem createFromParcel(Parcel parcel) {
            return new CvMotivationBannerItem(parcel.readInt(), parcel.readString(), (CvMotivationBanner) parcel.readParcelable(CvMotivationBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvMotivationBannerItem[] newArray(int i12) {
            return new CvMotivationBannerItem[i12];
        }
    }

    public CvMotivationBannerItem(int i12, @k String str, @k CvMotivationBanner cvMotivationBanner) {
        this.f75008b = i12;
        this.f75009c = str;
        this.f75010d = cvMotivationBanner;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new CvMotivationBannerItem(i12, this.f75009c, this.f75010d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvMotivationBannerItem)) {
            return false;
        }
        CvMotivationBannerItem cvMotivationBannerItem = (CvMotivationBannerItem) obj;
        return this.f75008b == cvMotivationBannerItem.f75008b && L.f(this.f75009c, cvMotivationBannerItem.f75009c) && L.f(this.f75010d, cvMotivationBannerItem.f75010d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74201e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74098e() {
        return this.f75008b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74441b() {
        return this.f75009c;
    }

    public final int hashCode() {
        return this.f75010d.hashCode() + H.d(Integer.hashCode(this.f75008b) * 31, 31, this.f75009c);
    }

    @k
    public final String toString() {
        return "CvMotivationBannerItem(spanCount=" + this.f75008b + ", stringId=" + this.f75009c + ", cvMotivationBanner=" + this.f75010d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f75008b);
        parcel.writeString(this.f75009c);
        parcel.writeParcelable(this.f75010d, i12);
    }

    public /* synthetic */ CvMotivationBannerItem(int i12, String str, CvMotivationBanner cvMotivationBanner, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? "AdvertCvMotivationBannerItem" : str, cvMotivationBanner);
    }
}
