package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pgd {
    public static final pgd a;
    public static final pgd b;
    public static final pgd c;
    public static final /* synthetic */ pgd[] d;

    static {
        pgd pgdVar = new pgd("NOTHING", 0);
        a = pgdVar;
        pgd pgdVar2 = new pgd("RECORD", 1);
        b = pgdVar2;
        pgd pgdVar3 = new pgd("STREAM", 2);
        c = pgdVar3;
        d = new pgd[]{pgdVar, pgdVar2, pgdVar3};
    }

    public static pgd valueOf(String str) {
        return (pgd) Enum.valueOf(pgd.class, str);
    }

    public static pgd[] values() {
        return (pgd[]) d.clone();
    }
}
