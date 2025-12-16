package com.avito.android.wallet.webview;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.OpenParams;
import com.avito.android.wallet.webview.deeplink.WalletWebViewDialogData;
import kotlin.Metadata;

/* compiled from: WalletWebViewOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/WalletWebViewOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletWebViewOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<WalletWebViewOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f329369b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f329370c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f329371d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f329372e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f329373f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f329374g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f329375h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f329376i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final WalletWebViewDialogData f329377j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final DeepLink f329378k;

    /* compiled from: WalletWebViewOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletWebViewOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final WalletWebViewOpenParams createFromParcel(Parcel parcel) {
            return new WalletWebViewOpenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : WalletWebViewDialogData.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(WalletWebViewOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WalletWebViewOpenParams[] newArray(int i12) {
            return new WalletWebViewOpenParams[i12];
        }
    }

    public WalletWebViewOpenParams(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z12, boolean z13, boolean z14, @Y61.l WalletWebViewDialogData walletWebViewDialogData, @Y61.l DeepLink deepLink) {
        this.f329369b = str;
        this.f329370c = str2;
        this.f329371d = str3;
        this.f329372e = str4;
        this.f329373f = str5;
        this.f329374g = z12;
        this.f329375h = z13;
        this.f329376i = z14;
        this.f329377j = walletWebViewDialogData;
        this.f329378k = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f329369b);
        parcel.writeString(this.f329370c);
        parcel.writeString(this.f329371d);
        parcel.writeString(this.f329372e);
        parcel.writeString(this.f329373f);
        parcel.writeInt(this.f329374g ? 1 : 0);
        parcel.writeInt(this.f329375h ? 1 : 0);
        parcel.writeInt(this.f329376i ? 1 : 0);
        WalletWebViewDialogData walletWebViewDialogData = this.f329377j;
        if (walletWebViewDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletWebViewDialogData.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f329378k, i12);
    }
}
