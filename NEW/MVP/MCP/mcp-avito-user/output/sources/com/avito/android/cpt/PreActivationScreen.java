package com.avito.android.cpt;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: CptPerfScreens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpt/PreActivationScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes12.dex */
public final class PreActivationScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final PreActivationScreen f126194d = new PreActivationScreen();

    @k
    public static final Parcelable.Creator<PreActivationScreen> CREATOR = new a();

    /* compiled from: CptPerfScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreActivationScreen> {
        @Override // android.os.Parcelable.Creator
        public final PreActivationScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PreActivationScreen.f126194d;
        }

        @Override // android.os.Parcelable.Creator
        public final PreActivationScreen[] newArray(int i12) {
            return new PreActivationScreen[i12];
        }
    }

    public PreActivationScreen() {
        super("PreActivationScreen", false, 2, null);
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
