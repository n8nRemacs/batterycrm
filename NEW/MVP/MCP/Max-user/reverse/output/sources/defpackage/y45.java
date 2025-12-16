package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class y45 implements Comparator, Parcelable {
    public static final Parcelable.Creator<y45> CREATOR = new wf4(7);
    public final w45[] a;
    public int b;
    public final String c;
    public final int d;

    public y45(String str, ArrayList arrayList) {
        this(str, false, (w45[]) arrayList.toArray(new w45[0]));
    }

    public final y45 a(String str) {
        return Objects.equals(this.c, str) ? this : new y45(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w45 w45Var = (w45) obj;
        w45 w45Var2 = (w45) obj2;
        UUID uuid = cy0.a;
        return uuid.equals(w45Var.b) ? uuid.equals(w45Var2.b) ? 0 : 1 : w45Var.b.compareTo(w45Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y45.class == obj.getClass()) {
            y45 y45Var = (y45) obj;
            if (Objects.equals(this.c, y45Var.c) && Arrays.equals(this.a, y45Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public y45(String str, boolean z, w45... w45VarArr) {
        this.c = str;
        w45VarArr = z ? (w45[]) w45VarArr.clone() : w45VarArr;
        this.a = w45VarArr;
        this.d = w45VarArr.length;
        Arrays.sort(w45VarArr, this);
    }

    public y45(Parcel parcel) {
        this.c = parcel.readString();
        w45[] w45VarArr = (w45[]) parcel.createTypedArray(w45.CREATOR);
        String str = zxg.a;
        this.a = w45VarArr;
        this.d = w45VarArr.length;
    }
}
