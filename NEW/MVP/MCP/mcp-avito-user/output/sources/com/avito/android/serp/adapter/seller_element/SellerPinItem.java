package com.avito.android.serp.adapter.seller_element;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerElement;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;

/* compiled from: SellerPinItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/seller_element/SellerPinItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellerPinItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<SellerPinItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f271695b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f271696c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f271697d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SerpBadgeBar f271698e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f271699f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Image f271700g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final SellerElement.DeveloperInfo f271701h;

    /* renamed from: i, reason: collision with root package name */
    public final int f271702i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f271703j = SerpViewType.f268585e;

    /* compiled from: SellerPinItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerPinItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerPinItem createFromParcel(Parcel parcel) {
            return new SellerPinItem(parcel.readLong(), parcel.readString(), parcel.readString(), (SerpBadgeBar) parcel.readParcelable(SellerPinItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SellerPinItem.class.getClassLoader()), (Image) parcel.readParcelable(SellerPinItem.class.getClassLoader()), (SellerElement.DeveloperInfo) parcel.readParcelable(SellerPinItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerPinItem[] newArray(int i12) {
            return new SellerPinItem[i12];
        }
    }

    public SellerPinItem(long j12, @k String str, @k String str2, @l SerpBadgeBar serpBadgeBar, @l DeepLink deepLink, @l Image image, @l SellerElement.DeveloperInfo developerInfo, int i12) {
        this.f271695b = j12;
        this.f271696c = str;
        this.f271697d = str2;
        this.f271698e = serpBadgeBar;
        this.f271699f = deepLink;
        this.f271700g = image;
        this.f271701h = developerInfo;
        this.f271702i = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80596b() {
        return this.f271695b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f271702i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162835b() {
        return this.f271696c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84016b() {
        return this.f271703j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f271695b);
        parcel.writeString(this.f271696c);
        parcel.writeString(this.f271697d);
        parcel.writeParcelable(this.f271698e, i12);
        parcel.writeParcelable(this.f271699f, i12);
        parcel.writeParcelable(this.f271700g, i12);
        parcel.writeParcelable(this.f271701h, i12);
        parcel.writeInt(this.f271702i);
    }
}
