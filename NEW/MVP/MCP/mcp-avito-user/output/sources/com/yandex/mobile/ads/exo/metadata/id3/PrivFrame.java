package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f383011b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f383012c;

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
        this.f383011b = str;
        this.f383012c = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return pc1.a(this.f383011b, privFrame.f383011b) && Arrays.equals(this.f383012c, privFrame.f383012c);
    }

    public final int hashCode() {
        String str = this.f383011b;
        return Arrays.hashCode(this.f383012c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": owner=" + this.f383011b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383011b);
        parcel.writeByteArray(this.f383012c);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f383011b = (String) pc1.a(parcel.readString());
        this.f383012c = (byte[]) pc1.a(parcel.createByteArray());
    }
}
