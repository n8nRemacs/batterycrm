package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class eka {
    public final tw0 a;
    public final kz4 b;
    public final kz4 c;
    public final kz4 d;

    public eka(tw0 tw0Var, kz4 kz4Var, kz4 kz4Var2, kz4 kz4Var3) {
        this.a = tw0Var;
        this.b = kz4Var;
        this.c = kz4Var2;
        this.d = kz4Var3;
    }

    public static void a(pb2 pb2Var, y7b y7bVar) {
        rf2 rf2Var = pb2Var.b;
        int i = rf2Var.m;
        long j = rf2Var.a;
        if (i > 0) {
            y7bVar.e(j);
        } else {
            y7bVar.a(j);
        }
    }

    public final void b(pb2 pb2Var, long[] jArr, rs4 rs4Var) throws Throwable {
        RuntimeException runtimeException;
        wqi.c("eka", "onNotifMsgDelete, %s", rs4Var.name());
        if (pb2Var == null) {
            return;
        }
        long j = pb2Var.a;
        boolean zA = rs4Var.a();
        tw0 tw0Var = this.a;
        kz4 kz4Var = this.c;
        if (zA) {
            ArrayList arrayListJ = ((qi9) kz4Var.get()).j(j, jArr);
            ArrayList arrayList = new ArrayList(arrayListJ.size());
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(Long.valueOf(((si9) it.next()).a));
                } finally {
                }
            }
            ((qi9) kz4Var.get()).a.c.d().p(j, arrayList, jm9.DELETED);
            tw0Var.c(new q4a(j, arrayList, rs4Var));
            return;
        }
        ArrayList arrayListJ2 = ((qi9) kz4Var.get()).j(j, jArr);
        ArrayList arrayList2 = new ArrayList(arrayListJ2.size());
        Iterator it2 = arrayListJ2.iterator();
        while (it2.hasNext()) {
            try {
                arrayList2.add(Long.valueOf(((si9) it2.next()).a));
            } finally {
            }
        }
        ((qi9) kz4Var.get()).c(j, arrayList2);
        if (rs4Var.c()) {
            ((ve2) this.b.get()).H(j);
        }
        tw0Var.c(new q4a(j, arrayList2, rs4Var));
        if (rs4Var.c()) {
            a(pb2Var, (y7b) this.d.get());
        }
    }
}
