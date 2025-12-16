package com.avito.android.iac_problems.impl_module.miui_permission.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: IacMiuiPermissionBottomSheetPerformanceTracker.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/di/MainStartOnboardingMiuiProblemSheetScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes14.dex */
public final class MainStartOnboardingMiuiProblemSheetScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final MainStartOnboardingMiuiProblemSheetScreen f168795d = new MainStartOnboardingMiuiProblemSheetScreen();

    @k
    public static final Parcelable.Creator<MainStartOnboardingMiuiProblemSheetScreen> CREATOR = new a();

    /* compiled from: IacMiuiPermissionBottomSheetPerformanceTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MainStartOnboardingMiuiProblemSheetScreen> {
        @Override // android.os.Parcelable.Creator
        public final MainStartOnboardingMiuiProblemSheetScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return MainStartOnboardingMiuiProblemSheetScreen.f168795d;
        }

        @Override // android.os.Parcelable.Creator
        public final MainStartOnboardingMiuiProblemSheetScreen[] newArray(int i12) {
            return new MainStartOnboardingMiuiProblemSheetScreen[i12];
        }
    }

    public MainStartOnboardingMiuiProblemSheetScreen() {
        super("MainStartOnboardingMiuiProblemSheetScreen", false, 2, null);
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
