package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageUpload.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J0\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/ImageUploadResult;", "Lcom/avito/android/remote/model/ImageUpload;", "", "uploadId", "Lcom/avito/android/remote/model/Image;", "image", "id", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)Lcom/avito/android/remote/model/ImageUploadResult;", "toString", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUploadId", "Lcom/avito/android/remote/model/Image;", "getImage", "getId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImageUploadResult extends ImageUpload {

    @k
    public static final Parcelable.Creator<ImageUploadResult> CREATOR = new Creator();

    @l
    private final String id;

    @k
    private final Image image;

    @k
    private final String uploadId;

    /* compiled from: ImageUpload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageUploadResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageUploadResult createFromParcel(@k Parcel parcel) {
            return new ImageUploadResult(parcel.readString(), (Image) parcel.readParcelable(ImageUploadResult.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageUploadResult[] newArray(int i12) {
            return new ImageUploadResult[i12];
        }
    }

    public /* synthetic */ ImageUploadResult(String str, Image image, String str2, int i12, C42822w c42822w) {
        this(str, image, (i12 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ ImageUploadResult copy$default(ImageUploadResult imageUploadResult, String str, Image image, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageUploadResult.uploadId;
        }
        if ((i12 & 2) != 0) {
            image = imageUploadResult.image;
        }
        if ((i12 & 4) != 0) {
            str2 = imageUploadResult.id;
        }
        return imageUploadResult.copy(str, image, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final ImageUploadResult copy(@k String uploadId, @k Image image, @l String id2) {
        return new ImageUploadResult(uploadId, image, id2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageUploadResult) && L.f(this.uploadId, ((ImageUploadResult) other).uploadId);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return this.uploadId.hashCode();
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ImageUploadResult(uploadId=");
        sb2.append(this.uploadId);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", id=");
        return C22026a.c(sb2, this.id, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.uploadId);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.id);
    }

    public ImageUploadResult(@k String str, @k Image image, @l String str2) {
        super(null);
        this.uploadId = str;
        this.image = image;
        this.id = str2;
    }
}
