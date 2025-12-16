package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VideoUploadParameterValue;", "Landroid/os/Parcelable;", "", "id", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/Image;", "thumbnail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/category_parameters/VideoUploadParameterValue;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getUrl", "Lcom/avito/android/remote/model/Image;", "getThumbnail", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VideoUploadParameterValue implements Parcelable {

    @k
    public static final Parcelable.Creator<VideoUploadParameterValue> CREATOR = new Creator();

    @c("id")
    @k
    private final String id;

    @c("thumbnail")
    @l
    private final Image thumbnail;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoUploadParameterValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoUploadParameterValue createFromParcel(@k Parcel parcel) {
            return new VideoUploadParameterValue(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(VideoUploadParameterValue.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoUploadParameterValue[] newArray(int i12) {
            return new VideoUploadParameterValue[i12];
        }
    }

    public VideoUploadParameterValue(@k String str, @l String str2, @l Image image) {
        this.id = str;
        this.url = str2;
        this.thumbnail = image;
    }

    public static /* synthetic */ VideoUploadParameterValue copy$default(VideoUploadParameterValue videoUploadParameterValue, String str, String str2, Image image, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = videoUploadParameterValue.id;
        }
        if ((i12 & 2) != 0) {
            str2 = videoUploadParameterValue.url;
        }
        if ((i12 & 4) != 0) {
            image = videoUploadParameterValue.thumbnail;
        }
        return videoUploadParameterValue.copy(str, str2, image);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getThumbnail() {
        return this.thumbnail;
    }

    @k
    public final VideoUploadParameterValue copy(@k String id2, @l String url, @l Image thumbnail) {
        return new VideoUploadParameterValue(id2, url, thumbnail);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoUploadParameterValue)) {
            return false;
        }
        VideoUploadParameterValue videoUploadParameterValue = (VideoUploadParameterValue) other;
        return L.f(this.id, videoUploadParameterValue.id) && L.f(this.url, videoUploadParameterValue.url) && L.f(this.thumbnail, videoUploadParameterValue.thumbnail);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getThumbnail() {
        return this.thumbnail;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.thumbnail;
        return iHashCode2 + (image != null ? image.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoUploadParameterValue(id=");
        sb2.append(this.id);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", thumbnail=");
        return AK.c.o(sb2, this.thumbnail, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.thumbnail, flags);
    }

    public /* synthetic */ VideoUploadParameterValue(String str, String str2, Image image, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : image);
    }
}
