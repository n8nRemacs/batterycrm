package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItem.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002'(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "action", "Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;", "details", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "component3", "()Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;)Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "getAction", "Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;", "getDetails", "Action", "Details", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ServiceBookingItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<ServiceBookingItem> CREATOR = new Creator();

    @c("action")
    @k
    private final Action action;

    @c("calendarDetails")
    @l
    private final Details details;

    @c("title")
    @k
    private final String title;

    /* compiled from: ServiceBookingItem.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ Action copy$default(Action action, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = action.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = action.deepLink;
            }
            return action.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final Action copy(@k String title, @k DeepLink deepLink) {
            return new Action(title, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.title, action.title) && L.f(this.deepLink, action.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deepLink.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: ServiceBookingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceBookingItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceBookingItem createFromParcel(@k Parcel parcel) {
            return new ServiceBookingItem(parcel.readString(), Action.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceBookingItem[] newArray(int i12) {
            return new ServiceBookingItem[i12];
        }
    }

    /* compiled from: ServiceBookingItem.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;", "Landroid/os/Parcelable;", "", "badgeTitle", "subtitle", "badgeKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/ServiceBookingItem$Details;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBadgeTitle", "getSubtitle", "getBadgeKey", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @k
        public static final Parcelable.Creator<Details> CREATOR = new Creator();

        @c("badgeKey")
        @l
        private final String badgeKey;

        @c("badgeTitle")
        @l
        private final String badgeTitle;

        @c("subtitle")
        @k
        private final String subtitle;

        /* compiled from: ServiceBookingItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Details> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Details createFromParcel(@k Parcel parcel) {
                return new Details(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Details[] newArray(int i12) {
                return new Details[i12];
            }
        }

        public Details(@l String str, @k String str2, @l String str3) {
            this.badgeTitle = str;
            this.subtitle = str2;
            this.badgeKey = str3;
        }

        public static /* synthetic */ Details copy$default(Details details, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = details.badgeTitle;
            }
            if ((i12 & 2) != 0) {
                str2 = details.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = details.badgeKey;
            }
            return details.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getBadgeTitle() {
            return this.badgeTitle;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getBadgeKey() {
            return this.badgeKey;
        }

        @k
        public final Details copy(@l String badgeTitle, @k String subtitle, @l String badgeKey) {
            return new Details(badgeTitle, subtitle, badgeKey);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return L.f(this.badgeTitle, details.badgeTitle) && L.f(this.subtitle, details.subtitle) && L.f(this.badgeKey, details.badgeKey);
        }

        @l
        public final String getBadgeKey() {
            return this.badgeKey;
        }

        @l
        public final String getBadgeTitle() {
            return this.badgeTitle;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            String str = this.badgeTitle;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.subtitle);
            String str2 = this.badgeKey;
            return iD2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Details(badgeTitle=");
            sb2.append(this.badgeTitle);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", badgeKey=");
            return C22026a.c(sb2, this.badgeKey, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.badgeTitle);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.badgeKey);
        }
    }

    public ServiceBookingItem(@k String str, @k Action action, @l Details details) {
        this.title = str;
        this.action = action;
        this.details = details;
    }

    public static /* synthetic */ ServiceBookingItem copy$default(ServiceBookingItem serviceBookingItem, String str, Action action, Details details, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = serviceBookingItem.title;
        }
        if ((i12 & 2) != 0) {
            action = serviceBookingItem.action;
        }
        if ((i12 & 4) != 0) {
            details = serviceBookingItem.details;
        }
        return serviceBookingItem.copy(str, action, details);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    @k
    public final ServiceBookingItem copy(@k String title, @k Action action, @l Details details) {
        return new ServiceBookingItem(title, action, details);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceBookingItem)) {
            return false;
        }
        ServiceBookingItem serviceBookingItem = (ServiceBookingItem) other;
        return L.f(this.title, serviceBookingItem.title) && L.f(this.action, serviceBookingItem.action) && L.f(this.details, serviceBookingItem.details);
    }

    @k
    public final Action getAction() {
        return this.action;
    }

    @l
    public final Details getDetails() {
        return this.details;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + (this.title.hashCode() * 31)) * 31;
        Details details = this.details;
        return iHashCode + (details == null ? 0 : details.hashCode());
    }

    @k
    public String toString() {
        return "ServiceBookingItem(title=" + this.title + ", action=" + this.action + ", details=" + this.details + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.action.writeToParcel(parcel, flags);
        Details details = this.details;
        if (details == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            details.writeToParcel(parcel, flags);
        }
    }
}
