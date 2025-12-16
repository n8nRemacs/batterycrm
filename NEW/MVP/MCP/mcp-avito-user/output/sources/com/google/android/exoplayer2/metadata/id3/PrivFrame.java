package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f345702c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f345703d;

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
        this.f345702c = str;
        this.f345703d = bArr;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return U.a(this.f345702c, privFrame.f345702c) && Arrays.equals(this.f345703d, privFrame.f345703d);
    }

    public final int hashCode() {
        String str = this.f345702c;
        return Arrays.hashCode(this.f345703d) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f345693b + ": owner=" + this.f345702c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345702c);
        parcel.writeByteArray(this.f345703d);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345702c = string;
        this.f345703d = parcel.createByteArray();
    }
}
