package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FileUploaderParameter.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;", "upload", "remove", "<init>", "(Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;", "component2", "copy", "(Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;)Lcom/avito/android/remote/model/category_parameters/FileUploadApiConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/FileUploadApiValue;", "getUpload", "getRemove", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FileUploadApiConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<FileUploadApiConfig> CREATOR = new Creator();

    @c("remove")
    @k
    private final FileUploadApiValue remove;

    @c("upload")
    @k
    private final FileUploadApiValue upload;

    /* compiled from: FileUploaderParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FileUploadApiConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadApiConfig createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<FileUploadApiValue> creator = FileUploadApiValue.CREATOR;
            return new FileUploadApiConfig(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FileUploadApiConfig[] newArray(int i12) {
            return new FileUploadApiConfig[i12];
        }
    }

    public FileUploadApiConfig(@k FileUploadApiValue fileUploadApiValue, @k FileUploadApiValue fileUploadApiValue2) {
        this.upload = fileUploadApiValue;
        this.remove = fileUploadApiValue2;
    }

    public static /* synthetic */ FileUploadApiConfig copy$default(FileUploadApiConfig fileUploadApiConfig, FileUploadApiValue fileUploadApiValue, FileUploadApiValue fileUploadApiValue2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fileUploadApiValue = fileUploadApiConfig.upload;
        }
        if ((i12 & 2) != 0) {
            fileUploadApiValue2 = fileUploadApiConfig.remove;
        }
        return fileUploadApiConfig.copy(fileUploadApiValue, fileUploadApiValue2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final FileUploadApiValue getUpload() {
        return this.upload;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final FileUploadApiValue getRemove() {
        return this.remove;
    }

    @k
    public final FileUploadApiConfig copy(@k FileUploadApiValue upload, @k FileUploadApiValue remove) {
        return new FileUploadApiConfig(upload, remove);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadApiConfig)) {
            return false;
        }
        FileUploadApiConfig fileUploadApiConfig = (FileUploadApiConfig) other;
        return L.f(this.upload, fileUploadApiConfig.upload) && L.f(this.remove, fileUploadApiConfig.remove);
    }

    @k
    public final FileUploadApiValue getRemove() {
        return this.remove;
    }

    @k
    public final FileUploadApiValue getUpload() {
        return this.upload;
    }

    public int hashCode() {
        return this.remove.hashCode() + (this.upload.hashCode() * 31);
    }

    @k
    public String toString() {
        return "FileUploadApiConfig(upload=" + this.upload + ", remove=" + this.remove + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.upload.writeToParcel(parcel, flags);
        this.remove.writeToParcel(parcel, flags);
    }
}
