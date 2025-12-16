package com.avito.android.rating;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: RatingScreens.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/RatingSummaryScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes16.dex */
public final class RatingSummaryScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final RatingSummaryScreen f246404d = new RatingSummaryScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f246405e = "ratingSummary";

    @Y61.k
    public static final Parcelable.Creator<RatingSummaryScreen> CREATOR = new a();

    /* compiled from: RatingScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingSummaryScreen> {
        @Override // android.os.Parcelable.Creator
        public final RatingSummaryScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return RatingSummaryScreen.f246404d;
        }

        @Override // android.os.Parcelable.Creator
        public final RatingSummaryScreen[] newArray(int i12) {
            return new RatingSummaryScreen[i12];
        }
    }

    public RatingSummaryScreen() {
        super("RatingSummary", false, 2, null);
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
