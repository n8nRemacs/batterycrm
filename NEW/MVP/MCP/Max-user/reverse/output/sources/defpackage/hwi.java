package defpackage;

/* loaded from: classes.dex */
public final class hwi implements pqa {
    public static final hwi a = new hwi();
    public static final wu5 b = new wu5("maxMs", az1.p(a9h.h(emi.class, new mli(1))));
    public static final wu5 c = new wu5("minMs", az1.p(a9h.h(emi.class, new mli(2))));
    public static final wu5 d = new wu5("avgMs", az1.p(a9h.h(emi.class, new mli(3))));
    public static final wu5 e = new wu5("firstQuartileMs", az1.p(a9h.h(emi.class, new mli(4))));
    public static final wu5 f = new wu5("medianMs", az1.p(a9h.h(emi.class, new mli(5))));
    public static final wu5 g = new wu5("thirdQuartileMs", az1.p(a9h.h(emi.class, new mli(6))));

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        t5j t5jVar = (t5j) obj;
        qqa qqaVar = (qqa) obj2;
        qqaVar.a(b, t5jVar.a);
        qqaVar.a(c, t5jVar.b);
        qqaVar.a(d, t5jVar.c);
        qqaVar.a(e, t5jVar.d);
        qqaVar.a(f, t5jVar.e);
        qqaVar.a(g, t5jVar.f);
    }
}
