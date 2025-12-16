package com.avito.android.video_picker;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadLimits.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_picker/VideoUploadLimits;", "Landroid/os/Parcelable;", "_avito_video-picker_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VideoUploadLimits implements Parcelable {

    @k
    public static final Parcelable.Creator<VideoUploadLimits> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f325955b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f325956c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f325957d;

    /* compiled from: VideoUploadLimits.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoUploadLimits> {
        @Override // android.os.Parcelable.Creator
        public final VideoUploadLimits createFromParcel(Parcel parcel) {
            return new VideoUploadLimits(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoUploadLimits[] newArray(int i12) {
            return new VideoUploadLimits[i12];
        }
    }

    public VideoUploadLimits(@l Long l12, @l Long l13, @l Long l14) {
        this.f325955b = l12;
        this.f325956c = l13;
        this.f325957d = l14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUploadLimits)) {
            return false;
        }
        VideoUploadLimits videoUploadLimits = (VideoUploadLimits) obj;
        return L.f(this.f325955b, videoUploadLimits.f325955b) && L.f(this.f325956c, videoUploadLimits.f325956c) && L.f(this.f325957d, videoUploadLimits.f325957d);
    }

    public final int hashCode() {
        Long l12 = this.f325955b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.f325956c;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f325957d;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoUploadLimits(maxVideoSize=");
        sb2.append(this.f325955b);
        sb2.append(", maxVideoDuration=");
        sb2.append(this.f325956c);
        sb2.append(", minVideoDuration=");
        return m.m(sb2, this.f325957d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f325955b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f325956c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.f325957d;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
    }
}
