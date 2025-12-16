package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class jy9 extends xfh {
    public final sxg b;
    public final tcf c;
    public final hbd d;
    public final ci5 o;

    public jy9(sxg sxgVar) {
        this.b = sxgVar;
        tcf tcfVarA = ucf.a(hd5.a);
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        this.o = new ci5(0);
        t();
    }

    public final void t() {
        o98 o98VarD = ve3.d();
        o98VarD.add(new toe(BuildConfig.MAX_TIME_TO_UPLOAD, 0, new n5g(s7b.a), null, null, null, new doe(this.b.g.getBoolean("app.messages.send.by.enter", false), true), null, null, 440));
        o98VarD.add(new toe(9223372036854775806L, 0, new n5g(s7b.b), null, null, null, yne.a, null, null, 440));
        o98 o98VarA = ve3.a(o98VarD);
        this.c.setValue(o98VarA);
        String name = jy9.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, ho7.f(o98VarA.getSize(), "process sections. finish, size:"), null);
        }
    }
}
