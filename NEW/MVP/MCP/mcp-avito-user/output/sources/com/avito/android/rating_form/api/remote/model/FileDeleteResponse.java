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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/FileDeleteResponse;", "Landroid/os/Parcelable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FileDeleteResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<FileDeleteResponse> CREATOR = new a();

    @c("message")
    @l
    private final String message;

    /* compiled from: RatingFormFile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FileDeleteResponse> {
        @Override // android.os.Parcelable.Creator
        public final FileDeleteResponse createFromParcel(Parcel parcel) {
            return new FileDeleteResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FileDeleteResponse[] newArray(int i12) {
            return new FileDeleteResponse[i12];
        }
    }

    public FileDeleteResponse(@l String str) {
        this.message = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileDeleteResponse) && L.f(this.message, ((FileDeleteResponse) obj).message);
    }

    public final int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("FileDeleteResponse(message="), this.message, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.message);
    }
}
