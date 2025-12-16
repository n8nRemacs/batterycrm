package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zmd {
    public gy0 a;
    public final ga7 b;
    public final String c;
    public final j17 d;
    public final vfi e;
    public final Map f;

    public zmd(ga7 ga7Var, String str, j17 j17Var, vfi vfiVar, Map map) {
        this.b = ga7Var;
        this.c = str;
        this.d = j17Var;
        this.e = vfiVar;
        this.f = map;
    }

    public final kw6 a() {
        kw6 kw6Var = new kw6();
        kw6Var.o = new LinkedHashMap();
        kw6Var.a = this.b;
        kw6Var.b = this.c;
        kw6Var.d = this.e;
        Map map = this.f;
        kw6Var.o = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        kw6Var.c = this.d.c();
        return kw6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        j17 j17Var = this.d;
        if (j17Var.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : j17Var) {
                int i2 = i + 1;
                if (i < 0) {
                    ve3.p();
                    throw null;
                }
                imb imbVar = (imb) obj;
                String str = (String) imbVar.a;
                String str2 = (String) imbVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.f;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}
