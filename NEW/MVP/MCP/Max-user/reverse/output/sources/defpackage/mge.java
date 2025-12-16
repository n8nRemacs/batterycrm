package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class mge extends ghe {
    public final /* synthetic */ int t0 = 0;
    public final Object u0;

    public mge(lge lgeVar) {
        super(lgeVar);
        this.u0 = (eh9) lgeVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [hd5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    @Override // defpackage.ghe
    public final ri9 v() {
        ?? arrayList;
        jdc jdcVarC;
        List list;
        switch (this.t0) {
            case 0:
                eh9 eh9Var = (eh9) this.u0;
                si9 si9Var = eh9Var.a;
                si9 si9Var2 = eh9Var.a;
                jdc jdcVar = si9Var.x0;
                if (jdcVar == null || (list = (List) jdcVar.b) == null) {
                    arrayList = hd5.a;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((w10) obj).g == null) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = new ArrayList(we3.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        x00 x00VarI = ((w10) it.next()).i();
                        x00VarI.l = UUID.randomUUID().toString();
                        arrayList.add(x00VarI.a());
                    }
                }
                ri9 ri9VarO = si9Var2.O();
                ri9VarO.b = 0L;
                ri9VarO.u = true;
                jdc jdcVar2 = si9Var2.x0;
                if (jdcVar2 != null) {
                    x10 x10VarD = jdcVar2.D();
                    x10VarD.c = null;
                    x10VarD.b = null;
                    x10VarD.a = arrayList;
                    jdcVarC = x10VarD.c();
                } else {
                    jdcVarC = null;
                }
                ri9VarO.n = jdcVarC;
                ri9VarO.o = 0;
                ri9VarO.p = 0L;
                ri9VarO.r = null;
                ri9VarO.s = null;
                ri9VarO.t = null;
                ri9VarO.H = 0;
                ri9VarO.x = 0L;
                ri9VarO.y = 0L;
                ri9VarO.q = null;
                ri9VarO.E = null;
                ri9VarO.G = 0L;
                return ri9VarO;
            default:
                x00 x00Var = new x00();
                x00Var.c = (d10) this.u0;
                x00Var.a = s10.b;
                w10 w10VarA = x00Var.a();
                x10 x10Var = new x10();
                x10Var.a = Collections.singletonList(w10VarA);
                jdc jdcVarC2 = x10Var.c();
                ri9 ri9Var = new ri9();
                ri9Var.n = jdcVarC2;
                return ri9Var;
        }
    }

    public mge(lge lgeVar, byte b) {
        super(lgeVar);
        this.u0 = (d10) lgeVar.h;
    }
}
