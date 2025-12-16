package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cki extends l4 {
    public static final Parcelable.Creator<cki> CREATOR = new wci(22);
    public final cki X;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final jli o;

    static {
        Process.myUid();
        Process.myPid();
    }

    public cki(int i, String str, String str2, String str3, ArrayList arrayList, cki ckiVar) {
        if (ckiVar != null && ckiVar.X != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? ckiVar != null ? ckiVar.d : null : str3;
        AbstractCollection abstractCollection = arrayList;
        if (arrayList == null) {
            AbstractCollection abstractCollection2 = ckiVar != null ? ckiVar.o : null;
            abstractCollection = abstractCollection2;
            if (abstractCollection2 == null) {
                fli fliVar = jli.b;
                abstractCollection = lli.o;
            }
        }
        fli fliVar2 = jli.b;
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        this.o = length == 0 ? lli.o : new lli(length, array);
        this.X = ckiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cki)) {
            return false;
        }
        cki ckiVar = (cki) obj;
        return this.a == ckiVar.a && fni.a(this.b, ckiVar.b) && fni.a(this.c, ckiVar.c) && fni.a(this.d, ckiVar.d) && fni.a(this.X, ckiVar.X) && fni.a(this.o, ckiVar.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.X});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (dnf.r(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 3, this.b);
        a9j.g(parcel, 4, this.c);
        a9j.g(parcel, 6, this.d);
        a9j.f(parcel, 7, this.X, i);
        a9j.j(parcel, this.o, 8);
        a9j.l(parcel, iK);
    }
}
