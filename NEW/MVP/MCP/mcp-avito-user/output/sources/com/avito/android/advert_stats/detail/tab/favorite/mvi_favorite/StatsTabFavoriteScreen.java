package com.avito.android.advert_stats.detail.tab.favorite.mvi_favorite;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: StatsTabFavoriteScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/favorite/mvi_favorite/StatsTabFavoriteScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes10.dex */
public final class StatsTabFavoriteScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final StatsTabFavoriteScreen f86216d = new StatsTabFavoriteScreen();

    @k
    public static final Parcelable.Creator<StatsTabFavoriteScreen> CREATOR = new a();

    /* compiled from: StatsTabFavoriteScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StatsTabFavoriteScreen> {
        @Override // android.os.Parcelable.Creator
        public final StatsTabFavoriteScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return StatsTabFavoriteScreen.f86216d;
        }

        @Override // android.os.Parcelable.Creator
        public final StatsTabFavoriteScreen[] newArray(int i12) {
            return new StatsTabFavoriteScreen[i12];
        }
    }

    public StatsTabFavoriteScreen() {
        super("favorite-statistics-tab", false, 2, null);
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
