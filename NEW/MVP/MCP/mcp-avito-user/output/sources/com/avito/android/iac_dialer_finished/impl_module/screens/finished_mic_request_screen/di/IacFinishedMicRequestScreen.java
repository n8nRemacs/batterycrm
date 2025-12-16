package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: IacFinishedMicRequestScreenPerformanceTrackerModule.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/di/IacFinishedMicRequestScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes14.dex */
public final class IacFinishedMicRequestScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final IacFinishedMicRequestScreen f166726d = new IacFinishedMicRequestScreen();

    @k
    public static final Parcelable.Creator<IacFinishedMicRequestScreen> CREATOR = new a();

    /* compiled from: IacFinishedMicRequestScreenPerformanceTrackerModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedMicRequestScreen> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IacFinishedMicRequestScreen.f166726d;
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreen[] newArray(int i12) {
            return new IacFinishedMicRequestScreen[i12];
        }
    }

    public IacFinishedMicRequestScreen() {
        super("IacFinishedMicRequestScreen", false, 2, null);
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
