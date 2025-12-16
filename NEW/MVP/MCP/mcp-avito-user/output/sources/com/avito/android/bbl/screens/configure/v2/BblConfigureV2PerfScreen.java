package com.avito.android.bbl.screens.configure.v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: BblConfigureV2PerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/BblConfigureV2PerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes11.dex */
public final class BblConfigureV2PerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final BblConfigureV2PerfScreen f99291d = new BblConfigureV2PerfScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f99292e = "bblConfigureV2";

    @Y61.k
    public static final Parcelable.Creator<BblConfigureV2PerfScreen> CREATOR = new a();

    /* compiled from: BblConfigureV2PerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BblConfigureV2PerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final BblConfigureV2PerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BblConfigureV2PerfScreen.f99291d;
        }

        @Override // android.os.Parcelable.Creator
        public final BblConfigureV2PerfScreen[] newArray(int i12) {
            return new BblConfigureV2PerfScreen[i12];
        }
    }

    public BblConfigureV2PerfScreen() {
        super("MnzBblConfigureV2", false, 2, null);
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
