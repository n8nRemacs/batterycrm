package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class bm extends l4 {
    public static final Parcelable.Creator<bm> CREATOR = new obh(11);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public bm(ArrayList arrayList, boolean z, String str, String str2) {
        s5j.g(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static bm b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(s55.Z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((bjb) it.next()).l());
        }
        return new bm(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return this.b == bmVar.b && syi.c(this.a, bmVar.a) && syi.c(this.c, bmVar.c) && syi.c(this.d, bmVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.j(parcel, this.a, 1);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        a9j.g(parcel, 3, this.c);
        a9j.g(parcel, 4, this.d);
        a9j.l(parcel, iK);
    }
}
