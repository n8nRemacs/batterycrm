package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ScreenPublicConsts.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/IntermediaryVerificationScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class IntermediaryVerificationScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final IntermediaryVerificationScreen f90381d = new IntermediaryVerificationScreen();

    @Y61.k
    public static final Parcelable.Creator<IntermediaryVerificationScreen> CREATOR = new a();

    /* compiled from: ScreenPublicConsts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IntermediaryVerificationScreen> {
        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IntermediaryVerificationScreen.f90381d;
        }

        @Override // android.os.Parcelable.Creator
        public final IntermediaryVerificationScreen[] newArray(int i12) {
            return new IntermediaryVerificationScreen[i12];
        }
    }

    public IntermediaryVerificationScreen() {
        super("IntermediaryVerification", false, 2, null);
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
