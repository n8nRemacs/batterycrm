package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class rv3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public long e;
    public List f;
    public long g;
    public long h;
    public xv3 i;
    public int j;
    public yv3 k;
    public int l;
    public int m;
    public List n;
    public String o;
    public String p;
    public String q;
    public long r;
    public long s;
    public long t;
    public uv3 u;
    public int[] v;
    public wv3 w;

    public final zv3 a() {
        if (this.k == null) {
            this.k = yv3.b;
        }
        if (this.l == 0) {
            this.l = 1;
        }
        if (this.n == null) {
            this.n = Collections.EMPTY_LIST;
        }
        List list = this.f;
        if (list == null || list.isEmpty()) {
            this.f = Collections.singletonList(tv3.e);
        }
        if (this.v == null) {
            this.v = new int[0];
        }
        return new zv3(this);
    }
}
