package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.user_profile.SeparateBalance;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WalletItem.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/WalletItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "balance", "Lcom/avito/android/remote/model/user_profile/SeparateBalance;", "separate", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "isBalanceHidden", "updateUri", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/SeparateBalance;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBalance", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/user_profile/SeparateBalance;", "getSeparate", "()Lcom/avito/android/remote/model/user_profile/SeparateBalance;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Z", "()Z", "getUpdateUri", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WalletItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<WalletItem> CREATOR = new Creator();

    @c("balance")
    @k
    private final String balance;

    @c("isBalanceHidden")
    private final boolean isBalanceHidden;

    @c("separate")
    @l
    private final SeparateBalance separate;

    @c("updateUri")
    @l
    private final String updateUri;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    /* compiled from: WalletItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WalletItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WalletItem createFromParcel(@k Parcel parcel) {
            return new WalletItem(parcel.readString(), (SeparateBalance) parcel.readParcelable(WalletItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(WalletItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WalletItem[] newArray(int i12) {
            return new WalletItem[i12];
        }
    }

    public /* synthetic */ WalletItem(String str, SeparateBalance separateBalance, DeepLink deepLink, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : separateBalance, deepLink, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? null : str2);
    }

    @k
    public final String getBalance() {
        return this.balance;
    }

    @l
    public final SeparateBalance getSeparate() {
        return this.separate;
    }

    @l
    public final String getUpdateUri() {
        return this.updateUri;
    }

    @k
    public final DeepLink getUri() {
        return this.uri;
    }

    /* renamed from: isBalanceHidden, reason: from getter */
    public final boolean getIsBalanceHidden() {
        return this.isBalanceHidden;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.balance);
        parcel.writeParcelable(this.separate, flags);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeInt(this.isBalanceHidden ? 1 : 0);
        parcel.writeString(this.updateUri);
    }

    public WalletItem(@k String str, @l SeparateBalance separateBalance, @k DeepLink deepLink, boolean z12, @l String str2) {
        this.balance = str;
        this.separate = separateBalance;
        this.uri = deepLink;
        this.isBalanceHidden = z12;
        this.updateUri = str2;
    }
}
