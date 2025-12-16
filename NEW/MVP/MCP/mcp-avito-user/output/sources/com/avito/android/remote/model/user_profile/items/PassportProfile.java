package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PassportItem.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b%\u0010\u001a¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PassportProfile;", "Landroid/os/Parcelable;", "", "profileId", "", "isCurrent", "profileName", "profileTitle", "Lcom/avito/android/remote/model/user_profile/items/PassportAvatar;", "avatar", "Lcom/avito/android/remote/model/user_profile/items/ProfileStatus;", "profileStatus", "description", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_profile/items/PassportAvatar;Lcom/avito/android/remote/model/user_profile/items/ProfileStatus;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getProfileId", "()Ljava/lang/String;", "Z", "()Z", "getProfileName", "getProfileTitle", "Lcom/avito/android/remote/model/user_profile/items/PassportAvatar;", "getAvatar", "()Lcom/avito/android/remote/model/user_profile/items/PassportAvatar;", "Lcom/avito/android/remote/model/user_profile/items/ProfileStatus;", "getProfileStatus", "()Lcom/avito/android/remote/model/user_profile/items/ProfileStatus;", "getDescription", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PassportProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<PassportProfile> CREATOR = new Creator();

    @c("avatar")
    @l
    private final PassportAvatar avatar;

    @c("description")
    @l
    private final String description;

    @c("isCurrent")
    private final boolean isCurrent;

    @c("profileId")
    @k
    private final String profileId;

    @c("name")
    @k
    private final String profileName;

    @c("status")
    @l
    private final ProfileStatus profileStatus;

    @c("title")
    @k
    private final String profileTitle;

    /* compiled from: PassportItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PassportProfile createFromParcel(@k Parcel parcel) {
            return new PassportProfile(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PassportAvatar.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileStatus.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PassportProfile[] newArray(int i12) {
            return new PassportProfile[i12];
        }
    }

    public PassportProfile(@k String str, boolean z12, @k String str2, @k String str3, @l PassportAvatar passportAvatar, @l ProfileStatus profileStatus, @l String str4) {
        this.profileId = str;
        this.isCurrent = z12;
        this.profileName = str2;
        this.profileTitle = str3;
        this.avatar = passportAvatar;
        this.profileStatus = profileStatus;
        this.description = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final PassportAvatar getAvatar() {
        return this.avatar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getProfileId() {
        return this.profileId;
    }

    @k
    public final String getProfileName() {
        return this.profileName;
    }

    @l
    public final ProfileStatus getProfileStatus() {
        return this.profileStatus;
    }

    @k
    public final String getProfileTitle() {
        return this.profileTitle;
    }

    /* renamed from: isCurrent, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.profileId);
        parcel.writeInt(this.isCurrent ? 1 : 0);
        parcel.writeString(this.profileName);
        parcel.writeString(this.profileTitle);
        PassportAvatar passportAvatar = this.avatar;
        if (passportAvatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passportAvatar.writeToParcel(parcel, flags);
        }
        ProfileStatus profileStatus = this.profileStatus;
        if (profileStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(profileStatus.name());
        }
        parcel.writeString(this.description);
    }
}
