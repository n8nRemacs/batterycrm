package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s69 {
    public static final bie e;
    public static final o3c f;
    public final bie a;
    public final o3c b;
    public final wg7 c;
    public final wg7 d;

    static {
        HashSet hashSet = new HashSet();
        zjd zjdVar = aie.d;
        for (int i = 0; i < zjdVar.d; i++) {
            hashSet.add(new aie(((Integer) zjdVar.get(i)).intValue()));
        }
        e = new bie(hashSet);
        HashSet hashSet2 = new HashSet();
        zjd zjdVar2 = aie.e;
        for (int i2 = 0; i2 < zjdVar2.d; i2++) {
            hashSet2.add(new aie(((Integer) zjdVar2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < zjdVar.d; i3++) {
            hashSet2.add(new aie(((Integer) zjdVar.get(i3)).intValue()));
        }
        new bie(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : a3b.c) {
            hsi.g(!false);
            sparseBooleanArray.append(i4, true);
        }
        hsi.g(!false);
        f = new o3c(new a26(sparseBooleanArray));
    }

    public s69(bie bieVar, o3c o3cVar, wg7 wg7Var, wg7 wg7Var2) {
        this.a = bieVar;
        this.b = o3cVar;
        this.c = wg7Var;
        this.d = wg7Var2;
    }
}
