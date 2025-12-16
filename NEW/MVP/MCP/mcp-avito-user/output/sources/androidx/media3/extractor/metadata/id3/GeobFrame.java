package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50676d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50677e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f50678f;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i12) {
            return new GeobFrame[i12];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f50675c = str;
        this.f50676d = str2;
        this.f50677e = str3;
        this.f50678f = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return M.a(this.f50675c, geobFrame.f50675c) && M.a(this.f50676d, geobFrame.f50676d) && M.a(this.f50677e, geobFrame.f50677e) && Arrays.equals(this.f50678f, geobFrame.f50678f);
    }

    public final int hashCode() {
        String str = this.f50675c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50676d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50677e;
        return Arrays.hashCode(this.f50678f) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": mimeType=" + this.f50675c + ", filename=" + this.f50676d + ", description=" + this.f50677e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50675c);
        parcel.writeString(this.f50676d);
        parcel.writeString(this.f50677e);
        parcel.writeByteArray(this.f50678f);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50675c = string;
        this.f50676d = parcel.readString();
        this.f50677e = parcel.readString();
        this.f50678f = parcel.createByteArray();
    }
}
