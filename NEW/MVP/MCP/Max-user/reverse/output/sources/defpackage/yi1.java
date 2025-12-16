package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class yi1 {
    public static final imb t = new imb("peerid", "WEB_SOCKET");
    public ti1 a;
    public final p8a b;
    public final r8a c;
    public final ArrayList d;
    public final List e;
    public final HashMap f;
    public xi1 g;
    public boolean h;
    public float i;
    public jea j;
    public imb k;
    public String l;
    public String m;
    public long n;
    public boolean o;
    public boolean p;
    public o81 q;
    public List r;
    public int s;

    public yi1(ti1 ti1Var, imb imbVar, p8a p8aVar, r8a r8aVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
        this.f = new HashMap();
        this.g = new xi1(Boolean.FALSE);
        this.i = 1.0f;
        this.j = jea.a;
        this.r = Collections.EMPTY_LIST;
        this.s = 0;
        this.a = ti1Var;
        g(imbVar);
        this.b = p8aVar == null ? new p8a() : p8aVar;
        this.c = r8aVar == null ? new r8a() : r8aVar;
    }

    public static boolean d(imb imbVar) {
        return t.equals(imbVar);
    }

    public final imb a() {
        return this.k;
    }

    public final boolean b() {
        wi1 wi1Var = wi1.b;
        List list = this.e;
        return list.contains(wi1Var) || list.contains(wi1.a);
    }

    public final boolean c() {
        return this.k != null;
    }

    public final boolean e() {
        return f() && this.p;
    }

    public final boolean equals(Object obj) {
        ti1 ti1Var;
        if (this == obj) {
            return true;
        }
        return obj != null && yi1.class == obj.getClass() && (ti1Var = this.a) != null && ti1Var.equals(((yi1) obj).a);
    }

    public final boolean f() {
        return this.c.e && this.o;
    }

    public final boolean g(imb imbVar) {
        if (imbVar == null || TextUtils.isEmpty((CharSequence) imbVar.a) || Objects.equals(this.k, imbVar)) {
            return false;
        }
        if (this.k == null) {
            this.n = System.currentTimeMillis();
        }
        this.k = imbVar;
        imb imbVar2 = (imb) this.f.get(imbVar);
        if (imbVar2 == null) {
            return true;
        }
        this.m = (String) imbVar2.a;
        this.l = (String) imbVar2.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipant{");
        sb.append(this.a);
        if (this.k != null || !this.f.isEmpty()) {
            sb.append("|registered");
        }
        imb imbVar = this.k;
        if (imbVar != null) {
            sb.append("|accepted(");
            sb.append((String) imbVar.a);
            sb.append(',');
            sb.append(this.m);
            sb.append('/');
            sb.append(this.l);
            sb.append(')');
        }
        if (this.h) {
            sb.append("|connected");
        }
        sb.append('|');
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
