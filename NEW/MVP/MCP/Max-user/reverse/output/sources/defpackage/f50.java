package defpackage;

/* loaded from: classes2.dex */
public final class f50 implements d4c {
    public static final /* synthetic */ yy7[] v0;
    public final k18 X;
    public final jve Y;
    public final gbd Z;
    public final lzf a;
    public final v40 b;
    public final l7a c;
    public final f84 d;
    public final String o = f50.class.getName();
    public final mcf s0;
    public final t9f t0;
    public final t9f u0;

    static {
        z8a z8aVar = new z8a(f50.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        v0 = new yy7[]{z8aVar};
    }

    public f50(lzf lzfVar, v40 v40Var, l7a l7aVar, f84 f84Var, k18 k18Var) {
        this.a = lzfVar;
        this.b = v40Var;
        this.c = l7aVar;
        this.d = f84Var;
        this.X = k18Var;
        jve jveVarB = kve.b(1, 0, 6);
        this.Y = jveVarB;
        this.Z = new gbd(jveVarB);
        this.s0 = ((b8a) l7aVar).R0;
        this.t0 = c7j.c();
        this.u0 = new t9f(4, this);
    }

    public static final void e(f50 f50Var) {
        f50Var.t0.O(f50Var, v0[0], svi.d(f50Var.d, ((q2b) f50Var.a).a(), i84.b, new e50(f50Var, null)));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public static final Object f(f50 f50Var, dtf dtfVar) throws Throwable {
        k09 k09Var;
        w19 w19Var;
        Integer num;
        w19 w19Var2;
        Integer num2;
        jve jveVar = f50Var.Y;
        b8a b8aVar = (b8a) f50Var.c;
        k7a k7aVarL = b8aVar.l();
        k09 k09Var2 = b8aVar.L0;
        g84 g84Var = g84.a;
        qqg qqgVar = qqg.a;
        if ((k09Var2 == null || (w19Var2 = k09Var2.d) == null || (num2 = w19Var2.H) == null || num2.intValue() != 2) && (((k09Var = b8aVar.L0) == null || (w19Var = k09Var.d) == null || (num = w19Var.H) == null || num.intValue() != 3) && b8aVar.F0 != 1)) {
            if (k7aVarL != null) {
                CharSequence charSequence = k7aVarL.a;
                CharSequence charSequence2 = k7aVarL.b;
                if (charSequence2.length() != 0 || ((charSequence != null && charSequence.length() != 0) || !k7aVarL.c.isEmpty())) {
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    r5g r5gVar = new r5g(charSequence);
                    r5g r5gVar2 = new r5g(charSequence2);
                    boolean z = b8aVar.H0;
                    float f = b8aVar.P0;
                    Object objA = jveVar.a(new o0a(r5gVar, r5gVar2, f >= 1.75f ? d3c.d : f >= 1.25f ? d3c.c : d3c.b, z, b8aVar.G0, 1), dtfVar);
                    if (objA == g84Var) {
                        return objA;
                    }
                }
            }
            wqi.q(f50Var.o, "Empty metadata when we try update player", new Object[0]);
            return qqgVar;
        }
        Object objA2 = jveVar.a(n0a.a, dtfVar);
        if (objA2 == g84Var) {
            return objA2;
        }
        return qqgVar;
    }

    @Override // defpackage.d4c
    public final void a() {
        b8a b8aVar = (b8a) this.c;
        boolean z = b8aVar.H0;
        v40 v40Var = this.b;
        if (z) {
            ((b8a) v40Var.a).o();
        } else if (b8aVar.G0) {
            ((b8a) v40Var.a).p();
        }
    }

    @Override // defpackage.d4c
    public final void b() {
        ((b8a) this.c).s();
        svi.e(this.d, ((q2b) this.a).a(), null, new c50(this, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.d4c
    public final ei4 c() {
        k7a k7aVarL = ((b8a) this.c).l();
        if (k7aVarL != null) {
            ?? r0 = k7aVarL.c;
            Object obj = r0.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l = obj instanceof Long ? (Long) obj : null;
            if (l != null) {
                long jLongValue = l.longValue();
                Object obj2 = r0.get("MediaMetadata.Extra.CHAT_ID");
                Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    k0c.c.getClass();
                    return k0c.L0(jLongValue2, jLongValue, true);
                }
            }
        }
        return null;
    }

    @Override // defpackage.d4c
    public final void d(d3c d3cVar) {
        int iOrdinal = d3cVar.ordinal() + 1;
        zg5 zg5Var = d3c.X;
        float f = ((d3c) zg5Var.get(iOrdinal % zg5Var.getSize())).a;
        b8a b8aVar = (b8a) this.c;
        svi.e(b8aVar.Z, null, null, new y7a(b8aVar, f, null), 3);
    }

    @Override // defpackage.d4c
    public final void pause() {
        ((b8a) this.b.a).o();
    }
}
