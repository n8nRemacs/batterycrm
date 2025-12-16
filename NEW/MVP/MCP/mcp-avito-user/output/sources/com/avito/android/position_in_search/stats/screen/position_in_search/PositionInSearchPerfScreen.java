package com.avito.android.position_in_search.stats.screen.position_in_search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: PositionInSearchPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/PositionInSearchPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes15.dex */
public final class PositionInSearchPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final PositionInSearchPerfScreen f221325d = new PositionInSearchPerfScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f221326e = "position-in-search-main";

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final String f221327f = "position-in-search-period";

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f221328g = "position-in-search-period-next-page";

    @Y61.k
    public static final Parcelable.Creator<PositionInSearchPerfScreen> CREATOR = new a();

    /* compiled from: PositionInSearchPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PositionInSearchPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final PositionInSearchPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PositionInSearchPerfScreen.f221325d;
        }

        @Override // android.os.Parcelable.Creator
        public final PositionInSearchPerfScreen[] newArray(int i12) {
            return new PositionInSearchPerfScreen[i12];
        }
    }

    public PositionInSearchPerfScreen() {
        super("PositionInSearch", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
