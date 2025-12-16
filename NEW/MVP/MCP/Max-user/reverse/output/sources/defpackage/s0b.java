package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s0b {
    public static final s0b a;
    public static final s0b b;
    public static final s0b c;
    public static final /* synthetic */ s0b[] d;

    static {
        s0b s0bVar = new s0b("DEFAULT", 0);
        a = s0bVar;
        s0b s0bVar2 = new s0b("SMALL", 1);
        b = s0bVar2;
        s0b s0bVar3 = new s0b("BIG", 2);
        c = s0bVar3;
        d = new s0b[]{s0bVar, s0bVar2, s0bVar3};
    }

    public static s0b valueOf(String str) {
        return (s0b) Enum.valueOf(s0b.class, str);
    }

    public static s0b[] values() {
        return (s0b[]) d.clone();
    }
}
