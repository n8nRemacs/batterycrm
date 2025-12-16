package com.avito.android.autoteka.presentation.report;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: AutotekaReportScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/AutotekaReportScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class AutotekaReportScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AutotekaReportScreen f97692d = new AutotekaReportScreen();

    @k
    public static final Parcelable.Creator<AutotekaReportScreen> CREATOR = new a();

    /* compiled from: AutotekaReportScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaReportScreen> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaReportScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AutotekaReportScreen.f97692d;
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaReportScreen[] newArray(int i12) {
            return new AutotekaReportScreen[i12];
        }
    }

    public AutotekaReportScreen() {
        super("AutotekaReport", false, 2, null);
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
