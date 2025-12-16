package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SellerItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/SellerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<SellerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273162c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f273163d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f273164e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f273165f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f273166g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Analytics f273167h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final DeepLink f273168i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SellersCarouselWidget.Template f273169j;

    /* compiled from: SellerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerItem createFromParcel(Parcel parcel) {
            return new SellerItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(SellerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Analytics) parcel.readParcelable(SellerItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SellerItem.class.getClassLoader()), SellersCarouselWidget.Template.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SellerItem[] newArray(int i12) {
            return new SellerItem[i12];
        }
    }

    public SellerItem(@k String str, @k String str2, @l Image image, @k String str3, @l String str4, @l String str5, @l Analytics analytics, @k DeepLink deepLink, @k SellersCarouselWidget.Template template) {
        this.f273161b = str;
        this.f273162c = str2;
        this.f273163d = image;
        this.f273164e = str3;
        this.f273165f = str4;
        this.f273166g = str5;
        this.f273167h = analytics;
        this.f273168i = deepLink;
        this.f273169j = template;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270098b() {
        return this.f273161b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273161b);
        parcel.writeString(this.f273162c);
        parcel.writeParcelable(this.f273163d, i12);
        parcel.writeString(this.f273164e);
        parcel.writeString(this.f273165f);
        parcel.writeString(this.f273166g);
        parcel.writeParcelable(this.f273167h, i12);
        parcel.writeParcelable(this.f273168i, i12);
        parcel.writeString(this.f273169j.name());
    }
}
