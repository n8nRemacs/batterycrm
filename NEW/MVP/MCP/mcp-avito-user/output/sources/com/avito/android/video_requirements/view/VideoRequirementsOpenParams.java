package com.avito.android.video_requirements.view;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoRequirementsOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_requirements/view/VideoRequirementsOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VideoRequirementsOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<VideoRequirementsOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f326053b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f326054c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f326055d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f326056e;

    /* compiled from: VideoRequirementsOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoRequirementsOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final VideoRequirementsOpenParams createFromParcel(Parcel parcel) {
            return new VideoRequirementsOpenParams(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRequirementsOpenParams[] newArray(int i12) {
            return new VideoRequirementsOpenParams[i12];
        }
    }

    public VideoRequirementsOpenParams(@l Long l12, @l Long l13, @l Long l14, @l Long l15) {
        this.f326053b = l12;
        this.f326054c = l13;
        this.f326055d = l14;
        this.f326056e = l15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRequirementsOpenParams)) {
            return false;
        }
        VideoRequirementsOpenParams videoRequirementsOpenParams = (VideoRequirementsOpenParams) obj;
        return L.f(this.f326053b, videoRequirementsOpenParams.f326053b) && L.f(this.f326054c, videoRequirementsOpenParams.f326054c) && L.f(this.f326055d, videoRequirementsOpenParams.f326055d) && L.f(this.f326056e, videoRequirementsOpenParams.f326056e);
    }

    public final int hashCode() {
        Long l12 = this.f326053b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        Long l13 = this.f326054c;
        int iHashCode2 = (iHashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f326055d;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f326056e;
        return iHashCode3 + (l15 != null ? l15.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoRequirementsOpenParams(categoryId=");
        sb2.append(this.f326053b);
        sb2.append(", minDuration=");
        sb2.append(this.f326054c);
        sb2.append(", maxDuration=");
        sb2.append(this.f326055d);
        sb2.append(", maxFileSize=");
        return m.m(sb2, this.f326056e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f326053b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f326054c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.f326055d;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
        Long l15 = this.f326056e;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l15);
        }
    }
}
