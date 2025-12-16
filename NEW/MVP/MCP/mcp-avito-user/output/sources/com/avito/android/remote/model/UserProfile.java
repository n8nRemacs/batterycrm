package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: UserProfile.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/UserProfile;", "Landroid/os/Parcelable;", "", "name", "description", "hashUserId", "Lcom/avito/android/remote/model/Image;", "avatar", "Lcom/avito/android/remote/model/ProfileRating;", "rating", "Lcom/avito/android/remote/model/SubscribeInfo;", "subscribeInfo", "Lcom/avito/android/remote/model/SellerReplySpeed;", "replySpeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/ProfileRating;Lcom/avito/android/remote/model/SubscribeInfo;Lcom/avito/android/remote/model/SellerReplySpeed;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getDescription", "getHashUserId", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/ProfileRating;", "getRating", "()Lcom/avito/android/remote/model/ProfileRating;", "setRating", "(Lcom/avito/android/remote/model/ProfileRating;)V", "Lcom/avito/android/remote/model/SubscribeInfo;", "getSubscribeInfo", "()Lcom/avito/android/remote/model/SubscribeInfo;", "Lcom/avito/android/remote/model/SellerReplySpeed;", "getReplySpeed", "()Lcom/avito/android/remote/model/SellerReplySpeed;", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<UserProfile> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("description")
    @l
    private final String description;

    @c("hashUserId")
    @l
    private final String hashUserId;

    @c("name")
    @k
    private final String name;

    @c("rating")
    @l
    private ProfileRating rating;

    @c(ChannelContext.Item.REPLY_TIME)
    @l
    private final SellerReplySpeed replySpeed;

    @c("subscribeInfo")
    @l
    private final SubscribeInfo subscribeInfo;

    /* compiled from: UserProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserProfile createFromParcel(@k Parcel parcel) {
            return new UserProfile(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(UserProfile.class.getClassLoader()), (ProfileRating) parcel.readParcelable(UserProfile.class.getClassLoader()), (SubscribeInfo) parcel.readParcelable(UserProfile.class.getClassLoader()), (SellerReplySpeed) parcel.readParcelable(UserProfile.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserProfile[] newArray(int i12) {
            return new UserProfile[i12];
        }
    }

    public UserProfile(@k String str, @l String str2, @l String str3, @l Image image, @l ProfileRating profileRating, @l SubscribeInfo subscribeInfo, @l SellerReplySpeed sellerReplySpeed) {
        this.name = str;
        this.description = str2;
        this.hashUserId = str3;
        this.avatar = image;
        this.rating = profileRating;
        this.subscribeInfo = subscribeInfo;
        this.replySpeed = sellerReplySpeed;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getHashUserId() {
        return this.hashUserId;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final ProfileRating getRating() {
        return this.rating;
    }

    @l
    public final SellerReplySpeed getReplySpeed() {
        return this.replySpeed;
    }

    @l
    public final SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    public final void setRating(@l ProfileRating profileRating) {
        this.rating = profileRating;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.hashUserId);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeParcelable(this.rating, flags);
        parcel.writeParcelable(this.subscribeInfo, flags);
        parcel.writeParcelable(this.replySpeed, flags);
    }
}
