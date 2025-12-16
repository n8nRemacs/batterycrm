package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s45 implements Parcelable {
    public static final Parcelable.Creator<s45> CREATOR = new wf4(5);
    public final int a;
    public final float[] b;

    public s45(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s45.class != obj.getClass()) {
            return false;
        }
        s45 s45Var = (s45) obj;
        if (this.a != s45Var.a) {
            return false;
        }
        return Arrays.equals(this.b, s45Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? az1.v(i) : 0) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeFloatArray(this.b);
        int i2 = this.a;
        if (i2 == 1) {
            str = "LINE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "CUBIC_BEZIER";
        }
        parcel.writeString(str);
    }

    public s45(Parcel parcel) {
        int i;
        this.b = parcel.createFloatArray();
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("LINE")) {
            i = 1;
        } else {
            if (!string.equals("CUBIC_BEZIER")) {
                throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.DrawingPrimitive.Type.".concat(string));
            }
            i = 2;
        }
        this.a = i;
    }
}
