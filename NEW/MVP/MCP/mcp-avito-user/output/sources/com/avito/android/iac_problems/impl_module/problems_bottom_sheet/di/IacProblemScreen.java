package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: IacProblemBottomSheetPerformanceTrackerModule.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/di/IacProblemScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes14.dex */
public final class IacProblemScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final IacProblemScreen f168874d = new IacProblemScreen();

    @k
    public static final Parcelable.Creator<IacProblemScreen> CREATOR = new a();

    /* compiled from: IacProblemBottomSheetPerformanceTrackerModule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacProblemScreen> {
        @Override // android.os.Parcelable.Creator
        public final IacProblemScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IacProblemScreen.f168874d;
        }

        @Override // android.os.Parcelable.Creator
        public final IacProblemScreen[] newArray(int i12) {
            return new IacProblemScreen[i12];
        }
    }

    public IacProblemScreen() {
        super("IacProblemDialog", false, 2, null);
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
