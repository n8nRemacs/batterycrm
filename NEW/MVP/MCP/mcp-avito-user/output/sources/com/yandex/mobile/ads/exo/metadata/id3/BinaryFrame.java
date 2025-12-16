package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f382983b;

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
        this.f382983b = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f383002a.equals(binaryFrame.f383002a) && Arrays.equals(this.f382983b, binaryFrame.f382983b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f382983b) + v2.a(this.f383002a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383002a);
        parcel.writeByteArray(this.f382983b);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) pc1.a(parcel.readString()));
        this.f382983b = (byte[]) pc1.a(parcel.createByteArray());
    }
}
