package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.B;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50656c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f50657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f50658e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f50659f;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i12) {
            return new ApicFrame[i12];
        }
    }

    public ApicFrame(String str, @P String str2, int i12, byte[] bArr) {
        super("APIC");
        this.f50656c = str;
        this.f50657d = str2;
        this.f50658e = i12;
        this.f50659f = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) {
        bVar.b(this.f50658e, this.f50659f);
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f50658e == apicFrame.f50658e && M.a(this.f50656c, apicFrame.f50656c) && M.a(this.f50657d, apicFrame.f50657d) && Arrays.equals(this.f50659f, apicFrame.f50659f);
    }

    public final int hashCode() {
        int i12 = (527 + this.f50658e) * 31;
        String str = this.f50656c;
        int iHashCode = (i12 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50657d;
        return Arrays.hashCode(this.f50659f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": mimeType=" + this.f50656c + ", description=" + this.f50657d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50656c);
        parcel.writeString(this.f50657d);
        parcel.writeInt(this.f50658e);
        parcel.writeByteArray(this.f50659f);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50656c = string;
        this.f50657d = parcel.readString();
        this.f50658e = parcel.readInt();
        this.f50659f = parcel.createByteArray();
    }
}
