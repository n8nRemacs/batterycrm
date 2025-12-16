package com.avito.android.photo_cache;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.remote.model.ErrorTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoUpload.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_cache/PhotoUpload;", "Landroid/os/Parcelable;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PhotoUpload implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoUpload> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f216300b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f216301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f216302d;

    /* renamed from: e, reason: collision with root package name */
    public final long f216303e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f216304f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Uri f216305g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final PhotoSource f216306h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ErrorType f216307i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Uri f216308j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f216309k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Uri f216310l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final EnhanceState f216311m;

    /* compiled from: PhotoUpload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhotoUpload> {
        @Override // android.os.Parcelable.Creator
        public final PhotoUpload createFromParcel(Parcel parcel) {
            return new PhotoUpload(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), (Uri) parcel.readParcelable(PhotoUpload.class.getClassLoader()), PhotoSource.CREATOR.createFromParcel(parcel), (ErrorType) parcel.readParcelable(PhotoUpload.class.getClassLoader()), (Uri) parcel.readParcelable(PhotoUpload.class.getClassLoader()), parcel.readString(), (Uri) parcel.readParcelable(PhotoUpload.class.getClassLoader()), EnhanceState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoUpload[] newArray(int i12) {
            return new PhotoUpload[i12];
        }
    }

    public PhotoUpload(long j12, @Y61.k String str, int i12, long j13, @Y61.l String str2, @Y61.l Uri uri, @Y61.k PhotoSource photoSource, @Y61.k ErrorType errorType, @Y61.l Uri uri2, @Y61.l String str3, @Y61.l Uri uri3, @Y61.k EnhanceState enhanceState) {
        this.f216300b = j12;
        this.f216301c = str;
        this.f216302d = i12;
        this.f216303e = j13;
        this.f216304f = str2;
        this.f216305g = uri;
        this.f216306h = photoSource;
        this.f216307i = errorType;
        this.f216308j = uri2;
        this.f216309k = str3;
        this.f216310l = uri3;
        this.f216311m = enhanceState;
    }

    public static PhotoUpload a(PhotoUpload photoUpload, String str, Uri uri, ErrorType errorType, String str2, Uri uri2, EnhanceState enhanceState, int i12) {
        long j12 = photoUpload.f216300b;
        String str3 = photoUpload.f216301c;
        int i13 = photoUpload.f216302d;
        long j13 = photoUpload.f216303e;
        String str4 = (i12 & 16) != 0 ? photoUpload.f216304f : str;
        Uri uri3 = (i12 & 32) != 0 ? photoUpload.f216305g : uri;
        PhotoSource photoSource = photoUpload.f216306h;
        ErrorType errorType2 = (i12 & 128) != 0 ? photoUpload.f216307i : errorType;
        Uri uri4 = photoUpload.f216308j;
        String str5 = (i12 & 512) != 0 ? photoUpload.f216309k : str2;
        Uri uri5 = (i12 & 1024) != 0 ? photoUpload.f216310l : uri2;
        EnhanceState enhanceState2 = (i12 & 2048) != 0 ? photoUpload.f216311m : enhanceState;
        photoUpload.getClass();
        return new PhotoUpload(j12, str3, i13, j13, str4, uri3, photoSource, errorType2, uri4, str5, uri5, enhanceState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoUpload)) {
            return false;
        }
        PhotoUpload photoUpload = (PhotoUpload) obj;
        return this.f216300b == photoUpload.f216300b && L.f(this.f216301c, photoUpload.f216301c) && this.f216302d == photoUpload.f216302d && this.f216303e == photoUpload.f216303e && L.f(this.f216304f, photoUpload.f216304f) && L.f(this.f216305g, photoUpload.f216305g) && this.f216306h == photoUpload.f216306h && L.f(this.f216307i, photoUpload.f216307i) && L.f(this.f216308j, photoUpload.f216308j) && L.f(this.f216309k, photoUpload.f216309k) && L.f(this.f216310l, photoUpload.f216310l) && this.f216311m == photoUpload.f216311m;
    }

    public final int hashCode() {
        int iG2 = r.g(r.e(this.f216302d, H.d(Long.hashCode(this.f216300b) * 31, 31, this.f216301c), 31), 31, this.f216303e);
        String str = this.f216304f;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.f216305g;
        int iHashCode2 = (this.f216307i.hashCode() + ((this.f216306h.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31;
        Uri uri2 = this.f216308j;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str2 = this.f216309k;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri3 = this.f216310l;
        return this.f216311m.hashCode() + ((iHashCode4 + (uri3 != null ? uri3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PhotoUpload(id=" + this.f216300b + ", type=" + this.f216301c + ", position=" + this.f216302d + ", created=" + this.f216303e + ", uploadId=" + this.f216304f + ", contentUri=" + this.f216305g + ", source=" + this.f216306h + ", error=" + this.f216307i + ", sourceUri=" + this.f216308j + ", originalImageUploadId=" + this.f216309k + ", originalUri=" + this.f216310l + ", enhanceState=" + this.f216311m + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f216300b);
        parcel.writeString(this.f216301c);
        parcel.writeInt(this.f216302d);
        parcel.writeLong(this.f216303e);
        parcel.writeString(this.f216304f);
        parcel.writeParcelable(this.f216305g, i12);
        this.f216306h.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f216307i, i12);
        parcel.writeParcelable(this.f216308j, i12);
        parcel.writeString(this.f216309k);
        parcel.writeParcelable(this.f216310l, i12);
        parcel.writeString(this.f216311m.name());
    }

    public /* synthetic */ PhotoUpload(long j12, String str, int i12, long j13, String str2, Uri uri, PhotoSource photoSource, ErrorType errorType, Uri uri2, String str3, Uri uri3, EnhanceState enhanceState, int i13, C42822w c42822w) {
        this(j12, str, i12, j13, str2, uri, photoSource, errorType, uri2, (i13 & 512) != 0 ? null : str3, (i13 & 1024) != 0 ? null : uri3, (i13 & 2048) != 0 ? EnhanceState.f216287c : enhanceState);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoUpload(long j12, @Y61.k String str, int i12, long j13, @Y61.l String str2, @Y61.l Uri uri, int i13, int i14, @Y61.l Uri uri2, @Y61.l String str3, @Y61.l Uri uri3, @Y61.k EnhanceState enhanceState) {
        PhotoSource photoSource;
        if (i13 == 1) {
            photoSource = PhotoSource.f216294d;
        } else if (i13 != 2) {
            photoSource = PhotoSource.f216293c;
        } else {
            photoSource = PhotoSource.f216296f;
        }
        this(j12, str, i12, j13, str2, uri, photoSource, ErrorTypeKt.findErrorByCode(i14), uri2, str3, uri3, enhanceState);
    }

    public /* synthetic */ PhotoUpload(long j12, String str, int i12, long j13, String str2, Uri uri, int i13, int i14, Uri uri2, String str3, Uri uri3, EnhanceState enhanceState, int i15, C42822w c42822w) {
        this(j12, str, i12, j13, str2, uri, (i15 & 64) != 0 ? 0 : i13, (i15 & 128) != 0 ? 0 : i14, uri2, (i15 & 512) != 0 ? null : str3, (i15 & 1024) != 0 ? null : uri3, (i15 & 2048) != 0 ? EnhanceState.f216287c : enhanceState);
    }
}
