package com.avito.android.advert_collection_shared.tracker;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: FavoritesCollectionsCreateScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_shared/tracker/FavoritesCollectionsCreateScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_advert-collection-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes10.dex */
public final class FavoritesCollectionsCreateScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final FavoritesCollectionsCreateScreen f82318d = new FavoritesCollectionsCreateScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f82319e = "advertisements";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f82320f = "widgets";

    @k
    public static final Parcelable.Creator<FavoritesCollectionsCreateScreen> CREATOR = new a();

    /* compiled from: FavoritesCollectionsCreateScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoritesCollectionsCreateScreen> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesCollectionsCreateScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return FavoritesCollectionsCreateScreen.f82318d;
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesCollectionsCreateScreen[] newArray(int i12) {
            return new FavoritesCollectionsCreateScreen[i12];
        }
    }

    public FavoritesCollectionsCreateScreen() {
        super("FavoritesCollectionsCreate", false, 2, null);
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
