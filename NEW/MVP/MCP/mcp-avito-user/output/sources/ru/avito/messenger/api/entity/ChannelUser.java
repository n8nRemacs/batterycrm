package ru.avito.messenger.api.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelUser.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b(\u0010\u000e¨\u0006)"}, d2 = {"Lru/avito/messenger/api/entity/ChannelUser;", "Landroid/os/Parcelable;", "", "id", "name", "", "lastActionTime", "Lru/avito/messenger/api/entity/PublicProfile;", "publicProfile", "timeDiff", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/avito/messenger/api/entity/PublicProfile;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Long;", "getLastActionTime", "()Ljava/lang/Long;", "Lru/avito/messenger/api/entity/PublicProfile;", "getPublicProfile", "()Lru/avito/messenger/api/entity/PublicProfile;", "getTimeDiff", "getLabel", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChannelUser implements Parcelable {

    @k
    public static final Parcelable.Creator<ChannelUser> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("label")
    @l
    private final String label;

    @c("lastActionTime")
    @l
    private final Long lastActionTime;

    @c("name")
    @l
    private final String name;

    @c("publicUserProfile")
    @l
    private final PublicProfile publicProfile;

    @c("timeDiff")
    @l
    private final Long timeDiff;

    /* compiled from: ChannelUser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChannelUser> {
        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelUser createFromParcel(@k Parcel parcel) {
            return new ChannelUser(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : PublicProfile.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelUser[] newArray(int i12) {
            return new ChannelUser[i12];
        }
    }

    public ChannelUser(@k String str, @l String str2, @l Long l12, @l PublicProfile publicProfile, @l Long l13, @l String str3) {
        this.id = str;
        this.name = str2;
        this.lastActionTime = l12;
        this.publicProfile = publicProfile;
        this.timeDiff = l13;
        this.label = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUser)) {
            return false;
        }
        ChannelUser channelUser = (ChannelUser) other;
        return L.f(this.id, channelUser.id) && L.f(this.name, channelUser.name) && L.f(this.lastActionTime, channelUser.lastActionTime) && L.f(this.publicProfile, channelUser.publicProfile) && L.f(this.timeDiff, channelUser.timeDiff) && L.f(this.label, channelUser.label);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    @l
    public final Long getLastActionTime() {
        return this.lastActionTime;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final PublicProfile getPublicProfile() {
        return this.publicProfile;
    }

    @l
    public final Long getTimeDiff() {
        return this.timeDiff;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.lastActionTime;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        PublicProfile publicProfile = this.publicProfile;
        int iHashCode4 = (iHashCode3 + (publicProfile == null ? 0 : publicProfile.hashCode())) * 31;
        Long l13 = this.timeDiff;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str2 = this.label;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelUser { id = ");
        sb2.append(this.id);
        sb2.append(", name = ");
        sb2.append(this.name);
        sb2.append(", timeDiff = ");
        sb2.append(this.timeDiff);
        sb2.append(", label = ");
        return AK.c.s(sb2, this.label, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        Long l12 = this.lastActionTime;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        PublicProfile publicProfile = this.publicProfile;
        if (publicProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicProfile.writeToParcel(parcel, flags);
        }
        Long l13 = this.timeDiff;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.label);
    }

    public /* synthetic */ ChannelUser(String str, String str2, Long l12, PublicProfile publicProfile, Long l13, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : publicProfile, (i12 & 16) != 0 ? null : l13, (i12 & 32) != 0 ? null : str3);
    }
}
