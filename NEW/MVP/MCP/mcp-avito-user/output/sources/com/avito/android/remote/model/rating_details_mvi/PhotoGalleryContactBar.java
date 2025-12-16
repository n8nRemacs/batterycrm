package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u000223BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJZ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b/\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b0\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b1\u0010\u000f¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "avatar", "", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ContactButton;", "actions", "title", "price", "userHash", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Ljava/util/List;", "getActions", "getTitle", "getPrice", "getUserHash", "ActionType", "ContactButton", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhotoGalleryContactBar implements Parcelable {

    @k
    public static final Parcelable.Creator<PhotoGalleryContactBar> CREATOR = new Creator();

    @c("actions")
    @k
    private final List<ContactButton> actions;

    @c("avatar")
    @l
    private final Image avatar;

    @c("name")
    @k
    private final String name;

    @c("price")
    @l
    private final String price;

    @c("title")
    @l
    private final String title;

    @c("userHash")
    @l
    private final String userHash;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;", "", "(Ljava/lang/String;I)V", "PHONE", "MESSENGER", "CALENDAR", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        @c("phone")
        public static final ActionType PHONE = new ActionType("PHONE", 0);

        @c(NotificationsSettings.Section.SECTION_MESSENGER)
        public static final ActionType MESSENGER = new ActionType("MESSENGER", 1);

        @c(FormattedDateDisplayingType.TYPE_CALENDAR)
        public static final ActionType CALENDAR = new ActionType("CALENDAR", 2);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{PHONE, MESSENGER, CALENDAR};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(actionTypeArr$values);
        }

        private ActionType(String str, int i12) {
        }

        @k
        public static a<ActionType> getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ContactButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;", "actionType", "", "iconName", "iconColor", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ContactButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/rating_details_mvi/PhotoGalleryContactBar$ActionType;", "getActionType", "Ljava/lang/String;", "getIconName", "getIconColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactButton implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactButton> CREATOR = new Creator();

        @c("type")
        @k
        private final ActionType actionType;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deepLink;

        @c("iconColor")
        @k
        private final String iconColor;

        @c("iconName")
        @k
        private final String iconName;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactButton createFromParcel(@k Parcel parcel) {
                return new ContactButton(ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ContactButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactButton[] newArray(int i12) {
                return new ContactButton[i12];
            }
        }

        public ContactButton(@k ActionType actionType, @k String str, @k String str2, @l DeepLink deepLink) {
            this.actionType = actionType;
            this.iconName = str;
            this.iconColor = str2;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ ContactButton copy$default(ContactButton contactButton, ActionType actionType, String str, String str2, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                actionType = contactButton.actionType;
            }
            if ((i12 & 2) != 0) {
                str = contactButton.iconName;
            }
            if ((i12 & 4) != 0) {
                str2 = contactButton.iconColor;
            }
            if ((i12 & 8) != 0) {
                deepLink = contactButton.deepLink;
            }
            return contactButton.copy(actionType, str, str2, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getIconName() {
            return this.iconName;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getIconColor() {
            return this.iconColor;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final ContactButton copy(@k ActionType actionType, @k String iconName, @k String iconColor, @l DeepLink deepLink) {
            return new ContactButton(actionType, iconName, iconColor, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactButton)) {
                return false;
            }
            ContactButton contactButton = (ContactButton) other;
            return this.actionType == contactButton.actionType && L.f(this.iconName, contactButton.iconName) && L.f(this.iconColor, contactButton.iconColor) && L.f(this.deepLink, contactButton.deepLink);
        }

        @k
        public final ActionType getActionType() {
            return this.actionType;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getIconColor() {
            return this.iconColor;
        }

        @k
        public final String getIconName() {
            return this.iconName;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(this.actionType.hashCode() * 31, 31, this.iconName), 31, this.iconColor);
            DeepLink deepLink = this.deepLink;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ContactButton(actionType=");
            sb2.append(this.actionType);
            sb2.append(", iconName=");
            sb2.append(this.iconName);
            sb2.append(", iconColor=");
            sb2.append(this.iconColor);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.actionType.name());
            parcel.writeString(this.iconName);
            parcel.writeString(this.iconColor);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoGalleryContactBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoGalleryContactBar createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Image image = (Image) parcel.readParcelable(PhotoGalleryContactBar.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ContactButton.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PhotoGalleryContactBar(string, image, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhotoGalleryContactBar[] newArray(int i12) {
            return new PhotoGalleryContactBar[i12];
        }
    }

    public PhotoGalleryContactBar(@k String str, @l Image image, @k List<ContactButton> list, @l String str2, @l String str3, @l String str4) {
        this.name = str;
        this.avatar = image;
        this.actions = list;
        this.title = str2;
        this.price = str3;
        this.userHash = str4;
    }

    public static /* synthetic */ PhotoGalleryContactBar copy$default(PhotoGalleryContactBar photoGalleryContactBar, String str, Image image, List list, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = photoGalleryContactBar.name;
        }
        if ((i12 & 2) != 0) {
            image = photoGalleryContactBar.avatar;
        }
        Image image2 = image;
        if ((i12 & 4) != 0) {
            list = photoGalleryContactBar.actions;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            str2 = photoGalleryContactBar.title;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = photoGalleryContactBar.price;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = photoGalleryContactBar.userHash;
        }
        return photoGalleryContactBar.copy(str, image2, list2, str5, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    public final List<ContactButton> component3() {
        return this.actions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getUserHash() {
        return this.userHash;
    }

    @k
    public final PhotoGalleryContactBar copy(@k String name, @l Image avatar, @k List<ContactButton> actions, @l String title, @l String price, @l String userHash) {
        return new PhotoGalleryContactBar(name, avatar, actions, title, price, userHash);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoGalleryContactBar)) {
            return false;
        }
        PhotoGalleryContactBar photoGalleryContactBar = (PhotoGalleryContactBar) other;
        return L.f(this.name, photoGalleryContactBar.name) && L.f(this.avatar, photoGalleryContactBar.avatar) && L.f(this.actions, photoGalleryContactBar.actions) && L.f(this.title, photoGalleryContactBar.title) && L.f(this.price, photoGalleryContactBar.price) && L.f(this.userHash, photoGalleryContactBar.userHash);
    }

    @k
    public final List<ContactButton> getActions() {
        return this.actions;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getUserHash() {
        return this.userHash;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Image image = this.avatar;
        int iE2 = H.e((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.actions);
        String str = this.title;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userHash;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhotoGalleryContactBar(name=");
        sb2.append(this.name);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", userHash=");
        return C22026a.c(sb2, this.userHash, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.avatar, flags);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            ((ContactButton) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeString(this.userHash);
    }
}
