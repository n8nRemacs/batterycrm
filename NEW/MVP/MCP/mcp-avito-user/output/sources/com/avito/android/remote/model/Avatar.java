package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Avatar.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/Avatar;", "Landroid/os/Parcelable;", "", "status", "description", "alert", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/AvatarShape;", "shape", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/AvatarShape;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Lcom/avito/android/remote/model/AvatarShape;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/AvatarShape;)Lcom/avito/android/remote/model/Avatar;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatus", "getDescription", "getAlert", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/AvatarShape;", "getShape", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Avatar implements Parcelable {

    @k
    public static final Parcelable.Creator<Avatar> CREATOR = new Creator();

    @c("alert")
    @l
    private final String alert;

    @c("description")
    @l
    private final String description;

    @c("image")
    @l
    private final Image image;

    @c("shape")
    @l
    private final AvatarShape shape;

    @c("status")
    @k
    private final String status;

    /* compiled from: Avatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Avatar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Avatar createFromParcel(@k Parcel parcel) {
            return new Avatar(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Avatar.class.getClassLoader()), parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Avatar[] newArray(int i12) {
            return new Avatar[i12];
        }
    }

    public Avatar(@k String str, @l String str2, @l String str3, @l Image image, @l AvatarShape avatarShape) {
        this.status = str;
        this.description = str2;
        this.alert = str3;
        this.image = image;
        this.shape = avatarShape;
    }

    public static /* synthetic */ Avatar copy$default(Avatar avatar, String str, String str2, String str3, Image image, AvatarShape avatarShape, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = avatar.status;
        }
        if ((i12 & 2) != 0) {
            str2 = avatar.description;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = avatar.alert;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            image = avatar.image;
        }
        Image image2 = image;
        if ((i12 & 16) != 0) {
            avatarShape = avatar.shape;
        }
        return avatar.copy(str, str4, str5, image2, avatarShape);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AvatarShape getShape() {
        return this.shape;
    }

    @k
    public final Avatar copy(@k String status, @l String description, @l String alert, @l Image image, @l AvatarShape shape) {
        return new Avatar(status, description, alert, image, shape);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) other;
        return L.f(this.status, avatar.status) && L.f(this.description, avatar.description) && L.f(this.alert, avatar.alert) && L.f(this.image, avatar.image) && this.shape == avatar.shape;
    }

    @l
    public final String getAlert() {
        return this.alert;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final AvatarShape getShape() {
        return this.shape;
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.alert;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.image;
        int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        AvatarShape avatarShape = this.shape;
        return iHashCode4 + (avatarShape != null ? avatarShape.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Avatar(status=" + this.status + ", description=" + this.description + ", alert=" + this.alert + ", image=" + this.image + ", shape=" + this.shape + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.status);
        parcel.writeString(this.description);
        parcel.writeString(this.alert);
        parcel.writeParcelable(this.image, flags);
        AvatarShape avatarShape = this.shape;
        if (avatarShape == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(avatarShape.name());
        }
    }
}
