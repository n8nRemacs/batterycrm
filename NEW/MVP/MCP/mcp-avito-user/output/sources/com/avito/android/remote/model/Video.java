package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Video.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/Video;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "videoUrl", "Lcom/avito/android/remote/model/Image;", "previewImage", "<init>", "(Landroid/net/Uri;Lcom/avito/android/remote/model/Image;)V", "", "hasPreviewImage", "()Z", "component1", "()Landroid/net/Uri;", "component2", "()Lcom/avito/android/remote/model/Image;", "copy", "(Landroid/net/Uri;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/Video;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getVideoUrl", "Lcom/avito/android/remote/model/Image;", "getPreviewImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Video implements Parcelable {

    @k
    public static final Parcelable.Creator<Video> CREATOR = new Creator();

    @c("videoImages")
    @l
    private final Image previewImage;

    @c("videoUrl")
    @k
    private final Uri videoUrl;

    /* compiled from: Video.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Video> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Video createFromParcel(@k Parcel parcel) {
            return new Video((Uri) parcel.readParcelable(Video.class.getClassLoader()), (Image) parcel.readParcelable(Video.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Video[] newArray(int i12) {
            return new Video[i12];
        }
    }

    public Video(@k Uri uri, @l Image image) {
        this.videoUrl = uri;
        this.previewImage = image;
    }

    public static /* synthetic */ Video copy$default(Video video, Uri uri, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = video.videoUrl;
        }
        if ((i12 & 2) != 0) {
            image = video.previewImage;
        }
        return video.copy(uri, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Uri getVideoUrl() {
        return this.videoUrl;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getPreviewImage() {
        return this.previewImage;
    }

    @k
    public final Video copy(@k Uri videoUrl, @l Image previewImage) {
        return new Video(videoUrl, previewImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Video)) {
            return false;
        }
        Video video = (Video) other;
        return L.f(this.videoUrl, video.videoUrl) && L.f(this.previewImage, video.previewImage);
    }

    @l
    public final Image getPreviewImage() {
        return this.previewImage;
    }

    @k
    public final Uri getVideoUrl() {
        return this.videoUrl;
    }

    public final boolean hasPreviewImage() {
        return this.previewImage != null;
    }

    public int hashCode() {
        int iHashCode = this.videoUrl.hashCode() * 31;
        Image image = this.previewImage;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Video(videoUrl=");
        sb2.append(this.videoUrl);
        sb2.append(", previewImage=");
        return AK.c.o(sb2, this.previewImage, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.videoUrl, flags);
        parcel.writeParcelable(this.previewImage, flags);
    }

    public /* synthetic */ Video(Uri uri, Image image, int i12, C42822w c42822w) {
        this(uri, (i12 & 2) != 0 ? null : image);
    }
}
