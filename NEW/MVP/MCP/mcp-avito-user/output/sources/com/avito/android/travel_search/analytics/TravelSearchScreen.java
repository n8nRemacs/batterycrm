package com.avito.android.travel_search.analytics;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: TravelSearchScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_search/analytics/TravelSearchScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes4.dex */
public final class TravelSearchScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final TravelSearchScreen f302767d = new TravelSearchScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f302768e = "content";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f302769f = "filters";

    @k
    public static final Parcelable.Creator<TravelSearchScreen> CREATOR = new a();

    /* compiled from: TravelSearchScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelSearchScreen> {
        @Override // android.os.Parcelable.Creator
        public final TravelSearchScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return TravelSearchScreen.f302767d;
        }

        @Override // android.os.Parcelable.Creator
        public final TravelSearchScreen[] newArray(int i12) {
            return new TravelSearchScreen[i12];
        }
    }

    public TravelSearchScreen() {
        super("TravelSearchScreen", false, 2, null);
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
