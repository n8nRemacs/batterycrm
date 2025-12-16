package defpackage;

/* loaded from: classes2.dex */
public final class t9c {
    public final k18 a;
    public final k18 b;

    public t9c(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public final void a(long j, boolean z) {
        us usVarA = ori.a(new imb("paramValue", Integer.valueOf(z ? 1 : 0)), new imb("paramAdditionally", ori.a(new imb("webappId", String.valueOf(j)))));
        dd ddVar = (dd) this.a.getValue();
        k18 k18Var = this.b;
        ddVar.h(new hg8("SETTINGS", "MINIAPP_BIOMETRY", ((w4e) ((pb3) k18Var.getValue())).s(), ((pe8) ((pb3) k18Var.getValue())).K(), usVarA, 0L, 32));
    }
}
