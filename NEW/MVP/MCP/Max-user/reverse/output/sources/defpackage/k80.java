package defpackage;

/* loaded from: classes.dex */
public final class k80 implements pqa {
    public static final k80 a = new k80();
    public static final wu5 b = wu5.c("eventTimeMs");
    public static final wu5 c = wu5.c("eventCode");
    public static final wu5 d = wu5.c("eventUptimeMs");
    public static final wu5 e = wu5.c("sourceExtension");
    public static final wu5 f = wu5.c("sourceExtensionJsonProto3");
    public static final wu5 g = wu5.c("timezoneOffsetSeconds");
    public static final wu5 h = wu5.c("networkConnectionInfo");

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        qqa qqaVar = (qqa) obj2;
        pa0 pa0Var = (pa0) ((ig8) obj);
        qqaVar.e(b, pa0Var.a);
        qqaVar.a(c, pa0Var.b);
        qqaVar.e(d, pa0Var.c);
        qqaVar.a(e, pa0Var.d);
        qqaVar.a(f, pa0Var.e);
        qqaVar.e(g, pa0Var.f);
        qqaVar.a(h, pa0Var.g);
    }
}
