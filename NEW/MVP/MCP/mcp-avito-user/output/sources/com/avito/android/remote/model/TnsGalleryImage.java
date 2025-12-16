package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TnsGalleryImage.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/TnsGalleryImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/Size;", "originalSize", "<init>", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Size;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Lcom/avito/android/remote/model/Size;", "copy", "(Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Size;)Lcom/avito/android/remote/model/TnsGalleryImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/remote/model/Size;", "getOriginalSize", "_avito-discouraged_avito-api_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TnsGalleryImage implements Parcelable {

    @k
    public static final Parcelable.Creator<TnsGalleryImage> CREATOR = new Creator();

    @k
    private final Image image;

    @l
    private final Size originalSize;

    /* compiled from: TnsGalleryImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TnsGalleryImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TnsGalleryImage createFromParcel(@k Parcel parcel) {
            return new TnsGalleryImage((Image) parcel.readParcelable(TnsGalleryImage.class.getClassLoader()), (Size) parcel.readParcelable(TnsGalleryImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TnsGalleryImage[] newArray(int i12) {
            return new TnsGalleryImage[i12];
        }
    }

    public TnsGalleryImage(@k Image image, @l Size size) {
        this.image = image;
        this.originalSize = size;
    }

    public static /* synthetic */ TnsGalleryImage copy$default(TnsGalleryImage tnsGalleryImage, Image image, Size size, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = tnsGalleryImage.image;
        }
        if ((i12 & 2) != 0) {
            size = tnsGalleryImage.originalSize;
        }
        return tnsGalleryImage.copy(image, size);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Size getOriginalSize() {
        return this.originalSize;
    }

    @k
    public final TnsGalleryImage copy(@k Image image, @l Size originalSize) {
        return new TnsGalleryImage(image, originalSize);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TnsGalleryImage)) {
            return false;
        }
        TnsGalleryImage tnsGalleryImage = (TnsGalleryImage) other;
        return L.f(this.image, tnsGalleryImage.image) && L.f(this.originalSize, tnsGalleryImage.originalSize);
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final Size getOriginalSize() {
        return this.originalSize;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        Size size = this.originalSize;
        return iHashCode + (size == null ? 0 : size.hashCode());
    }

    @k
    public String toString() {
        return "TnsGalleryImage(image=" + this.image + ", originalSize=" + this.originalSize + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.originalSize, flags);
    }
}
