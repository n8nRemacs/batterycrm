package defpackage;

import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class t80 implements pqa {
    public static final t80 a = new t80();
    public static final wu5 b = new wu5("projectNumber", az1.p(az1.o(bpc.class, new ly(1))));
    public static final wu5 c = new wu5("messageId", az1.p(az1.o(bpc.class, new ly(2))));
    public static final wu5 d = new wu5("instanceId", az1.p(az1.o(bpc.class, new ly(3))));
    public static final wu5 e = new wu5("messageType", az1.p(az1.o(bpc.class, new ly(4))));
    public static final wu5 f = new wu5("sdkPlatform", az1.p(az1.o(bpc.class, new ly(5))));
    public static final wu5 g = new wu5("packageName", az1.p(az1.o(bpc.class, new ly(6))));
    public static final wu5 h = new wu5("collapseKey", az1.p(az1.o(bpc.class, new ly(7))));
    public static final wu5 i = new wu5(LogFactory.PRIORITY_KEY, az1.p(az1.o(bpc.class, new ly(8))));
    public static final wu5 j = new wu5("ttl", az1.p(az1.o(bpc.class, new ly(9))));
    public static final wu5 k = new wu5("topic", az1.p(az1.o(bpc.class, new ly(10))));
    public static final wu5 l = new wu5("bulkId", az1.p(az1.o(bpc.class, new ly(11))));
    public static final wu5 m = new wu5("event", az1.p(az1.o(bpc.class, new ly(12))));
    public static final wu5 n = new wu5("analyticsLabel", az1.p(az1.o(bpc.class, new ly(13))));
    public static final wu5 o = new wu5("campaignId", az1.p(az1.o(bpc.class, new ly(14))));
    public static final wu5 p = new wu5("composerLabel", az1.p(az1.o(bpc.class, new ly(15))));

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        oy9 oy9Var = (oy9) obj;
        qqa qqaVar = (qqa) obj2;
        qqaVar.e(b, oy9Var.a);
        qqaVar.a(c, oy9Var.b);
        qqaVar.a(d, oy9Var.c);
        qqaVar.a(e, oy9Var.d);
        qqaVar.a(f, ny9.ANDROID);
        qqaVar.a(g, oy9Var.e);
        qqaVar.a(h, oy9Var.f);
        qqaVar.d(i, 0);
        qqaVar.d(j, oy9Var.g);
        qqaVar.a(k, oy9Var.h);
        qqaVar.e(l, 0L);
        qqaVar.a(m, ly9.MESSAGE_DELIVERED);
        qqaVar.a(n, oy9Var.i);
        qqaVar.e(o, 0L);
        qqaVar.a(p, oy9Var.j);
    }
}
