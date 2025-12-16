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

/* compiled from: SellerAvatar.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/SellerAvatar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AvatarShape;", "shape", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/AvatarShape;Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/AvatarShape;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Lcom/avito/android/remote/model/AvatarShape;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/SellerAvatar;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AvatarShape;", "getShape", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SellerAvatar implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerAvatar> CREATOR = new Creator();

    @c("images")
    @l
    private final Image image;

    @c("shape")
    @l
    private final AvatarShape shape;

    /* compiled from: SellerAvatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerAvatar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerAvatar createFromParcel(@k Parcel parcel) {
            return new SellerAvatar(parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString()), (Image) parcel.readParcelable(SellerAvatar.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerAvatar[] newArray(int i12) {
            return new SellerAvatar[i12];
        }
    }

    public SellerAvatar(@l AvatarShape avatarShape, @l Image image) {
        this.shape = avatarShape;
        this.image = image;
    }

    public static /* synthetic */ SellerAvatar copy$default(SellerAvatar sellerAvatar, AvatarShape avatarShape, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avatarShape = sellerAvatar.shape;
        }
        if ((i12 & 2) != 0) {
            image = sellerAvatar.image;
        }
        return sellerAvatar.copy(avatarShape, image);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AvatarShape getShape() {
        return this.shape;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    public final SellerAvatar copy(@l AvatarShape shape, @l Image image) {
        return new SellerAvatar(shape, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerAvatar)) {
            return false;
        }
        SellerAvatar sellerAvatar = (SellerAvatar) other;
        return this.shape == sellerAvatar.shape && L.f(this.image, sellerAvatar.image);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final AvatarShape getShape() {
        return this.shape;
    }

    public int hashCode() {
        AvatarShape avatarShape = this.shape;
        int iHashCode = (avatarShape == null ? 0 : avatarShape.hashCode()) * 31;
        Image image = this.image;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SellerAvatar(shape=");
        sb2.append(this.shape);
        sb2.append(", image=");
        return AK.c.o(sb2, this.image, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AvatarShape avatarShape = this.shape;
        if (avatarShape == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(avatarShape.name());
        }
        parcel.writeParcelable(this.image, flags);
    }
}
