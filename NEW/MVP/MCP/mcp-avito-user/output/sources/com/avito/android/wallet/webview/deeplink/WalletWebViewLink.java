package com.avito.android.wallet.webview.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: WalletWebViewLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/webview/deeplink/WalletWebViewLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class WalletWebViewLink extends DeepLink {

    @k
    public static final Parcelable.Creator<WalletWebViewLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f329382b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f329383c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f329384d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f329385e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f329386f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f329387g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f329388h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f329389i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final WalletWebViewDialogData f329390j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f329391k;

    /* compiled from: WalletWebViewLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletWebViewLink> {
        @Override // android.os.Parcelable.Creator
        public final WalletWebViewLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WalletWebViewLink(string, string2, string3, string4, string5, boolValueOf, boolValueOf2, boolValueOf3, parcel.readInt() != 0 ? WalletWebViewDialogData.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(WalletWebViewLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WalletWebViewLink[] newArray(int i12) {
            return new WalletWebViewLink[i12];
        }
    }

    public WalletWebViewLink(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l WalletWebViewDialogData walletWebViewDialogData, @l DeepLink deepLink) {
        this.f329382b = str;
        this.f329383c = str2;
        this.f329384d = str3;
        this.f329385e = str4;
        this.f329386f = str5;
        this.f329387g = bool;
        this.f329388h = bool2;
        this.f329389i = bool3;
        this.f329390j = walletWebViewDialogData;
        this.f329391k = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f329382b);
        parcel.writeString(this.f329383c);
        parcel.writeString(this.f329384d);
        parcel.writeString(this.f329385e);
        parcel.writeString(this.f329386f);
        Boolean bool = this.f329387g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f329388h;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.f329389i;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        WalletWebViewDialogData walletWebViewDialogData = this.f329390j;
        if (walletWebViewDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletWebViewDialogData.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f329391k, i12);
    }
}
