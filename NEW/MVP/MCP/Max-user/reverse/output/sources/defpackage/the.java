package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class the extends hge {
    public final /* synthetic */ int b;
    public final long c;
    public final Object d;

    public the(long j) {
        this.b = 0;
        this.c = j;
        this.d = the.class.getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hge
    public final void u() throws Throwable {
        hd5<si9> hd5Var;
        int i = this.b;
        int i2 = 0;
        long j = 0;
        long j2 = this.c;
        switch (i) {
            case 0:
                String str = (String) this.d;
                pb2 pb2VarM = e().M(j2);
                if (pb2VarM != null) {
                    rf2 rf2Var = pb2VarM.b;
                    if (rf2Var.e.isEmpty()) {
                        eh9 eh9Var = pb2VarM.c;
                        if (eh9Var != null) {
                            j = eh9Var.a.c;
                        }
                    } else {
                        for (Map.Entry entry : rf2Var.e.entrySet()) {
                            long jLongValue = ((Number) entry.getKey()).longValue();
                            long jLongValue2 = ((Number) entry.getValue()).longValue();
                            if (jLongValue != n().a.s() && jLongValue2 > j) {
                                j = jLongValue2;
                            }
                        }
                    }
                    long j3 = j;
                    qi9 qi9VarM = m();
                    long j4 = this.c;
                    bsd bsdVar = qi9VarM.a.c;
                    long jS = qi9VarM.c.a.s();
                    lq9 lq9VarD = bsdVar.d();
                    List list = xi9.b;
                    jm9 jm9Var = jm9.DELETED;
                    lrd lrdVar = lq9VarD.a;
                    lrdVar.c();
                    try {
                        ArrayList arrayListO = lq9.o(lq9VarD, j4, jS, j3, jm9Var);
                        lrdVar.q();
                        lrdVar.k();
                        ArrayList arrayList = new ArrayList(we3.q(arrayListO, 10));
                        Iterator it = arrayListO.iterator();
                        while (it.hasNext()) {
                            arrayList.add(bsdVar.b((gj9) it.next()));
                        }
                        boolean zIsEmpty = arrayList.isEmpty();
                        hd5Var = arrayList;
                        if (!zIsEmpty) {
                            wqi.c(str, "updated messages for chat " + j2 + " count = " + arrayList.size(), new Object[0]);
                            hd5Var = arrayList;
                        }
                    } catch (Throwable th) {
                        lrdVar.k();
                        throw th;
                    }
                } else {
                    hd5Var = hd5.a;
                }
                wqi.c(str, "messages for chat " + j2 + " to update = " + hd5Var.size(), new Object[0]);
                if (hd5Var.isEmpty()) {
                    return;
                }
                pb2 pb2VarM2 = e().M(j2);
                for (si9 si9Var : hd5Var) {
                    ige igeVar = null;
                    if ((pb2VarM2 != null ? pb2VarM2.c : null) != null && pb2VarM2.c.a.a == si9Var.a) {
                        e().s0(j2, si9Var, false);
                    }
                    ige igeVar2 = this.a;
                    if (igeVar2 != null) {
                        igeVar = igeVar2;
                    }
                    ((tw0) igeVar.c.getValue()).c(new itg(si9Var.Z, si9Var.a, false));
                }
                wqi.c(str, "records updated " + hd5Var.size(), new Object[0]);
                return;
            default:
                if (j2 > 0) {
                    v(b().M(j2));
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (pb2 pb2Var : b().O(ve2.I)) {
                    if (jCurrentTimeMillis - pb2Var.b.k < 1209600000) {
                        if (v(pb2Var)) {
                            i2++;
                        }
                        if (i2 >= 10) {
                            return;
                        }
                    }
                }
                return;
        }
    }

    public boolean v(pb2 pb2Var) throws Throwable {
        long jP;
        Iterable<eh9> iterableB;
        Object obj = this.d;
        rs4 rs4Var = (rs4) obj;
        if (pb2Var != null) {
            rf2 rf2Var = pb2Var.b;
            if (rf2Var.n.c(rs4Var) != 0) {
                int iOrdinal = rs4Var.ordinal();
                if (iOrdinal == 0) {
                    b().getClass();
                    jP = pb2Var.p();
                    eh9 eh9Var = pb2Var.c;
                    if (eh9Var != null) {
                        long j = eh9Var.a.c;
                        if (jP > j) {
                            jP = j;
                        }
                    }
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected value: " + rs4Var);
                    }
                    jP = System.currentTimeMillis();
                }
                long j2 = jP;
                qi9 qi9VarL = l();
                ArrayList arrayListD = rf2Var.n.d(rs4Var);
                rs4 rs4Var2 = (rs4) obj;
                kz4 kz4Var = qi9VarL.f;
                wqi.c("qi9", "loadInitialToReadMark " + d8j.a(Long.valueOf(j2)) + "; chunks count = " + arrayListD.size(), new Object[0]);
                jf2 jf2Var = (jf2) p4j.e(j2, arrayListD).b;
                if (jf2Var == null) {
                    jf2 jf2VarF = p4j.f(j2, arrayListD);
                    iterableB = jf2VarF != null ? ((pj9) kz4Var.get()).b(qi9VarL.l(pb2Var.a, jf2VarF.a, jf2VarF.b, true, rs4Var2)) : null;
                } else {
                    ArrayList arrayListL = qi9VarL.l(pb2Var.a, jf2Var.a, j2, true, rs4Var2);
                    ArrayList arrayListL2 = qi9VarL.l(pb2Var.a, j2, jf2Var.b, false, rs4Var2);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListL.iterator();
                    while (it.hasNext()) {
                        si9 si9Var = (si9) it.next();
                        arrayList.add(si9Var);
                        hashSet.add(Long.valueOf(si9Var.a));
                    }
                    Iterator it2 = arrayListL2.iterator();
                    while (it2.hasNext()) {
                        si9 si9Var2 = (si9) it2.next();
                        if (!hashSet.contains(Long.valueOf(si9Var2.a))) {
                            arrayList.add(si9Var2);
                            hashSet.add(Long.valueOf(si9Var2.a));
                        }
                    }
                    wqi.c("qi9", "result record count = " + hashSet.size(), new Object[0]);
                    iterableB = ((pj9) kz4Var.get()).b(arrayList);
                }
                if (iterableB == null) {
                    iterableB = hd5.a;
                }
                for (eh9 eh9Var2 : iterableB) {
                    ige igeVar = this.a;
                    if (igeVar == null) {
                        igeVar = null;
                    }
                    c7c c7cVar = (c7c) igeVar.F.getValue();
                    si9 si9Var3 = eh9Var2.a;
                    ((d7c) c7cVar.c.computeIfAbsent(Long.valueOf(si9Var3.a), new ni(24, new uv1(c7cVar, si9Var3, pb2Var, 8)))).i(pb2Var);
                    boolean zT = si9Var3.t();
                    jdc jdcVar = si9Var3.x0;
                    if (zT) {
                        int iP = jdcVar.p();
                        for (int i = 0; i < iP; i++) {
                            ige igeVar2 = this.a;
                            if (igeVar2 == null) {
                                igeVar2 = null;
                            }
                            u6b u6bVar = (u6b) igeVar2.z.getValue();
                            jdcVar.o(i);
                            u6bVar.getClass();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public the(long j, rs4 rs4Var) {
        this.b = 1;
        this.c = j;
        this.d = rs4Var;
    }
}
