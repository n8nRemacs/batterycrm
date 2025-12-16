package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ConstructorTabStatisticsScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/ConstructorTabStatisticsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes5.dex */
public final class ConstructorTabStatisticsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ConstructorTabStatisticsScreen f317889d = new ConstructorTabStatisticsScreen();

    @Y61.k
    public static final Parcelable.Creator<ConstructorTabStatisticsScreen> CREATOR = new a();

    /* compiled from: ConstructorTabStatisticsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConstructorTabStatisticsScreen> {
        @Override // android.os.Parcelable.Creator
        public final ConstructorTabStatisticsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ConstructorTabStatisticsScreen.f317889d;
        }

        @Override // android.os.Parcelable.Creator
        public final ConstructorTabStatisticsScreen[] newArray(int i12) {
            return new ConstructorTabStatisticsScreen[i12];
        }
    }

    public ConstructorTabStatisticsScreen() {
        super("ConstructorTabStatisticsScreen", false, 2, null);
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
