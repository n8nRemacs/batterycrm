package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class oge extends hge {
    public final rs4 X;
    public final String Y = oge.class.getName();
    public final long b;
    public final List c;
    public final sj3 d;
    public final boolean o;

    public oge(long j, List list, sj3 sj3Var, boolean z, rs4 rs4Var) {
        this.b = j;
        this.c = list;
        this.d = sj3Var;
        this.o = z;
        this.X = rs4Var;
    }

    @Override // defpackage.hge
    public final void u() throws Throwable {
        String str;
        RuntimeException runtimeException;
        jm9 jm9Var = jm9.DELETED;
        pb2 pb2VarM = e().M(this.b);
        if (pb2VarM == null) {
            ige igeVar = this.a;
            ((y3b) ((yi5) (igeVar != null ? igeVar : null).m.getValue())).a(new IllegalStateException("chat is null"));
            return;
        }
        if (this.c == null) {
            qi9 qi9VarM = m();
            long j = this.b;
            lq9 lq9VarD = qi9VarM.a.c.d();
            lrd lrdVar = lq9VarD.a;
            lrdVar.b();
            hq9 hq9Var = lq9VarD.w;
            vk6 vk6VarA = hq9Var.a();
            vk6VarA.k(1, j);
            vk6VarA.k(2, 0L);
            vk6VarA.k(3, 0L);
            try {
                lrdVar.c();
                try {
                    vk6VarA.w();
                    lrdVar.q();
                    hq9Var.r(vk6VarA);
                    qi9 qi9VarM2 = m();
                    long j2 = this.b;
                    lq9 lq9VarD2 = qi9VarM2.a.c.d();
                    lrdVar = lq9VarD2.a;
                    lrdVar.b();
                    hq9 hq9Var2 = lq9VarD2.o;
                    vk6 vk6VarA2 = hq9Var2.a();
                    lq9VarD2.b().getClass();
                    vk6VarA2.k(1, 10);
                    vk6VarA2.k(2, j2);
                    vk6VarA2.k(3, 0L);
                    vk6VarA2.k(4, 0L);
                    try {
                        lrdVar.c();
                        try {
                            vk6VarA2.w();
                            lrdVar.q();
                            hq9Var2.r(vk6VarA2);
                            if (this.X == rs4.REGULAR) {
                                e().H(this.b);
                            }
                            hwa hwaVarA = a();
                            long j3 = this.b;
                            rs4 rs4Var = this.X;
                            if (hwaVarA.j(j3)) {
                                hwa.r(hwaVarA, new r4a(hwaVarA.t().a.k(), j3, 0L, 0L, rs4Var));
                            }
                            r().c(new q4a(this.b, 0L, 0L, this.X));
                            return;
                        } finally {
                        }
                    } catch (Throwable th) {
                        hq9Var2.r(vk6VarA2);
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                hq9Var.r(vk6VarA);
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            si9 si9VarM = m().m(((Number) it.next()).longValue());
            if (si9VarM != null) {
                if (si9VarM.b == 0) {
                    arrayList2.add(si9VarM);
                    k().getClass();
                } else {
                    arrayList.add(si9VarM);
                }
            }
        }
        long j4 = pb2VarM.b.a;
        long j5 = this.b;
        if (arrayList.isEmpty()) {
            str = ", messages.size() = ";
        } else {
            wqi.c(this.Y, "deleteServerMessages: chatId = " + j5 + ", messages.size() = " + arrayList.size(), new Object[0]);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    ArrayList arrayList4 = arrayList;
                    arrayList3.add(Long.valueOf(((si9) it2.next()).a));
                    arrayList = arrayList4;
                } finally {
                }
            }
            ArrayList arrayList5 = arrayList;
            m().a.c.d().p(j5, arrayList3, jm9Var);
            hwa hwaVarA2 = a();
            str = ", messages.size() = ";
            long j6 = this.b;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                try {
                    arrayList6.add(Long.valueOf(((si9) it3.next()).b));
                } finally {
                }
            }
            hwaVarA2.w(j6, j4, arrayList3, arrayList6, this.d, this.o, this.X);
            v(arrayList5);
        }
        if (!arrayList2.isEmpty()) {
            wqi.c(this.Y, "deleteLocalMessages: chatId = " + this.b + str + arrayList2.size(), new Object[0]);
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                si9 si9Var = (si9) it4.next();
                ige igeVar2 = this.a;
                if (igeVar2 == null) {
                    igeVar2 = null;
                }
                vm9 vm9Var = (vm9) igeVar2.y.getValue();
                long j7 = si9Var.a;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    vm9Var.getClass();
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "vm9", vb9.e(j7, "cancel: messageId="), null);
                    }
                }
                ((lv5) vm9Var.c.getValue()).a(j7, true);
            }
            qi9 qi9VarM3 = m();
            long j8 = this.b;
            ArrayList arrayList7 = new ArrayList(arrayList2.size());
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                try {
                    arrayList7.add(Long.valueOf(((si9) it5.next()).a));
                } finally {
                }
            }
            qi9VarM3.a.c.d().p(j8, arrayList7, jm9Var);
            v(arrayList2);
        }
        if (this.c.contains(Long.valueOf(pb2VarM.b.j))) {
            e().H(this.b);
        }
        if (this.c.contains(Long.valueOf(pb2VarM.b.x))) {
            e().G(this.b, null, 0L);
        }
        r().c(new q4a(this.b, this.c, null));
    }

    public final void v(ArrayList arrayList) {
        pb2 pb2VarM;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            si9 si9Var = (si9) it.next();
            if (si9Var != null && (pb2VarM = e().M(si9Var.Z)) != null) {
                ige igeVar = this.a;
                if (igeVar == null) {
                    igeVar = null;
                }
                dkb dkbVar = (dkb) igeVar.p.getValue();
                long j = pb2VarM.b.a;
                long j2 = si9Var.a;
                dkbVar.getClass();
                dkb.b(j, j2);
            }
        }
    }
}
