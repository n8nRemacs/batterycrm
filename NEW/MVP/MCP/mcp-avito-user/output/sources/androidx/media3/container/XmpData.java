package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f48117b;

    public class a implements Parcelable.Creator<XmpData> {
        @Override // android.os.Parcelable.Creator
        public final XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final XmpData[] newArray(int i12) {
            return new XmpData[i12];
        }
    }

    public XmpData(Parcel parcel, a aVar) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i12 = M.f47887a;
        this.f48117b = bArrCreateByteArray;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f48117b, ((XmpData) obj).f48117b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f48117b);
    }

    public final String toString() {
        return "XMP: " + M.O(this.f48117b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByteArray(this.f48117b);
    }
}
