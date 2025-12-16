package com.avito.android.wallet.webview.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: WalletWebViewLink.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/wallet/webview/deeplink/WalletWebViewDialogData;", "Landroid/os/Parcelable;", "", "title", "subtitle", "primaryButtonTitle", "secondaryButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "c", "d", "_avito_wallet-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletWebViewDialogData implements Parcelable {

    @k
    public static final Parcelable.Creator<WalletWebViewDialogData> CREATOR = new a();

    @c("primaryButtonTitle")
    @l
    private final String primaryButtonTitle;

    @c("secondaryButtonTitle")
    @l
    private final String secondaryButtonTitle;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: WalletWebViewLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WalletWebViewDialogData> {
        @Override // android.os.Parcelable.Creator
        public final WalletWebViewDialogData createFromParcel(Parcel parcel) {
            return new WalletWebViewDialogData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WalletWebViewDialogData[] newArray(int i12) {
            return new WalletWebViewDialogData[i12];
        }
    }

    public WalletWebViewDialogData(@l String str, @l String str2, @l String str3, @l String str4) {
        this.title = str;
        this.subtitle = str2;
        this.primaryButtonTitle = str3;
        this.secondaryButtonTitle = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPrimaryButtonTitle() {
        return this.primaryButtonTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getSecondaryButtonTitle() {
        return this.secondaryButtonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.primaryButtonTitle);
        parcel.writeString(this.secondaryButtonTitle);
    }
}
