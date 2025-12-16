package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileShort.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/ProfileShort;", "Landroid/os/Parcelable;", "", ChannelContext.Item.USER_ID, "email", "name", "Lcom/avito/android/remote/model/Image;", "avatar", "userHashId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)Lcom/avito/android/remote/model/ProfileShort;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getEmail", "getName", "Lcom/avito/android/remote/model/Image;", "getAvatar", "getUserHashId", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProfileShort implements Parcelable {

    @k
    public static final Parcelable.Creator<ProfileShort> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("email")
    @l
    private final String email;

    @c("name")
    @l
    private final String name;

    @c("hashUserId")
    @l
    private final String userHashId;

    @c(ChannelContext.Item.USER_ID)
    @l
    private final String userId;

    /* compiled from: ProfileShort.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProfileShort> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfileShort createFromParcel(@k Parcel parcel) {
            return new ProfileShort(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ProfileShort.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ProfileShort[] newArray(int i12) {
            return new ProfileShort[i12];
        }
    }

    public ProfileShort() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ProfileShort copy$default(ProfileShort profileShort, String str, String str2, String str3, Image image, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = profileShort.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = profileShort.email;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = profileShort.name;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            image = profileShort.avatar;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            str4 = profileShort.userHashId;
        }
        return profileShort.copy(str, str5, str6, image2, str4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getUserHashId() {
        return this.userHashId;
    }

    @k
    public final ProfileShort copy(@l String userId, @l String email, @l String name, @l Image avatar, @l String userHashId) {
        return new ProfileShort(userId, email, name, avatar, userHashId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileShort)) {
            return false;
        }
        ProfileShort profileShort = (ProfileShort) other;
        return L.f(this.userId, profileShort.userId) && L.f(this.email, profileShort.email) && L.f(this.name, profileShort.name) && L.f(this.avatar, profileShort.avatar) && L.f(this.userHashId, profileShort.userHashId);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getEmail() {
        return this.email;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.avatar;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        String str4 = this.userHashId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileShort(userId=");
        sb2.append(this.userId);
        sb2.append(", email=");
        sb2.append(this.email);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", userHashId=");
        return C22026a.c(sb2, this.userHashId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.userId);
        parcel.writeString(this.email);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.userHashId);
    }

    public ProfileShort(@l String str, @l String str2, @l String str3, @l Image image, @l String str4) {
        this.userId = str;
        this.email = str2;
        this.name = str3;
        this.avatar = image;
        this.userHashId = str4;
    }

    public /* synthetic */ ProfileShort(String str, String str2, String str3, Image image, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : image, (i12 & 16) != 0 ? null : str4);
    }
}
