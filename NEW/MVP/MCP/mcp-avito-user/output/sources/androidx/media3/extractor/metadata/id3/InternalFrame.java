package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;

@J
/* loaded from: classes.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f50680c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50681d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50682e;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i12) {
            return new InternalFrame[i12];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f50680c = str;
        this.f50681d = str2;
        this.f50682e = str3;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return M.a(this.f50681d, internalFrame.f50681d) && M.a(this.f50680c, internalFrame.f50680c) && M.a(this.f50682e, internalFrame.f50682e);
    }

    public final int hashCode() {
        String str = this.f50680c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f50681d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f50682e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f50679b + ": domain=" + this.f50680c + ", description=" + this.f50681d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50679b);
        parcel.writeString(this.f50680c);
        parcel.writeString(this.f50682e);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50680c = string;
        this.f50681d = parcel.readString();
        this.f50682e = parcel.readString();
    }
}
