package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f383006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f383007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f383008d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f383009e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f383010f;

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
        this.f383006b = i12;
        this.f383007c = i13;
        this.f383008d = i14;
        this.f383009e = iArr;
        this.f383010f = iArr2;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f383006b == mlltFrame.f383006b && this.f383007c == mlltFrame.f383007c && this.f383008d == mlltFrame.f383008d && Arrays.equals(this.f383009e, mlltFrame.f383009e) && Arrays.equals(this.f383010f, mlltFrame.f383010f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f383010f) + ((Arrays.hashCode(this.f383009e) + ((((((this.f383006b + 527) * 31) + this.f383007c) * 31) + this.f383008d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f383006b);
        parcel.writeInt(this.f383007c);
        parcel.writeInt(this.f383008d);
        parcel.writeIntArray(this.f383009e);
        parcel.writeIntArray(this.f383010f);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f383006b = parcel.readInt();
        this.f383007c = parcel.readInt();
        this.f383008d = parcel.readInt();
        this.f383009e = (int[]) pc1.a(parcel.createIntArray());
        this.f383010f = (int[]) pc1.a(parcel.createIntArray());
    }
}
