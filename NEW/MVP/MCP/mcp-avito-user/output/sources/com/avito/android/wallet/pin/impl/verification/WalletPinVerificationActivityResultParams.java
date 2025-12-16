package com.avito.android.wallet.pin.impl.verification;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinVerificationActivityResultParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/WalletPinVerificationActivityResultParams;", "Landroid/os/Parcelable;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletPinVerificationActivityResultParams implements Parcelable {

    @k
    public static final Parcelable.Creator<WalletPinVerificationActivityResultParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f329042b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f329043c;

    /* compiled from: WalletPinVerificationActivityResultParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletPinVerificationActivityResultParams> {
        @Override // android.os.Parcelable.Creator
        public final WalletPinVerificationActivityResultParams createFromParcel(Parcel parcel) {
            return new WalletPinVerificationActivityResultParams((DeepLink) parcel.readParcelable(WalletPinVerificationActivityResultParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WalletPinVerificationActivityResultParams[] newArray(int i12) {
            return new WalletPinVerificationActivityResultParams[i12];
        }
    }

    public WalletPinVerificationActivityResultParams(@l DeepLink deepLink, boolean z12) {
        this.f329042b = z12;
        this.f329043c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPinVerificationActivityResultParams)) {
            return false;
        }
        WalletPinVerificationActivityResultParams walletPinVerificationActivityResultParams = (WalletPinVerificationActivityResultParams) obj;
        return this.f329042b == walletPinVerificationActivityResultParams.f329042b && L.f(this.f329043c, walletPinVerificationActivityResultParams.f329043c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f329042b) * 31;
        DeepLink deepLink = this.f329043c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPinVerificationActivityResultParams(closeScreen=");
        sb2.append(this.f329042b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f329043c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f329042b ? 1 : 0);
        parcel.writeParcelable(this.f329043c, i12);
    }
}
