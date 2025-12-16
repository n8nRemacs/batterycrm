package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyAddressItem.kt */
@d
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJp\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b<\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010\u001f¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/EmptyAddressItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "geosessionId", "badge", "title", "Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "icon", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;", "suggestedAddress", "profileAddress", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressIcon;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressAction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "component5", "component6", "()Lcom/avito/android/remote/model/UniversalImage;", "component7", "()Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;", "component8", "component9", "()Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressIcon;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressAction;)Lcom/avito/android/remote/model/user_profile/items/EmptyAddressItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGeosessionId", "getBadge", "getTitle", "Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "getIcon", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/user_profile/items/SuggestedAddress;", "getSuggestedAddress", "getProfileAddress", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "getAction", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EmptyAddressItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<EmptyAddressItem> CREATOR = new Creator();

    @c("action")
    @k
    private final AddressAction action;

    @c("badge")
    @l
    private final String badge;

    @c("description")
    @k
    private final String description;

    @c("geosessionId")
    @k
    private final String geosessionId;

    @c("icon")
    @k
    private final AddressIcon icon;

    @c("image")
    @k
    private final UniversalImage image;

    @c("profileAddress")
    @l
    private final String profileAddress;

    @c("suggestedAddress")
    @l
    private final SuggestedAddress suggestedAddress;

    @c("title")
    @k
    private final String title;

    /* compiled from: EmptyAddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmptyAddressItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmptyAddressItem createFromParcel(@k Parcel parcel) {
            return new EmptyAddressItem(parcel.readString(), parcel.readString(), parcel.readString(), AddressIcon.CREATOR.createFromParcel(parcel), parcel.readString(), (UniversalImage) parcel.readParcelable(EmptyAddressItem.class.getClassLoader()), parcel.readInt() == 0 ? null : SuggestedAddress.CREATOR.createFromParcel(parcel), parcel.readString(), AddressAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmptyAddressItem[] newArray(int i12) {
            return new EmptyAddressItem[i12];
        }
    }

    public EmptyAddressItem(@k String str, @l String str2, @k String str3, @k AddressIcon addressIcon, @k String str4, @k UniversalImage universalImage, @l SuggestedAddress suggestedAddress, @l String str5, @k AddressAction addressAction) {
        this.geosessionId = str;
        this.badge = str2;
        this.title = str3;
        this.icon = addressIcon;
        this.description = str4;
        this.image = universalImage;
        this.suggestedAddress = suggestedAddress;
        this.profileAddress = str5;
        this.action = addressAction;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getGeosessionId() {
        return this.geosessionId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AddressIcon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final SuggestedAddress getSuggestedAddress() {
        return this.suggestedAddress;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getProfileAddress() {
        return this.profileAddress;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final AddressAction getAction() {
        return this.action;
    }

    @k
    public final EmptyAddressItem copy(@k String geosessionId, @l String badge, @k String title, @k AddressIcon icon, @k String description, @k UniversalImage image, @l SuggestedAddress suggestedAddress, @l String profileAddress, @k AddressAction action) {
        return new EmptyAddressItem(geosessionId, badge, title, icon, description, image, suggestedAddress, profileAddress, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyAddressItem)) {
            return false;
        }
        EmptyAddressItem emptyAddressItem = (EmptyAddressItem) other;
        return L.f(this.geosessionId, emptyAddressItem.geosessionId) && L.f(this.badge, emptyAddressItem.badge) && L.f(this.title, emptyAddressItem.title) && L.f(this.icon, emptyAddressItem.icon) && L.f(this.description, emptyAddressItem.description) && L.f(this.image, emptyAddressItem.image) && L.f(this.suggestedAddress, emptyAddressItem.suggestedAddress) && L.f(this.profileAddress, emptyAddressItem.profileAddress) && L.f(this.action, emptyAddressItem.action);
    }

    @k
    public final AddressAction getAction() {
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

    @k
    public final String getGeosessionId() {
        return this.geosessionId;
    }

    @k
    public final AddressIcon getIcon() {
        return this.icon;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getProfileAddress() {
        return this.profileAddress;
    }

    @l
    public final SuggestedAddress getSuggestedAddress() {
        return this.suggestedAddress;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.geosessionId.hashCode() * 31;
        String str = this.badge;
        int iA2 = a.a(H.d((this.icon.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title)) * 31, 31, this.description), 31, this.image);
        SuggestedAddress suggestedAddress = this.suggestedAddress;
        int iHashCode2 = (iA2 + (suggestedAddress == null ? 0 : suggestedAddress.hashCode())) * 31;
        String str2 = this.profileAddress;
        return this.action.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "EmptyAddressItem(geosessionId=" + this.geosessionId + ", badge=" + this.badge + ", title=" + this.title + ", icon=" + this.icon + ", description=" + this.description + ", image=" + this.image + ", suggestedAddress=" + this.suggestedAddress + ", profileAddress=" + this.profileAddress + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.geosessionId);
        parcel.writeString(this.badge);
        parcel.writeString(this.title);
        this.icon.writeToParcel(parcel, flags);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, flags);
        SuggestedAddress suggestedAddress = this.suggestedAddress;
        if (suggestedAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestedAddress.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.profileAddress);
        this.action.writeToParcel(parcel, flags);
    }
}
