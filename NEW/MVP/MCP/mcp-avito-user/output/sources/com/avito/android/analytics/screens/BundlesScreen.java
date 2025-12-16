package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: MnzStatsScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/BundlesScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class BundlesScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final BundlesScreen f90303d = new BundlesScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f90304e = "bundles";

    @Y61.k
    public static final Parcelable.Creator<BundlesScreen> CREATOR = new a();

    /* compiled from: MnzStatsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BundlesScreen> {
        @Override // android.os.Parcelable.Creator
        public final BundlesScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BundlesScreen.f90303d;
        }

        @Override // android.os.Parcelable.Creator
        public final BundlesScreen[] newArray(int i12) {
            return new BundlesScreen[i12];
        }
    }

    public BundlesScreen() {
        super("MonetizationBundles", false, 2, null);
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
