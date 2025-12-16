package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.P;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.U;
import com.huawei.hms.framework.common.ContainerUtils;
import j.P;

@Deprecated
/* loaded from: classes6.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f345656b;

    /* renamed from: c, reason: collision with root package name */
    public final String f345657c;

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
        this.f345656b = str;
        this.f345657c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f345656b.equals(vorbisComment.f345656b) && this.f345657c.equals(vorbisComment.f345657c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void f4(P.b bVar) {
        String str;
        String str2 = this.f345656b;
        str2.getClass();
        str = this.f345657c;
        switch (str2) {
            case "ALBUM":
                bVar.f343642c = str;
                break;
            case "TITLE":
                bVar.f343640a = str;
                break;
            case "DESCRIPTION":
                bVar.f343646g = str;
                break;
            case "ALBUMARTIST":
                bVar.f343643d = str;
                break;
            case "ARTIST":
                bVar.f343641b = str;
                break;
        }
    }

    public final int hashCode() {
        return this.f345657c.hashCode() + H.d(527, 31, this.f345656b);
    }

    public final String toString() {
        return "VC: " + this.f345656b + ContainerUtils.KEY_VALUE_DELIMITER + this.f345657c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345656b);
        parcel.writeString(this.f345657c);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345656b = string;
        this.f345657c = parcel.readString();
    }
}
