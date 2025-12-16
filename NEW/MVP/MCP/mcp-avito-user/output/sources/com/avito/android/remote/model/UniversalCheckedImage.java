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

/* compiled from: UniversalCheckedImage.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\t¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/UniversalCheckedImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "imageDark", "imageChecked", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "component3", "copy", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/UniversalCheckedImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "getImageDark", "getImageChecked", "_common_network-design_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalCheckedImage implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalCheckedImage> CREATOR = new Creator();

    @c("value")
    @l
    private final Image image;

    @c("valueChecked")
    @l
    private final Image imageChecked;

    @c("valueDark")
    @l
    private final Image imageDark;

    /* compiled from: UniversalCheckedImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalCheckedImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalCheckedImage createFromParcel(@k Parcel parcel) {
            return new UniversalCheckedImage((Image) parcel.readParcelable(UniversalCheckedImage.class.getClassLoader()), (Image) parcel.readParcelable(UniversalCheckedImage.class.getClassLoader()), (Image) parcel.readParcelable(UniversalCheckedImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalCheckedImage[] newArray(int i12) {
            return new UniversalCheckedImage[i12];
        }
    }

    public UniversalCheckedImage(@l Image image, @l Image image2, @l Image image3) {
        this.image = image;
        this.imageDark = image2;
        this.imageChecked = image3;
    }

    public static /* synthetic */ UniversalCheckedImage copy$default(UniversalCheckedImage universalCheckedImage, Image image, Image image2, Image image3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = universalCheckedImage.image;
        }
        if ((i12 & 2) != 0) {
            image2 = universalCheckedImage.imageDark;
        }
        if ((i12 & 4) != 0) {
            image3 = universalCheckedImage.imageChecked;
        }
        return universalCheckedImage.copy(image, image2, image3);
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

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getImageChecked() {
        return this.imageChecked;
    }

    @k
    public final UniversalCheckedImage copy(@l Image image, @l Image imageDark, @l Image imageChecked) {
        return new UniversalCheckedImage(image, imageDark, imageChecked);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalCheckedImage)) {
            return false;
        }
        UniversalCheckedImage universalCheckedImage = (UniversalCheckedImage) other;
        return L.f(this.image, universalCheckedImage.image) && L.f(this.imageDark, universalCheckedImage.imageDark) && L.f(this.imageChecked, universalCheckedImage.imageChecked);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final Image getImageChecked() {
        return this.imageChecked;
    }

    @l
    public final Image getImageDark() {
        return this.imageDark;
    }

    public int hashCode() {
        Image image = this.image;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.imageDark;
        int iHashCode2 = (iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.imageChecked;
        return iHashCode2 + (image3 != null ? image3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalCheckedImage(image=");
        sb2.append(this.image);
        sb2.append(", imageDark=");
        sb2.append(this.imageDark);
        sb2.append(", imageChecked=");
        return AK.c.o(sb2, this.imageChecked, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.imageDark, flags);
        parcel.writeParcelable(this.imageChecked, flags);
    }
}
