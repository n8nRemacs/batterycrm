package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.tracker;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: SearchPositionScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/tracker/SearchPositionScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes15.dex */
public final class SearchPositionScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final SearchPositionScreen f221262d = new SearchPositionScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f221263e = "search-position";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f221264f = "search-position-period";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f221265g = "search-position-period-select";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f221266h = "search-position-period-next-page";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f221267i = "search-position-period-sort";

    @k
    public static final Parcelable.Creator<SearchPositionScreen> CREATOR = new a();

    /* compiled from: SearchPositionScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchPositionScreen> {
        @Override // android.os.Parcelable.Creator
        public final SearchPositionScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return SearchPositionScreen.f221262d;
        }

        @Override // android.os.Parcelable.Creator
        public final SearchPositionScreen[] newArray(int i12) {
            return new SearchPositionScreen[i12];
        }
    }

    public SearchPositionScreen() {
        super("SearchPositionScreen", false, 2, null);
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
