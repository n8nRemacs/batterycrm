package defpackage;

/* loaded from: classes2.dex */
public final class cef {
    public final tcf a;
    public final hbd b;
    public final k18 c;

    public cef() {
        tcf tcfVarA = ucf.a(bef.a);
        this.a = tcfVarA;
        this.b = new hbd(tcfVarA);
        this.c = tdf.a.getAccessor().d(156);
    }

    public final void a(String str, boolean z) {
        yx1 yx1Var = (yx1) this.c.getValue();
        long j = z ? 1L : 0L;
        yx1Var.getClass();
        yx1.d(yx1Var, "PIP_ENABLED", str, null, Long.valueOf(j), null, null, false, 244);
    }
}
