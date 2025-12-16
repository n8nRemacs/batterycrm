package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qh2 {
    public final ve2 a;
    public final qi9 b;
    public final z7c c;
    public final c6i d;
    public final y7b e;
    public final tw0 f;
    public final a3g g;
    public final j0e h;

    public qh2(ve2 ve2Var, qi9 qi9Var, z7c z7cVar, c6i c6iVar, y7b y7bVar, tw0 tw0Var, a3g a3gVar, j0e j0eVar) {
        this.a = ve2Var;
        this.b = qi9Var;
        this.c = z7cVar;
        this.d = c6iVar;
        this.e = y7bVar;
        this.f = tw0Var;
        this.g = a3gVar;
        this.h = j0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, jyg] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    public final void a(long j, long j2, final long j3, final int i, final long j4, final int i2, final long j5, ih2 ih2Var, final rs4 rs4Var) {
        List<fh9> list;
        List arrayList;
        ?? r1;
        ?? r9;
        List listD;
        List listA;
        boolean z;
        ?? r12;
        Long lValueOf = Long.valueOf(j2);
        String strA = d8j.a(Long.valueOf(j3));
        Integer numValueOf = Integer.valueOf(i);
        Long lValueOf2 = Long.valueOf(j4);
        Integer numValueOf2 = Integer.valueOf(i2);
        Long lValueOf3 = Long.valueOf(j5);
        ?? r13 = ih2Var.c;
        wqi.c("qh2", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s", lValueOf, strA, numValueOf, lValueOf2, numValueOf2, lValueOf3, Integer.valueOf(r13.size()), rs4Var.name());
        final ve2 ve2Var = this.a;
        pb2 pb2VarM = ve2Var.M(j2);
        if (pb2VarM == null) {
            return;
        }
        long j6 = pb2VarM.a;
        rf2 rf2Var = pb2VarM.b;
        long j7 = rf2Var.f;
        long j8 = rf2Var.a;
        wqi.c("qh2", "onChatHistory, chat create time = %s", d8j.a(Long.valueOf(j7)));
        int iOrdinal = rs4Var.ordinal();
        z7c z7cVar = this.c;
        int i3 = 1;
        if (iOrdinal == 0) {
            list = r13;
            if (list.isEmpty()) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                arrayList = new ArrayList();
                for (fh9 fh9Var : list) {
                    List list2 = arrayList;
                    if (fh9Var.b >= rf2Var.f) {
                        r1 = list2;
                        r1.add(fh9Var);
                    } else {
                        r1 = list2;
                    }
                    arrayList = r1;
                }
            }
            if (arrayList.isEmpty()) {
                listD = Collections.EMPTY_LIST;
                r9 = 0;
            } else {
                r9 = 0;
                listD = jqi.d(arrayList, new oh2(r9, this.g.h(0L, usb.s0)));
            }
            listA = listD;
            z = r9;
            if (listA.size() > 0) {
                if (!listA.isEmpty()) {
                    this.b.g(j6, z7cVar.a.s(), listA);
                }
                the theVar = new the(j6);
                c6i c6iVar = this.d;
                c6iVar.b(theVar);
                c6iVar.b(new the(j6, rs4Var));
                if (pb2VarM.S(z7cVar.a, z7cVar.c)) {
                    wqi.c("qh2", "onChatHistory: %d is globally muted", Long.valueOf(j8));
                    z = r9;
                } else {
                    this.e.e(j8);
                    z = r9;
                }
            }
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("Unexpected value: " + rs4Var);
            }
            ?? jygVar = new jyg(b6a.w0, rs4.DELAYED);
            ph2 ph2Var = new ph2(this, j2, 0);
            if (r13.isEmpty()) {
                r12 = 0;
                listA = r13;
                list = listA;
            } else {
                r12 = 0;
                list = r13;
                listA = jygVar.a(r13, new dse(12, jygVar), new u7g(i3), null, ph2Var, null);
            }
            if (!listA.isEmpty()) {
                this.b.g(j6, z7cVar.a.s(), listA);
            }
            z = r12;
        }
        final long j9 = pb2VarM.a;
        boolean z2 = z;
        final List list3 = listA;
        ve2Var.r(j9, z2, new iu3() { // from class: he2
            @Override // defpackage.iu3
            public final void accept(Object obj) throws Throwable {
                si9 si9VarI;
                af2 af2Var = (af2) obj;
                ve2 ve2Var2 = ve2Var;
                kz4 kz4Var = ve2Var2.t;
                kf2 kf2Var = af2Var.n;
                rs4 rs4Var2 = rs4Var;
                ArrayList arrayListD = kf2Var.d(rs4Var2);
                List<fh9> list4 = list3;
                long j10 = j3;
                int i4 = i2;
                long j11 = j5;
                ArrayList arrayListC = p4j.c(arrayListD, list4, j10, i4, j11, i, j4);
                kf2Var.d(rs4Var2).clear();
                kf2.e(rs4Var2);
                kf2Var.d(rs4Var2).addAll(arrayListC);
                kf2.e(rs4Var2);
                if (rs4Var2 == rs4.DELAYED) {
                    return;
                }
                long j12 = j9;
                if (i4 > 0 && j11 == 0) {
                    Iterator it = list4.iterator();
                    int i5 = 0;
                    while (it.hasNext()) {
                        if (((fh9) it.next()).b <= j10) {
                            i5++;
                        }
                    }
                    if (i5 < 2) {
                        wqi.c("ve2", "onChatHistory, history response size is less than one page, delete message before and findAndUpdateFirstMessage", new Object[0]);
                        long j13 = j10 - 1;
                        if (list4.size() > 0) {
                            j13 = ((fh9) list4.get(0)).b - 1;
                        }
                        ((qi9) kz4Var.get()).d(j12, j13, rs4Var2);
                        ve2Var2.G(j12, af2Var, 0L);
                    }
                }
                for (fh9 fh9Var2 : list4) {
                    if (fh9Var2.d == ve2Var2.o.a.s()) {
                        long j14 = fh9Var2.c;
                        long j15 = fh9Var2.b;
                        if (j14 < j15) {
                            j14 = j15;
                        }
                        if (af2Var.Z < j14) {
                            af2Var.Z = j14;
                        }
                    }
                }
                pb2 pb2VarM2 = ve2Var2.M(j12);
                if (jqi.f(list4) || pb2VarM2 == null || !pb2VarM2.J() || (si9VarI = ((qi9) kz4Var.get()).i(j12, ((fh9) list4.get(list4.size() - 1)).a)) == null) {
                    return;
                }
                long j16 = si9VarI.c;
                af2Var.j = si9VarI.a;
                Map mapC = af2Var.c();
                qv3 qv3Var = (qv3) ve2Var2.s.get();
                mapC.put(Long.valueOf(qv3Var.i(qv3Var.g.a.s(), false).p()), Long.valueOf(j16));
                p4j.h(af2Var.n, j16, si9VarI.R0);
            }
        });
        int size = list3.size();
        tw0 tw0Var = this.f;
        if (size <= 0) {
            tw0Var.c(new jh2(j, pb2VarM.a, j3, j3, list.size(), rs4Var, hd5.a));
            return;
        }
        long j10 = pb2VarM.a;
        long j11 = ((fh9) list3.get(z2 ? 1 : 0)).b;
        long j12 = ((fh9) list3.get(list3.size() - 1)).b;
        int size2 = list3.size();
        ArrayList arrayList2 = new ArrayList(we3.q(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((fh9) it.next()).a));
        }
        tw0Var.c(new jh2(j, j10, j11, j12, size2, rs4Var, arrayList2));
    }
}
