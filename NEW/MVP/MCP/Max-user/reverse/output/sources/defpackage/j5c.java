package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class j5c implements ree, iz0 {
    public final String a;
    public final ar6 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public j5c(String str, ar6 ar6Var, int i) {
        this.a = str;
        this.b = ar6Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = id5.a;
        final int i4 = 0;
        this.i = ipi.b(2, new cm6(this) { // from class: i5c
            public final /* synthetic */ j5c b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ar6 ar6Var2 = this.b.b;
                        return ar6Var2 != null ? ar6Var2.c() : pfi.a;
                    case 1:
                        return ofi.b(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        j5c j5cVar = this.b;
                        return Integer.valueOf(h5j.a(j5cVar, (ree[]) j5cVar.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = ipi.b(2, new cm6(this) { // from class: i5c
            public final /* synthetic */ j5c b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ar6 ar6Var2 = this.b.b;
                        return ar6Var2 != null ? ar6Var2.c() : pfi.a;
                    case 1:
                        return ofi.b(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        j5c j5cVar = this.b;
                        return Integer.valueOf(h5j.a(j5cVar, (ree[]) j5cVar.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = ipi.b(2, new cm6(this) { // from class: i5c
            public final /* synthetic */ j5c b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ar6 ar6Var2 = this.b.b;
                        return ar6Var2 != null ? ar6Var2.c() : pfi.a;
                    case 1:
                        return ofi.b(this.b.b != null ? new ArrayList(0) : null);
                    default:
                        j5c j5cVar = this.b;
                        return Integer.valueOf(h5j.a(j5cVar, (ree[]) j5cVar.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.ree
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.iz0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.ree
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.ree
    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.ree
    public s9j e() {
        return nnf.b;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5c) {
            ree reeVar = (ree) obj;
            if (fni.a(this.a, reeVar.a()) && Arrays.equals((ree[]) this.j.getValue(), (ree[]) ((j5c) obj).j.getValue())) {
                int iF = reeVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (fni.a(i(i2).a(), reeVar.i(i2).a()) && fni.a(i(i2).e(), reeVar.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ree
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ree
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return hd5.a;
    }

    @Override // defpackage.ree
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? hd5.a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ree
    public ree i(int i) {
        return ((zy7[]) this.i.getValue())[i].d();
    }

    @Override // defpackage.ree
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return ue3.N(n7j.h(0, this.c), ", ", u45.l(new StringBuilder(), this.a, '('), ")", new iqb(8, this), 24);
    }
}
