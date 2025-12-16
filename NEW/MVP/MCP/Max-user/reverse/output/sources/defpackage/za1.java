package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class za1 extends xfh {
    public final tcf X;
    public final tcf Y;
    public final tcf Z;
    public final zw1 b;
    public final kj1 c;
    public final k18 d;
    public final tcf o;
    public final tcf s0;

    public za1(k18 k18Var, zw1 zw1Var, kj1 kj1Var) {
        this.b = zw1Var;
        this.c = kj1Var;
        this.d = k18Var;
        tcf tcfVarA = ucf.a(new xa1());
        this.o = tcfVarA;
        this.X = tcfVarA;
        tcf tcfVarA2 = ucf.a(new ww1(hd5.a, false));
        this.Y = tcfVarA2;
        this.Z = tcfVarA2;
        tcf tcfVarA3 = ucf.a(Boolean.FALSE);
        this.s0 = tcfVarA3;
        gw0.w(new g56(tcfVarA3, new wa1(this, null), 1), this.a);
    }

    public final void t(long j, o37 o37Var) {
        tcf tcfVar;
        Object value;
        xa1 xa1Var;
        LinkedHashMap linkedHashMap;
        do {
            tcfVar = this.o;
            value = tcfVar.getValue();
            xa1Var = (xa1) value;
            linkedHashMap = new LinkedHashMap(xa1Var.b);
            if (linkedHashMap.containsKey(Long.valueOf(j))) {
            }
        } while (!tcfVar.c(value, new xa1(xa1Var.a, linkedHashMap)));
    }
}
