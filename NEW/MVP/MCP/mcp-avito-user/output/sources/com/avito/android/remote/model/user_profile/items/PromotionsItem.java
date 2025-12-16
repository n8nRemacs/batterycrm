package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PromotionsItem.kt */
@d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001 B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromotionsItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "key", "title", "description", "badge", "", "showIndicator", "Lcom/avito/android/remote/model/user_profile/items/PromotionsItem$PromotionsAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/user_profile/items/PromotionsItem$PromotionsAction;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getTitle", "getDescription", "getBadge", "Z", "getShowIndicator", "()Z", "Lcom/avito/android/remote/model/user_profile/items/PromotionsItem$PromotionsAction;", "getAction", "()Lcom/avito/android/remote/model/user_profile/items/PromotionsItem$PromotionsAction;", "PromotionsAction", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromotionsItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<PromotionsItem> CREATOR = new Creator();

    @c("action")
    @k
    private final PromotionsAction action;

    @c("badge")
    @l
    private final String badge;

    @c("description")
    @k
    private final String description;

    @c("key")
    @l
    private final String key;

    @c("showIndicator")
    private final boolean showIndicator;

    @c("title")
    @k
    private final String title;

    /* compiled from: PromotionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromotionsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromotionsItem createFromParcel(@k Parcel parcel) {
            return new PromotionsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, PromotionsAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromotionsItem[] newArray(int i12) {
            return new PromotionsItem[i12];
        }
    }

    /* compiled from: PromotionsItem.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PromotionsItem$PromotionsAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/ParametrizedEvent;", "event", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getEvent", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PromotionsAction implements Parcelable {

        @k
        public static final Parcelable.Creator<PromotionsAction> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("event")
        @l
        private final ParametrizedEvent event;

        @c("title")
        @k
        private final String title;

        /* compiled from: PromotionsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PromotionsAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromotionsAction createFromParcel(@k Parcel parcel) {
                return new PromotionsAction(parcel.readString(), (DeepLink) parcel.readParcelable(PromotionsAction.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(PromotionsAction.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PromotionsAction[] newArray(int i12) {
                return new PromotionsAction[i12];
            }
        }

        public PromotionsAction(@k String str, @k DeepLink deepLink, @l ParametrizedEvent parametrizedEvent) {
            this.title = str;
            this.deepLink = deepLink;
            this.event = parametrizedEvent;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final ParametrizedEvent getEvent() {
            return this.event;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeParcelable(this.event, flags);
        }
    }

    public PromotionsItem(@l String str, @k String str2, @k String str3, @l String str4, boolean z12, @k PromotionsAction promotionsAction) {
        this.key = str;
        this.title = str2;
        this.description = str3;
        this.badge = str4;
        this.showIndicator = z12;
        this.action = promotionsAction;
    }

    @k
    public final PromotionsAction getAction() {
        return this.action;
    }

    @l
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getKey() {
        return this.key;
    }

    public final boolean getShowIndicator() {
        return this.showIndicator;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.badge);
        parcel.writeInt(this.showIndicator ? 1 : 0);
        this.action.writeToParcel(parcel, flags);
    }
}
