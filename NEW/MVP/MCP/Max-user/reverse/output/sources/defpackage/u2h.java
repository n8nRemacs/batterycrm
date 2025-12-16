package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class u2h {
    public final u6b a;
    public final w2h b;
    public final qx5 c;
    public final dd d;
    public final o0e e;
    public final j0e f;
    public final n0e g;
    public final skh h = new skh();
    public final HashMap i = new HashMap();

    public u2h(u6b u6bVar, w2h w2hVar, qx5 qx5Var, dd ddVar, o0e o0eVar, j0e j0eVar, n0e n0eVar) {
        this.a = u6bVar;
        this.b = w2hVar;
        this.c = qx5Var;
        this.d = ddVar;
        this.e = o0eVar;
        this.f = j0eVar;
        this.g = n0eVar;
    }

    public final synchronized void a(l2h l2hVar) {
        this.i.remove(l2hVar);
        azi.b(new ik3(this.b.a(), 2, new q2h(l2hVar, 2)).i(), pdf.e, new q2h(l2hVar, 0), new gk0(13, l2hVar));
    }
}
