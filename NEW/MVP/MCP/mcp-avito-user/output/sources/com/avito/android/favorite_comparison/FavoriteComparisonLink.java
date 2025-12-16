package com.avito.android.favorite_comparison;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FavoriteComparisonLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/FavoriteComparisonLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class FavoriteComparisonLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<FavoriteComparisonLink> CREATOR = new a();

    /* compiled from: FavoriteComparisonLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoriteComparisonLink> {
        @Override // android.os.Parcelable.Creator
        public final FavoriteComparisonLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new FavoriteComparisonLink();
        }

        @Override // android.os.Parcelable.Creator
        public final FavoriteComparisonLink[] newArray(int i12) {
            return new FavoriteComparisonLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
