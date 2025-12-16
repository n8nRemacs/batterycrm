package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class wyb extends xfh {
    public static final /* synthetic */ yy7[] Y;
    public final t9f X;
    public final yg2 b;
    public final hbd c;
    public final q24 d;
    public final tcf o;

    static {
        z8a z8aVar = new z8a(wyb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        Y = new yy7[]{z8aVar};
    }

    public wyb(ay3 ay3Var, k18 k18Var, k18 k18Var2, yg2 yg2Var) {
        this.b = yg2Var;
        this.c = gw0.C(new uxb(ay3Var.b(), this, 1), this.a, yve.a, hd5.a);
        q24 q24Var = new q24(this.a, ay3Var.b(), null, k18Var, k18Var2);
        this.d = q24Var;
        this.o = ucf.a(null);
        this.X = c7j.c();
        ay3Var.a();
        gw0.w(new g56(q24Var.i, new tyb(this, null), 1), this.a);
    }

    public static final List t(wyb wybVar, nx3 nx3Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        wyb wybVar2;
        int i;
        if (nx3Var.b()) {
            return hd5.a;
        }
        o98 o98VarD = ve3.d();
        List<xx3> list = nx3Var.a;
        int i2 = 3;
        if (list != null) {
            arrayList = new ArrayList(we3.q(list, 10));
            for (xx3 xx3Var : list) {
                if (xx3Var.C0) {
                    wybVar2 = wybVar;
                    i = 5;
                } else if (xx3Var.z0) {
                    i = 4;
                    wybVar2 = wybVar;
                } else {
                    wybVar2 = wybVar;
                    i = 2;
                }
                int iOrdinal = wybVar2.b.ordinal();
                boolean z = iOrdinal == 1 ? !xx3Var.B0 : !((iOrdinal == 2 || iOrdinal == i2) && xx3Var.A0);
                long j = xx3Var.a;
                CharSequence charSequence = xx3Var.b;
                CharSequence charSequence2 = xx3Var.o;
                arrayList.add(new fxb(j, j, charSequence, charSequence2 != null ? new r5g(charSequence2) : null, xx3Var.Y, false, xx3Var.s0, new yyb(1, i, j), xx3Var.t0, z));
                i2 = 3;
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            o98VarD.addAll(arrayList);
        }
        List<xx3> list2 = nx3Var.c;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(we3.q(list2, 10));
            for (xx3 xx3Var2 : list2) {
                long j2 = xx3Var2.a;
                CharSequence charSequence3 = xx3Var2.b;
                CharSequence charSequence4 = xx3Var2.o;
                arrayList3.add(new fxb(j2, j2, charSequence3, charSequence4 != null ? new r5g(charSequence4) : null, xx3Var2.Y, xx3Var2.s0, new yyb(5, 3, j2), xx3Var2.t0));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            o98VarD.addAll(arrayList2);
        }
        return ve3.a(o98VarD);
    }
}
