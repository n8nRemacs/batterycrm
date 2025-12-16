package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class gn0 extends mc7 {
    public static final Parcelable.Creator<gn0> CREATOR = new e8(9);
    public final byte[] b;

    public gn0(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gn0.class == obj.getClass()) {
            gn0 gn0Var = (gn0) obj;
            if (this.a.equals(gn0Var.a) && Arrays.equals(this.b, gn0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + u45.e(527, 31, this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gn0(Parcel parcel) {
        String string = parcel.readString();
        int i = xxg.a;
        super(string);
        this.b = parcel.createByteArray();
    }
}
