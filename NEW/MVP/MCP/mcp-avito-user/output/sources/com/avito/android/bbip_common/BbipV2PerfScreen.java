package com.avito.android.bbip_common;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: BbipPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbip_common/BbipV2PerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes11.dex */
public final class BbipV2PerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final BbipV2PerfScreen f99063d = new BbipV2PerfScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f99064e = "bbipConfigurator";

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f99065f = "bbipForecast";

    @k
    public static final Parcelable.Creator<BbipV2PerfScreen> CREATOR = new a();

    /* compiled from: BbipPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BbipV2PerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final BbipV2PerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BbipV2PerfScreen.f99063d;
        }

        @Override // android.os.Parcelable.Creator
        public final BbipV2PerfScreen[] newArray(int i12) {
            return new BbipV2PerfScreen[i12];
        }
    }

    public BbipV2PerfScreen() {
        super("BbipV2Screen", false, 2, null);
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
