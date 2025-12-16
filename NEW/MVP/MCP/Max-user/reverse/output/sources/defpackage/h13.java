package defpackage;

/* loaded from: classes2.dex */
public final class h13 {
    public final String a;
    public final va4 b;
    public final tcf c;
    public final d53 d;

    public h13(String str, va4 va4Var, lzf lzfVar) {
        this.a = str;
        this.b = va4Var;
        tcf tcfVarA = ucf.a(null);
        this.c = tcfVarA;
        this.d = new d53(tcfVarA, 12);
        q2b q2bVar = (q2b) lzfVar;
        gw0.w(gw0.u(new g56(new x3(va4Var.v0, this, 23), new f13(this, null), 1), q2bVar.a()), d7j.a(q2bVar.a()));
    }

    public final f86 a() {
        String str = this.a;
        try {
            f86 f86Var = (f86) this.c.getValue();
            if (f86Var != null) {
                return f86Var;
            }
            Object value = this.b.h(str).getValue();
            if (value != null) {
                return (f86) value;
            }
            throw new IllegalArgumentException(("folder " + str + " not found").toString());
        } catch (Throwable th) {
            wqi.e(h13.class.getName(), "fail to get folderValue for id " + str, th);
            throw th;
        }
    }
}
