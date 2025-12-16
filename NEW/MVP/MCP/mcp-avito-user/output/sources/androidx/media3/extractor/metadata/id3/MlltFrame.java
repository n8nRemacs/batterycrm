package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final int f50683c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50684d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50685e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f50686f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f50687g;

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
        this.f50683c = i12;
        this.f50684d = i13;
        this.f50685e = i14;
        this.f50686f = iArr;
        this.f50687g = iArr2;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f50683c == mlltFrame.f50683c && this.f50684d == mlltFrame.f50684d && this.f50685e == mlltFrame.f50685e && Arrays.equals(this.f50686f, mlltFrame.f50686f) && Arrays.equals(this.f50687g, mlltFrame.f50687g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50687g) + ((Arrays.hashCode(this.f50686f) + ((((((527 + this.f50683c) * 31) + this.f50684d) * 31) + this.f50685e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f50683c);
        parcel.writeInt(this.f50684d);
        parcel.writeInt(this.f50685e);
        parcel.writeIntArray(this.f50686f);
        parcel.writeIntArray(this.f50687g);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f50683c = parcel.readInt();
        this.f50684d = parcel.readInt();
        this.f50685e = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i12 = M.f47887a;
        this.f50686f = iArrCreateIntArray;
        this.f50687g = parcel.createIntArray();
    }
}
