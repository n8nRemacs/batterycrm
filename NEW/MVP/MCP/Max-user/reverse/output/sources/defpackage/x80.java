package defpackage;

/* loaded from: classes.dex */
public final class x80 implements pqa {
    public static final x80 a = new x80();
    public static final wu5 b = new wu5("currentCacheSizeBytes", az1.p(az1.o(bpc.class, new ly(1))));
    public static final wu5 c = new wu5("maxCacheSizeBytes", az1.p(az1.o(bpc.class, new ly(2))));

    @Override // defpackage.ie5
    public final void a(Object obj, Object obj2) {
        xkf xkfVar = (xkf) obj;
        qqa qqaVar = (qqa) obj2;
        qqaVar.e(b, xkfVar.a);
        qqaVar.e(c, xkfVar.b);
    }
}
