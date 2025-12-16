package com.avito.android.certificate_pinning.perf_cost;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: UnsafeNetworkScreen.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/perf_cost/UnsafeNetworkScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes12.dex */
public final class UnsafeNetworkScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final UnsafeNetworkScreen f117854d = new UnsafeNetworkScreen();

    @k
    public static final Parcelable.Creator<UnsafeNetworkScreen> CREATOR = new a();

    /* compiled from: UnsafeNetworkScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UnsafeNetworkScreen> {
        @Override // android.os.Parcelable.Creator
        public final UnsafeNetworkScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return UnsafeNetworkScreen.f117854d;
        }

        @Override // android.os.Parcelable.Creator
        public final UnsafeNetworkScreen[] newArray(int i12) {
            return new UnsafeNetworkScreen[i12];
        }
    }

    public UnsafeNetworkScreen() {
        super("UnsafeNetworkScreen", false, 2, null);
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
