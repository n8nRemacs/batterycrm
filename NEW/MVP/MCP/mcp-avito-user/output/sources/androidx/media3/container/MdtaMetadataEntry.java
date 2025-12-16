package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f48111b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f48112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f48113d;

    /* renamed from: e, reason: collision with root package name */
    public final int f48114e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i12) {
            return new MdtaMetadataEntry[i12];
        }
    }

    public MdtaMetadataEntry(int i12, int i13, String str, byte[] bArr) {
        this.f48111b = str;
        this.f48112c = bArr;
        this.f48113d = i12;
        this.f48114e = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f48111b.equals(mdtaMetadataEntry.f48111b) && Arrays.equals(this.f48112c, mdtaMetadataEntry.f48112c) && this.f48113d == mdtaMetadataEntry.f48113d && this.f48114e == mdtaMetadataEntry.f48114e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f48112c) + H.d(527, 31, this.f48111b)) * 31) + this.f48113d) * 31) + this.f48114e;
    }

    public final String toString() {
        String strO;
        byte[] bArr = this.f48112c;
        int i12 = this.f48114e;
        if (i12 == 1) {
            strO = M.o(bArr);
        } else if (i12 == 23) {
            int i13 = M.f47887a;
            C23110a.b(bArr.length == 4);
            strO = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
        } else if (i12 != 67) {
            strO = M.O(bArr);
        } else {
            int i14 = M.f47887a;
            C23110a.b(bArr.length == 4);
            strO = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
        }
        return G.g(new StringBuilder("mdta: key="), this.f48111b, ", value=", strO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f48111b);
        parcel.writeByteArray(this.f48112c);
        parcel.writeInt(this.f48113d);
        parcel.writeInt(this.f48114e);
    }

    public MdtaMetadataEntry(Parcel parcel, a aVar) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f48111b = string;
        this.f48112c = parcel.createByteArray();
        this.f48113d = parcel.readInt();
        this.f48114e = parcel.readInt();
    }
}
