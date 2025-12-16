package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f04 extends dtf implements sm6 {
    public final /* synthetic */ j04 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f04(j04 j04Var, Continuation continuation) {
        super(2, continuation);
        this.X = j04Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f04 f04Var = (f04) l((sh3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f04Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f04 f04Var = new f04(this.X, continuation);
        f04Var.o = obj;
        return f04Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        hd5 hd5Var;
        hd5 hd5Var2;
        Object objA;
        hd5 hd5Var3;
        nh3 nh3Var;
        t98 bjcVar;
        hd5 hd5Var4 = hd5.a;
        g8j.b(obj);
        sh3 sh3Var = (sh3) this.o;
        if (sh3Var.equals(lh3.a) || sh3Var.equals(mh3.a)) {
            hd5Var = hd5Var4;
            hd5Var2 = hd5Var;
        } else {
            if (!(sh3Var instanceof nh3)) {
                throw new NoWhenBranchMatchedException();
            }
            nh3 nh3Var2 = (nh3) sh3Var;
            List list = nh3Var2.a;
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    ve3.p();
                    throw null;
                }
                rh3 rh3Var = (rh3) obj2;
                int i3 = rh3Var instanceof ph3 ? 1024 : 512;
                if (nh3Var2.a.size() != 1) {
                    i3 |= i == 0 ? 536870912 : i == ve3.i(nh3Var2.a) ? Integer.MIN_VALUE : 1073741824;
                }
                if (fni.a(rh3Var, oh3.a)) {
                    bjcVar = zic.a;
                } else if (fni.a(rh3Var, ph3.a)) {
                    bjcVar = new ajc(i3);
                } else {
                    if (!(rh3Var instanceof qh3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qh3 qh3Var = (qh3) rh3Var;
                    pb2 pb2Var = qh3Var.a;
                    long j = pb2Var.a;
                    CharSequence charSequence = qh3Var.b;
                    r5g r5gVar = new r5g(qh3Var.c);
                    String strI = pb2Var.i(il0.c, hl0.a);
                    pb2 pb2Var2 = qh3Var.a;
                    hd5Var3 = hd5Var4;
                    nh3Var = nh3Var2;
                    long j2 = pb2Var2.b.a;
                    pb2Var2.q0();
                    bjcVar = new bjc(new gdc(j, charSequence, r5gVar, strI, j2, pb2Var2.w0), i3);
                    arrayList.add(bjcVar);
                    nh3Var2 = nh3Var;
                    i = i2;
                    hd5Var4 = hd5Var3;
                }
                hd5Var3 = hd5Var4;
                nh3Var = nh3Var2;
                arrayList.add(bjcVar);
                nh3Var2 = nh3Var;
                i = i2;
                hd5Var4 = hd5Var3;
            }
            hd5Var = hd5Var4;
            hd5Var2 = arrayList;
        }
        tcf tcfVar = this.X.t;
        if (hd5Var2.isEmpty()) {
            objA = hd5Var;
        } else {
            ai3 ai3Var = this.X.o;
            ai3Var.getClass();
            o98 o98VarD = ve3.d();
            o98VarD.add((tic) ai3Var.a.getValue());
            o98VarD.addAll(hd5Var2);
            objA = ve3.a(o98VarD);
        }
        tcfVar.setValue(objA);
        return qqg.a;
    }
}
