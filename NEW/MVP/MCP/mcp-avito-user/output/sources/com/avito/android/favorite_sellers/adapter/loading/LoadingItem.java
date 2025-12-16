package com.avito.android.favorite_sellers.adapter.loading;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoadingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/loading/LoadingItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LoadingItem implements FavoriteSellersItem {

    @k
    public static final Parcelable.Creator<LoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f155575b;

    /* compiled from: LoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final LoadingItem createFromParcel(Parcel parcel) {
            return new LoadingItem((Uri) parcel.readParcelable(LoadingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LoadingItem[] newArray(int i12) {
            return new LoadingItem[i12];
        }
    }

    public LoadingItem(@k Uri uri) {
        this.f155575b = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LoadingItem) && L.f(this.f155575b, ((LoadingItem) obj).f155575b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF155565b() {
        return "loading_item";
    }

    public final int hashCode() {
        return this.f155575b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("LoadingItem(nextPage="), this.f155575b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f155575b, i12);
    }
}
