package com.avito.android.passport.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: PassportPerfConstants.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/perf_const/PassportCheckMergeScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes15.dex */
public final class PassportCheckMergeScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final PassportCheckMergeScreen f211157d = new PassportCheckMergeScreen();

    @k
    public static final Parcelable.Creator<PassportCheckMergeScreen> CREATOR = new a();

    /* compiled from: PassportPerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportCheckMergeScreen> {
        @Override // android.os.Parcelable.Creator
        public final PassportCheckMergeScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PassportCheckMergeScreen.f211157d;
        }

        @Override // android.os.Parcelable.Creator
        public final PassportCheckMergeScreen[] newArray(int i12) {
            return new PassportCheckMergeScreen[i12];
        }
    }

    public PassportCheckMergeScreen() {
        super("CheckMergePossibility", false);
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
