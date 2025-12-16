package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteSeller.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b\t\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b\r\u0010&R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b2\u0010&¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/FavoriteSeller;", "Lcom/avito/android/remote/model/FavoriteSellersResultItem;", "", "name", "description", "Lcom/avito/android/remote/model/Image;", "avatar", "userKey", "", "isShop", "Lcom/avito/android/remote/model/AvatarShape;", "avatarShape", "isDisabled", "isNotificationsActivated", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/SerpElement;", "items", "hasNewItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/AvatarShape;ZLjava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getUserKey", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/AvatarShape;", "getAvatarShape", "()Lcom/avito/android/remote/model/AvatarShape;", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getHasNewItems", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FavoriteSeller extends FavoriteSellersResultItem {

    @k
    public static final Parcelable.Creator<FavoriteSeller> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("avatarShape")
    @l
    private final AvatarShape avatarShape;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("description")
    @l
    private final String description;

    @c("hasNewItems")
    @l
    private final Boolean hasNewItems;

    @c("isDisabled")
    private final boolean isDisabled;

    @c("isNotificationsActivated")
    @l
    private final Boolean isNotificationsActivated;

    @c("isShop")
    @l
    private final Boolean isShop;

    @c("entries")
    @l
    private final List<SerpElement> items;

    @c("name")
    @l
    private final String name;

    @c("hashUserId")
    @k
    private final String userKey;

    /* compiled from: FavoriteSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteSeller> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteSeller createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(FavoriteSeller.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AvatarShape avatarShapeValueOf = parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FavoriteSeller.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(FavoriteSeller.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FavoriteSeller(string, string2, image, string3, boolValueOf, avatarShapeValueOf, z12, boolValueOf2, deepLink, arrayList, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteSeller[] newArray(int i12) {
            return new FavoriteSeller[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSeller(@l String str, @l String str2, @l Image image, @k String str3, @l Boolean bool, @l AvatarShape avatarShape, boolean z12, @l Boolean bool2, @k DeepLink deepLink, @l List<? extends SerpElement> list, @l Boolean bool3) {
        this.name = str;
        this.description = str2;
        this.avatar = image;
        this.userKey = str3;
        this.isShop = bool;
        this.avatarShape = avatarShape;
        this.isDisabled = z12;
        this.isNotificationsActivated = bool2;
        this.deepLink = deepLink;
        this.items = list;
        this.hasNewItems = bool3;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final AvatarShape getAvatarShape() {
        return this.avatarShape;
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Boolean getHasNewItems() {
        return this.hasNewItems;
    }

    @l
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @k
    public final String getUserKey() {
        return this.userKey;
    }

    /* renamed from: isDisabled, reason: from getter */
    public final boolean getIsDisabled() {
        return this.isDisabled;
    }

    @l
    /* renamed from: isNotificationsActivated, reason: from getter */
    public final Boolean getIsNotificationsActivated() {
        return this.isNotificationsActivated;
    }

    @l
    /* renamed from: isShop, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.userKey);
        Boolean bool = this.isShop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        AvatarShape avatarShape = this.avatarShape;
        if (avatarShape == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(avatarShape.name());
        }
        parcel.writeInt(this.isDisabled ? 1 : 0);
        Boolean bool2 = this.isNotificationsActivated;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.deepLink, flags);
        List<SerpElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool3 = this.hasNewItems;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }
}
