package com.avito.android.wallet.pin.impl.creation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletPinCreationActivityResultParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/creation/WalletPinCreationActivityResultParams;", "Landroid/os/Parcelable;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WalletPinCreationActivityResultParams implements Parcelable {

    @k
    public static final Parcelable.Creator<WalletPinCreationActivityResultParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f328450b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f328451c;

    /* compiled from: WalletPinCreationActivityResultParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletPinCreationActivityResultParams> {
        @Override // android.os.Parcelable.Creator
        public final WalletPinCreationActivityResultParams createFromParcel(Parcel parcel) {
            return new WalletPinCreationActivityResultParams((DeepLink) parcel.readParcelable(WalletPinCreationActivityResultParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WalletPinCreationActivityResultParams[] newArray(int i12) {
            return new WalletPinCreationActivityResultParams[i12];
        }
    }

    public WalletPinCreationActivityResultParams(@l DeepLink deepLink, boolean z12) {
        this.f328450b = z12;
        this.f328451c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletPinCreationActivityResultParams)) {
            return false;
        }
        WalletPinCreationActivityResultParams walletPinCreationActivityResultParams = (WalletPinCreationActivityResultParams) obj;
        return this.f328450b == walletPinCreationActivityResultParams.f328450b && L.f(this.f328451c, walletPinCreationActivityResultParams.f328451c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f328450b) * 31;
        DeepLink deepLink = this.f328451c;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletPinCreationActivityResultParams(closeScreen=");
        sb2.append(this.f328450b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f328451c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f328450b ? 1 : 0);
        parcel.writeParcelable(this.f328451c, i12);
    }
}
