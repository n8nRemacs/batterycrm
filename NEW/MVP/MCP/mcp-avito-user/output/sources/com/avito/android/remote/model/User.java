package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.PublicProfile;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: User.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/User;", "Landroid/os/Parcelable;", "", "id", "name", "", "lastActionTime", "timeDiff", "Lcom/avito/android/remote/model/messenger/PublicProfile;", "publicProfile", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/PublicProfile;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "()Lcom/avito/android/remote/model/messenger/PublicProfile;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/remote/model/messenger/PublicProfile;Ljava/lang/String;)Lcom/avito/android/remote/model/User;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Long;", "getLastActionTime", "getTimeDiff", "Lcom/avito/android/remote/model/messenger/PublicProfile;", "getPublicProfile", "getLabel", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class User implements Parcelable {

    @k
    public static final Parcelable.Creator<User> CREATOR = new Creator();

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

    /* compiled from: User.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final User createFromParcel(@k Parcel parcel) {
            return new User(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? PublicProfile.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final User[] newArray(int i12) {
            return new User[i12];
        }
    }

    public User(@k String str, @l String str2, @l Long l12, @l Long l13, @l PublicProfile publicProfile, @l String str3) {
        this.id = str;
        this.name = str2;
        this.lastActionTime = l12;
        this.timeDiff = l13;
        this.publicProfile = publicProfile;
        this.label = str3;
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, Long l12, Long l13, PublicProfile publicProfile, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = user.id;
        }
        if ((i12 & 2) != 0) {
            str2 = user.name;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            l12 = user.lastActionTime;
        }
        Long l14 = l12;
        if ((i12 & 8) != 0) {
            l13 = user.timeDiff;
        }
        Long l15 = l13;
        if ((i12 & 16) != 0) {
            publicProfile = user.publicProfile;
        }
        PublicProfile publicProfile2 = publicProfile;
        if ((i12 & 32) != 0) {
            str3 = user.label;
        }
        return user.copy(str, str4, l14, l15, publicProfile2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Long getLastActionTime() {
        return this.lastActionTime;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Long getTimeDiff() {
        return this.timeDiff;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final PublicProfile getPublicProfile() {
        return this.publicProfile;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    public final User copy(@k String id2, @l String name, @l Long lastActionTime, @l Long timeDiff, @l PublicProfile publicProfile, @l String label) {
        return new User(id2, name, lastActionTime, timeDiff, publicProfile, label);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return L.f(this.id, user.id) && L.f(this.name, user.name) && L.f(this.lastActionTime, user.lastActionTime) && L.f(this.timeDiff, user.timeDiff) && L.f(this.publicProfile, user.publicProfile) && L.f(this.label, user.label);
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
        Long l13 = this.timeDiff;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        PublicProfile publicProfile = this.publicProfile;
        int iHashCode5 = (iHashCode4 + (publicProfile == null ? 0 : publicProfile.hashCode())) * 31;
        String str2 = this.label;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("User(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", lastActionTime=");
        sb2.append(this.lastActionTime);
        sb2.append(", timeDiff=");
        sb2.append(this.timeDiff);
        sb2.append(", publicProfile=");
        sb2.append(this.publicProfile);
        sb2.append(", label=");
        return C22026a.c(sb2, this.label, ')');
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
        Long l13 = this.timeDiff;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        PublicProfile publicProfile = this.publicProfile;
        if (publicProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicProfile.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.label);
    }

    public /* synthetic */ User(String str, String str2, Long l12, Long l13, PublicProfile publicProfile, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? null : l13, (i12 & 16) != 0 ? null : publicProfile, (i12 & 32) != 0 ? null : str3);
    }
}
