package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.B;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.huawei.hms.framework.common.ContainerUtils;
import j.P;

@J
@Deprecated
/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f50642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50643c;

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
        this.f50642b = str;
        this.f50643c = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) {
        String str;
        String str2 = this.f50642b;
        str2.getClass();
        str = this.f50643c;
        switch (str2) {
            case "ALBUM":
                bVar.f47188c = str;
                break;
            case "TITLE":
                bVar.f47186a = str;
                break;
            case "DESCRIPTION":
                bVar.f47192g = str;
                break;
            case "ALBUMARTIST":
                bVar.f47189d = str;
                break;
            case "ARTIST":
                bVar.f47187b = str;
                break;
        }
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
        return this.f50642b.equals(vorbisComment.f50642b) && this.f50643c.equals(vorbisComment.f50643c);
    }

    public final int hashCode() {
        return this.f50643c.hashCode() + H.d(527, 31, this.f50642b);
    }

    public final String toString() {
        return "VC: " + this.f50642b + ContainerUtils.KEY_VALUE_DELIMITER + this.f50643c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50642b);
        parcel.writeString(this.f50643c);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50642b = string;
        this.f50643c = parcel.readString();
    }
}
