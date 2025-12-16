package defpackage;

/* loaded from: classes2.dex */
public abstract class mr9 {
    public static final a1e a;

    static {
        esg esgVar = new esg("messages-list-scope");
        a1e a1eVar = iri.a;
        if (a1eVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!");
        }
        esgVar.c.add(a1eVar);
        esgVar.d(537, new bf8(7));
        esgVar.d(539, new yv6(14));
        esgVar.d(545, new yv6(15));
        esgVar.d(542, new yv6(16));
        esgVar.d(543, new yv6(17));
        esgVar.d(544, new yv6(18));
        a = esgVar.a();
    }
}
