package com.avito.android.favorite_sellers.adapter.advert_list.adapter.other_adverts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: OtherAdvertsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/adapter/other_adverts/OtherAdvertsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherAdvertsItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<OtherAdvertsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155500b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155501c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f155502d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f155503e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f155504f = SerpViewType.f268585e;

    /* renamed from: g, reason: collision with root package name */
    public final int f155505g = 1;

    /* compiled from: OtherAdvertsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OtherAdvertsItem> {
        @Override // android.os.Parcelable.Creator
        public final OtherAdvertsItem createFromParcel(Parcel parcel) {
            return new OtherAdvertsItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(OtherAdvertsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OtherAdvertsItem[] newArray(int i12) {
            return new OtherAdvertsItem[i12];
        }
    }

    public OtherAdvertsItem(@k String str, @k String str2, @k String str3, @l DeepLink deepLink) {
        this.f155500b = str;
        this.f155501c = str2;
        this.f155502d = str3;
        this.f155503e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF270317l() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF155505g() {
        return this.f155505g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155500b() {
        return this.f155500b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF155504f() {
        return this.f155504f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155500b);
        parcel.writeString(this.f155501c);
        parcel.writeString(this.f155502d);
        parcel.writeParcelable(this.f155503e, i12);
    }
}
