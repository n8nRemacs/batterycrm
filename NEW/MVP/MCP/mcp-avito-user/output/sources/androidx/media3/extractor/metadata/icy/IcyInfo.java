package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.B;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f50650b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f50651c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f50652d;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i12) {
            return new IcyInfo[i12];
        }
    }

    public IcyInfo(byte[] bArr, @P String str, @P String str2) {
        this.f50650b = bArr;
        this.f50651c = str;
        this.f50652d = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void J5(B.b bVar) {
        String str = this.f50651c;
        if (str != null) {
            bVar.f47186a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f50650b, ((IcyInfo) obj).f50650b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f50650b);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f50651c + "\", url=\"" + this.f50652d + "\", rawMetadata.length=\"" + this.f50650b.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByteArray(this.f50650b);
        parcel.writeString(this.f50651c);
        parcel.writeString(this.f50652d);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f50650b = bArrCreateByteArray;
        this.f50651c = parcel.readString();
        this.f50652d = parcel.readString();
    }
}
