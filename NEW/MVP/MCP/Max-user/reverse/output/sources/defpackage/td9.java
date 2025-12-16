package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class td9 extends xfh {
    public final ci5 X;
    public final tcf Y;
    public final hbd Z;
    public final em6 b;
    public final io4 c;
    public final cm6 d;
    public final ci5 o;
    public final tcf s0;
    public final hbd t0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [io4] */
    public td9(em6 em6Var, g9 g9Var, int i) {
        this(em6Var, (i & 2) != 0 ? (io4) ld9.a.getAccessor().c(478) : g9Var, new c38(23));
    }

    public final void t() {
        this.Y.setValue(null);
    }

    public final boolean u() {
        return this.Z.a.getValue() != null;
    }

    public final void v(List list) {
        xfh.r(this.X, new id9(list));
    }

    public final void w(long j, boolean z) {
        tcf tcfVar;
        Object value;
        Set setG0;
        if (!u()) {
            xfh.r(this.o, new od9(j));
            return;
        }
        if (z) {
            do {
                tcfVar = this.Y;
                value = tcfVar.getValue();
                Set set = (Set) value;
                setG0 = set != null ? ue3.g0(set) : new LinkedHashSet();
                if (setG0.contains(Long.valueOf(j))) {
                    setG0.remove(Long.valueOf(j));
                } else {
                    setG0.add(Long.valueOf(j));
                }
            } while (!tcfVar.c(value, setG0));
        }
    }

    public final void x(String str) {
        this.s0.setValue(str);
    }

    public td9(em6 em6Var, io4 io4Var, cm6 cm6Var) {
        this.b = em6Var;
        this.c = io4Var;
        this.d = cm6Var;
        this.o = new ci5(0);
        this.X = new ci5(0);
        tcf tcfVarA = ucf.a(null);
        this.Y = tcfVarA;
        this.Z = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.s0 = tcfVarA2;
        this.t0 = new hbd(tcfVarA2);
    }
}
