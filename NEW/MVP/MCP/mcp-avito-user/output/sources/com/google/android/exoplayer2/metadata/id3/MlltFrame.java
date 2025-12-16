package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final int f345697c;

    /* renamed from: d, reason: collision with root package name */
    public final int f345698d;

    /* renamed from: e, reason: collision with root package name */
    public final int f345699e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f345700f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f345701g;

    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i12) {
            return new MlltFrame[i12];
        }
    }

    public MlltFrame(int i12, int i13, int i14, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f345697c = i12;
        this.f345698d = i13;
        this.f345699e = i14;
        this.f345700f = iArr;
        this.f345701g = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f345697c == mlltFrame.f345697c && this.f345698d == mlltFrame.f345698d && this.f345699e == mlltFrame.f345699e && Arrays.equals(this.f345700f, mlltFrame.f345700f) && Arrays.equals(this.f345701g, mlltFrame.f345701g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f345701g) + ((Arrays.hashCode(this.f345700f) + ((((((527 + this.f345697c) * 31) + this.f345698d) * 31) + this.f345699e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f345697c);
        parcel.writeInt(this.f345698d);
        parcel.writeInt(this.f345699e);
        parcel.writeIntArray(this.f345700f);
        parcel.writeIntArray(this.f345701g);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f345697c = parcel.readInt();
        this.f345698d = parcel.readInt();
        this.f345699e = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i12 = U.f348106a;
        this.f345700f = iArrCreateIntArray;
        this.f345701g = parcel.createIntArray();
    }
}
