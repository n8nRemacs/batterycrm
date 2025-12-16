package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jk {
    public static final jk a;
    public static final jk b;
    public static final jk c;
    public static final /* synthetic */ jk[] d;

    static {
        jk jkVar = new jk("EMPTY", 0);
        a = jkVar;
        jk jkVar2 = new jk("STATIC", 1);
        b = jkVar2;
        jk jkVar3 = new jk("RLOTTIE", 2);
        c = jkVar3;
        d = new jk[]{jkVar, jkVar2, jkVar3};
    }

    public static jk valueOf(String str) {
        return (jk) Enum.valueOf(jk.class, str);
    }

    public static jk[] values() {
        return (jk[]) d.clone();
    }
}
