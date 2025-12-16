package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zv3 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final xv3 i;
    public final int j;
    public final yv3 k;
    public final int l;
    public final int m;
    public final List n;
    public final String o;
    public final String p;
    public final String q;
    public final long r;
    public final long s;
    public final long t;
    public final uv3 u;
    public final int[] v;
    public final wv3 w;

    public zv3(rv3 rv3Var) {
        this.a = rv3Var.a;
        this.b = rv3Var.d;
        this.c = rv3Var.b;
        this.d = rv3Var.c;
        this.e = rv3Var.e;
        ArrayList arrayList = new ArrayList(rv3Var.f);
        arrayList.removeIf(new gb3(3));
        arrayList.sort(Comparator.comparing(new m0(10)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = rv3Var.g;
        this.h = rv3Var.h;
        this.i = rv3Var.i;
        this.j = rv3Var.j;
        this.k = rv3Var.k;
        this.l = rv3Var.l;
        this.m = rv3Var.m;
        this.n = rv3Var.n;
        this.o = rv3Var.o;
        this.p = rv3Var.p;
        this.q = rv3Var.q;
        this.r = rv3Var.r;
        this.s = rv3Var.s;
        this.t = rv3Var.t;
        this.u = rv3Var.u;
        this.v = rv3Var.v;
        this.w = rv3Var.w;
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((tv3) list.get(0)).equals(tv3.e);
    }

    public final rv3 b() {
        rv3 rv3Var = new rv3();
        rv3Var.a = this.a;
        rv3Var.b = this.c;
        rv3Var.c = this.d;
        rv3Var.d = this.b;
        rv3Var.e = this.e;
        rv3Var.f = new ArrayList(this.f);
        rv3Var.g = this.g;
        rv3Var.h = this.h;
        rv3Var.i = this.i;
        rv3Var.k = this.k;
        rv3Var.l = this.l;
        rv3Var.m = this.m;
        rv3Var.n = new ArrayList(this.n);
        rv3Var.o = this.o;
        rv3Var.p = this.p;
        rv3Var.q = this.q;
        rv3Var.r = this.r;
        rv3Var.s = this.s;
        rv3Var.t = this.t;
        rv3Var.u = this.u;
        rv3Var.v = this.v;
        return rv3Var;
    }

    public final String toString() {
        boolean zA = wqi.a();
        long j = this.s;
        List list = this.n;
        yv3 yv3Var = this.k;
        List list2 = this.f;
        String str = this.c;
        long j2 = this.a;
        if (!zA) {
            StringBuilder sb = new StringBuilder();
            sb.append(zv3.class.getSimpleName());
            sb.append("{serverId=");
            sb.append(j2);
            sb.append(",baseUrl=");
            sb.append(str);
            sb.append(",names=");
            sb.append(list2);
            sb.append(",type=");
            sb.append(yv3Var);
            sb.append(",options=");
            sb.append(list);
            return u45.i(j, ",lastSyncTime=", "}", sb);
        }
        StringBuilder sbL = az1.l(j2, "ContactData{serverId=", ", deviceAvatarUrl='");
        sbL.append(l8g.d(this.b));
        sbL.append("', baseUrl='");
        sbL.append(str);
        sbL.append("', baseRawUrl='");
        sbL.append(this.d);
        sbL.append("', photoId=");
        sbL.append(this.e);
        sbL.append(", names=");
        sbL.append(list2);
        sbL.append(", lastUpdateTime=");
        sbL.append(this.g);
        sbL.append(", serverPhone=");
        sbL.append(this.h);
        sbL.append(", status=");
        sbL.append(this.i);
        sbL.append(", type=");
        sbL.append(yv3Var);
        sbL.append(", gender=");
        sbL.append(hf3.k(this.l));
        sbL.append(", settings=");
        sbL.append(this.m);
        sbL.append(", options=");
        sbL.append(list);
        sbL.append(", description='");
        sbL.append(this.o);
        sbL.append("', link='");
        sbL.append(this.p);
        sbL.append("', birthday='");
        sbL.append(this.q);
        sbL.append("', lastSearchClickTime=");
        sbL.append(this.r);
        az1.r(j, ", lastSyncTime=", ", lastShowingUnknownContactBar=", sbL);
        sbL.append(this.t);
        sbL.append("', menuButton=");
        sbL.append(this.u);
        sbL.append(", profileOptions=");
        sbL.append(this.v);
        sbL.append('}');
        return sbL.toString();
    }
}
