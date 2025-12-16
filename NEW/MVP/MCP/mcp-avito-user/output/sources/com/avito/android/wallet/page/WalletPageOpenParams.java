package com.avito.android.wallet.page;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: WalletPageOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/WalletPageOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletPageOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<WalletPageOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f327750b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f327751c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f327752d;

    /* compiled from: WalletPageOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletPageOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final WalletPageOpenParams createFromParcel(Parcel parcel) {
            return new WalletPageOpenParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WalletPageOpenParams[] newArray(int i12) {
            return new WalletPageOpenParams[i12];
        }
    }

    public WalletPageOpenParams(@l String str, @l String str2, boolean z12) {
        this.f327750b = str;
        this.f327751c = str2;
        this.f327752d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f327750b);
        parcel.writeString(this.f327751c);
        parcel.writeInt(this.f327752d ? 1 : 0);
    }
}
