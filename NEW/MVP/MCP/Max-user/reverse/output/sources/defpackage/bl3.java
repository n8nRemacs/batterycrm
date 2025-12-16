package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class bl3 {
    public String a = null;
    public int b;
    public int c;
    public Object d;
    public Serializable e;
    public Serializable f;
    public Object g;

    public bl3(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet.add(fsc.a(cls));
        for (Class cls2 : clsArr) {
            v5j.a(cls2, "Null interface");
            ((HashSet) this.d).add(fsc.a(cls2));
        }
    }

    public void a(vt4 vt4Var) {
        if (((HashSet) this.d).contains(vt4Var.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(vt4Var);
    }

    public cl3 b() {
        if (((rl3) this.g) != null) {
            return new cl3(this.a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.b, this.c, (rl3) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
