package com.avito.android.screens.bbip_private_v2.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: BbipPrivateV2PerformanceScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/di/BbipPrivateV2PerformanceScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes3.dex */
public final class BbipPrivateV2PerformanceScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final BbipPrivateV2PerformanceScreen f260886d = new BbipPrivateV2PerformanceScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f260887e = "bbipPrivateV2Configurator";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f260888f = "bbipPrivateV2Forecast";

    @k
    public static final Parcelable.Creator<BbipPrivateV2PerformanceScreen> CREATOR = new a();

    /* compiled from: BbipPrivateV2PerformanceScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BbipPrivateV2PerformanceScreen> {
        @Override // android.os.Parcelable.Creator
        public final BbipPrivateV2PerformanceScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BbipPrivateV2PerformanceScreen.f260886d;
        }

        @Override // android.os.Parcelable.Creator
        public final BbipPrivateV2PerformanceScreen[] newArray(int i12) {
            return new BbipPrivateV2PerformanceScreen[i12];
        }
    }

    public BbipPrivateV2PerformanceScreen() {
        super("BbipPrivateV2", false, 2, null);
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
