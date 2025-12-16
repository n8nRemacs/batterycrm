package com.avito.android.wallet.pin.impl.settings.perf;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: WalletSecuritySettingsPerfScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/perf/WalletSecuritySettingsPerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes5.dex */
public final class WalletSecuritySettingsPerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final WalletSecuritySettingsPerfScreen f328896d = new WalletSecuritySettingsPerfScreen();

    @k
    public static final Parcelable.Creator<WalletSecuritySettingsPerfScreen> CREATOR = new a();

    /* compiled from: WalletSecuritySettingsPerfScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletSecuritySettingsPerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final WalletSecuritySettingsPerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return WalletSecuritySettingsPerfScreen.f328896d;
        }

        @Override // android.os.Parcelable.Creator
        public final WalletSecuritySettingsPerfScreen[] newArray(int i12) {
            return new WalletSecuritySettingsPerfScreen[i12];
        }
    }

    public WalletSecuritySettingsPerfScreen() {
        super("WalletSecuritySettings", false, 2, null);
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
