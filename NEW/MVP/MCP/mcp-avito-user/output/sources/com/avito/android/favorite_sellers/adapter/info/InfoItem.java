package com.avito.android.favorite_sellers.adapter.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: InfoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/info/InfoItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class InfoItem implements FavoriteSellersItem {

    @k
    public static final Parcelable.Creator<InfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155565b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155566c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f155567d;

    /* compiled from: InfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InfoItem> {
        @Override // android.os.Parcelable.Creator
        public final InfoItem createFromParcel(Parcel parcel) {
            return new InfoItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoItem[] newArray(int i12) {
            return new InfoItem[i12];
        }
    }

    public InfoItem(@k String str, @k String str2, @l String str3) {
        this.f155565b = str;
        this.f155566c = str2;
        this.f155567d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF155325b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154833b() {
        return this.f155565b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155565b);
        parcel.writeString(this.f155566c);
        parcel.writeString(this.f155567d);
    }
}
