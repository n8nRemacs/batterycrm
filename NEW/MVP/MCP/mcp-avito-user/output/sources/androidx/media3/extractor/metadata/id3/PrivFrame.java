package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50688c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f50689d;

    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i12) {
            return new PrivFrame[i12];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f50688c = str;
        this.f50689d = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return M.a(this.f50688c, privFrame.f50688c) && Arrays.equals(this.f50689d, privFrame.f50689d);
    }

    public final int hashCode() {
        String str = this.f50688c;
        return Arrays.hashCode(this.f50689d) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": owner=" + this.f50688c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50688c);
        parcel.writeByteArray(this.f50689d);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50688c = string;
        this.f50689d = parcel.createByteArray();
    }
}
