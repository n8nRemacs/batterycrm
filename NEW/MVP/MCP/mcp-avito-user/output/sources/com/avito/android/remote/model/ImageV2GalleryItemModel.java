package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConstructorAdvertGalleryItemModel.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/ImageV2GalleryItemModel;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "Lcom/avito/android/remote/model/DimmedImage;", "image", "Lcom/avito/android/remote/model/GalleryItemConfigModel;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/DimmedImage;Lcom/avito/android/remote/model/GalleryItemConfigModel;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/DimmedImage;", "getImage", "()Lcom/avito/android/remote/model/DimmedImage;", "Lcom/avito/android/remote/model/GalleryItemConfigModel;", "getConfig", "()Lcom/avito/android/remote/model/GalleryItemConfigModel;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ImageV2GalleryItemModel implements ConstructorAdvertGalleryItemModel {

    @k
    public static final Parcelable.Creator<ImageV2GalleryItemModel> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @l
    private final GalleryItemConfigModel config;

    @c("urls")
    @l
    private final DimmedImage image;

    /* compiled from: ConstructorAdvertGalleryItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageV2GalleryItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageV2GalleryItemModel createFromParcel(@k Parcel parcel) {
            return new ImageV2GalleryItemModel((DimmedImage) parcel.readParcelable(ImageV2GalleryItemModel.class.getClassLoader()), parcel.readInt() == 0 ? null : GalleryItemConfigModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageV2GalleryItemModel[] newArray(int i12) {
            return new ImageV2GalleryItemModel[i12];
        }
    }

    public ImageV2GalleryItemModel(@l DimmedImage dimmedImage, @l GalleryItemConfigModel galleryItemConfigModel) {
        this.image = dimmedImage;
        this.config = galleryItemConfigModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final GalleryItemConfigModel getConfig() {
        return this.config;
    }

    @l
    public final DimmedImage getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        GalleryItemConfigModel galleryItemConfigModel = this.config;
        if (galleryItemConfigModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryItemConfigModel.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ImageV2GalleryItemModel(DimmedImage dimmedImage, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(dimmedImage, (i12 & 2) != 0 ? null : galleryItemConfigModel);
    }
}
