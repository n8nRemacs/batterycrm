package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubscribeInfo.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u000b\"\u0004\b$\u0010%R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b&\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/SubscribeInfo;", "Landroid/os/Parcelable;", "", "isSubscribed", "isNotificationsActivated", "Lcom/avito/android/remote/model/ProfileCounter;", "subscribers", "subscriptions", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/ProfileCounter;Lcom/avito/android/remote/model/ProfileCounter;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/avito/android/remote/model/ProfileCounter;", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/ProfileCounter;Lcom/avito/android/remote/model/ProfileCounter;)Lcom/avito/android/remote/model/SubscribeInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "setSubscribed", "(Ljava/lang/Boolean;)V", "setNotificationsActivated", "Lcom/avito/android/remote/model/ProfileCounter;", "getSubscribers", "getSubscriptions", "_avito-discouraged_avito-api_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SubscribeInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SubscribeInfo> CREATOR = new Creator();

    @c("isNotificationsActivated")
    @l
    private Boolean isNotificationsActivated;

    @c("isSubscribed")
    @l
    private Boolean isSubscribed;

    @c("subscribers")
    @l
    private final ProfileCounter subscribers;

    @c("subscriptions")
    @l
    private final ProfileCounter subscriptions;

    /* compiled from: SubscribeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubscribeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SubscribeInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
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
            return new SubscribeInfo(boolValueOf, boolValueOf2, parcel.readInt() == 0 ? null : ProfileCounter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProfileCounter.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SubscribeInfo[] newArray(int i12) {
            return new SubscribeInfo[i12];
        }
    }

    public SubscribeInfo(@l Boolean bool, @l Boolean bool2, @l ProfileCounter profileCounter, @l ProfileCounter profileCounter2) {
        this.isSubscribed = bool;
        this.isNotificationsActivated = bool2;
        this.subscribers = profileCounter;
        this.subscriptions = profileCounter2;
    }

    public static /* synthetic */ SubscribeInfo copy$default(SubscribeInfo subscribeInfo, Boolean bool, Boolean bool2, ProfileCounter profileCounter, ProfileCounter profileCounter2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = subscribeInfo.isSubscribed;
        }
        if ((i12 & 2) != 0) {
            bool2 = subscribeInfo.isNotificationsActivated;
        }
        if ((i12 & 4) != 0) {
            profileCounter = subscribeInfo.subscribers;
        }
        if ((i12 & 8) != 0) {
            profileCounter2 = subscribeInfo.subscriptions;
        }
        return subscribeInfo.copy(bool, bool2, profileCounter, profileCounter2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsNotificationsActivated() {
        return this.isNotificationsActivated;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ProfileCounter getSubscribers() {
        return this.subscribers;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ProfileCounter getSubscriptions() {
        return this.subscriptions;
    }

    @k
    public final SubscribeInfo copy(@l Boolean isSubscribed, @l Boolean isNotificationsActivated, @l ProfileCounter subscribers, @l ProfileCounter subscriptions) {
        return new SubscribeInfo(isSubscribed, isNotificationsActivated, subscribers, subscriptions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscribeInfo)) {
            return false;
        }
        SubscribeInfo subscribeInfo = (SubscribeInfo) other;
        return L.f(this.isSubscribed, subscribeInfo.isSubscribed) && L.f(this.isNotificationsActivated, subscribeInfo.isNotificationsActivated) && L.f(this.subscribers, subscribeInfo.subscribers) && L.f(this.subscriptions, subscribeInfo.subscriptions);
    }

    @l
    public final ProfileCounter getSubscribers() {
        return this.subscribers;
    }

    @l
    public final ProfileCounter getSubscriptions() {
        return this.subscriptions;
    }

    public int hashCode() {
        Boolean bool = this.isSubscribed;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isNotificationsActivated;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ProfileCounter profileCounter = this.subscribers;
        int iHashCode3 = (iHashCode2 + (profileCounter == null ? 0 : profileCounter.hashCode())) * 31;
        ProfileCounter profileCounter2 = this.subscriptions;
        return iHashCode3 + (profileCounter2 != null ? profileCounter2.hashCode() : 0);
    }

    @l
    public final Boolean isNotificationsActivated() {
        return this.isNotificationsActivated;
    }

    @l
    public final Boolean isSubscribed() {
        return this.isSubscribed;
    }

    public final void setNotificationsActivated(@l Boolean bool) {
        this.isNotificationsActivated = bool;
    }

    public final void setSubscribed(@l Boolean bool) {
        this.isSubscribed = bool;
    }

    @k
    public String toString() {
        return "SubscribeInfo(isSubscribed=" + this.isSubscribed + ", isNotificationsActivated=" + this.isNotificationsActivated + ", subscribers=" + this.subscribers + ", subscriptions=" + this.subscriptions + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isNotificationsActivated;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        ProfileCounter profileCounter = this.subscribers;
        if (profileCounter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileCounter.writeToParcel(parcel, flags);
        }
        ProfileCounter profileCounter2 = this.subscriptions;
        if (profileCounter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileCounter2.writeToParcel(parcel, flags);
        }
    }
}
