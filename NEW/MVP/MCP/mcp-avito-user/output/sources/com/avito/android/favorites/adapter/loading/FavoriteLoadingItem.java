package com.avito.android.favorites.adapter.loading;

import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: FavoriteLoadingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/loading/FavoriteLoadingItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteLoadingItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<FavoriteLoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f156639b;

    /* compiled from: FavoriteLoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoriteLoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteLoadingItem createFromParcel(Parcel parcel) {
            return new FavoriteLoadingItem((Uri) parcel.readParcelable(FavoriteLoadingItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteLoadingItem[] newArray(int i12) {
            return new FavoriteLoadingItem[i12];
        }
    }

    public FavoriteLoadingItem(@k Uri uri) {
        this.f156639b = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF162212c() {
        return "favorite_loading_item";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f156639b, i12);
    }
}
