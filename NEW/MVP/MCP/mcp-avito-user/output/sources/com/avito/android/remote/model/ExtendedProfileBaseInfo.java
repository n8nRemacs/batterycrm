package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileBaseInfo.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b\u000e\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b1\u0010\u001e¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileBaseInfo;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "", "widgetName", "description", "Lcom/avito/android/remote/model/ProfileRating;", "rating", "Lcom/avito/android/remote/model/SubscribeInfo;", "subscribeInfo", "Lcom/avito/android/remote/model/AvatarShape;", "avatarShape", "Lcom/avito/android/remote/model/Image;", "avatar", "", "isRedesign", "redesignType", "companyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/ProfileRating;Lcom/avito/android/remote/model/SubscribeInfo;Lcom/avito/android/remote/model/AvatarShape;Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getWidgetName", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/ProfileRating;", "getRating", "()Lcom/avito/android/remote/model/ProfileRating;", "setRating", "(Lcom/avito/android/remote/model/ProfileRating;)V", "Lcom/avito/android/remote/model/SubscribeInfo;", "getSubscribeInfo", "()Lcom/avito/android/remote/model/SubscribeInfo;", "Lcom/avito/android/remote/model/AvatarShape;", "getAvatarShape", "()Lcom/avito/android/remote/model/AvatarShape;", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getRedesignType", "getCompanyName", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExtendedProfileBaseInfo implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileBaseInfo> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("avatarShape")
    @l
    private final AvatarShape avatarShape;

    @c("companyName")
    @l
    private final String companyName;

    @c("description")
    @l
    private final String description;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("rating")
    @l
    private ProfileRating rating;

    @c("redesignType")
    @l
    private final String redesignType;

    @c("subscribeInfo")
    @l
    private final SubscribeInfo subscribeInfo;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileBaseInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileBaseInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBaseInfo createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ProfileRating profileRating = (ProfileRating) parcel.readParcelable(ExtendedProfileBaseInfo.class.getClassLoader());
            SubscribeInfo subscribeInfo = (SubscribeInfo) parcel.readParcelable(ExtendedProfileBaseInfo.class.getClassLoader());
            AvatarShape avatarShapeValueOf = parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString());
            Image image = (Image) parcel.readParcelable(ExtendedProfileBaseInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExtendedProfileBaseInfo(string, string2, profileRating, subscribeInfo, avatarShapeValueOf, image, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileBaseInfo[] newArray(int i12) {
            return new ExtendedProfileBaseInfo[i12];
        }
    }

    public ExtendedProfileBaseInfo(@l String str, @l String str2, @l ProfileRating profileRating, @l SubscribeInfo subscribeInfo, @l AvatarShape avatarShape, @l Image image, @l Boolean bool, @l String str3, @l String str4) {
        this.widgetName = str;
        this.description = str2;
        this.rating = profileRating;
        this.subscribeInfo = subscribeInfo;
        this.avatarShape = avatarShape;
        this.avatar = image;
        this.isRedesign = bool;
        this.redesignType = str3;
        this.companyName = str4;
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
    public final AvatarShape getAvatarShape() {
        return this.avatarShape;
    }

    @l
    public final String getCompanyName() {
        return this.companyName;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final ProfileRating getRating() {
        return this.rating;
    }

    @l
    public final String getRedesignType() {
        return this.redesignType;
    }

    @l
    public final SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    @l
    /* renamed from: isRedesign, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    public final void setRating(@l ProfileRating profileRating) {
        this.rating = profileRating;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.widgetName);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.rating, flags);
        parcel.writeParcelable(this.subscribeInfo, flags);
        AvatarShape avatarShape = this.avatarShape;
        if (avatarShape == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(avatarShape.name());
        }
        parcel.writeParcelable(this.avatar, flags);
        Boolean bool = this.isRedesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.redesignType);
        parcel.writeString(this.companyName);
    }
}
