package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceItem.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/Account;", "Landroid/os/Parcelable;", "Ljava/math/BigInteger;", DeliverySubsidiesSlotKt.AMOUNT, "Lcom/avito/android/remote/model/user_profile/items/State;", VoiceInfo.STATE, "Lcom/avito/android/remote/model/user_profile/items/AccountType;", "type", "<init>", "(Ljava/math/BigInteger;Lcom/avito/android/remote/model/user_profile/items/State;Lcom/avito/android/remote/model/user_profile/items/AccountType;)V", "component1", "()Ljava/math/BigInteger;", "component2", "()Lcom/avito/android/remote/model/user_profile/items/State;", "component3", "()Lcom/avito/android/remote/model/user_profile/items/AccountType;", "copy", "(Ljava/math/BigInteger;Lcom/avito/android/remote/model/user_profile/items/State;Lcom/avito/android/remote/model/user_profile/items/AccountType;)Lcom/avito/android/remote/model/user_profile/items/Account;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/math/BigInteger;", "getAmount", "Lcom/avito/android/remote/model/user_profile/items/State;", "getState", "Lcom/avito/android/remote/model/user_profile/items/AccountType;", "getType", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Account implements Parcelable {

    @k
    public static final Parcelable.Creator<Account> CREATOR = new Creator();

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @l
    private final BigInteger amount;

    @c(VoiceInfo.STATE)
    @l
    private final State state;

    @c("type")
    @l
    private final AccountType type;

    /* compiled from: AvitoFinanceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Account> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Account createFromParcel(@k Parcel parcel) {
            return new Account((BigInteger) parcel.readSerializable(), parcel.readInt() == 0 ? null : State.valueOf(parcel.readString()), parcel.readInt() != 0 ? AccountType.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Account[] newArray(int i12) {
            return new Account[i12];
        }
    }

    public Account(@l BigInteger bigInteger, @l State state, @l AccountType accountType) {
        this.amount = bigInteger;
        this.state = state;
        this.type = accountType;
    }

    public static /* synthetic */ Account copy$default(Account account, BigInteger bigInteger, State state, AccountType accountType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bigInteger = account.amount;
        }
        if ((i12 & 2) != 0) {
            state = account.state;
        }
        if ((i12 & 4) != 0) {
            accountType = account.type;
        }
        return account.copy(bigInteger, state, accountType);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final BigInteger getAmount() {
        return this.amount;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final State getState() {
        return this.state;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AccountType getType() {
        return this.type;
    }

    @k
    public final Account copy(@l BigInteger amount, @l State state, @l AccountType type) {
        return new Account(amount, state, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        return L.f(this.amount, account.amount) && this.state == account.state && this.type == account.type;
    }

    @l
    public final BigInteger getAmount() {
        return this.amount;
    }

    @l
    public final State getState() {
        return this.state;
    }

    @l
    public final AccountType getType() {
        return this.type;
    }

    public int hashCode() {
        BigInteger bigInteger = this.amount;
        int iHashCode = (bigInteger == null ? 0 : bigInteger.hashCode()) * 31;
        State state = this.state;
        int iHashCode2 = (iHashCode + (state == null ? 0 : state.hashCode())) * 31;
        AccountType accountType = this.type;
        return iHashCode2 + (accountType != null ? accountType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Account(amount=" + this.amount + ", state=" + this.state + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeSerializable(this.amount);
        State state = this.state;
        if (state == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(state.name());
        }
        AccountType accountType = this.type;
        if (accountType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountType.name());
        }
    }
}
