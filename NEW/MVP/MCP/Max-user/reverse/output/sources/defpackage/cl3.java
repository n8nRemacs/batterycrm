package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class cl3 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final rl3 f;
    public final Set g;

    public cl3(String str, Set set, Set set2, int i, int i2, rl3 rl3Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = rl3Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static bl3 a(fsc fscVar) {
        fsc[] fscVarArr = new fsc[0];
        bl3 bl3Var = new bl3();
        bl3Var.a = null;
        HashSet hashSet = new HashSet();
        bl3Var.d = hashSet;
        bl3Var.e = new HashSet();
        bl3Var.b = 0;
        bl3Var.c = 0;
        bl3Var.f = new HashSet();
        hashSet.add(fscVar);
        for (fsc fscVar2 : fscVarArr) {
            v5j.a(fscVar2, "Null interface");
        }
        Collections.addAll((HashSet) bl3Var.d, fscVarArr);
        return bl3Var;
    }

    public static bl3 b(Class cls) {
        return new bl3(cls, new Class[0]);
    }

    public static cl3 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(fsc.a(cls));
        for (Class cls2 : clsArr) {
            v5j.a(cls2, "Null interface");
            hashSet.add(fsc.a(cls2));
        }
        return new cl3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i62(12, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
