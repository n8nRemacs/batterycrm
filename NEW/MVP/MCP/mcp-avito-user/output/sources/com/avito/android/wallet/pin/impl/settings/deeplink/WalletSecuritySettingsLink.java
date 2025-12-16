package com.avito.android.wallet.pin.impl.settings.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: WalletSecuritySettingsLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/deeplink/WalletSecuritySettingsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class WalletSecuritySettingsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<WalletSecuritySettingsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f328723b;

    /* compiled from: WalletSecuritySettingsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletSecuritySettingsLink> {
        @Override // android.os.Parcelable.Creator
        public final WalletSecuritySettingsLink createFromParcel(Parcel parcel) {
            return new WalletSecuritySettingsLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WalletSecuritySettingsLink[] newArray(int i12) {
            return new WalletSecuritySettingsLink[i12];
        }
    }

    public WalletSecuritySettingsLink(@k String str) {
        this.f328723b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f328723b);
    }
}
