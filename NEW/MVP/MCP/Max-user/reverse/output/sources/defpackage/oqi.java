package defpackage;

/* loaded from: classes.dex */
public final class oqi implements pqa {
    public static final oqi a = new oqi();
    public static final wu5 b = new wu5("logEventKey", az1.p(a9h.h(emi.class, new mli(1))));
    public static final wu5 c = new wu5("eventCount", az1.p(a9h.h(emi.class, new mli(2))));
    public static final wu5 d = new wu5("inferenceDurationStats", az1.p(a9h.h(emi.class, new mli(3))));

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        dni dniVar = (dni) obj;
        qqa qqaVar = (qqa) obj2;
        qqaVar.a(b, dniVar.a);
        qqaVar.a(c, dniVar.b);
        qqaVar.a(d, dniVar.c);
    }
}
