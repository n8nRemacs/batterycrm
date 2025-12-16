package com.avito.android.passport.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsProfilesListResult.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "Landroid/os/Parcelable;", "", ChannelContext.Item.USER_ID, "title", "name", "Lcom/avito/android/passport/network/model/PassportListAvatar;", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/passport/network/model/PassportListAvatar;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getTitle", "getName", "Lcom/avito/android/passport/network/model/PassportListAvatar;", "c", "()Lcom/avito/android/passport/network/model/PassportListAvatar;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MergeAccountsProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<MergeAccountsProfile> CREATOR = new a();

    @c("avatar")
    @l
    private final PassportListAvatar avatar;

    @c("name")
    @k
    private final String name;

    @c("title")
    @k
    private final String title;

    @c(ChannelContext.Item.USER_ID)
    @k
    private final String userId;

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MergeAccountsProfile> {
        @Override // android.os.Parcelable.Creator
        public final MergeAccountsProfile createFromParcel(Parcel parcel) {
            return new MergeAccountsProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PassportListAvatar.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MergeAccountsProfile[] newArray(int i12) {
            return new MergeAccountsProfile[i12];
        }
    }

    public MergeAccountsProfile(@k String str, @k String str2, @k String str3, @l PassportListAvatar passportListAvatar) {
        this.userId = str;
        this.title = str2;
        this.name = str3;
        this.avatar = passportListAvatar;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final PassportListAvatar getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeAccountsProfile)) {
            return false;
        }
        MergeAccountsProfile mergeAccountsProfile = (MergeAccountsProfile) obj;
        return L.f(this.userId, mergeAccountsProfile.userId) && L.f(this.title, mergeAccountsProfile.title) && L.f(this.name, mergeAccountsProfile.name) && L.f(this.avatar, mergeAccountsProfile.avatar);
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.userId.hashCode() * 31, 31, this.title), 31, this.name);
        PassportListAvatar passportListAvatar = this.avatar;
        return iD2 + (passportListAvatar == null ? 0 : passportListAvatar.hashCode());
    }

    @k
    public final String toString() {
        return "MergeAccountsProfile(userId=" + this.userId + ", title=" + this.title + ", name=" + this.name + ", avatar=" + this.avatar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.userId);
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        PassportListAvatar passportListAvatar = this.avatar;
        if (passportListAvatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passportListAvatar.writeToParcel(parcel, i12);
        }
    }
}
