package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.B;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import com.google.common.base.C37262f;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f50634b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50635c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50636d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50637e;

    /* renamed from: f, reason: collision with root package name */
    public final int f50638f;

    /* renamed from: g, reason: collision with root package name */
    public final int f50639g;

    /* renamed from: h, reason: collision with root package name */
    public final int f50640h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f50641i;

    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i12) {
            return new PictureFrame[i12];
        }
    }

    public PictureFrame(int i12, String str, String str2, int i13, int i14, int i15, int i16, byte[] bArr) {
        this.f50634b = i12;
        this.f50635c = str;
        this.f50636d = str2;
        this.f50637e = i13;
        this.f50638f = i14;
        this.f50639g = i15;
        this.f50640h = i16;
        this.f50641i = bArr;
    }

    public static PictureFrame a(z zVar) {
        int iG2 = zVar.g();
        String strS = zVar.s(zVar.g(), C37262f.f359032a);
        String strS2 = zVar.s(zVar.g(), C37262f.f359034c);
        int iG3 = zVar.g();
        int iG4 = zVar.g();
        int iG5 = zVar.g();
        int iG6 = zVar.g();
        int iG7 = zVar.g();
        byte[] bArr = new byte[iG7];
        zVar.e(0, iG7, bArr);
        return new PictureFrame(iG2, strS, strS2, iG3, iG4, iG5, iG6, bArr);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) {
        bVar.b(this.f50634b, this.f50641i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f50634b == pictureFrame.f50634b && this.f50635c.equals(pictureFrame.f50635c) && this.f50636d.equals(pictureFrame.f50636d) && this.f50637e == pictureFrame.f50637e && this.f50638f == pictureFrame.f50638f && this.f50639g == pictureFrame.f50639g && this.f50640h == pictureFrame.f50640h && Arrays.equals(this.f50641i, pictureFrame.f50641i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50641i) + ((((((((H.d(H.d((527 + this.f50634b) * 31, 31, this.f50635c), 31, this.f50636d) + this.f50637e) * 31) + this.f50638f) * 31) + this.f50639g) * 31) + this.f50640h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f50635c + ", description=" + this.f50636d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f50634b);
        parcel.writeString(this.f50635c);
        parcel.writeString(this.f50636d);
        parcel.writeInt(this.f50637e);
        parcel.writeInt(this.f50638f);
        parcel.writeInt(this.f50639g);
        parcel.writeInt(this.f50640h);
        parcel.writeByteArray(this.f50641i);
    }

    public PictureFrame(Parcel parcel) {
        this.f50634b = parcel.readInt();
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50635c = string;
        this.f50636d = parcel.readString();
        this.f50637e = parcel.readInt();
        this.f50638f = parcel.readInt();
        this.f50639g = parcel.readInt();
        this.f50640h = parcel.readInt();
        this.f50641i = parcel.createByteArray();
    }
}
