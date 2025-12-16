package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f345674c;

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
        this.f345674c = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f345693b.equals(binaryFrame.f345693b) && Arrays.equals(this.f345674c, binaryFrame.f345674c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f345674c) + H.d(527, 31, this.f345693b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345693b);
        parcel.writeByteArray(this.f345674c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryFrame(Parcel parcel) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        super(string);
        this.f345674c = parcel.createByteArray();
    }
}
