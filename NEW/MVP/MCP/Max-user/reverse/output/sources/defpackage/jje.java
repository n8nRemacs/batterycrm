package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jje {
    public static final jje a;
    public static final jje b;
    public static final jje c;
    public static final jje d;
    public static final /* synthetic */ jje[] o;

    static {
        jje jjeVar = new jje("UPDATE", 0);
        a = jjeVar;
        jje jjeVar2 = new jje("REMOVE", 1);
        b = jjeVar2;
        jje jjeVar3 = new jje("ACTIVATE", 2);
        c = jjeVar3;
        jje jjeVar4 = new jje("TIMEOUT", 3);
        d = jjeVar4;
        o = new jje[]{jjeVar, jjeVar2, jjeVar3, jjeVar4};
    }

    public static jje valueOf(String str) {
        return (jje) Enum.valueOf(jje.class, str);
    }

    public static jje[] values() {
        return (jje[]) o.clone();
    }
}
