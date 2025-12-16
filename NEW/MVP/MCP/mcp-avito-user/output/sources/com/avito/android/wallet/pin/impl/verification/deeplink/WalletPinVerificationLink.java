package com.avito.android.wallet.pin.impl.verification.deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import iP0.InterfaceC41331a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: WalletPinVerificationLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class WalletPinVerificationLink extends DeepLink {

    @k
    public static final Parcelable.Creator<WalletPinVerificationLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f329048b;

    /* compiled from: WalletPinVerificationLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletPinVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final WalletPinVerificationLink createFromParcel(Parcel parcel) {
            return new WalletPinVerificationLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WalletPinVerificationLink[] newArray(int i12) {
            return new WalletPinVerificationLink[i12];
        }
    }

    /* compiled from: WalletPinVerificationLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink$b;", "LJu/c$b;", "a", "Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink$b$a;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: WalletPinVerificationLink.kt */
        @P
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink$b$a;", "Lcom/avito/android/wallet/pin/impl/verification/deeplink/WalletPinVerificationLink$b;", "LiP0/a;", "LJu/a$b;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC41331a, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f329049b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f329050c;

            public a(@l DeepLink deepLink, boolean z12) {
                this.f329049b = z12;
                this.f329050c = deepLink;
            }

            @Override // iP0.InterfaceC41331a
            /* renamed from: a, reason: from getter */
            public final boolean getF329049b() {
                return this.f329049b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f329049b == aVar.f329049b && L.f(this.f329050c, aVar.f329050c);
            }

            @Override // iP0.InterfaceC41331a
            @l
            /* renamed from: getDeepLink, reason: from getter */
            public final DeepLink getF329050c() {
                return this.f329050c;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f329049b) * 31;
                DeepLink deepLink = this.f329050c;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Params(closeScreen=");
                sb2.append(this.f329049b);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f329050c, ')');
            }
        }
    }

    public WalletPinVerificationLink(@k String str) {
        this.f329048b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f329048b);
    }
}
