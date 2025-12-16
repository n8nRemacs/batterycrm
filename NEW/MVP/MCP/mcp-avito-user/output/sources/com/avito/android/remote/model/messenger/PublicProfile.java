package com.avito.android.remote.model.messenger;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublicProfile.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/messenger/PublicProfile;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/messenger/ChatAvatar;", "avatar", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Lcom/avito/android/remote/model/messenger/ChatAvatar;Lcom/avito/android/remote/model/Action;)V", "component1", "()Lcom/avito/android/remote/model/messenger/ChatAvatar;", "component2", "()Lcom/avito/android/remote/model/Action;", "copy", "(Lcom/avito/android/remote/model/messenger/ChatAvatar;Lcom/avito/android/remote/model/Action;)Lcom/avito/android/remote/model/messenger/PublicProfile;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/messenger/ChatAvatar;", "getAvatar", "Lcom/avito/android/remote/model/Action;", "getAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PublicProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<PublicProfile> CREATOR = new Creator();

    @l
    private final Action action;

    @l
    private final ChatAvatar avatar;

    /* compiled from: PublicProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PublicProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublicProfile createFromParcel(@k Parcel parcel) {
            return new PublicProfile(parcel.readInt() == 0 ? null : ChatAvatar.CREATOR.createFromParcel(parcel), (Action) parcel.readParcelable(PublicProfile.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublicProfile[] newArray(int i12) {
            return new PublicProfile[i12];
        }
    }

    public PublicProfile(@l ChatAvatar chatAvatar, @l Action action) {
        this.avatar = chatAvatar;
        this.action = action;
    }

    public static /* synthetic */ PublicProfile copy$default(PublicProfile publicProfile, ChatAvatar chatAvatar, Action action, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            chatAvatar = publicProfile.avatar;
        }
        if ((i12 & 2) != 0) {
            action = publicProfile.action;
        }
        return publicProfile.copy(chatAvatar, action);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ChatAvatar getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    public final PublicProfile copy(@l ChatAvatar avatar, @l Action action) {
        return new PublicProfile(avatar, action);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicProfile)) {
            return false;
        }
        PublicProfile publicProfile = (PublicProfile) other;
        return L.f(this.avatar, publicProfile.avatar) && L.f(this.action, publicProfile.action);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final ChatAvatar getAvatar() {
        return this.avatar;
    }

    public int hashCode() {
        ChatAvatar chatAvatar = this.avatar;
        int iHashCode = (chatAvatar == null ? 0 : chatAvatar.hashCode()) * 31;
        Action action = this.action;
        return iHashCode + (action != null ? action.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PublicProfile(avatar=" + this.avatar + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        ChatAvatar chatAvatar = this.avatar;
        if (chatAvatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chatAvatar.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.action, flags);
    }
}
