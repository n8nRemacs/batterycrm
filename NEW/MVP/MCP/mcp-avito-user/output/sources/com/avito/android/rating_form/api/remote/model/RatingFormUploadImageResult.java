package com.avito.android.rating_form.api.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormUploadImageResult.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/RatingFormUploadImageResult;", "Landroid/os/Parcelable;", "", "fileId", MessageSuggest.PREVIEW, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getPreview", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormUploadImageResult implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormUploadImageResult> CREATOR = new a();

    @c("fileId")
    @k
    private final String fileId;

    @c(MessageSuggest.PREVIEW)
    @k
    private final String preview;

    /* compiled from: RatingFormUploadImageResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormUploadImageResult> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormUploadImageResult createFromParcel(Parcel parcel) {
            return new RatingFormUploadImageResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormUploadImageResult[] newArray(int i12) {
            return new RatingFormUploadImageResult[i12];
        }
    }

    public RatingFormUploadImageResult(@k String str, @k String str2) {
        this.fileId = str;
        this.preview = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormUploadImageResult)) {
            return false;
        }
        RatingFormUploadImageResult ratingFormUploadImageResult = (RatingFormUploadImageResult) obj;
        return L.f(this.fileId, ratingFormUploadImageResult.fileId) && L.f(this.preview, ratingFormUploadImageResult.preview);
    }

    public final int hashCode() {
        return this.preview.hashCode() + (this.fileId.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormUploadImageResult(fileId=");
        sb2.append(this.fileId);
        sb2.append(", preview=");
        return C22026a.c(sb2, this.preview, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.fileId);
        parcel.writeString(this.preview);
    }
}
