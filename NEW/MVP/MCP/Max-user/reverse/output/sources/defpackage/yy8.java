package defpackage;

/* loaded from: classes2.dex */
public abstract class yy8 {
    public static final a1e a;

    static {
        esg esgVar = new esg("media-gallery-scope");
        a1e a1eVar = iri.a;
        if (a1eVar == null) {
            throw new IllegalArgumentException("Trying to access DI graph before initialization!");
        }
        esgVar.c.add(a1eVar);
        a = esgVar.a();
    }
}
