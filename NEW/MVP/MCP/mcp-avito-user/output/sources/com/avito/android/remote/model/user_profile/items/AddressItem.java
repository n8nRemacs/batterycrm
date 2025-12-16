package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressItem.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/AddressItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "geosessionId", "title", MessageBody.Location.KIND, "Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "icon", "Lcom/avito/android/remote/model/user_profile/items/AddressDescription;", "description", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressIcon;Lcom/avito/android/remote/model/user_profile/items/AddressDescription;Lcom/avito/android/remote/model/user_profile/items/AddressAction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "component5", "()Lcom/avito/android/remote/model/user_profile/items/AddressDescription;", "component6", "()Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/AddressIcon;Lcom/avito/android/remote/model/user_profile/items/AddressDescription;Lcom/avito/android/remote/model/user_profile/items/AddressAction;)Lcom/avito/android/remote/model/user_profile/items/AddressItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getGeosessionId", "getTitle", "getKind", "Lcom/avito/android/remote/model/user_profile/items/AddressIcon;", "getIcon", "Lcom/avito/android/remote/model/user_profile/items/AddressDescription;", "getDescription", "Lcom/avito/android/remote/model/user_profile/items/AddressAction;", "getAction", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AddressItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<AddressItem> CREATOR = new Creator();

    @c("action")
    @k
    private final AddressAction action;

    @c("description")
    @k
    private final AddressDescription description;

    @c("geosessionId")
    @k
    private final String geosessionId;

    @c("icon")
    @k
    private final AddressIcon icon;

    @c(MessageBody.Location.KIND)
    @l
    private final String kind;

    @c("title")
    @k
    private final String title;

    /* compiled from: AddressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressItem createFromParcel(@k Parcel parcel) {
            return new AddressItem(parcel.readString(), parcel.readString(), parcel.readString(), AddressIcon.CREATOR.createFromParcel(parcel), AddressDescription.CREATOR.createFromParcel(parcel), AddressAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressItem[] newArray(int i12) {
            return new AddressItem[i12];
        }
    }

    public AddressItem(@k String str, @k String str2, @l String str3, @k AddressIcon addressIcon, @k AddressDescription addressDescription, @k AddressAction addressAction) {
        this.geosessionId = str;
        this.title = str2;
        this.kind = str3;
        this.icon = addressIcon;
        this.description = addressDescription;
        this.action = addressAction;
    }

    public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, String str, String str2, String str3, AddressIcon addressIcon, AddressDescription addressDescription, AddressAction addressAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = addressItem.geosessionId;
        }
        if ((i12 & 2) != 0) {
            str2 = addressItem.title;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = addressItem.kind;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            addressIcon = addressItem.icon;
        }
        AddressIcon addressIcon2 = addressIcon;
        if ((i12 & 16) != 0) {
            addressDescription = addressItem.description;
        }
        AddressDescription addressDescription2 = addressDescription;
        if ((i12 & 32) != 0) {
            addressAction = addressItem.action;
        }
        return addressItem.copy(str, str4, str5, addressIcon2, addressDescription2, addressAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getGeosessionId() {
        return this.geosessionId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AddressIcon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final AddressDescription getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final AddressAction getAction() {
        return this.action;
    }

    @k
    public final AddressItem copy(@k String geosessionId, @k String title, @l String kind, @k AddressIcon icon, @k AddressDescription description, @k AddressAction action) {
        return new AddressItem(geosessionId, title, kind, icon, description, action);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) other;
        return L.f(this.geosessionId, addressItem.geosessionId) && L.f(this.title, addressItem.title) && L.f(this.kind, addressItem.kind) && L.f(this.icon, addressItem.icon) && L.f(this.description, addressItem.description) && L.f(this.action, addressItem.action);
    }

    @k
    public final AddressAction getAction() {
        return this.action;
    }

    @k
    public final AddressDescription getDescription() {
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

    @l
    public final String getKind() {
        return this.kind;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.geosessionId.hashCode() * 31, 31, this.title);
        String str = this.kind;
        return this.action.hashCode() + ((this.description.hashCode() + ((this.icon.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "AddressItem(geosessionId=" + this.geosessionId + ", title=" + this.title + ", kind=" + this.kind + ", icon=" + this.icon + ", description=" + this.description + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.geosessionId);
        parcel.writeString(this.title);
        parcel.writeString(this.kind);
        this.icon.writeToParcel(parcel, flags);
        this.description.writeToParcel(parcel, flags);
        this.action.writeToParcel(parcel, flags);
    }
}
