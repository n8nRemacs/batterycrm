package ru.avito.messenger.api.entity;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/avito/messenger/api/entity/Avatar;", "Landroid/os/Parcelable;", "", "default", "Lru/avito/messenger/api/entity/Image;", "image", "<init>", "(Ljava/lang/String;Lru/avito/messenger/api/entity/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDefault", "Lru/avito/messenger/api/entity/Image;", "getImage", "()Lru/avito/messenger/api/entity/Image;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Avatar implements Parcelable {

    @k
    public static final Parcelable.Creator<Avatar> CREATOR = new Creator();

    @c("default")
    @k
    private final String default;

    @c("images")
    @l
    private final Image image;

    /* compiled from: Avatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Avatar> {
        @Override // android.os.Parcelable.Creator
        @k
        public final Avatar createFromParcel(@k Parcel parcel) {
            return new Avatar(parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @k
        public final Avatar[] newArray(int i12) {
            return new Avatar[i12];
        }
    }

    public Avatar(@k String str, @l Image image) {
        this.default = str;
        this.image = image;
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
        return L.f(this.default, avatar.default) && L.f(this.image, avatar.image);
    }

    @k
    public final String getDefault() {
        return this.default;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = this.default.hashCode() * 31;
        Image image = this.image;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public String toString() {
        return "Avatar(default=" + this.default + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.default);
        Image image = this.image;
        if (image == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            image.writeToParcel(parcel, flags);
        }
    }
}
