package com.avito.android.recommendation_items_loader_impl.screen.di;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: RecommendationLoaderActivityPerfomanceTrackerModule.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recommendation_items_loader_impl/screen/di/RecommendationItemsLoaderScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_recommendation-items-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes16.dex */
public final class RecommendationItemsLoaderScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final RecommendationItemsLoaderScreen f252307d = new RecommendationItemsLoaderScreen();

    @k
    public static final Parcelable.Creator<RecommendationItemsLoaderScreen> CREATOR = new a();

    /* compiled from: RecommendationLoaderActivityPerfomanceTrackerModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationItemsLoaderScreen> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationItemsLoaderScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return RecommendationItemsLoaderScreen.f252307d;
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationItemsLoaderScreen[] newArray(int i12) {
            return new RecommendationItemsLoaderScreen[i12];
        }
    }

    public RecommendationItemsLoaderScreen() {
        super("RecommendationItemsLoader", false, 2, null);
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
