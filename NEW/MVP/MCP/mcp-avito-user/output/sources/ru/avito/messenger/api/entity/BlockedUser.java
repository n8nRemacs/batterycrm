package ru.avito.messenger.api.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BlockedUser.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/avito/messenger/api/entity/BlockedUser;", "Landroid/os/Parcelable;", "Lru/avito/messenger/api/entity/ChannelUser;", ChannelContext.UserToUser.TYPE, "Lru/avito/messenger/api/entity/context/ChannelContext;", "context", "", "created", "<init>", "(Lru/avito/messenger/api/entity/ChannelUser;Lru/avito/messenger/api/entity/context/ChannelContext;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/avito/messenger/api/entity/ChannelUser;", "getUser", "()Lru/avito/messenger/api/entity/ChannelUser;", "Lru/avito/messenger/api/entity/context/ChannelContext;", "getContext", "()Lru/avito/messenger/api/entity/context/ChannelContext;", "J", "getCreated", "()J", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BlockedUser implements Parcelable {

    @k
    public static final Parcelable.Creator<BlockedUser> CREATOR = new Creator();

    @c("context")
    @k
    private final ru.avito.messenger.api.entity.context.ChannelContext context;

    @c("created")
    private final long created;

    @c(ChannelContext.UserToUser.TYPE)
    @k
    private final ChannelUser user;

    /* compiled from: BlockedUser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BlockedUser> {
        @Override // android.os.Parcelable.Creator
        @k
        public final BlockedUser createFromParcel(@k Parcel parcel) {
            return new BlockedUser(ChannelUser.CREATOR.createFromParcel(parcel), (ru.avito.messenger.api.entity.context.ChannelContext) parcel.readParcelable(BlockedUser.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @k
        public final BlockedUser[] newArray(int i12) {
            return new BlockedUser[i12];
        }
    }

    public BlockedUser(@k ChannelUser channelUser, @k ru.avito.messenger.api.entity.context.ChannelContext channelContext, long j12) {
        this.user = channelUser;
        this.context = channelContext;
        this.created = j12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedUser)) {
            return false;
        }
        BlockedUser blockedUser = (BlockedUser) other;
        return L.f(this.user, blockedUser.user) && L.f(this.context, blockedUser.context) && this.created == blockedUser.created;
    }

    @k
    public final ru.avito.messenger.api.entity.context.ChannelContext getContext() {
        return this.context;
    }

    public final long getCreated() {
        return this.created;
    }

    @k
    public final ChannelUser getUser() {
        return this.user;
    }

    public int hashCode() {
        return Long.hashCode(this.created) + ((this.context.hashCode() + (this.user.hashCode() * 31)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BlockedUser(user=");
        sb2.append(this.user);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", created=");
        return r.u(sb2, this.created, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.user.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.context, flags);
        parcel.writeLong(this.created);
    }
}
