package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class uc5 extends xfh {
    public static final /* synthetic */ yy7[] u0;
    public final tcf X;
    public final hbd Y;
    public final t9f Z;
    public final vi b;
    public final t9f c;
    public final lzf d;
    public final k18 o;
    public final tcf s0;
    public final hbd t0;

    static {
        z8a z8aVar = new z8a(uc5.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        u0 = new yy7[]{z8aVar};
    }

    public uc5(k18 k18Var, vi viVar, t9f t9fVar, lzf lzfVar, kdd kddVar) {
        this.b = viVar;
        this.c = t9fVar;
        this.d = lzfVar;
        this.o = k18Var;
        tcf tcfVarA = ucf.a(new sc5(0, 0, 0, 7));
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        this.Z = c7j.c();
        hd5 hd5Var = hd5.a;
        tcf tcfVarA2 = ucf.a(new rc5(hd5Var, hd5Var));
        this.s0 = tcfVarA2;
        this.t0 = new hbd(tcfVarA2);
        wqi.c(uc5.class.getName(), "Load emoji. Start", new Object[0]);
        mwd mwdVar = new mwd(new oc5(this, null));
        su1 su1VarA = s8j.a(kddVar.b().a(ve3.j(hdd.EMOJI, hdd.ANIMOJI)));
        wj wjVar = (wj) k18Var.getValue();
        wjVar.getClass();
        gw0.w(gw0.u(new g56(gw0.i(mwdVar, su1VarA, new mwd(new oj(wjVar, null)), pc5.Z), new qc5(this, null), 1), ((q2b) lzfVar).b()), this.a);
    }

    public final ob5 t(List list, vh vhVar, int i, int i2) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((ob5) next).c, vhVar.b)) {
                break;
            }
        }
        ob5 ob5Var = (ob5) next;
        Drawable drawable = ob5Var != null ? ob5Var.o : null;
        long j = vhVar.a;
        String str = vhVar.c;
        String str2 = vhVar.e;
        int iD = kti.d(28 * vw4.d().getDisplayMetrics().density);
        vi viVar = this.b;
        viVar.getClass();
        Context context = viVar.b;
        Long lValueOf = Long.valueOf(j);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        ok okVar = new ok(context, iD, ucf.a(new cjg(lValueOf, str, str2)), drawable == null ? xi.a : new wi(drawable), viVar.a);
        okVar.setBounds(0, 0, iD, iD);
        return new ob5(i, ob5Var != null ? ob5Var.b : i2, vhVar.b, null, okVar, vhVar.a, 8);
    }

    public final void u(int i, p8 p8Var) {
        x9f x9fVarD = svi.d(this.a, ((q2b) this.d).b(), i84.b, new tc5(p8Var, i, this, null));
        this.Z.O(this, u0[0], x9fVarD);
    }
}
