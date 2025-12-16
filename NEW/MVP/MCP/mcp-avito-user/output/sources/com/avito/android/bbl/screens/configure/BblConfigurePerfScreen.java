package com.avito.android.bbl.screens.configure;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: BblConfigurePerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/BblConfigurePerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes11.dex */
public final class BblConfigurePerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final BblConfigurePerfScreen f99119d = new BblConfigurePerfScreen();

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f99120e = "bblConfigure";

    @k
    public static final Parcelable.Creator<BblConfigurePerfScreen> CREATOR = new a();

    /* compiled from: BblConfigurePerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BblConfigurePerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final BblConfigurePerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return BblConfigurePerfScreen.f99119d;
        }

        @Override // android.os.Parcelable.Creator
        public final BblConfigurePerfScreen[] newArray(int i12) {
            return new BblConfigurePerfScreen[i12];
        }
    }

    public BblConfigurePerfScreen() {
        super("MnzBblConfigure", false, 2, null);
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
