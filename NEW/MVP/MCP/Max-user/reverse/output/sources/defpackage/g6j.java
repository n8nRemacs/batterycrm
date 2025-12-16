package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g6j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.lang.Integer[]] */
    public static final Bundle a(Collection collection) {
        Bundle bundle = new Bundle((collection.size() * 5) + 1);
        bundle.putInt("size", collection.size());
        int[] iArr = new int[collection.size()];
        ?? r2 = new Integer[collection.size()];
        ?? r3 = new Integer[collection.size()];
        ?? r4 = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            b44 b44Var = (b44) obj;
            iArr[i] = b44Var.a;
            bundle.putParcelable(ho7.f(i, "text_"), b44Var.b);
            r2[i] = b44Var.c;
            r3[i] = b44Var.d;
            r4[i] = b44Var.e;
            i = i2;
        }
        bundle.putIntArray("ids", iArr);
        bundle.putSerializable("textColors", r2);
        bundle.putSerializable("icons", r3);
        bundle.putSerializable("iconColors", r4);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ipd] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.ArrayList] */
    public static final List b(Bundle bundle) {
        ?? ipdVar;
        int i;
        int[] intArray;
        try {
            i = bundle.getInt("size");
            intArray = bundle.getIntArray("ids");
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (intArray == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Integer[] numArr = (Integer[]) bundle.getSerializable("textColors");
        Integer[] numArr2 = (Integer[]) bundle.getSerializable("icons");
        Integer[] numArr3 = (Integer[]) bundle.getSerializable("iconColors");
        to7 to7VarH = n7j.h(0, i);
        ipdVar = new ArrayList(we3.q(to7VarH, 10));
        Iterator it = to7VarH.iterator();
        while (((so7) it).c) {
            int iNextInt = ((so7) it).nextInt();
            int i2 = intArray[iNextInt];
            Parcelable parcelable = bundle.getParcelable("text_" + iNextInt);
            if (parcelable == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ipdVar.add(new b44(i2, (s5g) parcelable, numArr[iNextInt], numArr2[iNextInt], numArr3[iNextInt]));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            thA.printStackTrace();
        }
        boolean z = ipdVar instanceof ipd;
        List list = ipdVar;
        if (z) {
            list = null;
        }
        List list2 = list;
        return list2 == null ? hd5.a : list2;
    }

    public static final void c(esg esgVar) {
        esgVar.b(1, new bya(7));
        esgVar.d(604, new cya(12));
        esgVar.b(2, new bya(8));
        esgVar.d(605, new cya(13));
        esgVar.d(606, new cya(14));
        esgVar.d(607, new cya(15));
        esgVar.d(608, new cya(16));
    }
}
