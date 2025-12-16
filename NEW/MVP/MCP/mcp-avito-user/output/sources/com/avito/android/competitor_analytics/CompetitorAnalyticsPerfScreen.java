package com.avito.android.competitor_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/CompetitorAnalyticsPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes12.dex */
public final class CompetitorAnalyticsPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final CompetitorAnalyticsPerfScreen f124244d = new CompetitorAnalyticsPerfScreen();

    @Y61.k
    public static final Parcelable.Creator<CompetitorAnalyticsPerfScreen> CREATOR = new a();

    /* compiled from: CompetitorAnalyticsPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompetitorAnalyticsPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final CompetitorAnalyticsPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CompetitorAnalyticsPerfScreen.f124244d;
        }

        @Override // android.os.Parcelable.Creator
        public final CompetitorAnalyticsPerfScreen[] newArray(int i12) {
            return new CompetitorAnalyticsPerfScreen[i12];
        }
    }

    public CompetitorAnalyticsPerfScreen() {
        super("CompetitorAnalytics", false, 2, null);
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
