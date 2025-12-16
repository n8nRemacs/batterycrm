package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class she extends hge {
    public final k18 X;
    public final k18 Y;
    public final c6i Z;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;

    public she(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, c6i c6iVar) {
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        this.Y = k18Var6;
        this.Z = c6iVar;
    }

    public static void v(c6i c6iVar) {
        c6iVar.b(new she(c6iVar.a, c6iVar.d, c6iVar.b, c6iVar.e, c6iVar.f, c6iVar.g, c6iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hge
    public final void u() {
        ArrayList arrayListB;
        c3g c3gVar;
        c3g c3gVar2;
        k18 k18Var;
        k18 k18Var2;
        boolean z;
        int iC;
        boolean z2;
        c3g c3gVar3 = c3g.d;
        c3g c3gVar4 = c3g.b;
        k18 k18Var3 = this.d;
        k18 k18Var4 = this.b;
        try {
            if (!((ur3) this.o.getValue()).f()) {
                wqi.c("she", "Can't process transmit task because not connected to network", new Object[0]);
                return;
            }
            wqi.c("she", "Start process transmit task", new Object[0]);
            try {
                arrayListB = ((a3g) k18Var4.getValue()).l();
            } catch (Exception e) {
                int iK = ((a3g) k18Var4.getValue()).k();
                wqi.c("she", "process: selectWaitingAndFailedTaskCount count=%d", Integer.valueOf(iK));
                ((y3b) ((yi5) k18Var3.getValue())).a(new IllegalStateException("Exception during selectWaitingAndFailedTasks. Count=" + iK + "; Exception: " + e.getMessage(), e));
                arrayListB = ((ie4) ((a3g) k18Var4.getValue()).a.get()).f.b().b(500, ve3.j(c3gVar4, c3gVar3));
            }
            int size = arrayListB.size();
            wqi.c("she", "selected taskIds count = " + size, new Object[0]);
            if (size > 2000) {
                StringBuilder sb = new StringBuilder();
                Iterator it = ((a3g) k18Var4.getValue()).m().iterator();
                while (it.hasNext()) {
                    q2g q2gVar = (q2g) it.next();
                    sb.append("t=");
                    sb.append(q2gVar.a);
                    sb.append(", c=");
                    sb.append(q2gVar.b);
                    sb.append("; ");
                }
                String string = sb.toString();
                ((a3g) k18Var4.getValue()).f();
                ArrayList arrayListL = ((a3g) k18Var4.getValue()).l();
                ((y3b) ((yi5) k18Var3.getValue())).a(new IllegalStateException(String.format("Too much tasks, count=%d. Count by type: %s", Integer.valueOf(size), string)));
                arrayListB = arrayListL;
            }
            ArrayList arrayList = new ArrayList();
            n8a n8aVar = new n8a((Object) null);
            n8a n8aVar2 = new n8a((Object) null);
            Iterator it2 = arrayListB.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                boolean z4 = z3;
                r2g r2gVarJ = ((a3g) k18Var4.getValue()).j(((Long) it2.next()).longValue());
                if (r2gVarJ != null) {
                    wqi.c("she", "process task: %s", r2gVarJ.f.getClass().getName());
                    Object obj = r2gVarJ.f;
                    if (obj instanceof hge) {
                        ((hge) obj).a = (ige) this.X.getValue();
                    } else {
                        if (!(obj instanceof sm)) {
                            throw new IllegalStateException("unknown task! " + r2gVarJ.f.getClass());
                        }
                        ((sm) obj).c = (tm) this.Y.getValue();
                    }
                    if (r2gVarJ.b != c3gVar3 || r2gVarJ.c < r2gVarJ.f.h()) {
                        int i = r2gVarJ.e;
                        k18Var2 = k18Var3;
                        k18Var = k18Var4;
                        long j = r2gVarJ.d;
                        if (i == 0 || j == 0 || ((a3g) k18Var.getValue()).j(j) == null || r2gVarJ.e != 1) {
                            boolean z5 = r2gVarJ.f.getType() == usb.w0;
                            if (z5) {
                                rhe rheVar = (rhe) r2gVarJ.f;
                                z = z5;
                                long j2 = rheVar.c;
                                c3gVar = c3gVar3;
                                n8a n8aVar3 = rheVar.o == rs4.REGULAR ? n8aVar : n8aVar2;
                                if (n8aVar3.d(j2)) {
                                    wqi.c("she", "task <%s> already in list, delete it!", rheVar.X);
                                    arrayList.add(r2gVarJ);
                                } else {
                                    n8aVar3.a(j2);
                                }
                                if (z4) {
                                }
                            } else {
                                c3gVar = c3gVar3;
                                z = z5;
                            }
                            try {
                                iC = r2gVarJ.f.c();
                                c3gVar2 = c3gVar4;
                            } catch (Throwable th) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("failed to execute onPreExecute method for task ");
                                c3gVar2 = c3gVar4;
                                sb2.append(r2gVarJ.f.getId());
                                sb2.append(" type ");
                                sb2.append(r2gVarJ.f.getType());
                                String string2 = sb2.toString();
                                w(r2gVarJ.f);
                                ((y3b) ((yi5) k18Var2.getValue())).a(new IllegalStateException(string2, th));
                                iC = 3;
                            }
                            if (iC == 2) {
                                ((a3g) k18Var.getValue()).n(r2gVarJ.a, c3gVar2);
                                if (z) {
                                    k18Var3 = k18Var2;
                                    k18Var4 = k18Var;
                                    c3gVar4 = c3gVar2;
                                    c3gVar3 = c3gVar;
                                    z3 = true;
                                } else {
                                    wqi.c("she", "task " + r2gVarJ + " skip", new Object[0]);
                                }
                            } else if (iC == 3) {
                                wqi.c("she", "task " + r2gVarJ + " will be removed, reason: onPreExecute returned REMOVE", new Object[0]);
                                arrayList.add(r2gVarJ);
                            } else {
                                ((a3g) k18Var.getValue()).n(r2gVarJ.a, c3g.c);
                                if (z) {
                                    z4 = true;
                                }
                                if (r2gVarJ.c > 0) {
                                    wqi.c("she", "task " + r2gVarJ + " retry", new Object[0]);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Object obj2 = r2gVarJ.f;
                                if (obj2 instanceof sm) {
                                    sm smVar = (sm) obj2;
                                    ((u0g) ((o0g) this.c.getValue())).b(smVar, (j1g) smVar, z2);
                                } else {
                                    this.Z.b((hge) obj2);
                                }
                            }
                            k18Var3 = k18Var2;
                            k18Var4 = k18Var;
                            c3gVar4 = c3gVar2;
                            z3 = z4;
                            c3gVar3 = c3gVar;
                        } else {
                            c3gVar = c3gVar3;
                        }
                        c3gVar2 = c3gVar4;
                        k18Var3 = k18Var2;
                        k18Var4 = k18Var;
                        c3gVar4 = c3gVar2;
                        z3 = z4;
                        c3gVar3 = c3gVar;
                    } else {
                        arrayList.add(r2gVarJ);
                        wqi.c("she", "task " + r2gVarJ + " will be removed, reason: max fails count limit is reached", new Object[0]);
                    }
                }
                c3gVar = c3gVar3;
                c3gVar2 = c3gVar4;
                k18Var2 = k18Var3;
                k18Var = k18Var4;
                k18Var3 = k18Var2;
                k18Var4 = k18Var;
                c3gVar4 = c3gVar2;
                z3 = z4;
                c3gVar3 = c3gVar;
            }
            k18 k18Var5 = k18Var4;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                r2g r2gVar = (r2g) it3.next();
                tsb tsbVar = r2gVar.f;
                if (r2gVar.c >= tsbVar.h()) {
                    w(tsbVar);
                }
                ((a3g) k18Var5.getValue()).d(r2gVar.a);
                wqi.c("she", "task " + r2gVar + " deleted", new Object[0]);
            }
        } catch (Exception e2) {
            wqi.e("she", "process: failed", e2);
        }
    }

    public final void w(tsb tsbVar) {
        try {
            tsbVar.f();
        } catch (Throwable th) {
            ((y3b) ((yi5) this.d.getValue())).a(new IllegalStateException("failed to execute onMaxFailCount method for task " + tsbVar.getId() + " type " + tsbVar.getType(), th));
        }
    }
}
