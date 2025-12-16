package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q52 {
    public final h52 a;

    public q52() {
        HashSet hashSet = new HashSet();
        x8a x8aVarB = x8a.b();
        ArrayList arrayList = new ArrayList();
        g9a g9aVarA = g9a.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        fjb fjbVarA = fjb.a(x8aVarB);
        ArrayList arrayList3 = new ArrayList(arrayList);
        ryf ryfVar = ryf.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = g9aVarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.a = new h52(arrayList2, fjbVarA, -1, false, arrayList3, false, new ryf(arrayMap), null);
    }
}
