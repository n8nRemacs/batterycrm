package com.avito.android.profile.pro.impl.screen.item.walletandprepayment;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProWalletAndPrepaymentItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/walletandprepayment/ProfileProWalletAndPrepaymentItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Prepayment", "Wallet", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProWalletAndPrepaymentItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProWalletAndPrepaymentItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223543b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Wallet f223544c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Prepayment f223545d;

    /* compiled from: ProfileProWalletAndPrepaymentItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/walletandprepayment/ProfileProWalletAndPrepaymentItem$Prepayment;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Prepayment implements Parcelable {

        @k
        public static final Parcelable.Creator<Prepayment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f223546b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f223547c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f223548d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f223549e;

        /* compiled from: ProfileProWalletAndPrepaymentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Prepayment> {
            @Override // android.os.Parcelable.Creator
            public final Prepayment createFromParcel(Parcel parcel) {
                return new Prepayment(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Prepayment.class.getClassLoader()), (DeepLink) parcel.readParcelable(Prepayment.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Prepayment[] newArray(int i12) {
                return new Prepayment[i12];
            }
        }

        public Prepayment(@l String str, @l String str2, @l AttributedText attributedText, @l DeepLink deepLink) {
            this.f223546b = str;
            this.f223547c = str2;
            this.f223548d = attributedText;
            this.f223549e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f223546b);
            parcel.writeString(this.f223547c);
            parcel.writeParcelable(this.f223548d, i12);
            parcel.writeParcelable(this.f223549e, i12);
        }
    }

    /* compiled from: ProfileProWalletAndPrepaymentItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/walletandprepayment/ProfileProWalletAndPrepaymentItem$Wallet;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Wallet implements Parcelable {

        @k
        public static final Parcelable.Creator<Wallet> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f223550b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f223551c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f223552d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f223553e;

        /* compiled from: ProfileProWalletAndPrepaymentItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Wallet> {
            @Override // android.os.Parcelable.Creator
            public final Wallet createFromParcel(Parcel parcel) {
                return new Wallet(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Wallet.class.getClassLoader()), (DeepLink) parcel.readParcelable(Wallet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Wallet[] newArray(int i12) {
                return new Wallet[i12];
            }
        }

        public Wallet(@l String str, @l String str2, @l AttributedText attributedText, @l DeepLink deepLink) {
            this.f223550b = str;
            this.f223551c = str2;
            this.f223552d = attributedText;
            this.f223553e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f223550b);
            parcel.writeString(this.f223551c);
            parcel.writeParcelable(this.f223552d, i12);
            parcel.writeParcelable(this.f223553e, i12);
        }
    }

    /* compiled from: ProfileProWalletAndPrepaymentItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProWalletAndPrepaymentItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProWalletAndPrepaymentItem createFromParcel(Parcel parcel) {
            return new ProfileProWalletAndPrepaymentItem(parcel.readString(), parcel.readInt() == 0 ? null : Wallet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Prepayment.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProWalletAndPrepaymentItem[] newArray(int i12) {
            return new ProfileProWalletAndPrepaymentItem[i12];
        }
    }

    public ProfileProWalletAndPrepaymentItem(@k String str, @l Wallet wallet, @l Prepayment prepayment) {
        this.f223543b = str;
        this.f223544c = wallet;
        this.f223545d = prepayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProWalletAndPrepaymentItem)) {
            return false;
        }
        ProfileProWalletAndPrepaymentItem profileProWalletAndPrepaymentItem = (ProfileProWalletAndPrepaymentItem) obj;
        return L.f(this.f223543b, profileProWalletAndPrepaymentItem.f223543b) && L.f(this.f223544c, profileProWalletAndPrepaymentItem.f223544c) && L.f(this.f223545d, profileProWalletAndPrepaymentItem.f223545d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224084b() {
        return this.f223543b;
    }

    public final int hashCode() {
        int iHashCode = this.f223543b.hashCode() * 31;
        Wallet wallet = this.f223544c;
        int iHashCode2 = (iHashCode + (wallet == null ? 0 : wallet.hashCode())) * 31;
        Prepayment prepayment = this.f223545d;
        return iHashCode2 + (prepayment != null ? prepayment.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ProfileProWalletAndPrepaymentItem(stringId=" + this.f223543b + ", wallet=" + this.f223544c + ", prepayment=" + this.f223545d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223543b);
        Wallet wallet = this.f223544c;
        if (wallet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallet.writeToParcel(parcel, i12);
        }
        Prepayment prepayment = this.f223545d;
        if (prepayment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            prepayment.writeToParcel(parcel, i12);
        }
    }
}
