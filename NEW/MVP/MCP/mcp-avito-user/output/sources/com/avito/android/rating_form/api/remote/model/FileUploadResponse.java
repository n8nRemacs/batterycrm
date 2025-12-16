package com.avito.android.rating_form.api.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormFile.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/FileUploadResponse;", "Landroid/os/Parcelable;", "", "key", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getMessage", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FileUploadResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<FileUploadResponse> CREATOR = new a();

    @c("key")
    @l
    private final String key;

    @c("message")
    @l
    private final String message;

    /* compiled from: RatingFormFile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileUploadResponse> {
        @Override // android.os.Parcelable.Creator
        public final FileUploadResponse createFromParcel(Parcel parcel) {
            return new FileUploadResponse(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FileUploadResponse[] newArray(int i12) {
            return new FileUploadResponse[i12];
        }
    }

    public FileUploadResponse(@l String str, @l String str2) {
        this.key = str;
        this.message = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileUploadResponse)) {
            return false;
        }
        FileUploadResponse fileUploadResponse = (FileUploadResponse) obj;
        return L.f(this.key, fileUploadResponse.key) && L.f(this.message, fileUploadResponse.message);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FileUploadResponse(key=");
        sb2.append(this.key);
        sb2.append(", message=");
        return C22026a.c(sb2, this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.key);
        parcel.writeString(this.message);
    }
}
