package com.avito.android.video_requirements.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: VideoRequirementsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_requirements/deeplink/VideoRequirementsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class VideoRequirementsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VideoRequirementsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f326003b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f326004c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f326005d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Long f326006e;

    /* compiled from: VideoRequirementsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VideoRequirementsLink> {
        @Override // android.os.Parcelable.Creator
        public final VideoRequirementsLink createFromParcel(Parcel parcel) {
            return new VideoRequirementsLink(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRequirementsLink[] newArray(int i12) {
            return new VideoRequirementsLink[i12];
        }
    }

    public VideoRequirementsLink(@l Long l12, @l Long l13, @l Long l14, @l Long l15) {
        this.f326003b = l12;
        this.f326004c = l13;
        this.f326005d = l14;
        this.f326006e = l15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f326003b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f326004c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Long l14 = this.f326005d;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l14);
        }
        Long l15 = this.f326006e;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l15);
        }
    }
}
