package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f50660c;

    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i12) {
            return new BinaryFrame[i12];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f50660c = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f50679b.equals(binaryFrame.f50679b) && Arrays.equals(this.f50660c, binaryFrame.f50660c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50660c) + H.d(527, 31, this.f50679b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50679b);
        parcel.writeByteArray(this.f50660c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        super(string);
        this.f50660c = parcel.createByteArray();
    }
}
