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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/VideoGalleryItemModel;", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "Lcom/avito/android/remote/model/Image;", "thumbnail", "", "videoUrl", "Lcom/avito/android/remote/model/GalleryItemConfigModel;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/GalleryItemConfigModel;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getThumbnail", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getVideoUrl", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/GalleryItemConfigModel;", "getConfig", "()Lcom/avito/android/remote/model/GalleryItemConfigModel;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VideoGalleryItemModel implements ConstructorAdvertGalleryItemModel {

    @k
    public static final Parcelable.Creator<VideoGalleryItemModel> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @l
    private final GalleryItemConfigModel config;

    @c("thumbnail")
    @l
    private final Image thumbnail;

    @c("videoUrl")
    @l
    private final String videoUrl;

    /* compiled from: ConstructorAdvertGalleryItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoGalleryItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoGalleryItemModel createFromParcel(@k Parcel parcel) {
            return new VideoGalleryItemModel((Image) parcel.readParcelable(VideoGalleryItemModel.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GalleryItemConfigModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoGalleryItemModel[] newArray(int i12) {
            return new VideoGalleryItemModel[i12];
        }
    }

    public VideoGalleryItemModel(@l Image image, @l String str, @l GalleryItemConfigModel galleryItemConfigModel) {
        this.thumbnail = image;
        this.videoUrl = str;
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
    public final Image getThumbnail() {
        return this.thumbnail;
    }

    @l
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.thumbnail, flags);
        parcel.writeString(this.videoUrl);
        GalleryItemConfigModel galleryItemConfigModel = this.config;
        if (galleryItemConfigModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryItemConfigModel.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ VideoGalleryItemModel(Image image, String str, GalleryItemConfigModel galleryItemConfigModel, int i12, C42822w c42822w) {
        this(image, str, (i12 & 4) != 0 ? null : galleryItemConfigModel);
    }
}
