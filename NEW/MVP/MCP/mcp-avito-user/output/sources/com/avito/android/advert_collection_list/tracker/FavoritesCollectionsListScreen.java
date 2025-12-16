package com.avito.android.advert_collection_list.tracker;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: FavoritesCollectionsListScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_list/tracker/FavoritesCollectionsListScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes10.dex */
public final class FavoritesCollectionsListScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final FavoritesCollectionsListScreen f82314d = new FavoritesCollectionsListScreen();

    @k
    public static final Parcelable.Creator<FavoritesCollectionsListScreen> CREATOR = new a();

    /* compiled from: FavoritesCollectionsListScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoritesCollectionsListScreen> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesCollectionsListScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return FavoritesCollectionsListScreen.f82314d;
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesCollectionsListScreen[] newArray(int i12) {
            return new FavoritesCollectionsListScreen[i12];
        }
    }

    public FavoritesCollectionsListScreen() {
        super("FavoritesCollectionsList", false, 2, null);
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
