package com.avito.android.favorites.adapter.advert.skeleton;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SkeletonFavoriteAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/skeleton/SkeletonFavoriteAdvertItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SkeletonFavoriteAdvertItem implements FavoriteListItem {

    @k
    public static final Parcelable.Creator<SkeletonFavoriteAdvertItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f156504b;

    /* compiled from: SkeletonFavoriteAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SkeletonFavoriteAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final SkeletonFavoriteAdvertItem createFromParcel(Parcel parcel) {
            return new SkeletonFavoriteAdvertItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SkeletonFavoriteAdvertItem[] newArray(int i12) {
            return new SkeletonFavoriteAdvertItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkeletonFavoriteAdvertItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkeletonFavoriteAdvertItem) && L.f(this.f156504b, ((SkeletonFavoriteAdvertItem) obj).f156504b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF156589b() {
        return this.f156504b;
    }

    public final int hashCode() {
        return this.f156504b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SkeletonFavoriteAdvertItem(stringId="), this.f156504b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f156504b);
    }

    public SkeletonFavoriteAdvertItem(@k String str) {
        this.f156504b = str;
    }

    public /* synthetic */ SkeletonFavoriteAdvertItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "skeleton_favorite_advert" : str);
    }
}
