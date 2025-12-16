package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class x45 implements Comparator, Parcelable {
    public static final Parcelable.Creator<x45> CREATOR = new wf4(6);
    public final v45[] a;
    public int b;
    public final String c;

    public x45(String str, ArrayList arrayList) {
        this(str, false, (v45[]) arrayList.toArray(new v45[0]));
    }

    public final x45 a(String str) {
        return xxg.a(this.c, str) ? this : new x45(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        v45 v45Var = (v45) obj;
        v45 v45Var2 = (v45) obj2;
        UUID uuid = ay0.a;
        return uuid.equals(v45Var.b) ? uuid.equals(v45Var2.b) ? 0 : 1 : v45Var.b.compareTo(v45Var2.b);
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
        if (obj != null && x45.class == obj.getClass()) {
            x45 x45Var = (x45) obj;
            if (xxg.a(this.c, x45Var.c) && Arrays.equals(this.a, x45Var.a)) {
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

    public x45(String str, boolean z, v45... v45VarArr) {
        this.c = str;
        v45VarArr = z ? (v45[]) v45VarArr.clone() : v45VarArr;
        this.a = v45VarArr;
        int length = v45VarArr.length;
        Arrays.sort(v45VarArr, this);
    }

    public x45(Parcel parcel) {
        this.c = parcel.readString();
        v45[] v45VarArr = (v45[]) parcel.createTypedArray(v45.CREATOR);
        int i = xxg.a;
        this.a = v45VarArr;
        int length = v45VarArr.length;
    }
}
