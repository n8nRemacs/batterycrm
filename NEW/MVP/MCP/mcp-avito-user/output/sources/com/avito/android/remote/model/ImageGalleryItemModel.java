package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ConstructorAdvertGalleryItemModel.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/ImageGalleryItemModel;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "Lcom/avito/android/remote/model/DimmedImage;", "image", "<init>", "(Lcom/avito/android/remote/model/DimmedImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/DimmedImage;", "getImage", "()Lcom/avito/android/remote/model/DimmedImage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImageGalleryItemModel implements ConstructorAdvertGalleryItemModel {

    @k
    public static final Parcelable.Creator<ImageGalleryItemModel> CREATOR = new Creator();

    @l
    private final DimmedImage image;

    /* compiled from: ConstructorAdvertGalleryItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageGalleryItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageGalleryItemModel createFromParcel(@k Parcel parcel) {
            return new ImageGalleryItemModel((DimmedImage) parcel.readParcelable(ImageGalleryItemModel.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageGalleryItemModel[] newArray(int i12) {
            return new ImageGalleryItemModel[i12];
        }
    }

    public ImageGalleryItemModel(@l DimmedImage dimmedImage) {
        this.image = dimmedImage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final DimmedImage getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
    }
}
