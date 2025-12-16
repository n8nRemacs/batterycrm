package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Address;
import com.avito.android.remote.model.Avatar;
import com.avito.android.remote.model.DeliveryRestrictionBanner;
import com.avito.android.remote.model.ProfileRating;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.user_profile.ReputationAndRating;
import com.avito.android.remote.model.user_profile.Support;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: InfoItem.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b-\u0010$R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b\f\u0010/R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b0\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b5\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/InfoItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "id", "Lcom/avito/android/remote/model/Avatar;", "avatar", "name", "email", "Lcom/avito/android/remote/model/Address;", AddressParameter.TYPE, "registered", "", "isIncomplete", "type", "manager", "Lcom/avito/android/remote/model/user_profile/Support;", AttachMenuItem.Support.KEY, "shopSite", "Lcom/avito/android/remote/model/ProfileRating;", "rating", "Lcom/avito/android/remote/model/user_profile/ReputationAndRating;", "reputationAndRating", "Lcom/avito/android/remote/model/DeliveryRestrictionBanner;", "deliveryRestrictionBanner", "", "countPhones", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Avatar;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Address;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/Support;Ljava/lang/String;Lcom/avito/android/remote/model/ProfileRating;Lcom/avito/android/remote/model/user_profile/ReputationAndRating;Lcom/avito/android/remote/model/DeliveryRestrictionBanner;I)V", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Avatar;", "getAvatar", "()Lcom/avito/android/remote/model/Avatar;", "getName", "getEmail", "Lcom/avito/android/remote/model/Address;", "getAddress", "()Lcom/avito/android/remote/model/Address;", "getRegistered", "Z", "()Z", "getType", "getManager", "Lcom/avito/android/remote/model/user_profile/Support;", "getSupport", "()Lcom/avito/android/remote/model/user_profile/Support;", "getShopSite", "Lcom/avito/android/remote/model/ProfileRating;", "getRating", "()Lcom/avito/android/remote/model/ProfileRating;", "Lcom/avito/android/remote/model/user_profile/ReputationAndRating;", "getReputationAndRating", "()Lcom/avito/android/remote/model/user_profile/ReputationAndRating;", "Lcom/avito/android/remote/model/DeliveryRestrictionBanner;", "getDeliveryRestrictionBanner", "()Lcom/avito/android/remote/model/DeliveryRestrictionBanner;", "I", "getCountPhones", "()I", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InfoItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<InfoItem> CREATOR = new Creator();

    @c(AddressParameter.TYPE)
    @l
    private final Address address;

    @c("avatar")
    @l
    private final Avatar avatar;

    @c("countPhones")
    private final int countPhones;

    @c("deliveryRestrictionBanner")
    @l
    private final DeliveryRestrictionBanner deliveryRestrictionBanner;

    @c("email")
    @l
    private final String email;

    @c("id")
    @k
    private final String id;

    @c("isIncomplete")
    private final boolean isIncomplete;

    @c("manager")
    @l
    private final String manager;

    @c("name")
    @k
    private final String name;

    @c("rating")
    @l
    private final ProfileRating rating;

    @c("registered")
    @k
    private final String registered;

    @c("reputationAndRating")
    @l
    private final ReputationAndRating reputationAndRating;

    @c("shopSite")
    @l
    private final String shopSite;

    @c(AttachMenuItem.Support.KEY)
    @l
    private final Support support;

    @c("type")
    @k
    private final String type;

    /* compiled from: InfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoItem createFromParcel(@k Parcel parcel) {
            return new InfoItem(parcel.readString(), (Avatar) parcel.readParcelable(InfoItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(InfoItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (Support) parcel.readParcelable(InfoItem.class.getClassLoader()), parcel.readString(), (ProfileRating) parcel.readParcelable(InfoItem.class.getClassLoader()), parcel.readInt() == 0 ? null : ReputationAndRating.CREATOR.createFromParcel(parcel), (DeliveryRestrictionBanner) parcel.readParcelable(InfoItem.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoItem[] newArray(int i12) {
            return new InfoItem[i12];
        }
    }

    public InfoItem(@k String str, @l Avatar avatar, @k String str2, @l String str3, @l Address address, @k String str4, boolean z12, @k String str5, @l String str6, @l Support support, @l String str7, @l ProfileRating profileRating, @l ReputationAndRating reputationAndRating, @l DeliveryRestrictionBanner deliveryRestrictionBanner, int i12) {
        this.id = str;
        this.avatar = avatar;
        this.name = str2;
        this.email = str3;
        this.address = address;
        this.registered = str4;
        this.isIncomplete = z12;
        this.type = str5;
        this.manager = str6;
        this.support = support;
        this.shopSite = str7;
        this.rating = profileRating;
        this.reputationAndRating = reputationAndRating;
        this.deliveryRestrictionBanner = deliveryRestrictionBanner;
        this.countPhones = i12;
    }

    @l
    public final Address getAddress() {
        return this.address;
    }

    @l
    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final int getCountPhones() {
        return this.countPhones;
    }

    @l
    public final DeliveryRestrictionBanner getDeliveryRestrictionBanner() {
        return this.deliveryRestrictionBanner;
    }

    @l
    public final String getEmail() {
        return this.email;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getManager() {
        return this.manager;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final ProfileRating getRating() {
        return this.rating;
    }

    @k
    public final String getRegistered() {
        return this.registered;
    }

    @l
    public final ReputationAndRating getReputationAndRating() {
        return this.reputationAndRating;
    }

    @l
    public final String getShopSite() {
        return this.shopSite;
    }

    @l
    public final Support getSupport() {
        return this.support;
    }

    @k
    public final String getType() {
        return this.type;
    }

    /* renamed from: isIncomplete, reason: from getter */
    public final boolean getIsIncomplete() {
        return this.isIncomplete;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeParcelable(this.address, flags);
        parcel.writeString(this.registered);
        parcel.writeInt(this.isIncomplete ? 1 : 0);
        parcel.writeString(this.type);
        parcel.writeString(this.manager);
        parcel.writeParcelable(this.support, flags);
        parcel.writeString(this.shopSite);
        parcel.writeParcelable(this.rating, flags);
        ReputationAndRating reputationAndRating = this.reputationAndRating;
        if (reputationAndRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reputationAndRating.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.deliveryRestrictionBanner, flags);
        parcel.writeInt(this.countPhones);
    }
}
