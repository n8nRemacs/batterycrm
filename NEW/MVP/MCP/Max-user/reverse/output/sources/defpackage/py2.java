package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class py2 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final age b;
    public final w63 c;
    public final lad d;
    public final k18 e;
    public x9f f;
    public volatile of2 g;
    public volatile long h;
    public volatile long i;
    public volatile boolean j;
    public final Object k;
    public final x74 l;

    public py2(long j, s6b s6bVar, k18 k18Var, a84 a84Var, age ageVar, w63 w63Var, lad ladVar) {
        this.a = j;
        this.b = ageVar;
        this.c = w63Var;
        this.d = ladVar;
        this.e = k18Var;
        int i = s65.d;
        this.i = 0L;
        this.k = ipi.b(2, new hk1(15, this));
        this.l = ((z74) s6bVar.a).plus(a84Var);
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "py2", vb9.e(j, "init #"), null);
        }
    }

    public final pb2 a() {
        return (pb2) this.c.j(this.a).a.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    public final qqg b(long j, q44 q44Var) {
        qqg qqgVar = qqg.a;
        w63 w63Var = this.c;
        if (w63Var.i().Y(a()) && j == 0) {
            wqi.o("py2", null, "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", Arrays.copyOf(new Object[]{new Long(this.a)}, 1));
            return qqgVar;
        }
        int i = s65.d;
        long jI = v9j.i(System.nanoTime(), y65.NANOSECONDS);
        long jK = s65.k(jI, this.i);
        if (s65.d(jK, ((s65) this.k.getValue()).a) < 0) {
            wqi.o("py2", null, "requestForChatSubscribeIfNeed #%d: request diff = %s", Arrays.copyOf(new Object[]{new Long(this.a), new s65(jK)}, 2));
            return qqgVar;
        }
        if (!((Boolean) this.d.invoke()).booleanValue()) {
            wqi.q("py2", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!", new Object[0]);
            return qqgVar;
        }
        this.i = jI;
        hwa hwaVar = (hwa) this.e.getValue();
        hwa.q(hwaVar, new jy2(hwaVar.t().a.k(), j, true));
        w63 w63Var2 = this.c;
        w63Var2.i().i0(this.a, true);
        return qqgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r0 == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if (r0 == r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd A[PHI: r3
  0x00bd: PHI (r3v10 py2) = (r3v8 py2), (r3v11 py2) binds: [B:38:0x00ba, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.q44 r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py2.c(q44):java.lang.Object");
    }

    public final qqg d(q44 q44Var) {
        qqg qqgVar = qqg.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "py2", vb9.e(this.a, "unsubscribe() #"), null);
            }
        }
        int i = s65.d;
        this.i = 0L;
        pb2 pb2VarE = e(a());
        if (pb2VarE == null) {
            return qqgVar;
        }
        hwa hwaVar = (hwa) this.e.getValue();
        hwa.q(hwaVar, new jy2(hwaVar.t().a.k(), pb2VarE.b.a, false));
        w63 w63Var = this.c;
        w63Var.i().i0(this.a, false);
        return qqgVar;
    }

    public final pb2 e(pb2 pb2Var) {
        pb2 pb2VarA = a();
        long j = this.a;
        if (pb2VarA == null) {
            wqi.o("py2", null, "validate #%d: chat is null", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            return null;
        }
        rf2 rf2Var = pb2VarA.b;
        if (this.c.i().Y(a())) {
            return pb2VarA;
        }
        if (rf2Var.a == 0) {
            wqi.o("py2", null, "validate #%d: chatServerId == 0L", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            return null;
        }
        if (pb2VarA.F() || pb2VarA.V()) {
            wqi.c("py2", "validate #%d: chat is valid!", Long.valueOf(j));
            return pb2Var;
        }
        wqi.o("py2", null, "validate #%d: invalid chat status %s", Arrays.copyOf(new Object[]{Long.valueOf(j), rf2Var.c}, 2));
        return null;
    }
}
