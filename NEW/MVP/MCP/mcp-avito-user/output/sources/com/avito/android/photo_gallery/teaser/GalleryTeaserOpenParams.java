package com.avito.android.photo_gallery.teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryTeaserOpenParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/teaser/GalleryTeaserOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GalleryTeaserOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<GalleryTeaserOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GalleryTeaser f217663b;

    /* compiled from: GalleryTeaserOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryTeaserOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GalleryTeaserOpenParams createFromParcel(Parcel parcel) {
            return new GalleryTeaserOpenParams((GalleryTeaser) parcel.readParcelable(GalleryTeaserOpenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryTeaserOpenParams[] newArray(int i12) {
            return new GalleryTeaserOpenParams[i12];
        }
    }

    public GalleryTeaserOpenParams(@k GalleryTeaser galleryTeaser) {
        this.f217663b = galleryTeaser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GalleryTeaserOpenParams) && L.f(this.f217663b, ((GalleryTeaserOpenParams) obj).f217663b);
    }

    public final int hashCode() {
        return this.f217663b.hashCode();
    }

    @k
    public final String toString() {
        return "GalleryTeaserOpenParams(teaser=" + this.f217663b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f217663b, i12);
    }
}
