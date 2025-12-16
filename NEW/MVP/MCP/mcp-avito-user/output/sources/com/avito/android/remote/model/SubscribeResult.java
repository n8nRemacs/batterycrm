package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubscribeResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/SubscribeResult;", "Landroid/os/Parcelable;", "SubscribeErrorAction", "SubscribeErrorDialog", "SubscribeSuccess", "Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorAction;", "Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorDialog;", "Lcom/avito/android/remote/model/SubscribeResult$SubscribeSuccess;", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SubscribeResult extends Parcelable {

    /* compiled from: SubscribeResult.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorAction;", "Lcom/avito/android/remote/model/SubscribeResult;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "message", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "Ljava/lang/String;", "getMessage", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscribeErrorAction implements SubscribeResult {

        @k
        public static final Parcelable.Creator<SubscribeErrorAction> CREATOR = new Creator();

        @c("action")
        @k
        private final DeepLink action;

        @c("message")
        @l
        private final String message;

        /* compiled from: SubscribeResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubscribeErrorAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeErrorAction createFromParcel(@k Parcel parcel) {
                return new SubscribeErrorAction((DeepLink) parcel.readParcelable(SubscribeErrorAction.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeErrorAction[] newArray(int i12) {
                return new SubscribeErrorAction[i12];
            }
        }

        public SubscribeErrorAction(@k DeepLink deepLink, @l String str) {
            this.action = deepLink;
            this.message = str;
        }

        public static /* synthetic */ SubscribeErrorAction copy$default(SubscribeErrorAction subscribeErrorAction, DeepLink deepLink, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = subscribeErrorAction.action;
            }
            if ((i12 & 2) != 0) {
                str = subscribeErrorAction.message;
            }
            return subscribeErrorAction.copy(deepLink, str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLink getAction() {
            return this.action;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final SubscribeErrorAction copy(@k DeepLink action, @l String message) {
            return new SubscribeErrorAction(action, message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubscribeErrorAction)) {
                return false;
            }
            SubscribeErrorAction subscribeErrorAction = (SubscribeErrorAction) other;
            return L.f(this.action, subscribeErrorAction.action) && L.f(this.message, subscribeErrorAction.message);
        }

        @k
        public final DeepLink getAction() {
            return this.action;
        }

        @l
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SubscribeErrorAction(action=");
            sb2.append(this.action);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
            parcel.writeString(this.message);
        }
    }

    /* compiled from: SubscribeResult.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorDialog;", "Lcom/avito/android/remote/model/SubscribeResult;", "Lcom/avito/android/remote/model/UserDialog;", "userDialog", "<init>", "(Lcom/avito/android/remote/model/UserDialog;)V", "component1", "()Lcom/avito/android/remote/model/UserDialog;", "copy", "(Lcom/avito/android/remote/model/UserDialog;)Lcom/avito/android/remote/model/SubscribeResult$SubscribeErrorDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UserDialog;", "getUserDialog", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscribeErrorDialog implements SubscribeResult {

        @k
        public static final Parcelable.Creator<SubscribeErrorDialog> CREATOR = new Creator();

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        /* compiled from: SubscribeResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubscribeErrorDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeErrorDialog createFromParcel(@k Parcel parcel) {
                return new SubscribeErrorDialog((UserDialog) parcel.readParcelable(SubscribeErrorDialog.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeErrorDialog[] newArray(int i12) {
                return new SubscribeErrorDialog[i12];
            }
        }

        public SubscribeErrorDialog(@k UserDialog userDialog) {
            this.userDialog = userDialog;
        }

        public static /* synthetic */ SubscribeErrorDialog copy$default(SubscribeErrorDialog subscribeErrorDialog, UserDialog userDialog, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                userDialog = subscribeErrorDialog.userDialog;
            }
            return subscribeErrorDialog.copy(userDialog);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }

        @k
        public final SubscribeErrorDialog copy(@k UserDialog userDialog) {
            return new SubscribeErrorDialog(userDialog);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubscribeErrorDialog) && L.f(this.userDialog, ((SubscribeErrorDialog) other).userDialog);
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }

        public int hashCode() {
            return this.userDialog.hashCode();
        }

        @k
        public String toString() {
            return "SubscribeErrorDialog(userDialog=" + this.userDialog + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.userDialog, flags);
        }
    }

    /* compiled from: SubscribeResult.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/SubscribeResult$SubscribeSuccess;", "Lcom/avito/android/remote/model/SubscribeResult;", "", "isNotificationsActivated", "Lcom/avito/android/remote/model/FavoriteSellerCounter;", "subscriptions", "subscribers", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/FavoriteSellerCounter;Lcom/avito/android/remote/model/FavoriteSellerCounter;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/FavoriteSellerCounter;", "getSubscriptions", "()Lcom/avito/android/remote/model/FavoriteSellerCounter;", "getSubscribers", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubscribeSuccess implements SubscribeResult {

        @k
        public static final Parcelable.Creator<SubscribeSuccess> CREATOR = new Creator();

        @c("isNotificationsActivated")
        @l
        private final Boolean isNotificationsActivated;

        @c("subscribers")
        @l
        private final FavoriteSellerCounter subscribers;

        @c("subscriptions")
        @l
        private final FavoriteSellerCounter subscriptions;

        /* compiled from: SubscribeResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubscribeSuccess> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeSuccess createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SubscribeSuccess(boolValueOf, parcel.readInt() == 0 ? null : FavoriteSellerCounter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FavoriteSellerCounter.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SubscribeSuccess[] newArray(int i12) {
                return new SubscribeSuccess[i12];
            }
        }

        public SubscribeSuccess(@l Boolean bool, @l FavoriteSellerCounter favoriteSellerCounter, @l FavoriteSellerCounter favoriteSellerCounter2) {
            this.isNotificationsActivated = bool;
            this.subscriptions = favoriteSellerCounter;
            this.subscribers = favoriteSellerCounter2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final FavoriteSellerCounter getSubscribers() {
            return this.subscribers;
        }

        @l
        public final FavoriteSellerCounter getSubscriptions() {
            return this.subscriptions;
        }

        @l
        /* renamed from: isNotificationsActivated, reason: from getter */
        public final Boolean getIsNotificationsActivated() {
            return this.isNotificationsActivated;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.isNotificationsActivated;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            FavoriteSellerCounter favoriteSellerCounter = this.subscriptions;
            if (favoriteSellerCounter == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                favoriteSellerCounter.writeToParcel(parcel, flags);
            }
            FavoriteSellerCounter favoriteSellerCounter2 = this.subscribers;
            if (favoriteSellerCounter2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                favoriteSellerCounter2.writeToParcel(parcel, flags);
            }
        }
    }
}
