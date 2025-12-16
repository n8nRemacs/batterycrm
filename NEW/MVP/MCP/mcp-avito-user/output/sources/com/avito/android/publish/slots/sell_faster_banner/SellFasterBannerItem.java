package com.avito.android.publish.slots.sell_faster_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellFasterBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sell_faster_banner/SellFasterBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SellFasterBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SellFasterBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244841b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f244842c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f244843d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f244844e;

    /* compiled from: SellFasterBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellFasterBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final SellFasterBannerItem createFromParcel(Parcel parcel) {
            return new SellFasterBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SellFasterBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SellFasterBannerItem[] newArray(int i12) {
            return new SellFasterBannerItem[i12];
        }
    }

    public SellFasterBannerItem(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f244841b = str;
        this.f244842c = str2;
        this.f244843d = str3;
        this.f244844e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellFasterBannerItem)) {
            return false;
        }
        SellFasterBannerItem sellFasterBannerItem = (SellFasterBannerItem) obj;
        return L.f(this.f244841b, sellFasterBannerItem.f244841b) && L.f(this.f244842c, sellFasterBannerItem.f244842c) && L.f(this.f244843d, sellFasterBannerItem.f244843d) && L.f(this.f244844e, sellFasterBannerItem.f244844e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171574b() {
        return this.f244841b;
    }

    public final int hashCode() {
        return this.f244844e.hashCode() + H.d(H.d(this.f244841b.hashCode() * 31, 31, this.f244842c), 31, this.f244843d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellFasterBannerItem(stringId=");
        sb2.append(this.f244841b);
        sb2.append(", title=");
        sb2.append(this.f244842c);
        sb2.append(", description=");
        sb2.append(this.f244843d);
        sb2.append(", detailsDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f244844e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f244841b);
        parcel.writeString(this.f244842c);
        parcel.writeString(this.f244843d);
        parcel.writeParcelable(this.f244844e, i12);
    }
}
