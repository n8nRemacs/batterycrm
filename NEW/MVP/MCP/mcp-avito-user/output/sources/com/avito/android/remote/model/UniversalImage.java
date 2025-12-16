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

/* compiled from: UniversalImage.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/UniversalImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "imageDark", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "copy", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/UniversalImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "getImageDark", "_common_network-design_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalImage implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalImage> CREATOR = new Creator();

    @c("value")
    @l
    private final Image image;

    @c("valueDark")
    @l
    private final Image imageDark;

    /* compiled from: UniversalImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalImage createFromParcel(@k Parcel parcel) {
            return new UniversalImage((Image) parcel.readParcelable(UniversalImage.class.getClassLoader()), (Image) parcel.readParcelable(UniversalImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalImage[] newArray(int i12) {
            return new UniversalImage[i12];
        }
    }

    public UniversalImage(@l Image image, @l Image image2) {
        this.image = image;
        this.imageDark = image2;
    }

    public static /* synthetic */ UniversalImage copy$default(UniversalImage universalImage, Image image, Image image2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = universalImage.image;
        }
        if ((i12 & 2) != 0) {
            image2 = universalImage.imageDark;
        }
        return universalImage.copy(image, image2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getImageDark() {
        return this.imageDark;
    }

    @k
    public final UniversalImage copy(@l Image image, @l Image imageDark) {
        return new UniversalImage(image, imageDark);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalImage)) {
            return false;
        }
        UniversalImage universalImage = (UniversalImage) other;
        return L.f(this.image, universalImage.image) && L.f(this.imageDark, universalImage.imageDark);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final Image getImageDark() {
        return this.imageDark;
    }

    public int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.imageDark;
        return iHashCode + (image2 != null ? image2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalImage(image=");
        sb2.append(this.image);
        sb2.append(", imageDark=");
        return AK.c.o(sb2, this.imageDark, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.imageDark, flags);
    }
}
