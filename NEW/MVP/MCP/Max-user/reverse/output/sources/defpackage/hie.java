package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class hie {
    public static final List i = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final kb0 b;
    public final List c;
    public final List d;
    public final List e;
    public final fie f;
    public final h52 g;
    public final InputConfiguration h;

    public hie(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, h52 h52Var, fie fieVar, InputConfiguration inputConfiguration, kb0 kb0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = fieVar;
        this.g = h52Var;
        this.h = inputConfiguration;
        this.b = kb0Var;
    }

    public static hie a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        x8a x8aVarB = x8a.b();
        ArrayList arrayList5 = new ArrayList();
        g9a g9aVarA = g9a.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        fjb fjbVarA = fjb.a(x8aVarB);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        ryf ryfVar = ryf.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9aVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new hie(arrayList, arrayList2, arrayList3, arrayList4, new h52(arrayList6, fjbVarA, -1, false, arrayList7, false, new ryf(arrayMap), null), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            kb0 kb0Var = (kb0) it.next();
            arrayList.add(kb0Var.a);
            Iterator it2 = kb0Var.b.iterator();
            while (it2.hasNext()) {
                arrayList.add((zr4) it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
