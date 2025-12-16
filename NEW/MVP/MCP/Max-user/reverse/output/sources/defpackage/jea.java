package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jea {
    public static final jea a;
    public static final jea b;
    public static final jea c;
    public static final /* synthetic */ jea[] d;

    static {
        jea jeaVar = new jea("GOOD", 0);
        a = jeaVar;
        jea jeaVar2 = new jea("MEDIUM", 1);
        b = jeaVar2;
        jea jeaVar3 = new jea("BAD", 2);
        c = jeaVar3;
        d = new jea[]{jeaVar, jeaVar2, jeaVar3};
    }

    public static jea valueOf(String str) {
        return (jea) Enum.valueOf(jea.class, str);
    }

    public static jea[] values() {
        return (jea[]) d.clone();
    }
}
