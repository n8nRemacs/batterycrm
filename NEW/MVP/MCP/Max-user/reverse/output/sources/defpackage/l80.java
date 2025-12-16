package defpackage;

/* loaded from: classes.dex */
public final class l80 implements pqa {
    public static final l80 a = new l80();
    public static final wu5 b = wu5.c("requestTimeMs");
    public static final wu5 c = wu5.c("requestUptimeMs");
    public static final wu5 d = wu5.c("clientInfo");
    public static final wu5 e = wu5.c("logSource");
    public static final wu5 f = wu5.c("logSourceName");
    public static final wu5 g = wu5.c("logEvent");
    public static final wu5 h = wu5.c("qosTier");

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        qqa qqaVar = (qqa) obj2;
        qa0 qa0Var = (qa0) ((ng8) obj);
        qqaVar.e(b, qa0Var.a);
        qqaVar.e(c, qa0Var.b);
        qqaVar.a(d, qa0Var.c);
        qqaVar.a(e, qa0Var.d);
        qqaVar.a(f, qa0Var.e);
        qqaVar.a(g, qa0Var.f);
        qqaVar.a(h, wqc.a);
    }
}
