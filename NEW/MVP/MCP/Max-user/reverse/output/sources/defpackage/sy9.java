package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class sy9 implements Parcelable {
    public static final Parcelable.Creator<sy9> CREATOR = new pq8(10);
    public final qy9[] a;

    public sy9(qy9... qy9VarArr) {
        this.a = qy9VarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sy9.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((sy9) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qy9[] qy9VarArr = this.a;
        parcel.writeInt(qy9VarArr.length);
        for (qy9 qy9Var : qy9VarArr) {
            parcel.writeParcelable(qy9Var, 0);
        }
    }

    public sy9(List list) {
        this.a = (qy9[]) list.toArray(new qy9[0]);
    }

    public sy9(Parcel parcel) {
        this.a = new qy9[parcel.readInt()];
        int i = 0;
        while (true) {
            qy9[] qy9VarArr = this.a;
            if (i >= qy9VarArr.length) {
                return;
            }
            qy9VarArr[i] = (qy9) parcel.readParcelable(qy9.class.getClassLoader());
            i++;
        }
    }
}
