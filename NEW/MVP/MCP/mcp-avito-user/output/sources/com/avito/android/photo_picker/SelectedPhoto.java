package com.avito.android.photo_picker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.krop.util.Transformation;
import com.avito.android.photo_cache.EnhanceState;
import com.avito.android.photo_cache.PhotoSource;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoPickerViewModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/SelectedPhoto;", "Landroid/os/Parcelable;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SelectedPhoto implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectedPhoto> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Uri f218866b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PhotoSource f218867c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f218868d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Uri f218869e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Transformation f218870f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f218871g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final EnhanceState f218872h;

    /* compiled from: PhotoPickerViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedPhoto> {
        @Override // android.os.Parcelable.Creator
        public final SelectedPhoto createFromParcel(Parcel parcel) {
            return new SelectedPhoto((Uri) parcel.readParcelable(SelectedPhoto.class.getClassLoader()), (PhotoSource) parcel.readParcelable(SelectedPhoto.class.getClassLoader()), parcel.readString(), (Uri) parcel.readParcelable(SelectedPhoto.class.getClassLoader()), (Transformation) parcel.readParcelable(SelectedPhoto.class.getClassLoader()), parcel.readString(), EnhanceState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedPhoto[] newArray(int i12) {
            return new SelectedPhoto[i12];
        }
    }

    public SelectedPhoto(@Y61.k Uri uri, @Y61.k PhotoSource photoSource, @Y61.k String str, @Y61.l Uri uri2, @Y61.l Transformation transformation, @Y61.l String str2, @Y61.k EnhanceState enhanceState) {
        this.f218866b = uri;
        this.f218867c = photoSource;
        this.f218868d = str;
        this.f218869e = uri2;
        this.f218870f = transformation;
        this.f218871g = str2;
        this.f218872h = enhanceState;
    }

    public static SelectedPhoto a(SelectedPhoto selectedPhoto, Uri uri, Uri uri2, Transformation transformation, int i12) {
        PhotoSource photoSource = PhotoSource.f216294d;
        EnhanceState enhanceState = EnhanceState.f216289e;
        if ((i12 & 1) != 0) {
            uri = selectedPhoto.f218866b;
        }
        Uri uri3 = uri;
        if ((i12 & 2) != 0) {
            photoSource = selectedPhoto.f218867c;
        }
        PhotoSource photoSource2 = photoSource;
        String str = selectedPhoto.f218868d;
        if ((i12 & 8) != 0) {
            uri2 = selectedPhoto.f218869e;
        }
        Uri uri4 = uri2;
        if ((i12 & 16) != 0) {
            transformation = selectedPhoto.f218870f;
        }
        Transformation transformation2 = transformation;
        String str2 = selectedPhoto.f218871g;
        if ((i12 & 64) != 0) {
            enhanceState = selectedPhoto.f218872h;
        }
        selectedPhoto.getClass();
        return new SelectedPhoto(uri3, photoSource2, str, uri4, transformation2, str2, enhanceState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedPhoto)) {
            return false;
        }
        SelectedPhoto selectedPhoto = (SelectedPhoto) obj;
        return kotlin.jvm.internal.L.f(this.f218866b, selectedPhoto.f218866b) && this.f218867c == selectedPhoto.f218867c && kotlin.jvm.internal.L.f(this.f218868d, selectedPhoto.f218868d) && kotlin.jvm.internal.L.f(this.f218869e, selectedPhoto.f218869e) && kotlin.jvm.internal.L.f(this.f218870f, selectedPhoto.f218870f) && kotlin.jvm.internal.L.f(this.f218871g, selectedPhoto.f218871g) && this.f218872h == selectedPhoto.f218872h;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d((this.f218867c.hashCode() + (this.f218866b.hashCode() * 31)) * 31, 31, this.f218868d);
        Uri uri = this.f218869e;
        int iHashCode = (iD2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Transformation transformation = this.f218870f;
        int iHashCode2 = (iHashCode + (transformation == null ? 0 : transformation.hashCode())) * 31;
        String str = this.f218871g;
        return this.f218872h.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "SelectedPhoto(uri=" + this.f218866b + ", source=" + this.f218867c + ", id=" + this.f218868d + ", originalUri=" + this.f218869e + ", state=" + this.f218870f + ", uploadId=" + this.f218871g + ", enhanceState=" + this.f218872h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f218866b, i12);
        parcel.writeParcelable(this.f218867c, i12);
        parcel.writeString(this.f218868d);
        parcel.writeParcelable(this.f218869e, i12);
        parcel.writeParcelable(this.f218870f, i12);
        parcel.writeString(this.f218871g);
        parcel.writeString(this.f218872h.name());
    }

    public /* synthetic */ SelectedPhoto(Uri uri, PhotoSource photoSource, String str, Uri uri2, Transformation transformation, String str2, EnhanceState enhanceState, int i12, C42822w c42822w) {
        this(uri, photoSource, str, (i12 & 8) != 0 ? null : uri2, (i12 & 16) != 0 ? null : transformation, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? EnhanceState.f216287c : enhanceState);
    }
}
