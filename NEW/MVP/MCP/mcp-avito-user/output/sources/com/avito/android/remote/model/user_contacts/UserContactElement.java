package com.avito.android.remote.model.user_contacts;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: UserContactResultElement.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/user_contacts/UserContactElement;", "Lcom/avito/android/remote/model/user_contacts/UserContactResultElement;", "Lcom/avito/android/remote/model/user_contacts/UserContactElement$User;", ChannelContext.UserToUser.TYPE, "Lcom/avito/android/remote/model/user_contacts/UserContactElement$Item;", "item", "", "contact", "Lcom/avito/android/remote/model/Action;", "action", "Lcom/avito/android/deep_linking/links/DeepLink;", "itemInfoAction", "<init>", "(Lcom/avito/android/remote/model/user_contacts/UserContactElement$User;Lcom/avito/android/remote/model/user_contacts/UserContactElement$Item;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/user_contacts/UserContactElement$User;", "getUser", "()Lcom/avito/android/remote/model/user_contacts/UserContactElement$User;", "Lcom/avito/android/remote/model/user_contacts/UserContactElement$Item;", "getItem", "()Lcom/avito/android/remote/model/user_contacts/UserContactElement$Item;", "Ljava/lang/String;", "getContact", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getItemInfoAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Item", "User", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserContactElement extends UserContactResultElement {

    @k
    public static final Parcelable.Creator<UserContactElement> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("contact")
    @l
    private final String contact;

    @c("item")
    @k
    private final Item item;

    @c("itemInfoAction")
    @l
    private final DeepLink itemInfoAction;

    @c(ChannelContext.UserToUser.TYPE)
    @k
    private final User user;

    /* compiled from: UserContactResultElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserContactElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserContactElement createFromParcel(@k Parcel parcel) {
            return new UserContactElement(User.CREATOR.createFromParcel(parcel), Item.CREATOR.createFromParcel(parcel), parcel.readString(), (Action) parcel.readParcelable(UserContactElement.class.getClassLoader()), (DeepLink) parcel.readParcelable(UserContactElement.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserContactElement[] newArray(int i12) {
            return new UserContactElement[i12];
        }
    }

    /* compiled from: UserContactResultElement.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/user_contacts/UserContactElement$Item;", "Landroid/os/Parcelable;", "", "title", "id", "Lcom/avito/android/remote/model/Image;", "image", "price", "Lcom/avito/android/remote/model/Action;", "action", "", "isAuto", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getPrice", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("id")
        @k
        private final String id;

        @c("image")
        @l
        private final Image image;

        @c("isAuto")
        @l
        private final Boolean isAuto;

        @c("price")
        @l
        private final String price;

        @c("title")
        @l
        private final String title;

        /* compiled from: UserContactResultElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Image image = (Image) parcel.readParcelable(Item.class.getClassLoader());
                String string3 = parcel.readString();
                Action action = (Action) parcel.readParcelable(Item.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Item(string, string2, image, string3, action, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@l String str, @k String str2, @l Image image, @l String str3, @l Action action, @l Boolean bool) {
            this.title = str;
            this.id = str2;
            this.image = image;
            this.price = str3;
            this.action = action;
            this.isAuto = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final Image getImage() {
            return this.image;
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
        /* renamed from: isAuto, reason: from getter */
        public final Boolean getIsAuto() {
            return this.isAuto;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.id);
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.price);
            parcel.writeParcelable(this.action, flags);
            Boolean bool = this.isAuto;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    /* compiled from: UserContactResultElement.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/user_contacts/UserContactElement$User;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "avatar", "", "name", "userKey", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getUserKey", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class User implements Parcelable {

        @k
        public static final Parcelable.Creator<User> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("avatar")
        @l
        private final Image avatar;

        @c("name")
        @l
        private final String name;

        @c("hashUserId")
        @k
        private final String userKey;

        /* compiled from: UserContactResultElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<User> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final User createFromParcel(@k Parcel parcel) {
                return new User((Image) parcel.readParcelable(User.class.getClassLoader()), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(User.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final User[] newArray(int i12) {
                return new User[i12];
            }
        }

        public User(@l Image image, @l String str, @k String str2, @l Action action) {
            this.avatar = image;
            this.name = str;
            this.userKey = str2;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @k
        public final String getUserKey() {
            return this.userKey;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.avatar, flags);
            parcel.writeString(this.name);
            parcel.writeString(this.userKey);
            parcel.writeParcelable(this.action, flags);
        }
    }

    public UserContactElement(@k User user, @k Item item, @l String str, @l Action action, @l DeepLink deepLink) {
        super(null);
        this.user = user;
        this.item = item;
        this.contact = str;
        this.action = action;
        this.itemInfoAction = deepLink;
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final String getContact() {
        return this.contact;
    }

    @k
    public final Item getItem() {
        return this.item;
    }

    @l
    public final DeepLink getItemInfoAction() {
        return this.itemInfoAction;
    }

    @k
    public final User getUser() {
        return this.user;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.user.writeToParcel(parcel, flags);
        this.item.writeToParcel(parcel, flags);
        parcel.writeString(this.contact);
        parcel.writeParcelable(this.action, flags);
        parcel.writeParcelable(this.itemInfoAction, flags);
    }
}
