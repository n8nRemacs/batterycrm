package com.yandex.mobile.ads.exo.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class VorbisComment extends com.yandex.mobile.ads.exo.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        public final VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VorbisComment[] newArray(int i12) {
            return new VorbisComment[i12];
        }
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
