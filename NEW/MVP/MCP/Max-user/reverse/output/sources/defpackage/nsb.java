package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class nsb {
    public static final nsb a;
    public static final nsb b;
    public static final /* synthetic */ nsb[] c;

    static {
        nsb nsbVar = new nsb("GRANTED", 0);
        a = nsbVar;
        nsb nsbVar2 = new nsb("DENIED", 1);
        b = nsbVar2;
        c = new nsb[]{nsbVar, nsbVar2};
    }

    public static nsb valueOf(String str) {
        return (nsb) Enum.valueOf(nsb.class, str);
    }

    public static nsb[] values() {
        return (nsb[]) c.clone();
    }
}
