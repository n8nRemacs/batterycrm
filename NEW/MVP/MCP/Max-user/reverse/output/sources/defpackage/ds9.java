package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ds9 extends xfh {
    public final tcf X;
    public final hbd Y;
    public final ci5 Z;
    public final tcf b;
    public final hbd c;
    public final tcf d;
    public final hbd o;
    public final ci5 s0;

    public ds9() {
        tcf tcfVarA = ucf.a(Boolean.FALSE);
        this.b = tcfVarA;
        this.c = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.d = tcfVarA2;
        this.o = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(null);
        this.X = tcfVarA3;
        this.Y = new hbd(tcfVarA3);
        this.Z = new ci5(0);
        this.s0 = new ci5(0);
    }

    public final void t(imb imbVar) {
        tcf tcfVar;
        Object value;
        do {
            tcfVar = this.d;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, imbVar == null ? null : new x27(((Number) imbVar.a).longValue(), (List) imbVar.b)));
    }
}
