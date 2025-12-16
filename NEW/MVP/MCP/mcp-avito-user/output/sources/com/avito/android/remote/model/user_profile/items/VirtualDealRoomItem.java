package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VirtualDealRoomItem.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/VirtualDealRoomItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "subtitle", "Lcom/avito/android/remote/model/DeeplinkAction;", "action", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/DeeplinkAction;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/VirtualDealRoomItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/DeeplinkAction;", "getAction", "getBadge", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VirtualDealRoomItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<VirtualDealRoomItem> CREATOR = new Creator();

    @c("action")
    @k
    private final DeeplinkAction action;

    @c("badge")
    @l
    private final String badge;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: VirtualDealRoomItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VirtualDealRoomItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VirtualDealRoomItem createFromParcel(@k Parcel parcel) {
            return new VirtualDealRoomItem(parcel.readString(), parcel.readString(), (DeeplinkAction) parcel.readParcelable(VirtualDealRoomItem.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VirtualDealRoomItem[] newArray(int i12) {
            return new VirtualDealRoomItem[i12];
        }
    }

    public VirtualDealRoomItem(@k String str, @k String str2, @k DeeplinkAction deeplinkAction, @l String str3) {
        this.title = str;
        this.subtitle = str2;
        this.action = deeplinkAction;
        this.badge = str3;
    }

    public static /* synthetic */ VirtualDealRoomItem copy$default(VirtualDealRoomItem virtualDealRoomItem, String str, String str2, DeeplinkAction deeplinkAction, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = virtualDealRoomItem.title;
        }
        if ((i12 & 2) != 0) {
            str2 = virtualDealRoomItem.subtitle;
        }
        if ((i12 & 4) != 0) {
            deeplinkAction = virtualDealRoomItem.action;
        }
        if ((i12 & 8) != 0) {
            str3 = virtualDealRoomItem.badge;
        }
        return virtualDealRoomItem.copy(str, str2, deeplinkAction, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final VirtualDealRoomItem copy(@k String title, @k String subtitle, @k DeeplinkAction action, @l String badge) {
        return new VirtualDealRoomItem(title, subtitle, action, badge);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VirtualDealRoomItem)) {
            return false;
        }
        VirtualDealRoomItem virtualDealRoomItem = (VirtualDealRoomItem) other;
        return L.f(this.title, virtualDealRoomItem.title) && L.f(this.subtitle, virtualDealRoomItem.subtitle) && L.f(this.action, virtualDealRoomItem.action) && L.f(this.badge, virtualDealRoomItem.badge);
    }

    @k
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31;
        String str = this.badge;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VirtualDealRoomItem(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", badge=");
        return C22026a.c(sb2, this.badge, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.badge);
    }
}
