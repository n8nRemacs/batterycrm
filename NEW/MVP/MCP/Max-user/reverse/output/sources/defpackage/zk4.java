package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zk4 {
    public final ic8 a;
    public final ywf b;
    public final int[] c;
    public final int d;
    public final qe4 e;
    public final long f;
    public final h4c g;
    public final wk4[] h;
    public an5 i;
    public zc4 j;
    public int k;
    public BehindLiveWindowException l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zk4] */
    public zk4(ic8 ic8Var, zc4 zc4Var, ywf ywfVar, int i, int[] iArr, an5 an5Var, int i2, qe4 qe4Var, long j, boolean z, ArrayList arrayList, h4c h4cVar) {
        int i3;
        fp5 jj6Var;
        pw0 pw0Var;
        ?? obj = new Object();
        obj.a = ic8Var;
        obj.j = zc4Var;
        obj.b = ywfVar;
        obj.c = iArr;
        obj.i = an5Var;
        obj.d = i2;
        obj.e = qe4Var;
        obj.k = i;
        obj.f = j;
        obj.g = h4cVar;
        long jD = zc4Var.d(i);
        ArrayList arrayListA = obj.a();
        obj.h = new wk4[an5Var.length()];
        int i4 = 0;
        int i5 = 0;
        zk4 zk4Var = obj;
        while (i5 < zk4Var.h.length) {
            xmd xmdVar = (xmd) arrayListA.get(an5Var.f(i5));
            jl0 jl0VarU = ywfVar.u(xmdVar.b);
            wk4[] wk4VarArr = zk4Var.h;
            int i6 = i5;
            jl0VarU = jl0VarU == null ? (jl0) xmdVar.b.get(i4) : jl0VarU;
            gf6 gf6Var = xmdVar.a;
            String str = gf6Var.u0;
            if (wz9.i(str)) {
                if ("application/x-rawcc".equals(str)) {
                    jj6Var = new k8d(gf6Var);
                    i3 = i6;
                } else {
                    i3 = i6;
                    pw0Var = null;
                    pw0 pw0Var2 = pw0Var;
                    int i7 = i3;
                    wk4VarArr[i7] = new wk4(jD, xmdVar, jl0VarU, pw0Var2, 0L, xmdVar.c(), 2);
                    i5 = i7 + 1;
                    zk4Var = this;
                    i4 = 0;
                }
            } else if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                i3 = i6;
                jj6Var = new ir8(1);
            } else {
                i3 = i6;
                jj6Var = new jj6(z ? 4 : 0, null, arrayList, h4cVar);
            }
            pw0Var = new pw0(jj6Var, i2, gf6Var);
            pw0 pw0Var22 = pw0Var;
            int i72 = i3;
            wk4VarArr[i72] = new wk4(jD, xmdVar, jl0VarU, pw0Var22, 0L, xmdVar.c(), 2);
            i5 = i72 + 1;
            zk4Var = this;
            i4 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((w8) list.get(i)).c);
        }
        return arrayList;
    }

    public final wk4 b(int i) {
        wk4[] wk4VarArr = this.h;
        wk4 wk4Var = wk4VarArr[i];
        jl0 jl0VarU = this.b.u(((xmd) wk4Var.c).b);
        if (jl0VarU == null || jl0VarU.equals((jl0) wk4Var.d)) {
            return wk4Var;
        }
        wk4 wk4Var2 = new wk4(wk4Var.f, (xmd) wk4Var.c, jl0VarU, (pw0) wk4Var.b, wk4Var.g, (td4) wk4Var.e, 2);
        wk4VarArr[i] = wk4Var2;
        return wk4Var2;
    }
}
